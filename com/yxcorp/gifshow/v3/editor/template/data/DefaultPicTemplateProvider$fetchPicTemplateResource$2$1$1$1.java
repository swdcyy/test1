package com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.v;
import com.yxcorp.gifshow.fragment.ObservableBox$c;
import brd.g;

public final class DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$1 extends Lambda implements l	// class@001312
{
    public final DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1 this$0;

    public void DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$1(DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.floatValue());
       return l1.a;
    }
    public final void invoke(float p0){
       if (PatchProxy.isSupport(DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$1.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$1.class, "1")) {
          return;
       }
       DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1 $emit = this.this$0.$emit;
       a.o($emit, "emit");
       if (!$emit.isDisposed()) {
          ObservableBox$c uoc = new ObservableBox$c(null);
          uoc.c = (int)p0;
          this.this$0.$emit.onNext(uoc);
       }
       return;
    }
}
