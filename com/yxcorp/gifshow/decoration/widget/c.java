package com.yxcorp.gifshow.decoration.widget.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import aw9.o;
import erd.g;

public final class c implements Runnable	// class@0012bc
{
    public final DecorationContainerView b;
    public final BaseDrawer c;

    public void c(DecorationContainerView p0,BaseDrawer p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tc = this.c;
       this.b.g(new o(tc), tc);
    }
}
