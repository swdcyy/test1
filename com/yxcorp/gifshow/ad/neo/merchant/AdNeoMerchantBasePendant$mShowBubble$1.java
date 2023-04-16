package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mShowBubble$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle$State;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import android.view.View;
import com.kwai.library.widget.popup.bubble.a$c;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mShowBubble$1$a;
import java.lang.Runnable;
import ekd.k1;

public final class AdNeoMerchantBasePendant$mShowBubble$1 extends Lambda implements l	// class@001798
{
    public final AdNeoMerchantBasePendant this$0;

    public void AdNeoMerchantBasePendant$mShowBubble$1(AdNeoMerchantBasePendant p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       AdNeoMerchantBasePendant a;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoMerchantBasePendant$mShowBubble$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       AdNeoMerchantBasePendant$mShowBubble$1 tthis$0 = this.this$0;
       if (tthis$0.a != null) {
          Activity uActivity = tthis$0.b();
          Lifecycle$State state = null;
          if (!uActivity instanceof GifshowActivity) {
             uActivity = state;
          }
          if (uActivity != null) {
             Lifecycle lifecycle = uActivity.getLifecycle();
             if (lifecycle != null) {
                state = lifecycle.getCurrentState();
             }
          }
          if (state == Lifecycle$State.RESUMED) {
             a uoa = new a(this.this$0.b());
             uoa.K0(KwaiBubbleOption.e);
             a = this.this$0.a;
             a.m(a);
             uoa.o0(a);
             uoa.v0(0);
             uoa.F0(p0);
             uoa.T(3000);
             AdNeoMerchantBasePendant$mShowBubble$1$a omShowBubble = new AdNeoMerchantBasePendant$mShowBubble$1$a(uoa);
             k1.p(omShowBubble, this.this$0);
          }
       }
       return;
    }
}
