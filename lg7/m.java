package lg7.m;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import java.util.List;
import java.lang.String;
import kotlin.jvm.internal.a;
import tg7.b;
import java.io.File;
import com.kwai.performance.stability.crash.monitor.b;
import tg7.i;
import com.kwai.performance.stability.crash.monitor.internal.g;
import java.util.ArrayList;
import com.kwai.performance.stability.crash.monitor.d;
import java.io.FileFilter;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import vg7.d;
import com.google.gson.Gson;
import com.kwai.performance.stability.crash.monitor.util.e;
import java.lang.StringBuilder;
import yf7.h;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class m	// class@001d94
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final List a(ExceptionReporter p0){
       File uFile;
       int i;
       a.p(p0, "reporter");
       if (p0 instanceof b) {
          uFile = b.a();
       }else if(p0 instanceof i){
          uFile = b.b();
       }else if(p0 instanceof g){
          uFile = b.d();
       }else {
          return CollectionsKt__CollectionsKt.E();
       }
       ArrayList uArrayList = new ArrayList();
       File[] uFileArray = uFile.listFiles(d.b);
       if (uFileArray != null) {
          int len = uFileArray.length;
          for (i = 0; i < len; i = i + 1) {
             object oobject = uFileArray[i];
             String str = d.j.q(p0.k(new File(oobject, "dump"), new File(oobject, "message"), oobject));
             a.o(str, "RAW_GSON.toJson\(it\)");
             uArrayList.add(str);
          }
       }
       e.b(uFile);
       return uArrayList;
    }
}
