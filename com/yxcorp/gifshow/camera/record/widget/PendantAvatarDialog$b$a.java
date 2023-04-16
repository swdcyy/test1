package com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog$b$a;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog$b$a$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class PendantAvatarDialog$b$a implements g	// class@000fca
{
    public final String b;
    public final int c;
    public final int d;

    public void PendantAvatarDialog$b$a(String p0,int p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantAvatarDialog$b$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(Uri.parse(this.b));
       imageRequest.v(new d(this.c, this.d));
       a.d(imageRequest.a(), new PendantAvatarDialog$b$a$a(p0));
       return;
    }
}
