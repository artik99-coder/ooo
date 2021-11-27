import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        try{BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String s=reader.readLine();
            Converter converter=new Converter();
            String[]array=converter.separation(s);
            if(array.length!=3) throw new Exception();
            Calculator calculator=new Calculator();
            String result=calculator.operation(array);
            if(result.equals(null)) throw new Exception();
            System.out.println(result);}
        catch (Exception e){
            System.out.println("Ошибочка вышла");
        }


    }
}
