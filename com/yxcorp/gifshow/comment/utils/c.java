package com.yxcorp.gifshow.comment.utils.c;
import java.lang.Object;
import android.view.View;
import android.view.View$OnClickListener;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.comment.utils.c$a;
import hl9.u;
import java.lang.Runnable;
import crd.c;
import android.view.View$OnLongClickListener;
import hl9.v;

public class c	// class@001108
{

    public void c(){
       super();
    }
    public static b a(View p0,View$OnClickListener p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.setOnClickListener(new c$a(true, 300, p1));
       return c.d(new u(p0));
    }
    public static b b(View p0,View$OnLongClickListener p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.setOnLongClickListener(p1);
       return c.d(new v(p0));
    }
}
