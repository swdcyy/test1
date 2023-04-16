package com.facebook.react.views.picker.ReactPickerManager$a;
import com.facebook.react.views.picker.ReactPicker$c;
import com.facebook.react.views.picker.ReactPicker;
import df.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import tf.a;
import android.widget.Spinner;
import df.b;

public class ReactPickerManager$a implements ReactPicker$c	// class@0013d8
{
    public final ReactPicker a;
    public final c b;

    public void ReactPickerManager$a(ReactPicker p0,c p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void b(int p0){
       ReactPickerManager$a uoa = ReactPickerManager$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.b.c(new a(this.a.getId(), p0));
       return;
    }
}
