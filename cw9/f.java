package cw9.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class f	// class@001e29
{
    public final boolean a;
    public final boolean b;
    public final float c;

    public void f(boolean p0,boolean p1,float p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean a(){
       boolean b = (this.b == null && this.c > 0)? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FontScaleDensityParams{enableExperimentFontScale="+this.a+", enableFollowSystemFontScale="+this.b+", settingsFontScale="+this.c+'}';
    }
}
