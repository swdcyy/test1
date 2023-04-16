package com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter$a$a;
import n3d.a;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter$a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.view.View;
import n7c.e;
import java.util.Objects;
import brd.t;
import com.yxcorp.gifshow.b;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import lbc.a;
import lbc.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class PymkDialogContactItemPresenter$a$a implements a	// class@00193e
{
    public final PymkDialogContactItemPresenter$a b;

    public void PymkDialogContactItemPresenter$a$a(PymkDialogContactItemPresenter$a p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport2(PymkDialogContactItemPresenter$a$a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PymkDialogContactItemPresenter$a$a.class, "1")) {
          return;
       }
       if (p2 != null) {
          p0.p = p2.getIntExtra("contactsCount", 0);
       }
       boolean b = this.b.c.R8().d();
       PymkDialogContactItemPresenter v = this.b.c.v;
       if (v == null) {
          a.S("mBtn");
       }
       PymkDialogContactItemPresenter u = this.b.c.u;
       if (u == null) {
          a.S("mBtnContainer");
       }
       e.c(b, v, u);
       PymkDialogContactItemPresenter$a c = this.b.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(null, c, PymkDialogContactItemPresenter.class, "9")) {
          v = c.p;
          if (v != -1) {
             u = c.s;
             if (u == null) {
                a.S("mNameTV");
             }
             PymkDialogContactItemPresenter t = c.t;
             if (t == null) {
                a.S("mDescTV");
             }
             e.d(v, u, t);
          }else {
             c.X7(b.f().map(new e()).observeOn(d.a).subscribe(new a(c), b.b));
          }
       }
       PatchProxy.onMethodExit(PymkDialogContactItemPresenter$a$a.class, "1");
       return;
    }
}
