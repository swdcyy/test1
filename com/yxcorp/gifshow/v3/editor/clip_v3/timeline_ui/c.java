package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a$b;
import android.view.View;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a;
import dpc.e;
import t36.f$a;
import t36.f;

public final class c implements Runnable	// class@000df8
{
    public final a$b b;
    public final View c;

    public void c(a$b p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.e.w.q0(new e(this.c));
    }
}
