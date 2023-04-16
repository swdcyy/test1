package com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustFragment$a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.yxcorp.gifshow.v3.mixed.editor.frame.c;
import com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustPresenter;

public class MixFrameAdjustFragment extends BaseFragment	// class@001549
{
    public b j;
    public View k;
    public PresenterV2 l;
    public MixFrameAdjustFragment$a m;

    public void MixFrameAdjustFragment(){
       super();
    }
    public void ch(boolean p0){
       if (PatchProxy.isSupport(MixFrameAdjustFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MixFrameAdjustFragment.class, "5")) {
          return;
       }
       MixFrameAdjustFragment tl = this.l;
       if (tl != null) {
          tl.destroy();
          this.l = null;
       }
       e uoe = this.getActivity().getSupportFragmentManager().beginTransaction();
       uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       uoe.u(this).m();
       tl = this.m;
       if (tl != null) {
          tl.a(p0);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixFrameAdjustFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       int i = (this.m != null && this.j != null)? 1: 0;
       if (!i) {
          this.ch(false);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MixFrameAdjustFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.k = a.g(p0, 0x7f0d0fcd, p1, false);
       if (!PatchProxy.applyVoid(null, this, MixFrameAdjustFragment.class, "3")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.l = presenterV2;
          presenterV2.U7(new c(this));
          this.l.U7(new MixFrameAdjustPresenter());
          this.l.f(this.k);
          Object[] objArray = new Object[]{this};
          this.l.i(objArray);
       }
       return this.k;
    }
}
