package com.yxcorp.gifshow.map.search.a$b;
import hka.a;
import com.yxcorp.gifshow.map.search.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ty5.d;

public final class a$b implements a	// class@001cd2
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.B.s7(true);
       return false;
    }
}
