
public class cdllClient {
public static void main(String[] args) throws Exception {
    cdll cdL=new cdll();
    cdL.insertAtLastorBeforeHead(10);
    cdL.insertAtLastorBeforeHead(20);
    cdL.insertAtLastorBeforeHead(30);
    cdL.display();
    System.out.println();
    // cdL.reversedisplay();
    System.out.println(cdL.getAt(2));
    
    
}
}