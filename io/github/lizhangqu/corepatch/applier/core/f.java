package io.github.lizhangqu.corepatch.applier.core.f;
import io.github.lizhangqu.corepatch.applier.core.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import io.github.lizhangqu.corepatch.applier.ApplierException;
import java.lang.String;
import java.lang.Throwable;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.Exception;

public class f extends b	// class@00103c
{

    public void f(){
       super();
    }
    public void a(File p0,File p1,File p2){
       try{
          this.e(p0, p1, p2);
          this.c(p0, new FileInputStream(p1), new FileOutputStream(p2));
          return;
       }catch(java.io.FileNotFoundException e2){
          e2.printStackTrace();
          throw new ApplierException("file not exist", e2);
       }
    }
    public void c(File p0,InputStream p1,OutputStream p2){
       int i;
       ReadableByteChannel readableByte;
       this.f(p0, p1, p2);
       try{
          i = 0;
          readableByte = Channels.newChannel(p1);
          try{
             WritableByteChannel writableByte = Channels.newChannel(p2);
             ByteBuffer uByteBuffer = ByteBuffer.allocate(4096);
             while (readableByte.read(uByteBuffer) != -1) {
                uByteBuffer.flip();
                writableByte.write(uByteBuffer);
                uByteBuffer.clear();
             }
             p2.flush();
             if (writableByte != null) {
                try{
                   writableByte.close();
                }catch(java.lang.Exception e4){
                   e4.printStackTrace();
                }
             }
          }catch(java.lang.Exception e6){
          }
          e6.printStackTrace();
          if (i) {
             try{
                i.close();
             }catch(java.lang.Exception e4){
                e4.printStackTrace();
             }
          }
       }catch(java.lang.Exception e6){
          readableByte = i;
          goto label_003d ;
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
    label_0054 :
       return;
    }
    public boolean isSupport(){
       return true;
    }
}
