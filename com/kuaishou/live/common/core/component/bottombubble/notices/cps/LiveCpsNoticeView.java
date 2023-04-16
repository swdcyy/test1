package com.kuaishou.live.common.core.component.bottombubble.notices.cps.LiveCpsNoticeView;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import jc1.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.bottombubble.notices.cps.LiveCpsNoticeView$a;
import java.lang.CharSequence;
import java.lang.Integer;
import android.widget.ImageView;

public class LiveCpsNoticeView extends SelectShapeLinearLayout	// class@000fb4
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public View g;
    public View h;

    public void LiveCpsNoticeView(Context p0){
       super(p0, null);
    }
    public void LiveCpsNoticeView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveCpsNoticeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveCpsNoticeView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.d = this.findViewById(0x7f0a1b4c);
       this.e = this.findViewById(0x7f0a1b5b);
       this.c = this.findViewById(0x7f0a1b4b);
       this.f = this.findViewById(0x7f0a1b59);
       this.h = this.findViewById(0x7f0a1b5c);
       this.g = this.findViewById(0x7f0a1b5a);
       a.b(this.d);
       a.b(this.e);
       return;
    }
    public void setButtonClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCpsNoticeView.class, "6")) {
          return;
       }
       this.f.setOnClickListener(new LiveCpsNoticeView$a(this, p0));
       return;
    }
    public void setButtonText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCpsNoticeView.class, "8")) {
          return;
       }
       this.f.setText(p0);
       this.setButtonVisibility(0);
       return;
    }
    public void setButtonVisibility(int p0){
       if (PatchProxy.isSupport(LiveCpsNoticeView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveCpsNoticeView.class, "7")) {
          return;
       }
       this.g.setVisibility(p0);
       return;
    }
    public void setContentIconVisibility(int p0){
       if (PatchProxy.isSupport(LiveCpsNoticeView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveCpsNoticeView.class, "5")) {
          return;
       }
       this.c.setVisibility(p0);
       return;
    }
    public void setFirstLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCpsNoticeView.class, "2")) {
          return;
       }
       this.d.setText(p0);
       return;
    }
    public void setSecondLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCpsNoticeView.class, "3")) {
          return;
       }
       this.e.setText(p0);
       this.e.setVisibility(0);
       return;
    }
}
