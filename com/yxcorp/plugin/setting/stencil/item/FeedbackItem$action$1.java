package com.yxcorp.plugin.setting.stencil.item.FeedbackItem$action$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.plugin.setting.stencil.item.FeedbackItem;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import oe6.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import ihc.a;
import jyc.b;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.app.Activity;
import com.yxcorp.gifshow.webview.e;

public final class FeedbackItem$action$1 extends Lambda implements l	// class@000913
{
    public final FeedbackItem this$0;

    public void FeedbackItem$action$1(FeedbackItem p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedbackItem$action$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       FeedbackItem$action$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tthis$0, FeedbackItem.class, str)) {
          String str1 = b.v();
          if (str1 != null) {
             if (!TextUtils.x(str1)) {
                objArray = str1;
             }
             if (objArray != null) {
             label_0031 :
                a c = tthis$0.c;
                a.m(objArray);
                e.d(c, KwaiWebViewActivity.N3(c, b.e(objArray, 1)).m("KEY_ENABLE_SWIPE_BACK", 1).o("ks://feedback").a());
             }
          }
          objArray = WebEntryUrls.d;
          goto label_0031 ;
       }
       return;
    }
}
