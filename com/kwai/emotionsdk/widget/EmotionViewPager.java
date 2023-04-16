package com.kwai.emotionsdk.widget.EmotionViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import io.reactivex.subjects.PublishSubject;
import android.util.AttributeSet;
import android.content.res.Configuration;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class EmotionViewPager extends ViewPager	// class@000dc0
{
    public PublishSubject b;

    public void EmotionViewPager(Context p0){
       super(p0);
       this.b = PublishSubject.g();
    }
    public void EmotionViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = PublishSubject.g();
    }
    public PublishSubject getConfigSubject(){
       return this.b;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmotionViewPager.class, "1")) {
          return;
       }
       super.onConfigurationChanged(p0);
       this.b.onNext(p0);
       return;
    }
}
