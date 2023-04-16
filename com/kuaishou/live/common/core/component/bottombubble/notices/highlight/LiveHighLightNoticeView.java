package com.kuaishou.live.common.core.component.bottombubble.notices.highlight.LiveHighLightNoticeView;
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
import lnc.a1;
import va1.j0;
import jc1.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveHighLightNoticeView extends SelectShapeRelativeLayout	// class@000fcf
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public TextView f;

    public void LiveHighLightNoticeView(Context p0){
       super(p0, null);
    }
    public void LiveHighLightNoticeView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveHighLightNoticeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveHighLightNoticeView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.e = this.findViewById(0x7f0a1b52);
       this.d = this.findViewById(0x7f0a1b53);
       this.c = this.findViewById(0x7f0a1b54);
       TextView textView = this.findViewById(R.id.live_comment_notice_highlight_right_button);
       this.f = textView;
       j0.a(textView, a1.a(R.color.arg_RES_7f060753), a1.a(R.color.arg_RES_7f060cfd));
       a.b(this.e);
       return;
    }
    public final void setButtonContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHighLightNoticeView.class, "3")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.f.setText(p0);
       }
       return;
    }
    public final void setDurationContent(long p0){
       String str;
       if (PatchProxy.isSupport(LiveHighLightNoticeView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveHighLightNoticeView.class, "4")) {
          return;
       }
       LiveHighLightNoticeView td = this.d;
       if (PatchProxy.isSupport(LiveHighLightNoticeView.class)) {
          str = PatchProxy.applyOneRefs(Long.valueOf(p0), null, LiveHighLightNoticeView.class, "7");
          if (str != PatchProxyResult.class) {
          label_009e :
             td.setText(str);
             return;
          }
       }
       str = (p0 / 0xea60)+"";
       String str1 = ((p0 % 0xea60) / 1000)+"";
       if (str.length() < 2) {
          str = 0+str;
       }
       if (str1.length() < 2) {
          str1 = 0+str1;
       }
       str = str+":"+str1;
       goto label_009e ;
    }
    public final void setTitleContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHighLightNoticeView.class, "5")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.e.setText(p0);
       }
       return;
    }
}
