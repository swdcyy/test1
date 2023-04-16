package cnd.a$c;
import java.lang.Runnable;
import cnd.a;
import zmd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter;
import java.util.List;
import xld.a;

public final class a$c implements Runnable	// class@000341
{
    public final a b;
    public final a c;

    public void a$c(a p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       RecyclerView$Adapter adapter = this.b.d.getAdapter();
       Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter");
       adapter.M0(this.c.i(), this.c.m(), this.c.z());
       return;
    }
}
