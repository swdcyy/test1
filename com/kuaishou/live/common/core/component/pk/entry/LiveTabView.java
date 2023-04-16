package com.kuaishou.live.common.core.component.pk.entry.LiveTabView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;

public class LiveTabView extends ConstraintLayout	// class@001737
{
    public ImageView B;
    public TextView C;

    public void LiveTabView(Context p0){
       super(p0, null);
    }
    public void LiveTabView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveTabView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.c(p0, R.layout.arg_RES_7f0d0e06, this);
       this.B = m1.f(this, 0x7f0a34e7);
       this.C = m1.f(this, 0x7f0a3caa);
    }
    public void setRedDotViewVisibility(int p0){
       if (PatchProxy.isSupport(LiveTabView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveTabView.class, "1")) {
          return;
       }
       this.B.setVisibility(p0);
       return;
    }
    public void setText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTabView.class, "2")) {
          return;
       }
       this.C.setText(p0);
       return;
    }
}
