package com.kwai.feature.post.api.widget.RecordSeekBar$a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.kwai.feature.post.api.widget.RecordSeekBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.SeekBar;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Runnable;
import android.os.Handler;

public class RecordSeekBar$a implements SeekBar$OnSeekBarChangeListener	// class@001479
{
    public final SeekBar$OnSeekBarChangeListener b;
    public final RecordSeekBar c;

    public void RecordSeekBar$a(RecordSeekBar p0,SeekBar$OnSeekBarChangeListener p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RecordSeekBar$a.class, "4")) {
          return;
       }
       this.c.c(false);
       this.c.setProgressTextAlpha(255);
       return;
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       int i;
       if (PatchProxy.isSupport(RecordSeekBar$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, RecordSeekBar$a.class, "1")) {
          return;
       }
       if (p1 != this.c.getDefaultIndicatorProgress()) {
          RecordSeekBar u = this.c.u;
          if (PatchProxy.isSupport(RecordSeekBar.class)) {
             Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(u), Integer.valueOf(p1), null, RecordSeekBar.class, "8");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else if(!p0 instanceof KwaiSeekBar){
                i = -1;
             }else if(u <= null){
                int defaultIndic = p0.getDefaultIndicatorProgress();
                if (defaultIndic >= 0 && (defaultIndic <= p0.getMax() && (p1 != defaultIndic && (p1 > (defaultIndic - u) && p1 < (u + defaultIndic))))) {
                   p0.setProgress(defaultIndic);
                   i = defaultIndic;
                }
             }
          label_0056 :
             i = p1;
          }else {
             goto label_004e ;
          }
          if (i != p1) {
             p0.setProgress((this.c.y + i));
             p1 = i;
          }
       }
       RecordSeekBar$a tb = this.b;
       if (tb != null) {
          tb.onProgressChanged(p0, p1, p2);
       }
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordSeekBar$a.class, "2")) {
          return;
       }
       if (this.c.t != null) {
          this.a();
          p0.d(true);
       }
       RecordSeekBar$a tb = this.b;
       if (tb != null) {
          tb.onStartTrackingTouch(p0);
       }
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       RecordSeekBar$a tc;
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordSeekBar$a.class, "3")) {
          return;
       }
       if (this.c.t != null) {
          this.a();
          tc = this.c;
          tc.w.postDelayed(tc.x, 2000);
       }
       tc = this.b;
       if (tc != null) {
          tc.onStopTrackingTouch(p0);
       }
       return;
    }
}
