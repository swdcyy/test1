package ii0.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class a	// class@0028f8
{
    public int a;
    public int b;
    public float bigJankRate;
    public String bundleId;
    public int c;
    public final String componentName;
    public int d;
    public ArrayList fps;
    public String fpsType;
    public float jankRate;
    public ArrayList jsfps;
    public float rangeFps;
    public float rangeJSFps;
    public float smallJankRate;
    public float stutterRate;
    public int systemRefreshRate;
    public int totalTime;

    public void a(String p0,String p1){
       a.p(p0, "bundleId");
       a.p(p1, "componentName");
       super();
       this.bundleId = p0;
       this.componentName = p1;
       this.fps = new ArrayList();
       this.jsfps = new ArrayList();
       this.fpsType = "";
    }
    public final float a(){
       return this.bigJankRate;
    }
    public final int b(){
       return this.a;
    }
    public final ArrayList c(){
       return this.fps;
    }
    public final int d(){
       return this.c;
    }
    public final ArrayList e(){
       return this.jsfps;
    }
    public final float f(){
       return this.smallJankRate;
    }
    public final int g(){
       return this.totalTime;
    }
    public final int h(){
       return this.b;
    }
    public final void i(float p0){
       this.bigJankRate = p0;
    }
    public final void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.fpsType = p0;
       return;
    }
    public final void k(float p0){
       this.smallJankRate = p0;
    }
}
