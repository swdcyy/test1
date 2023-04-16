package com.yxcorp.gifshow.notice.box.detail.widget.b;
import lnc.c3$a;
import java.lang.Object;
import android.view.View;
import lnc.a1;
import gtb.b;
import lnc.c3;
import gtb.c;

public final class b implements c3$a	// class@002180
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void apply(Object p0){
       int i = a1.a(R.color.arg_RES_7f061d80);
       c3.c(p0.findViewById(R.id.recycler_view), new b(i));
       c3.c(p0.findViewById(R.id.arrow), new c(i));
    }
}
