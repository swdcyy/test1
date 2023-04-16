package io.github.lizhangqu.corepatch.applier.core.d;
import io.github.lizhangqu.corepatch.applier.core.a;
import java.io.File;
import java.util.zip.InflaterInputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.String;
import java.io.InputStream;
import mk.a;
import java.lang.Exception;

public final class d extends a	// class@00103a
{

    public void d(){
       super();
    }
    public void g(File p0,InflaterInputStream p1,OutputStream p2){
       RandomAccessFile randomAccess = new RandomAccessFile(p0, "r");
       try{
          a.a(randomAccess, p2, p1);
          randomAccess.close();
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public boolean isSupport(){
       return true;
    }
}
