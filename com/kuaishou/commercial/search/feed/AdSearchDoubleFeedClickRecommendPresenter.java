package com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$a;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ClickAfterWords;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import l66.a;
import v5a.g;
import aa9.b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.f;
import s99.d;
import v99.a;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import yx.j0;
import android.view.View;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.commercial.search.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet$Builder;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import java.lang.Integer;
import mxb.j0;
import mxb.i0;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$reportItemKeyWordsClick$$inlined$let$lambda$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$reportMaskClose$$inlined$let$lambda$1;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$reportMaskShow$$inlined$let$lambda$1;
import java.lang.Boolean;
import android.widget.TextView;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$showItemKeyWords$1;
import msd.l;
import lnc.y0;
import android.view.View$MeasureSpec;
import lnc.a1;
import ekd.m1;
import android.view.ViewStub;
import android.view.ViewParent;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$inflateView$1;
import java.util.List;
import android.util.Property;
import android.animation.ObjectAnimator;
import uy.b;
import bm9.a;
import dda.d;
import m66.a;
import ty.a;

public final class AdSearchDoubleFeedClickRecommendPresenter extends PresenterV2	// class@00155d
{
    public TextView A;
    public TextView B;
    public TextView C;
    public PhotoAdvertisement D;
    public PhotoAdvertisement$ClickAfterWords E;
    public final IMediaPlayer$OnInfoListener F;
    public final AdSearchDoubleFeedClickRecommendPresenter$b G;
    public final String p;
    public QPhoto q;
    public a r;
    public b s;
    public a t;
    public View u;
    public View v;
    public View w;
    public View x;
    public View y;
    public TextView z;

    public void AdSearchDoubleFeedClickRecommendPresenter(){
       super();
       this.p = "AdSearchDoubleFeedClickRecommendPresenter";
       this.F = new AdSearchDoubleFeedClickRecommendPresenter$a(this);
       this.G = new AdSearchDoubleFeedClickRecommendPresenter$b(this);
    }
    public static final QPhoto P8(AdSearchDoubleFeedClickRecommendPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       PhotoAdvertisement$CoverActionBarInfo mClickAfterW;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdSearchDoubleFeedClickRecommendPresenter.class, "8")) {
          return;
       }
       AdSearchDoubleFeedClickRecommendPresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       PhotoAdvertisement photoAdverti = k.B(tq);
       this.D = photoAdverti;
       if (photoAdverti != null) {
          PhotoAdvertisement mAdData = photoAdverti.mAdData;
          if (mAdData != null) {
             PhotoAdvertisement$AdData mCoverAction = mAdData.mCoverActionbarInfo;
             if (mCoverAction != null) {
                mClickAfterW = mCoverAction.mClickAfterWords;
             label_0029 :
                if (mClickAfterW != null) {
                   if (photoAdverti != null) {
                      photoAdverti = photoAdverti.mAdData;
                      if (photoAdverti != null) {
                         PhotoAdvertisement$AdData mCoverAction1 = photoAdverti.mCoverActionbarInfo;
                         if (mCoverAction1 != null) {
                            PhotoAdvertisement$CoverActionBarInfo mClickAfterW1 = mCoverAction1.mClickAfterWords;
                            if (mClickAfterW1 != null) {
                               PhotoAdvertisement$ClickAfterWords mWords = mClickAfterW1.mWords;
                            label_003e :
                               String str = 1;
                               tq = (mWords == null || mWords.isEmpty())? 1: null;
                               if (!tq) {
                                  tq = this.D;
                                  if (tq != null) {
                                     photoAdverti = tq.mAdData;
                                     if (photoAdverti != null) {
                                        mCoverAction1 = photoAdverti.mCoverActionbarInfo;
                                        if (mCoverAction1 != null) {
                                           mClickAfterW1 = mCoverAction1.mClickAfterWords;
                                        label_005f :
                                           this.E = mClickAfterW1;
                                           if (mClickAfterW1 != null) {
                                              mWords = mClickAfterW1.mWords;
                                              if (mWords != null) {
                                                 Iterator iterator = mWords.iterator();
                                                 while (true) {
                                                    if (iterator.hasNext()) {
                                                       Object obj = iterator.next();
                                                       int i = TextUtils.x(obj) ^ str;
                                                       if (i) {
                                                          objArray = obj;
                                                       }
                                                    }
                                                    if (objArray != null) {
                                                       if (this.S8() == 2) {
                                                          this.V8();
                                                          return;
                                                       }else {
                                                          b.a(0x6d2a4fdd).a(this);
                                                          if (this.S8() == str) {
                                                             this.c9(0);
                                                          }
                                                          tq = this.s;
                                                          if (tq != null) {
                                                             g og = tq.f();
                                                             if (og != null) {
                                                                og.addOnInfoListener(this.F);
                                                             }
                                                          }
                                                          tq = this.t;
                                                          if (tq != null) {
                                                             tq.b(this.G);
                                                             break ;
                                                          }
                                                          break ;
                                                       }
                                                    }
                                                 }
                                                 tq = this.r;
                                                 Objects.requireNonNull(tq, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
                                                 this.X7(tq.Vg().g().subscribe(new AdSearchDoubleFeedClickRecommendPresenter$c(this), Functions.e));
                                                 return;
                                              }
                                           }
                                           this.V8();
                                           return;
                                        }
                                     }
                                  }
                                  objArray1 = objArray;
                                  goto label_005f ;
                               }
                            }
                         }
                      }
                   }
                   objArray1 = objArray;
                   goto label_003e ;
                }
                objArray = new Object[0];
                j0.f(this.p, "data is error", objArray);
                this.V8();
                return;
             }
          }
       }
       mClickAfterW = objArray;
       goto label_0029 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, AdSearchDoubleFeedClickRecommendPresenter.class, "6")) {
          return;
       }
       this.V8();
       b.a(0x6d2a4fdd).c(this);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, AdSearchDoubleFeedClickRecommendPresenter.class, "5")) {
          return;
       }
       AdSearchDoubleFeedClickRecommendPresenter tw = this.w;
       if (tw != null && !tw.getVisibility()) {
          this.Y8(14);
          tw = this.q;
          if (tw == null) {
             a.S("mPhoto");
          }
          b.m(tw.mEntity, 2);
          this.V8();
       }
       return;
    }
    public final int S8(){
       AdSearchDoubleFeedClickRecommendPresenter obj = PatchProxy.apply(null, this, AdSearchDoubleFeedClickRecommendPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.q;
       if (obj == null) {
          a.S("mPhoto");
       }
       return b.g(obj);
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, AdSearchDoubleFeedClickRecommendPresenter.class, "7")) {
          return;
       }
       AdSearchDoubleFeedClickRecommendPresenter tw = this.w;
       if (tw != null) {
          tw.setVisibility(8);
       }
       return;
    }
    public final void W8(Animator p0,Animator p1,Animator$AnimatorListener p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AdSearchDoubleFeedClickRecommendPresenter.class, "24")) {
          return;
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.play(p0).with(p1);
       uAnimatorSet.setDuration(250);
       uAnimatorSet.setStartDelay(200);
       uAnimatorSet.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       uAnimatorSet.addListener(p2);
       uAnimatorSet.start();
       return;
    }
    public final void X8(String p0,int p1){
       AdSearchDoubleFeedClickRecommendPresenter uAdSearchDou = AdSearchDoubleFeedClickRecommendPresenter.class;
       if (PatchProxy.isSupport(uAdSearchDou) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAdSearchDou, "22")) {
          return;
       }
       uAdSearchDou = this.q;
       if (uAdSearchDou == null) {
          a.S("mPhoto");
       }
       QPhoto mEntity = uAdSearchDou.mEntity;
       if (mEntity != null) {
          i0.a().e(141, mEntity).f(new AdSearchDoubleFeedClickRecommendPresenter$reportItemKeyWordsClick$$inlined$let$lambda$1(p0, p1)).a();
       }
       return;
    }
    public final void Y8(int p0){
       AdSearchDoubleFeedClickRecommendPresenter uAdSearchDou = AdSearchDoubleFeedClickRecommendPresenter.class;
       if (PatchProxy.isSupport(uAdSearchDou) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAdSearchDou, "21")) {
          return;
       }
       uAdSearchDou = this.q;
       if (uAdSearchDou == null) {
          a.S("mPhoto");
       }
       QPhoto mEntity = uAdSearchDou.mEntity;
       if (mEntity != null) {
          i0.a().e(141, mEntity).f(new AdSearchDoubleFeedClickRecommendPresenter$reportMaskClose$$inlined$let$lambda$1(p0)).a();
       }
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, AdSearchDoubleFeedClickRecommendPresenter.class, "20")) {
          return;
       }
       AdSearchDoubleFeedClickRecommendPresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       QPhoto mEntity = tq.mEntity;
       if (mEntity != null) {
          i0.a().e(140, mEntity).f(new AdSearchDoubleFeedClickRecommendPresenter$reportMaskShow$$inlined$let$lambda$1(this)).a();
       }
       return;
    }
    public final void a9(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdSearchDoubleFeedClickRecommendPresenter.class, "15")) {
          return;
       }
       AdSearchDoubleFeedClickRecommendPresenter ts = this.s;
       if (ts != null) {
          Object obj = PatchProxy.apply(objArray, ts, b.class, "28");
          b = (obj != PatchProxyResult.class)? obj.booleanValue(): ts.b.isPaused();
          if (b) {
             ts.startPlay();
          }
       }
       return;
    }
    public final void b9(TextView p0,String p1,int p2){
       if (PatchProxy.isSupport(AdSearchDoubleFeedClickRecommendPresenter.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, AdSearchDoubleFeedClickRecommendPresenter.class, "17")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (TextUtils.x(p1)) {
          p0.setVisibility(8);
          return;
       }else {
          p0.setText(p1);
          p0.setVisibility(0);
          y0.a(p0, new AdSearchDoubleFeedClickRecommendPresenter$showItemKeyWords$1(this, p1, p2));
          return;
       }
    }
    public final void c9(boolean p0){
       int b;
       AdSearchDoubleFeedClickRecommendPresenter tv;
       int height;
       AdSearchDoubleFeedClickRecommendPresenter tE;
       PhotoAdvertisement$ClickAfterWords mWordsTitle;
       Integer integer;
       AdSearchDoubleFeedClickRecommendPresenter tE1;
       PhotoAdvertisement$ClickAfterWords mWords1;
       String str;
       Object[] objArray2;
       Object[] objArray3;
       Object[] objArray4;
       AdSearchDoubleFeedClickRecommendPresenter uAdSearchDou = AdSearchDoubleFeedClickRecommendPresenter.class;
       if (PatchProxy.isSupport(uAdSearchDou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdSearchDou, "10")) {
          return;
       }
       Object[] objArray = null;
       AdSearchDoubleFeedClickRecommendPresenter obj = PatchProxy.apply(objArray, this, uAdSearchDou, "11");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.u;
          if (obj != null) {
             a.m(obj);
             b = obj.getHeight();
             if (!b) {
                obj = this.u;
                a.m(obj);
                obj.measure(View$MeasureSpec.makeMeasureSpec(i, i), View$MeasureSpec.makeMeasureSpec(i, i));
                obj = this.u;
                a.m(obj);
                b = obj.getMeasuredHeight();
             }
             if (b > a1.d(0x7f0702bf)) {
                b = true;
             }
          }
          b = false;
       }
       if (!b) {
          Object[] objArray1 = new Object[i];
          j0.f(this.p, "height not support", objArray1);
          this.V8();
          return;
       }else {
          int i1 = 2;
          if (this.S8() == i1 || !this.S8()) {
             this.V8();
          }else if(PatchProxy.isSupport(uAdSearchDou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdSearchDou, "13")){
             if (!PatchProxy.applyVoid(objArray, this, uAdSearchDou, "12")) {
                ViewStub viewStub = m1.f(this.m8(), R.id.ad_click_recommend_cover);
                ViewParent parent = (viewStub != null)? viewStub.getParent(): objArray;
                if (parent != null) {
                   viewStub.setLayoutResource(R.layout.arg_RES_7f0d1352);
                   View view = viewStub.inflate();
                   this.w = view;
                   view = (view != null)? view.findViewById(R.id.click_recommend_content): objArray;
                   this.x = view;
                   obj = this.w;
                   view = (obj != null)? obj.findViewById(R.id.close): objArray;
                   this.y = view;
                   if (view != null) {
                      y0.a(view, new AdSearchDoubleFeedClickRecommendPresenter$inflateView$1(this));
                   }
                   obj = this.w;
                   TextView textView = (obj != null)? obj.findViewById(R.id.title): objArray;
                   this.z = textView;
                   obj = this.w;
                   textView = (obj != null)? obj.findViewById(R.id.first): objArray;
                   this.A = textView;
                   obj = this.w;
                   textView = (obj != null)? obj.findViewById(R.id.second): objArray;
                   this.B = textView;
                   obj = this.w;
                   textView = (obj != null)? obj.findViewById(R.id.third): objArray;
                   this.C = textView;
                }
             }
             obj = this.w;
             if (obj == null || obj.getVisibility()) {
                if (!PatchProxy.applyVoid(objArray, this, uAdSearchDou, "14")) {
                   obj = this.s;
                   if (obj != null && obj.isPlaying()) {
                      obj.pause("float_window_show");
                   }
                }
                if (!PatchProxy.applyVoid(objArray, this, uAdSearchDou, "16")) {
                   obj = this.z;
                   if (obj != null) {
                      tE = this.E;
                      mWordsTitle = (tE != null)? tE.mWordsTitle: objArray;
                      obj.setText(mWordsTitle);
                   }
                   obj = this.E;
                   if (obj != null) {
                      PhotoAdvertisement$ClickAfterWords mWords = obj.mWords;
                      if (mWords != null) {
                         integer = Integer.valueOf(mWords.size());
                      label_0172 :
                         Objects.requireNonNull(integer, "null cannot be cast to non-null type kotlin.Int");
                         b = integer.intValue();
                         int i2 = 8;
                         if (b <= 0) {
                            obj = this.A;
                            if (obj != null) {
                               obj.setVisibility(i2);
                            }
                            obj = this.B;
                            if (obj != null) {
                               obj.setVisibility(i2);
                            }
                            obj = this.C;
                            if (obj != null) {
                               obj.setVisibility(i2);
                            }
                         }else if(b == 1){
                            obj = this.A;
                            tE1 = this.E;
                            if (tE1 != null) {
                               mWords1 = tE1.mWords;
                               if (mWords1 != null) {
                                  str = mWords1.get(i);
                               label_01aa :
                                  this.b9(obj, str, 1);
                                  obj = this.B;
                                  if (obj != null) {
                                     obj.setVisibility(i2);
                                  }
                                  obj = this.C;
                                  if (obj != null) {
                                     obj.setVisibility(i2);
                                  }
                               }
                            }
                            str = objArray;
                            goto label_01aa ;
                         }else if(b == i1){
                            obj = this.A;
                            tE1 = this.E;
                            if (tE1 != null) {
                               mWords1 = tE1.mWords;
                               if (mWords1 != null) {
                                  str = mWords1.get(i);
                               label_01d1 :
                                  this.b9(obj, str, 1);
                                  obj = this.B;
                                  tE1 = this.E;
                                  if (tE1 != null) {
                                     mWords1 = tE1.mWords;
                                     if (mWords1 != null) {
                                        str = mWords1.get(1);
                                     label_01e6 :
                                        this.b9(obj, str, i1);
                                        obj = this.C;
                                        if (obj != null) {
                                           obj.setVisibility(i2);
                                        }
                                     }
                                  }
                                  objArray2 = objArray;
                                  goto label_01e6 ;
                               }
                            }
                            objArray2 = objArray;
                            goto label_01d1 ;
                         }else {
                            obj = this.A;
                            tE = this.E;
                            if (tE != null) {
                               mWordsTitle = tE.mWords;
                               if (mWordsTitle != null) {
                                  String str1 = mWordsTitle.get(i);
                               label_0203 :
                                  this.b9(obj, str1, 1);
                                  obj = this.B;
                                  tE = this.E;
                                  if (tE != null) {
                                     mWordsTitle = tE.mWords;
                                     if (mWordsTitle != null) {
                                        str1 = mWordsTitle.get(1);
                                     label_0218 :
                                        this.b9(obj, str1, i1);
                                        obj = this.C;
                                        tE = this.E;
                                        if (tE != null) {
                                           mWordsTitle = tE.mWords;
                                           if (mWordsTitle != null) {
                                              str1 = mWordsTitle.get(i1);
                                           label_022d :
                                              this.b9(obj, str1, 3);
                                           }
                                        }
                                        objArray3 = objArray;
                                        goto label_022d ;
                                     }
                                  }
                                  objArray3 = objArray;
                                  goto label_0218 ;
                               }
                            }
                            objArray3 = objArray;
                            goto label_0203 ;
                         }
                      }
                   }
                   integer = objArray;
                   goto label_0172 ;
                }
             label_0231 :
                if (p0) {
                   if (!PatchProxy.applyVoid(objArray, this, uAdSearchDou, "23") && this.x != null) {
                      tv = this.v;
                      if (tv != null) {
                         a.m(tv);
                         height = tv.getHeight();
                         if (!height) {
                            tv = this.v;
                            a.m(tv);
                            tv.measure(View$MeasureSpec.makeMeasureSpec(i, i), View$MeasureSpec.makeMeasureSpec(i, i));
                            tv = this.v;
                            a.m(tv);
                            height = tv.getMeasuredHeight();
                         }
                         uAdSearchDou = this.x;
                         a.m(uAdSearchDou);
                         float[] uofloatArray = new float[i1];
                         float f = (float)height;
                         uofloatArray[i] = f;
                         uofloatArray[1] = 0;
                         ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(uAdSearchDou, View.TRANSLATION_Y, uofloatArray);
                         a.o(objectAnimat, "ObjectAnimator.ofFloat\(\n¡­ight.toFloat\(\),\n      0f\)");
                         AdSearchDoubleFeedClickRecommendPresenter tx = this.x;
                         a.m(tx);
                         ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(tx, View.ALPHA, new float[i1]{0,0x3f800000});
                         a.o(objectAnimat1, "ObjectAnimator.ofFloat\(\n¡­LPHA,\n      0f,\n      1f\)");
                         this.W8(objectAnimat, objectAnimat1, new b(this, f));
                      }
                   }
                }else {
                   tv = this.w;
                   if (tv != null) {
                      tv.setVisibility(i);
                   }
                }
                this.Z8();
             }
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdSearchDoubleFeedClickRecommendPresenter.class, "2")) {
          return;
       }
       this.u = p0;
       p0 = (p0 != null)? p0.findViewById(R.id.cover_container): null;
       this.v = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdSearchDoubleFeedClickRecommendPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       this.r = this.r8("FRAGMENT");
       this.s = this.t8("SEARCH_PLAY_PLAYER_MODULE");
       this.t = this.t8("AUTO_PLAY_MANAGER");
       return;
    }
    public final void onPhotoClick(d p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdSearchDoubleFeedClickRecommendPresenter.class, "4")) {
          return;
       }
       a.p(p0, "event");
       AdSearchDoubleFeedClickRecommendPresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       a = p0.a;
       a.o(a, "event.mModel");
       if (!TextUtils.n(tq.getPhotoId(), a.getId())) {
          return;
       }else {
          this.R8();
          return;
       }
    }
    public final void onPhotoCoverButtonClick(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdSearchDoubleFeedClickRecommendPresenter.class, "3")) {
          return;
       }
       a.p(p0, "event");
       AdSearchDoubleFeedClickRecommendPresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       p0 = p0.a;
       a.o(p0, "event.mModel");
       if (!TextUtils.n(tq.getPhotoId(), p0.getId())) {
          return;
       }else {
          this.R8();
          return;
       }
    }
}
