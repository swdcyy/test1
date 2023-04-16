package bz8.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.c;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData;
import android.view.View;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import wkd.b;
import u49.c;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import bz8.c;
import bz8.d;
import erd.g;
import crd.b;
import bz8.m;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import java.lang.Integer;
import bz8.n;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData;
import tw.f;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.photoad.k;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import ekd.m1;
import bz8.f;

public final class e extends PresenterV2	// class@000498
{
    public QPhoto p;
    public PublishSubject q;
    public f r;
    public PhotoAdvertisement$HalfLandingPageInfo s;
    public PathLoadingView t;
    public View u;

    public void e(){
       super();
    }
    public void E8(){
       boolean b;
       PhotoAdvertisement$HalfLandingPageInfo mHalfLanding;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       c a = c.a;
       e tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       Objects.requireNonNull(a);
       e obj = PatchProxy.applyOneRefs(tp, a, c.class, "49");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(tp, "photo");
          PhotoAdvertisement photoAdverti1 = k.B(tp);
          if (photoAdverti1 != null) {
             PhotoAdvertisement$AdData adData = photoAdverti1.getAdData();
             if (adData != null) {
                adData = adData.mHalfLandingPageInfo;
                if (adData != null) {
                   mHalfLanding = adData.mHalfLandingData;
                label_0047 :
                   if (mHalfLanding != null) {
                      b = true;
                   }else {
                      b = false;
                   }
                }
             }
          }
          mHalfLanding = objArray;
          goto label_0047 ;
       }
       if (b) {
          uoe = this.p;
          if (uoe == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement photoAdverti = k.B(uoe);
          a.m(photoAdverti);
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mPhoto\)!!");
          this.S8(photoAdverti.getAdData().mHalfLandingPageInfo.mHalfLandingData);
          this.V8();
       }else if(PatchProxy.applyVoid(objArray, this, uoe, "4")){
          if (!PatchProxy.applyVoid(objArray, this, uoe, "7")) {
             obj = this.u;
             if (obj == null) {
                a.S("mEmptyView");
             }
             obj.setVisibility(0);
          }
          if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
             uoe = this.t;
             String str = "mLoadingView";
             if (uoe == null) {
                a.S(str);
             }
             uoe.setVisibility(0);
             uoe = this.t;
             if (uoe == null) {
                a.S(str);
             }
             uoe.k();
          }
          e ts = this.s;
          a.m(ts);
          this.X7(b.a(0x3a268c29).C(ts.mSiteId).map(new e()).observeOn(d.a).subscribe(new c(this), new d(this)));
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       e tt = this.t;
       String str = "mLoadingView";
       if (tt == null) {
          a.S(str);
       }
       tt.a();
       tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       tt.setVisibility(8);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       e tu = this.u;
       if (tu == null) {
          a.S("mEmptyView");
       }
       tu.setVisibility(8);
       return;
    }
    public final void S8(PhotoAdvertisement$HalfLandingData p0){
       e tr;
       Iterator iterator;
       int i;
       m c1;
       PhotoAdvertisement$PrivacyOption obj;
       PhotoAdvertisement$PrivacyData obj1;
       PhotoAdvertisement photoAdverti;
       PhotoAdvertisement$AdData adData;
       Iterator iterator1;
       n on;
       Object obj2;
       n on1;
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       e ts = this.s;
       if (ts != null) {
          ts.mHalfLandingData = p0;
       }
       if (p0 == null) {
          if (ts != null) {
             ts.mDataType = 0;
          }
          tr = this.r;
          if (tr != null) {
             m c = m.c;
             e tp = this.p;
             if (tp == null) {
                a.S("mPhoto");
             }
             Objects.requireNonNull(c);
             ArrayList uArrayList = PatchProxy.applyOneRefs(tp, c, om, "4");
             if (uArrayList != PatchProxyResult.class) {
             }else {
                a.p(tp, "photo");
                uArrayList = new ArrayList();
                iterator = m.b.iterator();
                while (iterator.hasNext()) {
                   i = iterator.next().intValue();
                   c1 = m.c;
                   Objects.requireNonNull(c1);
                   if (PatchProxy.isSupport(om)) {
                      obj = PatchProxy.applyTwoRefs(tp, Integer.valueOf(i), c1, om, "5");
                      if (obj != PatchProxyResult.class) {
                      }else if(i != 1){
                         if (i != 4) {
                            obj = null;
                         }else {
                            obj1 = PatchProxy.applyOneRefs(tp, c1, om, "7");
                            if (obj1 != PatchProxyResult.class) {
                            label_00f1 :
                               obj = obj1;
                            }else {
                               obj1 = new PhotoAdvertisement$PrivacyData();
                               photoAdverti = k.B(tp);
                               if (photoAdverti != null) {
                                  adData = photoAdverti.getAdData();
                                  if (adData != null) {
                                     adData = adData.mPrivacyOption;
                                     if (adData != null) {
                                        obj = adData.mPrivacyAppInfo;
                                        if (obj != null) {
                                           obj1.mAppName = obj.mAppName;
                                           obj1.mAppVersion = obj.mAppVersion;
                                           obj1.mDeveloper = obj.mDeveloper;
                                           obj1.mPackageSize = obj.mPackageSize;
                                        }
                                        obj1.mLinks = new ArrayList();
                                        PhotoAdvertisement$PrivacyOption mAppInfoLink = adData.mAppInfoLinkList;
                                        if (mAppInfoLink != null) {
                                           iterator1 = mAppInfoLink.iterator();
                                           while (iterator1.hasNext()) {
                                              PhotoAdvertisement$AppInfoLink uAppInfoLink = iterator1.next();
                                              PhotoAdvertisement$HalfPrivacyLink halfPrivacyL = new PhotoAdvertisement$HalfPrivacyLink();
                                              halfPrivacyL.mLinkText = uAppInfoLink.mLinkText;
                                              halfPrivacyL.mLinkUrl = uAppInfoLink.mLinkUrl;
                                              obj1.mLinks.add(halfPrivacyL);
                                           }
                                        }
                                     }
                                  }
                               }
                               on = new n(4, obj1);
                            }
                         }
                      }else {
                         obj1 = PatchProxy.applyOneRefs(tp, c1, om, "6");
                         if (obj1 != PatchProxyResult.class) {
                            goto label_00f1 ;
                         }else {
                            PhotoAdvertisement$HeaderData headerData = new PhotoAdvertisement$HeaderData();
                            photoAdverti = k.B(tp);
                            if (photoAdverti != null) {
                               headerData.mIconUrl = photoAdverti.mAppIconUrl;
                               headerData.mTitle = photoAdverti.mAppName;
                               headerData.mButtonText = f.a(photoAdverti, true);
                               ArrayList uArrayList1 = new ArrayList();
                               a.o(photoAdverti, "it");
                               adData = photoAdverti.getAdData();
                               if (adData != null) {
                                  adData = adData.mExtraDisplayInfo;
                                  if (adData != null) {
                                     PhotoAdvertisement$ExtraDisplayInfo mTagInfoList = adData.mTagInfoList;
                                     if (mTagInfoList != null) {
                                        iterator1 = mTagInfoList.iterator();
                                        while (iterator1.hasNext()) {
                                           PhotoAdvertisement$HalfLandingHeaderLabel halfLandingH = new PhotoAdvertisement$HalfLandingHeaderLabel();
                                           halfLandingH.mText = iterator1.next().mText;
                                           uArrayList1.add(halfLandingH);
                                        }
                                     }
                                  }
                               }
                               headerData.mLabels = uArrayList1;
                            }
                            headerData.mDesc = tp.getCaption();
                            on = new n(true, headerData);
                         }
                      }
                      obj = on;
                   }else {
                      goto label_0078 ;
                   }
                   if (obj != null) {
                      uArrayList.add(obj);
                   }
                }
             }
             tr.W0(uArrayList);
          }
       }else if(ts != null){
          ts.mDataType = 1;
       }
       ts = this.r;
       if (ts != null) {
          m c2 = m.c;
          Objects.requireNonNull(c2);
          ArrayList uArrayList2 = PatchProxy.applyOneRefs(p0, c2, om, "1");
          if (uArrayList2 != PatchProxyResult.class) {
          }else {
             a.p(p0, "landingData");
             uArrayList2 = new ArrayList();
             iterator = m.a.iterator();
             while (iterator.hasNext()) {
                i = iterator.next().intValue();
                c1 = m.c;
                Objects.requireNonNull(c1);
                if (PatchProxy.isSupport(om)) {
                   obj2 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(i), c1, om, "2");
                   if (obj2 != PatchProxyResult.class) {
                   }else if(i != 1){
                      if (i != 2) {
                         if (i != 3) {
                            if (i != 4) {
                               obj2 = null;
                            }else {
                               on1 = c1.a(i, p0.mPrivacyData);
                            }
                         }else {
                            on1 = c1.a(i, p0.mCollapsedTextData);
                         }
                      }else {
                         on1 = c1.a(i, p0.mCoverData);
                      }
                   }else {
                      on1 = c1.a(i, p0.mHeaderData);
                   }
                   obj2 = on1;
                }else {
                   goto label_01ae ;
                }
                if (obj2 != null) {
                   uArrayList2.add(obj2);
                }
             }
          }
          ts.W0(uArrayList2);
       }
       tr = this.r;
       if (tr != null) {
          tr.k0();
       }
       tr = this.q;
       if (tr == null) {
          a.S("mPageRenderSuccessPublisher");
       }
       tr.onNext(Boolean.TRUE);
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, e.class, "10")) {
          return;
       }
       e tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       k ok = new k(tp.mEntity);
       tp = this.s;
       PhotoAdvertisement$HalfLandingPageInfo mDataType = (tp != null)? tp.mDataType: 0;
       ok.l("template_type", Integer.valueOf(mDataType));
       o.z().p(711, ok).a();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.view_loading);
       a.o(view, "ViewBindUtils.bindWidget¡­tView, R.id.view_loading\)");
       this.t = view;
       p0 = m1.f(p0, R.id.iv_empty);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.iv_empty\)");
       this.u = p0;
       return;
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "1")) {
          return;
       }
       e obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("HALF_LANDING_PAGE_RENDER_SUCCESS");
       a.o(obj, "inject\(AccessIds.HALF_LANDING_PAGE_RENDER_SUCCESS\)");
       this.q = obj;
       obj = this.p;
       if (obj == null) {
          a.S("mPhoto");
       }
       PhotoAdvertisement photoAdverti = k.B(obj);
       if (photoAdverti != null) {
          PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
          if (adData != null) {
             objArray = adData.mHalfLandingPageInfo;
          }
       }
       this.s = objArray;
       this.r = this.s8(f.class);
       return;
    }
}
