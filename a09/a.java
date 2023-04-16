package a09.a;
import gz8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a09.a$a;
import q09.a;
import q09.b;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import im8.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView;
import android.view.View;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.gifshow.photoad.download.h;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import android.app.Activity;
import tw.j;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import mxb.c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.MixLottieCardData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo;
import com.kuaishou.android.model.ads.ReplaceTemplateData;
import com.kuaishou.android.model.ads.ReplaceTemplateData$ReplacePlayEndInfo;
import lnc.y0;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayEndView;
import android.content.Context;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView;
import qrd.l1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import n49.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import android.view.ViewGroup$LayoutParams;
import a09.a$b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import a09.a$c;
import g59.u;
import erd.g;
import crd.b;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;
import a09.c;
import n49.d;
import n49.e;

public abstract class a extends PresenterV2 implements a	// class@00000c
{
    public b A;
    public ViewGroup B;
    public AdPlayEndBaseView C;
    public boolean D;
    public QPhoto p;
    public o q;
    public f r;
    public f s;
    public f t;
    public f u;
    public BaseFragment v;
    public PublishSubject w;
    public PublishSubject x;
    public PhotoDetailParam y;
    public f z;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.S8()) {
          a tA = this.A;
          if (tA != null) {
             tA.c(new a$a(this));
          }
       }else {
          this.V8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       a ts = this.s;
       if (ts == null) {
          a.S("mIsPlayEndScreenPrepare");
       }
       ts.set(Boolean.FALSE);
       ts = this.C;
       if (ts != null) {
          ts.b();
          a tB = this.B;
          if (tB == null) {
             a.S("mRootLayout");
          }
          tB.removeView(ts);
       }
       return;
    }
    public final boolean P8(){
       boolean b;
       a obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.R8()) {
          obj = this.u;
          if (obj == null) {
             a.S("mCanShowPlayEndRef");
          }
          Object obj1 = obj.get();
          a.o(obj1, "mCanShowPlayEndRef.get\(\)");
          if (obj1.booleanValue()) {
             b = true;
          label_0037 :
             return b;
          }
       }
       b = false;
       goto label_0037 ;
    }
    public final boolean R8(){
       a obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.C;
       a.m(obj);
       boolean b = (!obj.getVisibility())? true: false;
       return b;
    }
    public abstract boolean S8();
    public final void V8(){
       boolean b;
       ThanosPlayEndView thanosPlayEn;
       l1 a;
       PhotoAdvertisement$RequestEApiInfo mReplaceTemp;
       Boolean uBoolean;
       ReplaceTemplateData$ReplacePlayEndInfo mMixLottieDa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       a obj = PatchProxy.apply(objArray, this, uoa, "9");
       String str = "10";
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = this.p;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (s.I(obj)) {
             PhotoAdvertisement obj2 = PatchProxy.apply(objArray, this, uoa, str);
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else {
                obj = this.p;
                if (obj == null) {
                   a.S("mPhoto");
                }
                obj2 = k.B(obj);
                obj2 = (obj2 != null)? obj2.mUrl: objArray;
                if (h.n().k(obj2) == APKDownloadTask$DownloadStatus.COMPLETED) {
                   b = true;
                }else {
                   b = false;
                }
             }
             if (!b && this.getActivity() != null) {
                b = true;
             }
          }
       label_0067 :
          b = false;
       }
       if (!b) {
          return;
       }else {
          obj = this.p;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (s.N(k.B(obj))) {
             return;
          }else {
             obj = this.C;
             if (obj != null) {
                a tB = this.B;
                if (tB == null) {
                   a.S("mRootLayout");
                }
                tB.removeView(obj);
             }
             if (!PatchProxy.applyVoid(objArray, this, uoa, "8")) {
                uoa = this.p;
                if (uoa == null) {
                   a.S("mPhoto");
                }
                Object[] objArray1 = PatchProxy.applyOneRefs(uoa, objArray, j.class, str);
                if (objArray1 != patchProxyRe) {
                }else if(!j.y(uoa)){
                   objArray1 = objArray;
                }else {
                   PhotoAdvertisement photoAdverti1 = k.B(uoa);
                   a.m(photoAdverti1);
                   objArray1 = photoAdverti1.mAdData.mPlayEndInfo;
                }
                if (objArray1 != null) {
                   uoa = this.p;
                   if (uoa == null) {
                      a.S("mPhoto");
                   }
                   ReplaceTemplateData obj1 = PatchProxy.applyOneRefs(uoa, objArray, c.class, "56");
                   if (obj1 != patchProxyRe) {
                   }else {
                      PhotoAdvertisement photoAdverti = k.B(uoa);
                      if (photoAdverti != null) {
                         PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
                         if (adData != null) {
                            adData = adData.mRequestEApiInfo;
                            if (adData != null) {
                               mReplaceTemp = adData.mReplaceTemplateData;
                            label_00e7 :
                               if (mReplaceTemp != null) {
                                  obj1 = mReplaceTemp.mPlayEndInfo;
                                  if (obj1 != null) {
                                     uBoolean = Boolean.valueOf(obj1.isValid());
                                  label_00f7 :
                                     if (y0.p(uBoolean)) {
                                        if (mReplaceTemp != null) {
                                           ReplaceTemplateData mPlayEndInfo = mReplaceTemp.mPlayEndInfo;
                                           if (mPlayEndInfo != null) {
                                              mMixLottieDa = mPlayEndInfo.mMixLottieData;
                                           label_011a :
                                              if (mMixLottieDa != null) {
                                                 if (!mMixLottieDa.length()) {
                                                    i = 1;
                                                 }
                                                 if (i) {
                                                    mMixLottieDa = objArray;
                                                 }
                                                 if (mMixLottieDa != null) {
                                                    obj1 = a.a.h(mMixLottieDa, MixLottieCardData.class);
                                                 }
                                              }
                                              obj1 = objArray;
                                           }
                                        }
                                     }else {
                                        photoAdverti = k.B(uoa);
                                        if (photoAdverti != null) {
                                           adData = photoAdverti.getAdData();
                                           if (adData != null) {
                                              adData = adData.mPlayEndInfo;
                                              if (adData != null) {
                                                 mMixLottieDa = adData.mMixLottieData;
                                                 goto label_011a ;
                                              }
                                           }
                                        }
                                     }
                                     mMixLottieDa = objArray;
                                     goto label_011a ;
                                  }
                               }
                               uBoolean = objArray;
                               goto label_00f7 ;
                            }
                         }
                      }
                      mReplaceTemp = objArray;
                      goto label_00e7 ;
                   }
                   if (obj1 == null) {
                      uoa = this.B;
                      if (uoa == null) {
                         a.S("mRootLayout");
                      }
                      thanosPlayEn = new ThanosPlayEndView(uoa.getContext());
                   }else {
                      uoa = this.B;
                      if (uoa == null) {
                         a.S("mRootLayout");
                      }
                      Context context = uoa.getContext();
                      a.o(context, "mRootLayout.context");
                      thanosPlayEn = new ThanosPlayMixLottieEndView(context);
                      thanosPlayEn.setTextData(obj1);
                      a = l1.a;
                   }
                   this.C = thanosPlayEn;
                   uoa = this.y;
                   if (uoa == null) {
                      a.S("mDetailParam");
                   }
                   if (uoa.isThanos()) {
                      thanosPlayEn.setCloseByPhysicalBack(true);
                   }
                   thanosPlayEn.setAdPlayEndViewClickListener(this);
                   uoa = this.q;
                   if (uoa == null) {
                      a.S("mPhotoAdActionBarClickProcessor");
                   }
                   thanosPlayEn.setPhotoAdActionBarClickProcessor(uoa);
                   Activity activity = this.getActivity();
                   if (!activity instanceof GifshowActivity) {
                      activity = objArray;
                   }
                   if (activity != null) {
                      objArray = activity.getLifecycle();
                   }
                   uoa = this.p;
                   if (uoa == null) {
                      a.S("mPhoto");
                   }
                   thanosPlayEn.f(uoa, objArray);
                   ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
                   a tB1 = this.B;
                   if (tB1 == null) {
                      a.S("mRootLayout");
                   }
                   tB1.addView(this.C, layoutParams);
                   thanosPlayEn.setVisibility(8);
                   thanosPlayEn.b();
                }
             }
             a tz = this.z;
             if (tz == null) {
                a.S("mController");
             }
             tz.set(new a$b(this));
             tz = this.v;
             if (tz == null) {
                a.S("mFragment");
             }
             this.X7(tz.m().subscribe(new a$c(this), u.a));
             return;
          }
       }
    }
    public abstract int W8();
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       p0 = m1.f(p0, this.W8());
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, rootViewId\(\)\)");
       this.B = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.q8(o.class);
       a.o(obj, "inject\(PhotoAdActionBarClickProcessor::class.java\)");
       this.q = obj;
       obj = this.x8("PHOTO_PLAY_END_CLICK_LISTENER");
       a.o(obj, "injectRef\(AccessIds.PHOTO_PLAY_END_CLICK_LISTENER\)");
       this.r = obj;
       obj = this.x8("PHOTO_VIDEO_PLAY_END_PREPARE");
       a.o(obj, "injectRef\(AccessIds.PHOTO_VIDEO_PLAY_END_PREPARE\)");
       this.s = obj;
       obj = this.x8("PHOTO_VIDEO_PLAY_END_VIEW");
       a.o(obj, "injectRef\(AccessIds.PHOTO_VIDEO_PLAY_END_VIEW\)");
       this.t = obj;
       obj = this.x8("PHOTO_CAN_SHOW_PLAY_END");
       a.o(obj, "injectRef\(AccessIds.PHOTO_CAN_SHOW_PLAY_END\)");
       this.u = obj;
       Object obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.v = obj1;
       obj1 = this.r8("PHOTO_VIDEO_PLAY_END_VISIBILITY_PUBLISH");
       a.o(obj1, "inject\(AccessIds.PHOTO_V¡­Y_END_VISIBILITY_PUBLISH\)");
       this.w = obj1;
       obj1 = this.r8("AD_PLAY_END_VIEW_STATE");
       a.o(obj1, "inject\(AccessIds.AD_PLAY_END_VIEW_STATE\)");
       this.x = obj1;
       obj1 = this.q8(PhotoDetailParam.class);
       a.o(obj1, "inject\(PhotoDetailParam::class.java\)");
       this.y = obj1;
       obj = this.x8("PHOTO_PLAY_END_CONTROLLER");
       a.o(obj, "injectRef\(AccessIds.PHOTO_PLAY_END_CONTROLLER\)");
       this.z = obj;
       this.A = this.t8("REQUEST_REPLACE_DATA_SERVICE");
       return;
    }
    public void q2(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "17")) {
          return;
       }
       this.D = false;
       uoa = this.r;
       if (uoa == null) {
          a.S("mClickListener");
       }
       c uoc = uoa.get();
       if (uoc != null) {
          uoc.a(p0);
       }
       return;
    }
    public void x1(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "16")) {
          return;
       }
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "19")) {
          Activity activity = this.getActivity();
          if (!activity instanceof GifshowActivity) {
             activity = null;
          }
          boolean b = true;
          if (activity != null) {
             a tq = this.q;
             if (tq == null) {
                a.S("mPhotoAdActionBarClickProcessor");
             }
             a tp = this.p;
             if (tp == null) {
                a.S("mPhoto");
             }
             d uod = d.a();
             uod.b(p0);
             uod.g(b);
             tq.c(tp, activity, uod);
          }
          uoa = this.p;
          if (uoa == null) {
             a.S("mPhoto");
          }
          if (!j.D(uoa)) {
             this.D = b;
          }else {
             uoa = this.r;
             if (uoa == null) {
                a.S("mClickListener");
             }
             c uoc = uoa.get();
             if (uoc != null) {
                uoc.b(p0);
             }
          }
       }
       return;
    }
    public void z5(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "18")) {
          return;
       }
       uoa = this.q;
       if (uoa == null) {
          a.S("mPhotoAdActionBarClickProcessor");
       }
       a tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       uoa.a(tp, this.getActivity(), new e(p0));
       return;
    }
}
