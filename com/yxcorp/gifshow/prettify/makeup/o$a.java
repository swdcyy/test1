package com.yxcorp.gifshow.prettify.makeup.o$a;
import hka.h;
import com.yxcorp.gifshow.prettify.makeup.o;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.makeup.b0;
import f1c.d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.yxcorp.gifshow.prettify.makeup.l;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import android.view.View;
import com.yxcorp.gifshow.prettify.makeup.e0;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$a;
import f1c.f0;

public class o$a implements h	// class@001190
{
    public final o b;

    public void o$a(o p0){
       this.b = p0;
       super();
    }
    public void a(Object p0){
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "1")) {
       }else {
          MakeupSuite makeupSuite = this.b.c.i().m1();
          if (makeupSuite != null) {
             if ((p0.mId).equals("-10000") || p0.isPreset()) {
                this.b.c.l();
             }else {
                this.b.c.h().i1(p0);
                this.b.c.n().l(this.b.c.h().h1());
                o c = this.b.c;
                c.f(c.h().g1());
                o$a tb = this.b;
                e0.d(tb.a, tb.c.n());
             }
             f0.g(makeupSuite, p0, this.b.c.p());
          }
       }
       return;
    }
}
