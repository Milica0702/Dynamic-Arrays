
package implementacijadinamickihnizova;

public class ArrayList {
    
    //addElement
    //removeElement
    //printList
    //elementAtIndexOf 
    int k = 3;
    int [] niz = new int [k];
    int pokazivac = 0;
    
    //nije static moramo da imamo niz u koji cemo da stavimo
    public void addElement (int element){
       if (pokazivac == niz.length-1){
           int [] temp = new int [niz.length]; //k
           for (int i  = 0; i < niz.length ; i++){
               temp [i] =niz[i];
              
           }
           k=2*k;
           this.niz = new int [k];
           for (int i  = 0; i < temp.length ; i++){
               niz[i]=temp [i];
               
              
           }
       } 
       this.niz[pokazivac]= element ;
       pokazivac++;
       
        
    }
    
   
    
    public void printList (){
       
        if (pokazivac == 0 ){
            System.out.println("Niz je prazan");
        }else {
            for (int i = 0 ; i< pokazivac ; i++){
                System.out.println(niz[i]);
            }
        }
    
    }
    
    
    
}