package com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$g;
import erd.g;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import xl8.b;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.RecoUser;
import bac.p;
import y6c.i;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f7c.c;
import android.widget.TextView;
import com.kwai.framework.model.user.User;
import android.widget.ImageView;
import wca.m;
import lnc.a1;
import wca.a;
import android.animation.AnimatorSet;
import n7c.c;
import java.util.Objects;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import ki5.b;
import java.lang.CharSequence;
import android.content.Context;
import zf6.j;
import com.yxcorp.gifshow.pymk.PymkGuideCard;

public final class GalleryPageBigCardPresenter$g implements g	// class@00182d
{
    public final GalleryPageBigCardPresenter b;

    public void GalleryPageBigCardPresenter$g(GalleryPageBigCardPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       GalleryPageBigCardPresenter d;
       Object obj1;
       int i = p0.intValue();
       GalleryPageBigCardPresenter$g og = GalleryPageBigCardPresenter$g.class;
       GalleryPageBigCardPresenter galleryPageB = GalleryPageBigCardPresenter.class;
       if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, og, "1")) {
          og = this.b;
          GalleryPageBigCardPresenter a = og.A;
          if (a != null) {
             RecoUser obj = og.Q.a();
             String str = "mSelectionPosition.value";
             a.o(obj, str);
             obj = a.M0(obj.intValue());
             if (obj != null) {
                if (3 == i) {
                   galleryPageB = this.b.z;
                   if (galleryPageB == null) {
                      a.S("mBaseFragment");
                   }
                   GifshowActivity activity = galleryPageB.getActivity();
                   View view = this.b.m8();
                   GalleryPageBigCardPresenter q = this.b.q;
                   if (q == null) {
                      a.S("mPymkListener");
                   }
                   new i(activity, view, obj, q).b();
                }else if(4 == i){
                   this.b.j9(obj);
                }else if(5 == i){
                   if (obj.mUser != null) {
                      i = this.b.D;
                      if (i == null) {
                         a.S("mChangeBtn");
                      }
                      i.setText(R.string.arg_RES_7f10256e);
                      i = obj.mUser;
                      a.o(i, "recoUser.mUser");
                      if (i.isFollowingOrFollowRequesting()) {
                         m.b(obj.mUser, GalleryPageBigCardPresenter.S8(this.b), null, GalleryPageBigCardPresenter.S8(this.b));
                         GalleryPageBigCardPresenter.S8(this.b).setBackgroundResource(R.drawable.arg_RES_7f080947);
                         GalleryPageBigCardPresenter.S8(this.b).setTextColor(a1.a(R.color.arg_RES_7f0620c7));
                      }else {
                         a.b(obj.mUser, GalleryPageBigCardPresenter.S8(this.b), null, GalleryPageBigCardPresenter.S8(this.b));
                         i = this.b;
                         i.I = false;
                         i = i.M;
                         if (i != null) {
                            i.cancel();
                         }
                      }
                   }
                }else if(7 == i){
                   if (c.f()) {
                      i = this.b;
                      Objects.requireNonNull(i);
                      if (!PatchProxy.applyVoid(null, i, galleryPageB, "27")) {
                         d = i.D;
                         if (d == null) {
                            a.S("mChangeBtn");
                         }
                         d.setText(R.string.arg_RES_7f100d16);
                         if (i.b9().d()) {
                            if (!PatchProxy.applyVoid(null, i, galleryPageB, "28")) {
                               d = i.E;
                               if (d == null) {
                                  a.S("mFollowBtn");
                               }
                               d.setText(b.b().c(R.string.arg_RES_7f100121));
                               d = i.E;
                               if (d == null) {
                                  a.S("mFollowBtn");
                               }
                               d.setBackgroundResource(R.drawable.arg_RES_7f0801dd);
                               d = i.E;
                               if (d == null) {
                                  a.S("mFollowBtn");
                               }
                               i = i.E;
                               if (i == null) {
                                  a.S("mFollowBtn");
                               }
                               d.setTextColor(j.b(i.getContext(), R.color.arg_RES_7f061d77));
                            }
                         }else if(PatchProxy.applyVoid(null, i, galleryPageB, "29")){
                            d = i.E;
                            if (d == null) {
                               a.S("mFollowBtn");
                            }
                            d.setText(b.b().c(R.string.arg_RES_7f1007fe));
                            i = i.E;
                            if (i == null) {
                               a.S("mFollowBtn");
                            }
                            i.setBackgroundResource(R.drawable.arg_RES_7f0801bd);
                         }
                      }
                   }else {
                      i = this.b;
                      Objects.requireNonNull(i);
                      if (!PatchProxy.applyVoid(null, i, galleryPageB, "26")) {
                         if (i.b9().d()) {
                            d = i.E;
                            if (d == null) {
                               a.S("mFollowBtn");
                            }
                            d.setText(R.string.arg_RES_7f1046e4);
                            d = i.E;
                            if (d == null) {
                               a.S("mFollowBtn");
                            }
                            d.setBackgroundResource(R.drawable.arg_RES_7f080947);
                            d = i.E;
                            if (d == null) {
                               a.S("mFollowBtn");
                            }
                            d.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
                            if (i.J == null) {
                               i.J = true;
                               obj1 = i.Q.a();
                               a.o(obj1, str);
                               i.Z8(obj1.intValue());
                            }
                         }else {
                            d = i.E;
                            if (d == null) {
                               a.S("mFollowBtn");
                            }
                            d.setText(R.string.arg_RES_7f103ac5);
                            i = i.E;
                            if (i == null) {
                               a.S("mFollowBtn");
                            }
                            i.setBackgroundResource(R.drawable.arg_RES_7f0801bd);
                         }
                      }
                   }
                }else if(6 == i){
                   i = this.b;
                   Objects.requireNonNull(i);
                   if (!PatchProxy.applyVoidOneRefs(obj, i, galleryPageB, "30")) {
                      obj = obj.mPymkGuideCard;
                      if (obj != null) {
                         if (obj.mIsNameEmpty == null && obj.mIsHeadEmpty == null) {
                            d = i.E;
                            if (d == null) {
                               a.S("mFollowBtn");
                            }
                            d.setText(R.string.arg_RES_7f103c4e);
                            d = i.E;
                            if (d == null) {
                               a.S("mFollowBtn");
                            }
                            d.setBackgroundResource(R.drawable.arg_RES_7f080947);
                            d = i.E;
                            if (d == null) {
                               a.S("mFollowBtn");
                            }
                            d.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
                            if (i.K == null) {
                               i.K = true;
                               obj1 = i.Q.a();
                               a.o(obj1, str);
                               i.Z8(obj1.intValue());
                            }
                         }else {
                            d = i.E;
                            if (d == null) {
                               a.S("mFollowBtn");
                            }
                            d.setText(R.string.arg_RES_7f100912);
                            i = i.E;
                            if (i == null) {
                               a.S("mFollowBtn");
                            }
                            i.setBackgroundResource(R.drawable.arg_RES_7f0801bd);
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
