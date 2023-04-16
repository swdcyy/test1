package com.feature.post.bridge.karaoke.d$a;
import vxc.z;
import com.feature.post.bridge.karaoke.d;
import com.kuaishou.webkit.WebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.io.Serializable;
import com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeListWrapperParam;
import og.l;
import java.lang.StringBuilder;
import java.lang.Object;
import q87.c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.feature.post.bridge.karaoke.KaraokeHelper;
import com.feature.post.bridge.karaoke.c;
import java.util.Objects;
import kotlin.jvm.internal.a;
import wh5.c;
import e17.i;
import lnc.a1;
import com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeListBridgeParams;
import um6.j;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import ng.d;
import og.k;
import ng.e;
import erd.g;
import crd.b;

public class d$a extends z	// class@0014a5
{
    public final YodaBaseWebView k;
    public final String l;
    public final String m;
    public final String n;
    public final d o;

    public void d$a(d p0,WebView p1,YodaBaseWebView p2,String p3,String p4,String p5){
       this.o = p0;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       super(p1);
    }
    public void i(Serializable p0){
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().s("KaraokeBridgeFunction", "karaoke "+p0, objArray);
       Activity uActivity = this.e();
       if (!uActivity instanceof GifshowActivity) {
          Object[] objArray1 = new Object[i];
          l.D().w("KaraokeBridgeFunction", "postVideo activity is not GifshowActivity", objArray1);
       }
       c uoc = new c(this);
       Objects.requireNonNull(KaraokeHelper.a);
       a.p(uActivity, "webViewActivity");
       a.p(p0, "paramsWrapper");
       a.p(uoc, "jsCallBack");
       if (!c.g()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
          uoc.f(a1.p(R.string.arg_RES_7f10054d));
       }else if(p0.getParams() == null){
          KaraokeHelper$KaraokeListBridgeParams params = p0.getParams();
          a.m(params);
          d uod = new d(params, uActivity, uoc);
          y6.s(j.class, LoadPolicy.DIALOG).R(uod, new e(uoc));
       }
       return;
    }
}
