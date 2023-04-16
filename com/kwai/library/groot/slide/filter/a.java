package com.kwai.library.groot.slide.filter.a;
import java.lang.Object;
import com.kwai.library.groot.slide.filter.SlideMediaType;
import ok.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ax6.a;

public class a	// class@00083f
{

    public void a(){
       super();
    }
    public static o a(SlideMediaType p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a(p1, p0);
    }
}
