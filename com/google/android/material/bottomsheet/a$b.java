package com.google.android.material.bottomsheet.a$b;
import a2.a;
import com.google.android.material.bottomsheet.a;
import android.view.View;
import b2.d;
import android.os.Bundle;
import android.app.Dialog;

public class a$b extends a	// class@001665
{
    public final a d;

    public void a$b(a p0){
       this.d = p0;
       super();
    }
    public void f(View p0,d p1){
       super.f(p0, p1);
       if (this.d.e != null) {
          p1.a(0x100000);
          p1.g0(true);
       }else {
          p1.g0(false);
       }
       return;
    }
    public boolean h(View p0,int p1,Bundle p2){
       if (p1 == 0x100000) {
          a$b td = this.d;
          if (td.e != null) {
             td.cancel();
             return true;
          }
       }
       return super.h(p0, p1, p2);
    }
}
