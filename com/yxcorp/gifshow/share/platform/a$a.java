package com.yxcorp.gifshow.share.platform.a$a;
import io.reactivex.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.platform.a$a$a;
import n3d.a;

public final class a$a implements g	// class@001c20
{
    public final GifshowActivity b;
    public final Intent c;
    public final OperationModel d;

    public void a$a(GifshowActivity p0,Intent p1,OperationModel p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.b.t1(this.c, 100, new a$a$a(this, p0));
       return;
    }
}
