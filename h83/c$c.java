package h83.c$c;
import androidx.lifecycle.Observer;
import h83.c;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import j83.c;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;

public final class c$c implements Observer	// class@002cf7
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
       }else if(p0 != null){
          c$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, c.class, "8")) {
             int i = tb.V2(p0);
             Iterator iterator = tb.k.entrySet().iterator();
             while (iterator.hasNext()) {
                c value = iterator.next().getValue();
                if (value != null) {
                   c uoc = c.class;
                   if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(i), value, uoc, "1")) {
                      continue ;
                   }
                }
                value.f().setValue(Integer.valueOf(i));
             }
          }
       }
       return;
    }
}
