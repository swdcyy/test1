package n0c.c;
import java.lang.Object;
import brd.t;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public abstract class c	// class@003679
{
    public int a;
    public int b;
    public double c;
    public String d;
    public String e;

    public void c(){
       super();
    }
    public boolean a(){
       return false;
    }
    public abstract t b();
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PrettifyRecoRequest{, mEntry="+this.a+", mSourceType="+this.b+", mVisibleTime="+this.c+", mTaskId=\'"+this.d+'''+", mSceneResult=\'"+this.e+'''+'}';
    }
}
