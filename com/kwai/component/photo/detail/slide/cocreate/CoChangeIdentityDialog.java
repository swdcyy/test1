package com.kwai.component.photo.detail.slide.cocreate.CoChangeIdentityDialog;
import ml8.d;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import crd.a;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kwai.component.photo.detail.slide.cocreate.CoChangeIdentityDialog$a;
import android.view.View$OnClickListener;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oe5.i;
import im8.c;
import java.lang.Integer;

public class CoChangeIdentityDialog extends BottomSheetFragment implements d	// class@000a45
{
    public PresenterV2 A;
    public String B;
    public int C;
    public BaseFragment D;
    public a z;
    public static final int E;

    public void CoChangeIdentityDialog(){
       super();
       this.z = new a();
    }
    public void doBindView(View p0){
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoChangeIdentityDialog.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CoChangeIdentityDialog.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d02d1, p1, false);
       this.doBindView(view);
       view.findViewById(R.id.close_btn).setOnClickListener(new CoChangeIdentityDialog$a(this));
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, CoChangeIdentityDialog.class, "4")) {
          return;
       }
       super.onDestroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoChangeIdentityDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       String str = "6";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, CoChangeIdentityDialog.class, str);
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new i());
          PatchProxy.onMethodExit(CoChangeIdentityDialog.class, str);
       }
       this.A = presenterV2;
       presenterV2.f(p0);
       Object[] objArray = new Object[]{new c("FRAGMENT", this),new c("key_co_create_select_users_id", this.B),new c("key_co_create_select_users_role", Integer.valueOf(this.C)),new c("key_co_create_select_users_fragment", this.D),this};
       this.A.i(objArray);
       return;
    }
}
