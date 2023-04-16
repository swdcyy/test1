package c.t.m.g.fi;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import c.t.m.g.ex;
import java.lang.Throwable;
import java.io.FileOutputStream;

public class fi	// class@000c8f
{
    public String a;
    public File b;

    public void fi(String p0){
       super();
       this.a = "fi";
       this.b = null;
       this.b = new File(p0);
    }
    public String a(String p0){
       int i;
       FileInputStream uFileInputSt;
       Throwable throwable;
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       try{
          i = 0;
          if (!this.b.exists()) {
             throw i;
          }
          uFileInputSt = new FileInputStream(this.b.getAbsolutePath());
          try{
             throwable = 0x2800;
             byte[] uobyteArray = new byte[throwable];
             int i1 = uFileInputSt.read(uobyteArray);
             while (i1 != -1) {
                uByteArrayOu.write(uobyteArray, 0, i1);
             }
             uByteArrayOu.close();
             String str = new String(uByteArrayOu.toByteArray());
             try{
                uFileInputSt.close();
                uFileInputSt.close();
                try{
                   e0.close();
                   return str;
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e1){
          }
          if (ex.a) {
             ex.a(this.a, throwable);
          }
          try{
             uFileInputSt.close();
             try{
                e0.close();
                try{
                   uFileInputSt.close();
                   try{
                      e0.close();
                      return p0;
                   }catch(java.lang.Exception e0){
                   }
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e2){
          uFileInputSt = i;
          throwable = e2;
          goto label_004c ;
       }
    }
    public boolean a(byte[] p0,boolean p1){
       if (!this.b.exists()) {
          File uFile = new File(this.b.getParent());
          if (!uFile.exists()) {
             uFile.mkdirs();
             this.b.createNewFile();
          }
       }
       FileOutputStream uFileOutputS = new FileOutputStream(this.b, p1);
       uFileOutputS.write(p0);
       uFileOutputS.close();
       try{
          int i = 1;
          uFileOutputS.close();
          return i;
       }catch(java.lang.Exception e0){
       }
    }
}
