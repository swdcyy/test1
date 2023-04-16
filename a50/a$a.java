package a50.a$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a50.a;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import oe6.g;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class a$a implements Runnable	// class@000024
{
    public static final a$a b;

    static {
       a$a.b = new a$a();
    }
    public void a$a(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       List list = CollectionsKt___CollectionsKt.G5(a.a);
       g.a(n.b().edit().putString("SESSION_ID_LIST", DataKt.a().q(list)));
       Log.g("EveSessionManager", "sync to sp, sessionIds:"+list);
       return;
    }
}
