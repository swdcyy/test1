package p6.c;
import java.lang.Object;
import java.lang.String;
import com.alipay.sdk.m.q.b;
import java.lang.Integer;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.lang.Throwable;
import u6.c;

public final class c	// class@0028c3
{
    public boolean a;
    public String b;

    public void c(boolean p0){
       super();
       this.a = p0;
       this.b = b.c(24);
    }
    public static int a(String p0){
       return Integer.parseInt(p0);
    }
    public static byte[] b(byte[][] p0){
       ByteArrayOutputStream uByteArrayOu;
       DataOutputStream uDataOutputS;
       byte[] uobyteArray = null;
       if (!p0.length) {
          return uobyteArray;
       }
       try{
          try{
             uByteArrayOu = new ByteArrayOutputStream();
             try{
                uDataOutputS = new DataOutputStream(uByteArrayOu);
                int len = p0.length;
                for (int i = 0; i < len; i = i + 1) {
                   object oobject = p0[i];
                   Object[] objArray = new Object[]{Integer.valueOf(oobject.length)};
                   uDataOutputS.write((String.format(Locale.getDefault(), "%05d", objArray)).getBytes());
                   uDataOutputS.write(oobject);
                }
                uDataOutputS.flush();
                byte[] uobyteArray1 = uByteArrayOu.toByteArray();
                try{
                   uByteArrayOu.close();
                   uobyteArray = uobyteArray1;
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e11){
             }
          }catch(java.lang.Exception e11){
             uDataOutputS = uobyteArray;
          }
       }catch(java.lang.Exception e11){
          uByteArrayOu = uobyteArray;
          uDataOutputS = uByteArrayOu;
       }catch(java.lang.Exception e0){
       label_0062 :
          return uobyteArray;
       }
    }
}
