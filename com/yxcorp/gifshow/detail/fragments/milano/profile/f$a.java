package com.yxcorp.gifshow.detail.fragments.milano.profile.f$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.detail.fragments.milano.profile.f;
import android.view.View;
import android.content.Context;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView;
import android.text.TextPaint;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.entity.DynamicEffectMarker;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.log.d0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import yp.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;

public class f$a extends RecyclerView$ViewHolder	// class@00154a
{
    public KwaiImageView a;
    public TextView b;
    public View c;
    public ImageView d;
    public View e;
    public View f;
    public SelfAdaptiveImageView g;
    public Activity h;
    public QPhoto i;
    public boolean j;
    public final f k;

    public void f$a(f p0,View p1){
       this.k = p0;
       super(p1);
       if (p1.getContext() instanceof Activity) {
          this.h = p1.getContext();
       }
       this.c = p1.findViewById(0x7f0a3a29);
       this.b = p1.findViewById(0x7f0a3967);
       this.d = p1.findViewById(0x7f0a3a28);
       this.a = p1.findViewById(0x7f0a3a22);
       this.e = p1.findViewById(0x7f0a3a24);
       if (NasaSlidePlayExperimentUtil.e()) {
          this.b.setBackgroundResource(R.drawable.arg_RES_7f082101);
          this.e.setBackgroundResource(R.drawable.arg_RES_7f082101);
       }
       this.f = p1.findViewById(0x7f0a3a25);
       this.g = p1.findViewById(0x7f0a3a26);
       f$a tb = this.b;
       if (tb != null) {
          tb.getPaint().setFakeBoldText(true);
       }
       return;
    }
    public String a(){
       LiveStreamFeed obj = PatchProxy.apply(null, this, f$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.i.isLiveStream()) {
          return null;
       }
       obj = this.i.getEntity().mDynamicEffectMarker;
       if (obj != null) {
          return obj.mLiveType;
       }
       return null;
    }
    public String b(boolean p0){
       LiveStreamFeed obj;
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = null;
       if (!this.i.isLiveStream()) {
          return str;
       }else {
          obj = this.i.getEntity().mDynamicEffectMarker;
          if (p0 || (obj == null || (!TextUtils.x(obj.mIcon) && obj.mIsBlocked == null))) {
             str = String.valueOf(obj.mStyle);
          }
       label_0044 :
          return str;
       }
    }
    public void c(String p0,String p1){
       f$a uoa = f$a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "4")) {
          return;
       }
       if (this.i.isShowed()) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "5")) {
          this.i.setShowed(true);
          c0.q().n(d0.h(this.i.mEntity, 4));
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SHOW_PHOTO";
       i3 oi3 = i3.f();
       if (!TextUtils.x(p0)) {
          oi3.d("live_type", p0);
          oi3.d("lv_params", x.g(this.i.mEntity));
       }
       if (!TextUtils.x(p1)) {
          oi3.d("live_room_type", p1);
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = x.e(this.i.mEntity, 2);
       uContentPack.photoPackage = w1.f(this.i.mEntity);
       u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(this.i.getFeedLogCtx()));
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "7")) {
          return;
       }
       this.f.setBackgroundResource(R.drawable.arg_RES_7f08204f);
       this.f.setVisibility(0);
       this.e.setVisibility(0);
       this.c(this.b(true), this.a());
       return;
    }
}
