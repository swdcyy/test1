package a77.f$a;
import a77.k;
import a77.f;
import java.lang.Object;
import java.lang.String;
import a77.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;
import a77.a;
import com.kuaishou.android.live.log.LiveLogTag;
import com.google.common.collect.ImmutableMap;
import pp.c;
import pp.d;
import a77.g;
import com.kwai.library.widget.popup.common.PopupInterface$h;

public class f$a implements k	// class@000070
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "1")) {
          return;
       }
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, f.class, "7")) {
          ta.u.put(p0, p1);
       }
       return;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.z;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.A;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.P8();
    }
    public void e(c p0,int p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "7")) {
          return;
       }
       if (p0 instanceof a) {
          uoa = this.a;
          Objects.requireNonNull(uoa);
          f uof = f.class;
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), uoa, uof, "9")) {
             uof = uoa.H;
             if (uof != p0) {
                f g = uoa.G;
                String str = "requestShowPopupPriority";
                if (p1 <= g) {
                   if (uof != null) {
                      uoa.F.m(LiveLogTag.GZONE, "close lower priority popup", ImmutableMap.of("mCurrentShowingPopupPriority", Integer.valueOf(g), str, Integer.valueOf(p1)));
                      uoa.H.q(0);
                   }
                   p0.b0(new g(uoa, p0));
                   uoa.H = p0;
                   uoa.G = p1;
                   p0.Z();
                }else {
                   uoa.F.m(LiveLogTag.GZONE, "a higher priority is showing", ImmutableMap.of("mCurrentShowingPopupPriority", Integer.valueOf(g), str, Integer.valueOf(p1)));
                }
             }
          }
       }
       return;
    }
    public long f(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.B;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "2")) {
          return;
       }
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, f.class, "8") && ta.u.containsKey(p0)) {
          ta.u.remove(p0);
       }
       return;
    }
}
