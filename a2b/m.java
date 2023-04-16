package a2b.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.local.sub.entrance.function.model.HeaderFunctionCard;
import com.yxcorp.gifshow.local.sub.entrance.function.model.CardTitle;
import java.lang.CharSequence;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.kwai.social.startup.local.model.DarkLightModel;
import android.net.Uri;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.text.TextUtils;
import java.lang.Number;
import android.graphics.Color;
import android.content.Context;
import androidx.core.content.ContextCompat;
import a2b.n;
import ub.b;
import java.lang.Boolean;
import v1b.c;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.System;
import java.lang.Integer;
import w1b.a;
import tkd.b;
import tkd.d;
import ju5.g;
import android.view.View;
import ekd.m1;
import a2b.m$a;
import android.view.View$OnClickListener;
import x1b.a;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$a;

public final class m extends PresenterV2	// class@00002f
{
    public a p;
    public NearbyHeaderFunctionEntranceView$a q;
    public int r;
    public HeaderFunctionCard s;
    public KwaiImageView t;
    public KwaiImageView u;
    public TextView v;
    public KwaiImageView w;
    public TextView x;
    public KwaiLottieAnimationView y;
    public boolean z;

    public void m(){
       super();
    }
    public static final KwaiImageView P8(m p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mSubtitleImage");
       }
       return p0;
    }
    public void E8(){
       m s;
       m s1;
       HeaderFunctionCard mSubtitleV2;
       CardTitle mLottieUrl;
       m y;
       Activity activity;
       boolean b1;
       String mUrl;
       m s3;
       Context context;
       String mUrl1;
       CardTitle mText1;
       boolean b = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, om, "3")) {
          return;
       }
       String str = "";
       m om1 = 0x43bb8000;
       if (!PatchProxy.applyVoid(objArray, b, om, "8")) {
          s1 = b.t;
          if (s1 == null) {
             a.S("mTitleImage");
          }
          s1.setVisibility(8);
          s1 = b.x;
          if (s1 != null) {
             s1.setVisibility(0);
          }
          s1 = b.x;
          if (s1 != null) {
             m s5 = b.s;
             if (s5 != null) {
                HeaderFunctionCard mTitleV2 = s5.mTitleV2;
                if (mTitleV2 != null) {
                   mText1 = mTitleV2.mText;
                   if (mText1 != null) {
                   label_0047 :
                      s1.setText(mText1);
                   }
                }
             }
             mText1 = str;
             goto label_0047 ;
          }
          Activity activity1 = this.getActivity();
          a.m(activity1);
          if (n.k(activity1) <= a1.e(om1)) {
             s1 = b.x;
             if (s1 != null) {
                s1.setTextSize(1, 12.00f);
             }
          }else {
             s1 = b.x;
             if (s1 != null) {
                s1.setTextSize(1, 14.00f);
             }
          }
       }
    label_006e :
       if (!PatchProxy.applyVoid(objArray, b, om, "9")) {
          s1 = b.w;
          if (s1 != null) {
             d uod1 = Fresco.newDraweeControllerBuilder();
             m s4 = b.s;
             if (s4 != null) {
                HeaderFunctionCard mIconV2 = s4.mIconV2;
                if (mIconV2 != null) {
                   mUrl1 = mIconV2.getMUrl();
                   if (mUrl1 != null) {
                   label_008f :
                      uod1 = uod1.D(Uri.parse(mUrl1));
                      uod1.q(1);
                      s1.setController(uod1.e());
                   }
                }
             }
             mUrl1 = str;
             goto label_008f ;
          }
       }
       if (!PatchProxy.applyVoid(objArray, b, om, "10")) {
          s1 = b.s;
          if (s1 != null) {
             mSubtitleV2 = s1.mSubtitleV2;
             if (mSubtitleV2 != null) {
                mLottieUrl = mSubtitleV2.mImage;
                if (mLottieUrl != null) {
                   mUrl = mLottieUrl.getMUrl();
                label_00c1 :
                   if (TextUtils.isEmpty(mUrl)) {
                      s1 = b.u;
                      if (s1 == null) {
                         a.S("mSubtitleImage");
                      }
                      s1.setVisibility(8);
                      s1 = b.v;
                      if (s1 == null) {
                         a.S("mSubtitleText");
                      }
                      s1.setVisibility(0);
                      activity = this.getActivity();
                      a.m(activity);
                      if (n.k(activity) <= a1.e(om1)) {
                         s1.setTextSize(1, 10.00f);
                      }
                      y = b.s;
                      if (y != null) {
                         HeaderFunctionCard mSubtitleV21 = y.mSubtitleV2;
                         if (mSubtitleV21 != null) {
                            CardTitle mText = mSubtitleV21.mText;
                            if (mText != null) {
                               str = mText;
                            }
                         }
                      }
                      s1.setText(str);
                      s3 = b.s;
                      if (s3 != null) {
                         HeaderFunctionCard mSubtitleV22 = s3.mSubtitleV2;
                         if (mSubtitleV22 != null) {
                            CardTitle mTextColor = mSubtitleV22.mTextColor;
                            if (mTextColor != null) {
                               str = mTextColor.getMUrl();
                            label_0113 :
                               Object obj1 = PatchProxy.applyOneRefs(str, b, om, "11");
                               int i1 = (obj1 != patchProxyRe)? obj1.intValue(): Color.parseColor(str);
                            }
                         }
                      }
                      Object[] objArray1 = objArray;
                      goto label_0113 ;
                   }else {
                      s3 = b.u;
                      if (s3 == null) {
                         a.S("mSubtitleImage");
                      }
                      s3.setVisibility(0);
                      s3 = b.u;
                      if (s3 == null) {
                         a.S("mSubtitleImage");
                      }
                      d uod = Fresco.newDraweeControllerBuilder().D(Uri.parse(mUrl));
                      uod.q(1);
                      uod.s(new n(b));
                      s3.setController(uod.e());
                      s1 = b.v;
                      if (s1 == null) {
                         a.S("mSubtitleText");
                      }
                      s1.setVisibility(8);
                   }
                }
             }
          }
          mUrl = objArray;
          goto label_00c1 ;
       }
       if (!PatchProxy.applyVoid(objArray, b, om, "4")) {
          s1 = b.s;
          if (s1 != null) {
             mSubtitleV2 = s1.mSubtitleV2;
             if (mSubtitleV2 != null) {
                mLottieUrl = mSubtitleV2.mLottieUrl;
             label_0194 :
                y = b.y;
                if (y != null) {
                   y.setVisibility(8);
                }
                activity = this.getActivity();
                a.m(activity);
                int i = n.k(activity);
                m s2 = b.s;
                if (s2 == null || (s2.mIsFromCache == 1 || (i > a1.e(om1) && !TextUtils.isEmpty(mLottieUrl)))) {
                   Object obj = PatchProxy.apply(objArray, b, om, "5");
                   if (obj != patchProxyRe) {
                      b1 = obj.booleanValue();
                   }else if(c.a.getLong(b.d("user")+"nearby_function_lottie_show_time", 0) - (DateUtils.l() - 0x5265c00) < 0){
                      b1 = true;
                   }else {
                      b1 = false;
                   }
                   if (b1) {
                      s = b.u;
                      if (s == null) {
                         a.S("mSubtitleImage");
                      }
                      s.setVisibility(8);
                      s = b.v;
                      if (s == null) {
                         a.S("mSubtitleText");
                      }
                      s.setVisibility(8);
                      s = b.y;
                      if (s != null) {
                         s.setVisibility(0);
                      }
                      b.z = true;
                      s = b.y;
                      if (s != null) {
                         a.m(mLottieUrl);
                         s.F(mLottieUrl);
                      }
                      s = b.y;
                      if (s != null) {
                         s.s();
                      }
                      c.a(System.currentTimeMillis());
                   }
                }
             }
          }
          mLottieUrl = objArray;
          goto label_0194 ;
       }
    label_022f :
       if (!PatchProxy.applyVoid(objArray, b, om, "6")) {
          s = b.s;
          if (s == null || s.mIsFromCache != 1) {
             String str1 = String.valueOf((b.r + 1));
             s1 = b.s;
             Integer integer = (s1 != null)? Integer.valueOf(s1.mType): objArray;
             a.a(str1, "5", String.valueOf(integer), b.z);
          }
       }
       s = b.s;
       if (s != null) {
          objArray = s.mLinkUrl;
       }
       if (!PatchProxy.applyVoidOneRefs(objArray, b, om, "7")) {
          g og = d.a(0x6ea0c3d0);
          if (og != null && og.rM(objArray)) {
             og.t9(objArray, "NearbyFunctionItemPresenter");
          }
       }
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.title);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.title\)");
       this.t = view;
       this.x = m1.f(p0, 0x7f0a3f7b);
       this.y = m1.f(p0, 0x7f0a29c7);
       view = m1.f(p0, R.id.subtitle_image);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.subtitle_image\)");
       this.u = view;
       view = m1.f(p0, R.id.subtitle_text);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.subtitle_text\)");
       this.v = view;
       this.w = m1.f(p0, 0x7f0a132a);
       m1.a(p0, new m$a(this), R.id.nearby_function_item);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.s = this.s8(HeaderFunctionCard.class);
       Object obj = this.r8("ADAPTER_POSITION");
       a.o(obj, "inject\(PageAccessIds.ADAPTER_POSITION\)");
       this.r = obj.intValue();
       obj = this.r8("ADAPTER");
       a.o(obj, "inject\(PageAccessIds.ADAPTER\)");
       this.p = obj;
       this.q = this.t8("nearby_header_NEARBY_HEAD_FUNCTION_ITEM_CALLBACK");
       return;
    }
}
