package ak2.e;
import android.view.View$OnClickListener;
import ak2.l;
import java.lang.Object;
import android.view.View;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public final class e implements View$OnClickListener	// class@0000e8
{
    public final l b;

    public void e(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       tb.V8();
       l i = tb.I;
       if (i != null) {
          i.onClickAuthorHead(tb.F);
       }
       return;
    }
}
