package com.yxcorp.gifshow.detail.article.imagepreview.q;
import io.reactivex.g;
import com.yxcorp.gifshow.detail.article.imagepreview.r;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import java.lang.Object;
import brd.v;
import android.content.Context;
import android.app.Activity;
import xw9.p;
import com.yxcorp.image.fresco.wrapper.a$g;
import com.yxcorp.image.fresco.wrapper.a;

public final class q implements g	// class@00135b
{
    public final r b;
    public final ImageRequest c;
    public final String d;

    public void q(r p0,ImageRequest p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       a.j(this.b.y.getApplicationContext(), this.c, this.d, new p(p0));
    }
}
