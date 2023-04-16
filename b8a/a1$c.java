package b8a.a1$c;
import d6a.a;
import b8a.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import oe6.a;
import com.yxcorp.gifshow.util.DateUtils;
import b8a.b1;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import java.lang.System;
import com.yxcorp.gifshow.detail.model.TimeManagementConfig;
import uw9.c;
import java.util.Collection;
import ekd.q;
import kotlin.jvm.internal.a;
import java.lang.Number;
import b8a.c1;
import java.util.Map;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Integer;
import xf6.d;
import xf6.l;

public final class a1$c extends a	// class@00038d
{
    public final a1 b;

    public void a1$c(a1 p0){
       this.b = p0;
       super();
    }
    public void i2(){
       Map obj1;
       int i;
       Integer obj3;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a1$c.class, "1")) {
          return;
       }
       a1$c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(objArray, tb, a1.class, "3") || (!a1.v && a.m() - DateUtils.l())) {
          List list = a.N(new b1().getType());
          long l = System.currentTimeMillis();
          TimeManagementConfig timeManageme = c.x(TimeManagementConfig.class);
          String str = "sleepIntervals[1]";
          String str1 = "sleepIntervals[0]";
          if (!q.f(list)) {
             TimeManagementConfig obj = list.get(0);
             a.o(obj, str1);
             obj1 = list.get(1);
             a.o(obj1, str);
             if (tb.R8(obj.intValue(), obj1.intValue(), l) && timeManageme != null) {
                obj = timeManageme.mTimeManagementSleepUrl;
                i = (obj == null || !obj.length())? 1: 0;
                if (!i) {
                   tb.P8(2);
                }
             }
          }
          i = a.y();
          obj1 = a.O(new c1().getType());
          if (obj1 == null) {
             HashMap hashMap = new HashMap();
          }
          if (i > 0) {
             if (!q.f(list)) {
                Object obj2 = list.get(0);
                a.o(obj2, str1);
                int i1 = obj2.intValue();
                obj3 = list.get(1);
                a.o(obj3, str);
                if (tb.R8(i1, obj3.intValue(), (l + (long)0xdbba0))) {
                label_011a :
                   return;
                }
             }
             obj3 = obj1.get(Long.valueOf(DateUtils.l()));
             int i2 = (obj3 != null)? obj3.intValue(): 0;
             if (i2 < 5 && timeManageme != null) {
                TimeManagementConfig mTimeManagem = timeManageme.mTimeManagementRestUrl;
                long l1 = (mTimeManagem == null || !mTimeManagem.length())? 1: 0;
                if (l1) {
                   goto label_011a ;
                }else {
                   l1 = a.x();
                   if (l1 - (long)i > 0 || (l.c("KEY_RELAX_TIME_NOTICE_DURATION", 0) && l1 - (long)0x2bf20 > 0)) {
                      tb.P8(1);
                      goto label_011a ;
                   }else {
                      goto label_011a ;
                   }
                }
             }else {
                goto label_011a ;
             }
          }else {
             goto label_011a ;
          }
       }
    }
}
