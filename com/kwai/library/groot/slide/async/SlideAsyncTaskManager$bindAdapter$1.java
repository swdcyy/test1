package com.kwai.library.groot.slide.async.SlideAsyncTaskManager$bindAdapter$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import vw6.b;
import java.lang.Object;
import java.util.ArrayList;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import vw6.c;
import android.os.Message;
import android.os.Handler;

public final class SlideAsyncTaskManager$bindAdapter$1 extends Lambda implements l	// class@00083a
{
    public final b this$0;

    public void SlideAsyncTaskManager$bindAdapter$1(b p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ArrayList p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideAsyncTaskManager$bindAdapter$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       b b = this.this$0.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, c.class, str)) {
          a.p(p0, "photoList");
          if (b.b != null) {
             Message message = Message.obtain();
             message.what = 1;
             message.obj = p0;
             c b1 = b.b;
             if (b1 == null) {
                a.S("mHandler");
             }
             b1.sendMessageAtFrontOfQueue(message);
          }
       }
       return;
    }
}
