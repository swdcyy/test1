package com.sina.weibo.sdk.web.WebActivity$3;
import android.view.View$OnClickListener;
import com.sina.weibo.sdk.web.WebActivity;
import java.lang.Object;
import android.view.View;
import com.kuaishou.webkit.WebView;

public final class WebActivity$3 implements View$OnClickListener	// class@000bda
{
    public final WebActivity au;

    public void WebActivity$3(WebActivity p0){
       this.au = p0;
       super();
    }
    public final void onClick(View p0){
       WebActivity.d(this.au);
       WebActivity.b(this.au).reload();
    }
}
