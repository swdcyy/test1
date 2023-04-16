package n6.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;

public class b	// class@0026c6
{

    public static byte[] a(byte[] p0){
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p0);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uByteArrayOu);
       byte[] uobyteArray = new byte[4096];
       int i = uByteArrayIn.read(uobyteArray);
       while (i != -1) {
          gZIPOutputSt.write(uobyteArray, 0, i);
       }
       gZIPOutputSt.flush();
       gZIPOutputSt.finish();
       uobyteArray = uByteArrayOu.toByteArray();
       try{
          uByteArrayIn.close();
          try{
             uByteArrayOu.close();
             try{
                gZIPOutputSt.close();
                return e0;
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static byte[] b(byte[] p0){
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p0);
       GZIPInputStream gZIPInputStr = new GZIPInputStream(uByteArrayIn);
       byte[] uobyteArray = new byte[4096];
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       int i = 0;
       int i1 = gZIPInputStr.read(uobyteArray, i, 4096);
       while (i1 != -1) {
          uByteArrayOu.write(uobyteArray, i, i1);
       }
       uByteArrayOu.flush();
       byte[] uobyteArray1 = uByteArrayOu.toByteArray();
       try{
          uByteArrayOu.close();
          try{
             gZIPInputStr.close();
             try{
                uByteArrayIn.close();
                return e0;
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
}
