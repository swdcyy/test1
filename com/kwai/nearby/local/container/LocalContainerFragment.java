package com.kwai.nearby.local.container.LocalContainerFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.nearby.local.presenter.r;
import android.os.Bundle;
import dsb.d;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import krb.a;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import java.util.Objects;
import g2b.a;
import fm7.d;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import com.kwai.nearby.local.HomeLocalFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import k2b.e0;
import k2b.u1;
import lnc.g2;

public class LocalContainerFragment extends BaseFragment implements g2$a	// class@000f81
{
    public g2 j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;

    public void LocalContainerFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LocalContainerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new r(this.k));
       PatchProxy.onMethodExit(LocalContainerFragment.class, "5");
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalContainerFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       d.b(1024);
       if (!PatchProxy.applyVoid(null, this, LocalContainerFragment.class, "7") && this.getArguments() != null) {
          this.k = this.getArguments().getString("tab_name");
          this.l = this.getArguments().getString("fromSourceData");
          this.m = this.getArguments().getString("cityName");
          this.n = this.getArguments().getString("cityId");
          this.o = this.getArguments().getString("fromSource");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LocalContainerFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0ea4, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LocalContainerFragment.class, "8")) {
          return;
       }
       super.onDestroy();
       d.d();
       a uoa = a.b();
       LocalDelegateType aCTIVITY_LOC = LocalDelegateType.ACTIVITY_LOCAL;
       Objects.requireNonNull(uoa);
       LocalDelegateType hOME_LOCAL = LocalDelegateType.HOME_LOCAL;
       uoa.a = (aCTIVITY_LOC == hOME_LOCAL)? null: null;
       a.b = (aCTIVITY_LOC == hOME_LOCAL)? null: null;
       d.g(aCTIVITY_LOC.getValue(), 0);
       d.f(aCTIVITY_LOC.getValue(), null);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalContainerFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       HomeLocalFragment homeLocalFra = PatchProxy.apply(objArray, this, LocalContainerFragment.class, "6");
       if (homeLocalFra != PatchProxyResult.class) {
       }else {
          homeLocalFra = new HomeLocalFragment();
          Bundle uBundle = new Bundle();
          uBundle.putString("key_home_local_page_source", "activity_local");
          uBundle.putString("fromSourceData", this.l);
          uBundle.putString("cityName", this.m);
          uBundle.putString("cityId", this.n);
          uBundle.putString("fromSource", this.o);
          homeLocalFra.setArguments(uBundle);
       }
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.v(R.id.local_content_fragment, homeLocalFra);
       uoe.m();
       u1.L0(homeLocalFra);
       if (!PatchProxy.applyVoid(objArray, this, LocalContainerFragment.class, "4")) {
          if (this.j == null) {
             this.j = new g2(this, this);
          }
          objArray = new Object[]{this};
          this.j.b(objArray);
       }
       return;
    }
}
