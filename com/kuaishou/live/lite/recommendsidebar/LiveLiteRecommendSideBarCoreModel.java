package com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarCoreModel;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendPanelItemType;
import xc3.e;
import com.yxcorp.gifshow.entity.QPhoto;

public final class LiveLiteRecommendSideBarCoreModel	// class@000adf
{
    public e a;
    public QPhoto b;
    public MutableLiveData c;
    public int d;

    public void LiveLiteRecommendSideBarCoreModel(){
       super();
       this.c = new MutableLiveData();
       this.d = LiveLiteRecommendPanelItemType.Followed.mType;
    }
    public final e a(){
       return this.a;
    }
    public final QPhoto b(){
       return this.b;
    }
    public final MutableLiveData c(){
       return this.c;
    }
    public final int d(){
       return this.d;
    }
    public final void e(e p0){
       this.a = p0;
    }
    public final void f(QPhoto p0){
       this.b = p0;
    }
}
