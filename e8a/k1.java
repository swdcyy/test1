package e8a.k1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class k1 implements View$OnClickListener	// class@0020ba
{
    public final SlideVerticalAtlasExpandPresenter b;

    public void k1(SlideVerticalAtlasExpandPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k1.class, "1")) {
          return;
       }
       this.b.S8(true);
       return;
    }
}
