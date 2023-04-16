package com.yxcorp.gifshow.v3.previewer.ktv.h;
import ml8.d;
import java.lang.Object;
import com.yxcorp.gifshow.v3.previewer.ktv.h$a;
import com.yxcorp.gifshow.v3.previewer.ktv.h$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mwc.p;
import java.lang.Math;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.da;
import android.widget.SeekBar;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import mwc.q;
import android.view.View$OnClickListener;

public class h implements d	// class@0015c3
{
    public ImageView b;
    public TextView c;
    public TextView d;
    public SeekBar e;
    public VideoSDKPlayerView f;
    public double g;
    public double h;
    public boolean i;
    public b j;
    public VideoSDKPlayerView$e k;
    public SeekBar$OnSeekBarChangeListener l;

    public void h(){
       super();
       this.k = new h$a(this);
       this.l = new h$b(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.h = Math.max(0, ((double)p.a().c() / 0x408f400000000000));
       int i = p.a().e();
       this.c.setText("00:00");
       this.d.setText(da.b(Math.max((long)i, 1000)));
       this.e.setMax(i);
       this.e.setProgress(0);
       this.b.setSelected(this.f.isPlaying());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a310b);
       this.d = m1.f(p0, 0x7f0a310c);
       this.b = m1.f(p0, 0x7f0a30ff);
       this.e = m1.f(p0, 0x7f0a311c);
       m1.a(p0, new q(this), R.id.player_control_btn_container);
       return;
    }
}
