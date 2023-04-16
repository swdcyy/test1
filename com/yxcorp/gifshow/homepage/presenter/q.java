package com.yxcorp.gifshow.homepage.presenter.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.reco.FeedMiscPojo;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import yta.e1;
import erd.g;
import crd.b;
import yta.f1;
import com.yxcorp.gifshow.util.rx.RxBus;
import i8c.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.homepage.presenter.m;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import eg5.e;
import wkd.b;
import tjc.c;
import java.lang.System;
import y95.b;
import android.content.SharedPreferences;
import o56.a;
import xf6.l;
import yta.h1;
import lnc.a1;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.growth.privacy.dialog.helper.g;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kuaishou.growth.privacy.dialog.helper.j;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import eg5.c;
import eg5.e$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public class q extends PresenterV2	// class@0017d5
{
    public boolean p;
    public BaseFragment q;
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static boolean u;

    public void q(){
       super();
    }
    public static void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, q.class, "10")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PERSON_RECOM_SITE_BTN";
       i3 oi3 = i3.f();
       oi3.d("button_name", p0);
       oi3.d("person_recom_type", "");
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, null);
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "2")) {
          return;
       }
       if (FeedMiscPojo.hasFeedMiscPojoInit()) {
          q.r = FeedMiscPojo.isFeedRecommendEnabled() ^ 0x01;
          q.s = FeedMiscPojo.isCommercialRecommendEnabled() ^ 0x01;
       }
       this.X7(this.q.Vg().j().subscribe(new e1(this)));
       this.X7(this.q.Vg().l().subscribe(new f1(this)));
       this.X7(RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new m(this)));
       return;
    }
    public final boolean P8(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return SlideGuideManager.a().b(p0);
    }
    public final void S8(){
       String obj;
       int b2;
       d uod;
       e uoe = e.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "6")) {
          return;
       }
       if (q.u) {
          return;
       }
       if (!FeedMiscPojo.hasFeedMiscPojoInit()) {
          return;
       }
       if (!this.q.Vg().a()) {
          return;
       }
       boolean b = true;
       if (!q.t) {
          obj = PatchProxy.apply(objArray, this, oq, "5");
          boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): FeedMiscPojo.isFeedRecommendEnabled() ^ b;
          if (b1 && !e.a()) {
             return;
          }
       }
    label_004b :
       if (b.a(-1608526086).S()) {
          return;
       }else if(!q.s){
          return;
       }else if(this.p != null){
          return;
       }else {
          obj = PatchProxy.apply(objArray, objArray, uoe, "3");
          int i = 0;
          if (obj != patchProxyRe) {
             b2 = obj.booleanValue();
          }else {
             long l = System.currentTimeMillis();
             long l1 = 0;
             long longx = b.a.getLong("show_commercial_reco_dialog_time", l1);
             if (a.d()) {
                b2 = l.e("KEY_RECO_DIALOG_COOL_DOWN", -1);
                if (b2 > 0) {
                   if (longx - l1 > 0 && (l - longx) - ((long)b2 * 1000) < 0) {
                   label_00a0 :
                      b2 = true;
                   }else {
                   label_00a2 :
                      b2 = false;
                   }
                }
             }
             if (longx - l1 > 0 && (l - longx) - 0x1b77400 < 0) {
                goto label_00a0 ;
             }else {
                goto label_00a2 ;
             }
          }
          if (b2) {
             return;
          }else {
             Activity activity = this.getActivity();
             if (activity != null && !activity.isFinishing()) {
                if (this.P8(activity)) {
                   return;
                }else {
                   q.u = b;
                   if (!PatchProxy.applyVoidOneRefs(activity, this, oq, "11")) {
                      h1 oh1 = new h1(this, activity);
                      obj = a1.p(R.string.arg_RES_7f103ad3);
                      String str = a1.p(R.string.arg_RES_7f103ad2);
                      String str1 = a1.p(R.string.arg_RES_7f103ad1);
                      if (PatchProxy.isSupport(uoe)) {
                         Object[] objArray1 = new Object[]{activity,oh1,obj,str,str1};
                         if (!PatchProxy.applyVoid(objArray1, objArray, uoe, "1")) {
                         }
                      }else {
                      }
                   }
                }
             }
             return;
          }
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
