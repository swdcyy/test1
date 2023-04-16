package com.kwai.library.widget.seekbar.KwaiSeekBar$a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import java.lang.Object;
import android.widget.SeekBar;

public class KwaiSeekBar$a implements SeekBar$OnSeekBarChangeListener	// class@0009ef
{
    public final KwaiSeekBar b;

    public void KwaiSeekBar$a(KwaiSeekBar p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       KwaiSeekBar p = this.b.p;
       if (p != null) {
          p.onProgressChanged(p0, p1, p2);
       }
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
       KwaiSeekBar$a tb = this.b;
       tb.k = true;
       KwaiSeekBar p = tb.p;
       if (p != null) {
          p.onStartTrackingTouch(p0);
       }
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       KwaiSeekBar$a tb = this.b;
       tb.k = false;
       KwaiSeekBar p = tb.p;
       if (p != null) {
          p.onStopTrackingTouch(p0);
       }
       return;
    }
}
