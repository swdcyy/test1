package com.yxcorp.plugin.search.template.bigcard.state.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class a$a	// class@00077c
{
    public boolean a;
    public boolean b;

    public void a$a(){
       super();
    }
    public static a$a a(boolean p0,boolean p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoa = new a$a();
       uoa.a = p0;
       uoa.b = p1;
       return uoa;
    }
}
