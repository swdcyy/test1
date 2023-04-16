package e11.f;
import com.kuaishou.live.bottombar.component.widget.d;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import ag6.a;
import kotlin.jvm.internal.a;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.yxcorp.gifshow.image.KwaiImageView;
import e11.f$a;
import android.view.View$OnClickListener;
import z61.b;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import android.widget.ImageView;
import z61.l;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.airbnb.lottie.LottieAnimationView;
import e11.e;
import w4.k;

public final class f extends d	// class@002089
{
    public LiveLottieAnimationView k;
    public KwaiImageView l;

    public void f(){
       super();
    }
    public View C(Context p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(LayoutInflater.from(p0), 0x7f0d0a79, p1, false);
    }
    public void D(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.k = p0.findViewById(0x7f0a1aa9);
       this.l = p0.findViewById(0x7f0a1abc);
       p0.setOnClickListener(new f$a(this));
       return;
    }
    public void F(b p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "3")) {
          return;
       }
       a.p(p0, "item");
       LiveNormalBottomBarItem liveNormalBo = (!p0 instanceof LiveNormalBottomBarItem)? null: p0;
       if (liveNormalBo) {
          LiveNormalBottomBarItem mIconRes = liveNormalBo.mIconRes;
          int i = 0;
          if (mIconRes != null) {
             f tl = this.l;
             if (tl != null) {
                tl.setImageResource(mIconRes);
             }
             f tl1 = this.l;
             if (tl1 != null) {
                tl1.setVisibility(i);
             }
          }
          l mLottieAnima = liveNormalBo.mLottieAnimation;
          if (mLottieAnima != null) {
             int i1 = (!mLottieAnima.length)? 1: 0;
             if (i1 ^ 1) {
                CDNUrl mUrl = mLottieAnima[i].mUrl;
                if (!TextUtils.x(mUrl)) {
                   a.o(mUrl, "lottieUrl");
                   p0 = p0.mEnableBreathAnimator;
                   if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(mUrl, Boolean.valueOf(p0), this, uof, "5")) {
                      uof = this.k;
                      if (uof != null) {
                         uof.setAnimationFromUrl(mUrl);
                         uof.u();
                         uof.d(new e(uof, this, mUrl, p0));
                      }
                   }
                }
             }
          }
       }
    label_0072 :
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       super.a();
       f tk = this.k;
       if (tk != null) {
          if (tk.p()) {
             tk.f();
          }
          tk.u();
       }
       return;
    }
}
