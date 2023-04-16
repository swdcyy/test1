package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter$3;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter;
import android.content.Context;

public class RecommendUserVideoListPresenter$3 extends LinearLayoutManager	// class@001754
{
    public final RecommendUserVideoListPresenter r;

    public void RecommendUserVideoListPresenter$3(RecommendUserVideoListPresenter p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public boolean canScrollHorizontally(){
       return true;
    }
}
