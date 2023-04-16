package com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.GestureDetector;
import android.widget.SeekBar;
import com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar$a;
import android.view.GestureDetector$OnGestureListener;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import faa.a;
import q87.c;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar$b;

public class EditPreviewProgressBar extends AppCompatSeekBar	// class@001639
{
    public GestureDetector c;
    public EditPreviewProgressBar$b d;
    public boolean e;
    public boolean f;
    public float g;
    public EditPreviewProgressBar h;
    public boolean i;

    public void EditPreviewProgressBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = 0;
       this.h = this;
       this.b();
    }
    public void EditPreviewProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = 0;
       this.h = this;
       this.b();
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, EditPreviewProgressBar.class, "1")) {
          return;
       }
       this.c = new GestureDetector(this.getContext(), new EditPreviewProgressBar$a(this));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditPreviewProgressBar.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.getAction() == 1 || p0.getAction() == 3) {
          if (this.f != null) {
             if (this.d != null) {
                Object[] objArray = new Object[0];
                a.D().w("EditPreviewProgressBar", "tracking: action up tracking stop", objArray);
                this.d.onStopTrackingTouch(this);
             }
             this.f = false;
          }
          this.i = false;
       }
       this.e = false;
       return this.c.onTouchEvent(p0);
    }
    public void setOnEditPreviewProgressBarListener(EditPreviewProgressBar$b p0){
       this.d = p0;
    }
    public void setOnSeekBarChangeListener(SeekBar$OnSeekBarChangeListener p0){
    }
}
