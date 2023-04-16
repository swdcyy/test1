package com.yxcorp.gifshow.prettify.base.b$a;
import g16.c$a;
import com.yxcorp.gifshow.prettify.base.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o0c.a;
import android.view.MotionEvent;
import g16.b;

public class b$a implements c$a	// class@0010eb
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public boolean c4(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.s.J();
       return true;
    }
    public void k0(MotionEvent p0){
       b.a(this, p0);
    }
    public boolean l(boolean p0){
       return b.d(this, p0);
    }
    public void onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       b.b(this, p0, p1, p2, p3);
    }
}
