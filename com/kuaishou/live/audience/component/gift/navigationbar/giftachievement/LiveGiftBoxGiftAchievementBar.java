package com.kuaishou.live.audience.component.gift.navigationbar.giftachievement.LiveGiftBoxGiftAchievementBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.audience.component.gift.navigationbar.giftachievement.LiveAudienceGiftAchievementListAreaView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View$OnClickListener;

public class LiveGiftBoxGiftAchievementBar extends ConstraintLayout	// class@000b79
{
    public LiveAudienceGiftAchievementListAreaView B;
    public TextView C;
    public KwaiImageView D;

    public void LiveGiftBoxGiftAchievementBar(Context p0){
       super(p0, null);
    }
    public void LiveGiftBoxGiftAchievementBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftBoxGiftAchievementBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxGiftAchievementBar.class, "3")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0a0e, this);
          this.B = this.findViewById(0x7f0a195d);
          this.C = this.findViewById(0x7f0a195e);
          this.D = this.findViewById(0x7f0a195c);
       }
       return;
    }
    public void setClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxGiftAchievementBar.class, "2")) {
          return;
       }
       this.B.setClickListener(p0);
       return;
    }
}
