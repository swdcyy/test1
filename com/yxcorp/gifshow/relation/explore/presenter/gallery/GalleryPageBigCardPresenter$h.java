package com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$h;
import erd.g;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter;
import java.lang.Object;
import ada.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import g7c.g;
import a7c.h;
import androidx.fragment.app.Fragment;

public final class GalleryPageBigCardPresenter$h implements g	// class@00182e
{
    public final GalleryPageBigCardPresenter b;

    public void GalleryPageBigCardPresenter$h(GalleryPageBigCardPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GalleryPageBigCardPresenter$h.class, "1")) {
       }else {
          GalleryPageBigCardPresenter$h tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, GalleryPageBigCardPresenter.class, "14")) {
             GalleryPageBigCardPresenter s = tb.s;
             if (s == null) {
                a.S("mPymkParams");
             }
             g og = s.v();
             GalleryPageBigCardPresenter z = tb.z;
             if (z == null) {
                a.S("mBaseFragment");
             }
             og.a(z, p0);
          }
       }
       return;
    }
}
