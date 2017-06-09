package Review.ten;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Text1 {
    public static void main(String[] args){
        try {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            String output = in.nextLine();
            FileInputStream fis = new FileInputStream(input);
            FileOutputStream fos = new FileOutputStream(output);
            byte[] b = new byte[512];
            int len = 0;
            while ((len = fis.read(b)) !=-1){
                fos.write(b,0,len);
            }
            fis.close();
            fos.close();
        }
        catch (IOException e){
            throw new RuntimeException("复制失败");
        }
    }
}
