package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$c;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class SlideVerticalAtlasPlayer$c extends RecyclerView$r	// class@0008cb
{
    public final SlideVerticalAtlasPlayer a;

    public void SlideVerticalAtlasPlayer$c(SlideVerticalAtlasPlayer p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       a.p(p0, "recyclerView");
       if (p1 != 1) {
       }else {
          SlideVerticalAtlasPlayer.G(this.a, 0, 1, null);
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       a.p(p0, "recyclerView");
       if (!this.a.B()) {
          this.a.H();
       }
       return;
    }
}
