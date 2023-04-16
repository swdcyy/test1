package com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotBaseView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import ec3.f;
import android.view.ViewGroup;
import android.view.View;
import ha1.b;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;

public abstract class LiveGiftSlotBaseView extends SelectShapeRelativeLayout	// class@001279
{
    public TextView c;
    public TextView d;
    public TextView e;
    public LiveGradientTextView f;
    public KwaiImageView g;
    public KwaiImageView h;
    public KwaiImageView i;
    public LiveGradientBackgroundView j;
    public LiveGradientBorderView k;
    public KwaiImageView l;

    public void LiveGiftSlotBaseView(Context p0){
       super(p0, null);
    }
    public void LiveGiftSlotBaseView(Context p0,AttributeSet p1){
       super(p0, p1);
       if (f.b()) {
          b.c(p0, this.getLayoutResId(), this, true);
       }else {
          LayoutInflater.from(p0).inflate(this.getLayoutResId(), this);
       }
       this.c();
       return;
    }
    public abstract void c();
    public TextView getComboView(){
       return this.e;
    }
    public KwaiImageView getGiftIconView(){
       return this.h;
    }
    public abstract int getLayoutResId();
}
