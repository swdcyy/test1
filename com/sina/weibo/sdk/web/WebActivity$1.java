package com.sina.weibo.sdk.web.WebActivity$1;
import com.sina.weibo.sdk.web.b.b$a;
import com.sina.weibo.sdk.web.WebActivity;
import java.lang.Object;
import com.sina.weibo.sdk.web.b.b;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.webkit.WebView;
import com.sina.weibo.sdk.web.a.b;

public final class WebActivity$1 implements b$a	// class@000bd8
{
    public final WebActivity au;

    public void WebActivity$1(WebActivity p0){
       this.au = p0;
       super();
    }
    public final void onComplete(){
       String url = WebActivity.a(this.au).getUrl();
       if (!TextUtils.isEmpty(url) && WebActivity.k(url)) {
          WebActivity.b(this.au).loadUrl(url);
       }
       return;
    }
    public final void onError(String p0){
       WebActivity.c(this.au).p(p0);
    }
}
