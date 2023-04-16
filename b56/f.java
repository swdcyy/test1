package b56.f;
import android.view.View$OnClickListener;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import android.view.View;

public final class f implements View$OnClickListener	// class@000401
{
    public final KwaiXfControlPanel b;

    public void f(KwaiXfControlPanel p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       tb.i(tb.M.isSelected(), tb.M);
    }
}
