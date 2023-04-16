package com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity$processTemplatesAndStartEdit$arg$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity;
import msd.a;
import brd.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import kotlin.jvm.internal.Ref$ObjectRef;
import ytc.c;
import io.reactivex.a;
import ytc.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import erd.a;

public final class PicTemplateEditorAlbumActivity$processTemplatesAndStartEdit$arg$1 extends Lambda implements l	// class@0012f9
{
    public final PicTemplateEditorAlbumActivity this$0;

    public void PicTemplateEditorAlbumActivity$processTemplatesAndStartEdit$arg$1(PicTemplateEditorAlbumActivity p0){
       this.this$0 = p0;
       super(1);
    }
    public final a invoke(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PicTemplateEditorAlbumActivity$processTemplatesAndStartEdit$arg$1 obj = PatchProxy.applyOneRefs(p0, this, PicTemplateEditorAlbumActivity$processTemplatesAndStartEdit$arg$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.this$0;
       Objects.requireNonNull(obj);
       a uoa = PatchProxy.applyOneRefs(p0, obj, PicTemplateEditorAlbumActivity.class, "7");
       if (uoa != patchProxyRe) {
       }else {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = null;
          a c = Functions.c;
          uoa = a.k(new c(obj, objectRef, p0)).n(Functions.d(), Functions.d(), c, c, c, new d(objectRef));
          a.o(uoa, "Completable\n      .creat\x20\x02dialog?.dismiss\(\)\n      }\x00");
       }
       return uoa;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
