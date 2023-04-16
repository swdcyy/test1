package com.kuaishou.live.ad.fanstop.f;
import android.content.DialogInterface$OnDismissListener;
import java.lang.Object;
import android.content.DialogInterface;
import com.kuaishou.live.ad.fanstop.g;
import com.kuaishou.live.common.ad.fanstop.a;
import h91.a;

public final class f implements DialogInterface$OnDismissListener	// class@0009a1
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void onDismiss(DialogInterface p0){
       a.g().j(null, true);
    }
}
