package com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$Companion;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.sharelib.jsshare.StartShareParam$ScreenShotConfigs;
import android.net.Uri;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.System;
import com.yxcorp.gifshow.share.platform.WechatForward;
import mhc.x;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import com.yxcorp.gifshow.share.platform.QQForward;
import com.yxcorp.gifshow.share.platform.QQForward$Companion;
import java.util.Objects;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$c;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$a;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$d;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$b;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$Companion$newInstance$2$1;
import msd.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion;

public final class ForwardPicSectionFragment$Companion	// class@001cec
{

    public void ForwardPicSectionFragment$Companion(){
       super();
    }
    public void ForwardPicSectionFragment$Companion(u p0){
       super();
    }
    public final ForwardPicSectionFragment a(GifshowActivity p0,StartShareParam$ScreenShotConfigs p1,Uri p2,boolean p3){
       ForwardPicSectionFragment obj;
       ForwardPicSectionFragment$a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport2(ForwardPicSectionFragment$Companion.class, "1")) {
          obj = PatchProxy.applyFourRefsWithListener(p0, p1, p2, Boolean.valueOf(p3), this, ForwardPicSectionFragment$Companion.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "activity");
       ForwardPicSectionFragment uForwardPicS = null;
       if ((System.currentTimeMillis() - ForwardPicSectionFragment.c1) - (long)0xea60 >= 0 && (WechatForward.n0.c().K() || QQForward.m0.c().K())) {
          obj = new ForwardPicSectionFragment(uForwardPicS);
          ForwardPicSectionFragment$Companion d1 = ForwardPicSectionFragment.d1;
          Objects.requireNonNull(d1);
          ForwardPicSectionFragment uForwardPicS1 = PatchProxy.applyOneRefs(p1, d1, ForwardPicSectionFragment$Companion.class, "2");
          if (uForwardPicS1 != patchProxyRe) {
          }else if(p1 != null){
             if (p1.mIsCustomPicture == null) {
                ForwardPicSectionFragment uForwardPicS2 = uForwardPicS;
             }
             if (p1 != null) {
                StartShareParam$ScreenShotConfigs mCustomImage = p1.mCustomImageBytes;
                if (mCustomImage != null) {
                   a.o(mCustomImage, "it.mCustomImageBytes");
                   uoa = new ForwardPicSectionFragment$a(mCustomImage);
                }else {
                   p1 = p1.mCustomImageUrl;
                   if (p1 != null) {
                      a.o(p1, "it.mCustomImageUrl");
                      uoa = new ForwardPicSectionFragment$d(p1);
                   }else {
                      uoa = uForwardPicS;
                   }
                }
                if (uoa != null) {
                   uForwardPicS = uoa;
                }
             }
          }
       label_0093 :
          uForwardPicS1 = uForwardPicS;
          if (uForwardPicS1 == null) {
             uForwardPicS1 = new ForwardPicSectionFragment$b(p2, p3);
          }
          obj.b1 = uForwardPicS1;
          ForwardGridSectionFragment.W0.c(p0, new ForwardPicSectionFragment$Companion$newInstance$2$1(obj));
          uForwardPicS = obj;
       }
       PatchProxy.onMethodExit(ForwardPicSectionFragment$Companion.class, "1");
       return uForwardPicS;
    }
}
