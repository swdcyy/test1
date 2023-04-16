package com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity;
import msd.a;
import brd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import ekd.p0;

public final class PicTemplateEditorAlbumActivity$onCreate$1 extends Lambda implements l	// class@0012f8
{
    public final PicTemplateEditorAlbumActivity this$0;

    public void PicTemplateEditorAlbumActivity$onCreate$1(PicTemplateEditorAlbumActivity p0){
       this.this$0 = p0;
       super(1);
    }
    public final a invoke(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateEditorAlbumActivity$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       if (p0.F(this.this$0)) {
          p0.invoke();
          p0 = a.g();
          a.o(p0, "Completable.complete\(\)");
       }else {
          p0 = a.g();
          a.o(p0, "Completable.complete\(\)");
       }
       return p0;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
