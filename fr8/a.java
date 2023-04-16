package fr8.a;
import fr8.b;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.IllegalStateException;
import java.lang.String;

public class a implements b	// class@002346
{

    public void a(){
       super();
    }
    public int a(RecyclerView p0){
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       this.c(layoutManage);
       return layoutManage.getOrientation();
    }
    public boolean b(RecyclerView p0){
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       this.c(layoutManage);
       return layoutManage.getReverseLayout();
    }
    public final void c(RecyclerView$LayoutManager p0){
       if (p0 instanceof LinearLayoutManager) {
          return;
       }
       throw new IllegalStateException("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
    }
}
