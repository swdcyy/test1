package k59.r2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WebViewNavigationBarInfo;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import i2b.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.text.TextPaint;
import android.widget.TextView;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserVerifiedDetail;
import android.graphics.drawable.Drawable;
import wb5.i;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.ad.webview.WebViewFollowToolBarPresenter$initClickListener$1;
import msd.l;
import lnc.y0;
import com.yxcorp.gifshow.ad.webview.WebViewFollowToolBarPresenter$initClickListener$2;
import com.yxcorp.gifshow.ad.webview.WebViewFollowToolBarPresenter$initClickListener$3;
import com.yxcorp.gifshow.ad.webview.WebViewFollowToolBarPresenter$initClickListener$4;
import com.yxcorp.gifshow.ad.webview.WebViewFollowToolBarPresenter$initClickListener$5;
import com.yxcorp.gifshow.ad.webview.WebViewFollowToolBarPresenter$initClickListener$6;
import yl8.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import k59.r2$c;
import erd.g;
import crd.b;
import mxb.j0;
import mxb.i0;
import k59.r2$a;
import java.lang.Integer;
import k59.r2$b;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import java.util.HashMap;
import java.lang.Boolean;
import java.util.Map;
import tkd.b;
import tkd.d;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.res.Resources;
import android.content.Intent;
import jga.f$a;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import java.lang.Number;

public class r2 extends PresenterV2	// class@002b0e
{
    public ImageView A;
    public BaseFeed p;
    public View q;
    public QPhoto r;
    public PhotoAdvertisement$WebViewNavigationBarInfo s;
    public int t;
    public ImageView u;
    public KwaiImageView v;
    public KwaiSizeAdjustableTextView w;
    public KwaiSizeAdjustableTextView x;
    public SelectShapeTextView y;
    public ImageView z;

    public void r2(){
       super();
    }
    public static final QPhoto P8(r2 p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       r2 or2 = r2.class;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, or2, str)) {
          return;
       }
       r2 tp = this.p;
       if (tp == null) {
          a.S("mFeed");
       }
       QPhoto qPhoto = new QPhoto(tp);
       this.r = qPhoto;
       PhotoAdvertisement photoAdverti = k.B(qPhoto);
       if (photoAdverti != null) {
          PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
          if (adData != null) {
             adData = adData.mWebViewNavigationBarInfo;
             if (adData != null) {
                this.s = adData;
                if (adData.mEnableCustomizeNavBar == null || (a.g(String.valueOf(this.t), str) || (!a.g(String.valueOf(this.t), "3") && !a.g(String.valueOf(this.t), "12")))) {
                   if (!PatchProxy.applyVoid(objArray, this, or2, "5")) {
                      View view = this.m8();
                      Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                      boolean b = false;
                      view = a.k(view, R.layout.arg_RES_7f0d0096, b);
                      a.o(view, "KwaiLayoutInflater.infla¡­iew_avatar_banner, false\)");
                      this.q = view;
                      if (view == null) {
                         a.S("mWebViewBannerLayout");
                      }
                      View view1 = view.findViewById(R.id.ad_web_banner_avatar_back_btn);
                      a.o(view1, "findViewById\(R.id.ad_web_banner_avatar_back_btn\)");
                      this.u = view1;
                      view1 = view.findViewById(R.id.ad_web_banner_avatar_view);
                      a.o(view1, "findViewById\(R.id.ad_web_banner_avatar_view\)");
                      this.v = view1;
                      view1 = view.findViewById(R.id.ad_web_banner_avatar_name);
                      a.o(view1, "findViewById\(R.id.ad_web_banner_avatar_name\)");
                      this.w = view1;
                      view1 = view.findViewById(R.id.ad_web_banner_avatar_attention_num);
                      a.o(view1, "findViewById\(R.id.ad_web¡­ner_avatar_attention_num\)");
                      this.x = view1;
                      view1 = view.findViewById(R.id.ad_web_banner_avatar_attention);
                      a.o(view1, "findViewById\(R.id.ad_web_banner_avatar_attention\)");
                      this.y = view1;
                      view1 = view.findViewById(R.id.ad_web_banner_avatar_report);
                      a.o(view1, "findViewById\(R.id.ad_web_banner_avatar_report\)");
                      this.z = view1;
                      view = view.findViewById(R.id.ad_web_banner_avatar_blue_v);
                      a.o(view, "findViewById\(R.id.ad_web_banner_avatar_blue_v\)");
                      this.A = view;
                      r2 tw = this.w;
                      if (tw == null) {
                         a.S("mNameView");
                      }
                      TextPaint paint = tw.getPaint();
                      boolean b1 = true;
                      if (paint != null) {
                         paint.setFakeBoldText(b1);
                      }
                      tw = this.y;
                      if (tw == null) {
                         a.S("mFollowView");
                      }
                      paint = tw.getPaint();
                      if (paint != null) {
                         paint.setFakeBoldText(b1);
                      }
                      tw = this.r;
                      if (tw == null) {
                         a.S("mPhoto");
                      }
                      User user1 = tw.getUser();
                      if (user1 != null) {
                         user1 = user1.mVerifiedDetail;
                         if (user1 != null && user1.mIconType == 2) {
                         label_013a :
                            tw = this.A;
                            if (tw == null) {
                               a.S("mBlueIdentifyImageView");
                            }
                            if (!b1) {
                               b = 8;
                            }
                            tw.setVisibility(b);
                            tw = this.v;
                            if (tw == null) {
                               a.S("mAvatarView");
                            }
                            r2 tr = this.r;
                            if (tr == null) {
                               a.S("mPhoto");
                            }
                            tw.setPlaceHolderImage(i.b(tr.getUserSex()));
                            tr = this.s;
                            if (tr == null) {
                               a.S("mBarInfo");
                            }
                            tw.M(tr.mIconUrl, objArray);
                            tw = this.w;
                            if (tw == null) {
                               a.S("mNameView");
                            }
                            tr = this.s;
                            if (tr == null) {
                               a.S("mBarInfo");
                            }
                            tw.setText(tr.mTitle);
                            tw = this.x;
                            if (tw == null) {
                               a.S("mFollowNumDescription");
                            }
                            tr = this.s;
                            if (tr == null) {
                               a.S("mBarInfo");
                            }
                            tw.setText(tr.mSubTitle);
                            this.Y8();
                         }
                      }
                      b1 = false;
                      goto label_013a ;
                   }
                   if (!PatchProxy.applyVoid(objArray, this, or2, "7")) {
                      or2 = this.u;
                      if (or2 == null) {
                         a.S("mBackBtn");
                      }
                      y0.a(or2, new WebViewFollowToolBarPresenter$initClickListener$1(this));
                      or2 = this.v;
                      if (or2 == null) {
                         a.S("mAvatarView");
                      }
                      y0.a(or2, new WebViewFollowToolBarPresenter$initClickListener$2(this));
                      or2 = this.w;
                      if (or2 == null) {
                         a.S("mNameView");
                      }
                      y0.a(or2, new WebViewFollowToolBarPresenter$initClickListener$3(this));
                      or2 = this.x;
                      if (or2 == null) {
                         a.S("mFollowNumDescription");
                      }
                      y0.a(or2, new WebViewFollowToolBarPresenter$initClickListener$4(this));
                      or2 = this.y;
                      if (or2 == null) {
                         a.S("mFollowView");
                      }
                      y0.a(or2, new WebViewFollowToolBarPresenter$initClickListener$5(this));
                      or2 = this.z;
                      if (or2 == null) {
                         a.S("mReportBtn");
                      }
                      y0.a(or2, new WebViewFollowToolBarPresenter$initClickListener$6(this));
                   }
                   this.X8();
                   this.R8();
                   or2 = this.r;
                   if (or2 == null) {
                      a.S("mPhoto");
                   }
                   User user = or2.getUser();
                   if (user != null) {
                      user.b();
                   }
                   this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new r2$c(this)));
                }
             }
          }
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, r2.class, "9")) {
          return;
       }
       j0 oj0 = i0.a();
       int i = 932;
       r2 tp = this.p;
       if (tp == null) {
          a.S("mFeed");
       }
       oj0.e(i, tp).d(r2$a.b).a();
       return;
    }
    public final void S8(int p0){
       r2 or2 = r2.class;
       if (PatchProxy.isSupport(or2) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, or2, "11")) {
          return;
       }
       j0 oj0 = i0.a();
       int i = 141;
       r2 tp = this.p;
       if (tp == null) {
          a.S("mFeed");
       }
       oj0.e(i, tp).d(new r2$b(p0)).a();
       return;
    }
    public final View V8(){
       r2 obj = PatchProxy.apply(null, this, r2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mWebViewBannerLayout");
       }
       return obj;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, r2.class, "10")) {
          return;
       }
       if (y0.o(this.getActivity())) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("isInhibitProfileAdStyle", Boolean.TRUE);
       b uob = d.a(-1718536792);
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       r2 tp = this.p;
       if (tp == null) {
          a.S("mFeed");
       }
       ProfileStartParam profileStart = ProfileStartParam.k(tp);
       profileStart.D(hashMap);
       uob.Kp(activity, profileStart);
       return;
    }
    public void X8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, r2.class, "8")) {
          return;
       }
       View view = this.m8().findViewById(R.id.title_root);
       if (view != null) {
          view.setVisibility(8);
          ViewParent parent = view.getParent();
          if (!parent instanceof ViewGroup) {
             parent = objArray;
          }
          if (parent != null) {
             r2 tq = this.q;
             if (tq == null) {
                a.S("mWebViewBannerLayout");
             }
             parent.addView(tq);
             FrameLayout uFrameLayout = this.m8().findViewById(R.id.webView);
             if (uFrameLayout != null) {
                ViewGroup$LayoutParams layoutParams = uFrameLayout.getLayoutParams();
                a.o(layoutParams, "webViewLayout.layoutParams");
                if (layoutParams instanceof RelativeLayout$LayoutParams) {
                   objArray = layoutParams;
                }
                if (objArray != null) {
                   objArray.removeRule(3);
                   r2 tq1 = this.q;
                   if (tq1 == null) {
                      a.S("mWebViewBannerLayout");
                   }
                   objArray.topMargin = tq1.getLayoutParams().height;
                }
             }
          }
       }
    label_006c :
       return;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, r2.class, "6")) {
          return;
       }
       r2 tr = this.r;
       if (tr == null) {
          a.S("mPhoto");
       }
       User user = tr.getUser();
       boolean b = (user != null)? user.isFollowingOrFollowRequesting(): 0;
       r2 ty = this.y;
       if (ty == null) {
          a.S("mFollowView");
       }
       ty.setEnabled((b ^ 0x01));
       ty.setSelected(b);
       String str = (b)? ty.getResources().getString(R.string.arg_RES_7f101034): ty.getResources().getString(R.string.arg_RES_7f100f8f);
       ty.setText(str);
       return;
    }
    public final void Z8(){
       String stringExtra;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, r2.class, "12")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          Intent intent = activity.getIntent();
          if (intent != null) {
             stringExtra = intent.getStringExtra("arg_photo_exp_tag");
          label_0020 :
             Activity activity1 = this.getActivity();
             if (!activity1 instanceof GifshowActivity) {
                activity1 = objArray;
             }
             String str = (activity1 != null)? activity1.Q2(): objArray;
             r2 tr = this.r;
             if (tr == null) {
                a.S("mPhoto");
             }
             f$a uoa = new f$a(tr.getUser(), str);
             r2 tr1 = this.r;
             if (tr1 == null) {
                a.S("mPhoto");
             }
             uoa.c(tr1.getFullSource());
             activity1 = this.getActivity();
             if (!activity1 instanceof GifshowActivity) {
                objArray1 = objArray;
             }
             if (objArray1 != null) {
                objArray = objArray1.getUrl();
             }
             uoa.o(a.C(objArray, "#follow"));
             uoa.g(stringExtra);
             r2 tr2 = this.r;
             if (tr2 == null) {
                a.S("mPhoto");
             }
             uoa.f(tr2.getExpTag());
             uoa.q(true);
             FollowHelper.b(uoa.b());
             j0 oj0 = i0.a();
             tr1 = this.p;
             if (tr1 == null) {
                a.S("mFeed");
             }
             oj0.e(14, tr1).a();
             return;
          }
       }
       stringExtra = objArray;
       goto label_0020 ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r2.class, "1")) {
          return;
       }
       Object obj = this.q8(BaseFeed.class);
       a.o(obj, "inject\(BaseFeed::class.java\)");
       this.p = obj;
       obj = this.r8("LAYOUT_TYPE");
       a.o(obj, "inject\(AdWebAccessIds.LAYOUT_TYPE\)");
       this.t = obj.intValue();
       return;
    }
}
