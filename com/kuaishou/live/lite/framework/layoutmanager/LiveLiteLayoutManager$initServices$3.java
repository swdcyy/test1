package com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$initServices$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import android.view.View;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Integer;

public final class LiveLiteLayoutManager$initServices$3 extends Lambda implements a	// class@000913
{
    public final LiveLiteLayoutManager this$0;

    public void LiveLiteLayoutManager$initServices$3(LiveLiteLayoutManager p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       LiveLiteLayoutManager obj = PatchProxy.apply(null, this, LiveLiteLayoutManager$initServices$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.this$0.t;
       if (obj == null) {
          a.S("layoutBottomLine");
       }
       int bottom = obj.getBottom();
       LiveLiteLayoutManager$initServices$3 tthis$0 = this.this$0;
       if (tthis$0.c != null) {
          bottom = bottom + tthis$0.a;
       }
       return (bottom - n.A(tthis$0.N));
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
