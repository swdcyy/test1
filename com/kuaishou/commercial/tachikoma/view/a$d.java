package com.kuaishou.commercial.tachikoma.view.a$d;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.kuaishou.commercial.tachikoma.view.a;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import k00.d;
import java.util.Objects;

public class a$d implements SeekBar$OnSeekBarChangeListener	// class@001694
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(a$d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, a$d.class, "1")) {
          return;
       }
       if (!p2) {
          return;
       }
       a$d tb = this.b;
       a e = tb.e;
       if (e != null) {
          e.setText(tb.g(p1));
       }
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "2")) {
          return;
       }
       this.b.f(0x36ee80);
       p0.q = false;
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "3")) {
          return;
       }
       a$d tb = this.b;
       tb.q = true;
       if (tb.m != null) {
          return;
       }
       long duration = this.b.a.getDuration();
       long l = (long)((float)duration * (((float)p0.getProgress() * 0x3f800000) / (float)p0.getMax()));
       Objects.requireNonNull(this.b);
       if ((duration - l) - 1000 < 0) {
          l = duration - 1000;
       }
       this.b.a.seekTo(l);
       this.b.h();
       this.b.f(3000);
       return;
    }
}
