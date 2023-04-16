package ge2.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsBanner$a;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsBanner;
import com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsBanner$b;

public final class c implements View$OnClickListener	// class@002b07
{
    public final LivePkAvatarsBanner$a b;
    public final int c;

    public void c(LivePkAvatarsBanner$a p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       c tc = this.c;
       LivePkAvatarsBanner g = this.b.d.g;
       if (g != null) {
          g.a(tc);
       }
       return;
    }
}
