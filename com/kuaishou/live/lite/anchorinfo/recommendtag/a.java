package com.kuaishou.live.lite.anchorinfo.recommendtag.a;
import msd.a;
import com.kuaishou.live.lite.anchorinfo.recommendtag.b;
import java.lang.Object;
import java.util.Objects;
import u83.c;
import java.lang.String;
import ec3.r;
import qrd.l1;

public final class a implements a	// class@001e6e
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final Object invoke(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = new c(tb);
       r.a("init_anchor_recommend_info", uoc);
       return l1.a;
    }
}
