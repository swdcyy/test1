package gz2.h$d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class h$d	// class@002bde
{
    public a$b a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final int[] f;

    public void h$d(){
       super();
       int[] ointArray = new int[2];
       this.f = ointArray;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, h$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StreamRectPayload{mStreamRectInfo="+this.a+", mXRatio="+this.b+", mXRatio="+this.c+", mStreamWidthRatio="+this.d+", mStreamHeightRatio="+this.e+", mLocation="+Arrays.toString(this.f)+'}';
    }
}
