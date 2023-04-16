package com.yxcorp.gifshow.growth.kwaibubble.KwaiBubbleManager$showKwaiBubbleDialog$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import rn.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class KwaiBubbleManager$showKwaiBubbleDialog$2 extends Lambda implements a	// class@00141d
{
    public final a $kwaiPop;

    public void KwaiBubbleManager$showKwaiBubbleDialog$2(a p0){
       this.$kwaiPop = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, KwaiBubbleManager$showKwaiBubbleDialog$2.class, "1")) {
          return;
       }
       KwaiBubbleManager$showKwaiBubbleDialog$2 t$kwaiPop = this.$kwaiPop;
       if (t$kwaiPop != null) {
          t$kwaiPop.show();
       }
       return;
    }
}
