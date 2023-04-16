package io.github.lizhangqu.corepatch.applier.core.a;
import io.github.lizhangqu.corepatch.applier.core.b;
import java.io.File;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import io.github.lizhangqu.corepatch.applier.ApplierException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Exception;

public abstract class a extends b	// class@001037
{

    public void a(){
       super();
    }
    public final void a(File p0,File p1,File p2){
       this.e(p0, p1, p2);
       boolean b = true;
       try{
          Inflater inflater = new Inflater(b);
          this.c(p0, new InflaterInputStream(new FileInputStream(p1), inflater, 0x8000), new FileOutputStream(p2));
          inflater.end();
          return;
       }catch(java.io.FileNotFoundException e4){
          throw new ApplierException("file not exist", e4);
       }
    }
    public final void c(File p0,InputStream p1,OutputStream p2){
       Inflater inflater;
       this.f(p0, p1, p2);
       if (p1 instanceof InflaterInputStream) {
          inflater = null;
       }else {
          inflater = new Inflater(true);
          InflaterInputStream inflaterInpu = new InflaterInputStream(p1, inflater, 0x8000);
       }
       try{
          this.g(p0, p1, p2);
          p2.flush();
          if (inflater != null) {
             inflater.end();
          }
          try{
             p1.close();
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
          try{
             p2.close();
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
          return;
       }catch(java.lang.Exception e4){
          throw new ApplierException("apply failure", e4);
       }
    }
    public abstract void g(File p0,InflaterInputStream p1,OutputStream p2);
}
