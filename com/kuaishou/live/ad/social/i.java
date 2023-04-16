package com.kuaishou.live.ad.social.i;
import zl0.p1;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import android.app.Activity;
import zl0.q;
import java.lang.Object;
import androidx.fragment.app.DialogFragment;
import vq4.c;
import vq4.d;
import com.kwai.framework.model.feed.BaseFeed;
import zl0.a1;
import zl9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import zl0.r;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import nl9.b0;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail$ControlInfo;
import com.kuaishou.live.ad.social.h;
import java.lang.Runnable;
import com.kuaishou.live.ad.social.LiveAdLogParamAppender;
import cm0.f;
import zl0.s;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import erd.g;
import com.kuaishou.live.ad.social.NonAdLogHelper;
import zl0.t;
import zl0.v;

public class i implements p1	// class@000a13
{
    public final boolean b;
    public Runnable c;
    public final LiveStreamFeed d;
    public final Activity e;
    public final q f;

    public void i(boolean p0,LiveStreamFeed p1,Activity p2,q p3){
       super();
       this.b = p0;
       this.e = p2;
       this.d = p1;
       this.f = p3;
    }
    public void a(DialogFragment p0){
       this.c = null;
    }
    public void b(boolean p0){
    }
    public final void c(c p0){
       if (this.b != null) {
          p0 = p0.F;
          p0.J3 = 1;
          p0.p0 = 2;
       }else {
          p0.p0 = 1;
       }
       return;
    }
    public final c d(BaseFeed p0,a1 p1,int p2){
       if (PatchProxy.isSupport(i.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, i.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new r(this, p1, p2, p0);
    }
    public final PhotoAdvertisement$FanstopLiveInfo e(){
       Object[] objArray = null;
       PhotoAdvertisement obj = PatchProxy.apply(objArray, this, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = k.A(this.d);
       if (obj != null) {
          objArray = obj.mAdLiveForFansTop;
       }
       return objArray;
    }
    public String f(){
       PhotoAdvertisement$FanstopLiveInfo obj = PatchProxy.apply(null, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       if (obj != null) {
          return TextUtils.k(obj.mChargeInfo);
       }
       return "";
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(d.a(0x37593069).VL(this.d));
    }
    public String h(){
       PhotoAdvertisement$FanstopLiveInfo obj = PatchProxy.apply(null, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       if (obj != null) {
          return TextUtils.k(obj.mRequestApiExtData);
       }
       return "";
    }
    public final boolean i(a1 p0){
       p0 = p0.k;
       if (p0 == null) {
          return false;
       }
       LiveAdConversionTaskDetail mControlInfo = p0.mControlInfo;
       if (mControlInfo == null) {
          return false;
       }
       return mControlInfo.mIsLandscapeSupported;
    }
    public void j(a1 p0,LiveAdConversionTaskDetail p1,int p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, i.class, "2")) {
          return;
       }
       this.c = new h(this, p0, p1, p2);
       if (!this.f.H2() || this.i(p0)) {
          this.c.run();
       }else {
          i te = this.e;
          if (te != null) {
             te.setRequestedOrientation(1);
          }
       }
       return;
    }
    public void k(a1 p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "10")) {
          return;
       }
       NonAdLogHelper.a(550, f.a(p0), this.d, new s(this, p1));
       return;
    }
    public void l(a1 p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "11")) {
          return;
       }
       NonAdLogHelper.a(555, f.a(p0), this.d, new t(this, p1));
       return;
    }
    public void m(a1 p0,String p1,int p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, i.class, "3")) {
          return;
       }
       this.c = new v(this, p0, p1, p2);
       if (!this.f.H2() || this.i(p0)) {
          this.c.run();
       }else {
          i te = this.e;
          if (te != null) {
             te.setRequestedOrientation(1);
          }
       }
       return;
    }
}
