package bv8.e;
import bv8.a;
import java.lang.Object;
import yb7.c;
import com.kwai.middleware.leia.degrade.ApiRequestTiming;
import com.yxcorp.experiment.c;
import wu8.q;
import java.lang.String;
import yb7.p;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Map;
import com.google.gson.JsonObject;
import java.util.Set;
import bv8.d;
import java.util.concurrent.Callable;
import brd.t;
import bv8.c;
import erd.o;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import bv8.e$a;
import brd.y;
import java.lang.NullPointerException;

public class e implements a	// class@000360
{
    public b a;

    public void e(){
       super();
    }
    public void a(c p0,ApiRequestTiming p1){
       String str = c.h().g().k();
       if (str == null || (TextUtils.isEmpty(str) || (str instanceof Collection && (str.isEmpty() || (str instanceof Map && (str.isEmpty() || (str instanceof JsonObject && str.entrySet().isEmpty()))))))) {
          throw new NullPointerException("urlPath cannot be null or empty");
       }
       t.fromCallable(new d(this)).flatMap(new c(str, p1)).subscribeOn(AzerothSchedulers.c()).subscribeWith(new e$a(this, p0));
       return;
    }
}
