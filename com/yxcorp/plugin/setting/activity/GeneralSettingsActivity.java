package com.yxcorp.plugin.setting.activity.GeneralSettingsActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import jgd.v;
import yfd.d;
import com.yxcorp.plugin.setting.fragment.SettingListFragment;
import java.util.ArrayList;
import xgc.f;
import mw4.a;
import xgc.f$a;
import lnc.a1;
import jgd.g;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import tkd.b;
import tkd.d;
import gx5.d;
import kgd.f0;
import os5.l;
import us5.a;
import xgc.c;
import xgc.c$a;
import jgd.l;
import android.view.View$OnClickListener;
import jgd.h;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import com.yxcorp.plugin.setting.entries.holder.PendantSettingEntryHolder;
import kgd.u0;
import com.yxcorp.plugin.setting.entries.holder.d0;
import xgc.m;
import wkd.b;
import ho5.a;
import jgd.u;
import io5.a;
import jgd.j;
import com.kwai.sdk.switchconfig.a;
import jgd.k;
import com.yxcorp.plugin.setting.helper.j;
import com.kwai.framework.model.user.QCurrentUser;
import jgd.r;
import com.kwai.social.startup.relation.model.SocialShakeConfig;
import java.lang.reflect.Type;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import jgd.p;
import wgc.c;
import com.kwai.feature.component.photofeatures.reward.model.config.PhotoRewardSettingConfig;
import wy5.a;
import com.kwai.feature.component.photofeatures.reward.model.config.PhotoRewardSettingConfig$RewardSetting;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import jgd.t;
import java.lang.Boolean;
import wh5.c;
import lnc.s6;
import jgd.s;
import java.util.List;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;

public class GeneralSettingsActivity extends GifshowActivity	// class@00080a
{
    public BaseFragment y;
    public static final int z;

    public void GeneralSettingsActivity(){
       super();
    }
    public int f(){
       GeneralSettingsActivity obj = PatchProxy.apply(null, this, GeneralSettingsActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public int getPage(){
       return 0x75a7;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GeneralSettingsActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       GeneralSettingsActivity obj = PatchProxy.apply(null, this, GeneralSettingsActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       String url = (obj != null)? obj.getUrl(): "";
       return url;
    }
    public void onCreate(Bundle p0){
       String str2;
       f$a uoa1;
       ClientEvent$ElementPackage obj2;
       boolean b3;
       boolean b4;
       f$a uoa2;
       f$a uoa3;
       k obj5;
       j obj6;
       BaseFragment uBaseFragmen = this;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, uBaseFragmen, GeneralSettingsActivity.class, str)) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       v ov = v.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f$a obj = null;
       SettingListFragment settingListF = PatchProxy.applyOneRefs(uBaseFragmen, obj, d.class, str);
       if (settingListF != patchProxyRe) {
       }else {
          settingListF = new SettingListFragment();
          ArrayList uArrayList = new ArrayList();
          f uof = PatchProxy.apply(obj, obj, ov, "20");
          boolean b = true;
          if (uof != patchProxyRe) {
          }else {
             uoa3 = new f$a().c(0, a1.p(R.string.arg_RES_7f10470d), null, null, 0);
             uoa3.d(g.a);
             uoa3.b(a.i());
             uof = uoa3.e((d.a(-1188553266).Wt() ^ b)).a();
          }
          uArrayList.add(uof);
          uArrayList.add(new f0(uBaseFragmen));
          a uoa = d.a(-1492894991).H60();
          String str1 = "4";
          c uoc = PatchProxy.applyTwoRefsWithListener(uBaseFragmen, uoa, obj, ov, str1);
          boolean b1 = false;
          if (uoc != patchProxyRe) {
          }else {
             c$a uoa4 = new c$a().c(0, uBaseFragmen.getString(R.string.arg_RES_7f1046ea), null, null, R.drawable.arg_RES_7f081084);
             l ol = new l();
             ol.b = uBaseFragmen;
             uoa4.d(ol);
             b3 = (uoa.d() && (!uoa.a() || !uoa.b()))? true: false;
             uoa4.b(b3);
             uoc = uoa4.a();
             PatchProxy.onMethodExit(ov, str1);
          }
          uArrayList.add(uoc);
          uof = PatchProxy.apply(obj, obj, ov, "17");
          if (uof != patchProxyRe) {
          }else {
             uoa1 = new f$a().c(0, a1.p(R.string.arg_RES_7f1046a9), null, null, R.drawable.arg_RES_7f081084);
             uoa1.d(h.a);
             uoa1 = uoa1.e(DanmakuSwitchUtils.h.d());
             b4 = (DanmakuSwitchUtil.b.a() > 0)? true: false;
             uoa1.b(b4);
             uof = uoa1.a();
          }
          uArrayList.add(uof);
          uArrayList.add(new PendantSettingEntryHolder(uBaseFragmen));
          uArrayList.add(new u0(uBaseFragmen));
          uArrayList.add(new d0(uBaseFragmen));
          uArrayList.add(new m());
          uof = PatchProxy.applyOneRefs(uBaseFragmen, obj, ov, "18");
          if (uof != patchProxyRe) {
          }else {
             uoa2 = new f$a().c(0, uBaseFragmen.getString(R.string.arg_RES_7f103bd7), null, null, 0);
             u ou = new u();
             ou.a = uBaseFragmen;
             uoa2.d(ou);
             uoa2.b(b.a(-607332832).G());
             uof = uoa2.e(b.a(-607332832).u()).a();
          }
          uArrayList.add(uof);
          uof = PatchProxy.applyOneRefs(uBaseFragmen, obj, ov, "19");
          if (uof != patchProxyRe) {
          }else {
             uoa2 = new f$a().c(0, uBaseFragmen.getString(R.string.arg_RES_7f1046f0), null, uBaseFragmen.getString(R.string.arg_RES_7f1046ef), 0);
             obj6 = new j(uBaseFragmen);
             obj6.a = uBaseFragmen;
             uoa2.d(obj6);
             uoa2.b(b.a(-468808496).c());
             uof = uoa2.e((b.a(-468808496).a() ^ 0x01)).a();
          }
          uArrayList.add(uof);
          uof = PatchProxy.applyOneRefs(uBaseFragmen, obj, ov, "1");
          if (uof != patchProxyRe) {
          }else {
             b3 = a.t().d("showPreuploadWitchAdr", b1);
             uoa3 = new f$a().c(0, uBaseFragmen.getString(R.string.arg_RES_7f103e47), null, uBaseFragmen.getString(R.string.arg_RES_7f103e46), 0);
             obj5 = new k();
             obj6 = PatchProxy.applyOneRefs(uBaseFragmen, obj5, k.class, "3");
             if (obj6 != patchProxyRe) {
                obj5 = obj6;
             }else {
                obj5.a = uBaseFragmen;
                obj5.b = new j(uBaseFragmen);
             }
             uoa3.d(obj5);
             boolean b5 = (!QCurrentUser.ME.isWifiPreloadDeny() && b3)? true: false;
             uoa3 = uoa3.e(b5);
             uoa3.b(b3);
             uof = uoa3.a();
          }
          uArrayList.add(uof);
          uof = PatchProxy.applyOneRefs(uBaseFragmen, obj, ov, "13");
          if (uof != patchProxyRe) {
          }else {
             uoa1 = new f$a().c(0, uBaseFragmen.getString(R.string.arg_RES_7f104703), null, null, R.drawable.arg_RES_7f081084);
             r or = new r();
             obj5 = PatchProxy.applyOneRefs(uBaseFragmen, or, r.class, str);
             or = (obj5 != patchProxyRe)? obj5: new j(uBaseFragmen);
             uoa1.d(or);
             uof = uoa1.e((QCurrentUser.ME.isScreenshotFeedbackDisabled() ^ b)).a();
          }
          uArrayList.add(uof);
          uof = PatchProxy.applyOneRefs(uBaseFragmen, obj, ov, "12");
          if (uof != patchProxyRe) {
          }else {
             SocialShakeConfig socialShakeC = a.y(SocialShakeConfig.class);
             b3 = (socialShakeC != null && socialShakeC.enableShake())? true: false;
             b4 = (QCurrentUser.ME.isShakeFriendEnabled() && b3)? true: false;
             if (b3) {
                obj2 = new ClientEvent$ElementPackage();
                obj2.action2 = "SHAKE_SET_BUTTON";
                i3 oi3 = i3.f();
                int i = (b4)? 1: 2;
                oi3.c("status", Integer.valueOf(i));
                obj2.params = oi3.e();
                u1.C0("3378122", uBaseFragmen, 3, obj2, obj);
             }
             uoa2 = new f$a().c(0, uBaseFragmen.getString(R.string.arg_RES_7f103afb), null, uBaseFragmen.getString(R.string.box), 0);
             p op = new p(b4);
             Object obj4 = PatchProxy.applyOneRefs(uBaseFragmen, op, p.class, str);
             if (obj4 != patchProxyRe) {
                op = obj4;
             }else {
                op.a = uBaseFragmen;
                op.b = new j(uBaseFragmen);
             }
             uoa2.d(op);
             uoa3 = uoa2.e(b4);
             uoa3.b(b3);
             uof = uoa3.a();
          }
          uArrayList.add(uof);
          uof = PatchProxy.applyOneRefs(uBaseFragmen, obj, ov, "16");
          if (uof != patchProxyRe) {
          }else {
             PhotoRewardSettingConfig photoRewardS = a.e(PhotoRewardSettingConfig.class);
             if (photoRewardS != null) {
                PhotoRewardSettingConfig mRewardSetti = photoRewardS.mRewardSetting;
                if (mRewardSetti != null && !TextUtils.x(mRewardSetti.mText)) {
                   PhotoRewardSettingConfig$RewardSetting obj3 = photoRewardS.mRewardSetting.mText;
                label_0367 :
                   PhotoRewardSettingConfig$RewardSetting rewardSettin = str1;
                   if (photoRewardS != null) {
                      mRewardSetti = photoRewardS.mRewardSetting;
                      if (mRewardSetti != null && !TextUtils.x(mRewardSetti.mExplain)) {
                         str2 = photoRewardS.mRewardSetting.mExplain;
                      label_0383 :
                         uoa1 = new f$a().c(0, rewardSettin, null, str2, 0);
                         t ot = new t();
                         obj2 = PatchProxy.applyOneRefs(uBaseFragmen, ot, t.class, str);
                         ot = (obj2 != patchProxyRe)? obj2: new j(uBaseFragmen);
                         uoa1.d(ot);
                         uoa1 = uoa1.e(QCurrentUser.ME.isAllowOthersRewardMe());
                         obj3 = PatchProxy.apply(obj, obj, ov, "15");
                         if (obj3 != patchProxyRe) {
                            b = obj3.booleanValue();
                         }else {
                            mRewardSetti = a.e(PhotoRewardSettingConfig.class);
                            if (mRewardSetti != null) {
                               mRewardSetti = mRewardSetti.mRewardSetting;
                               if (mRewardSetti == null || (mRewardSetti.mEnable == null || c.b())) {
                               }
                            }else {
                            }
                         }
                         uoa1.b(b);
                         uof = uoa1.a();
                      }
                   }
                   str2 = a1.p(R.string.arg_RES_7f104304);
                   goto label_0383 ;
                }
             }
             str1 = a1.p(R.string.arg_RES_7f104305);
             goto label_0367 ;
          }
          uArrayList.add(uof);
          f uof1 = PatchProxy.applyOneRefs(uBaseFragmen, obj, ov, "14");
          if (uof1 != patchProxyRe) {
          }else {
             boolean b2 = s6.d();
             obj = new f$a().c(0, uBaseFragmen.getString(R.string.arg_RES_7f104024), null, null, R.drawable.arg_RES_7f081084);
             s os = new s();
             Object obj1 = PatchProxy.applyOneRefs(uBaseFragmen, os, s.class, str);
             os = (obj1 != patchProxyRe)? obj1: new j(uBaseFragmen);
             obj.d(os);
             obj.b(b2);
             uof1 = obj.e(QCurrentUser.ME.isAddWatermarkEnabled()).a();
          }
          uArrayList.add(uof1);
          uArrayList.add(new m());
          settingListF.dh(uArrayList);
          settingListF.eh(R.string.arg_RES_7f101233);
       }
       uBaseFragmen.y = settingListF;
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(0x1020002, uBaseFragmen.y);
       uoe.m();
       return;
    }
}
