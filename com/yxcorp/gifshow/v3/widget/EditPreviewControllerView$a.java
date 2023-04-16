package com.yxcorp.gifshow.v3.widget.EditPreviewControllerView$a;
import com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar$b;
import com.yxcorp.gifshow.v3.widget.EditPreviewControllerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.widget.EditPreviewControllerView$b;
import android.widget.SeekBar;
import java.lang.Integer;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.ViewGroup;
import java.lang.CharSequence;
import android.widget.TextView;

public class EditPreviewControllerView$a implements EditPreviewProgressBar$b	// class@001631
{
    public final EditPreviewControllerView b;

    public void EditPreviewControllerView$a(EditPreviewControllerView p0){
       this.b = p0;
       super();
    }
    public boolean b(){
       EditPreviewControllerView obj = PatchProxy.apply(null, this, EditPreviewControllerView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.j;
       if (obj != null) {
          obj.b();
       }
       return false;
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(EditPreviewControllerView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, EditPreviewControllerView$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("EditPreviewControllerView", "onProgressChanged\(\) called with: seekBar = ["+p0+"], progress = ["+p1+"], fromUser = ["+p2+"]", objArray);
       if (p2) {
          this.b.d.setVisibility(0);
          double d = ((double)p1 * 0x3ff0000000000000) / 100.00f;
          EditPreviewControllerView$a tb = this.b;
          double d1 = tb.g * d;
          tb.h = d1;
          tb.e.setText(tb.a(d1));
          EditPreviewControllerView j = this.b.j;
          if (j != null) {
             j.c(d);
          }
       }
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditPreviewControllerView$a.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("EditPreviewControllerView", "onStartTrackingTouch\(\) called with: seekBar = ["+p0+"]", objArray);
       EditPreviewControllerView$a tb = this.b;
       tb.b = true;
       tb.i = p0.getProgress();
       EditPreviewControllerView j = this.b.j;
       if (j != null) {
          j.a();
       }
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditPreviewControllerView$a.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("EditPreviewControllerView", "onStopTrackingTouch\(\) called with: seekBar = ["+p0+"]", objArray);
       EditPreviewControllerView$a tb = this.b;
       tb.b = false;
       tb.d.setVisibility(8);
       tb = this.b;
       int i = p0.getProgress() - tb.i;
       EditPreviewControllerView j = tb.j;
       if (j != null) {
          j.d(i);
       }
       return;
    }
}
