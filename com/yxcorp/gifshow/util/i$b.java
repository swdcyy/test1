package com.yxcorp.gifshow.util.i$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.util.i;
import androidx.recyclerview.widget.RecyclerView;

public class i$b extends RecyclerView$r	// class@001f81
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (p1) {
          return;
       }
       i$b ta = this.a;
       if (ta.h != null) {
          ta.d();
       }else if(ta.g == null){
          ta.d();
       }
       return;
    }
}
