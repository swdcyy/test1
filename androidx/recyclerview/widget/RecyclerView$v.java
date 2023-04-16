package androidx.recyclerview.widget.RecyclerView$v;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.a;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View;
import java.lang.Runnable;
import a2.i0;

public class RecyclerView$v extends RecyclerView$i	// class@0008a1
{
    public final RecyclerView a;

    public void RecyclerView$v(RecyclerView p0){
       this.a = p0;
       super();
    }
    public void g(){
       this.a.assertNotInLayoutOrScroll(null);
       RecyclerView$v ta = this.a;
       ta.mState.g = true;
       ta.processDataSetCompletelyChanged(true);
       if (!this.a.mAdapterHelper.p()) {
          this.a.requestLayout();
       }
       return;
    }
    public void i(int p0,int p1,Object p2){
       this.a.assertNotInLayoutOrScroll(null);
       if (this.a.mAdapterHelper.r(p0, p1, p2)) {
          this.n();
       }
       return;
    }
    public void j(int p0,int p1){
       this.a.assertNotInLayoutOrScroll(null);
       if (this.a.mAdapterHelper.s(p0, p1)) {
          this.n();
       }
       return;
    }
    public void k(int p0,int p1,int p2){
       this.a.assertNotInLayoutOrScroll(null);
       if (this.a.mAdapterHelper.t(p0, p1, p2)) {
          this.n();
       }
       return;
    }
    public void l(int p0,int p1){
       this.a.assertNotInLayoutOrScroll(null);
       if (this.a.mAdapterHelper.u(p0, p1)) {
          this.n();
       }
       return;
    }
    public void m(){
       RecyclerView$v ta = this.a;
       if (ta.mPendingSavedState == null) {
          return;
       }
       RecyclerView mAdapter = ta.mAdapter;
       if (mAdapter != null && mAdapter.a0()) {
          this.a.requestLayout();
       }
       return;
    }
    public void n(){
       RecyclerView$v ta;
       if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
          ta = this.a;
          if (ta.mHasFixedSize != null && ta.mIsAttached != null) {
             i0.k0(ta, ta.mUpdateChildViewsRunnable);
          label_001c :
             return;
          }
       }
       ta = this.a;
       ta.mAdapterUpdateDuringMeasure = true;
       ta.requestLayout();
       goto label_001c ;
    }
}
