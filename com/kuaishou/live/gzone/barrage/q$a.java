package com.kuaishou.live.gzone.barrage.q$a;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.barrage.LiveGzoneColorBarrageRight;
import java.lang.CharSequence;
import android.widget.TextView;
import y8c.d;
import com.yxcorp.utility.TextUtils;
import bld.b;
import android.graphics.Color;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import b53.t0;
import b53.s0;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import kg1.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import b53.u0;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.widget.ImageView;
import b53.r0;
import android.view.View$OnClickListener;

public class q$a extends c	// class@001c47
{
    public TextView p;
    public View q;
    public ImageView r;
    public d s;
    public t0 t;
    public LiveGzoneColorBarrageRight u;
    public a0 v;
    public static String sLivePresenterClassName = "LiveGzoneColorBarrageAdapter$LiveGzoneColorBarrageItemPresenter";

    public void q$a(){
       super();
    }
    public void E8(){
       LiveFansGroupIntimacyInfo mStatus;
       LiveGzoneColorBarrageRight mLevel;
       ClientContent$LiveStreamPackage liveStreamPa;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       if (PatchProxy.applyVoid(null, this, q$a.class, "3")) {
          return;
       }
       this.p.setText(this.u.mColorName);
       q$a tp = this.p;
       int i = 1;
       int b = (!this.s.get())? true: false;
       tp.setSelected(b);
       if (!TextUtils.x(this.u.mColorValue)) {
          try{
             b uob = new b();
             uob.v(Color.parseColor(this.u.mColorValue));
             uob.g(KwaiRadiusStyles.R8);
             this.p.setBackground(uob.a());
          }catch(java.lang.IllegalArgumentException e0){
             b.I(LiveLogTag.GZONE, "colorBarrage parse error:"+this.u.mColorValue, e0);
          }
       }
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, q$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.s.get()) {
          return b;
       }
       if (this.v.r1.Qi().mStatus != 1 || this.v.r1.w8() < this.u.mLevel) {
          b = true;
       }
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$a.class, "2")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a1ea8);
       this.q = p0.findViewById(0x7f0a1ea6);
       this.r = p0.findViewById(0x7f0a1ea7);
       this.p.setOnClickListener(new r0(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q$a.class, "1")) {
          return;
       }
       this.s = this.r8("ADAPTER_POSITION_GETTER");
       this.t = this.q8(t0.class);
       this.u = this.q8(LiveGzoneColorBarrageRight.class);
       this.v = this.q8(a0.class);
       return;
    }
}
