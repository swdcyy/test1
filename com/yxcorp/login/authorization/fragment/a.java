package com.yxcorp.login.authorization.fragment.a;
import z0d.b;
import java.lang.Object;
import androidx.fragment.app.KwaiDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a1d.m1;
import a1d.w;
import a1d.b1;
import a1d.p1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.authorization.AuthActivity;
import w0d.g;
import a1d.q0;
import a1d.j1;
import a1d.t0;
import a1d.d1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import androidx.fragment.app.DialogFragment;
import lnc.g2$a;
import lnc.g2;
import android.app.Dialog;
import y0d.c;
import android.content.DialogInterface$OnKeyListener;

public class a	// class@001a35
{
    public final b a;
    public g2 b;

    public void a(b p0){
       super();
       this.a = p0;
    }
    public PresenterV2 a(KwaiDialogFragment p0){
       PresenterV2 obj = PatchProxy.applyOneRefsWithListener(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new m1(p0));
       obj.U7(new w());
       obj.U7(new b1());
       obj.U7(new p1(p0.getActivity()));
       obj.U7(new q0(p0.getActivity()));
       obj.U7(new j1());
       obj.U7(new t0());
       obj.U7(new d1(p0.getActivity()));
       PatchProxy.onMethodExit(a.class, "3");
       return obj;
    }
    public View b(LayoutInflater p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.g(p0, 0x7f0d05ab, p1, false);
    }
    public void c(DialogFragment p0,g2$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       if (this.b == null) {
          this.b = new g2(p0, p1);
       }
       Object[] objArray = new Object[]{this.a,p0};
       this.b.b(objArray);
       p0.getDialog().setCanceledOnTouchOutside(0);
       p0.getDialog().setOnKeyListener(new c(p0));
       return;
    }
}
