package androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.ChildHelper$a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup$LayoutParams;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public class RecyclerView$e implements ChildHelper$a	// class@00088c
{
    public final RecyclerView a;

    public void RecyclerView$e(RecyclerView p0){
       this.a = p0;
       super();
    }
    public void addView(View p0,int p1){
       this.a.addView(p0, p1);
       this.a.dispatchChildAttached(p0);
    }
    public RecyclerView$ViewHolder d(View p0){
       return RecyclerView.getChildViewHolderInt(p0);
    }
    public void e(View p0){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       if (childViewHol != null) {
          childViewHol.onEnteredHiddenState(this.a);
       }
       return;
    }
    public void f(View p0,int p1,ViewGroup$LayoutParams p2){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       if (childViewHol != null) {
          if (childViewHol.isTmpDetached() || childViewHol.shouldIgnore()) {
             childViewHol.clearTmpDetachFlag();
          }else {
             throw new IllegalArgumentException("Called attach on a child which is not detached: "+childViewHol+this.a.exceptionLabel());
          }
       }
       RecyclerView.access$000(this.a, p0, p1, p2);
       return;
    }
    public void g(int p0){
       View childAt = this.getChildAt(p0);
       if (childAt != null) {
          RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(childAt);
          if (childViewHol != null) {
             if (!childViewHol.isTmpDetached() || childViewHol.shouldIgnore()) {
                childViewHol.addFlags(256);
             }else {
                throw new IllegalArgumentException("called detach on an already detached child "+childViewHol+this.a.exceptionLabel());
             }
          }
       }
       RecyclerView.access$100(this.a, p0);
       return;
    }
    public View getChildAt(int p0){
       return this.a.getChildAt(p0);
    }
    public int getChildCount(){
       return this.a.getChildCount();
    }
    public int h(View p0){
       return this.a.indexOfChild(p0);
    }
    public void i(View p0){
       RecyclerView$ViewHolder childViewHol = RecyclerView.getChildViewHolderInt(p0);
       if (childViewHol != null) {
          childViewHol.onLeftHiddenState(this.a);
       }
       return;
    }
    public void removeAllViews(){
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          View childAt = this.getChildAt(i);
          this.a.dispatchChildDetached(childAt);
          childAt.clearAnimation();
       }
       this.a.removeAllViews();
       return;
    }
    public void removeViewAt(int p0){
       View childAt = this.a.getChildAt(p0);
       if (childAt != null) {
          this.a.dispatchChildDetached(childAt);
          childAt.clearAnimation();
       }
       this.a.removeViewAt(p0);
       return;
    }
}
