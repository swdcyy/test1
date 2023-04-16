package com.facebook.rebound.ui.SpringConfiguratorView$e;
import android.widget.AdapterView$OnItemSelectedListener;
import com.facebook.rebound.ui.SpringConfiguratorView;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import java.util.List;
import dg.f;
import java.util.Objects;
import java.lang.Math;
import android.widget.SeekBar;

public class SpringConfiguratorView$e implements AdapterView$OnItemSelectedListener	// class@001449
{
    public final SpringConfiguratorView b;

    public void SpringConfiguratorView$e(SpringConfiguratorView p0){
       this.b = p0;
       super();
    }
    public void onItemSelected(AdapterView p0,View p1,int p2,long p3){
       SpringConfiguratorView$e tb = this.b;
       tb.n = tb.c.get(p2);
       tb = this.b;
       SpringConfiguratorView n = tb.n;
       Objects.requireNonNull(tb);
       f b = n.b;
       double d = 0;
       double d1 = (!b - d)? d: ((b - 194.00f) / 0x400cf5c28f5c28f6) + 30.00f;
       d1 = Math.round(((((float)d1 - 0) * 100000.00f) / 200.00f));
       f a = n.a;
       if (a - d) {
          d = 8.00f + ((a - 25.00f) / 3.00f);
       }
       tb.i.setProgress(d1);
       tb.j.setProgress(Math.round(((((float)d - 0) * 100000.00f) / 50.00f)));
       return;
    }
    public void onNothingSelected(AdapterView p0){
    }
}
