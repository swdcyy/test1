package com.yxcorp.gifshow.activity.share.presenter.c1$d;
import fx8.b;
import com.yxcorp.gifshow.activity.share.presenter.c1;
import com.yxcorp.gifshow.activity.share.presenter.c1$f;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.activity.share.presenter.c1$d$a;
import ml8.c;

public class c1$d extends b	// class@0013cd
{
    public c1$f y;
    public final c1 z;

    public void c1$d(c1 p0,c1$f p1){
       this.z = p0;
       super();
       this.y = p1;
    }
    public f s1(ViewGroup p0,int p1){
       c1$d uod = c1$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d14ef), new c1$d$a(this, this.y));
    }
}
