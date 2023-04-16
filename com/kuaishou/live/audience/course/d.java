package com.kuaishou.live.audience.course.d;
import erd.a;
import com.kuaishou.live.audience.course.e;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.util.Objects;
import s31.d;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class d implements a	// class@000bfc
{
    public final e b;
    public final ProgressFragment c;

    public void d(e p0,ProgressFragment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tc = this.c;
       Objects.requireNonNull(tc);
       this.b.p.postDelayed(new d(tc), 50);
    }
}
