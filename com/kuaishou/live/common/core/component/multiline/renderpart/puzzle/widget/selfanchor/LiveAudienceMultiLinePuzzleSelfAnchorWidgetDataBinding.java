package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import es1.a;
import sq1.a;
import ls1.d;
import msd.l;
import gs1.a;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$showBubbleFrequencyByKeyConsumer$2;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleGuessState;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$a;
import androidx.lifecycle.Observer;
import v91.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import e17.i;

public final class LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding	// class@0015c4
{
    public final FrameLayout a;
    public final KwaiCDNImageView b;
    public final TextView c;
    public final KwaiCDNImageView d;
    public final TextView e;
    public final p f;
    public LiveMultiLinePuzzleGuessState g;
    public a h;
    public final LifecycleOwner i;
    public final a j;
    public final d k;
    public final l l;
    public final a m;

    public void LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding(ViewGroup p0,LifecycleOwner p1,a p2,a p3,d p4,l p5,a p6,a p7){
       a.p(p0, "rootView");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "puzzleWidgetModel");
       a.p(p3, "roomDelegate");
       a.p(p4, "multiLineResourceManager");
       a.p(p5, "logClickPuzzleCard");
       a.p(p6, "puzzleSelfWidgetModel");
       a.p(p7, "getMultiLineChatId");
       super();
       this.i = p1;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       this.m = p7;
       View view = p0.findViewById(R.id.live_multi_line_puzzle_card_container);
       a.o(view, "rootView.findViewById\(R.¡­ne_puzzle_card_container\)");
       this.a = view;
       view = p0.findViewById(R.id.live_multi_line_puzzle_answer);
       a.o(view, "rootView.findViewById\(R.¡­multi_line_puzzle_answer\)");
       this.b = view;
       view = p0.findViewById(R.id.live_multi_line_puzzle_question_maker_tag);
       a.o(view, "rootView.findViewById\(R.¡­uzzle_question_maker_tag\)");
       this.c = view;
       view = p0.findViewById(R.id.live_multi_line_guess_puzzle_count_bg);
       a.o(view, "rootView.findViewById\(R.¡­ne_guess_puzzle_count_bg\)");
       this.d = view;
       View view1 = p0.findViewById(R.id.live_multi_line_puzzle_respondent_tag);
       a.o(view1, "rootView.findViewById\(R.¡­ne_puzzle_respondent_tag\)");
       this.e = view1;
       this.f = s.c(new LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$showBubbleFrequencyByKeyConsumer$2(this));
       this.g = LiveMultiLinePuzzleGuessState.UNKNOWN;
       p2.a().observe(p1, new LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$a(this, p6));
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final void b(LivePuzzleUserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding.class, "9")) {
          return;
       }
       LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding liveAudience = 1;
       if (p0 == null || (p0.isPublish == liveAudience || (p0 != null && p0.isWin == liveAudience))) {
          i.a(R.style.arg_RES_7f11066a, 0x7f102ae5);
       }else if(p0 != null){
          p0 = p0.quickCommentRouter;
          if (p0 != null) {
             this.j.k(p0);
          }
       }
       return;
    }
}
