package com.kuaishou.live.lite.adapter.component.chat.component.LiveLiteMultiChatViewController$handleChatInfo$1;
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
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import com.kuaishou.live.lite.adapter.component.chat.model.LiveLiteMultiChatModel;
import java.util.Map;
import ae1.a;
import x63.a;
import com.kuaishou.live.lite.adapter.component.chat.component.LiveLiteMultiChatViewController$handleNewUsers$1$1$subVC$1;
import a73.a;
import msd.p;
import z63.a;
import com.kuaishou.live.lite.adapter.component.chat.component.LiveLiteMultiChatViewController$handleNewUsers$1$1$subVC$2;
import y63.a;
import com.kuaishou.live.lite.adapter.component.chat.component.LiveLiteMultiChatViewController$handleNewUsers$1$1$subVC$3;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.ViewGroup;

public final class LiveLiteMultiChatViewController$handleChatInfo$1 extends FunctionReferenceImpl implements l	// class@001d6d
{

    public void LiveLiteMultiChatViewController$handleChatInfo$1(b p0){
       super(1, p0, b.class, "handleNewUsers", "handleNewUsers\(Ljava/util/List;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatViewController$handleChatInfo$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, b.class, "5")) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             ChatInfo uChatInfo = treceiver.m.p();
             if (uChatInfo != null) {
                Map map = uChatInfo.b();
                if (map != null) {
                   a uoa = map.get(str);
                   if (uoa != null) {
                      a c = uoa.c;
                      if (c != null && c.equals(treceiver.n) == true) {
                         c = new a(treceiver.m, uoa, new LiveLiteMultiChatViewController$handleNewUsers$1$1$subVC$1(treceiver));
                      }else if(uoa.b()){
                         c = new a(treceiver.m, uoa, new LiveLiteMultiChatViewController$handleNewUsers$1$1$subVC$2(treceiver));
                      }else {
                         c = new a(treceiver.m, uoa, new LiveLiteMultiChatViewController$handleNewUsers$1$1$subVC$3(treceiver));
                      }
                      View view = treceiver.P2();
                      Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                      treceiver.y2(view, c);
                      treceiver.k.put(str, c);
                   }
                }
             }
          }
       }
       return;
    }
}
