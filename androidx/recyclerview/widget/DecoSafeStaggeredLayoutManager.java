package androidx.recyclerview.widget.DecoSafeStaggeredLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class DecoSafeStaggeredLayoutManager extends StaggeredGridLayoutManager	// class@00086d
{
    public boolean b;
    public RecyclerView c;

    public void DecoSafeStaggeredLayoutManager(int p0,int p1){
       super(p0, p1);
       this.b = false;
    }
    public void DecoSafeStaggeredLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.b = false;
    }
    public void N(RecyclerView p0){
       this.c = p0;
    }
    public void O(){
       this.mLazySpanLookup.b();
       this.requestSimpleAnimationsInNextLayout();
       this.requestLayout();
    }
    public boolean checkForGaps(){
       this.b = true;
       this.b = false;
       return super.checkForGaps();
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       try{
          super.onLayoutChildren(p0, p1);
       }catch(java.lang.IndexOutOfBoundsException e1){
          ExceptionHandler.handleCaughtException(e1);
       }
       return;
    }
    public void onScrollStateChanged(int p0){
       if (!p0) {
          this.checkForGaps();
       }
       try{
          super.onScrollStateChanged(p0);
       }catch(java.lang.Exception e1){
          ExceptionHandler.handleCaughtException(e1);
       }
       return;
    }
    public void requestLayout(){
       if (this.b != null) {
          DecoSafeStaggeredLayoutManager tc = this.c;
          if (tc != null) {
             tc.markItemDecorInsetsDirty();
          }
       }
       super.requestLayout();
       return;
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       try{
          return super.scrollVerticallyBy(p0, p1, p2);
       }catch(java.lang.Exception e1){
          ExceptionHandler.handleCaughtException(e1);
          return 0;
       }
    }
}
