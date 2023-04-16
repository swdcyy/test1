package com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment$d;
import sfc.a;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.Spinner;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import e17.i;

public final class LivePlayTestActivity$TestContainerFragment$d extends a	// class@00181d
{
    public final LivePlayTestActivity$TestContainerFragment c;
    public final String d;

    public void LivePlayTestActivity$TestContainerFragment$d(LivePlayTestActivity$TestContainerFragment p0,String p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTestActivity$TestContainerFragment$d.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       super.b(p0);
       this.c.ch();
       LivePlayTestActivity$TestContainerFragment m = this.c.m;
       if (m == null) {
          a.S("spinner");
       }
       m.setSelection(0);
       i.d(R.style.arg_RES_7f110668, "´ò¿ªÖ±²¥Ê§°Ü "+this.d+' '+p0);
       return;
    }
}
