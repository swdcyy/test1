package ed2.p;
import erd.o;
import ed2.r;
import java.lang.Object;
import java.lang.Long;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.LinkedList;
import java.util.Iterator;
import android.util.Pair;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Float;
import com.google.gson.JsonElement;

public final class p implements o	// class@002704
{
    public final r b;

    public void p(r p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p tb = this.b;
       p0 = tb.a;
       _monitor_enter(p0);
       r b = tb.b;
       r c = tb.c;
       tb.b = c;
       tb.c = b;
       _monitor_exit(p0);
       Collections.sort(c, tb.e);
       p0 = tb.b;
       String str = PatchProxy.applyOneRefs(p0, tb, r.class, "4");
       if (str != PatchProxyResult.class) {
       }else if(q.f(p0)){
          str = "";
       }else {
          int i = p0.size();
          tb.f = tb.f + (long)i;
          int i1 = 0;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().first.longValue() - 0xfe502b > 0) {
                i1 = i1 + 1;
             }
          }
          tb.g = tb.g + (long)i1;
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("totalFrameCount", Integer.valueOf(i));
          jsonObject.a0("jankyFrameCount", Integer.valueOf(i1));
          jsonObject.a0("jankyFrameRate", Float.valueOf(((float)i1 / (float)i)));
          JsonObject jsonObject1 = new JsonObject();
          Pair pair = tb.b(p0, 50);
          jsonObject1.a0("totalDuration", Float.valueOf(((float)pair.first.longValue() / 1000000.00f)));
          jsonObject1.a0("timestamp", pair.second);
          jsonObject.G("percent50", jsonObject1);
          jsonObject1 = new JsonObject();
          pair = tb.b(p0, 90);
          jsonObject1.a0("totalDuration", Float.valueOf(((float)pair.first.longValue() / 1000000.00f)));
          jsonObject1.a0("timestamp", pair.second);
          jsonObject.G("percent90", jsonObject1);
          jsonObject1 = new JsonObject();
          pair = tb.b(p0, 95);
          jsonObject1.a0("totalDuration", Float.valueOf(((float)pair.first.longValue() / 1000000.00f)));
          jsonObject1.a0("timestamp", pair.second);
          jsonObject.G("percent95", jsonObject1);
          jsonObject1 = new JsonObject();
          p0 = tb.b(p0, 99);
          jsonObject1.a0("totalDuration", Float.valueOf(((float)p0.first.longValue() / 1000000.00f)));
          jsonObject1.a0("timestamp", p0.second);
          jsonObject.G("percent99", jsonObject1);
          str = jsonObject.toString();
       }
       tb.b.clear();
       return str;
    }
}
