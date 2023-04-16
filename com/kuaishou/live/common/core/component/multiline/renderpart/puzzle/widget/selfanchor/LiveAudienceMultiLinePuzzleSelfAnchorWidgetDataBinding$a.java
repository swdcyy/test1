package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding;
import gs1.a;
import java.lang.Object;
import as1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ImageView;
import kotlin.jvm.internal.Ref$IntRef;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleGuessState;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$showPuzzleCard$1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import msd.l;
import ls1.d;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$showPuzzleCard$2;
import gs1.d;
import android.view.View$OnClickListener;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import android.text.style.AbsoluteSizeSpan;
import lnc.a1;
import com.kuaishou.android.live.log.LiveLogTag;
import com.google.protobuf.nano.MessageNano;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import gs1.f;
import androidx.lifecycle.LifecycleOwner;

public final class LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$a implements Observer	// class@0015c0
{
    public final LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding b;
    public final a c;

    public void LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$a(LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$a b;
       String str1;
       SpannableString spannableStr;
       String str2;
       String str3;
       Object obj = this;
       Object obj1 = p0;
       LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding liveAudience = LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$a.class, "1")) {
       }else {
          String str = null;
          if (obj1 != null) {
             LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$a uoa = 2;
             if (obj1.b() == uoa) {
                b = obj.b;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidOneRefs(obj1, b, liveAudience, "3")) {
                   LivePuzzleUserInfo livePuzzleUs = obj1.c();
                   int i = obj1.a();
                   LiveLogTag liveLogTag = 1;
                   int i1 = 8;
                   if (i != liveLogTag) {
                      if (i != uoa) {
                         b.a.setVisibility(i1);
                      }else {
                         b.c.setVisibility(i1);
                         b.d.setVisibility(i1);
                         b.b.setVisibility(i1);
                         b.e.setVisibility(0);
                         b.a.setVisibility(0);
                      }
                   }else if(PatchProxy.applyVoidOneRefs(livePuzzleUs, b, liveAudience, "4")){
                      if (!PatchProxy.applyVoidOneRefs(livePuzzleUs, b, liveAudience, "5")) {
                         Ref$IntRef intRef = new Ref$IntRef();
                         intRef.element = 0x7f1025d3;
                         LiveMultiLinePuzzleGuessState nOT_WIN = LiveMultiLinePuzzleGuessState.NOT_WIN;
                         Ref$IntRef intRef1 = new Ref$IntRef();
                         intRef1.element = 0x7f1025d2;
                         if (livePuzzleUs == null || (livePuzzleUs.isWin == liveLogTag || (livePuzzleUs != null && livePuzzleUs.isPublish == liveLogTag))) {
                            intRef.element = 0x7f1025d1;
                            intRef1.element = 0x7f1025d0;
                            str1 = "published_answer";
                            str2 = "publish_answer_bg.png";
                            str3 = String.valueOf(livePuzzleUs.answerId)+".png";
                            nOT_WIN = LiveMultiLinePuzzleGuessState.PUBLISHED_OR_WIN;
                         }else {
                            str3 = "default_answer.png";
                            str2 = "default_answer_bg.png";
                            str1 = str;
                         }
                         if (b.g != nOT_WIN) {
                            b.k.a(b.b, str3, str1, new LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$showPuzzleCard$1(b, intRef));
                            b.k.a(b.d, str2, str, new LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding$showPuzzleCard$2(b, intRef1));
                            b.g = nOT_WIN;
                         }
                         b.b.setVisibility(0);
                         b.b.setOnClickListener(new d(b, livePuzzleUs));
                      }
                      if (livePuzzleUs != null) {
                         LivePuzzleUserInfo countRecordD = livePuzzleUs.countRecordDescription;
                         a.o(countRecordD, "it.countRecordDescription");
                         livePuzzleUs = livePuzzleUs.countRecord;
                         if (PatchProxy.isSupport(liveAudience)) {
                            spannableStr = PatchProxy.applyTwoRefs(countRecordD, Integer.valueOf(livePuzzleUs), b, liveAudience, "6");
                            if (spannableStr != PatchProxyResult.class) {
                            }else if(StringsKt__StringsKt.O2(countRecordD, "0", 0, 2, str)){
                               LivePuzzleUserInfo livePuzzleUs2 = countRecordD;
                               i = StringsKt__StringsKt.i3(livePuzzleUs2, "$", 0, false, 6, null);
                               i1 = 1;
                               Objects.requireNonNull(countRecordD, "null cannot be cast to non-null type kotlin.CharSequence");
                               SpannableString spannableStr1 = new SpannableString(StringsKt__StringsKt.x4(countRecordD, i, (StringsKt__StringsKt.i3(livePuzzleUs2, "}", 0, 0, 6, 0) + i1), String.valueOf(livePuzzleUs)).toString());
                               spannableStr1.setSpan(new AbsoluteSizeSpan(10, i1), i, ((String.valueOf(livePuzzleUs)).length() + i), 17);
                               spannableStr = spannableStr1;
                            }else {
                               spannableStr = new SpannableString(countRecordD);
                            }
                         }else {
                            goto label_0116 ;
                         }
                         if (spannableStr != null) {
                         label_017b :
                            a.o(spannableStr, "puzzleCount");
                            if (!PatchProxy.applyVoidOneRefs(spannableStr, b, liveAudience, "7")) {
                               b.c.setText(spannableStr);
                               b.e.setVisibility(8);
                               b.d.setVisibility(0);
                               b.c.setVisibility(0);
                            }
                            b.a.setVisibility(0);
                         }
                      }
                      spannableStr = a1.p(R.string.arg_RES_7f102ae9);
                      goto label_017b ;
                   }
                   liveLogTag = LiveLogTag.LIVE_LINE_PUZZLE;
                   Integer integer = Integer.valueOf(obj1.a());
                   LivePuzzleUserInfo livePuzzleUs1 = obj1.c();
                   str1 = (livePuzzleUs1 != null)? livePuzzleUs1.toString(): str;
                   b.d0(liveLogTag, "selfAnchorInfoUpdate", "roleType", integer, "puzzleUserInfo", str1);
                }
                b = obj.b;
                uoa = obj.c;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidTwoRefs(uoa, obj1, b, liveAudience, "2")) {
                   LiveData liveData = Transformations.distinctUntilChanged(uoa.a());
                   a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
                   liveData.observe(b.i, new f(b, obj1));
                }
             }
          }
          LiveLogTag lIVE_LINE_PU = LiveLogTag.LIVE_LINE_PUZZLE;
          if (obj1 != null) {
             str = obj1.toString();
          }
          b.c0(lIVE_LINE_PU, "puzzleParticipantInfoUpdate", "puzzleParticipantInfo", str);
       }
       return;
    }
}
