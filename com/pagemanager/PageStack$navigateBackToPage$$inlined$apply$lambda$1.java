package com.pagemanager.PageStack$navigateBackToPage$$inlined$apply$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ck8.b;
import android.app.Activity;
import java.util.Map;
import ck8.e;
import java.lang.Object;
import qrd.l1;

public final class PageStack$navigateBackToPage$$inlined$apply$lambda$1 extends Lambda implements a	// class@000b3f
{
    public final boolean $animated$inlined;
    public final Map $backParam$inlined;
    public final b $callback$inlined;
    public final e $targetPage$inlined;
    public final Activity $topActivity$inlined;

    public void PageStack$navigateBackToPage$$inlined$apply$lambda$1(b p0,Activity p1,boolean p2,Map p3,e p4){
       this.$callback$inlined = p0;
       this.$topActivity$inlined = p1;
       this.$animated$inlined = p2;
       this.$backParam$inlined = p3;
       this.$targetPage$inlined = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       PageStack$navigateBackToPage$$inlined$apply$lambda$1 t$callback$i = this.$callback$inlined;
       if (t$callback$i != null) {
          t$callback$i.a(false, 404);
       }
       return;
    }
}
