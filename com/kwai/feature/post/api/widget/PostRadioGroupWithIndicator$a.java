package com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator$a;
import android.view.View$OnLayoutChangeListener;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.RadioGroup;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import android.widget.RadioButton;

public class PostRadioGroupWithIndicator$a implements View$OnLayoutChangeListener	// class@001473
{
    public final PostRadioGroupWithIndicator b;

    public void PostRadioGroupWithIndicator$a(PostRadioGroupWithIndicator p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(PostRadioGroupWithIndicator$a.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, PostRadioGroupWithIndicator$a.class, "1")) {
             return;
          }
       }
       this.b.m.removeOnLayoutChangeListener(this);
       int checkedRadio = (this.b.m.getCheckedRadioButtonId() != -1)? this.b.m.getCheckedRadioButtonId(): this.b.s.values().iterator().next().getId();
       this.b.o(checkedRadio, 0);
       return;
    }
}
