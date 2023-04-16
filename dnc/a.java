package dnc.a;
import java.lang.String;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.io.IOException;

public class a	// class@002289
{

    public static long a(String p0){
       BufferedInputStream uBufferedInp;
       int i = 0;
       try{
          FileInputStream uFileInputSt = new FileInputStream(p0);
          try{
             uBufferedInp = new BufferedInputStream(uFileInputSt);
             CRC32 uCRC32 = new CRC32();
             byte[] uobyteArray = new byte[4096];
             int i1 = uBufferedInp.read(uobyteArray);
             while (i1 != -1) {
                uCRC32.update(uobyteArray, 0, i1);
             }
             long value = uCRC32.getValue();
             try{
                uBufferedInp.close();
             }catch(java.io.IOException e4){
                e4.printStackTrace();
             }
             return value;
          }catch(java.io.IOException e0){
             InputStream inputStream = uBufferedInp;
          }
          if (e0) {
             try{
                e0.close();
             }catch(java.io.IOException e4){
                e4.printStackTrace();
             }
          }
       }catch(java.io.IOException e0){
          goto label_003f ;
       }
    }
}
