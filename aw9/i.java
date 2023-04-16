package aw9.i;
import erd.g;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;

public final class i implements g	// class@0002cd
{
    public final BaseDrawer b;
    public final Object c;

    public void i(BaseDrawer p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0.t(this.b, this.c);
    }
}
