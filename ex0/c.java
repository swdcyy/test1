package ex0.c;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.util.ArrayList;
import androidx.collection.ArrayMap;
import ex0.a;
import ex0.b;
import ok.o;
import com.google.common.base.Predicates;
import z1.a;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveAnchorQosInfoSyncMessage;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.SystemClock;
import java.lang.Long;
import androidx.collection.SimpleArrayMap;

public class c	// class@00220d
{
    public a a;
    public final List b;
    public final ArrayMap c;
    public final o d;
    public static final long e;

    static {
       c.e = TimeUnit.SECONDS.toMillis(30);
    }
    public void c(){
       super();
       this.b = new ArrayList(2);
       this.c = new ArrayMap();
       this.d = Predicates.b(new a(this), new b(this));
    }
    public void c(a p0){
       super();
       this.b = new ArrayList(2);
       this.c = new ArrayMap();
       this.d = Predicates.b(new a(this), new b(this));
       this.a = p0;
    }
    public static boolean a(c p0,LiveFlvStream$LiveAnchorQosInfoSyncMessage p1){
       boolean b;
       Objects.requireNonNull(p0);
       Object obj = PatchProxy.applyOneRefs(p1, p0, c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if((SystemClock.elapsedRealtime() - p0.c.getOrDefault(p1, Long.valueOf(0)).longValue()) - c.e <= 0){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public static boolean b(c p0,LiveFlvStream$LiveAnchorQosInfoSyncMessage p1){
       Objects.requireNonNull(p0);
       boolean b = (p1.maxQ >= 4200)? true: false;
       return b;
    }
}
