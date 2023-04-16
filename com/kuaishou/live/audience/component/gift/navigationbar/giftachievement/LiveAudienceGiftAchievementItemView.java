package com.kuaishou.live.audience.component.gift.navigationbar.giftachievement.LiveAudienceGiftAchievementItemView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;

public class LiveAudienceGiftAchievementItemView extends LinearLayout	// class@000b76
{

    public void LiveAudienceGiftAchievementItemView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceGiftAchievementItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceGiftAchievementItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftAchievementItemView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0a0b, this);
       }
       return;
    }
}
