package com.yxcorp.gifshow.share.platform.a$a$a;
import n3d.a;
import com.yxcorp.gifshow.share.platform.a$a;
import brd.v;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import brd.g;

public final class a$a$a implements a	// class@001c1f
{
    public final a$a b;
    public final v c;

    public void a$a$a(a$a p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(a$a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a$a$a.class, "1")) {
          return;
       }
       this.c.onNext(this.b.d);
       return;
    }
}
