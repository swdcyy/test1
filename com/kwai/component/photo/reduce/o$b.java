package com.kwai.component.photo.reduce.o$b;
import y8c.g;
import com.kwai.component.photo.reduce.o;
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
import com.kwai.component.photo.reduce.o$d;
import ml8.c;

public class o$b extends g	// class@000afd
{
    public final o w;

    public void o$b(o p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       o$b uob = o$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d1131), new o$d(this.w));
    }
}
