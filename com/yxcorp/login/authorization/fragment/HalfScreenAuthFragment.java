package com.yxcorp.login.authorization.fragment.HalfScreenAuthFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.login.authorization.fragment.a;
import android.os.Bundle;
import y0d.d;
import androidx.fragment.app.Fragment;
import z1.a;
import y0d.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.fragment.app.DialogFragment;

public class HalfScreenAuthFragment extends BottomSheetFragment implements g2$a	// class@001a33
{
    public a z;
    public static final int A;

    public void HalfScreenAuthFragment(){
       super();
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, HalfScreenAuthFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(HalfScreenAuthFragment.class, "4");
       return this.z.a(this);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HalfScreenAuthFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       a.a(this, new d(this));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, HalfScreenAuthFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return this.z.b(p0, p1);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HalfScreenAuthFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.z.c(this, this);
       return;
    }
}
