package dxa.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class c	// class@0025a2
{
    public boolean a;
    public boolean b;
    public boolean c;
    public byte[] d;

    public void c(){
       super();
    }
    public boolean a(){
       return this.c;
    }
    public void b(boolean p0){
       this.c = p0;
    }
    public void c(boolean p0){
       this.a = p0;
    }
    public void d(boolean p0){
       this.b = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{microOn="+this.a+", speakerOn="+this.b+", cameraOn="+this.c+", }";
    }
}
