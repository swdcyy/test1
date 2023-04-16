package com.yxcorp.gifshow.channel.stagger.header.subentrance.ChannelSubEntranceItemView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.channel.stagger.header.subentrance.ChannelSubEntranceItemView$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import java.util.Objects;
import android.view.ViewPropertyAnimator;
import android.animation.TimeInterpolator;

public class ChannelSubEntranceItemView extends ConstraintLayout	// class@00106a
{
    public ChannelSubEntranceItemView$a B;

    public void ChannelSubEntranceItemView(Context p0){
       super(p0);
    }
    public void ChannelSubEntranceItemView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ChannelSubEntranceItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setItemPressHelper(ChannelSubEntranceItemView$a p0){
       this.B = p0;
    }
    public void setPressed(boolean p0){
       String str = "1";
       if (PatchProxy.isSupport(ChannelSubEntranceItemView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ChannelSubEntranceItemView.class, str)) {
          return;
       }
       super.setPressed(p0);
       ChannelSubEntranceItemView tB = this.B;
       if (tB == null) {
          return;
       }
       Objects.requireNonNull(tB);
       ChannelSubEntranceItemView$a uoa = ChannelSubEntranceItemView$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(this, Boolean.valueOf(p0), tB, uoa, str)) {
          ViewPropertyAnimator viewProperty = this.animate();
          float f = 0x3f800000;
          float f1 = (p0)? 0x3f666666: 0x3f800000;
          viewProperty = viewProperty.scaleY(f1);
          if (p0) {
             f = 0x3f666666;
          }
          viewProperty = viewProperty.scaleX(f);
          long l = (p0)? 100: 300;
          viewProperty = viewProperty.setDuration(l);
          ChannelSubEntranceItemView$a b = (p0)? tB.b: tB.a;
          viewProperty.setInterpolator(b).start();
       }
       return;
    }
}
