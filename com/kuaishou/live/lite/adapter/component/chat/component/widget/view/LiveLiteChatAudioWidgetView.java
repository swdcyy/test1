package com.kuaishou.live.lite.adapter.component.chat.component.widget.view.LiveLiteChatAudioWidgetView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;

public final class LiveLiteChatAudioWidgetView extends FrameLayout	// class@001d75
{
    public final View b;
    public final View c;
    public final int d;
    public final int e;
    public HashMap f;

    public void LiveLiteChatAudioWidgetView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveLiteChatAudioWidgetView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveLiteChatAudioWidgetView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.d = a1.d(0x7f0709e9);
       this.e = a1.d(0x7f0705fa);
       a.k(this, R.layout.arg_RES_7f0d0ab2, true);
       View view = this.findViewById(R.id.live_chat_small_screen_container);
       a.o(view, "findViewById\(R.id.live_c¡­t_small_screen_container\)");
       this.b = view;
       view = this.findViewById(R.id.live_chat_audio_avatar_container);
       a.o(view, "findViewById\(R.id.live_c¡­t_audio_avatar_container\)");
       this.c = view;
    }
    public void LiveLiteChatAudioWidgetView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveLiteChatAudioWidgetView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveLiteChatAudioWidgetView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       p3 = p3 - p1;
       p4 = p4 - p2;
       LiveLiteChatAudioWidgetView tc = this.c;
       if (tc != null) {
          ViewGroup$LayoutParams layoutParams = tc.getLayoutParams();
          p1 = (int)(((float)this.e / (float)this.d) * (float)p3);
          layoutParams.width = p1;
          layoutParams.height = p1;
       }
       tc = this.b;
       if (tc != null) {
          tc.layout(0, 0, p3, p4);
          ViewGroup$LayoutParams layoutParams1 = tc.getLayoutParams();
          if (layoutParams1 != null && (layoutParams1.width != p3 || layoutParams1.height != p4)) {
             layoutParams1.width = p3;
             layoutParams1.height = p4;
             tc.requestLayout();
             tc.postInvalidate();
          }
       }
       return;
    }
}
