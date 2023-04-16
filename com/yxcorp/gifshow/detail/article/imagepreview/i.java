package com.yxcorp.gifshow.detail.article.imagepreview.i;
import io.reactivex.g;
import com.yxcorp.gifshow.detail.article.imagepreview.r;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import java.lang.Object;
import brd.v;
import android.content.Context;
import android.app.Activity;
import xw9.q;
import com.yxcorp.image.fresco.wrapper.a$g;
import com.yxcorp.image.fresco.wrapper.a;

public final class i implements g	// class@001353
{
    public final r b;
    public final ImageRequest c;
    public final String d;

    public void i(r p0,ImageRequest p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       a.j(this.b.y.getApplicationContext(), this.c, this.d, new q(p0));
    }
}
