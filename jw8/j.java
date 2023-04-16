package jw8.j;
import java.util.concurrent.Callable;
import java.io.File;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import java.lang.Object;

public final class j implements Callable	// class@0029c1
{
    public final File b;
    public final EncodeRequest$a c;

    public void j(File p0,EncodeRequest$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       j tb = this.b;
       j tc = this.c;
       if (!tb.exists()) {
          tb.mkdirs();
       }
       return tc;
    }
}
