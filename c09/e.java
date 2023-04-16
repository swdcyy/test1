package c09.e;
import a59.e;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import a59.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class e extends e	// class@0004b9
{
    public f b;

    public void e(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.b = p0;
    }
    public String a(){
       return "getShareBottom";
    }
    public Object c(JSONObject p0,a p1){
       Integer integer = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "data");
          integer = Integer.valueOf(60);
       }
       return integer;
    }
}
