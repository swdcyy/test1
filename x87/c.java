package x87.c;
import erd.g;
import com.kwai.logger.upload.retrieve.azeroth.f;
import java.lang.Object;
import com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig$Task;
import java.util.Objects;
import java.util.HashMap;
import c97.d;
import r97.a0;
import java.lang.String;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import com.kwai.logger.upload.retrieve.azeroth.h;

public final class c implements g	// class@0027c2
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       HashMap hashMap = new HashMap();
       hashMap.put("taskId", p0.taskId);
       hashMap.put("serverLinkIp", p0.extraInfo);
       d.a().g().b("obiwan", "", "OBIWAN_WILL_BEGIN_TSAK", hashMap);
       Iterator iterator = tb.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
}
