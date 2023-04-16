package com.kuaishou.gifshow.kuaishan.ui.feed.KSStaggeredGridLayoutManager;
import com.yxcorp.gifshow.recycler.widget.KwaiStaggeredGridLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import java.lang.Integer;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public final class KSStaggeredGridLayoutManager extends KwaiStaggeredGridLayoutManager	// class@001ad5
{

    public void KSStaggeredGridLayoutManager(int p0,int p1){
       super(p0, p1);
    }
    public final int getFirstChildPosition(){
       View obj = PatchProxy.apply(null, this, KSStaggeredGridLayoutManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (this.getChildCount()) {
          obj = this.getChildAt(0);
          if (obj != null) {
             i = this.getPosition(obj);
          }
       }
       return i;
    }
    public void onScrollStateChanged(int p0){
       KSStaggeredGridLayoutManager kSStaggeredG = KSStaggeredGridLayoutManager.class;
       if (PatchProxy.isSupport(kSStaggeredG) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kSStaggeredG, "1")) {
          return;
       }
       int i = 0;
       if (p0 > 0) {
          this.setGapStrategy(i);
       }else if(!p0){
          int spanCount = this.getSpanCount();
          int[] ointArray = new int[spanCount];
          this.findFirstCompletelyVisibleItemPositions(ointArray);
          while (i < spanCount) {
             if (ointArray[i] < this.getSpanCount()) {
                this.setGapStrategy(2);
                break ;
             }
             i = i + 1;
          }
       }
       super.onScrollStateChanged(p0);
       return;
    }
}
