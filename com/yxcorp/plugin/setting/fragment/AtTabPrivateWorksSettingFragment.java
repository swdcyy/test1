package com.yxcorp.plugin.setting.fragment.AtTabPrivateWorksSettingFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.setting.fragment.AtTabPrivateWorksSettingFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.setting.presenter.AtMeTabSettingPresenter;
import tgd.l;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import lnc.g2;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.util.HashMap;
import ggd.e;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.yxcorp.plugin.setting.fragment.AtTabPrivateWorksSettingFragment$b;
import android.view.View$OnClickListener;

public final class AtTabPrivateWorksSettingFragment extends BaseFragment implements g2$a	// class@0008aa
{
    public KwaiActionBar j;
    public g2 k;
    public final int l;
    public final int m;
    public final int n;
    public HashMap o;
    public static final AtTabPrivateWorksSettingFragment$a p;

    static {
       AtTabPrivateWorksSettingFragment.p = new AtTabPrivateWorksSettingFragment$a(null);
    }
    public void AtTabPrivateWorksSettingFragment(){
       super(null, null, null, null, 15, null);
       this.l = 1;
       this.m = 2;
       this.n = 3;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, AtTabPrivateWorksSettingFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new AtMeTabSettingPresenter());
       obj.U7(new l());
       PatchProxy.onMethodExit(AtTabPrivateWorksSettingFragment.class, "4");
       return obj;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, AtTabPrivateWorksSettingFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.c("unshow_photos_num", Integer.valueOf(0));
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       mE.getMentionedMeWorksSetting();
       obj.c("who_can_view_my_be_at_list", Integer.valueOf(6));
       String str = obj.e();
       a.o(str, "JsonStringBuilder.newIns¡­g\)\n      \)\n      .build\(\)");
       return str;
    }
    public String o(){
       return "AT_PRIVACY_SETTING";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtTabPrivateWorksSettingFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.k = new g2(this, this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AtTabPrivateWorksSettingFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d00c8, p1, false);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, AtTabPrivateWorksSettingFragment.class, "9")) {
       }else {
          AtTabPrivateWorksSettingFragment to = this.o;
          if (to != null) {
             to.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AtTabPrivateWorksSettingFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       AtTabPrivateWorksSettingFragment tk = this.k;
       String str = "mPresenterManager";
       if (tk == null) {
          a.S(str);
       }
       if (tk != null) {
          tk = this.k;
          if (tk == null) {
             a.S(str);
          }
          e uoe = PatchProxy.apply(null, this, AtTabPrivateWorksSettingFragment.class, "6");
          if (uoe != PatchProxyResult.class) {
          }else {
             uoe = new e(this);
          }
          tk.b(uoe);
       }
       view = m1.f(p0, R.id.title_root);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.title_root\)");
       this.j = view;
       str = "mKwaiActionBar";
       if (view == null) {
          a.S(str);
       }
       view.i(R.drawable.arg_RES_7f0819d9);
       tk = this.j;
       if (tk == null) {
          a.S(str);
       }
       tk.q(R.string.arg_RES_7f100247);
       m1.a(p0, new AtTabPrivateWorksSettingFragment$b(this), R.id.left_btn);
       return;
    }
}
