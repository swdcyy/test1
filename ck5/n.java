package ck5.n;
import io.reactivex.i;
import bk5.g;
import java.lang.Object;
import brd.c0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.Thread;
import ok5.a;
import jl5.h;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.emotionsdk.core.EmotionResourceProcessor;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.util.concurrent.atomic.AtomicInteger;
import ck5.n$a;
import jk5.c;
import jk5.b;
import com.kwai.emotionsdk.core.EmotionResourceProcessor$a;

public final class n implements i	// class@0006e1
{
    public final g a;

    public void n(g p0){
       this.a = p0;
       super();
    }
    public final void a(c0 p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, str)) {
          return;
       }
       a.p(p0, "emitter");
       if (this.a.a().isEmpty()) {
          Thread thread = Thread.currentThread();
          a.o(thread, "Thread.currentThread\(\)");
          a.a("EmotionResourceProcessor", "downloadEmotionResource - 1, url is empty,thread "+thread.getName());
          p0.onSuccess(this.a);
       }else {
          h.j(false);
          Iterator iterator = this.a.a().iterator();
          while (iterator.hasNext()) {
             List list = iterator.next();
             a.a("EmotionResourceProcessor", "downloadEmotionResource - 2, start download url is "+list);
             StringBuilder str1 = "";
             EmotionResourceProcessor f = EmotionResourceProcessor.f;
             Objects.requireNonNull(f);
             AtomicInteger uAtomicInteg = PatchProxy.apply(null, f, EmotionResourceProcessor.class, str);
             if (uAtomicInteg == PatchProxyResult.class) {
                uAtomicInteg = EmotionResourceProcessor.a.getValue();
             }
             String str2 = h.d();
             a.o(str2, "EmotionFileUtils.getEmojiDir\(\)");
             EmotionResourceProcessor.b = new EmotionResourceProcessor$a(b.a(list, str2, str1+uAtomicInteg.getAndIncrement()+"-emoji.zip", new n$a(this, p0), EmotionResourceProcessor.a(f)), EmotionResourceProcessor.a(f));
          }
       }
       return;
    }
}
