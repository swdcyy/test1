package com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment$b;
import erd.g;
import com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.login.QRCodeLoginResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import w1d.j;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$QRCodeDetailPackage;
import q2b.h$b;
import k2b.e0;
import k2b.u1;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;

public class QRCodeLoginFragment$b implements g	// class@001b3d
{
    public final ProgressFragment b;
    public final QRCodeLoginFragment c;

    public void QRCodeLoginFragment$b(QRCodeLoginFragment p0,ProgressFragment p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QRCodeLoginFragment$b.class, "1")) {
       }else {
          this.b.dismiss();
          if (this.c.isAdded()) {
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, objArray, j.class, "11")) {
                p0 = new ClientTaskDetail$TaskDetailPackage();
                ClientTaskDetail$QRCodeDetailPackage qRCodeDetail = new ClientTaskDetail$QRCodeDetailPackage();
                p0.qrcodeDetailPackage = qRCodeDetail;
                qRCodeDetail.media = 1;
                h$b uob = h$b.d(7, 45);
                uob.s(p0);
                u1.p0("", objArray, uob);
             }
             this.c.getActivity().setResult(-1);
             this.c.getActivity().finish();
          }
       }
       return;
    }
}
