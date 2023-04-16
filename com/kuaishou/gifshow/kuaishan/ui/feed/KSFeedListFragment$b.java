package com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment$b;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSStaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Math;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.util.HashSet;

public final class KSFeedListFragment$b implements Runnable	// class@001acd
{
    public final KSFeedListFragment b;

    public void KSFeedListFragment$b(KSFeedListFragment p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KSFeedListFragment$b.class, "1")) {
          return;
       }
       int[] ointArray = new int[2];
       int[] ointArray1 = new int[2];
       KSFeedListFragment.Gh(this.b).findFirstVisibleItemPositions(ointArray);
       KSFeedListFragment.Gh(this.b).findLastVisibleItemPositions(ointArray1);
       int i = Math.min(Math.min(ointArray[0], ointArray[1]), Math.min(ointArray1[0], ointArray1[1]));
       int i1 = Math.max(Math.max(ointArray[0], ointArray[1]), Math.max(ointArray1[0], ointArray1[1]));
       if (i <= i1) {
          KSTemplateDetailInfo kSTemplateDe = this.b.g7().N0(i);
          while (kSTemplateDe != null) {
             kSTemplateDe.mIndexInGroup = i;
             this.b.K.add(kSTemplateDe);
             break ;
             i = i + 1;
          }
          if (i != i1) {
             goto label_0068 ;
          }
       }
       return;
    }
}
