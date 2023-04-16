package aj9.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class d	// class@0000de
{
    public int a;
    public float b;
    public String c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public int k;

    public void d(){
       super();
    }
    public void a(){
       this.a = -1;
       this.b = 0x3f800000;
       this.c = null;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RecordSegment{index="+this.a+", speedRate="+this.b+", videoFile=\'"+this.c+'''+", videoFrames="+this.d+", duration="+this.e+", avgBitrate="+this.f+", avgFps="+this.g+", maxFps="+this.h+", minFps="+this.i+", mCountDownNumber"+this.j+", mRotation="+this.k+'}';
    }
}
