package com.yxcorp.gifshow.v3.previewer.ktv.h$b;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.yxcorp.gifshow.v3.previewer.ktv.h;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;

public class h$b implements SeekBar$OnSeekBarChangeListener	// class@0015c2
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(h$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, h$b.class, "1")) {
          return;
       }
       if (p2) {
          h$b tb = this.b;
          h f = tb.f;
          double d = (double)((float)p1 / 1000.00f);
          h h = (tb.i != null)? tb.h: 0;
          f.seekTo((d + h));
       }
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
    }
    public void onStopTrackingTouch(SeekBar p0){
    }
}
