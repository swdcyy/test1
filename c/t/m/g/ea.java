package c.t.m.g.ea;
import java.io.File;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Closeable;
import c.t.m.g.el;

public class ea	// class@000c63
{

    public static void a(byte[] p0,File p1){
       ea.a(p0, p1, true);
    }
    public static void a(byte[] p0,File p1,boolean p2){
       BufferedOutputStream uBufferedOut;
       int i = 0;
       try{
          FileOutputStream uFileOutputS = new FileOutputStream(p1, p2);
          try{
             uBufferedOut = new BufferedOutputStream(uFileOutputS);
             uBufferedOut.write(p0);
             uBufferedOut.flush();
             el.a(uBufferedOut);
             return;
          }catch(java.io.IOException e3){
             i = uBufferedOut;
          }
          throw e3;
       }catch(java.io.IOException e3){
          goto label_001e ;
       }
    }
}
