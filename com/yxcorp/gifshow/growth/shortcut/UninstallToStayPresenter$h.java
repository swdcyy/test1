package com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$h;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import android.app.Activity;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter;
import com.yxcorp.gifshow.growth.model.response.GrowthStayDialogConfig;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import java.util.Objects;
import kotlin.Result;
import android.view.View;
import sqa.e;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.yxcorp.gifshow.growth.model.response.GrowthStayDialogConfig$StayAccountDialog;
import java.lang.CharSequence;
import android.text.Spanned;
import android.text.Html;
import sqa.b;
import sqa.c;
import android.widget.ImageView;
import sqa.d;
import java.lang.Throwable;
import qrd.j0;
import sqa.i;
import com.yxcorp.gifshow.growth.model.response.GrowthStayDialogConfig$StayRelationDialog;
import androidx.appcompat.widget.AppCompatTextView;
import sqa.f;
import sqa.g;
import sqa.h;
import java.lang.Integer;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.widget.FrameLayout;
import java.util.Collection;
import java.lang.Number;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Pair;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import android.text.TextUtils;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import k2b.u1;

public final class UninstallToStayPresenter$h implements PopupInterface$h	// class@0014cb
{
    public final Activity b;
    public final UninstallToStayPresenter c;
    public final boolean d;
    public final GrowthStayDialogConfig e;

    public void UninstallToStayPresenter$h(Activity p0,UninstallToStayPresenter p1,boolean p2,GrowthStayDialogConfig p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void B(c p0){
       View view;
       GrowthStayDialogConfig$StayAccountDialog title;
       GrowthStayDialogConfig$StayAccountDialog desc;
       GrowthStayDialogConfig growthStayDi2;
       b uob1;
       UninstallToStayPresenter$h oh;
       GrowthStayDialogConfig growthStayDi3;
       ImageView imageView;
       View view4;
       GrowthStayDialogConfig$StayRelationDialog detainBtn1;
       List list1;
       Object obj3;
       int i7;
       int i8;
       Object obj = this;
       UninstallToStayPresenter$h obj1 = p0;
       if (PatchProxy.applyVoidOneRefsWithListener(obj1, obj, UninstallToStayPresenter$h.class, "1")) {
          return;
       }
       a.p(obj1, "popup");
       o.e(this, p0);
       int i = 0x7f0a0785;
       int i1 = 0x7f0a057b;
       int i2 = 0x7f0a4122;
       Pair[] pairArray = 0x7f0a42b0;
       int i3 = 0x7f0a42cc;
       object oobject = 0x7f0a093b;
       if (obj.d != null) {
          UninstallToStayPresenter$h c = obj.c;
          GrowthStayDialogConfig accountDialo = obj.e.accountDialog;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidTwoRefs(obj1, accountDialo, c, UninstallToStayPresenter.class, "8")) {
             if (obj1 != null) {
                view = p0.z();
                if (view != null) {
                   if (accountDialo != null) {
                      View view1 = view.findViewById(oobject);
                      if (view1 != null) {
                         view1.setOnClickListener(e.b);
                      }
                      TextView textView = view.findViewById(i3);
                      if (textView != null) {
                         title = accountDialo.title;
                         if (title != null) {
                            textView.setText(title);
                         }
                      }
                      TextView textView1 = view.findViewById(pairArray);
                      if (textView1 != null) {
                         desc = accountDialo.desc;
                         if (desc != null) {
                            textView1.setText(Html.fromHtml(desc));
                         }
                      }
                      textView1 = view.findViewById(R.id.tv_coin_count);
                      if (textView1 != null) {
                         desc = accountDialo.coin;
                         if (desc != null) {
                            textView1.setText(desc);
                         }
                      }
                      textView1 = view.findViewById(R.id.tv_cash_count);
                      if (textView1 != null) {
                         desc = accountDialo.cash;
                         if (desc != null) {
                            textView1.setText(desc);
                         }
                      }
                      View view2 = view.findViewById(i2);
                      if (view2 != null) {
                         GrowthStayDialogConfig$StayAccountDialog detainBtn = accountDialo.detainBtn;
                         if (detainBtn != null) {
                            view2.setText(detainBtn);
                         }
                         GrowthStayDialogConfig growthStayDi = accountDialo;
                         b uob = title;
                         GrowthStayDialogConfig growthStayDi1 = growthStayDi;
                         growthStayDi2 = growthStayDi;
                         uob1 = title;
                         oh = c;
                         uob = new b(growthStayDi1, view, c, p0, growthStayDi2);
                         view2.setOnClickListener(uob1);
                      }else {
                         growthStayDi2 = accountDialo;
                         oh = c;
                      }
                      View view3 = view.findViewById(i1);
                      if (view3 != null) {
                         growthStayDi3 = growthStayDi2;
                         GrowthStayDialogConfig$StayAccountDialog uninstallBtn = growthStayDi3.uninstallBtn;
                         if (uninstallBtn != null) {
                            view3.setText(uninstallBtn);
                         }
                         c uoc = new c(growthStayDi3, view, oh, p0, growthStayDi3);
                         view3.setOnClickListener(uob1);
                      }else {
                         growthStayDi3 = growthStayDi2;
                      }
                      imageView = view.findViewById(i);
                      if (imageView != null) {
                         imageView.setOnClickListener(new d(view, oh, obj1, growthStayDi3));
                      }
                   }
                }else {
                label_0102 :
                   view = null;
                }
             }else {
                goto label_0102 ;
             }
             Result.constructor-impl(view);
          }
       }else {
          UninstallToStayPresenter$h c1 = obj.c;
          growthStayDi3 = obj.e.relationDialog;
          Objects.requireNonNull(c1);
          if (!PatchProxy.applyVoidTwoRefs(obj1, growthStayDi3, c1, UninstallToStayPresenter.class, "9")) {
             if (growthStayDi3 != null && obj1 != null) {
                view4 = p0.z();
                if (view4 != null) {
                   View view5 = view4.findViewById(oobject);
                   if (view5 != null) {
                      view5.setOnClickListener(i.b);
                   }
                   TextView textView2 = view4.findViewById(i3);
                   if (textView2 != null) {
                      GrowthStayDialogConfig$StayRelationDialog title1 = growthStayDi3.title;
                      if (title1 != null) {
                         textView2.setText(title1);
                      }
                   }
                   textView2 = view4.findViewById(pairArray);
                   if (textView2 != null) {
                      GrowthStayDialogConfig$StayRelationDialog desc1 = growthStayDi3.desc;
                      if (desc1 != null) {
                         textView2.setText(Html.fromHtml(desc1));
                      }
                   }
                   View view6 = view4.findViewById(i2);
                   if (view6 != null) {
                      detainBtn1 = growthStayDi3.detainBtn;
                      if (detainBtn1 != null) {
                         view6.setText(detainBtn1);
                      }
                      f uof = oobject;
                      f uof1 = oobject;
                      uof = new f(view4, growthStayDi3, c1, growthStayDi3, p0);
                      view6.setOnClickListener(uof1);
                   }
                   textView2 = view4.findViewById(R.id.btn_uninstall);
                   if (textView2 != null) {
                      GrowthStayDialogConfig$StayRelationDialog uninstallBtn1 = growthStayDi3.uninstallBtn;
                      if (uninstallBtn1 != null) {
                         textView2.setText(uninstallBtn1);
                      }
                      textView2.setOnClickListener(new g(growthStayDi3, c1, growthStayDi3, obj1));
                   }
                   imageView = view4.findViewById(R.id.close_btn);
                   if (imageView != null) {
                      imageView.setOnClickListener(new h(growthStayDi3, c1, growthStayDi3, obj1));
                   }
                   Integer[] integerArray = new Integer[]{Integer.valueOf(0x7f0a15f3),Integer.valueOf(0x7f0a15f4),Integer.valueOf(0x7f0a15f5)};
                   List list = CollectionsKt__CollectionsKt.L(integerArray);
                   View view7 = view4.findViewById(0x7f0a0344);
                   if (view7 != null) {
                      detainBtn1 = growthStayDi3.avatars;
                      if (detainBtn1 != null) {
                         i2 = 1;
                         if ((detainBtn1.isEmpty() ^ i2) == i2) {
                            i1 = growthStayDi3.avatars.size();
                            for (int i5 = 0; i5 < i1; i1 = i7) {
                               int i6 = list.get(i5).intValue();
                               Object obj2 = growthStayDi3.avatars.get(i5);
                               if (PatchProxy.isSupport(UninstallToStayPresenter.class)) {
                                  list1 = list;
                                  obj3 = obj2;
                                  i7 = i1;
                                  i1 = i6;
                                  i8 = i5;
                                  if (!PatchProxy.applyVoidThreeRefs(view7, Integer.valueOf(i6), obj2, c1, UninstallToStayPresenter.class, "10")) {
                                  label_0233 :
                                     KwaiImageView kwaiImageVie = view7.findViewById(i1);
                                     if (kwaiImageVie != null) {
                                        kwaiImageVie.setVisibility(0);
                                        kwaiImageVie.setImageURI(obj3);
                                     }
                                  }
                               }else {
                                  list1 = list;
                                  obj3 = obj2;
                                  i8 = i5;
                                  i7 = i1;
                                  i1 = i6;
                                  goto label_0233 ;
                               }
                               i5 = i8 + 1;
                               list = list1;
                            }
                            view7.setVisibility(0);
                         }
                      }
                   }
                }else {
                label_024e :
                   view4 = null;
                }
             }else {
                goto label_024e ;
             }
             Result.constructor-impl(view4);
          }
       }
       obj1 = obj.c;
       String str = (obj.d != null)? "BALANCE_POP": "SOCIAL_POP";
       pairArray = new Pair[]{null};
       Objects.requireNonNull(obj1);
       if (!PatchProxy.applyVoidTwoRefs(str, pairArray, obj1, UninstallToStayPresenter.class, "13")) {
          UninstallToStayPresenter p = obj1.p;
          if (p != null) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = str;
             i3 oi3 = i3.f();
             int i4 = 0;
             while (i4 < 1) {
                oobject = pairArray[i4];
                if (oobject != null && !TextUtils.isEmpty(oobject.getFirst())) {
                   oi3.d(oobject.getFirst(), oobject.getSecond());
                }
                i4 = i4 + 1;
             }
             uElementPack.params = oi3.e();
             u1.B0(new ShowMetaData().setLogPage(p).setType(4).setElementPackage(uElementPack));
          }
       }
       PatchProxy.onMethodExit(UninstallToStayPresenter$h.class, "1");
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
