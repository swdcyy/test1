package com.yxcorp.gifshow.webview.yoda.f;
import io.reactivex.g;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import brd.v;
import android.content.Context;
import xh7.b;
import myc.n;
import qh7.b;
import qh7.a;

public final class f implements g	// class@0017ae
{
    public final Activity b;
    public final String c;

    public void f(Activity p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       a.b(b.j(this.b, this.c), new n(p0));
    }
}
