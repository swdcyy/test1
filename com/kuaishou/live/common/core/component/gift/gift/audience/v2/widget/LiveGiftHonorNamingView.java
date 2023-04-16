package com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.LiveGiftHonorNamingView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ml1.a;
import android.view.View$OnClickListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.LiveGiftHonorNamingView$a;

public class LiveGiftHonorNamingView extends FrameLayout implements d	// class@001296
{
    public LiveGiftItemHintItem b;
    public LiveGiftItemHintDisplayInfo c;
    public LiveGiftHonorNamingView$a d;
    public LiveUserView e;
    public TextView f;
    public KwaiImageView g;
    public ConstraintLayout h;

    public void LiveGiftHonorNamingView(Context p0){
       super(p0, null);
    }
    public void LiveGiftHonorNamingView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftHonorNamingView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.c(p0, R.layout.arg_RES_7f0d0549, this);
       this.doBindView(this);
       this.setOnClickListener(new a(this));
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftHonorNamingView.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a200b);
       this.f = m1.f(p0, 0x7f0a1d42);
       this.g = m1.f(p0, 0x7f0a1d40);
       this.h = m1.f(p0, 0x7f0a1d3f);
       return;
    }
    public void setOnLiveGiftHonorNamingViewClickListener(LiveGiftHonorNamingView$a p0){
       this.d = p0;
    }
}
