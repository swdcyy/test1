package com.yxcorp.gifshow.ad.webview.half.c;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragment;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import uxc.g;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import p59.t;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import com.yxcorp.gifshow.ad.webview.jshandler.d;
import com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler;
import java.util.Objects;
import u09.i0;
import k59.e2;
import msd.a;
import zl9.b;
import r59.b;
import r59.i;
import java.util.ArrayList;
import ekd.j;
import java.util.Iterator;
import k59.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kuaishou.webkit.WebViewClient;
import r59.d;
import r59.f;
import r59.c;
import m59.o;
import yx.j0;
import wkd.b;
import k59.d2;
import l59.b;
import com.kuaishou.webkit.DownloadListener;

public class c implements WebViewFragment$b	// class@0018c4
{
    public final Activity b;
    public final BaseFeed c;
    public final String d;
    public final AdHalfWebFragment e;

    public void c(AdHalfWebFragment p0,Activity p1,BaseFeed p2,String p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
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
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "1")) {
          return;
       }
       p0.nh(8);
       boolean b = false;
       p0.jh(b);
       p1.setBackgroundColor(-1);
       p0.J = new t();
       c te = this.e;
       AdHalfWebFragment j = te.J;
       c tb = this.b;
       j.a = tb;
       j.b = p1;
       j.d = this.c;
       te.M = new g(p1, tb);
       te = this.e;
       d.a(te.M, te.J, this.d);
       te = this.e;
       AdHalfWebFragment n = te.N;
       Objects.requireNonNull(n);
       te.Q = new RegisterWebViewDidShowHandler(te.J, new i0(n));
       te = this.e;
       te.M.g(te.Q, true);
       te = this.e;
       te.O = new b();
       te.P = new i(te.J);
       te = this.e;
       j = te.M;
       b[] uobArray = new b[]{te.O,te.P};
       ArrayList uArrayList = j.a(uobArray);
       if (!PatchProxy.applyVoidTwoRefs(j, uArrayList, this, uoc, "2")) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             j.f(iterator.next());
          }
       }
       a.a(this.e.M, p1);
       WebViewClient webViewClien = p1.getWebViewClient();
       uoc = this.e;
       uoc.R = new d();
       if (uoc.N.j()) {
          this.e.R.k(new f());
       }else {
          uoc = this.e;
          uoc.R.k(uoc.O);
          uoc = this.e;
          uoc.R.k(uoc.P);
       }
       if (webViewClien instanceof o) {
          uoc = this.e;
          uoc.L = webViewClien;
          webViewClien.O(uoc.N);
          te = this.e;
          te.L.M(te.R);
       }else {
          Object[] objArray = new Object[b];
          j0.c("AdHalfDialogWeb", "webclient is not PhotoAdvertisementWebViewClient", objArray);
       }
       p1.setDownloadListener(b.a(0xb238bc2).b(this.b, this.c, p1, this.e.L));
       return;
    }
}
