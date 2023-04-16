package c.t.m.g.bd;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;

public class bd	// class@000be1
{

    public static String a(byte[] p0,String p1){
       StringBuilder str = "";
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          int i1 = p0[i] & 0x00ff;
          String str1 = Integer.toHexString(i1);
          if (str1.length() != 2) {
             str1 = "0"+str1;
          }
          str = str+str1+p1;
       }
       return str;
    }
    public static byte[] a(int p0){
       byte[] uobyteArray = new byte[]{(byte)(p0 >> 24),(byte)(p0 >> 16),(byte)(p0 >> 8),(byte)p0};
       return uobyteArray;
    }
}
