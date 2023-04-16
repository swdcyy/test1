package com.yxcorp.gifshow.reminder.krn.ReminderMixContainerFragment;
import lnc.g2$a;
import hka.l;
import hka.m;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rec.n;
import rec.f;
import rec.e;
import tkd.b;
import tkd.d;
import cv5.a;
import pec.a;
import java.lang.ref.WeakReference;
import js6.a;
import androidx.fragment.app.Fragment;
import hka.j;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import rx5.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.reminder.krn.ReminderMixRnFragment;
import java.lang.Integer;
import com.kuaishou.krn.model.LaunchModel;
import android.net.Uri;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.reminder.krn.model.NoticeRnSwitchModel;
import java.lang.reflect.Type;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.x0;
import android.net.Uri$Builder;
import com.yxcorp.gifshow.reminder.krn.ReminderMixRnConfig;
import com.kwai.social.startup.reminder.model.NotifyMixConfig;
import mw4.a;
import com.kwai.social.startup.reminder.model.NewsSlidePlayConfig;
import com.yxcorp.gifshow.reminder.krn.ReminderMixRnConfig$PymkConfig;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.krn.model.LaunchModel$b;
import java.util.Set;
import java.util.Iterator;
import android.os.Parcelable;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import lnc.g2;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import pec.h;
import lkd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import pec.i;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import pec.j;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import nfc.d;

public class ReminderMixContainerFragment extends LazyInitSupportedFragment implements g2$a, l, m	// class@001ae3
{
    public g2 s;
    public a t;
    public int u;
    public static final int v;

    public void ReminderMixContainerFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ReminderMixContainerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new n());
       obj.U7(new f());
       obj.U7(new e());
       PresenterV2 presenterV2 = d.a(-1606375212).NU();
       if (presenterV2 != null) {
          obj.U7(presenterV2);
       }
       PatchProxy.onMethodExit(ReminderMixContainerFragment.class, "5");
       return obj;
    }
    public void N1(){
       if (PatchProxy.applyVoid(null, this, ReminderMixContainerFragment.class, "8")) {
          return;
       }
       ReminderMixContainerFragment tt = this.t;
       if (tt != null) {
          a e = tt.e;
          if (e != null && e.get() != null) {
             a.b.X8(this.t.e.get(), "scrollToTop", null);
          }
       }
       return;
    }
    public boolean S0(){
       return j.d(this);
    }
    public boolean S1(){
       return j.b(this);
    }
    public boolean Xg(){
       return false;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ReminderMixContainerFragment.class, "7")) {
          return;
       }
       ReminderMixContainerFragment tt = this.t;
       if (tt != null) {
          a e = tt.e;
          if (e != null && e.get() != null) {
             a.b.X8(this.t.e.get(), "pullRefresh", null);
          }
       }
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReminderMixContainerFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d1305, p1, false);
    }
    public int f(){
       return 17;
    }
    public void fh(View p0,Bundle p1){
       ReminderMixRnFragment reminderMixR;
       LaunchModel launchModel;
       Uri uri;
       String str1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReminderMixContainerFragment.class, "4")) {
          return;
       }
       int i = 1;
       View[] viewArray = new View[i];
       int i1 = 0;
       viewArray[i1] = p0;
       d.a(0x77cfa10c).Qa(this, viewArray);
       ReminderMixContainerFragment tu = this.u;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = null;
       if (PatchProxy.isSupport(ReminderMixRnFragment.class)) {
          reminderMixR = PatchProxy.applyOneRefs(Integer.valueOf(tu), obj, ReminderMixRnFragment.class, "1");
          if (reminderMixR != patchProxyRe) {
          label_0182 :
             e uoe = this.getChildFragmentManager().beginTransaction();
             uoe.v(R.id.fragment_container, reminderMixR);
             uoe.m();
             uoe.e = new WeakReference(reminderMixR);
             this.s.b(this.t);
             reminderMixR.mg(i);
             reminderMixR.ba(new h(this));
             FragmentEvent dESTROY_VIEW = FragmentEvent.DESTROY_VIEW;
             this.Vg().i().compose(c.c(this.m(), dESTROY_VIEW)).subscribe(new i(reminderMixR), h.b);
             this.Vg().l().compose(c.c(this.m(), dESTROY_VIEW)).subscribe(new j(reminderMixR), h.b);
             return;
          }
       }
       reminderMixR = new ReminderMixRnFragment();
       Bundle uBundle = new Bundle();
       if (PatchProxy.isSupport(ReminderMixRnFragment.class)) {
          launchModel = PatchProxy.applyOneRefs(Integer.valueOf(tu), obj, ReminderMixRnFragment.class, "3");
          if (launchModel != patchProxyRe) {
          label_017a :
             uBundle.putParcelable("rn_launch_model", launchModel);
             reminderMixR.setArguments(uBundle);
             goto label_0182 ;
          }
       }
       if (PatchProxy.isSupport(ReminderMixRnFragment.class)) {
          uri = PatchProxy.applyOneRefs(Integer.valueOf(tu), obj, ReminderMixRnFragment.class, "2");
          if (uri != patchProxyRe) {
          label_0123 :
             LaunchModel$b uob = new LaunchModel$b();
             if (uri != null) {
                Iterator iterator = x0.c(uri).iterator();
                while (iterator.hasNext()) {
                   obj = iterator.next();
                   String str = x0.a(uri, obj);
                   if (TextUtils.n(obj, "title")) {
                      uob.m(str);
                   }else if(TextUtils.n(obj, "bundleId")){
                      uob.i(str);
                   }else if(TextUtils.n(obj, "componentName")){
                      uob.j(str);
                   }else {
                      uob.e(obj, str);
                   }
                }
             }
             uob.e("containerSource", "ReminderMixRnFragment");
             uob.f("enableBackBtnHandler", i1);
             launchModel = uob.h();
             goto label_017a ;
          }
       }
       NoticeRnSwitchModel noticeRnSwit = PatchProxy.apply(obj, obj, ReminderMixRnFragment.class, "5");
       if (noticeRnSwit != patchProxyRe) {
       }else {
          NoticeRnSwitchModel value = a.t().getValue("MsgPageRNURI", NoticeRnSwitchModel.class, obj);
          noticeRnSwit = (value != null && !TextUtils.x(value.noticeUrl))? value.noticeUrl: "kwai://kds/react?bundleId=SocialNotice&componentName=SocialNotice";
       }
       Uri$Builder uBuilder = x0.f(noticeRnSwit).buildUpon();
       ReminderMixRnConfig reminderMixR1 = new ReminderMixRnConfig();
       NotifyMixConfig notifyMixCon = a.m(NotifyMixConfig.class);
       reminderMixR1.notifyMixConfig = notifyMixCon;
       if (notifyMixCon == null) {
          reminderMixR1.notifyMixConfig = new NotifyMixConfig();
       }
       NewsSlidePlayConfig newsSlidePla = a.l(NewsSlidePlayConfig.class);
       reminderMixR1.newsSlideConfig = newsSlidePla;
       if (newsSlidePla == null) {
          reminderMixR1.newsSlideConfig = new NewsSlidePlayConfig();
       }
       ReminderMixRnConfig$PymkConfig pymkConfig = new ReminderMixRnConfig$PymkConfig();
       reminderMixR1.pymkConfig = pymkConfig;
       pymkConfig.isSocialHoldoutEnabled = HoldoutConfigUtilKt.a();
       if (tu == i) {
          reminderMixR1.positionStyle = 2;
       }else if(tu == null){
          reminderMixR1.positionStyle = i;
       }else {
          reminderMixR1.positionStyle = i1;
       }
       uBuilder.appendQueryParameter("configParam", a.a.q(reminderMixR1));
       if (reminderMixR1.notifyMixConfig != null) {
          reminderMixR1 = reminderMixR1.newsSlideConfig;
          if (reminderMixR1 != null && (reminderMixR1.mEnable != null && (tu == null || (tu == i && !HoldoutConfigUtilKt.a())))) {
             str1 = 1;
          label_0113 :
             str1 = (str1)? "TRUE": "FALSE";
             uBuilder.appendQueryParameter("isShowSlideEntrance", str1);
             uri = uBuilder.build();
             goto label_0123 ;
          }
       }
    label_0112 :
       str1 = null;
       goto label_0113 ;
    }
    public String getPageParams(){
       JsonObject obj = PatchProxy.apply(null, this, ReminderMixContainerFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("container", "REACT_NATIVE");
       return obj.toString();
    }
    public String h5(){
       return "INTERACTIONS";
    }
    public boolean i0(){
       return j.c(this);
    }
    public boolean lh(){
       return true;
    }
    public boolean n5(){
       return j.e(this);
    }
    public String o(){
       return "INTERACTIONS";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReminderMixContainerFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.s = new g2(this, this);
       this.t = new a(this);
       this.u = d.a(this.getArguments());
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ReminderMixContainerFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       this.t = null;
       return;
    }
    public boolean u2(){
       return j.f(this);
    }
    public boolean x0(){
       return j.a(this);
    }
}
