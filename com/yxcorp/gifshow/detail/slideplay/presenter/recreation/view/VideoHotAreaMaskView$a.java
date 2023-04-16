package com.yxcorp.gifshow.detail.slideplay.presenter.recreation.view.VideoHotAreaMaskView$a;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.view.VideoHotAreaMaskView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class VideoHotAreaMaskView$a implements View$OnTouchListener	// class@001864
{
    public final VideoHotAreaMaskView b;

    public void VideoHotAreaMaskView$a(VideoHotAreaMaskView p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       VideoHotAreaMaskView$a tb;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, VideoHotAreaMaskView$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = false;
       if (!p1.getAction()) {
          tb = this.b;
          tb.d = tb.a(p1, b);
          return this.b.d;
       }else if(p1.getAction() == 1){
          tb = this.b;
          if (tb.d != null && tb.a(p1, true)) {
             b = true;
          }
       }
       return b;
    }
}
