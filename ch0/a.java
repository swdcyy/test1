package ch0.a;
import android.os.CountDownTimer;
import com.kuaishou.house.live.lottery.view.HouseLotteryPendantView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.a;
import java.lang.Number;
import nsd.r0;
import java.util.Locale;
import java.util.Arrays;

public final class a extends CountDownTimer	// class@0004b3
{
    public final HouseLotteryPendantView a;
    public final String b;
    public final long c;

    public void a(HouseLotteryPendantView p0,String p1,long p2,long p3,long p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super(p3, p4);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       HouseLotteryPendantView.d(this.a, this.b, false, 2, null);
       return;
    }
    public void onTick(long p0){
       String str;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, a.class, "1")) {
          return;
       }
       a ta = this.a;
       a tb = this.b;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(HouseLotteryPendantView.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), tb, ta, HouseLotteryPendantView.class, "3")) {
          if (!ta.b(p0)) {
             HouseLotteryPendantView.d(ta, tb, false, 2, null);
          }else if(PatchProxy.isSupport(HouseLotteryPendantView.class)){
             str = PatchProxy.applyOneRefs(Long.valueOf(p0), ta, HouseLotteryPendantView.class, "6");
             if (str != PatchProxyResult.class) {
             label_00dc :
                ta.c(str, true);
             }
          }
          TimeUnit[] timeUnitArra = new TimeUnit[]{TimeUnit.MINUTES,TimeUnit.SECONDS};
          List list = CollectionsKt__CollectionsKt.L(timeUnitArra);
          ArrayList uArrayList = new ArrayList(list.size());
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             TimeUnit timeUnit = iterator.next();
             long l = 1;
             long l1 = p0 / timeUnit.toMillis(l);
             uArrayList.add(Long.valueOf(l1));
             p0 = p0 % timeUnit.toMillis(l);
          }
          Object obj = uArrayList.get(false);
          a.o(obj, "counts[0]");
          Object obj1 = uArrayList.get(true);
          a.o(obj1, "counts[1]");
          long l2 = obj1.longValue();
          Object[] objArray = new Object[]{Long.valueOf(obj.longValue()),Long.valueOf(l2)};
          str = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(objArray, 2));
          a.o(str, "java.lang.String.format\(locale, format, *args\)");
          goto label_00dc ;
       }
       return;
    }
}
