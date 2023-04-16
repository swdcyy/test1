package com.yxcorp.gifshow.detail.article.ArticleWebviewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.detail.article.ArticleWebviewFragment;
import java.lang.Object;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import uxc.g;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.yxcorp.gifshow.webview.api.WebViewFragment;

public class ArticleWebviewFragment$a implements WebViewFragment$b	// class@001344
{
    public final ArticleWebviewFragment b;

    public void ArticleWebviewFragment$a(ArticleWebviewFragment p0){
       this.b = p0;
       super();
    }
    public WebViewFragment$d C1(){
       return g.a(this);
    }
    public boolean J(WebView p0,String p1){
       return g.d(this, p0, p1);
    }
    public String T1(){
       return g.c(this);
    }
    public void w1(WebViewFragment p0,WebView p1){
       g.b(this, p0, p1);
    }
}
