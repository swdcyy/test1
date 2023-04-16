package com.yxcorp.gifshow.detail.common.rightactionbar.more.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import uf5.c0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.yxcorp.gifshow.model.EditInfo;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import qz9.j;
import com.kuaishou.android.model.mix.w;
import com.kuaishou.android.model.feed.VisibilityExpiration;
import com.kwai.framework.model.feed.BaseFeed;
import android.graphics.drawable.Drawable;
import kp.r1;
import android.content.Context;
import zf6.j;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b$b;
import erd.g;
import crd.b;
import lnc.b9;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b$c;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b$d;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.a;
import qz9.g;
import qz9.h;
import qz9.i;
import whc.k0;

public final class b extends PresenterV2	// class@0014b3
{
    public View A;
    public TextView B;
    public TextView C;
    public TextView D;
    public View E;
    public TextView F;
    public TextView G;
    public final View$OnClickListener H;
    public QPhoto p;
    public BaseFragment q;
    public c0 r;
    public k0 s;
    public b t;
    public View u;
    public View v;
    public View w;
    public View x;
    public View y;
    public View z;

    public void b(){
       super();
       this.H = new b$a(this);
    }
    public static final BaseFragment P8(b p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final QPhoto R8(b p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static final c0 S8(b p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mPhotoSetTopHelper");
       }
       return p0;
    }
    public void E8(){
       b tp1;
       VisibilityExpiration mExpiryDays;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          this.V8();
          b tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          int i = 0;
          if (tp.isFriendsVisibility()) {
             tp = this.y;
             if (tp == null) {
                a.S("mFriendVisibleCheck");
             }
             tp.setVisibility(i);
          }else {
             tp = this.p;
             if (tp == null) {
                a.S("mPhoto");
             }
             if (!tp.isSpecialUsersVisibility()) {
                tp = this.p;
                if (tp == null) {
                   a.S("mPhoto");
                }
                if (!tp.isSpecialUsersInvisibility()) {
                   tp = this.p;
                   if (tp == null) {
                      a.S("mPhoto");
                   }
                   if (!tp.isMessageGroupVisibility()) {
                      tp = this.p;
                      if (tp == null) {
                         a.S("mPhoto");
                      }
                      if (tp.isPublic()) {
                         tp = this.x;
                         if (tp == null) {
                            a.S("mEveryoneVisibleCheck");
                         }
                         tp.setVisibility(i);
                      }else {
                         tp = this.z;
                         if (tp == null) {
                            a.S("mPrivateVisibleCheck");
                         }
                         tp.setVisibility(i);
                      }
                   }
                }
             }
          }
       label_0084 :
          tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          PhotoMeta photoMeta1 = tp.mEntity.a(PhotoMeta.class);
          PhotoMeta mEditInfo = photoMeta1.mEditInfo;
          String str = "mPhotoEditLayout";
          if (mEditInfo != null && mEditInfo.mAllowMusicReedit != null) {
             tp1 = this.p;
             if (tp1 == null) {
                a.S("mPhoto");
             }
             if (!tp1.isLongPhotos()) {
                tp1 = this.p;
                if (tp1 == null) {
                   a.S("mPhoto");
                }
                if (!tp1.isAtlasPhotos()) {
                   tp1 = this.p;
                   if (tp1 == null) {
                      a.S("mPhoto");
                   }
                   if (!tp1.isSinglePhoto()) {
                      tp1 = this.C;
                      if (tp1 == null) {
                         a.S(str);
                      }
                      tp1.setText(a1.p(R.string.arg_RES_7f1036bd));
                   label_00e9 :
                      mEditInfo = photoMeta1.mEditInfo;
                      tp1 = (mEditInfo != null && mEditInfo.mEnable != null)? 1: null;
                      int i1 = 8;
                      if (tp1) {
                         tp1 = this.C;
                         if (tp1 == null) {
                            a.S(str);
                         }
                         tp1.setVisibility(i);
                      }else {
                         tp1 = this.C;
                         if (tp1 == null) {
                            a.S(str);
                         }
                         tp1.setVisibility(i1);
                      }
                      tp1 = this.p;
                      if (tp1 == null) {
                         a.S("mPhoto");
                      }
                      if (!j.a(tp1)) {
                         tp1 = this.p;
                         if (tp1 == null) {
                            a.S("mPhoto");
                         }
                         if (!j.b(tp1)) {
                            tp1 = this.p;
                            if (tp1 == null) {
                               a.S("mPhoto");
                            }
                            if (!j.d(tp1)) {
                               tp1 = this.p;
                               if (tp1 == null) {
                                  a.S("mPhoto");
                               }
                               if (!j.c(tp1)) {
                                  tp1 = this.E;
                                  if (tp1 == null) {
                                     a.S("mPhotoOtherSettingLayout");
                                  }
                                  tp1.setVisibility(i1);
                               label_0159 :
                                  String str1 = "mPhotoForeverPublicLayout";
                                  if (w.p0(photoMeta1)) {
                                     tp = this.A;
                                     if (tp == null) {
                                        a.S(str1);
                                     }
                                     tp.setVisibility(i);
                                  }else {
                                     tp = this.A;
                                     if (tp == null) {
                                        a.S(str1);
                                     }
                                     tp.setVisibility(i1);
                                  }
                                  tp = this.p;
                                  if (tp == null) {
                                     a.S("mPhoto");
                                  }
                                  photoMeta1 = tp.getPhotoMeta();
                                  if (photoMeta1 != null) {
                                     photoMeta1 = photoMeta1.mVisibilityExpiration;
                                     if (photoMeta1 != null) {
                                        mExpiryDays = photoMeta1.mExpiryDays;
                                     label_018b :
                                        str1 = "mPhotoSetTop";
                                        if (mExpiryDays == null) {
                                           tp = this.p;
                                           if (tp == null) {
                                              a.S("mPhoto");
                                           }
                                           if (tp.isPublic()) {
                                              tp = this.p;
                                              if (tp == null) {
                                                 a.S("mPhoto");
                                              }
                                              if (!tp.isLimitVisibility()) {
                                                 tp = this.B;
                                                 if (tp == null) {
                                                    a.S(str1);
                                                 }
                                                 tp.setVisibility(i);
                                              label_01be :
                                                 tp = this.p;
                                                 if (tp == null) {
                                                    a.S("mPhoto");
                                                 }
                                                 if (w.F0(tp.mEntity)) {
                                                    tp = this.B;
                                                    if (tp == null) {
                                                       a.S(str1);
                                                    }
                                                    tp.setText(a1.p(R.string.arg_RES_7f1004c2));
                                                    tp = this.B;
                                                    if (tp == null) {
                                                       a.S(str1);
                                                    }
                                                    tp.setCompoundDrawablesWithIntrinsicBounds(a1.f(R.drawable.arg_RES_7f081885), objArray, objArray, objArray);
                                                 }else {
                                                    tp = this.B;
                                                    if (tp == null) {
                                                       a.S(str1);
                                                    }
                                                    tp.setText(a1.p(R.string.arg_RES_7f10044d));
                                                    tp = this.B;
                                                    if (tp == null) {
                                                       a.S(str1);
                                                    }
                                                    tp.setCompoundDrawablesWithIntrinsicBounds(a1.f(R.drawable.arg_RES_7f081886), objArray, objArray, objArray);
                                                 }
                                                 tp = this.p;
                                                 if (tp == null) {
                                                    a.S("mPhoto");
                                                 }
                                                 if (r1.t3(tp.mEntity) && !PatchProxy.applyVoid(objArray, this, uob, "5")) {
                                                    uob = this.G;
                                                    String str2 = "mFriendVisibleText";
                                                    if (uob == null) {
                                                       a.S(str2);
                                                    }
                                                    if (uob != null) {
                                                       uob.setCompoundDrawablesWithIntrinsicBounds(j.n(this.getContext(), R.drawable.arg_RES_7f081883, 0x7f0616a7), objArray, objArray, objArray);
                                                    }
                                                    uob = this.G;
                                                    if (uob == null) {
                                                       a.S(str2);
                                                    }
                                                    if (uob != null) {
                                                       uob.setTextColor(a1.a(R.color.arg_RES_7f0616a7));
                                                    }
                                                    uob = this.F;
                                                    str2 = "mPrivateVisibleText";
                                                    if (uob == null) {
                                                       a.S(str2);
                                                    }
                                                    if (uob != null) {
                                                       uob.setCompoundDrawablesWithIntrinsicBounds(j.n(this.getContext(), R.drawable.arg_RES_7f081887, 0x7f0616a7), objArray, objArray, objArray);
                                                    }
                                                    uob = this.F;
                                                    if (uob == null) {
                                                       a.S(str2);
                                                    }
                                                    if (uob != null) {
                                                       uob.setTextColor(a1.a(R.color.arg_RES_7f0616a7));
                                                    }
                                                    uob = this.C;
                                                    if (uob == null) {
                                                       a.S(str);
                                                    }
                                                    if (uob != null) {
                                                       uob.setCompoundDrawablesWithIntrinsicBounds(j.n(this.getContext(), R.drawable.arg_RES_7f081881, 0x7f0616a7), objArray, objArray, objArray);
                                                    }
                                                    uob = this.C;
                                                    if (uob == null) {
                                                       a.S(str);
                                                    }
                                                    if (uob != null) {
                                                       uob.setTextColor(a1.a(R.color.arg_RES_7f0616a7));
                                                    }
                                                    uob = this.D;
                                                    if (uob == null) {
                                                       a.S("mPhotoDeleteLayout");
                                                    }
                                                    if (uob != null) {
                                                       uob.setCompoundDrawablesWithIntrinsicBounds(j.n(this.getContext(), R.drawable.arg_RES_7f08187d, 0x7f0616a7), objArray, objArray, objArray);
                                                    }
                                                    uob = this.D;
                                                    if (uob == null) {
                                                       a.S("mPhotoDeleteLayout");
                                                    }
                                                    if (uob != null) {
                                                       uob.setTextColor(a1.a(R.color.arg_RES_7f0616a7));
                                                    }
                                                 }
                                              }
                                           }
                                        }
                                     label_01b4 :
                                        tp = this.B;
                                        if (tp == null) {
                                           a.S(str1);
                                        }
                                        tp.setVisibility(i1);
                                        goto label_01be ;
                                     }
                                  }
                                  mExpiryDays = null;
                                  goto label_018b ;
                               }
                            }
                         }
                      }
                   label_014f :
                      tp1 = this.E;
                      if (tp1 == null) {
                         a.S("mPhotoOtherSettingLayout");
                      }
                      tp1.setVisibility(i);
                      goto label_0159 ;
                   }
                }
             }
          }
       label_00d8 :
          tp1 = this.C;
          if (tp1 == null) {
             a.S(str);
          }
          tp1.setText(a1.p(R.string.arg_RES_7f1036be));
          goto label_00e9 ;
       }
    label_02d0 :
       this.X8();
       uob = this.p;
       if (uob == null) {
          a.S("mPhoto");
       }
       PhotoMeta photoMeta = uob.getPhotoMeta();
       if (photoMeta != null) {
          this.X7(photoMeta.observable().subscribe(new b$b(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b9.a(this.t);
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       b tx = this.x;
       if (tx == null) {
          a.S("mEveryoneVisibleCheck");
       }
       tx.setVisibility(8);
       tx = this.y;
       if (tx == null) {
          a.S("mFriendVisibleCheck");
       }
       tx.setVisibility(8);
       tx = this.z;
       if (tx == null) {
          a.S("mPrivateVisibleCheck");
       }
       tx.setVisibility(8);
       return;
    }
    public final void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLICK_SET_PHOTO_TOP";
       uElementPack.type = 1;
       i3 oi3 = i3.f();
       oi3.d("set_top_button", p0);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       b tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       uContentPack.photoPackage = w1.f(tp.getEntity());
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setElementPackage(uElementPack);
       uClickMetaDa.setContentPackage(uContentPack);
       u1.B(uClickMetaDa);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       b tr = this.r;
       if (tr == null) {
          a.S("mPhotoSetTopHelper");
       }
       tr.c = b$c.a;
       tr = this.B;
       if (tr == null) {
          a.S("mPhotoSetTop");
       }
       tr.setOnClickListener(new b$d(this));
       return;
    }
    public void doBindView(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.more_everyone_visible_layout);
       a.o(view, "bindWidget\(rootView, R.i¡­_everyone_visible_layout\)");
       this.u = view;
       view = m1.f(p0, R.id.more_friend_visible_layout);
       a.o(view, "bindWidget\(rootView, R.i¡­re_friend_visible_layout\)");
       this.v = view;
       view = m1.f(p0, R.id.more_private_visible_layout);
       a.o(view, "bindWidget\(rootView, R.i¡­e_private_visible_layout\)");
       this.w = view;
       view = m1.f(p0, R.id.more_private_visible_text);
       a.o(view, "bindWidget\(rootView, R.i¡­ore_private_visible_text\)");
       this.F = view;
       view = m1.f(p0, R.id.more_friend_visible_text);
       a.o(view, "bindWidget\(rootView, R.i¡­more_friend_visible_text\)");
       this.G = view;
       view = m1.f(p0, R.id.more_everyone_visible_check);
       a.o(view, "bindWidget\(rootView, R.i¡­e_everyone_visible_check\)");
       this.x = view;
       view = m1.f(p0, R.id.more_friend_visible_check);
       a.o(view, "bindWidget\(rootView, R.i¡­ore_friend_visible_check\)");
       this.y = view;
       view = m1.f(p0, R.id.more_private_visible_check);
       a.o(view, "bindWidget\(rootView, R.i¡­re_private_visible_check\)");
       this.z = view;
       view = m1.f(p0, R.id.more_photo_public_forever);
       a.o(view, "bindWidget\(rootView, R.i¡­ore_photo_public_forever\)");
       this.A = view;
       view = m1.f(p0, R.id.more_photo_set_top);
       a.o(view, "bindWidget\(rootView, R.id.more_photo_set_top\)");
       this.B = view;
       view = m1.f(p0, R.id.more_photo_edit);
       a.o(view, "bindWidget\(rootView, R.id.more_photo_edit\)");
       this.C = view;
       view = m1.f(p0, R.id.more_photo_delete);
       a.o(view, "bindWidget\(rootView, R.id.more_photo_delete\)");
       this.D = view;
       p0 = m1.f(p0, R.id.more_photo_other_setting_layout);
       a.o(p0, "bindWidget\(rootView, R.i¡­oto_other_setting_layout\)");
       this.E = p0;
       if (!PatchProxy.applyVoid(null, this, uob, "6")) {
          b tu = this.u;
          if (tu == null) {
             a.S("mEveryoneVisibleLayout");
          }
          tu.setOnClickListener(this.H);
          tu = this.v;
          if (tu == null) {
             a.S("mFriendVisibleLayout");
          }
          tu.setOnClickListener(this.H);
          tu = this.w;
          if (tu == null) {
             a.S("mPrivateVisibleLayout");
          }
          tu.setOnClickListener(this.H);
          tu = this.A;
          if (tu == null) {
             a.S("mPhotoForeverPublicLayout");
          }
          tu.setOnClickListener(new a(this));
          tu = this.C;
          if (tu == null) {
             a.S("mPhotoEditLayout");
          }
          tu.setOnClickListener(new g(this));
          tu = this.D;
          if (tu == null) {
             a.S("mPhotoDeleteLayout");
          }
          tu.setOnClickListener(new h(this));
          tu = this.E;
          if (tu == null) {
             a.S("mPhotoOtherSettingLayout");
          }
          tu.setOnClickListener(new i(this));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.q = obj;
       obj = this.q8(c0.class);
       a.o(obj, "inject\(PhotoSetTopHelper::class.java\)");
       this.r = obj;
       this.s = this.s8(k0.class);
       return;
    }
}
