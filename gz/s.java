package gz.s;
import java.lang.Object;
import tjc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import com.kuaishou.android.model.ads.SplashInfo;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo;
import com.kuaishou.android.model.ads.SplashInfo$AnimationInfo;
import com.kwai.framework.model.feed.BaseFeed;
import tw.l;
import com.kuaishou.android.model.ads.SplashInfo$BubbleInfo;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo;
import com.kuaishou.android.model.ads.SplashInfo$RotationInfo;
import o56.c;
import o56.a;
import android.app.Application;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo;

public class s	// class@002445
{
    public boolean A;
    public boolean B;
    public int C;
    public String D;
    public boolean E;
    public SplashInfo$InteractionInfo F;
    public FallingEggsInfo G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public String M;
    public boolean N;
    public BaseFeed O;
    public boolean P;
    public SplashInfo$FloatingCardInfo Q;
    public Uri a;
    public int b;
    public int c;
    public long d;
    public boolean e;
    public String f;
    public long g;
    public String h;
    public int i;
    public String j;
    public int k;
    public Uri l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public String s;
    public int t;
    public String u;
    public String v;
    public boolean w;
    public boolean x;
    public boolean y;
    public String z;

    public void s(){
       super();
    }
    public static void a(b p0,s p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, s.class, "2")) {
          return;
       }
       p1.g = TimeUnit.SECONDS.toMillis((long)p0.a.mSplashAdDuration);
       p1.a = p0.c;
       b a = p0.a;
       p1.c = a.mMaterialHeight;
       p1.b = a.mMaterialWidth;
       p1.j = a.mSplashTouchControl;
       p1.i = a.mSplashShowControl;
       p1.u = a.mSharePrefixDesc;
       p1.v = a.mShareSuffixDesc;
       p1.w = a.mShowAvatarIcon;
       boolean b = false;
       boolean b1 = (a.mSplashInformationType == 2)? true: false;
       p1.y = b1;
       p1.z = a.mPersonalText;
       p1.A = a.mShowLiveIcon;
       p1.I = p0.d;
       SplashInfo mShadowInfo = a.mShadowInfo;
       b1 = (mShadowInfo != null && mShadowInfo.mHideTopShadow != null)? true: false;
       p1.K = b1;
       mShadowInfo = a.mAnimationInfo;
       if (mShadowInfo != null && mShadowInfo.mHideAlphaAnimation != null) {
          b = true;
       }
       p1.L = b;
       p1.G = a.mFallingEggsInfo;
       a = p0.b;
       p1.O = a;
       p1.P = l.l(a);
       p1.Q = p0.a.mFloatingCardInfo;
       return;
    }
    public static void b(b p0,s p1){
       p0 = p0.a;
       SplashInfo mBubbleInfo = p0.mBubbleInfo;
       if (mBubbleInfo != null) {
          p1.M = mBubbleInfo.mTitle;
          SplashInfo mInteraction = p0.mInteractionInfo;
          if (mInteraction != null) {
             SplashInfo$InteractionInfo mRotationInf = mInteraction.mRotationInfo;
             if (mRotationInf != null && mRotationInf.mImageUri != null) {
                p1.N = true;
             }
          }
       }
       return;
    }
    public static void c(b p0,s p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, s.class, "1")) {
          return;
       }
       p1.h = a.a().a().getString(0x7f104a5f);
       SplashInfo mLabelInfo = p0.a.mLabelInfo;
       if (mLabelInfo != null) {
          if (mLabelInfo.mHideLable != null) {
             p1.h = "";
          }else if(!TextUtils.x(mLabelInfo.mLableDescription)){
             p1.h = p0.a.mLabelInfo.mLableDescription;
          }
       }
       return;
    }
    public static void d(b p0,s p1){
       SplashInfo mSplashLogoI = p0.a.mSplashLogoInfo;
       if (mSplashLogoI != null) {
          p1.l = mSplashLogoI.mSplashLogoUri;
          p1.o = mSplashLogoI.mLogoHeight;
          p1.n = mSplashLogoI.mLogoWidth;
          p1.m = mSplashLogoI.mHideSplasshLogo;
       }
       return;
    }
    public static boolean e(s p0){
       s obj = PatchProxy.applyOneRefs(p0, null, s.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.F;
       boolean b = (obj != null && (obj.hasInteraction() && p0.P == null))? true: false;
       return b;
    }
    public static void f(b p0,s p1){
       SplashInfo$ClickButtonInfo mLiveActionB;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, s.class, "3")) {
          return;
       }
       if (!s.e(p1)) {
          boolean b = true;
          boolean b1 = (!TextUtils.x(p1.u) || !TextUtils.x(p1.v))? true: false;
          p1.x = b1;
          if (!b1) {
             SplashInfo mClickButton = p0.a.mClickButtonInfo;
             if (mClickButton != null) {
                p1.t = mClickButton.mButtonBottomMargin;
                p1.r = mClickButton.mButtonHeight;
                p1.q = mClickButton.mButtonWidth;
                if (p1.A != null) {
                   mLiveActionB = mClickButton.mLiveActionBarDescription;
                   p1.s = mLiveActionB;
                   if (TextUtils.x(mLiveActionB)) {
                      p1.s = a.b().getString(0x7f104a62);
                   }
                }else {
                   mLiveActionB = mClickButton.mButtonTitle;
                   p1.s = mLiveActionB;
                   if (TextUtils.x(mLiveActionB)) {
                      p1.s = a.b().getString(0x7f104a63);
                   }
                }
                p0 = p0.a;
                mClickButton = p0.mClickButtonInfo;
                p1.p = mClickButton.mButtonCornerRadius;
                SplashInfo$ClickButtonInfo mButtonStyle = mClickButton.mButtonStyle;
                p1.C = mButtonStyle;
                p1.D = mClickButton.mButtonColor;
                p1.B = mClickButton.mShowButton;
                if (mButtonStyle == 9) {
                   b = false;
                }
                p1.E = b;
                p1.J = p0.mShowLiveIcon;
             }
          }
       }
    label_0091 :
       return;
    }
}
