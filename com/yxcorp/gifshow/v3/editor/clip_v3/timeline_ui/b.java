package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a$b;
import android.view.View;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a;
import dpc.d;
import t36.f$a;
import t36.f;

public final class b implements Runnable	// class@000df7
{
    public final a$b b;
    public final View c;

    public void b(a$b p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.e.w.q0(new d(this.c));
    }
}
