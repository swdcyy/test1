package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandTextLineView;
import android.widget.LinearLayout;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandTextLineView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$UnfoldSubMessage;
import com.kwai.robust.PatchProxyResult;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;
import va1.l0;
import lnc.a1;
import kotlin.jvm.internal.a;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;

public final class LiveHourlyRankStrengthNoticeExpandTextLineView extends LinearLayout	// class@000c2f
{
    public TextView b;
    public HashMap c;
    public static final LiveHourlyRankStrengthNoticeExpandTextLineView$a d;

    static {
       LiveHourlyRankStrengthNoticeExpandTextLineView.d = new LiveHourlyRankStrengthNoticeExpandTextLineView$a(null);
    }
    public void LiveHourlyRankStrengthNoticeExpandTextLineView(Context p0){
       super(p0, null);
    }
    public void LiveHourlyRankStrengthNoticeExpandTextLineView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHourlyRankStrengthNoticeExpandTextLineView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeExpandTextLineView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0c31, this);
          this.b = this.findViewById(0x7f0a3b75);
       }
       return;
    }
    public final void a(LiveDistrictRankFinalBattle$UnfoldSubMessage p0){
       Typeface typeface;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankStrengthNoticeExpandTextLineView.class, "2")) {
          return;
       }
       SpannableStringBuilder spannableStr = PatchProxy.applyOneRefs(p0, this, LiveHourlyRankStrengthNoticeExpandTextLineView.class, "3");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          spannableStr = new SpannableStringBuilder("");
          LiveDistrictRankFinalBattle$UnfoldSubMessage contentWithS = (p0 != null)? p0.contentWithStyle: null;
          if (contentWithS != null) {
             p0 = p0.contentWithStyle;
             if (p0.length >= 3) {
                List list = ArraysKt___ArraysKt.qa(p0);
                if (list != null) {
                   Iterator iterator = list.iterator();
                   int i = 0;
                   while (iterator.hasNext()) {
                      LiveDistrictRankFinalBattle$ContentWithStyle uContentWith = iterator.next();
                      Context uContext = 1;
                      if (i != uContext) {
                         uContext = null;
                      }
                      LiveDistrictRankFinalBattle$ContentWithStyle content = uContentWith.content;
                      if (content == null) {
                         content = "";
                      }
                      int i1 = l0.j(uContentWith.color, 0xff000000);
                      int i2 = (uContext)? a1.d(R.dimen.arg_RES_7f070f6f): a1.d(R.dimen.arg_RES_7f070f6c);
                      if (uContext) {
                         uContext = this.getContext();
                         a.o(uContext, "context");
                         typeface = Typeface.createFromAsset(uContext.getAssets(), "alte-din.ttf");
                      }else {
                         typeface = Typeface.create("PingFangSC", 0);
                      }
                      SpannableStringBuilderUtils.d(spannableStr, content, i2, i1, typeface);
                      SpannableStringBuilderUtils.i(spannableStr, a1.d(R.dimen.arg_RES_7f0702ac));
                      i = i + 1;
                   }
                }
             }
          }
       }
       LiveHourlyRankStrengthNoticeExpandTextLineView tb = this.b;
       if (tb != null) {
          tb.setText(spannableStr);
       }
       return;
    }
}
