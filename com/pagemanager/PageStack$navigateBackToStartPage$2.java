package com.pagemanager.PageStack$navigateBackToStartPage$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ck8.b;
import java.lang.Object;
import qrd.l1;

public final class PageStack$navigateBackToStartPage$2 extends Lambda implements a	// class@000b40
{
    public final b $callback;

    public void PageStack$navigateBackToStartPage$2(b p0){
       this.$callback = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       PageStack$navigateBackToStartPage$2 t$callback = this.$callback;
       if (t$callback != null) {
          t$callback.a(false, 404);
       }
       return;
    }
}
