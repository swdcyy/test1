package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import android.os.SystemClock;

public class NasaSidebarFeedPresenter$g	// class@0017f9
{
    public String a;
    public String b;
    public long c;
    public long d;
    public long e;

    public void NasaSidebarFeedPresenter$g(QPhoto p0){
       super();
       this.a = p0.getListLoadSequenceID();
       this.b = p0.getPhotoId();
       this.c = SystemClock.elapsedRealtime();
    }
}
