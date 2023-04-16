package ek2.x;
import y8c.g;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.stayinfo.c;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.stayinfo.d;
import ml8.c;

public class x extends g	// class@002760
{
    public final int w;

    public void x(int p0){
       super();
       this.w = p0;
    }
    public int f0(int p0){
       return this.w;
    }
    public f h1(ViewGroup p0,int p1){
       c uoc;
       View view;
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ox, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 2) {
          uoc = new c();
          view = a.i(p0, R.layout.arg_RES_7f0d0a8e);
       }else {
          uoc = new d();
          view = a.i(p0, R.layout.arg_RES_7f0d0dd9);
       }
       return new f(view, uoc);
    }
}
