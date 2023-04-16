package bp6.n1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import rp6.w;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import lp6.h;
import k85.c;
import lp6.k;
import java.util.ArrayList;
import org.greenrobot.greendao.database.Database;
import java.util.Iterator;
import mp6.d;
import qo6.g;
import org.greenrobot.greendao.AbstractDaoSession;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import j75.f;
import com.kwai.chat.sdk.signal.BizDispatcher;
import com.kwai.middleware.azeroth.network.EmptyResponse;

public final class n1 implements Callable	// class@00053d
{
    public final v b;
    public final boolean c;

    public void n1(v p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       n1 tb = this.b;
       n1 tc = this.c;
       Objects.requireNonNull(tb);
       b.i("KwaiIMManagerInternal", "clearFtsData force: "+tc);
       w ow = w.e(tb.a);
       Objects.requireNonNull(ow);
       c.b(Azeroth2.B.d(), h.e("SEARCHABLE_CONTENT_VERSION"), "");
       k ok = k.a(ow.a);
       Objects.requireNonNull(ok);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add("DROP TRIGGER IF EXISTS \"insertMsgTrigger\"");
       uArrayList.add("DROP TRIGGER IF EXISTS \"updateMsgTrigger\"");
       uArrayList.add("DROP TRIGGER IF EXISTS \"deleteMsgTrigger\"");
       uArrayList.add("DROP TABLE IF EXISTS \"fts_kwai_message\"");
       ok.b().beginTransaction();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          ok.b().execSQL(iterator.next());
       }
       ok.b().setTransactionSuccessful();
       ok.b().endTransaction();
       if (tc != null) {
          d uod = d.a(tb.a);
          Objects.requireNonNull(uod);
          SQLiteDatabase rawDatabase = uod.c(d.k()).getDatabase().getRawDatabase();
          if (rawDatabase != null) {
             f.a(new File(rawDatabase.getPath()));
          }
       }
       d uod1 = d.a(tb.a);
       Objects.requireNonNull(uod1);
       uod1.c(d.k()).getDatabase().close();
       d.f.clear();
       return new EmptyResponse();
    }
}
