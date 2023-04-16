package com.kuaishou.growth.pendant.debugtool.console.ConsoleAdapter$cm$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.growth.pendant.debugtool.console.ConsoleAdapter;
import android.content.ClipboardManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import java.util.Objects;

public final class ConsoleAdapter$cm$2 extends Lambda implements a	// class@000654
{
    public final ConsoleAdapter this$0;

    public void ConsoleAdapter$cm$2(ConsoleAdapter p0){
       this.this$0 = p0;
       super(0);
    }
    public final ClipboardManager invoke(){
       Object obj = PatchProxy.apply(null, this, ConsoleAdapter$cm$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.f.getSystemService("clipboard");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
