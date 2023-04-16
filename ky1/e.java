package ky1.e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import java.lang.Object;
import java.lang.CharSequence;

public final class e implements Observer	// class@002e25
{
    public final LiveTempEnhanceView b;

    public void e(LiveTempEnhanceView p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       this.b.setContent(p0);
    }
}
