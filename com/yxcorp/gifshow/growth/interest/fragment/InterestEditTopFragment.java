package com.yxcorp.gifshow.growth.interest.fragment.InterestEditTopFragment;
import com.yxcorp.gifshow.growth.interest.fragment.BaseInterestEditFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yna.c;
import yna.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;

public final class InterestEditTopFragment extends BaseInterestEditFragment	// class@0013c2
{

    public void InterestEditTopFragment(){
       super();
    }
    public void ch(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InterestEditTopFragment.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       p0.U7(new c());
       p0.U7(new e());
       PatchProxy.onMethodExit(InterestEditTopFragment.class, "1");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, InterestEditTopFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d055e, p1, false);
    }
}
