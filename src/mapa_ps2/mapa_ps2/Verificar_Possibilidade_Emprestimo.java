/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa_ps2;

/**
 *
 * @author eliel
 */
public class Verificar_Possibilidade_Emprestimo {
    
    Cliente cliente = new Cliente();
    float  score,renda;
    int idade;

    public Verificar_Possibilidade_Emprestimo(float score, float renda, int idade) {
        this.score = score;
        this.renda = renda;
        this.idade = idade;
    }
    
    public String verificar_emprestimo(){
        //O score vai de 0 até 1000, onde,
         if(score>0&& score<=1000 ){
            if(idade>0&&idade<150){
                if(renda>0){
                    if(score< 100 || (idade>0 && idade<18)){
                           return "Cliente não pode receber nenhum tipo de empréstimo!";
                    }else if(idade>=18&&idade<25){
                               if(score<=300){
                                   return "Cliente não pode receber nenhum tipo de empréstimo!";
                               }else{
                                  return calcular_emprestimo(this.renda, this.score);
                               }
                           }else{
                        return calcular_emprestimo(this.renda, this.score);

                    }
                }else{
                    return "Digite renda Valida!";
                }
            }else{
                return "Digite uma idade Valida!";
            }
         }else {
               return "Digite um Score valido!";
            }
    }

    private String  calcular_emprestimo(float renda, float score) {
        
            if(score>=100 && score<=500){
                return "Cliente pode receber empréstimos de até "+renda*6+",\n levando em consideração sua renda de "+renda+".";
                }else if(score>500){
                    
                        return "Cliente pode receber empréstimos de até "+renda*12+",\n levando em consideração sua renda de "+renda+".";
                }
                return "";
    
    }
        
 }
