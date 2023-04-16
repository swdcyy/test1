package com.yxcorp.gifshow.share.platform.QQForward$a$a;
import io.reactivex.g;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.platform.QQForward$a$a$c;
import com.yxcorp.gifshow.share.platform.QQForward$a$a$a;
import n3d.a;
import com.yxcorp.gifshow.share.platform.QQForward$a$a$b;
import java.lang.Runnable;
import ekd.k1;

public final class QQForward$a$a implements g	// class@001c11
{
    public final OperationModel b;
    public final GifshowActivity c;
    public final boolean d;
    public final Bundle e;

    public void QQForward$a$a(OperationModel p0,GifshowActivity p1,boolean p2,Bundle p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QQForward$a$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       QQForward$a$a$c uoa$a$c = new QQForward$a$a$c(this, p0);
       this.c.e(new QQForward$a$a$a(this, uoa$a$c));
       k1.o(new QQForward$a$a$b(this, uoa$a$c));
       return;
    }
}
