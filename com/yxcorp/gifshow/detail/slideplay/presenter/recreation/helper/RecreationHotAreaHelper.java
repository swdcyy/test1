package com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.RecreationHotAreaHelper;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.entity.QPhoto;
import xx9.a;
import java.lang.Object;
import com.kuaishou.android.model.mix.RecreationSettingInfo;
import java.lang.String;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.widget.popup.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.a;
import w07.l;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.common.c$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.RecreationHotAreaHelper$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import android.content.Context;
import xh7.b;
import com.kuaishou.live.gzone.winter.a;
import qh7.b;
import qh7.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import java.lang.Boolean;

public class RecreationHotAreaHelper	// class@001862
{
    public final Activity a;
    public final ViewGroup b;
    public final QPhoto c;
    public final RecreationSettingInfo d;
    public boolean e;
    public View f;
    public VideoHotAreaMaskView g;
    public a h;
    public List i;
    public a j;

    public void RecreationHotAreaHelper(Activity p0,ViewGroup p1,View p2,QPhoto p3,a p4){
       super();
       this.a = p0;
       this.b = p1;
       this.f = p2;
       this.c = p3;
       this.d = p3.getRecreationSettingInfo();
       this.e = false;
       this.h = p4;
    }
    public a a(String p0,m p1,int p2,int p3,int p4,long p5){
       a obj;
       RecreationHotAreaHelper recreationHo = RecreationHotAreaHelper.class;
       if (PatchProxy.isSupport(recreationHo)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, recreationHo, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a(this.a);
       obj.K0(KwaiBubbleOption.e);
       obj.F0(p0);
       obj.b0(a.a);
       obj.n0(p2, p3);
       obj.w0(p4, BubbleInterface$Position.RIGHT);
       obj.T(p5);
       obj.P(1);
       obj.K(p1);
       obj.M(new RecreationHotAreaHelper$a(this));
       obj.A(1);
       return obj;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, RecreationHotAreaHelper.class, "5")) {
          return;
       }
       RecreationHotAreaHelper tj = this.j;
       if (tj != null) {
          tj.o();
       }
       return;
    }
    public final ClientContent$ContentPackage c(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, RecreationHotAreaHelper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.photoPackage = w1.f(this.c.getEntity());
       return obj;
    }
    public final ClientEvent$ElementPackage d(String p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, this, RecreationHotAreaHelper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("toast_title", p0);
       obj.params = oi3.e();
       obj.action2 = "CHECK_TOAST";
       return obj;
    }
    public View e(){
       return this.g;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecreationHotAreaHelper.class, "7")) {
          return;
       }
       if (p0.isEmpty()) {
          return;
       }
       a.b(b.j(this.a, p0), a.a);
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecreationHotAreaHelper.class, "10")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.elementPackage = this.d(p0);
       uClickEvent.contentPackage = this.c();
       b.a(0x4b316083).B(null, uClickEvent, this.a);
       return;
    }
    public void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecreationHotAreaHelper.class, "9")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.elementPackage = this.d(p0);
       showEvent.contentPackage = this.c();
       b.a(0x4b316083).W0(null, showEvent, this.a);
       return;
    }
    public void i(boolean p0){
       RecreationHotAreaHelper recreationHo = RecreationHotAreaHelper.class;
       if (PatchProxy.isSupport(recreationHo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, recreationHo, "13")) {
          return;
       }
       recreationHo = this.g;
       if (recreationHo == null) {
          return;
       }
       this.e = p0;
       recreationHo.setEnabled(p0);
       this.g.invalidate();
       return;
    }
}
