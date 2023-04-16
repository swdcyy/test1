package com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateResource$2$1;
import io.reactivex.g;
import ztc.f;
import java.lang.Long;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.a;

public final class DefaultPicTemplateProvider$fetchPicTemplateResource$2$1 implements g	// class@001315
{
    public final f b;
    public final Long c;

    public void DefaultPicTemplateProvider$fetchPicTemplateResource$2$1(f p0,Long p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultPicTemplateProvider$fetchPicTemplateResource$2$1.class, "1")) {
          return;
       }
       a.p(p0, "emit");
       a.h(null, new DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1(this, p0, null), 1, null);
       return;
    }
}
