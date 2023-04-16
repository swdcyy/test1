package com.yxcorp.plugin.setting.fragment.AlbumSettingFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.setting.presenter.h;
import com.yxcorp.plugin.setting.presenter.e;
import com.kwai.framework.abtest.f;
import com.yxcorp.plugin.setting.presenter.j;
import android.os.Bundle;
import lnc.g2;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ggd.a;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import ogd.a;
import android.view.View$OnClickListener;
import androidx.fragment.app.FragmentActivity;
import k2b.e0;
import com.kwai.framework.model.user.QCurrentUser;
import lu7.f;
import pgd.y;
import sgd.b;

public class AlbumSettingFragment extends BaseFragment implements g2$a	// class@0008a7
{
    public g2 j;
    public static final int k;

    public void AlbumSettingFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, AlbumSettingFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new h());
       obj.U7(new e());
       if (f.a("updateone")) {
          obj.U7(new j());
       }
       PatchProxy.onMethodExit(AlbumSettingFragment.class, "6");
       return obj;
    }
    public int M(){
       return 1;
    }
    public String getUrl(){
       return "ks://settings";
    }
    public String o(){
       return "ALBUM_PRIVACY_SETTING";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSettingFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.j = new g2(this, this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AlbumSettingFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d00ae, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumSettingFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       AlbumSettingFragment tj = this.j;
       if (tj != null) {
          tj.b(new a(this));
       }
       KwaiActionBar kwaiActionBa = m1.f(p0, R.id.title_root);
       kwaiActionBa.i(R.drawable.arg_RES_7f0819d9);
       kwaiActionBa.q(R.string.arg_RES_7f103e22);
       m1.a(p0, new a(this), R.id.left_btn);
       b.g(this.getActivity(), y.b(f.k(QCurrentUser.ME)), (QCurrentUser.ME.isAllowPushMyCommentsToOther() ^ 0x01));
       return;
    }
}
