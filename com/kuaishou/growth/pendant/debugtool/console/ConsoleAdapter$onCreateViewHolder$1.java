package com.kuaishou.growth.pendant.debugtool.console.ConsoleAdapter$onCreateViewHolder$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.growth.pendant.debugtool.console.ConsoleAdapter;
import java.lang.Object;
import ke0.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.content.ClipData;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.content.ClipboardManager;
import qrd.p;
import ke0.b;
import java.lang.Throwable;
import nsd.u;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class ConsoleAdapter$onCreateViewHolder$1 extends Lambda implements l	// class@000655
{
    public final ConsoleAdapter this$0;

    public void ConsoleAdapter$onCreateViewHolder$1(ConsoleAdapter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, ConsoleAdapter$onCreateViewHolder$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       ClipData uClipData = ClipData.newPlainText("Label", p0.c);
       ConsoleAdapter$onCreateViewHolder$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object obj = PatchProxy.apply(null, tthis$0, ConsoleAdapter.class, str);
       if (obj != PatchProxyResult.class) {
       }else {
          obj = tthis$0.e.getValue();
       }
       obj.setPrimaryClip(uClipData);
       a uoa = new a("ConsoleAdapter", "¸´ÖÆµ½¼ôÌù°å", null, null, 12, null);
       this.this$0.g.add(v7);
       ConsoleAdapter$onCreateViewHolder$1 tthis$01 = this.this$0;
       tthis$01.n0((tthis$01.getItemCount() - 1));
       return;
    }
}
