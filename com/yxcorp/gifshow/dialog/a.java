package com.yxcorp.gifshow.dialog.a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ml8.d;
import lnc.a1;
import com.yxcorp.gifshow.model.response.DialogResponse$ActivityDialogData;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import u9a.d;
import crd.b;
import ok.h;
import lnc.b9;
import com.yxcorp.gifshow.model.response.DialogResponse$DialogButton;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import k2b.u1;
import uv8.q0;
import java.lang.reflect.Type;
import java.util.Map;
import tra.a;
import com.yxcorp.gifshow.model.HomeDialogShowInfo;
import java.lang.System;
import java.util.HashMap;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import android.content.Context;
import android.app.Activity;
import ekd.m1;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import u9a.a;
import android.view.View$OnClickListener;
import u9a.b;
import u9a.c;

public class a implements PopupInterface$f, d	// class@001a9a
{
    public TextView b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public KwaiImageView g;
    public boolean h;
    public DialogResponse$ActivityDialogData i;
    public b j;
    public String k;
    public final DialogResponse$ActivityDialogData l;
    public c m;
    public static final int n;

    static {
       a.n = a1.e(10.00f);
    }
    public void a(DialogResponse$ActivityDialogData p0){
       super();
       this.l = p0;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       a uoa = a.class;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "2");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       this.m = p0;
       View view = a.g(p1, R.layout.arg_RES_7f0d0027, p2, false);
       this.doBindView(view);
       a tl = this.l;
       int i = 1;
       Object[] objArray = null;
       if (!PatchProxy.applyVoidOneRefs(tl, this, uoa, "3")) {
          this.i = tl;
          DialogResponse$ActivityDialogData mReportName = tl.mReportName;
          if (mReportName != null) {
             this.j = b9.c(this.j, new d(mReportName));
          }
          mReportName = this.i.mButton;
          if (mReportName != null) {
             this.k = mReportName.mText;
          }
          if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             this.g.setImageURI(this.i.mImageUrl);
             this.g.getHierarchy().L(RoundingParams.b((float)a.n, (float)a.n, 0, 0));
             this.b.setText(this.k);
             this.e.setText(this.i.mTitle);
             this.f.setText(this.i.mContent);
             if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.type = 18;
                uElementPack.action = 0x7532;
                uElementPack.name = this.i.mActivityName;
                ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                urlPackage.page = i;
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                if (!TextUtils.x(this.i.mKsOrderId)) {
                   uContentPack.ksOrderInfoPackage = l0.a(this.i.mKsOrderId);
                }
                u1.y0(urlPackage, 10, uElementPack, uContentPack);
             }
          }
       }
    label_00cd :
       if (!PatchProxy.applyVoid(objArray, this, uoa, "13")) {
          Map map = a.c(q0.K);
          String str = String.valueOf(this.l.mDialogId);
          if (map != null) {
             objArray = map.get(str);
          }
          HomeDialogShowInfo homeDialogSh = new HomeDialogShowInfo();
          if (objArray != null) {
             i = i + objArray.mShowTimes;
          }
          homeDialogSh.mShowTimes = i;
          homeDialogSh.mLastShowTime = System.currentTimeMillis();
          HashMap hashMap = new HashMap();
          if (map != null) {
             hashMap.putAll(map);
          }
          hashMap.put(str, homeDialogSh);
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("home_show_activity_dialog", b.e(hashMap));
          g.a(uEditor);
       }
       return view;
    }
    public void b(c p0){
       this.m = null;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       this.m.q(4);
       return;
    }
    public final Context d(){
       Object obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.u();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.d = m1.f(p0, 0x7f0a2e0a);
       this.b = m1.f(p0, 0x7f0a15ab);
       this.c = m1.f(p0, 0x7f0a2e0b);
       this.g = m1.f(p0, 0x7f0a00c6);
       this.f = m1.f(p0, 0x7f0a0675);
       this.e = m1.f(p0, 0x7f0a0676);
       m1.a(p0, new a(this), R.id.close_view);
       m1.a(p0, new b(this), R.id.not_show_dialog);
       m1.a(p0, new c(this), R.id.join_activity);
       return;
    }
}
