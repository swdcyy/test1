package in1.d;
import sj3.b;
import in1.c;
import java.lang.Object;
import sj3.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import zb6.a;
import com.yxcorp.gifshow.exception.ServerException;
import java.util.Iterator;
import java.lang.Iterable;
import msd.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;

public final class d implements b	// class@002961
{
    public final c b;

    public void d(c p0){
       this.b = p0;
       super();
    }
    public void c(){
       a.a(this);
    }
    public void e(){
       a.d(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       a.b(this, p0, p1);
    }
    public void onError(Throwable p0){
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, c.class, "15") && a.h(p0)) {
          ServerException serverExcept = a.a(p0);
          ServerException errorCode = serverExcept.errorCode;
          if (errorCode == 601) {
             tb.h = true;
             iterator = tb.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().invoke();
             }
             tb.b();
          }else if(errorCode == 607){
             tb.h = true;
             iterator = tb.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().invoke();
             }
             tb.b();
          }else if(errorCode >= 600 && (errorCode != 608 && !TextUtils.x(serverExcept.errorMessage))){
             i.d(R.style.arg_RES_7f110668, serverExcept.errorMessage);
          }
       }
       return;
    }
}
