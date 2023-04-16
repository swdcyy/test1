package com.yxcorp.gifshow.prettify.filter.repo.a$a;
import im8.f;
import com.yxcorp.gifshow.prettify.filter.repo.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public class a$a implements f	// class@001152
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Integer integer = PatchProxy.apply(null, this, a$a.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          integer = Integer.valueOf(this.b.e);
       }
       return integer;
    }
    public void set(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
       }else {
          this.b.e = p0.intValue();
       }
       return;
    }
}
