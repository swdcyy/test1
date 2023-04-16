package bm1.b;
import java.lang.Object;
import java.util.BitSet;
import bm1.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import wj1.d;
import com.kwai.robust.PatchProxyResult;
import bm1.c;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.SCLiveGiftTitleChangeInfo;
import qk.m;
import bm1.a;
import ok.o;
import com.kuaishou.livestream.message.nano.LiveGiftTitleInfo;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;

public class b	// class@0003c7
{
    public m a;
    public GiftAnimContainerView b;
    public DrawingGiftDisplayView c;
    public ListView d;
    public n e;
    public final BitSet f;
    public boolean g;
    public final boolean h;
    public d i;
    public final GiftAnimContainerView$o j;

    public void b(){
       super();
       this.f = new BitSet();
       this.g = false;
       this.h = true;
       this.j = new b$a(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.j();
       }
       return;
    }
    public final d b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.apply(null, this, uob, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.i == null) {
          c uoc = PatchProxy.apply(null, this, uob, "21");
          if (uoc != patchProxyRe) {
          }else {
             uoc = new c(this);
          }
          this.i = uoc;
       }
       return this.i;
    }
    public void c(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "10")) {
          return;
       }
       this.b.setDisableGiftSlotAnimation(p0);
       return;
    }
    public void d(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "7")) {
          return;
       }
       this.b.setIsVoiceParty(p0);
       return;
    }
    public void e(SCLiveGiftTitleChangeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       if (p0 != null) {
          SCLiveGiftTitleChangeInfo info = p0.info;
          if (info != null) {
             p0.info = m.t(info).p(new a(this)).w(LiveGiftTitleInfo.class);
             b tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p0, tb, GiftAnimContainerView.class, "48")) {
                tb.b = p0;
                GiftAnimContainerView i = tb.i;
                if (i != null) {
                   i.t(p0);
                }
                GiftAnimContainerView j = tb.j;
                if (j != null) {
                   j.t(p0);
                }
             }
          }
       }
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "16")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          SCLiveGiftTitleChangeInfo sCLiveGiftTi = a.a.h(p0, SCLiveGiftTitleChangeInfo.class);
          if (sCLiveGiftTi != null) {
             this.e(sCLiveGiftTi);
          }
       }
       return;
    }
}
