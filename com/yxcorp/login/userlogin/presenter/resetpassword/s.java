package com.yxcorp.login.userlogin.presenter.resetpassword.s;
import v0d.m$b;
import com.yxcorp.login.userlogin.presenter.resetpassword.r$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.userlogin.presenter.resetpassword.r;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;
import android.widget.TextView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.res.Resources;
import java.lang.Integer;

public class s implements m$b	// class@001bf0
{
    public final r$e a;

    public void s(r$e p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       this.a.b.q.setText(a.B.getString(R.string.arg_RES_7f10422e));
       if (this.a.b.getActivity() != null) {
          r$e b = this.a.b;
          b.q.setTextColor(b.getActivity().getResources().getColor(R.color.arg_RES_7f061fe8));
       }
       this.a.b.q.setEnabled(true);
       return;
    }
    public void onProgress(int p0){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, os, "1")) {
          return;
       }
       r$e b = this.a.b;
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       b.q.setText(b.getActivity().getString(R.string.arg_RES_7f104cee, objArray));
       if (this.a.b.getActivity() != null) {
          r$e b1 = this.a.b;
          b1.q.setTextColor(b1.getActivity().getResources().getColor(R.color.arg_RES_7f061fe3));
       }
       return;
    }
}
