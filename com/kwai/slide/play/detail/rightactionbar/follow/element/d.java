package com.kwai.slide.play.detail.rightactionbar.follow.element.d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.slide.play.detail.rightactionbar.follow.element.f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import com.kwai.slide.play.detail.widget.SpFollowBubbleLayout;
import ns7.u;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import o07.n;

public final class d implements PopupInterface$f	// class@001856
{
    public final f b;
    public final boolean c;

    public void d(f p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View view;
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(f.class)) {
          view = PatchProxy.applyThreeRefs(p1, p2, Boolean.valueOf(tc), tb, f.class, "9");
          if (view != PatchProxyResult.class) {
          label_0064 :
             return view;
          }
       }
       view = a.c(p1, R.layout.arg_RES_7f0d1560, p2, false);
       tb.B = view;
       view.setOnClickListener(new u(tb));
       ImageView imageView = view.findViewById(R.id.sp_follow_icon);
       TextView textView = view.findViewById(R.id.sp_follow_text);
       int i = (tc != null)? 0x7f080a8e: 0x7f080a8f;
       imageView.setImageResource(i);
       int i1 = (tc != null)? 0x7f100e57: 0x7f100e52;
       textView.setText(i1);
       goto label_0064 ;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
