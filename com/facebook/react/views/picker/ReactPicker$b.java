package com.facebook.react.views.picker.ReactPicker$b;
import java.lang.Runnable;
import com.facebook.react.views.picker.ReactPicker;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.Spinner;
import android.view.View$MeasureSpec;

public class ReactPicker$b implements Runnable	// class@0013d5
{
    public final ReactPicker b;

    public void ReactPicker$b(ReactPicker p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ReactPicker$b.class, "1")) {
          return;
       }
       ReactPicker$b tb = this.b;
       tb.measure(View$MeasureSpec.makeMeasureSpec(tb.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(this.b.getHeight(), 0x40000000));
       tb = this.b;
       tb.layout(tb.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
       return;
    }
}
