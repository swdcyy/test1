package com.yxcorp.gifshow.homepage.functions.g;
import qm9.a0;
import com.yxcorp.gifshow.homepage.functions.e;
import android.app.Activity;
import kob.r;
import java.lang.Object;
import qm9.z;
import com.kuaishou.android.model.music.Music;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a46.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import lsa.l;
import com.yxcorp.gifshow.homepage.functions.f;
import erd.g;

public class g implements a0	// class@0016df
{
    public final Activity a;
    public final r b;
    public final e c;

    public void g(e p0,Activity p1,r p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       z.b(this);
    }
    public void b(){
       z.d(this);
    }
    public void c(Music p0){
       z.c(this, p0);
    }
    public b d(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y6.s(d.class, LoadPolicy.DIALOG).R(new l(this, this.a, p0, this.b), f.b);
    }
}
