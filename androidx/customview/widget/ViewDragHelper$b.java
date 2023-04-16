package androidx.customview.widget.ViewDragHelper$b;
import java.lang.Runnable;
import androidx.customview.widget.ViewDragHelper;
import java.lang.Object;

public class ViewDragHelper$b implements Runnable	// class@000736
{
    public final ViewDragHelper b;

    public void ViewDragHelper$b(ViewDragHelper p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.setDragState(0);
    }
}
