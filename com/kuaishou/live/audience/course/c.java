package com.kuaishou.live.audience.course.c;
import erd.a;
import com.kuaishou.live.audience.course.e;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.util.Objects;
import s31.d;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class c implements a	// class@000bfb
{
    public final e b;
    public final ProgressFragment c;

    public void c(e p0,ProgressFragment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tb = this.b;
       c tc = this.c;
       tb.H = null;
       Objects.requireNonNull(tc);
       tb.p.post(new d(tc));
       tc.dismiss();
    }
}
