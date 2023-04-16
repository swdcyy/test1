package ca7.g;
import java.lang.Runnable;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import ca7.d;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;

public final class g implements Runnable	// class@000519
{
    public final File b;
    public final String c;

    public void g(File p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       try{
          g tb = this.b;
          g tc = this.c;
          if (tb == null) {
          }else {
             Charset c = d.c;
             if (tc == null) {
                tc = null;
             }
             FilesKt__FileReadWriteKt.F(tb, tc, c);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
