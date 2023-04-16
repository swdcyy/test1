package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.animation.AdWebCardAnimationDelegate;
import t09.a;
import android.view.View;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.animation.AdWebCardAnimationDelegate$mCommonAlphaAnim$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.animation.AdWebCardAnimationDelegate$mCommonTranslationYWithAlphaAnim$2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.animation.AdWebCardAnimationDelegate$mCommonTranslationYSameDirectionWithAlphaAnim$2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.animation.AdWebCardAnimationDelegate$mSlideTranslationAnim$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.util.i$c;
import com.kwai.robust.PatchProxyResult;
import t09.b;
import t09.e;
import t09.d;
import t09.c;

public final class AdWebCardAnimationDelegate extends a	// class@001631
{
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public int g;

    public void AdWebCardAnimationDelegate(){
       super(null, null);
    }
    public void AdWebCardAnimationDelegate(View p0,View p1){
       super(p0, p1);
       this.c = s.c(new AdWebCardAnimationDelegate$mCommonAlphaAnim$2(this));
       this.d = s.c(new AdWebCardAnimationDelegate$mCommonTranslationYWithAlphaAnim$2(this));
       this.e = s.c(new AdWebCardAnimationDelegate$mCommonTranslationYSameDirectionWithAlphaAnim$2(this));
       this.f = s.c(new AdWebCardAnimationDelegate$mSlideTranslationAnim$2(this));
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AdWebCardAnimationDelegate.class, "8")) {
          return;
       }
       this.d().a();
       return;
    }
    public void b(View p0,View p1,i$c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AdWebCardAnimationDelegate.class, "6")) {
          return;
       }
       this.d().b(p0, p1, p2);
       return;
    }
    public void c(View p0,View p1,i$c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AdWebCardAnimationDelegate.class, "7")) {
          return;
       }
       this.d().c(p0, p1, p2);
       return;
    }
    public final a d(){
       Object obj1;
       e value;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdWebCardAnimationDelegate uAdWebCardAn = AdWebCardAnimationDelegate.class;
       AdWebCardAnimationDelegate obj = PatchProxy.apply(null, this, uAdWebCardAn, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.g;
       if (obj != 1) {
          if (obj != 2) {
             if (obj != 3) {
                obj1 = PatchProxy.apply(null, this, uAdWebCardAn, "4");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = this.f.getValue();
                }
             }else {
                obj1 = PatchProxy.apply(null, this, uAdWebCardAn, "3");
                if (obj1 != patchProxyRe) {
                }else {
                   value = this.e.getValue();
                label_0043 :
                   obj1 = value;
                }
             }
          }else {
             obj1 = PatchProxy.apply(null, this, uAdWebCardAn, "2");
             if (obj1 != patchProxyRe) {
             }else {
                value = this.d.getValue();
                goto label_0043 ;
             }
          }
       }else {
          obj1 = PatchProxy.apply(null, this, uAdWebCardAn, "1");
          if (obj1 != patchProxyRe) {
          }else {
             value = this.c.getValue();
             goto label_0043 ;
          }
       }
       return obj1;
    }
}
