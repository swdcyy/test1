package laa.l0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.util.PostUtils;
import java.io.IOException;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import msd.l;
import brd.a0;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import laa.l0$a;
import erd.o;
import laa.l0$b;

public final class l0	// class@002d90
{
    public static final l0 a;

    static {
       l0.a = new l0();
    }
    public void l0(){
       super();
    }
    public static final long b(){
       Object obj = PatchProxy.apply(null, null, l0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return PostUtils.o();
    }
    public static final void c(String p0,String p1,IOException p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, l0.class, "7")) {
          return;
       }
       a.p(p0, "message");
       a.p(p2, "e");
       PostUtils.D("DraftFileUtils", p0+"\n        space left: "+PostUtils.o()+" MB\n        error: "+p2.getMessage(), p2);
       return;
    }
    public final a0 a(c p0,l p1){
       Collection obj = PatchProxy.applyTwoRefs(p0, p1, this, l0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "main");
       a.p(p1, "config");
       obj = p0.L0();
       a.o(obj, "main.pair");
       a0 uoa0 = p1.invoke(p0);
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc == p0) {
             continue ;
          }else {
             uoa0 = uoa0.u(new l0$a(uoc, p0, p1)).C(new l0$b(p0, p1));
             a.o(uoa0, "task.flatMap { config\(with\) }.map { main }");
          }
       }
       return uoa0;
    }
}
