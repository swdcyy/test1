package com.yxcorp.plugin.search.widget.SearchLottieAnimationView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import com.airbnb.lottie.RenderMode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;

public class SearchLottieAnimationView extends KwaiLottieAnimationView	// class@0007dc
{

    public void SearchLottieAnimationView(Context p0){
       super(p0, null);
    }
    public void SearchLottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SearchLottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (Build$VERSION.SDK_INT <= 22) {
          this.setRenderMode(RenderMode.SOFTWARE);
       }
       return;
    }
    public void setRenderMode(RenderMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchLottieAnimationView.class, "1")) {
          return;
       }
       if (Build$VERSION.SDK_INT <= 22) {
          super.setRenderMode(RenderMode.SOFTWARE);
       }
       return;
    }
}
