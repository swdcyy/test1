package com.tachikoma.core.component.text.TKText$b;
import android.view.View$OnLayoutChangeListener;
import com.tachikoma.core.component.text.TKText;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.tachikoma.core.component.e;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.graphics.Rect;

public class TKText$b implements View$OnLayoutChangeListener	// class@000d91
{
    public final String b;
    public final TKText c;

    public void TKText$b(TKText p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(TKText$b.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, TKText$b.class, "1")) {
             return;
          }
       }
       this.c.getView().removeOnLayoutChangeListener(this);
       this.c.setGradient(this.b, new Rect(0, 0, (p3 - p1), (p4 - p2)));
       return;
    }
}
