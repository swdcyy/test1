package com.kuaishou.commercial.photoreduce.g$a;
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
import com.kuaishou.commercial.photoreduce.g$d;
import ml8.c;

public class g$a extends g	// class@001528
{
    public final g w;

    public void g$a(g p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d006a), new g$d(this.w));
    }
}
