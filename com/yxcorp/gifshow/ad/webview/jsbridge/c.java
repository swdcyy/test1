package com.yxcorp.gifshow.ad.webview.jsbridge.c;
import io.reactivex.g;
import android.app.Activity;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import java.lang.Object;
import brd.v;
import android.content.Context;
import o59.n;
import com.yxcorp.image.fresco.wrapper.a$g;
import com.yxcorp.image.fresco.wrapper.a;

public final class c implements g	// class@0018cc
{
    public final Activity b;
    public final ImageRequest c;
    public final String d;

    public void c(Activity p0,ImageRequest p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       a.j(this.b.getApplicationContext(), this.c, this.d, new n(p0));
    }
}
