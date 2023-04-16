package com.kuaishou.live.lite.adapter.component.chat.component.LiveLiteMultiChatViewController$handleChatInfo$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import w63.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.List;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveLiteMultiChatViewController$handleChatInfo$2 extends FunctionReferenceImpl implements l	// class@001d6e
{

    public void LiveLiteMultiChatViewController$handleChatInfo$2(b p0){
       super(1, p0, b.class, "handleDeleteUsers", "handleDeleteUsers\(Ljava/util/List;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatViewController$handleChatInfo$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, b.class, "6")) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             ViewController viewControll = treceiver.k.remove(iterator.next());
             if (viewControll != null) {
                treceiver.O2(viewControll);
             }
          }
       }
       return;
    }
}
