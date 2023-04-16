package kuaishou.perf.page.impl.d$a;
import java.lang.Runnable;
import kuaishou.perf.page.impl.d;
import java.lang.Object;
import kuaishou.perf.page.impl.PostPageData;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import android.util.Pair;
import java.lang.Long;
import kuaishou.perf.page.impl.PageDataModel;
import kuaishou.perf.page.impl.PageDataModel$PageStage;
import wtd.b;
import com.google.gson.Gson;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.util.Objects;

public class d$a implements Runnable	// class@001bf1
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void run(){
       d c;
       Iterator iterator;
       String key;
       Pair pair;
       Pair second;
       d$a tb = this.b;
       PostPageData postPageData = null;
       if (TextUtils.isEmpty(tb.c.scene)) {
       }else {
          c = tb.c;
          second = null;
          if (c.totalCost - second > 0) {
             if (!c.pageStages.isEmpty()) {
                iterator = tb.c.pageStages.entrySet().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Map$Entry uEntry1 = iterator.next();
                      String key1 = uEntry1.getKey();
                      key = uEntry1.getValue();
                      if (!TextUtils.isEmpty(key1) && !TextUtils.isEmpty(key)) {
                         Pair pair1 = tb.c.stage.get(key);
                         if (pair1 != null) {
                            pair = pair1.first;
                            if (pair == null || (pair1.second == null || (pair.longValue() - second < 0 || (pair1.second.longValue() - second >= 0 && pair1.second.longValue() - pair1.first.longValue() >= 0)))) {
                               continue ;
                            }
                         }
                      }
                   }
                }
             }
             postPageData = 1;
          }
       }
    label_0094 :
       if (!postPageData) {
          return;
       }else {
          PageDataModel pageDataMode = new PageDataModel();
          c = this.b.c;
          pageDataMode.scene = c.scene;
          pageDataMode.type = c.type;
          pageDataMode.totalCost = c.totalCost;
          pageDataMode.args.putAll(c.args);
          iterator = this.b.c.pageStages.entrySet().iterator();
          while (true) {
             if (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                key = uEntry.getKey();
                String value = uEntry.getValue();
                pair = this.b.c.stage.get(value);
                if (pair != null && pair.first != null) {
                   second = pair.second;
                   if (second != null) {
                      long l = second.longValue() - pair.first.longValue();
                      pageDataMode.stage.put(key, new PageDataModel$PageStage(value, l));
                   }
                }
                break ;
             }else {
                pageDataMode.args.put("ft", "post");
                if (b.a.containsKey(pageDataMode.scene)) {
                   pageDataMode.args.put("priority", b.a.get(pageDataMode.scene));
                }
                if (!d.f.isEmpty()) {
                   pageDataMode.args.putAll(d.f);
                }
                b.a(0x4b316083).k("", "page_logger", d.h.q(pageDataMode));
                Objects.requireNonNull(this.b);
                return;
             }
          }
          return;
       }
    }
}
