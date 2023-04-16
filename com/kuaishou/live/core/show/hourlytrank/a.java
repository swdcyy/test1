package com.kuaishou.live.core.show.hourlytrank.a;
import ks5.b;
import java.lang.Object;
import ks5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.core.show.hourlytrank.a$a;
import android.view.ViewGroup;
import android.view.View;
import ks5.e;
import ks5.d;

public class a implements b	// class@000bfa
{
    public View a;
    public a$a b;
    public boolean c;

    public void a(){
       super();
       this.c = false;
    }
    public void D(){
       a.d(this);
    }
    public void a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       if (uoa != null) {
          uoa.a(p0);
       }
       return;
    }
    public View b(ViewGroup p0){
       return this.a;
    }
    public boolean c(){
       return d.a(this);
    }
    public void d(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.c = true;
       a tb = this.b;
       if (tb != null) {
          tb.onShow();
       }
       return;
    }
    public void e(ViewGroup p0){
       this.c = false;
    }
    public int getBizId(){
       return 10;
    }
    public boolean i(){
       return true;
    }
    public String k(){
       return a.a(this);
    }
    public void onShow(){
       a.e(this);
    }
    public int[] p(){
       return new int[3]{1,12,25};
    }
    public boolean t(){
       return this.c;
    }
    public void u(a$a p0){
       this.b = p0;
    }
}
