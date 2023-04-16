package com.horcrux.svg.ImageView$1;
import wc.c;
import com.horcrux.svg.ImageView;
import kb.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import cb.a;
import android.graphics.Bitmap;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.VirtualView;

public class ImageView$1 extends c	// class@0005a9
{
    public final ImageView this$0;

    public void ImageView$1(ImageView p0){
       this.this$0 = p0;
       super();
    }
    public void onFailureImpl(c p0){
       this.this$0.mLoading.set(false);
       Object[] objArray = new Object[false];
       a.A("ReactNative", p0.e(), "RNSVG: fetchDecodedImage failed!", objArray);
    }
    public void onNewResultImpl(Bitmap p0){
       this.this$0.mLoading.set(false);
       SvgView svgView = this.this$0.getSvgView();
       if (svgView != null) {
          svgView.invalidate();
       }
       return;
    }
}
