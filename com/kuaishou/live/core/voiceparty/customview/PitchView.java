package com.kuaishou.live.core.voiceparty.customview.PitchView;
import ml8.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kuaishou.live.core.voiceparty.customview.PitchIndexView;
import sr2.i;
import android.view.View$OnClickListener;
import sr2.h;
import java.lang.Integer;
import ok.n;
import com.kuaishou.live.core.voiceparty.customview.PitchView$a;

public class PitchView extends LinearLayout implements d	// class@0014bf
{
    public View b;
    public View c;
    public PitchIndexView d;
    public int e;
    public int f;
    public PitchView$a g;

    public void PitchView(Context p0){
       super(p0, null);
    }
    public void PitchView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PitchView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = 100;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PitchView.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a206d);
       this.d = m1.f(p0, 0x7f0a206f);
       this.b = m1.f(p0, 0x7f0a206e);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, PitchView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.b.setOnClickListener(new i(this));
       this.c.setOnClickListener(new h(this));
       return;
    }
    public void setPitchLevel(int p0){
       if (PatchProxy.isSupport(PitchView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PitchView.class, "4")) {
          return;
       }
       boolean b = (p0 >= 0 && p0 <= 10)? true: false;
       n.b(b);
       if (this.f == p0) {
          return;
       }else {
          this.f = p0;
          this.d.setPitchLevel(p0);
          PitchView tg = this.g;
          if (tg != null) {
             tg.c((int)((float)this.e * (((float)this.f * 0x3f800000) / 10.00f)));
          }
          return;
       }
    }
    public void setPitchLevelListener(PitchView$a p0){
       this.g = p0;
    }
}
