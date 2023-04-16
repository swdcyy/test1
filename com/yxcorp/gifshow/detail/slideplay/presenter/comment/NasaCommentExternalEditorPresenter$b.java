package com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$b;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.comment.utils.e;
import nx9.c;
import java.util.Objects;
import d4d.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.plugin.emotion.append.AppendedWidget;

public final class NasaCommentExternalEditorPresenter$b extends a	// class@00184e
{
    public final NasaCommentExternalEditorPresenter b;

    public void NasaCommentExternalEditorPresenter$b(NasaCommentExternalEditorPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, NasaCommentExternalEditorPresenter$b.class, "1")) {
          return;
       }
       k1.n(this.b);
       NasaCommentExternalEditorPresenter$b tb = this.b;
       NasaCommentExternalEditorPresenter w = tb.w;
       if (w != null) {
          w.e = null;
       }
       NasaCommentExternalEditorPresenter.P8(tb).b();
       this.b.R8();
       if (c.a()) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, NasaCommentExternalEditorPresenter.class, "6")) {
             a g = a.g;
             NasaCommentExternalEditorPresenter q = tb.q;
             if (q == null) {
                a.S("mPhoto");
             }
             String photoId = q.getPhotoId();
             Objects.requireNonNull(g);
             if (!PatchProxy.applyVoidOneRefs(photoId, g, a.class, "9")) {
                AppendedWidget d = a.d;
                String id = (d != null)? d.getId(): null;
                if (a.g(id, photoId)) {
                   a.d = null;
                }
                a.e = null;
                a.f = null;
             }
          }
       }
       return;
    }
}
