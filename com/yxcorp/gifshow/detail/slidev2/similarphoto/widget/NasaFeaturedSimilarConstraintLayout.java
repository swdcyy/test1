package com.yxcorp.gifshow.detail.slidev2.similarphoto.widget.NasaFeaturedSimilarConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.similarphoto.widget.NasaFeaturedSimilarConstraintLayout$a;
import android.view.ViewGroup;

public class NasaFeaturedSimilarConstraintLayout extends ConstraintLayout	// class@001a00
{
    public NasaFeaturedSimilarConstraintLayout$a B;

    public void NasaFeaturedSimilarConstraintLayout(Context p0){
       super(p0);
    }
    public void NasaFeaturedSimilarConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void NasaFeaturedSimilarConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       NasaFeaturedSimilarConstraintLayout obj = PatchProxy.applyOneRefs(p0, this, NasaFeaturedSimilarConstraintLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B;
       if (obj != null) {
          obj.a();
       }
       return super.dispatchTouchEvent(p0);
    }
    public void setTouchCallback(NasaFeaturedSimilarConstraintLayout$a p0){
       this.B = p0;
    }
}
