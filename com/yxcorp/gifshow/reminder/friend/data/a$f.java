package com.yxcorp.gifshow.reminder.friend.data.a$f;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.reminder.friend.data.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.Pair;
import zcc.l;
import qvb.n0;
import jdc.f;
import lec.t;
import wkd.b;
import com.yxcorp.gifshow.action.i;
import yv8.c;
import yv8.a;

public final class a$f implements Callable	// class@001a87
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public Object call(){
       String str;
       Object[] objArray = null;
       Pair pair = PatchProxy.apply(objArray, this, a$f.class, "1");
       if (pair != PatchProxyResult.class) {
       }else if(l.a()){
          str = f.a(this.b.K());
       }else {
          str = t.a(this.b.K());
       }
       pair = Pair.create(b.a(-129117978).g(this.b.q, objArray, false), str);
       return pair;
    }
}