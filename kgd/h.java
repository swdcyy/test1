package kgd.h;
import erd.c;
import java.lang.Object;
import kotlin.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class h implements c	// class@001794
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public Object a(Object p0,Object p1){
       p0 = p0.unbox-impl();
       p1 = p1.unbox-impl();
       Result result = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "1");
       if (result != PatchProxyResult.class) {
       }else if(Result.isFailure-impl(p0)){
          p0 = p1;
       }
       result = Result.box-impl(p0);
       return result;
    }
}
