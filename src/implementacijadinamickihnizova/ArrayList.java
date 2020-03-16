
package implementacijadinamickihnizova;

public class ArrayList {
    
    //addElement
    //removeElement
    //printList
    //elementAtIndexOf 
    
    int [] niz = new int [3];
    
    
    /*nije static moramo da imamo niz u koji cemo da stavimo
    public void addElement (int element){
       
        
    }
    */
    
    public void printList (){
       
        for (int i = 0 ; i< niz.length ; i++){
            System.out.println(niz[i]);
        }
    }
}