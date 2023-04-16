package com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarViewV2;
import com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import ekd.m1;
import android.widget.TextView;
import lnc.a1;
import android.graphics.Typeface;
import ekd.d0;

public class LiveMerchantAudienceBottomBarViewV2 extends LiveMerchantAudienceBottomBarView	// class@0018e0
{
    public TextView g;
    public View h;

    public void LiveMerchantAudienceBottomBarViewV2(Context p0){
       super(p0);
    }
    public void LiveMerchantAudienceBottomBarViewV2(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveMerchantAudienceBottomBarViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAudienceBottomBarViewV2.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.setClipChildren(false);
       this.setClipToPadding(false);
       this.h = m1.f(p0, 0x7f0a29ba);
       this.g = m1.f(p0, 0x7f0a09a4);
       this.g.setTypeface(d0.a("fonts/AvenirNext-BoldItalic.ttf", a1.c()));
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d1676;
    }
}
