package com.yxcorp.login.authorization.fragment.HalfScreenAuthLandscapeFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.login.authorization.fragment.a;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.login.authorization.fragment.b;
import lnc.c3$a;
import lnc.c3;
import y0d.e;
import androidx.fragment.app.Fragment;
import z1.a;
import y0d.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

public class HalfScreenAuthLandscapeFragment extends ContainerFragment implements g2$a	// class@001a34
{
    public a x;
    public static final int y;

    public void HalfScreenAuthLandscapeFragment(){
       super();
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, HalfScreenAuthLandscapeFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(HalfScreenAuthLandscapeFragment.class, "5");
       return this.x.a(this);
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HalfScreenAuthLandscapeFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       c3.c(this.getDialog(), b.a);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HalfScreenAuthLandscapeFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       a.a(this, new e(this));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, HalfScreenAuthLandscapeFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return this.x.b(p0, p1);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HalfScreenAuthLandscapeFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.x.c(this, this);
       return;
    }
}
