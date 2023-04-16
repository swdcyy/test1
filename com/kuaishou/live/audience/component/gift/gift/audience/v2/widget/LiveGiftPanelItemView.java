package com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveGiftPanelItemView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$a;
import va1.b0;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ScrollMode;
import com.kuaishou.live.common.core.basic.widget.VerticalPageIndicator;

public class LiveGiftPanelItemView extends RelativeLayout implements d	// class@000b6b
{
    public HorizontalPageIndicator b;
    public VerticalPageIndicator c;
    public LiveGiftGridView d;
    public View e;

    public void LiveGiftPanelItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftPanelItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.c(p0, R.layout.arg_RES_7f0d0b39, this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelItemView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a10b0);
       this.d = m1.f(p0, 0x7f0a10a9);
       this.d.setScrollMode(LiveGiftBoxConfig.m.a().d(b0.a()));
       this.e = m1.f(p0, 0x7f0a10b1);
       this.c = m1.f(p0, 0x7f0a1d54);
       return;
    }
    public LiveGiftGridView getGridView(){
       return this.d;
    }
    public HorizontalPageIndicator getHorizontalPageIndicator(){
       return this.b;
    }
    public View getTipsHostView(){
       return this.e;
    }
    public VerticalPageIndicator getVerticalPageIndicator(){
       return this.c;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveGiftPanelItemView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
}
