package com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.a;
import k51.c;
import yv1.o;
import yv1.n;
import yv1.p;
import yv1.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w51.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.e;
import p91.m;
import cs5.d;
import lp3.c;
import bw1.a;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveNewActivityPendant;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveNewActivityPendantClose;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.msghandler.b;
import android.app.Activity;
import oq5.b;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$SCActivityWidgetUpdated;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$SCActivityWidgetClose;
import com.kuaishou.live.basic.tk.LiveTkItemManager;
import androidx.fragment.app.KwaiDialogFragment;
import va1.m;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;

public class a extends c	// class@00170c
{
    public Context p;
    public m q;
    public d r;
    public b s;
    public a t;
    public b u;
    public final g v;
    public final g w;
    public final g x;
    public final g y;
    public static String sLivePresenterClassName = "LiveRightBottomRevenueWidgetMessagePresenter";

    public void a(){
       super();
       this.v = new o(this);
       this.w = new n(this);
       this.x = new p(this);
       this.y = new m(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (a.M()) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          Context context = this.getContext();
          this.p = context;
          if (context != null) {
             this.r = this.q.t5().a(d.class);
             if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
                this.t = new a(this.p, this.q, this.r);
                this.q.u().u0(803, LiveStreamMessages$SCLiveNewActivityPendant.class, this.v);
                this.q.u().u0(805, LiveStreamMessages$SCLiveNewActivityPendantClose.class, this.w);
                a tq = this.q;
                b uob = new b(this.p, this.getActivity(), tq, this.r, this.s);
                this.u = uoa;
                uoa = tq.u();
                uoa.u0(660, LiveActivityWidgetProto$SCActivityWidgetUpdated.class, this.x);
                this.q.u().u0(661, LiveActivityWidgetProto$SCActivityWidgetClose.class, this.y);
             }
          }
       }
       return;
    }
    public void J8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "10")) {
          return;
       }
       if (a.M()) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "11")) {
          this.q.u().o(803, this.v);
          this.q.u().o(805, this.w);
          uoa = this.t;
          if (uoa != null && !PatchProxy.applyVoid(objArray, uoa, a.class, "3")) {
             uoa.a.a();
          }
          this.q.u().o(660, this.x);
          this.q.u().o(661, this.y);
          uoa = this.u;
          if (uoa != null && !PatchProxy.applyVoid(objArray, uoa, b.class, "3")) {
             m.b(uoa.f);
             k1.n(uoa);
          }
       }
    label_0079 :
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.q.r5() != null && this.q.r5().getLivePlayConfig().isGamePatternType())? true: false;
       if (b) {
          return false;
       }else {
          return b.d(this);
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.s8(b.class);
       return;
    }
}
