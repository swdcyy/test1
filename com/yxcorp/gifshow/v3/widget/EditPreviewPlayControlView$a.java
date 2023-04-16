package com.yxcorp.gifshow.v3.widget.EditPreviewPlayControlView$a;
import com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar$b;
import com.yxcorp.gifshow.v3.widget.EditPreviewPlayControlView;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.widget.EditPreviewPlayControlView$b;
import com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar;
import android.view.ViewGroup;

public class EditPreviewPlayControlView$a implements EditPreviewProgressBar$b	// class@001634
{
    public final EditPreviewPlayControlView b;

    public void EditPreviewPlayControlView$a(EditPreviewPlayControlView p0){
       this.b = p0;
       super();
    }
    public boolean b(){
       return false;
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(EditPreviewPlayControlView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, EditPreviewPlayControlView$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("EditPreviewPlayControl", "onProgressChanged\(\) called with: seekBar = ["+p0+"], progress = ["+p1+"], fromUser = ["+p2+"]", objArray);
       if (p2) {
          double d = ((double)p1 * 0x3ff0000000000000) / 0x408f400000000000;
          EditPreviewPlayControlView$a tb = this.b;
          double d1 = tb.k * d;
          tb.l = d1;
          tb.i.setText(tb.a(d1));
          EditPreviewPlayControlView n = this.b.n;
          if (n != null) {
             n.c(d);
          }
          this.b.d.setProgress(p0.getProgress());
       }
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditPreviewPlayControlView$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("EditPreviewPlayControl", "onStartTrackingTouch\(\) called with: seekBar = ["+p0+"]", objArray);
       EditPreviewPlayControlView$a tb = this.b;
       tb.b = true;
       tb.c(true);
       this.b.h.setVisibility(0);
       EditPreviewPlayControlView n = this.b.n;
       if (n != null) {
          n.a();
       }
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditPreviewPlayControlView$a.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("EditPreviewPlayControl", "onStopTrackingTouch\(\) called with: seekBar = ["+p0+"]", objArray);
       this.b.c(0);
       EditPreviewPlayControlView$a tb = this.b;
       tb.b = false;
       if (tb.m == null) {
          tb.h.setVisibility(8);
       }
       EditPreviewPlayControlView n = this.b.n;
       if (n != null) {
          n.d();
       }
       return;
    }
}
