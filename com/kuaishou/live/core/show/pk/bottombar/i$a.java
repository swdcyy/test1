package com.kuaishou.live.core.show.pk.bottombar.i$a;
import id2.i;
import com.kuaishou.live.core.show.pk.bottombar.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sw1.d$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.models.Gift;
import sw1.d;
import sw1.a;
import java.lang.Integer;
import lm1.i;
import java.util.Objects;
import com.kuaishou.live.core.show.pk.bottombar.LivePkRecommendGiftSendButtonView;
import android.view.View;
import com.yxcorp.utility.n;

public class i$a implements i	// class@000d80
{
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final i h;

    public void i$a(i p0,String p1,int p2,int p3,int p4,boolean p5,boolean p6,String p7){
       this.h = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "3")) {
          return;
       }
       d$a uoa = new d$a();
       uoa.d(this.h.k);
       uoa.e(this.a);
       uoa.f(this.b);
       uoa.b(this.h.n.mId);
       uoa.g(1);
       uoa.h(i.H);
       uoa.i(1);
       uoa.c(this.g);
       a.f(uoa.a());
       return;
    }
    public void b(int p0){
       Object obj = this;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, uoa, "1")) {
          return;
       }
       uoa = obj.h;
       i oi = uoa.b(uoa.n, true, obj.a, obj.b);
       obj.h.c(oi, "PRE_SEND_GIFT", "CLIENT_BOTTOM_BAR_GIFT_GUIDE_CLICK", "[LivePkRecommendGiftSendProcessor][sendGiftToAnchor]combo send", 1);
       obj.h.c(oi, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LivePkRecommendGiftSendProcessor][sendGiftToAnchor]combo send", 1);
       i$a h = obj.h;
       h.e(oi, h.n, h.o, obj.c, obj.d, p0, obj.e, obj.f, obj.g);
       return;
    }
    public void c(int p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       d$a uoa1 = new d$a();
       uoa1.d(this.h.k);
       uoa1.e(this.a);
       uoa1.f(this.b);
       uoa1.b(this.h.n.mId);
       uoa1.g(1);
       uoa1.h(i.G);
       uoa1.i(p0);
       uoa1.c(this.g);
       a.f(uoa1.a());
       return;
    }
    public void d(int p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       i g = this.h.g;
       Objects.requireNonNull(g);
       if (!PatchProxy.applyVoid(null, g, LivePkRecommendGiftSendButtonView.class, "2")) {
          View[] viewArray = new View[]{g.D};
          n.Z(0, viewArray);
       }
       this.h.a();
       return;
    }
}
