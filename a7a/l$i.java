package a7a.l$i;
import java.lang.Runnable;
import a7a.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rf5.u;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import android.graphics.Rect;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import android.view.ViewGroup;

public final class l$i implements Runnable	// class@000065
{
    public final l b;

    public void l$i(l p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, l$i.class, "1")) {
          return;
       }
       this.b.b9().C(new Rect(this.b.n9(), this.b.X8().getTop(), this.b.X8().getRight(), this.b.X8().getBottom()));
       PatchProxy.onMethodExit(l$i.class, "1");
       return;
    }
}
