package fna.g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;

public final class g implements View$OnClickListener	// class@00297c
{
    public final GrowthCleanerCorePresenter b;

    public void g(GrowthCleanerCorePresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       if (!this.b.R8(null)) {
          this.b.V8();
       }
       return;
    }
}
