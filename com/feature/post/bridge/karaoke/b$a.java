package com.feature.post.bridge.karaoke.b$a;
import vxc.z;
import com.feature.post.bridge.karaoke.b;
import com.kuaishou.webkit.WebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.io.Serializable;
import com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeWrapperParam;
import og.l;
import java.lang.StringBuilder;
import java.lang.Object;
import q87.c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.feature.post.bridge.karaoke.KaraokeHelper;
import com.feature.post.bridge.karaoke.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import wh5.c;
import e17.i;
import lnc.a1;
import um6.h;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import yxa.b;
import r16.f;
import lnc.y6;
import brd.e0;
import brd.h;
import ng.b;
import og.k;
import ng.c;
import erd.g;
import crd.b;

public class b$a extends z	// class@0014a2
{
    public final YodaBaseWebView k;
    public final String l;
    public final String m;
    public final String n;
    public final b o;

    public void b$a(b p0,WebView p1,YodaBaseWebView p2,String p3,String p4,String p5){
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
       String str = "KaraokeBridgeFunction";
       l.D().s(str, "karaoke "+p0, objArray);
       Activity uActivity = this.e();
       if (!uActivity instanceof GifshowActivity) {
          Object[] objArray1 = new Object[i];
          l.D().w(str, "postVideo activity is not GifshowActivity", objArray1);
       }
       a uoa = new a(this);
       Objects.requireNonNull(KaraokeHelper.a);
       a.p(uActivity, "webViewActivity");
       a.p(p0, "paramsWrapper");
       a.p(uoa, "jsCallBack");
       if (!c.g()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
          uoa.f(a1.p(R.string.arg_RES_7f10054d));
       }else {
          LoadPolicy dIALOG = LoadPolicy.DIALOG;
          a0 uoa0 = b.r(h.class, dIALOG);
          a0.h(uoa0, y6.s(f.class, dIALOG)).A(new b(uActivity, p0, uoa), new c(uoa));
       }
       return;
    }
}
