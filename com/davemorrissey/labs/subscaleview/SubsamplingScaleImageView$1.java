package com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$1;
import android.os.Handler$Callback;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.Object;
import android.os.Message;
import android.view.View$OnLongClickListener;
import android.view.View;

public class SubsamplingScaleImageView$1 implements Handler$Callback	// class@000fab
{
    public final SubsamplingScaleImageView this$0;

    public void SubsamplingScaleImageView$1(SubsamplingScaleImageView p0){
       this.this$0 = p0;
       super();
    }
    public boolean handleMessage(Message p0){
       if (p0.what == true) {
          SubsamplingScaleImageView$1 tthis$0 = this.this$0;
          SubsamplingScaleImageView onLongClickL = tthis$0.onLongClickListener;
          if (onLongClickL != null) {
             tthis$0.maxTouchCount = 0;
             SubsamplingScaleImageView.access$201(tthis$0, onLongClickL);
             this.this$0.performLongClick();
             SubsamplingScaleImageView.access$301(this.this$0, null);
          }
       }
       return true;
    }
}
