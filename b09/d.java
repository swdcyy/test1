package b09.d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d implements View$OnClickListener	// class@00034c
{
    public final AdPlayEndTKPresenter b;

    public void d(AdPlayEndTKPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
          return;
       }
       this.b.W8();
       this.b.V8(1);
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
