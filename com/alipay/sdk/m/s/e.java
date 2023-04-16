package com.alipay.sdk.m.s.e;
import android.widget.LinearLayout;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import s6.a;
import com.alipay.sdk.m.s.e$d;
import android.util.AttributeSet;
import com.alipay.sdk.m.s.e$a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.widget.ImageView$ScaleType;
import java.lang.String;
import android.graphics.drawable.Drawable;
import u6.h;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.widget.ProgressBar;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebSettings;
import com.kuaishou.webkit.WebSettings$RenderPriority;
import java.io.File;
import com.kuaishou.webkit.WebSettings$TextSize;
import v6.c;
import com.kuaishou.webkit.DownloadListener;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.Method;
import com.alipay.sdk.m.s.c;
import com.alipay.sdk.m.s.e$e;
import com.alipay.sdk.m.s.e$f;
import com.kuaishou.webkit.WebViewClient;
import com.kuaishou.webkit.WebChromeClient;
import java.lang.StringBuilder;
import com.alipay.sdk.m.q.b;
import com.alipay.sdk.m.s.e$b;
import com.alipay.sdk.m.s.e$c;
import com.alipay.sdk.m.s.e$g;

public class e extends LinearLayout	// class@000eb3
{
    public ImageView b;
    public TextView c;
    public ImageView d;
    public ProgressBar e;
    public WebView f;
    public final e$d g;
    public e$e h;
    public e$f i;
    public e$g j;
    public final a k;
    public View$OnClickListener l;
    public final float m;
    public static Handler n;

    static {
       e.n = new Handler(Looper.getMainLooper());
    }
    public void e(Context p0,a p1,e$d p2){
       AttributeSet uAttributeSe = null;
       super(p0, uAttributeSe);
       this.l = new e$a(this);
       this.g = p2;
       this.k = p1;
       this.m = c.c(p0.getResources()).density;
       int i = 1;
       this.setOrientation(i);
       LinearLayout linearLayout = new LinearLayout(p0);
       int i1 = -218103809;
       linearLayout.setBackgroundColor(i1);
       linearLayout.setOrientation(0);
       linearLayout.setGravity(16);
       int i2 = (p2.a != null)? 0: 8;
       linearLayout.setVisibility(i2);
       ImageView imageView = new ImageView(p0);
       this.b = imageView;
       imageView.setOnClickListener(this.l);
       this.b.setScaleType(ImageView$ScaleType.CENTER);
       this.b.setImageDrawable(h.a("iVBORw0KGgoAAAANSUhEUgAAAEgAAABIBAMAAACnw650AAAAFVBMVEUAAAARjusRkOkQjuoRkeoRj+oQjunya570AAAABnRSTlMAinWeSkk7CjRNAAAAZElEQVRIx+3MOw6AIBQF0YsrMDGx1obaLeGH/S9BQgkJ82rypp4ceTN1ilvyKizmZIAyU7FML0JVYig55BBAfQ2EU4V4CpZJ+2AiSj11C6rUoTannBpRn4W6xNQjLBSI2+TN0w/+3HT2wPClrQAAAABJRU5ErkJggg==", p0));
       this.b.setPadding(this.a(12), 0, this.a(12), 0);
       linearLayout.addView(this.b, new LinearLayout$LayoutParams(-2, -2));
       View view = new View(p0);
       view.setBackgroundColor(-2500135);
       linearLayout.addView(view, new LinearLayout$LayoutParams(this.a(i), this.a(25)));
       TextView textView = new TextView(p0);
       this.c = textView;
       textView.setTextColor(-15658735);
       this.c.setTextSize(17.00f);
       this.c.setMaxLines(i);
       this.c.setEllipsize(TextUtils$TruncateAt.END);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, -2);
       layoutParams.setMargins(this.a(17), 0, 0, 0);
       layoutParams.weight = 0x3f800000;
       linearLayout.addView(this.c, layoutParams);
       imageView = new ImageView(p0);
       this.d = imageView;
       imageView.setOnClickListener(this.l);
       this.d.setScaleType(ImageView$ScaleType.CENTER);
       this.d.setImageDrawable(h.a("iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAMAAABiM0N1AAAAmVBMVEUAAAARj+oQjuoRkOsVk/AQj+oRjuoQj+oSkO3///8Rj+kRj+oQkOsTk+whm/8Qj+oRj+oQj+oSkus2p/8QjuoQj+oQj+oQj+oQj+oRj+oTkuwRj+oQj+oRj+oRj+oSkOsSkO0ZlfMbk+8XnPgQj+oRj+oQj+oQj+sSj+sRkOoSkescqv8Rj+oQj+oSj+sXku4Rj+kQjuoQjumXGBCVAAAAMnRSTlMAxPtPF8ry7CoB9npbGwe6lm0wBODazb1+aSejm5GEYjcTDwvls6uJc0g/CdWfRCF20AXrk5QAAAJqSURBVFjD7ZfXmpswEIUFphmDCxi3talurGvm/R8uYSDe5FNBwlzsxf6XmvFBmiaZ/PCdWDk9CWn61OhHCMAaXfoRAth7wx6EkMXnWyrho4yg4bDpquI8Jy78Q7eoj9cmUFijsaLM0JsD9CD0uQAa9aNdPuCFvbA7B9t/Becap8Pu6Q/2jcyH81VHc/WCHDQZXwbvtUhQ61iDlqadncU6Rp31yGkZIzOAu7AjtPpYGREzq/pY5DRFHS1siyO6HfkOKTrMjdb2qevV4zosK7MbkFY2LmYk55hL6juCIFWMOI2KGzblmho3b18EIbxL1hs6r5m2Q2WaEElwS3NW4xh6ZZJuzTtUsBKT4G0h35s4y1mNgkNoS6TZ8SKBXTZQGBNYdPTozXGYKoyLAmOasttjThT4xT6Ch+2qIjRhV9Ja3NC87Kyo5We1vCNEMW1T+j1VLZ9UhE54Q1DL52r5piJ0YxdegvWlHOwTu76uKkJX+MOTHno4YFSEbHYdhViojsLrCTg/MKnhKWaEYzvkZFM8aOkPH7iTSvoFZKD7jGEJbarkRaxQyOeWvGVIbsji152jK7TbDgRzcIuz7SGj89BFU8d30TqWeDtrILxyTkD1IXfvmHseuU3lVHDz607bw0f3xDqejm5ncd0j8VDwfoibRy8RcgTkWHBvocbDbMlJsQAkGnAOHwGy90kLmQY1Wkob07/GaCNRIzdoWK7/+6y/XkLDJCcynOGFuUrKIMuCMonNr9VpSOQoIxBgJ0SacGbzZNy4ICrkscvU2fpElYz+U3sd+aQThjfVmjNa5i15kLcojM3Gz8kP34jf4VaV3X55gNEAAAAASUVORK5CYII=", p0));
       this.d.setPadding(this.a(12), 0, this.a(12), 0);
       linearLayout.addView(this.d, new LinearLayout$LayoutParams(-2, -2));
       this.addView(linearLayout, new LinearLayout$LayoutParams(-1, this.a(48)));
       ProgressBar progressBar = new ProgressBar(p0, uAttributeSe, 0x103001f);
       this.e = progressBar;
       progressBar.setProgressDrawable(p0.getResources().getDrawable(0x108006c));
       this.e.setMax(100);
       this.e.setBackgroundColor(i1);
       this.addView(this.e, new LinearLayout$LayoutParams(-1, this.a(2)));
       WebView webView = new WebView(p0);
       this.f = webView;
       webView.setVerticalScrollbarOverlay(i);
       this.c(this.f, p0);
       WebSettings settings = this.f.getSettings();
       settings.setRenderPriority(WebSettings$RenderPriority.HIGH);
       settings.setSupportMultipleWindows(i);
       settings.setUseWideViewPort(i);
       settings.setAppCacheMaxSize(0x500000);
       settings.setAppCachePath(p0.getCacheDir().getAbsolutePath());
       settings.setAllowFileAccess(0);
       settings.setTextSize(WebSettings$TextSize.NORMAL);
       settings.setAllowFileAccessFromFileURLs(0);
       settings.setAllowUniversalAccessFromFileURLs(0);
       settings.setAppCacheEnabled(i);
       settings.setJavaScriptEnabled(i);
       settings.setSavePassword(0);
       settings.setJavaScriptCanOpenWindowsAutomatically(i);
       settings.setCacheMode(i);
       settings.setDomStorageEnabled(i);
       settings.setAllowContentAccess(0);
       this.f.setVerticalScrollbarOverlay(i);
       e tf = this.f;
       c uoc = new c(this, p0);
       try{
          tf.setDownloadListener(uoc);
          this.f.removeJavascriptInterface("searchBoxJavaBridge_");
          this.f.removeJavascriptInterface("accessibility");
          this.f.removeJavascriptInterface("accessibilityTraversal");
       }catch(java.lang.Exception e0){
          Class[] uClassArray = new Class[0];
          Method method = this.f.getClass().getMethod("removeJavascriptInterface", uClassArray);
          if (method != null) {
             Object[] objArray = new Object[i];
             objArray[0] = "searchBoxJavaBridge_";
             method.invoke(this.f, objArray);
             Object[] objArray1 = new Object[i];
             objArray1[0] = e0;
             method.invoke(this.f, objArray1);
             Object[] objArray2 = new Object[i];
             objArray2[0] = "accessibilityTraversal";
             method.invoke(this.f, objArray2);
          }
       }
       c.j(this.f);
       this.addView(this.f, new LinearLayout$LayoutParams(-1, -1));
       return;
    }
    public static ProgressBar e(e p0){
       return p0.e;
    }
    public static e$e f(e p0){
       return p0.h;
    }
    public static e$f g(e p0){
       return p0.i;
    }
    public final int a(int p0){
       return (int)((float)p0 * this.m);
    }
    public void b(){
       this.removeAllViews();
       this.f.removeAllViews();
       this.f.setWebViewClient(null);
       this.f.setWebChromeClient(null);
       this.f.destroy();
    }
    public void c(WebView p0,Context p1){
       p0.getSettings().setUserAgentString(p0.getSettings().getUserAgentString()+" \("+b.q()+";"+b.o()+";"+b.m(p1)+";"+";"+b.r(p1)+"\)"+"\(sdk android\)");
    }
    public void d(String p0){
       this.f.loadUrl(p0);
       c.j(this.f);
    }
    public ImageView getBackButton(){
       return this.b;
    }
    public ProgressBar getProgressbar(){
       return this.e;
    }
    public ImageView getRefreshButton(){
       return this.d;
    }
    public TextView getTitle(){
       return this.c;
    }
    public String getUrl(){
       return this.f.getUrl();
    }
    public WebView getWebView(){
       return this.f;
    }
    public void setChromeProxy(e$e p0){
       this.h = p0;
       if (p0 == null) {
          this.f.setWebChromeClient(null);
       }else {
          this.f.setWebChromeClient(new e$b(this));
       }
       return;
    }
    public void setWebClientProxy(e$f p0){
       this.i = p0;
       if (p0 == null) {
          this.f.setWebViewClient(null);
       }else {
          this.f.setWebViewClient(new e$c(this));
       }
       return;
    }
    public void setWebEventProxy(e$g p0){
       this.j = p0;
    }
}
