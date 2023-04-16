package com.kuaishou.live.lite.recommendsidebar.panel.j;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarCoreModel;
import xc3.d;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment$c;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import io.reactivex.subjects.PublishSubject;

public class j	// class@000aff
{
    public MutableLiveData a;
    public MutableLiveData b;
    public MutableLiveData c;
    public PublishSubject d;
    public PublishSubject e;
    public PublishSubject f;
    public QPhoto g;
    public LiveLiteRecommendSideBarCoreModel h;
    public d i;
    public LiveLiteRecommendPanelFragment$c j;

    public void j(LiveLiteRecommendSideBarCoreModel p0,d p1,LiveLiteRecommendPanelFragment$c p2){
       super();
       this.a = new MutableLiveData();
       this.b = new MutableLiveData();
       this.c = new MutableLiveData();
       this.d = PublishSubject.g();
       this.e = PublishSubject.g();
       this.f = PublishSubject.g();
       this.h = p0;
       this.i = p1;
       this.j = p2;
    }
}
