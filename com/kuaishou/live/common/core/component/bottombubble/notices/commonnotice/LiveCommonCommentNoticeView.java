package com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.LiveCommonCommentNoticeView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import jc1.a;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveCommonCommentNoticeView extends SelectShapeRelativeLayout	// class@000fa6
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;

    public void LiveCommonCommentNoticeView(Context p0){
       super(p0, null);
    }
    public void LiveCommonCommentNoticeView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveCommonCommentNoticeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveCommonCommentNoticeView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.d = this.findViewById(0x7f0a1b4c);
       this.e = this.findViewById(0x7f0a1b5b);
       this.c = this.findViewById(0x7f0a1b4b);
       this.setClickable(true);
       a.b(this.d);
       a.b(this.e);
       return;
    }
    public final void setContentIconShape(boolean p0){
       if (PatchProxy.isSupport(LiveCommonCommentNoticeView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveCommonCommentNoticeView.class, "4")) {
          return;
       }
       a.a(p0, this.c);
       return;
    }
    public final void setFirstLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommonCommentNoticeView.class, "5")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.d.setText(p0);
       this.d.setVisibility(0);
       return;
    }
    public final void setSecondLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommonCommentNoticeView.class, "6")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.e.setText(p0);
       this.e.setVisibility(0);
       this.d.setMaxLines(1);
       return;
    }
}
