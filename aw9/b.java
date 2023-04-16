package aw9.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Object;
import android.view.View;
import android.widget.AbsoluteLayout;

public final class b implements Runnable	// class@0002c5
{
    public final BaseDrawer b;
    public final DecorationContainerView c;

    public void b(BaseDrawer p0,DecorationContainerView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.c.removeView(this.b.mDecorationShowingView);
    }
}
