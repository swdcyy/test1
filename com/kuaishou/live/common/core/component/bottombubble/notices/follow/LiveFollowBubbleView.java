package com.kuaishou.live.common.core.component.bottombubble.notices.follow.LiveFollowBubbleView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.text.TextPaint;
import lnc.a1;
import java.lang.Math;
import jc1.a;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import android.text.TextUtils;

public class LiveFollowBubbleView extends SelectShapeRelativeLayout	// class@000fb8
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;

    public void LiveFollowBubbleView(Context p0){
       super(p0, null);
    }
    public void LiveFollowBubbleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFollowBubbleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveFollowBubbleView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.c = this.findViewById(0x7f0a1ce0);
       this.d = this.findViewById(0x7f0a1ce1);
       this.e = this.findViewById(0x7f0a1cdf);
       this.setClickable(true);
       if (!PatchProxy.applyVoid(objArray, this, LiveFollowBubbleView.class, "2")) {
          this.e.setWidth(((int)Math.max(this.e.getPaint().measureText(a1.p(R.string.arg_RES_7f100f8f)), this.e.getPaint().measureText(a1.p(R.string.arg_RES_7f101034))) + a1.e(16.00f)));
       }
       a.b(this.d);
       return;
    }
    public void setRightButtonOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFollowBubbleView.class, "6")) {
          return;
       }
       this.e.setOnClickListener(p0);
       return;
    }
    public final void setTitleContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFollowBubbleView.class, "5")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       this.d.setText(p0);
       this.d.setVisibility(0);
       return;
    }
}
