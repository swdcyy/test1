package com.kuaishou.ark.rtx.widget.scrollview.a;
import java.lang.Runnable;
import com.kuaishou.ark.rtx.widget.scrollview.RTXScrollerView;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import nr.b;
import iq8.x;

public final class a implements Runnable	// class@000fa1
{
    public final RTXScrollerView b;
    public final boolean c;

    public void a(RTXScrollerView p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       tb.mChildRecyclerView.fling(0, -200);
       b uob = new b(tb, this.c);
       x.d(uob, 100);
    }
}
