//salvar como prog08.java
import javax.swing.*;

class prog08
{
    public static void soma() 
    {
        int s=0, vet[] = {1, 2, 3, 4, 5};
        
        for (int i = 0; i<vet.length; i++)
        {
            s = s + vet [i];
        }

        JOptionPane.showMessageDialog(null, "A somatória é " + s);
    }

    public static int produto() 
    {
        int p=1, vet[] = {1, 2, 3, 4, 5};
        
        for (int i=0; i<vet.length; i++)
        {
            p = p * vet [i];
        }

        return p;
    }

    public static void main(String[] args) 
    {
        int r;
        
        soma();
        r = produto();
        JOptionPane.showMessageDialog(null, "A produtória é " + r);
        System.exit(0);
    }
}
