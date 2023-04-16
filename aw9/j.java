package aw9.j;
import erd.g;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;

public final class j implements g	// class@0002ce
{
    public final BaseDrawer b;
    public final Object c;

    public void j(BaseDrawer p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0.d(this.b, this.c);
    }
}
