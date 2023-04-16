package com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestItemView$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestSeekBar$b;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestItemView;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Objects;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta$InterestV3Entity;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestItemView$b;

public final class InterestItemView$a implements InterestSeekBar$b	// class@001734
{
    public final InterestItemView a;

    public void InterestItemView$a(InterestItemView p0){
       this.a = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport2(InterestItemView$a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, InterestItemView$a.class, "1")) {
          return;
       }
       InterestItemView$a ta = this.a;
       ta.e.setText(ta.b(p1));
       PatchProxy.onMethodExit(InterestItemView$a.class, "1");
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InterestItemView$a.class, "2")) {
          return;
       }
       if (p0 != null) {
          InterestItemView$a ta = this.a;
          InterestItemView f = ta.f;
          if (f != null) {
             InterestItemView h = ta.h;
             if (h != null) {
                Objects.requireNonNull(ta);
                h.a(((p0.getProgress() * 2) - 100), f);
             }
          }
          ta = this.a;
          ta.e.setText(ta.b(p0.getProgress()));
          if (p0.getProgress() != 50) {
             int progress = p0.getProgress();
             if (45 <= progress && 55 >= progress) {
                p0.setProgress(50);
             }
          }
       }
    label_004c :
       PatchProxy.onMethodExit(InterestItemView$a.class, "2");
       return;
    }
}
