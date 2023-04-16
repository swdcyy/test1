package com.yxcorp.gifshow.detail.nonslide.b;
import java.util.concurrent.TimeUnit;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.app.Activity;
import java.lang.Object;
import androidx.collection.ArraySet;
import com.yxcorp.gifshow.detail.nonslide.b$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.o;
import java.lang.Integer;
import q87.c;
import crd.b;
import lnc.b9;
import android.os.SystemClock;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.VideoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.paycourse.PayVideoMeta;
import java.lang.Boolean;
import kp.l;
import ok.h;
import tl8.e;
import brd.t;
import com.yxcorp.gifshow.feed.g;
import erd.o;
import com.yxcorp.gifshow.detail.nonslide.a;
import com.yxcorp.gifshow.feed.d;
import i2a.c;
import t45.d;
import brd.z;
import i2a.a;
import i2a.b;
import erd.g;
import i2a.d;
import java.lang.Runnable;
import ekd.k1;
import android.content.Intent;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.w0;
import org.json.JSONObject;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import java.lang.Exception;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import nf6.h;
import ekd.x0;
import com.kuaishou.android.model.mix.QComment;
import ek9.m1;
import java.lang.Throwable;
import i2a.e;
import xf6.d;
import wkd.b;
import kka.h;
import com.yxcorp.gifshow.detail.nonslide.b$b;
import java.util.Set;

public class b	// class@0015cd
{
    public final int a;
    public PhotoDetailParam b;
    public Activity c;
    public int d;
    public QPhoto e;
    public Set f;
    public b g;
    public String h;
    public String i;
    public String j;
    public long k;
    public static long l;
    public static final int m;

    static {
       b.l = TimeUnit.SECONDS.toMillis(5);
    }
    public void b(PhotoDetailParam p0,Activity p1){
       super();
       this.f = new ArraySet();
       this.c = p1;
       this.b = p0;
       this.a = this.hashCode();
       b$a uoa = new b$a();
       uoa.a = 1;
       uoa.b = p0.mPhoto;
       this.c(uoa);
    }
    public final String a(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "["+this.a+"]"+",state "+this.d;
    }
    public QPhoto b(){
       return this.e;
    }
    public final void c(b$a p0){
       t ot;
       String obj2;
       boolean b;
       QComment qComment;
       b uob = this;
       Object obj = p0;
       b uob1 = b.class;
       if (PatchProxy.applyVoidOneRefs(obj, this, uob1, "11")) {
          return;
       }
       Object[] objArray = new Object[]{"move to ",Integer.valueOf(obj.a),"trigger by ",Integer.valueOf(obj.d)};
       int i = 0;
       int i1 = 1;
       boolean i2 = 2;
       int i3 = 3;
       String str = "DetailDataFlowManager";
       o.C().w(str, this.a(), objArray);
       String str1 = 5;
       if (uob.d == str1) {
          Object[] objArray1 = new Object[i1];
          objArray1[i] = "No change allow after release";
          o.C().A(str, this.a(), objArray1);
          return;
       }else if(PatchProxy.applyVoidOneRefs(obj, this, uob1, "13")){
          b$a a = obj.a;
          uob.d = a;
          VideoMeta videoMeta = null;
          if (a != i1) {
             if (a != i2) {
                if (a != i3) {
                   if (a == str1) {
                      b9.a(uob.g);
                   }
                }else {
                   uob.k = SystemClock.elapsedRealtime();
                   if (!PatchProxy.applyVoidOneRefs(obj, this, uob1, "14")) {
                      b e = uob.e;
                      if (e == null) {
                         a = obj.b;
                         uob.e = a;
                         uob.b.mPhoto = a;
                      }else {
                         VideoMeta videoMeta1 = e.getEntity().a(VideoMeta.class);
                         VideoMeta videoMeta2 = obj.b.getEntity().a(VideoMeta.class);
                         if (videoMeta1 != null && videoMeta2 != null) {
                            videoMeta1.updateVideoMetaWhenRrefreshFeed(videoMeta2);
                         }
                         CoverMeta uCoverMeta = uob.e.getEntity().a(CoverMeta.class);
                         CoverMeta uCoverMeta1 = obj.b.getEntity().a(CoverMeta.class);
                         if (uCoverMeta != null && uCoverMeta1 != null) {
                            uCoverMeta.updateCoverMetaWhenRrefreshFeed(uCoverMeta1);
                         }
                         CommonMeta uCommonMeta = uob.e.getEntity().a(CommonMeta.class);
                         CommonMeta uCommonMeta1 = obj.b.getEntity().a(CommonMeta.class);
                         if (uCommonMeta != null && uCommonMeta1 != null) {
                            uCommonMeta.updateCommonMetaWhenRefreshFeed(uCommonMeta1);
                         }
                         if (uob.e.getMusic() != null && obj.b.getMusic() != null) {
                            uob.e.getMusic().sync(obj.b.getMusic());
                         }
                         if (uob.e.isPayCourse() && obj.b.isPayCourse()) {
                            uob.e.mEntity.mPayVideoModel = obj.b.getEntity().a(PayVideoMeta.class);
                         }
                      }
                   }
                }
             }else {
                a = obj.d;
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(a), this, uob1, "17")) {
                   b obj1 = PatchProxy.apply(videoMeta, this, uob1, "4");
                   if (obj1 != patchProxyRe) {
                      i = obj1.booleanValue();
                   }else {
                      obj1 = uob.e;
                      if (obj1 != null) {
                         obj2 = PatchProxy.applyOneRefs(obj1, videoMeta, uob1, "5");
                         b = (obj2 != patchProxyRe)? obj2.booleanValue(): e.a(obj1.getEntity(), VideoFeed.class, l.b);
                         if (b) {
                            Object obj3 = PatchProxy.apply(videoMeta, this, uob1, "9");
                            if (obj3 != patchProxyRe) {
                               b = obj3.booleanValue();
                            }else if((SystemClock.elapsedRealtime() - uob.k) - b.l > 0){
                               b = true;
                            }else {
                               b = false;
                            }
                            if (!b) {
                            label_01a8 :
                               if (!this.d(uob.e)) {
                               label_01b1 :
                                  if (i) {
                                     if (!PatchProxy.applyVoid(videoMeta, this, uob1, "16")) {
                                        obj1 = uob.e;
                                        if (obj1 != null && (this.d(obj1) && uob.e.isVideoType())) {
                                           uob.e.setNeedRetryFreeTraffic(i1);
                                        }
                                     }
                                     if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(a), this, uob1, "18")) {
                                        b9.a(uob.g);
                                        obj1 = uob.e;
                                        if (obj1 == null) {
                                           ot = g.e(uob.i, uob.j);
                                           a uoa = PatchProxy.apply(videoMeta, this, uob1, "22");
                                           if (uoa != patchProxyRe) {
                                           }else {
                                              uoa = a.b;
                                           }
                                           ot = ot.map(uoa);
                                        }else {
                                           ot = g.c(obj1);
                                        }
                                        ot = ot.flatMap(d.b());
                                        c uoc = PatchProxy.apply(videoMeta, this, uob1, "21");
                                        if (uoc != patchProxyRe) {
                                        }else {
                                           uoc = new c(this);
                                        }
                                        uob.g = ot.map(uoc).observeOn(d.a).subscribe(new a(this, a), new b(this, a));
                                     }
                                  }else {
                                     b$a uoa1 = new b$a();
                                     uoa1.a = i3;
                                     uoa1.b = uob.e;
                                     uoa1.d = a;
                                     k1.r(new d(this, uoa1), 0);
                                  }
                               }
                            }
                         }else {
                            goto label_01a8 ;
                         }
                      }
                   label_01b0 :
                      i = true;
                      goto label_01b1 ;
                   }
                }
             }
          }else {
             uob.e = obj.b;
             if (!PatchProxy.applyVoid(videoMeta, this, uob1, "15") && uob.e == null) {
                Uri data = uob.c.getIntent().getData();
                if (data == null || (data.isHierarchical() && !TextUtils.x(data.getLastPathSegment()))) {
                   String str2 = "h5_page";
                   String str3 = w0.a(data, str2);
                   obj2 = "utm_source";
                   String str4 = w0.a(data, obj2);
                   try{
                      JSONObject jSONObject = new JSONObject(w0.a(data, "openFrom"));
                      uob.b.getDetailCommonParam().setFromChannel(jSONObject.optString("channel"));
                      uob.b.getDetailCommonParam().setShareUid(jSONObject.optString("fid"));
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                   }
                   uob.b.getDetailLogParam().setSchemaInfo(TextUtils.i(str3, uob.b.getDetailLogParam().getPageUrlParam(str2)), TextUtils.i(str4, uob.b.getDetailLogParam().getPageUrlParam(obj2)));
                   uob.h = w0.a(data, "exp_tag");
                   uob.j = TextUtils.k(w0.a(data, "serverExpTag"));
                   h.a(data);
                   uob.i = data.getLastPathSegment();
                   str2 = w0.a(data, "rootCommentId");
                   str3 = w0.a(data, "commentId");
                   i2 = Boolean.parseBoolean(x0.a(data, "photoCommentAtNotification"));
                   if (!TextUtils.x(str3)) {
                      try{
                         qComment = new QComment();
                         qComment.transparentParam = new JSONObject().put("sourceType", "KWAI").put("schemaUrl", data.toString());
                      }catch(org.json.JSONException e0){
                         Object[] objArray2 = new Object[i];
                         m1.C().u(str, e0, objArray2);
                      }
                      qComment.mId = str3;
                      qComment.mRootCommentId = str2;
                      uob.b.getDetailCommonParam().setFromCommentAt(i2);
                      uob.b.getDetailCommonParam().setComment(qComment);
                   }
                }
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj, this, uob1, "12")) {
          k1.r(new e(this, obj), 0);
       }
       return;
    }
    public final boolean d(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       k1.a(p0);
       if (d.S() || b.a(-1592356291).n(this.e.mEntity)) {
          return true;
       }
       return false;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b$a uoa = new b$a();
       uoa.a = 5;
       this.c(uoa);
       return;
    }
    public void f(b$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       this.f.remove(p0);
       return;
    }
    public boolean g(int p0){
       Object[] obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[]{" updateData trigger by ",Integer.valueOf(p0)};
       o.C().w("DetailDataFlowManager", this.a(), objArray);
       uob = this.d;
       obj = (uob == 2 || uob == 5)? null: 1;
       if (!obj) {
          obj = new Object[0];
          o.C().w("DetailDataFlowManager", " updateData unable update", obj);
          return 0;
       }else {
          b$a uoa = new b$a();
          uoa.a = 2;
          uoa.b = this.e;
          uoa.d = p0;
          this.c(uoa);
          return 1;
       }
    }
}
