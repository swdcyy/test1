package com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.ja;
import java.util.Objects;
import xl8.b;
import java.lang.Number;
import com.kwai.framework.model.user.RecoUser;
import bac.p;
import com.yxcorp.gifshow.pymk.f;
import a7c.h;
import org.json.JSONObject;
import com.kwai.framework.model.user.User;
import g7c.i;
import gbc.b;

public final class GalleryPageBigCardPresenter$c extends m	// class@001829
{
    public final GalleryPageBigCardPresenter c;

    public void GalleryPageBigCardPresenter$c(GalleryPageBigCardPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       GalleryPageBigCardPresenter obj;
       GalleryPageBigCardPresenter s;
       if (PatchProxy.applyVoidOneRefs(p0, this, GalleryPageBigCardPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "v");
       ja.a();
       GalleryPageBigCardPresenter$c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, GalleryPageBigCardPresenter.class, "23")) {
          obj = tc.A;
          if (obj != null) {
             RecoUser obj1 = tc.Q.a();
             a.o(obj1, "mSelectionPosition.value");
             RecoUser recoUser = obj.M0(obj1.intValue());
             if (recoUser != null) {
                obj1 = recoUser.mUser;
                if (obj1 != null) {
                   obj = tc.s;
                   if (obj == null) {
                      a.S("mPymkParams");
                   }
                   f r = obj.s().r;
                   s = tc.s;
                   if (s == null) {
                      a.S("mPymkParams");
                   }
                   i.b(obj1, r, s.k(), "replace");
                }else if(tc.c9(recoUser)){
                   s = tc.s;
                   if (s == null) {
                      a.S("mPymkParams");
                   }
                   b.e("OPEN_CONTACTS_CARD", s.s().r, "replace");
                }else if(tc.d9(recoUser)){
                   s = tc.s;
                   if (s == null) {
                      a.S("mPymkParams");
                   }
                   b.e("PROFILE_FILL_CARD", s.s().r, "replace");
                }
             }
          }
       }
       tc = this.c;
       obj = tc.Q.a();
       a.o(obj, "mSelectionPosition.value");
       tc.Z8(obj.intValue());
       return;
    }
}
