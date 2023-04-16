package com.facebook.react.views.picker.ReactPicker$a;
import android.widget.AdapterView$OnItemSelectedListener;
import com.facebook.react.views.picker.ReactPicker;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.facebook.react.views.picker.ReactPicker$c;

public class ReactPicker$a implements AdapterView$OnItemSelectedListener	// class@0013d4
{
    public final ReactPicker b;

    public void ReactPicker$a(ReactPicker p0){
       this.b = p0;
       super();
    }
    public void onItemSelected(AdapterView p0,View p1,int p2,long p3){
       if (PatchProxy.isSupport(ReactPicker$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Long.valueOf(p3), this, ReactPicker$a.class, "1")) {
          return;
       }
       ReactPicker l = this.b.l;
       if (l != null) {
          l.b(p2);
       }
       return;
    }
    public void onNothingSelected(AdapterView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactPicker$a.class, "2")) {
          return;
       }
       ReactPicker l = this.b.l;
       if (l != null) {
          l.b(-1);
       }
       return;
    }
}
