package com.yxcorp.gifshow.growth.interest.fragment.InterestEditBottomFragment;
import com.yxcorp.gifshow.growth.interest.fragment.BaseInterestEditFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yna.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import yna.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;

public final class InterestEditBottomFragment extends BaseInterestEditFragment	// class@0013c1
{

    public void InterestEditBottomFragment(){
       super();
    }
    public void ch(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InterestEditBottomFragment.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       p0.U7(new a(this));
       p0.U7(new b());
       PatchProxy.onMethodExit(InterestEditBottomFragment.class, "1");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, InterestEditBottomFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d055c, p1, false);
    }
}
