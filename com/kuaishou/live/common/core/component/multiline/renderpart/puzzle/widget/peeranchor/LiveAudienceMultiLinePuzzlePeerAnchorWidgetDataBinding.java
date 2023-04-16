package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding;
import es1.a;
import androidx.lifecycle.LifecycleOwner;
import android.view.ViewGroup;
import j83.b;
import sq1.a;
import ls1.d;
import kr1.b;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.TextView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleGuessState;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$e;
import z0.a;
import androidx.lifecycle.Transformations;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$1;
import msd.q;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$b;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$c;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$d;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding	// class@0015bc
{
    public final TextView a;
    public final FrameLayout b;
    public final KwaiCDNImageView c;
    public final TextView d;
    public final KwaiCDNImageView e;
    public final TextView f;
    public LiveMultiLinePuzzleGuessState g;
    public final p h;
    public final ViewGroup i;
    public final b j;
    public final a k;
    public final d l;
    public final b m;
    public final l n;

    public void LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding(a p0,LifecycleOwner p1,ViewGroup p2,b p3,a p4,d p5,b p6,l p7){
       a.p(p0, "puzzleWidgetModel");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "rootView");
       a.p(p3, "widgetModel");
       a.p(p4, "roomDelegate");
       a.p(p5, "multiLineResourceManager");
       a.p(p6, "resizeController");
       a.p(p7, "logClickPuzzleCard");
       super();
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       this.m = p6;
       this.n = p7;
       View view = p2.findViewById(R.id.multi_line_peer_name);
       a.o(view, "rootView.findViewById\(R.id.multi_line_peer_name\)");
       this.a = view;
       view = p2.findViewById(R.id.live_multi_line_puzzle_card_container);
       a.o(view, "rootView.findViewById\(R.¡­ne_puzzle_card_container\)");
       this.b = view;
       view = p2.findViewById(R.id.live_multi_line_puzzle_answer);
       a.o(view, "rootView.findViewById\(R.¡­multi_line_puzzle_answer\)");
       this.c = view;
       view = p2.findViewById(R.id.live_multi_line_puzzle_question_maker_tag);
       a.o(view, "rootView.findViewById\(R.¡­uzzle_question_maker_tag\)");
       this.d = view;
       view = p2.findViewById(R.id.live_multi_line_guess_puzzle_count_bg);
       a.o(view, "rootView.findViewById\(R.¡­ne_guess_puzzle_count_bg\)");
       this.e = view;
       View view1 = p2.findViewById(R.id.live_multi_line_puzzle_respondent_tag);
       a.o(view1, "rootView.findViewById\(R.¡­ne_puzzle_respondent_tag\)");
       this.f = view1;
       this.g = LiveMultiLinePuzzleGuessState.UNKNOWN;
       this.h = s.c(new LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2(this));
       LiveData liveData = Transformations.map(p3.d(), LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$e.a);
       a.o(liveData, "Transformations.map\(widg¡­yName\(it.mUserInfo\)\n    }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       LiveData liveData1 = Transformations.distinctUntilChanged(p3.a());
       a.o(liveData1, "Transformations.distinct¡­d\(widgetModel.muteStatus\)");
       liveData = LiveDataOperators.a(liveData, liveData1, p3.b(), new LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$1(this));
       liveData.observe(p1, new LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$a(this));
       p0.a().observe(p1, new LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$b(this));
       p3.h().observe(p1, new LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$c(this));
       this.a().setOnClickListener(new LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$d(this));
    }
    public final LiveKidLottieAnimationView a(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
}
