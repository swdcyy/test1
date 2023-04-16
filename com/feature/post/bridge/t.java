package com.feature.post.bridge.t;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.webview.bridge.JsVideoAuthenticationParams;
import java.lang.String;
import f55.g;
import java.lang.Object;
import om6.o;
import mg.s1;
import java.io.Serializable;
import n3d.a;

public final class t implements g	// class@0014bb
{
    public final GifshowActivity b;
    public final JsVideoAuthenticationParams c;
    public final String d;
    public final g e;

    public void t(GifshowActivity p0,JsVideoAuthenticationParams p1,String p2,int p3,g p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p4;
    }
    public final void accept(Object p0){
       p0.AF(this.b, this.c, this.d, 8, new s1(8, this.e));
    }
}
