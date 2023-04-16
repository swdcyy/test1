package i8a.i;
import java.lang.Runnable;
import i8a.j;
import java.lang.Object;
import java.util.Map;
import androidx.collection.LruCache;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import i8a.g;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import i8a.g$b;
import brd.y;

public final class i implements Runnable	// class@0027ca
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       Iterator iterator = tb.a.snapshot().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() != null) {
             g value = uEntry.getValue();
             j i = tb.i;
             Objects.requireNonNull(value);
             g og = g.class;
             if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(i), value, og, "3")) {
                continue ;
             }else {
                value.x = i;
                if (value.r.get() < 2) {
                   continue ;
                }else {
                   g s = value.s;
                   _monitor_enter(s);
                   SpannableStringBuilder spannableStr = value.o.get();
                   SpannableStringBuilder spannableStr1 = value.p.get();
                   if (spannableStr1 == null || spannableStr == null) {
                      _monitor_exit(s);
                   }else {
                      spannableStr = value.s(new SpannableStringBuilder(spannableStr1), new SpannableStringBuilder(spannableStr));
                      boolean b = true;
                      if (spannableStr == null) {
                         value.q.onNext(new g$b(b, spannableStr1, null));
                      }else {
                         value.q.onNext(new g$b(b, spannableStr, spannableStr1));
                      }
                      _monitor_exit(s);
                   }
                }
             }
          }
       }
       return;
    }
}
