package androidx.recyclerview.widget.k$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$c;
import java.lang.Object;
import java.util.Arrays;
import java.lang.System;
import java.lang.IllegalArgumentException;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$t;

public class k$b implements RecyclerView$LayoutManager$c	// class@00091a
{
    public int a;
    public int b;
    public int[] c;
    public int d;

    public void k$b(){
       super();
    }
    public void a(int p0,int p1){
       if (p0 < 0) {
          throw new IllegalArgumentException("Layout positions must be non-negative");
       }
       if (p1 < 0) {
          throw new IllegalArgumentException("Pixel distance must be non-negative");
       }
       int i = this.d * 2;
       k$b tc = this.c;
       if (tc == null) {
          int[] ointArray = new int[4];
          this.c = ointArray;
          Arrays.fill(ointArray, -1);
       }else if(i >= tc.length){
          int[] ointArray1 = new int[(i * 2)];
          this.c = ointArray1;
          System.arraycopy(tc, 0, ointArray1, 0, tc.length);
       }
       tc = this.c;
       tc[i] = p0;
       tc[(i + 1)] = p1;
       this.d = this.d + 1;
       return;
    }
    public void b(){
       k$b tc = this.c;
       if (tc != null) {
          Arrays.fill(tc, -1);
       }
       this.d = 0;
       return;
    }
    public void c(RecyclerView p0,boolean p1){
       this.d = 0;
       k$b tc = this.c;
       if (tc != null) {
          Arrays.fill(tc, -1);
       }
       RecyclerView mLayout = p0.mLayout;
       if (p0.mAdapter != null && (mLayout != null && mLayout.isItemPrefetchEnabled())) {
          if (p1) {
             if (!p0.mAdapterHelper.p()) {
                mLayout.collectInitialPrefetchPositions(p0.mAdapter.getItemCount(), this);
             }
          }else if(!p0.hasPendingAdapterUpdates()){
             mLayout.collectAdjacentPrefetchPositions(this.a, this.b, p0.mState, this);
          }
          k$b td = this.d;
          if (td > mLayout.mPrefetchMaxCountObserved) {
             mLayout.mPrefetchMaxCountObserved = td;
             mLayout.mPrefetchMaxObservedInInitialPrefetch = p1;
             p0.mRecycler.K();
          }
       }
    label_004b :
       return;
    }
    public boolean d(int p0){
       if (this.c != null) {
          int i = this.d * 2;
          int i1 = 0;
          while (i1 < i) {
             if (this.c[i1] == p0) {
                return true;
             }
             i1 = i1 + 2;
          }
       }
       return false;
    }
    public void e(int p0,int p1){
       this.a = p0;
       this.b = p1;
    }
}
