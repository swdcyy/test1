package com.kuaishou.live.core.show.wealthgrade.LiveWealthGradWebViewFragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import lnc.a1;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.graphics.Typeface;
import o56.c;
import o56.a;
import android.app.Application;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kuaishou.webkit.WebView;

public class LiveWealthGradWebViewFragment extends KwaiYodaWebViewFragment	// class@001250
{

    public void LiveWealthGradWebViewFragment(){
       super();
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveWealthGradWebViewFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.q.l.i(R.drawable.arg_RES_7f0820aa);
       TextView titleTextVie = this.q.l.getTitleTextView();
       if (titleTextVie != null) {
          if (titleTextVie instanceof EmojiTextView) {
             titleTextVie.setInitTextSize(TypedValue.applyDimension(2, 16.00f, c.c(a1.c().getResources())));
          }
          titleTextVie.setTypeface(null, 0);
          titleTextVie.setTextColor(a.a().a().getResources().getColor(R.color.arg_RES_7f0601cb));
       }
       this.Ch().setBackgroundColor(a1.a(R.color.arg_RES_7f061d74));
       return;
    }
}
