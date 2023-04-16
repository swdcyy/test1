package com.yxcorp.utility.j$a;
import java.lang.Runnable;
import com.yxcorp.utility.j;
import java.lang.Object;
import android.view.View;
import android.view.Window;
import ekd.i0;
import ekd.k1;

public class j$a implements Runnable	// class@0009cd
{
    public final j b;

    public void j$a(j p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (this.b.b.getDecorView() != null) {
          this.b.b.getDecorView().setSystemUiVisibility(this.b.d);
          k1.r(new i0(this), 20);
       }
       return;
    }
}
