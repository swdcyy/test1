package mgd.b;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mgd.h;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;

public final class b implements g	// class@001d16
{
    public final BaseFragment b;
    public final PublishSubject c;
    public final PublishSubject d;
    public final PublishSubject e;

    public void b(BaseFragment p0,PublishSubject p1,PublishSubject p2,PublishSubject p3,int p4,u p5){
       PublishSubject publishSubje;
       p2 = null;
       String str = "PublishSubject.create\(\)";
       if (p4 & 0x02) {
          p1 = PublishSubject.g();
          a.o(p1, str);
       }else {
          p1 = p2;
       }
       if (p4 & 0x04) {
          publishSubje = PublishSubject.g();
          a.o(publishSubje, str);
       }else {
          publishSubje = p2;
       }
       if (p4 & 0x08) {
          p2 = PublishSubject.g();
          a.o(p2, str);
       }
       a.p(p0, "fragment");
       a.p(p1, "followSystemSubject");
       a.p(publishSubje, "fontScaleSubject");
       a.p(p2, "fontScaleSelectSubject");
       super();
       this.b = p0;
       this.c = p1;
       this.d = publishSubje;
       this.e = p2;
       return;
    }
    public final PublishSubject a(){
       return this.c;
    }
    public final PublishSubject b(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && a.g(this.e, p0.e)))))) {
          return true;
       }
       return false;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new h());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       b tc = this.c;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.d;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.e;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FontScaleSettingsCallerContext\(fragment="+this.b+", followSystemSubject="+this.c+", fontScaleSubject="+this.d+", fontScaleSelectSubject="+this.e+"\)";
    }
}
