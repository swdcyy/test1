package com.kuaishou.live.core.show.hourlytrank.f;
import k51.c;
import com.kuaishou.live.core.show.hourlytrank.f$a;
import ba2.w;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xp5.i;
import lp3.c;
import lp3.e;
import xp5.g;
import t02.a0;
import com.kuaishou.live.core.show.hourlytrank.f$b;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiteTextNotice;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import ba2.h;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import my1.e;
import iy1.l;
import iy1.k;
import androidx.lifecycle.MutableLiveData;
import iy1.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.r1;
import ka2.j$c;

public class f extends c	// class@000c10
{
    public a p;
    public m q;
    public a0 r;
    public r1 s;
    public j$c t;
    public e u;
    public i v;
    public g w;
    public h x;
    public final c y;
    public final g z;
    public static String sLivePresenterClassName = "LiveLiteTextTempNoticePresenter";

    public void f(){
       super();
       this.y = new f$a(this);
       this.z = new w(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.v = this.u.a(i.class);
       this.w = this.u.a(g.class);
       f tr = this.r;
       if (tr != null) {
          a0 y2 = tr.y2;
          if (y2 != null) {
             y2.P4(new f$b(this));
          label_0038 :
             return;
          }
       }
       this.R8();
       goto label_0038 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       this.V8();
       return;
    }
    public String P8(int p0){
       if (p0 == 1) {
          return "HOURLY_RANK";
       }
       if (p0 == 2) {
          return "QUARTER_HOURLY_RANK";
       }
       if (p0 != 6) {
          return "";
       }
       return "CITY_RANK";
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       this.q.u().u0(510, SCActionSignal.class, this.z);
       return;
    }
    public boolean S8(LiveCommonNoticeMessages$LiteTextNotice p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.endTimestamp - this.q.s() > 0 && !TextUtils.isEmpty(p0.textContent)))? true: false;
       return b;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       this.q.u().o(510, this.z);
       return;
    }
    public final void W8(LiveCommonNoticeMessages$LiteTextNotice p0){
       e obj;
       boolean b;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "1")) {
          return;
       }
       LiveCommonNoticeMessages$LiteTextNotice bizType = p0.bizType;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(bizType), this, uof, "2");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!this.x.d() && bizType == 2){
             b.Z(LiveLogTag.HOURLY_RANK, "disable head lite notice");
             b = false;
          }else {
             b = true;
          }
       }else {
          goto label_0028 ;
       }
       if (!b) {
          return;
       }else {
          obj = new e(k.g(p0.bizType));
          obj.b.setValue(p0.textContent);
          obj.c = p0.routeUrl;
          this.u.a(g.class).d2(obj);
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.s8(a0.class);
       this.s = this.s8(r1.class);
       this.t = this.q8(j$c.class);
       this.u = this.r8("LIVE_SERVICE_MANAGER");
       this.x = this.q8(h.class);
       return;
    }
}
