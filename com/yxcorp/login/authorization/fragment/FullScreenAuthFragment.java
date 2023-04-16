package com.yxcorp.login.authorization.fragment.FullScreenAuthFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a1d.s1;
import a1d.n0;
import a1d.w;
import a1d.b1;
import a1d.p1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.authorization.AuthActivity;
import w0d.g;
import a1d.q0;
import a1d.j1;
import a1d.a0;
import a1d.m0;
import a1d.d1;
import android.os.Bundle;
import y0d.b;
import z1.a;
import y0d.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import lnc.g2;

public class FullScreenAuthFragment extends BaseFragment implements g2$a	// class@001a32
{
    public b j;
    public g2 k;

    public void FullScreenAuthFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, FullScreenAuthFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new s1(this));
       obj.U7(new n0());
       obj.U7(new w());
       obj.U7(new b1());
       obj.U7(new p1(this.getActivity()));
       obj.U7(new q0(this.getActivity()));
       obj.U7(new j1());
       obj.U7(new a0());
       obj.U7(new m0(this.getActivity()));
       obj.U7(new d1(this.getActivity()));
       PatchProxy.onMethodExit(FullScreenAuthFragment.class, "5");
       return obj;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FullScreenAuthFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FullScreenAuthFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       a.a(this, new b(this));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FullScreenAuthFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d053c, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FullScreenAuthFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.k == null) {
          this.k = new g2(this, this);
       }
       Object[] objArray = new Object[]{this.j,this};
       this.k.b(objArray);
       return;
    }
}
