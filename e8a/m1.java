package e8a.m1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public final class m1 implements Runnable	// class@0020c0
{
    public final SlideVerticalAtlasExpandPresenter b;

    public void m1(SlideVerticalAtlasExpandPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       SlideVerticalAtlasExpandPresenter v0;
       if (PatchProxy.applyVoid(null, this, m1.class, "1")) {
          return;
       }
       if ((v0 = this.b.V0) != null) {
          v0.requestLayout();
       }
       return;
    }
}
