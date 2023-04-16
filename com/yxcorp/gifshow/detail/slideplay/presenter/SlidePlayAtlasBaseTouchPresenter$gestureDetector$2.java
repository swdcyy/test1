package com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter$gestureDetector$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import android.view.GestureDetector;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import android.content.Context;
import android.widget.ImageView;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.view.GestureDetector$OnGestureListener;

public final class SlidePlayAtlasBaseTouchPresenter$gestureDetector$2 extends Lambda implements a	// class@001839
{
    public final SlidePlayAtlasBaseTouchPresenter this$0;

    public void SlidePlayAtlasBaseTouchPresenter$gestureDetector$2(SlidePlayAtlasBaseTouchPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final GestureDetector invoke(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAtlasBaseTouchPresenter$gestureDetector$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GestureDetector(this.this$0.Z8().getContext(), new GestureDetector$SimpleOnGestureListener());
    }
    public Object invoke(){
       return this.invoke();
    }
}
