package com.yxcorp.gifshow.detail.plc.view.PlcImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;

public class PlcImageView extends KwaiImageView	// class@0016a4
{

    public void PlcImageView(Context p0){
       super(p0);
    }
    public void PlcImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PlcImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setCornersRadius(float p0){
       if (PatchProxy.isSupport(PlcImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PlcImageView.class, "2")) {
          return;
       }
       this.getHierarchy().L(RoundingParams.c(p0));
       return;
    }
}
