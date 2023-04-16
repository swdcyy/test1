package lk0.d;
import com.kuaishou.krn.model.LaunchModel;
import fk0.a;
import fk0.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.kuaishou.krn.c;
import kj0.j;

public final class d	// class@002f86
{

    public static final b a(LaunchModel p0,a p1){
       String str1;
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "launchModel");
       obj = (p1 != null)? p1.b(): null;
       int i = 0;
       obj = (obj == null || !obj.length())? 1: null;
       if (obj) {
          obj = p0.h();
       }else if(p1 != null){
          obj = p1.b();
       }else {
          obj = null;
       }
       String str = (obj == null || !obj.length())? 1: null;
       if (str) {
          c uoc = c.b();
          a.o(uoc, "KrnManager.get\(\)");
          j oj = uoc.c();
          a.o(oj, "KrnManager.get\(\).commonParams");
          obj = oj.getAppVersion();
       }
       str = (p1 != null)? p1.a(): null;
       str = (str == null || !str.length())? 1: 0;
       if (str) {
          str1 = p0.c();
       }else if(p1 != null){
          str1 = p1.a();
       }else {
          str1 = null;
       }
       if (str1 == null || !str1.length()) {
          i = 1;
       }
       if (i) {
          return null;
       }else {
          return new b(str1, obj);
       }
    }
}
