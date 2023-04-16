package com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.LifecycleOwner;
import bj1.b;
import g03.a;
import bj1.a;
import bj1.d;
import bj1.c;
import vq5.d;
import mq5.b;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$a;
import java.util.HashSet;
import dj1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$routerHandler$1;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$routerHandler$2;
import msd.p;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$c;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$b;
import mq5.h;
import cj1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.viewcontroller.ViewController;
import fj1.e;
import aj1.a;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import cj1.a;
import android.view.Window;
import com.yxcorp.utility.n;
import android.app.Activity;
import java.util.Objects;
import fj1.d;
import android.widget.EditText;

public final class LiveDiyGiftManager extends LifecycleManager	// class@00123b
{
    public final c c;
    public final HashSet d;
    public final a e;
    public final LivePreviewEffectManager f;
    public final h g;
    public e h;
    public final LiveDiyGiftManager$b i;
    public final b j;
    public final a k;
    public final a l;
    public final d m;
    public final c n;
    public final d o;
    public final b p;
    public final a q;
    public final a r;

    public void LiveDiyGiftManager(LifecycleOwner p0,b p1,a p2,a p3,d p4,c p5,d p6,b p7,a p8,a p9){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "effectDelegate");
       a.p(p2, "resourceProvider");
       a.p(p3, "dialogDelegate");
       a.p(p4, "rechargeDelegate");
       a.p(p5, "sendGiftDelegate");
       a.p(p6, "routerManager");
       a.p(p7, "liveEndManager");
       a.p(p8, "closeGiftBox");
       a.p(p9, "turnPortraitIfNecessary");
       super(p0);
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       this.o = p6;
       this.p = p7;
       this.q = p8;
       this.r = p9;
       this.c = LiveDiyGiftManager$a.b;
       this.d = new HashSet();
       this.e = new a(new LiveDiyGiftManager$routerHandler$1(this), new LiveDiyGiftManager$routerHandler$2(this));
       this.f = new LivePreviewEffectManager(p0, p1, p2);
       LiveDiyGiftManager$c uoc = new LiveDiyGiftManager$c(this);
       this.g = uoc;
       this.i = new LiveDiyGiftManager$b(this);
       p7.Km(uoc);
    }
    public final d b(){
       return this.m;
    }
    public final void c(b p0,int p1){
       LiveDiyGiftManager liveDiyGiftM = LiveDiyGiftManager.class;
       if (PatchProxy.isSupport(liveDiyGiftM) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveDiyGiftM, "9")) {
          return;
       }
       a.p(p0, "diyInputInfo");
       b.d0(this.c, "[showDiyInputDialog]", "source", Integer.valueOf(p1), "LiveDiyInputInfo", p0.toString());
       liveDiyGiftM = this.h;
       if (liveDiyGiftM != null) {
          this.l.b(liveDiyGiftM);
       }
       this.h = new e(p0, this.l, this.i);
       this.i.b(p1);
       LiveDiyGiftManager th = this.h;
       a.m(th);
       this.l.c(th);
       this.i.d(p0, p1);
       return;
    }
    public final void d(LiveCommonEffectInfo p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveDiyGiftManager.class, "6")) {
          return;
       }
       a.p(p0, "commonEffectInfo");
       b.Z(this.c, "[startPreview]");
       this.f.c(p0, p1);
       return;
    }
    public final void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDiyGiftManager.class, "7")) {
          return;
       }
       a.p(p0, "source");
       b.c0(this.c, "[stopPreview]", "source", p0);
       this.f.d();
       return;
    }
    public final void f(int p0){
       LiveDiyGiftManager liveDiyGiftM = LiveDiyGiftManager.class;
       if (PatchProxy.isSupport(liveDiyGiftM) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveDiyGiftM, "10")) {
          return;
       }
       b.c0(this.c, "[tryHideDiyInputDialog]", "source", Integer.valueOf(p0));
       liveDiyGiftM = this.h;
       if (liveDiyGiftM != null) {
          if (!PatchProxy.applyVoid(null, liveDiyGiftM, e.class, "7")) {
             e n = liveDiyGiftM.n;
             if (n != null) {
                n.F(n);
             }else {
                n = liveDiyGiftM.l;
                if (n == null) {
                   a.S("dataBinding");
                }
                Activity uActivity = liveDiyGiftM.B2();
                Objects.requireNonNull(n);
                if (!PatchProxy.applyVoidOneRefs(uActivity, n, d.class, "4")) {
                   n.c.clearFocus();
                   n.C(uActivity);
                }
             }
          }
          this.l.b(liveDiyGiftM);
          this.i.a(null, p0);
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDiyGiftManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       this.e("LiveDiyGiftManager-onDestroy");
       this.f(4);
       this.p.le(this.g);
       return;
    }
}
