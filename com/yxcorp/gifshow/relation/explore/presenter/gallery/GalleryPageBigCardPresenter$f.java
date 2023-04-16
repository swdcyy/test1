package com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$f;
import erd.g;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter;
import java.lang.Object;
import iac.z;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.framework.model.user.RecoUser;
import e17.i;
import com.kwai.framework.model.user.User;
import f7c.c;
import qvb.a;
import java.util.List;
import bac.p;
import qvb.n0;
import java.lang.Integer;
import xl8.b;
import io.reactivex.subjects.PublishSubject;

public final class GalleryPageBigCardPresenter$f implements g	// class@00182c
{
    public final GalleryPageBigCardPresenter b;

    public void GalleryPageBigCardPresenter$f(GalleryPageBigCardPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       GalleryPageBigCardPresenter q;
       z a;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, GalleryPageBigCardPresenter$f.class, "1")) {
       }else {
          a.p(p0, "event");
          GalleryPageBigCardPresenter$f tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, GalleryPageBigCardPresenter.class, "11")) {
             tb.e9(p0.b);
             if (p0.a.mUser != null) {
                i.a(R.style.arg_RES_7f11066a, 0x7f1039c8);
                q = tb.q;
                if (q == null) {
                   a.S("mPymkListener");
                }
                a = p0.a;
                RecoUser mUser = a.mUser;
                q.Ad(a, mUser, mUser.mPosition);
             }else {
                q = tb.p;
                if (q == null) {
                   a.S("mPageList");
                }
                q.remove(p0.a);
             }
             q = tb.A;
             if (q != null) {
                GalleryPageBigCardPresenter p = tb.p;
                if (p == null) {
                   a.S("mPageList");
                }
                q.N0(p.getItems(), p0.b);
             }
             q = tb.p;
             if (q == null) {
                a.S("mPageList");
             }
             if (!q.getCount()) {
                p0 = tb.p;
                if (p0 == null) {
                   a.S("mPageList");
                }
                if (!p0.hasMore() && tb.w == null) {
                   tb.h9();
                }
             }else {
                q = tb.Q;
                a = p0.b;
                GalleryPageBigCardPresenter p1 = tb.p;
                if (p1 == null) {
                   a.S("mPageList");
                }
                if (a < p1.getCount()) {
                   p0 = p0.b;
                }else {
                   p0 = tb.p;
                   if (p0 == null) {
                      a.S("mPageList");
                   }
                   i = p0.getCount() - 1;
                }
                q.d(Integer.valueOf(p0));
                p0 = tb.r;
                if (p0 == null) {
                   a.S("mButtonSubject");
                }
                p0.onNext(Integer.valueOf(5));
             }
          }
       }
       return;
    }
}
