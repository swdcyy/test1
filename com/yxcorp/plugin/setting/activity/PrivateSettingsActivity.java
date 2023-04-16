package com.yxcorp.plugin.setting.activity.PrivateSettingsActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchFeatureSwitchPackage;
import java.util.ArrayList;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeatureSwitchPackage;
import com.kwai.framework.model.user.QCurrentUser;
import lu7.f;
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
import kgd.i1;
import kgd.g1;
import kgd.g1$a;
import jgd.e;
import android.view.View$OnClickListener;
import jgd.f;
import kgd.l0;
import com.yxcorp.plugin.setting.entries.holder.y;
import com.yxcorp.plugin.setting.entries.holder.e0;
import com.yxcorp.plugin.setting.entries.holder.v0;
import com.yxcorp.plugin.setting.entries.holder.m0;
import com.yxcorp.plugin.setting.entries.holder.s;
import com.yxcorp.plugin.setting.entries.holder.n;
import com.kwai.sdk.switchconfig.a;
import kgd.c;
import com.yxcorp.plugin.setting.entries.holder.g;
import com.yxcorp.plugin.setting.entries.holder.t;
import com.yxcorp.plugin.setting.entries.holder.m;
import com.yxcorp.plugin.setting.entries.holder.u0;
import com.yxcorp.plugin.setting.entries.holder.i;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import tac.b;
import jgd.a;
import jgd.b;
import com.yxcorp.plugin.setting.entries.holder.p;
import jgd.d;
import com.yxcorp.plugin.setting.entries.holder.o0;
import jgd.n;
import com.yxcorp.plugin.setting.entries.holder.i0;
import com.yxcorp.plugin.setting.entries.holder.k;
import com.yxcorp.plugin.setting.entries.holder.j0;
import java.util.List;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;

public class PrivateSettingsActivity extends GifshowActivity	// class@00080d
{
    public BaseFragment y;
    public static final int z;

    public void PrivateSettingsActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public ClientContent$ContentPackage Nf(){
       ClientContent$BatchFeatureSwitchPackage obj = PatchProxy.apply(null, this, PrivateSettingsActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$BatchFeatureSwitchPackage();
       ArrayList uArrayList = new ArrayList();
       ClientContent$FeatureSwitchPackage uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "hide_location";
       uFeatureSwit.on = QCurrentUser.ME.isPrivateLocation();
       uArrayList.add(uFeatureSwit);
       uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "private_user";
       uFeatureSwit.on = QCurrentUser.ME.isPrivateUser();
       uArrayList.add(uFeatureSwit);
       uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "Comment_condition";
       uFeatureSwit.on = f.k(QCurrentUser.ME) ^ 0x01;
       uArrayList.add(uFeatureSwit);
       uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "Recommended_condition";
       uFeatureSwit.on = QCurrentUser.ME.isNotRecommendToContacts();
       uArrayList.add(uFeatureSwit);
       uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "pymk_condition";
       uFeatureSwit.on = QCurrentUser.ME.isRecommendToOthers();
       uArrayList.add(uFeatureSwit);
       uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "news_hide_settings";
       uFeatureSwit.on = QCurrentUser.ME.isPrivateNews();
       uArrayList.add(uFeatureSwit);
       uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "follow_list";
       uFeatureSwit.on = QCurrentUser.ME.isPublicFollow();
       uArrayList.add(uFeatureSwit);
       uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "close_same_follow";
       uFeatureSwit.on = QCurrentUser.ME.isCloseSameFollow();
       uArrayList.add(uFeatureSwit);
       uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "forbid_live_share";
       uFeatureSwit.on = QCurrentUser.ME.isNotShareLiveStreamSegment();
       uArrayList.add(uFeatureSwit);
       ClientContent$FeatureSwitchPackage[] uFeatureSwit1 = new ClientContent$FeatureSwitchPackage[0];
       obj.featureSwitchPackage = uArrayList.toArray(uFeatureSwit1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.batchFeatureSwitchPackage = obj;
       return uContentPack;
    }
    public int f(){
       PrivateSettingsActivity obj = PatchProxy.apply(null, this, PrivateSettingsActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public int getPage(){
       return 45;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PrivateSettingsActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       PrivateSettingsActivity obj = PatchProxy.apply(null, this, PrivateSettingsActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       String url = (obj != null)? obj.getUrl(): "";
       return url;
    }
    public void onCreate(Bundle p0){
       g1$a uoa2;
       if (PatchProxy.applyVoidOneRefs(p0, this, PrivateSettingsActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       v ov = v.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       SettingListFragment settingListF = PatchProxy.applyOneRefs(this, obj, d.class, "1");
       if (settingListF != patchProxyRe) {
       }else {
          settingListF = new SettingListFragment();
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new i1(this.getString(R.string.arg_RES_7f1016d8)));
          g1 og1 = PatchProxy.applyOneRefs(this, obj, ov, "6");
          if (og1 != patchProxyRe) {
          }else {
             uoa2 = new g1$a().c(R.drawable.arg_RES_7f080574, this.getString(R.string.arg_RES_7f100a6b), null, null, 0);
             uoa2.d(new e(this, "NEWS_PRIVACY_BUTTON"));
             og1 = uoa2.a();
          }
          uArrayList.add(og1);
          og1 = PatchProxy.applyOneRefs(this, obj, ov, "7");
          if (og1 != patchProxyRe) {
          }else {
             uoa2 = new g1$a().c(R.drawable.arg_RES_7f080524, this.getString(R.string.arg_RES_7f10076c), null, null, 0);
             uoa2.d(new f(this, "COMMENT_BUTTON"));
             og1 = uoa2.a();
          }
          uArrayList.add(og1);
          uArrayList.add(new l0(this));
          uArrayList.add(new y(this));
          uArrayList.add(new e0(this));
          uArrayList.add(new v0(this));
          uArrayList.add(new m0(this));
          uArrayList.add(new s(this));
          uArrayList.add(new n(this));
          if (a.t().d("enableSettingBaseSafe", false)) {
             uArrayList.add(new c(this));
          }
          uArrayList.add(new i1(this.getString(R.string.arg_RES_7f104248)));
          uArrayList.add(new g(this));
          uArrayList.add(new t(this));
          uArrayList.add(new m(this));
          uArrayList.add(new u0(this));
          uArrayList.add(new i(this));
          og1 = PatchProxy.applyOneRefs(this, obj, ov, "8");
          g1$a uoa = -1578665399;
          if (og1 != patchProxyRe) {
          }else {
             uoa2 = new g1$a().c(R.drawable.arg_RES_7f08220e, this.getString(R.string.arg_RES_7f1010c0), null, null, 0);
             uoa2.b(b.a(uoa).c());
             uoa2.d(new a(this));
             og1 = uoa2.a();
          }
          uArrayList.add(og1);
          og1 = PatchProxy.applyOneRefs(this, obj, ov, "9");
          if (og1 != patchProxyRe) {
          }else {
             uoa2 = new g1$a().c(R.drawable.arg_RES_7f08220c, this.getString(R.string.arg_RES_7f1010c2), null, null, 0);
             uoa2.b(b.a(uoa).x());
             uoa2.d(new b(this));
             og1 = uoa2.a();
          }
          uArrayList.add(og1);
          uArrayList.add(new p(this));
          og1 = PatchProxy.applyOneRefs(this, obj, ov, "11");
          if (og1 != patchProxyRe) {
          }else {
             uoa2 = new g1$a().c(R.drawable.arg_RES_7f080519, this.getString(R.string.arg_RES_7f1003ba), null, null, 0);
             uoa2.d(new d(this, "BLACK_LIST"));
             og1 = uoa2.a();
          }
          uArrayList.add(og1);
          uArrayList.add(new i1(this.getString(R.string.arg_RES_7f103b43)));
          uArrayList.add(new o0(this));
          g1 og11 = PatchProxy.applyOneRefs(this, obj, ov, "10");
          if (og11 != patchProxyRe) {
          }else {
             g1$a uoa1 = new g1$a().c(R.drawable.arg_RES_7f081cc9, this.getString(R.string.arg_RES_7f103e22), null, null, 0);
             uoa1.d(new n(this, "ALBUM_BUTTON"));
             og11 = uoa1.a();
          }
          uArrayList.add(og11);
          uArrayList.add(new i0(this));
          uArrayList.add(new k(this));
          uArrayList.add(new j0(this));
          settingListF.dh(uArrayList);
          settingListF.eh(R.string.arg_RES_7f103e49);
       }
       this.y = settingListF;
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(0x1020002, this.y);
       uoe.m();
       return;
    }
}
