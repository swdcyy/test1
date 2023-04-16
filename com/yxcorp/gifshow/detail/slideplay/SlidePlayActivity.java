package com.yxcorp.gifshow.detail.slideplay.SlidePlayActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.ArrayList;
import android.view.View;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import az6.a;

public abstract class SlidePlayActivity extends GifshowActivity	// class@00170f
{
    public String A;
    public KwaiPlayerConfig B;
    public List y;
    public boolean z;

    public void SlidePlayActivity(){
       super();
       this.y = new ArrayList();
    }
    public void addSlidePlayIgnoreView(View p0){
    }
    public void removeSlidePlayIgnoreView(View p0){
    }
    public SlidePlayLogger u3(){
       return null;
    }
    public boolean v3(){
       return false;
    }
    public void w3(a p0){
    }
}
