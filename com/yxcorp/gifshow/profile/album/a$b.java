package com.yxcorp.gifshow.profile.album.a$b;
import erd.g;
import com.yxcorp.gifshow.profile.album.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.net.Uri;
import android.os.Bundle;
import java.lang.Object;
import v26.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.album.ProfileImageSelectSupplier$openImageCropActivity$2$1;
import w1c.a;
import msd.q;
import n3d.a;

public final class a$b implements g	// class@001212
{
    public final a b;
    public final GifshowActivity c;
    public final Uri d;
    public final int e;
    public final Bundle f;

    public void a$b(a p0,GifshowActivity p1,Uri p2,int p3,Bundle p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, a$b.class, "1")) {
       }else {
          a.p(obj, "plugin");
          obj.CG(this.c, this.d, this.e, this.f, new a(new ProfileImageSelectSupplier$openImageCropActivity$2$1(this.b)));
       }
       return;
    }
}
