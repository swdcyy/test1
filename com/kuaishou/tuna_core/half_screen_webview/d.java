package com.kuaishou.tuna_core.half_screen_webview.d;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment;
import android.os.Bundle;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import jyc.b;
import wz4.e;
import uxc.b;
import wz4.d;
import uxc.a;
import wz4.j;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;

public final class d implements DialogContainerFragment$b	// class@0010c7
{
    public final CommercialDialogWebFragment a;
    public final Bundle b;

    public void d(CommercialDialogWebFragment p0,Bundle p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Fragment a(){
       d ta = this.a;
       d tb = this.b;
       Objects.requireNonNull(ta);
       String str = tb.getString("WebUrl");
       String str1 = tb.getString("PageUri");
       KwaiYodaWebViewFragment kwaiYodaWebV = PatchProxy.applyTwoRefs(str, str1, ta, CommercialDialogWebFragment.class, "12");
       if (kwaiYodaWebV != PatchProxyResult.class) {
       }else {
          kwaiYodaWebV = new KwaiYodaWebViewFragment();
          Intent intent = KwaiWebViewActivity.N3(ta.H, str).o(str1).a();
          intent.putExtra("KEY_THEME", b.b(str));
          intent.putExtra("config", ta.getArguments());
          kwaiYodaWebV.setArguments(intent.getExtras());
          kwaiYodaWebV.kh(new e(ta));
          kwaiYodaWebV.gh(new d(ta));
          kwaiYodaWebV.ch(new j(ta, kwaiYodaWebV));
       }
       return kwaiYodaWebV;
    }
}
