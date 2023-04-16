package com.kuaishou.commercial.log.n;
import java.lang.Object;
import mxb.j0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import dda.b;
import m66.a;
import yx.m;
import erd.g;
import ujc.k;
import tjc.b;
import mxb.i0;
import mxb.j;
import java.lang.ref.WeakReference;
import android.view.View;
import com.kuaishou.android.model.ads.SplashInfo;
import tw.l;
import java.lang.CharSequence;
import android.text.TextUtils;
import yx.a0;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import kp.r1;
import gy.a;
import wca.r;
import java.lang.Integer;
import com.kuaishou.commercial.loggersdk.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import yx.l;
import cda.c;
import dda.e;
import yx.j;
import dda.g;
import hy.e;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.util.Objects;
import dda.i;
import yx.o;
import java.util.List;
import java.util.Arrays;
import yx.p;
import yx.q;
import dda.d;
import tw.e;
import yx.j0;
import tkd.b;
import tkd.d;
import lm9.a;
import mxb.f0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo;
import com.kuaishou.commercial.log.j;
import yx.e;
import yx.i0;
import da6.c;
import vq4.d;
import yx.k;
import com.kuaishou.android.model.feed.AdAggregateTemplateFeed;
import dda.f;
import java.lang.StringBuilder;
import com.kuaishou.commercial.log.AdLogPhotoImpressionUtils;
import dda.j;
import com.kuaishou.commercial.log.k;
import wca.s;

public final class n	// class@001502
{

    public void n(){
       super();
    }
    public final j0 a(){
       Object obj = PatchProxy.apply(null, this, n.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x1332c7d4);
    }
    public final boolean b(BaseFeed p0){
       QPhoto obj = PatchProxy.applyOneRefs(p0, this, n.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new QPhoto(p0);
       boolean b = true;
       if (k.B(obj) != null) {
          return b;
       }
       PlcEntryStyleInfo plcEntryStyl = obj.getPlcEntryStyleInfo();
       if (plcEntryStyl == null || !plcEntryStyl.needReportAdLogByPlcData()) {
          b = false;
       }
       return b;
    }
    public final boolean c(BaseFeed p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PhotoAdvertisement photoAdverti = p0.get("AD");
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdData;
          if (photoAdverti != null && photoAdverti.mSplashInfo != null) {
             b = true;
          label_0028 :
             return b;
          }
       }
       b = false;
       goto label_0028 ;
    }
    public void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "29")) {
          return;
       }
       if (!this.b(p0.a)) {
          return;
       }
       this.a().e(650, p0.a).s(true).d(new m(p0)).a();
       return;
    }
    public void e(k p0){
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, on, "20")) {
          return;
       }
       a a = p0.a;
       if (a.b == null || (this.b(a.b) && this.c(p0.a.b))) {
          QPhoto qPhoto = new QPhoto(p0.a.b);
          j oj = i0.a().g(qPhoto.mEntity);
          k d = p0.d;
          if (d != null && d.get() != null) {
             oj.m(p0.d.get()).n(p0.e);
          }
          BaseFeed entity = qPhoto.getEntity();
          if (!PatchProxy.applyVoidTwoRefs(oj, entity, this, on, "21")) {
             SplashInfo splashInfo = l.e(entity);
             if (splashInfo != null && !TextUtils.isEmpty(splashInfo.mPreloadLlsid)) {
                oj.l("splash_preload_llsid", splashInfo.mPreloadLlsid);
             }
          }
          CommercialSplashTracker.E().v = r1.i1(qPhoto.getEntity());
          CommercialSplashTracker.E().n = new a(p0.f, qPhoto.getEntity());
          CommercialSplashTracker.E().o = p0.a.a;
          this.a().p(85, oj).q("change_splash_landscape", Boolean.valueOf(l.l(p0.a.b))).d(new a0(p0)).a();
       }
    label_00d3 :
       return;
    }
    public final void f(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "18")) {
          return;
       }
       r d = p0.d;
       if (d != null && this.b(d)) {
          int i = 1;
          Integer[] integerArray = new Integer[i];
          integerArray[0] = Integer.valueOf(7);
          if (a.a(p0, integerArray)) {
             this.a().t(14, p0.d);
          }else {
             integerArray = new Integer[]{Integer.valueOf(13),Integer.valueOf(16)};
             if (a.a(p0, integerArray) && p0.d instanceof LiveStreamFeed) {
                i0.a().e(300, p0.d).d(new l(p0)).a();
             }
          }
       }
       return;
    }
    public void onCollect(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "10")) {
          return;
       }
       if (!this.b(p0.b.mEntity)) {
          return;
       }
       c a = p0.a;
       if (a == 1) {
          this.a().t(918, p0.b.mEntity);
       }else if(a == 2){
          this.a().t(919, p0.b.mEntity);
       }
       return;
    }
    public void onCommented(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "16")) {
          return;
       }
       if (!this.b(p0.a)) {
          return;
       }
       this.a().e(13, p0.a).d(new j(this, p0)).a();
       return;
    }
    public void onLike(g p0){
       j0 oj0;
       e uoe1;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "9")) {
          return;
       }
       if (!this.b(p0.a)) {
          return;
       }
       QPhoto qPhoto = new QPhoto(p0.a);
       if (qPhoto.isLiveStream()) {
          this.a().e(301, qPhoto.mEntity).q("num", String.valueOf(p0.a())).a();
       }else {
          int i = 16;
          QPhoto qPhoto1 = (("FOLLOW").equals(p0.c) && (String.valueOf(i)).equals(p0.b()))? 1: null;
          if (qPhoto.mEntity.a(PhotoMeta.class).isLiked()) {
             oj0 = this.a();
             int i1 = (qPhoto1)? 796: 12;
             oj0.t(i1, qPhoto.mEntity);
             uoe1 = e.G();
             Objects.requireNonNull(uoe1);
             if (!PatchProxy.applyVoid(null, uoe1, uoe, "20") && uoe1.F()) {
                uoe1.r = uoe1.r + 1;
             }
          }else {
             oj0 = this.a();
             if (qPhoto1) {
                i = 797;
             }
             oj0.t(i, qPhoto.mEntity);
             uoe1 = e.G();
             Objects.requireNonNull(uoe1);
             if (!PatchProxy.applyVoid(null, uoe1, uoe, "21") && uoe1.F()) {
                uoe1.s = uoe1.s + 1;
             }
          }
       }
    label_00c9 :
       return;
    }
    public void onNegative(i p0){
       boolean b;
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, on, "11")) {
          return;
       }
       if (!this.b(p0.a)) {
          return;
       }
       QPhoto qPhoto = new QPhoto(p0.a);
       if (qPhoto.isLiveStream()) {
          if (p0.f != null) {
             this.a().e(752, qPhoto.mEntity).a();
          }else {
             this.a().e(306, qPhoto.mEntity).d(new o(p0)).a();
          }
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Integer[] obj = PatchProxy.applyOneRefs(p0, this, on, "12");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj = new Integer[]{Integer.valueOf(7),Integer.valueOf(0x75d8),Integer.valueOf(0x75d9),Integer.valueOf(0x7d42)};
             if (a.a(p0, obj)) {
                b = true;
             }else {
                String[] stringArray = new String[]{"SLIDE_TAG_TOPIC","VERTICAL_SLIDE_DETAIL","AGGREGATE_SLIDE_FEED_DETAIL","DETAIL","FEATURED_DETAIL"};
                Object obj1 = PatchProxy.applyTwoRefs(p0, stringArray, this, on, "36");
                b = (obj1 != patchProxyRe)? obj1.booleanValue(): Arrays.asList(stringArray).contains(p0.c);
             }
          }
          if (b) {
             this.a().e(4, qPhoto.mEntity).d(new p(p0)).a();
          }else if(p0.f != null){
             this.a().e(19, qPhoto.mEntity).a();
          }else {
             this.a().e(18, qPhoto.mEntity).d(new q(p0)).a();
          }
       }
       return;
    }
    public void onPhotoClicked(d p0){
       boolean b;
       e uoe = e.class;
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, on, "5")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("CommercialEventObserver", "onPhotoClicked", objArray);
       d.a(-1638991736).Tq(p0.a);
       if (!this.b(p0.a)) {
          return;
       }
       QPhoto qPhoto = new QPhoto(p0.a);
       if (qPhoto.isLiveStream()) {
          b.a(-762347696).r1(qPhoto.mEntity, "key_enteraction", Integer.valueOf(1));
          PhotoAdvertisement photoAdverti = k.B(qPhoto);
          int i1 = (photoAdverti != null && (photoAdverti.mAdLiveForFansTop != null && photoAdverti.mIsFansTopWholeArea != null))? 1: 0;
          if (!i1) {
             Object obj = PatchProxy.applyOneRefs(qPhoto, null, uoe, "8");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(!qPhoto.isAd() || (qPhoto.isLiveStream() && e.b(qPhoto) != null)){
                i = 1;
             }
          label_008f :
             b = i;
             if (b) {
                if (!PatchProxy.applyVoidOneRefs(qPhoto, this, on, "6")) {
                   this.a().e(283, qPhoto.mEntity).d(j.b).a();
                }
             }else {
                this.a().e(61, qPhoto.mEntity).d(new e(photoAdverti, p0)).a();
             }
          }
       }else if(e.d(qPhoto) || e.g(qPhoto)){
          if (!PatchProxy.applyVoidOneRefs(qPhoto, this, on, "7")) {
             this.a().e(141, qPhoto.mEntity).d(new k(qPhoto)).a();
          }
       }else {
          j oj = b.a(0x1d6683e9).d(qPhoto.mEntity, 1);
          PhotoAdvertisement photoAdverti1 = k.B(qPhoto);
          if (photoAdverti1 != null) {
             String str = "search_item_click_type";
             if (photoAdverti1.getExtra(str) != null) {
                oj.c.b = photoAdverti1.getExtra(str).intValue();
             }
          }
          a.b(qPhoto.getPlcEntryStyleInfo(), oj);
          this.a().l(oj);
       }
       if (PatchProxy.isSupport(uoe)) {
          Boolean tRUE = Boolean.TRUE;
          if (!PatchProxy.applyVoidThreeRefs(qPhoto, tRUE, tRUE, null, e.class, "11")) {
          label_014b :
             if (!e.f(qPhoto)) {
                e.i(qPhoto, 1);
             }
          }
       }else {
          goto label_014b ;
       }
       if (qPhoto.mEntity instanceof AdAggregateTemplateFeed) {
          this.a().i(b.a(0x1d6683e9).d(qPhoto.mEntity, 1), 1);
       }
    label_016e :
       return;
    }
    public void onPhotoImpression(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.a("CommercialEventObserver", "visible rate is : "+p0.d, objArray);
       if (!this.b(p0.a)) {
          return;
       }
       AdLogPhotoImpressionUtils.b(p0);
       return;
    }
    public void onPhotoReported(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "8")) {
          return;
       }
       if (!this.b(p0.a)) {
          return;
       }
       QPhoto qPhoto = new QPhoto(p0.a);
       if (qPhoto.isLiveStream()) {
          this.a().e(305, qPhoto.mEntity).q("type", String.valueOf(p0.d)).a();
       }else {
          this.a().e(17, qPhoto.mEntity).d(k.b).a();
       }
       return;
    }
    public void onUnfollowed(s p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "19")) {
          return;
       }
       s d = p0.d;
       if (d != null && this.b(d)) {
          this.a().t(19, p0.d);
       }
       return;
    }
}
