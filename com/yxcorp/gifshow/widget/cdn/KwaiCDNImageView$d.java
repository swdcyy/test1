package com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView$d;
import ub.a;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import java.lang.String;
import bd.f;
import android.graphics.drawable.Animatable;
import java.lang.Object;
import java.lang.Throwable;

public class KwaiCDNImageView$d extends a	// class@001964
{
    public final a b;
    public final KwaiCDNImageView c;

    public void KwaiCDNImageView$d(KwaiCDNImageView p0,a p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void a(String p0,f p1,Animatable p2){
       KwaiCDNImageView$d tb = this.b;
       if (tb != null) {
          tb.onFinalImageSet(p0, p1, p2);
       }
       return;
    }
    public void onFailure(String p0,Throwable p1){
       KwaiCDNImageView$d tb = this.b;
       if (tb != null) {
          tb.onFailure(p0, p1);
       }
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       this.a(p0, p1, p2);
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
       KwaiCDNImageView$d tb = this.b;
       if (tb != null) {
          tb.onIntermediateImageFailed(p0, p1);
       }
       return;
    }
    public void onIntermediateImageSet(String p0,Object p1){
       KwaiCDNImageView$d tb = this.b;
       if (tb != null) {
          tb.onIntermediateImageSet(p0, p1);
       }
       return;
    }
    public void onRelease(String p0){
       KwaiCDNImageView$d tb = this.b;
       if (tb != null) {
          tb.onRelease(p0);
       }
       return;
    }
    public void onSubmit(String p0,Object p1){
       KwaiCDNImageView$d tb = this.b;
       if (tb != null) {
          tb.onSubmit(p0, p1);
       }
       return;
    }
}
