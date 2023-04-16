package com.kuaishou.live.common.core.component.gift.detailhint.widget.LiveGiftDetailHintView;
import ml8.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lh1.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nh1.a;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import nh1.b;

public class LiveGiftDetailHintView extends ConstraintLayout implements d	// class@001165
{
    public View B;
    public TextView C;
    public TextView D;
    public KwaiImageView E;
    public b F;
    public a G;
    public static final float H;

    static {
       LiveGiftDetailHintView.H = (float)a1.d(0x7f07042c);
    }
    public void LiveGiftDetailHintView(Context p0){
       super(p0, null);
    }
    public void LiveGiftDetailHintView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftDetailHintView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.c(p0, R.layout.arg_RES_7f0d0b31, this);
       this.doBindView(this);
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, LiveGiftDetailHintView.class, "3")) {
          return;
       }
       if (this.F != null) {
          LiveGiftDetailHintView tG = this.G;
          if (tG != null && !TextUtils.x(tG.j)) {
             this.setOnClickListener(new a(this));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftDetailHintView.class, "1")) {
          return;
       }
       this.B = p0.findViewById(0x7f0a1d36);
       this.C = p0.findViewById(0x7f0a1d39);
       this.D = p0.findViewById(0x7f0a1d37);
       this.E = p0.findViewById(0x7f0a1d38);
       this.L();
       return;
    }
    public void setHintViewListener(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftDetailHintView.class, "2")) {
          return;
       }
       this.F = p0;
       this.L();
       return;
    }
}
