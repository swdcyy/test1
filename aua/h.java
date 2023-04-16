package aua.h;
import aua.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import java.lang.Boolean;
import fi5.s;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.System;
import im8.f;
import android.widget.TextView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import vw5.d;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import kp.r1;
import com.yxcorp.utility.TextUtils;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import java.lang.StringBuilder;
import android.content.res.Resources;
import com.kuaishou.android.live.model.LiveStreamModel;
import ekd.t0;
import java.lang.Long;
import aua.g;
import android.view.View$OnClickListener;
import ekd.m1;

public class h extends e	// class@00030f
{
    public LiveStreamModel G;
    public View H;
    public f I;
    public ViewStubInflater2 J;
    public BaseFeed K;
    public d L;

    public void h(){
       super(1);
    }
    public void a9(){
       boolean b;
       e tv;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "11")) {
          h tJ = this.J;
          if (tJ != null) {
             this.H = tJ.b(0x7f0a02d6);
          }
          tJ = this.H;
          if (tJ != null) {
             tJ.setVisibility(8);
          }
       }
       Object[] obj = PatchProxy.apply(objArray, this, oh, "5");
       int i = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(s.a.h(this.K) && (this.q.getCreated() + 0xa4cb800) - System.currentTimeMillis() > 0){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          if (!PatchProxy.applyVoid(objArray, this, oh, "6")) {
             tv = this.v;
             if (tv == null || (!tv.get().booleanValue() && this.q != null)) {
                this.x.setVisibility(0);
                this.x.setText(DateUtils.w(this.getContext(), this.q.getCreated()));
             }
          }
       }else {
          obj = PatchProxy.apply(objArray, this, oh, "9");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(this.L != null){
             b = d.a(0x574d23bb).W5(this.L.getType());
          }else {
             b = false;
          }
          if (b) {
             obj = PatchProxy.apply(objArray, this, oh, "8");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else {
                tv = this.q;
                b1 = (tv == null || TextUtils.x(r1.G1(tv)))? true: false;
             }
             if (!b1) {
                if (!PatchProxy.applyVoid(objArray, this, oh, "10")) {
                   int i1 = 4;
                   if (this.K.get("AD") != null && this.q.isEmptyDistance()) {
                      this.x.setVisibility(i1);
                   }else {
                      tv = this.s;
                      if (tv != null && tv.mContentType == 6) {
                         this.b9(0);
                      }else {
                         this.b9(R.drawable.arg_RES_7f080a0b);
                      }
                      tv = this.s;
                      AggregateTemplateMeta mShowLocatio = (tv != null)? tv.mShowLocation: r1.G1(this.q);
                      if (!TextUtils.x(mShowLocatio)) {
                         this.x.setVisibility(0);
                         this.x.setText(mShowLocatio);
                         obj = new Object[i];
                         obj[0] = this.x.getText();
                         this.W8(this.P8()+this.x.getResources().getString(R.string.arg_RES_7f101dc4, obj));
                      }else {
                         this.x.setVisibility(i1);
                      }
                   }
                }
                this.S8();
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, oh, "7")) {
             if (this.G != null) {
                if (!PatchProxy.applyVoid(objArray, this, oh, "12")) {
                   this.x.setVisibility(0);
                   h tG = this.G;
                   if (tG == null || TextUtils.x(tG.mAudienceCount)) {
                      this.x.setText("");
                   }else if(!t0.a(this.G.mAudienceCount) || (t0.a(this.G.mAudienceCount) && Long.parseLong(this.G.mAudienceCount) > 0)){
                      this.x.setText(this.G.mAudienceCount);
                   }
                   this.b9(R.drawable.arg_RES_7f080a16);
                }
             }else {
                this.Y8();
             }
          }
       }
    label_01db :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       super.doBindView(p0);
       m1.a(p0, new g(this), R.id.subject);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       super.j8();
       this.G = this.s8(LiveStreamModel.class);
       this.I = this.w8("FEED_SHOW_DEFAULT_DISTANCE");
       this.J = this.t8("AUDIENCE_COUNT_VIEW_STUB_INFLATER");
       this.K = this.r8("feed");
       this.L = this.t8("local_current_city");
       return;
    }
}
