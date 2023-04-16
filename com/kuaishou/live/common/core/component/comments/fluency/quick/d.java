package com.kuaishou.live.common.core.component.comments.fluency.quick.d;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.comments.fluency.quick.LiveQuickCommentContainerView;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import java.util.ArrayList;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$LiveQuickCommentItem;
import java.util.List;
import android.view.View;
import android.content.Context;
import i2b.a;
import android.widget.TextView;
import java.lang.CharSequence;
import ne1.k;
import jl5.c;
import gf1.b;
import android.view.View$OnClickListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import z1.a;
import ekd.k1;

public final class d implements Runnable	// class@00108b
{
    public final LiveQuickCommentContainerView b;

    public void d(LiveQuickCommentContainerView p0){
       this.b = p0;
    }
    public final void run(){
       LiveQuickCommentContainerView c;
       d tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, LiveQuickCommentContainerView.class, "6")) {
       }else {
          tb.removeAllViews();
          int width = tb.getWidth();
          ArrayList uArrayList = new ArrayList();
          while (true) {
             LiveQuickCommentContainer$LiveQuickCommentItem liveQuickCom = PatchProxy.apply(objArray, tb, LiveQuickCommentContainerView.class, "8");
             if (liveQuickCom != patchProxyRe) {
             }else {
                c = tb.c;
                liveQuickCom = (c < null || c >= tb.f.size())? objArray: tb.f.get(tb.c);
             }
             if (liveQuickCom != null && !uArrayList.contains(liveQuickCom)) {
                LiveQuickCommentContainer$LiveQuickCommentItem displayText = liveQuickCom.displayText;
                View view = PatchProxy.applyOneRefs(displayText, tb, LiveQuickCommentContainerView.class, "10");
                if (view != patchProxyRe) {
                }else {
                   view = a.a(tb.getContext(), R.layout.arg_RES_7f0d0d65);
                   TextView textView = view.findViewById(R.id.live_quick_comment_item_content_text_view);
                   textView.setText(displayText);
                   if (k.a()) {
                      textView.setShadowLayer((float)c.c(R.dimen.arg_RES_7f0702ac), 0, (float)c.c(R.dimen.arg_RES_7f0702ac), c.a(R.color.arg_RES_7f060197));
                   }
                }
                view.setOnClickListener(new b(tb, liveQuickCom));
                int i = 0;
                view.measure(i, i);
                int i1 = (uArrayList.isEmpty())? 0: LiveQuickCommentContainerView.i;
                int i2 = view.getMeasuredWidth() + i1;
                String str = 1;
                float f = (width >= i2)? Float.MIN_VALUE: 0;
                boolean b = (!f && uArrayList.isEmpty())? true: false;
                if (f || b) {
                   width = width - i2;
                   ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-2, -2);
                   if (!uArrayList.isEmpty()) {
                      marginLayout.leftMargin = LiveQuickCommentContainerView.i;
                   }
                   uArrayList.add(liveQuickCom);
                   tb.addView(view, marginLayout);
                   if (!PatchProxy.applyVoid(objArray, tb, LiveQuickCommentContainerView.class, "9")) {
                      int i3 = tb.c + str;
                      tb.c = i3;
                      if (i3 >= tb.f.size()) {
                         tb.c = i;
                      }
                   }
                   LiveQuickCommentContainerView e = tb.e;
                   if (e != null) {
                      e.accept(liveQuickCom);
                   }
                }
                if (f && !b) {
                   continue ;
                }
             }
          label_0100 :
             LiveQuickCommentContainerView b1 = tb.b;
             if (b1 - null > 0) {
                k1.s(tb.g, tb, b1);
                break ;
             }
          }
       }
       return;
    }
}
