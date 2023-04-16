package com.kwai.nearby.local.presenter.b$b;
import qvb.q;
import com.kwai.nearby.local.presenter.b;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import uc7.c;
import trb.b;
import k2b.u1;

public class b$b implements q	// class@000faa
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       if (p0 || p1) {
          b$b tb = this.b;
          tb.C = 0;
          tb.z = false;
       }else {
          p0.z = true;
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       String str;
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       this.b.u.b();
       b$b tb = this.b;
       tb.z = false;
       tb.B = false;
       if (!p0) {
          str = "localLoadingViewShow";
          tb = (tb.A != null && !tb.u.a())? true: false;
          String str1 = String.valueOf(tb);
          if (!PatchProxy.applyVoidTwoRefs(str, str1, null, b.class, "2") && b.a) {
             u1.R(str, str1, 15);
          }
       }
    label_0055 :
       str.A = false;
       return;
    }
}
