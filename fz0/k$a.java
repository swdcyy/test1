package fz0.k$a;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService;
import fz0.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import z61.b;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b;
import ok1.c;
import x61.c;
import lp3.c;
import lp3.e;

public class k$a implements LiveAudienceGiftBottomBarEntryService	// class@0023e6
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$a.class, "1")) {
          return;
       }
       k$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, k.class, "2")) {
          k s = ta.S;
          if (s != null) {
             s.mIsVisible = Boolean.FALSE;
             ta.T.setValue(s);
          }
       }
       return;
    }
    public LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem b(){
       k$a obj = PatchProxy.apply(null, this, k$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       k s = obj.S;
       if (s == null) {
          return LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem.g0;
       }
       return new LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$b(obj.T, s);
    }
    public void c(boolean p0){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       k s = this.a.S;
       if (s != null) {
          s.setEnabled(p0);
          s = this.a.S;
          float f = (p0)? 0x3f800000: 0x3f000000;
          s.b(f);
          k$a ta = this.a;
          ta.T.setValue(ta.S);
       }
       return;
    }
    public boolean d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       k$a obj = PatchProxy.apply(objArray, this, k$a.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, k.class, "1");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.M.a(c.class).E1(1003);
       return b;
    }
}
