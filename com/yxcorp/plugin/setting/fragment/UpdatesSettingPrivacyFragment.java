package com.yxcorp.plugin.setting.fragment.UpdatesSettingPrivacyFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tgd.g;
import com.yxcorp.plugin.setting.presenter.m;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import pgd.y;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import lnc.g2;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ggd.n;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import ogd.d;
import android.view.View$OnClickListener;
import androidx.fragment.app.FragmentActivity;
import k2b.e0;
import sgd.b;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public class UpdatesSettingPrivacyFragment extends BaseFragment implements g2$a	// class@0008b0
{
    public KwaiActionBar j;
    public g2 k;
    public n l;
    public PresenterV2 m;
    public static final int n;

    public void UpdatesSettingPrivacyFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, UpdatesSettingPrivacyFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       this.m = obj;
       obj.U7(new g());
       this.m.U7(new m());
       PatchProxy.onMethodExit(UpdatesSettingPrivacyFragment.class, "6");
       return this.m;
    }
    public int M(){
       return 1;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, UpdatesSettingPrivacyFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getPageParams();
       String str = "status="+y.c(QCurrentUser.ME.getNewsPrivate());
       String str1 = "gift_send_status="+(QCurrentUser.ME.isAllowPushMyCommentsToOther() ^ 0x01);
       if (TextUtils.x(obj)) {
          return obj;
       }
       return obj+"&"+str+"&"+str1;
    }
    public String getUrl(){
       return "ks://settings";
    }
    public String o(){
       return "NEWS_PRIVACY_SETTING";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UpdatesSettingPrivacyFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.k = new g2(this, this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, UpdatesSettingPrivacyFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d11b1, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       QCurrentUser qCurrentUser;
       QCurrentUser qCurrentUser1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UpdatesSettingPrivacyFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       UpdatesSettingPrivacyFragment tk = this.k;
       if (tk != null) {
          UpdatesSettingPrivacyFragment updatesSetti = PatchProxy.apply(null, this, UpdatesSettingPrivacyFragment.class, "4");
          if (updatesSetti != PatchProxyResult.class) {
          }else if(this.l == null){
             this.l = new n(this);
          }
          updatesSetti = this.l;
          tk.b(updatesSetti);
       }
       KwaiActionBar kwaiActionBa = m1.f(p0, R.id.title_root);
       this.j = kwaiActionBa;
       kwaiActionBa.i(R.drawable.arg_RES_7f0819d9);
       this.j.q(R.string.arg_RES_7f100a6b);
       m1.a(p0, new d(this), R.id.left_btn);
       e0 activity = this.getActivity();
       int newsPrivate = QCurrentUser.ME.getNewsPrivate();
       b uob = 1;
       if (newsPrivate) {
          if (newsPrivate != uob) {
             qCurrentUser = 2;
             if (newsPrivate != qCurrentUser) {
                qCurrentUser = 3;
                if (newsPrivate != qCurrentUser) {
                   newsPrivate = 6;
                }
             }
          }else {
             qCurrentUser = 1;
          }
          qCurrentUser1 = qCurrentUser;
       }else {
          qCurrentUser1 = 0;
       }
       int i = QCurrentUser.ME.isGiftUnfollow() ^ 0x01;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(activity, Integer.valueOf(newsPrivate), Boolean.valueOf(i), null, b.class, "6")) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = "NEWS_PRIVACY_SETTING";
          i3 oi3 = i3.f();
          oi3.c("status", Integer.valueOf(newsPrivate));
          oi3.a("gift_send_status", Boolean.valueOf(i));
          urlPackage.params = oi3.e();
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.urlPackage = urlPackage;
          showEvent.elementPackage = new ClientEvent$ElementPackage();
          b.a(0x4b316083).W0(null, showEvent, activity);
       }
       return;
    }
}
