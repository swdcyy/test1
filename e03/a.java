package e03.a;
import sz2.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import java.lang.Object;
import f03.a;
import com.kuaishou.livestream.message.nano.LiveEffectExtraResInfo;
import e03.b;
import sz2.d;
import sz2.a;
import iy2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.effect.resource.download.common.e;
import com.kwai.robust.PatchProxyResult;
import sz2.g;
import java.lang.StringBuilder;

public class a implements b	// class@0025f1
{
    public final b a;
    public final a b;
    public static final List c;

    static {
       a.c = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectResource");
    }
    public void a(String p0){
       super(p0, null);
    }
    public void a(String p0,LiveCommonEffectInfo p1){
       super();
       this.b = (p1 != null && p1.extraResInfo != null)? new a(p1.extraResInfo): null;
       this.a = new b(p0);
       return;
    }
    public d a(){
       return this.e();
    }
    public a b(){
       return this.b;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       e.b().ei(this, p0);
       return;
    }
    public String d(){
       a uoa = a.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b();
       a tb = this.b;
       if (tb != null) {
          objArray = tb.c();
       }
       String str = PatchProxy.applyTwoRefs(obj, objArray, this, uoa, "2");
       if (str != PatchProxyResult.class) {
       }else {
          str = g.c(obj, objArray);
       }
       return str;
    }
    public b e(){
       return this.a;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveEffect{mLiveMagicFaceResource = "+this.a+", mDependencyResource = "+this.b+'}';
    }
}
