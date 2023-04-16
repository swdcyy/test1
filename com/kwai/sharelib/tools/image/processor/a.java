package com.kwai.sharelib.tools.image.processor.a;
import io.reactivex.i;
import java.lang.String;
import java.lang.Object;
import brd.c0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.KsShareApi;
import android.app.Application;
import android.content.Context;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.kwai.sharelib.tools.image.processor.a$a;
import com.bumptech.glide.request.target.Target;

public final class a implements i	// class@001701
{
    public final String a;

    public void a(String p0){
       this.a = p0;
       super();
    }
    public final void a(c0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Glide.with(KsShareApi.s.k()).asBitmap().load(this.a).into(new a$a(p0));
       return;
    }
}
