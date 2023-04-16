package com.kuaishou.live.core.show.banned.j;
import im8.g;
import k51.c;
import o32.q;
import o32.r;
import com.kuaishou.live.core.show.banned.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience;
import lf3.g;
import mq5.h;
import mq5.b;
import android.view.View;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.basic.model.StreamType;
import android.widget.ImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import o32.u;
import ekd.m1;
import android.view.ViewStub;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.banned.l;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.floatingwindow.e$h;

public class j extends c implements g	// class@0009f1
{
    public View p;
    public ImageView q;
    public View r;
    public String s;
    public ViewStub t;
    public a0 u;
    public e$h v;
    public j$a w;
    public h x;
    public final g y;
    public static String sLivePresenterClassName = "LiveWarningMaskAudiencePresenterV2";

    public void j(){
       super();
       this.w = new q(this);
       this.x = new r(this);
       this.y = new i(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.u.Z2.u().u0(758, LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience.class, this.y);
       this.u.D2.Km(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "6")) {
          return;
       }
       this.u.Z2.u().o(758, this.y);
       this.R8();
       this.u.D2.le(this.x);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       j tr = this.r;
       if (tr != null) {
          tr.setVisibility(8);
       }
       if (this.u.e.mStreamType != StreamType.LINE_LIVE.toInt() && (this.u.e.mStreamType == StreamType.GAME_LIVE.toInt() || this.u.e.mStreamType == StreamType.VIDEO.toInt())) {
          this.q.setVisibility(8);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, j.class, "7")) {
          return;
       }
       if (!TextUtils.x(this.s)) {
          u.c(this.s, 10, this.u.Z2.a());
       }
       this.s = "";
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.p = p0;
       this.q = m1.f(p0, 0x7f0a03b0);
       this.t = m1.f(p0, 0x7f0a1a6c);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, j.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(j.class, new l());
       }else {
          obj.put(j.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.u = this.q8(a0.class);
       this.v = this.r8("LIVE_AUDIENCE_FLOATING_WINDOW_SERVICE");
       return;
    }
}
