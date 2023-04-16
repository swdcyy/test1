package com.kuaishou.commercial.photoreduce.g$b;
import y8c.g;
import com.kuaishou.commercial.photoreduce.g;
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
import com.kuaishou.commercial.photoreduce.g$c;
import ml8.c;

public class g$b extends g	// class@001529
{
    public final g w;

    public void g$b(g p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       g$b uob = g$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d006b), new g$c(this.w));
    }
}
