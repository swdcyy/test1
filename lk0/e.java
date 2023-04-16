package lk0.e;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import zsd.u;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.Closeable;
import isd.b;
import java.io.IOException;
import java.lang.StackOverflowError;
import kotlin.text.Regex;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;
import ekd.z0;
import java.util.Iterator;

public final class e	// class@002f87
{

    public static final String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "detail");
       p0 = u.g2(u.g2(p0, "\n", "#", false, 4, null), "\t", "#", false, 4, null);
       if (!StringsKt__StringsKt.O2(p0, "#", false, 2, null)) {
          p0 = p0+"##";
       }
       return p0;
    }
    public static final String b(Throwable p0){
       String str;
       String str1;
       Object[] objArray;
       ImmutableList immutableLis;
       StringBuilder str2;
       Iterator iterator;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       String[] obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, uoe, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(p0, "throwable");
       obj1 = PatchProxy.applyOneRefs(p0, obj, uoe, "4");
       if (obj1 != patchProxyRe) {
       }else {
          try{
             StringWriter stringWriter = new StringWriter();
             p0.printStackTrace(new PrintWriter(stringWriter));
             String str3 = stringWriter.toString();
             a.o(str3, "strWriter.toString\(\)");
             b.a(stringWriter, obj);
             obj1 = str3;
          }catch(java.io.IOException e3){
             e3.printStackTrace();
             obj1 = p0.toString();
          }
       }
    }
}
