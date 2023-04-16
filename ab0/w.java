package ab0.w;
import android.view.View$OnClickListener;
import com.kuaishou.gifshow.smartalbum.ui.grid.d;
import java.lang.Object;
import android.view.View;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import java.lang.String;
import fb0.l;

public final class w implements View$OnClickListener	// class@000058
{
    public final d b;

    public void w(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       w tb = this.b;
       d c = tb.C;
       if (c != null) {
          tb.R8(c, false);
       }
       tb.q.smoothScrollToPosition(false);
       tb.t.setVisibility(8);
       l.f("CREATE_NEW_ALBUM_TIP");
       return;
    }
}
