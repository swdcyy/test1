package com.facebook.rebound.ui.SpringConfiguratorView$c;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.facebook.rebound.ui.SpringConfiguratorView;
import java.lang.Object;
import android.widget.SeekBar;
import dg.d;
import dg.f;
import java.lang.String;
import java.text.DecimalFormat;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;

public class SpringConfiguratorView$c implements SeekBar$OnSeekBarChangeListener	// class@001447
{
    public final SpringConfiguratorView b;

    public void SpringConfiguratorView$c(SpringConfiguratorView p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       double d;
       SpringConfiguratorView$c tb = this.b;
       float f = 100000.00f;
       if (p0 == tb.i) {
          d = (double)((((float)p1 * 200.00f) / f) + 0);
          tb.b = d.b(d);
          String str = SpringConfiguratorView.o.format(d);
          this.b.m.setText("T:"+str);
       }
       tb = this.b;
       if (p0 == tb.j) {
          double d1 = (double)((((float)p1 * 50.00f) / f) + 0);
          p1.a = d.a(d1);
          String str1 = SpringConfiguratorView.o.format(d1);
          this.b.l.setText("F:"+str1);
       }
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
    }
    public void onStopTrackingTouch(SeekBar p0){
    }
}
