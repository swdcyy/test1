package com.yxcorp.gifshow.panel.sizer.view.SizerSectionView$1;
import androidx.recyclerview.widget.DecoSafeStaggeredLayoutManager;
import com.yxcorp.gifshow.panel.sizer.view.SizerSectionView;

public class SizerSectionView$1 extends DecoSafeStaggeredLayoutManager	// class@000e31
{
    public final SizerSectionView d;

    public void SizerSectionView$1(SizerSectionView p0,int p1,int p2){
       this.d = p0;
       super(p1, p2);
    }
    public boolean canScrollVertically(){
       return this.d.K;
    }
}
