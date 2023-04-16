package com.yxcorp.gifshow.homepage.presenter.d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.homepage.presenter.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import yf5.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import lnc.ja;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import im8.f;
import java.lang.Integer;
import yta.m;
import com.kwai.component.photo.reduce.model.ReduceMode;
import com.kwai.framework.model.channel.HotChannel;
import kp.x1;
import com.kwai.component.photo.reduce.g;
import java.lang.Boolean;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.util.List;
import java.util.Collection;
import ekd.q;
import yf5.v;
import com.kwai.component.photo.reduce.i$a;
import com.kwai.component.photo.reduce.i;
import kzc.d;
import yf5.s;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kwai.library.widget.popup.common.c$b;
import yf5.t;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.component.photo.reduce.PhotoReduceReasonFragment;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;

public final class d implements View$OnClickListener	// class@0017be
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       boolean this;
       String str3;
       Object[] objArray1;
       object this1;
       g this1;
       String str4;
       String str5;
       d b = this.b;
       Objects.requireNonNull(b);
       boolean b1 = false;
       a.b(b1);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 11;
       uElementPack.name = "reduce_similar_photo";
       uElementPack.action = 52;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(b.s);
       u1.u(4, uElementPack, uContentPack);
       ja.a();
       String str = "8";
       if (PatchProxy.applyVoid(null, b, e.class, str)) {
       }else {
          b.q.h0().requestDisallowInterceptTouchEvent(true);
          GifshowActivity activity = b.getActivity();
          e q = b.q;
          e p = b.p;
          e x = b.x;
          QPhoto qPhoto = new QPhoto(b.s);
          e w = b.w;
          int i = b.r.get().intValue();
          m om = new m(b);
          ReduceMode reduceMode = new ReduceMode(b1, true);
          boolean b2 = x1.a(b.v);
          g og = g.class;
          String str1 = "3";
          int i1 = 6;
          int i2 = 5;
          int i3 = 3;
          int i4 = 9;
          int i5 = 12;
          if (PatchProxy.isSupport2(og, str1)) {
             Object[] objArray = new Object[i5];
             objArray[0] = activity;
             objArray[1] = q;
             objArray[2] = p;
             objArray[i3] = x;
             objArray[4] = qPhoto;
             objArray[i2] = Integer.valueOf(w);
             objArray[i1] = Integer.valueOf(i);
             objArray[7] = om;
             objArray[8] = reduceMode;
             objArray[i4] = Boolean.FALSE;
             objArray[10] = Boolean.valueOf(b2);
             object oobject = null;
             objArray[11] = oobject;
             if (!PatchProxy.applyVoid(objArray, oobject, og, str1)) {
             }
          }else if(VisitorModeManager.f()){
             PatchProxy.onMethodExit(og, str1);
          }else {
             Boolean fALSE = Boolean.FALSE;
             String str2 = "4";
             this = 13;
             if (PatchProxy.isSupport2(og, str2)) {
                str3 = str1;
                objArray1 = new Object[this];
                objArray1[0] = activity;
                objArray1[1] = q;
                objArray1[2] = p;
                objArray1[i3] = x;
                objArray1[4] = qPhoto;
                objArray1[i2] = Integer.valueOf(w);
                objArray1[i1] = Integer.valueOf(i);
                objArray1[7] = om;
                objArray1[8] = reduceMode;
                objArray1[i4] = fALSE;
                objArray1[10] = Boolean.valueOf(b2);
                objArray1[11] = fALSE;
                this1 = null;
                objArray1[12] = this1;
                if (PatchProxy.applyVoid(objArray1, this1, og, str2)) {
                label_012f :
                   this1 = og;
                label_02fc :
                   PatchProxy.onMethodExit(this1, str3);
                }
             }else {
                str3 = str1;
             }
             if (VisitorModeManager.f()) {
                PatchProxy.onMethodExit(og, str2);
                goto label_012f ;
             }else {
                this = false;
                List list = g.c(qPhoto, b2, this, fALSE);
                if (!q.f(list)) {
                   if (PatchProxy.isSupport2(og, str)) {
                      Object[] objArray2 = new Object[14];
                      objArray2[this] = activity;
                      objArray2[1] = q;
                      objArray2[2] = p;
                      objArray2[i3] = x;
                      objArray2[4] = qPhoto;
                      objArray2[i2] = Integer.valueOf(w);
                      objArray2[i1] = om;
                      objArray2[7] = reduceMode;
                      objArray2[8] = fALSE;
                      objArray2[i4] = fALSE;
                      objArray2[10] = fALSE;
                      objArray2[11] = fALSE;
                      objArray2[12] = list;
                      object oobject1 = null;
                      objArray2[13] = oobject1;
                      if (!PatchProxy.applyVoid(objArray2, oobject1, og, str)) {
                      label_017a :
                         if (VisitorModeManager.f()) {
                            PatchProxy.onMethodExit(og, str);
                         }else {
                            i$a uoa = new i$a(qPhoto);
                            uoa.j(w);
                            uoa = uoa.b(p).k(x);
                            uoa.f(false);
                            uoa.h = om;
                            uoa.g(list);
                            uoa.h(reduceMode);
                            uoa.e(false);
                            uoa.d(false);
                            uoa.o = false;
                            uoa.q = activity;
                            uoa.r = q;
                            i oi = uoa.a();
                            d uod = new d(activity);
                            Objects.requireNonNull(oi);
                            uod.F(new s(oi));
                            uod.N(new t(oi));
                            uod.L(oi);
                            uod.Y(new v());
                            PatchProxy.onMethodExit(og, str);
                         }
                      }
                   }else {
                      goto label_017a ;
                   }
                   this1 = og;
                   str4 = str2;
                }else {
                   String int[] this2 = "10";
                   if (PatchProxy.isSupport2(og, this2)) {
                      objArray1 = new Object[10];
                      objArray1[0] = activity;
                      objArray1[1] = p;
                      objArray1[2] = x;
                      objArray1[i3] = qPhoto;
                      objArray1[4] = Integer.valueOf(w);
                      objArray1[i2] = Integer.valueOf(i);
                      objArray1[i1] = om;
                      objArray1[7] = reduceMode;
                      objArray1[8] = fALSE;
                      objArray1[i4] = Boolean.valueOf(b2);
                      if (PatchProxy.applyVoid(objArray1, null, og, this2)) {
                      label_021b :
                         this1 = og;
                         str5 = str2;
                      label_02f7 :
                         str4 = str5;
                      }
                   }
                   if (VisitorModeManager.f()) {
                      PatchProxy.onMethodExit(og, this2);
                      goto label_021b ;
                   }else if(PatchProxy.isSupport2(PhotoReduceReasonFragment.class, "2")){
                      Object[] objArray3 = new Object[10];
                      objArray3[0] = activity;
                      objArray3[1] = p;
                      objArray3[2] = x;
                      objArray3[i3] = qPhoto;
                      objArray3[4] = Integer.valueOf(w);
                      objArray3[i2] = Integer.valueOf(i);
                      objArray3[i1] = om;
                      objArray3[7] = reduceMode;
                      objArray3[8] = fALSE;
                      objArray3[i4] = Boolean.valueOf(b2);
                      if (PatchProxy.applyVoid(objArray3, null, PhotoReduceReasonFragment.class, "2")) {
                         str4 = this2;
                         this1 = og;
                         str5 = str2;
                      label_02f4 :
                         PatchProxy.onMethodExit(this1, str4);
                         goto label_02f7 ;
                      }
                   }
                   int[] ointArray = new int[2];
                   p.getLocationInWindow(ointArray);
                   PhotoReduceReasonFragment photoReduceR = new PhotoReduceReasonFragment();
                   str5 = str2;
                   this2 = new int[2];
                   x.getLocationInWindow(this2);
                   Bundle this21 = new Bundle();
                   this21.putParcelable("anchor_location", new Rect(ointArray[0], ointArray[1], (ointArray[0] + p.getWidth()), (ointArray[1] + p.getHeight())));
                   SerializableHook.putSerializable(this21, "photo", qPhoto);
                   this21.putInt("source", w);
                   this21.putInt("position", i);
                   this21.putBoolean("is_long_click", false);
                   this21.putParcelable("reduce_mode", reduceMode);
                   this21.putParcelable("source_location", new Rect(this2[0], this2[1], (this2[0] + x.getWidth()), (this2[1] + x.getHeight())));
                   this21.putBoolean("source_channel", b2);
                   photoReduceR.setArguments(this21);
                   photoReduceR.u = om;
                   photoReduceR.show(activity.getSupportFragmentManager(), "photo_reduce_reason");
                   PatchProxy.onMethodExit(PhotoReduceReasonFragment.class, "2");
                   str4 = this2;
                   this1 = og;
                   goto label_02f4 ;
                }
                PatchProxy.onMethodExit(this1, str4);
                goto label_02fc ;
             }
          }
       }
       return;
    }
}
