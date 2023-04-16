package com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity$c;
import om6.k$a;
import com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$a;
import com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity$processTemplatesAndStartEdit$arg$1;
import android.content.Context;
import java.util.List;
import msd.l;
import nsd.u;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter;
import brd.m;
import brd.a;
import brd.e;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$processDownloadResource$1;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$c;
import ytc.k;
import io.reactivex.e;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable;
import brd.q;
import ird.a;
import t45.d;
import brd.z;
import ytc.g;
import brd.p;

public final class PicTemplateEditorAlbumActivity$c implements k$a	// class@0012f7
{
    public final PicTemplateEditorAlbumActivity a;

    public void PicTemplateEditorAlbumActivity$c(PicTemplateEditorAlbumActivity p0){
       this.a = p0;
       super();
    }
    public final void a(Intent p0){
       PicTemplatePageParamBuilderPresenter a;
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateEditorAlbumActivity$c.class, "1")) {
          return;
       }
       PicTemplateEditorAlbumActivity$c ta = this.a;
       a.o(p0, "it");
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, PicTemplateEditorAlbumActivity.class, "10")) {
          PicTemplateEditorAlbumActivity v = ta.V;
          if (v == null) {
             a.S("mTemplateIdList");
          }
          PicTemplatePageParamBuilderPresenter$a uoa = new PicTemplatePageParamBuilderPresenter$a(ta, v, ta.W, false, false, new PicTemplateEditorAlbumActivity$processTemplatesAndStartEdit$arg$1(ta), 16, null);
          PicTemplateEditorAlbumActivity u = ta.U;
          Objects.requireNonNull(u);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          m om = PatchProxy.applyOneRefs(v10, u, PicTemplatePageParamBuilderPresenter.class, "7");
          if (om != patchProxyRe) {
          }else {
             a.p(v10, "arg");
             a uoa1 = a.g();
             a = u.a;
             a uoa2 = PatchProxy.applyTwoRefs(v10, a, u, PicTemplatePageParamBuilderPresenter.class, "8");
             if (uoa2 != patchProxyRe) {
             }else {
                uoa2 = a.z(new PicTemplatePageParamBuilderPresenter$processDownloadResource$1(u, v10, a));
                a.o(uoa2, "Completable.wrap { up ->¡­\)\n        }\n      }\n    }");
             }
             uoa1 = uoa1.b(uoa2);
             a = u.a;
             m om1 = PatchProxy.applyTwoRefs(v10, a, u, PicTemplatePageParamBuilderPresenter.class, "9");
             if (om1 != patchProxyRe) {
             }else {
                om1 = m.f(new k(a, v10));
                a.o(om1, "Maybe.create {\n      val¡­am.build\(\)\)\n      }\n    }");
             }
             Objects.requireNonNull(uoa1);
             a.c(om1, "next is null");
             om = a.g(new MaybeDelayWithCompletable(om1, uoa1));
             a.o(om, "Completable.complete\(\)\n ¡­\(processParams\(arg, out\)\)");
          }
          om.u(d.a).b(new g(ta, p0, v10));
       }
       return;
    }
}
