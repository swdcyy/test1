package q9.a;
import q9.c;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import t9.g;
import java.lang.Object;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import android.view.View;
import android.graphics.Rect;

public abstract class a implements c	// class@00297e
{
    public RecyclerView$LayoutManager a;
    public g b;

    public void a(RecyclerView$LayoutManager p0,g p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public AnchorViewState a(){
       return AnchorViewState.b();
    }
    public AnchorViewState d(View p0){
       return new AnchorViewState(this.a.getPosition(p0), this.b.t(p0));
    }
    public g e(){
       return this.b;
    }
}
