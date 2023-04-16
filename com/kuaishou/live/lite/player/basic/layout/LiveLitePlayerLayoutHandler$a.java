package com.kuaishou.live.lite.player.basic.layout.LiveLitePlayerLayoutHandler$a;
import erd.g;
import com.kuaishou.live.lite.player.basic.layout.LiveLitePlayerLayoutHandler;
import java.lang.Object;
import db3.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveLitePlayerLayoutHandler$a implements g	// class@000a66
{
    public final LiveLitePlayerLayoutHandler b;

    public void LiveLitePlayerLayoutHandler$a(LiveLitePlayerLayoutHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerLayoutHandler$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.d(p0);
       }
       return;
    }
}
