package com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestSeekBar$a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestSeekBar;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestSeekBar$b;

public class InterestSeekBar$a implements SeekBar$OnSeekBarChangeListener	// class@001741
{
    public final InterestSeekBar b;

    public void InterestSeekBar$a(InterestSeekBar p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport2(InterestSeekBar$a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, InterestSeekBar$a.class, "1")) {
          return;
       }
       InterestSeekBar b = this.b.b;
       if (b != null) {
          b.onProgressChanged(p0, p1, p2);
       }
       PatchProxy.onMethodExit(InterestSeekBar$a.class, "1");
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InterestSeekBar$a.class, "2")) {
          return;
       }
       InterestSeekBar b = this.b.b;
       if (b != null) {
          b.onStopTrackingTouch(p0);
       }
       PatchProxy.onMethodExit(InterestSeekBar$a.class, "2");
       return;
    }
}
