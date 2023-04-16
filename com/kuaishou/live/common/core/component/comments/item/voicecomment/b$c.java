package com.kuaishou.live.common.core.component.comments.item.voicecomment.b$c;
import k81.h;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.b;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import d61.g;
import ekd.m1;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.LiveVoiceCommentItemView;
import lnc.a1;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ne1.k;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import o81.g;
import java.lang.CharSequence;
import o81.d;
import r81.c;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.d;
import android.view.View$OnTouchListener;
import k81.d;

public class b$c extends h	// class@0010aa
{
    public final LiveVoiceCommentItemView f;
    public final b g;

    public void b$c(b p0,View p1){
       this.g = p0;
       super(p1);
       g.b(p1, b$c.class.getCanonicalName());
       LiveVoiceCommentItemView liveVoiceCom = m1.f(p1, R.id.live_voice_comment);
       this.f = liveVoiceCom;
       liveVoiceCom.setHighlightColor(a1.a(R.color.arg_RES_7f062057));
       ViewGroup$MarginLayoutParams layoutParams = liveVoiceCom.getLayoutParams();
       if (k.b()) {
          layoutParams.setMargins(0, 0, 0, 0);
       }else {
          layoutParams.setMargins(0, a1.d(R.dimen.arg_RES_7f0702e3), a1.d(R.dimen.arg_RES_7f07034b), 0);
       }
       liveVoiceCom.setLayoutParams(layoutParams);
       return;
    }
    public void a(View p0,QLiveMessage p1,int p2){
       if (!PatchProxy.isSupport(b$c.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b$c.class, "2")) {
          b$c tg = this.g;
          this.f.setVoiceCommentText(tg.d.a(p1, tg.a));
          this.f.setTextSize(this.g.a.d().h());
          this.f.setMovementMethod(LinkMovementMethod.getInstance());
          this.f.setOnTouchListener(new d(this));
       }
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       h td = this.d;
       if (td != null) {
          h tb = this.b;
          if (tb != null) {
             tb.a(p0, td, this.e);
          }
       }
       return;
    }
}
