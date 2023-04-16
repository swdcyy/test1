package hn1.j;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import java.lang.Object;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class j implements Observer	// class@002737
{
    public final LiveCoverIconView b;

    public void j(LiveCoverIconView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          this.b.N(p0);
       }
       return;
    }
}
