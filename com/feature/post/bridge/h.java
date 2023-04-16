package com.feature.post.bridge.h;
import erd.g;
import android.app.Activity;
import w69.i;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumParams;
import f55.g;
import java.lang.Object;
import r16.f;
import q46.r;
import x79.e;
import n3d.a$a;
import com.feature.post.bridge.a;
import n3d.a;

public final class h implements g	// class@00147c
{
    public final Activity b;
    public final i c;
    public final JsUploadVideoFromAlbumParams d;
    public final g e;

    public void h(Activity p0,i p1,JsUploadVideoFromAlbumParams p2,g p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       h tb = this.b;
       e.f().i(tb, this.c, 3, new a(this.d, this.e, p0, r.b(tb, p0)));
    }
}
