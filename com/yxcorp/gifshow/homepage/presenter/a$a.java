package com.yxcorp.gifshow.homepage.presenter.a$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.homepage.presenter.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.Integer;
import o07.o;

public class a$a implements PopupInterface$h	// class@0017ae
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.b.u.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.arg_RES_7f080bda, 0);
       return;
    }
    public void H(c p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       this.b.u.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.arg_RES_7f080a25, 0);
       return;
    }
    public void J(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       this.b.u.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.arg_RES_7f080a25, 0);
       return;
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
