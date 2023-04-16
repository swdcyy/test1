package com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardChildAwardView;
import android.widget.LinearLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class LiveRichCardChildAwardView extends LinearLayout	// class@000f5b
{
    public TextView b;
    public View c;
    public HashMap d;

    public void LiveRichCardChildAwardView(Context p0){
       a.p(p0, "context");
       super(p0);
       View view = a.k(this, R.layout.arg_RES_7f0d0db4, true);
       View view1 = m1.f(view, R.id.live_rich_card_award_text);
       a.o(view1, "ViewBindUtils.bindWidget¡­ive_rich_card_award_text\)");
       this.b = view1;
       view = m1.f(view, R.id.live_rich_card_award_diver_line);
       a.o(view, "ViewBindUtils.bindWidget¡­ch_card_award_diver_line\)");
       this.c = view;
    }
    public final TextView getTextView(){
       return this.b;
    }
    public final void setDiverLineVisitable(int p0){
       if (PatchProxy.isSupport(LiveRichCardChildAwardView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRichCardChildAwardView.class, "3")) {
          return;
       }
       this.c.setVisibility(p0);
       return;
    }
    public final void setTextView(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardChildAwardView.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
}
