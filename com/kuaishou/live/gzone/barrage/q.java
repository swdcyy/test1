package com.kuaishou.live.gzone.barrage.q;
import y8c.g;
import java.util.ArrayList;
import y8c.f;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.kuaishou.live.gzone.barrage.q$a;
import ml8.c;

public class q extends g	// class@001c48
{
    public final ArrayList w;

    public void q(ArrayList p0){
       super();
       this.w = p0;
    }
    public ArrayList a1(int p0,f p1){
       return this.w;
    }
    public f h1(ViewGroup p0,int p1){
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oq, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0ba0), new q$a());
    }
}
