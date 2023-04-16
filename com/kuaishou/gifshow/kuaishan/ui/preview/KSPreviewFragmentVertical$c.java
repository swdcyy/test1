package com.kuaishou.gifshow.kuaishan.ui.preview.KSPreviewFragmentVertical$c;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPreviewFragmentVertical;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment;
import com.kuaishou.gifshow.kuaishan.ui.preview.c;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import u79.a;
import java.lang.IllegalStateException;

public class KSPreviewFragmentVertical$c implements ViewPager$i	// class@001adf
{
    public final KSPreviewFragmentVertical b;

    public void KSPreviewFragmentVertical$c(KSPreviewFragmentVertical p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       KSPreviewFragmentVertical$c uoc = KSPreviewFragmentVertical$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().y("KSPreviewFragmentVertical", "onPageScrollStateChanged: "+p0, objArray);
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       boolean b;
       KSPreviewFragmentVertical$c uoc = KSPreviewFragmentVertical$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("KSPreviewFragmentVertical", "onPageSelected: position="+p0, objArray);
       uoc = this.b;
       if (uoc.Q == null) {
          throw new IllegalStateException("mKSLaunchParams is null");
       }
       uoc.w.I(p0);
       uoc = this.b;
       uoc.R.t(uoc.Q.getGroupId(), p0);
       this.b.vh(i);
       uoc = this.b;
       if (uoc.E == null || uoc.F != null) {
          Object[] objArray1 = new Object[i];
          e.D().s("KSPreviewFragmentVertical", "onPageSelected: no more page", objArray1);
          return;
       }else if(p0 > (uoc.w.j() - 4)){
          b = true;
       }else {
          b = false;
       }
       Object[] objArray2 = new Object[i];
       e.D().s("KSPreviewFragmentVertical", "onPageSelected: needPreloadNextPage="+b, objArray2);
       if (b) {
          this.b.fh();
       }
       return;
    }
}
