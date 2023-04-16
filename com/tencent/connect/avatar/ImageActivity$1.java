package com.tencent.connect.avatar.ImageActivity$1;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.tencent.connect.avatar.ImageActivity;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.tencent.connect.avatar.b;
import android.graphics.Rect;
import com.tencent.connect.avatar.c;

public class ImageActivity$1 implements ViewTreeObserver$OnGlobalLayoutListener	// class@000e2e
{
    public final ImageActivity a;

    public void ImageActivity$1(ImageActivity p0){
       this.a = p0;
       super();
    }
    public void onGlobalLayout(){
       this.a.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       ImageActivity$1 ta = this.a;
       ImageActivity.a(ta, ImageActivity.a(ta).a());
       ImageActivity.c(this.a).a(ImageActivity.b(this.a));
    }
}
