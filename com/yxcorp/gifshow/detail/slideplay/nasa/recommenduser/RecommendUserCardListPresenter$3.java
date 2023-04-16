package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserCardListPresenter$3;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserCardListPresenter;
import android.content.Context;

public class RecommendUserCardListPresenter$3 extends LinearLayoutManager	// class@001750
{
    public final RecommendUserCardListPresenter r;

    public void RecommendUserCardListPresenter$3(RecommendUserCardListPresenter p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public boolean canScrollVertically(){
       return false;
    }
}
