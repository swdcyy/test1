package com.kuaishou.live.common.core.component.recommendgift.LivePkScoreBarSprintAnimView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;

public class LivePkScoreBarSprintAnimView extends ConstraintLayout	// class@00174c
{
    public View B;
    public KwaiImageView C;
    public KwaiImageView D;
    public f E;

    public void LivePkScoreBarSprintAnimView(Context p0){
       super(p0, null);
    }
    public void LivePkScoreBarSprintAnimView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePkScoreBarSprintAnimView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.c(p0, R.layout.arg_RES_7f0d0d02, this);
       if (PatchProxy.applyVoidOneRefs(this, this, LivePkScoreBarSprintAnimView.class, "3")) {
       }else {
          this.B = this.findViewById(0x7f0a2298);
          this.C = this.findViewById(0x7f0a229a);
          this.D = this.findViewById(0x7f0a2299);
       }
       return;
    }
}
