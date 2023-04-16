package com.feature.post.bridge.l;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.feature.bridge.JsSelectAndUploadMediaParams;
import f55.g;
import java.lang.Object;
import android.content.Intent;
import mg.a1;
import n3d.a;

public final class l implements g	// class@0014aa
{
    public final GifshowActivity b;
    public final JsSelectAndUploadMediaParams c;
    public final g d;

    public void l(GifshowActivity p0,JsSelectAndUploadMediaParams p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       l tb = this.b;
       tb.t1(p0, 6, new a1(tb, this.c, this.d));
    }
}
