package com.kwai.feature.component.commonfragment.baseeditor.b$a;
import android.view.View$OnLayoutChangeListener;
import com.kwai.feature.component.commonfragment.baseeditor.b;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.b$a$a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import java.lang.Runnable;
import android.os.Handler;

public class b$a implements View$OnLayoutChangeListener	// class@0011fa
{
    public int b;
    public Runnable c;
    public final b d;

    public void b$a(b p0){
       this.d = p0;
       super();
       this.c = new b$a$a(this);
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(b$a.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
             return;
          }
       }
       this.d.d.n1.removeCallbacks(this.c);
       this.d.d.n1.postDelayed(this.c, 20);
       return;
    }
}
