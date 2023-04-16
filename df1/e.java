package df1.e;
import df1.c;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import df1.a;
import te1.d;

public class e extends c	// class@001f8d
{
    public a c;
    public final HighFrequencyActionGuide d;

    public void e(HighFrequencyActionGuide p0){
       super();
       this.d = p0;
    }
    public int b(){
       e obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       int i = (obj == null)? 0: obj.b();
       return (this.d.count + i);
    }
    public boolean c(){
       return true;
    }
    public String h(){
       return "highFrequency_multiLike_v2";
    }
    public long i(){
       return d.f;
    }
    public boolean k(){
       return false;
    }
    public String toString(){
       return "HighFluencyMultiLikeMessage{}";
    }
}
