package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding;
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
import android.view.View$OnClickListener;
import kotlin.jvm.internal.Ref$IntRef;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleGuessState;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$showPuzzleCard$1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import msd.l;
import ls1.d;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$showPuzzleCard$2;
import fs1.c;
import kotlin.jvm.internal.a;
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
import kr1.b;

public final class LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$b implements Observer	// class@0015b4
{
    public final LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding b;

    public void LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$b(LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$b b;
       StringBuilder str3;
       SpannableString spannableStr;
       int i2;
       String str4;
       String str5;
       String str6;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$b.class, "1")) {
       }else {
          String str = null;
          if (obj1 != null) {
             String str1 = 2;
             if (obj1.b() == str1) {
                b = obj.b;
                Objects.requireNonNull(b);
                LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding liveAudience = LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding.class;
                if (!PatchProxy.applyVoidOneRefs(obj1, b, liveAudience, "2")) {
                   LivePuzzleUserInfo livePuzzleUs = obj1.c();
                   int i = obj1.a();
                   int i1 = 8;
                   Integer integer = 1;
                   String str2 = null;
                   if (i != integer) {
                      if (i != str1) {
                         b.b.setVisibility(i1);
                      }else {
                         b.d.setVisibility(i1);
                         b.e.setVisibility(i1);
                         b.c.setVisibility(i1);
                         b.f.setVisibility(str2);
                         b.b.setVisibility(str2);
                         b.f.setOnClickListener(str);
                      }
                   }else if(PatchProxy.applyVoidOneRefs(livePuzzleUs, b, liveAudience, "3")){
                      if (!PatchProxy.applyVoidOneRefs(livePuzzleUs, b, liveAudience, "4")) {
                         Ref$IntRef intRef = new Ref$IntRef();
                         intRef.element = 0x7f1025d3;
                         LiveMultiLinePuzzleGuessState nOT_WIN = LiveMultiLinePuzzleGuessState.NOT_WIN;
                         Ref$IntRef intRef1 = new Ref$IntRef();
                         intRef1.element = 0x7f1025d2;
                         boolean b1 = (livePuzzleUs == null || (livePuzzleUs.isWin == integer || (livePuzzleUs != null && livePuzzleUs.isPublish == integer)))? true: false;
                         if (b1) {
                            str3 = "";
                            Integer integer1 = (livePuzzleUs != null)? Integer.valueOf(livePuzzleUs.answerId): str;
                            intRef.element = 0x7f1025d1;
                            intRef1.element = 0x7f1025d0;
                            str4 = "published_answer";
                            str5 = "publish_answer_bg.png";
                            str6 = str3+String.valueOf(integer1)+".png";
                            nOT_WIN = LiveMultiLinePuzzleGuessState.PUBLISHED_OR_WIN;
                         }else {
                            str6 = "default_answer.png";
                            str4 = str;
                            str5 = "default_answer_bg.png";
                         }
                         if (b.g != nOT_WIN) {
                            b.l.a(b.c, str6, str4, new LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$showPuzzleCard$1(b, intRef));
                            b.l.a(b.e, str5, str, new LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$showPuzzleCard$2(b, intRef1));
                            b.g = nOT_WIN;
                         }
                         b.c.setOnClickListener(new c(b, b1, livePuzzleUs));
                         b.c.setVisibility(0);
                      }
                      if (livePuzzleUs != null) {
                         LivePuzzleUserInfo countRecordD = livePuzzleUs.countRecordDescription;
                         a.o(countRecordD, "puzzleUserInfo.countRecordDescription");
                         livePuzzleUs = livePuzzleUs.countRecord;
                         if (PatchProxy.isSupport(liveAudience)) {
                            spannableStr = PatchProxy.applyTwoRefs(countRecordD, Integer.valueOf(livePuzzleUs), b, liveAudience, "6");
                            if (spannableStr != PatchProxyResult.class) {
                            }else if(StringsKt__StringsKt.O2(countRecordD, "0", false, 2, str)){
                               LivePuzzleUserInfo livePuzzleUs2 = countRecordD;
                               i = StringsKt__StringsKt.i3(livePuzzleUs2, "$", 0, false, 6, null);
                               int i3 = 1;
                               Objects.requireNonNull(countRecordD, "null cannot be cast to non-null type kotlin.CharSequence");
                               SpannableString spannableStr1 = new SpannableString(StringsKt__StringsKt.x4(countRecordD, i, (StringsKt__StringsKt.i3(livePuzzleUs2, "}", 0, 0, 6, 0) + i3), String.valueOf(livePuzzleUs)).toString());
                               spannableStr1.setSpan(new AbsoluteSizeSpan(10, i3), i, ((String.valueOf(livePuzzleUs)).length() + i), 17);
                               spannableStr = spannableStr1;
                            }else {
                               spannableStr = new SpannableString(countRecordD);
                            }
                         }else {
                            goto label_012d ;
                         }
                         if (spannableStr != null) {
                         label_0191 :
                            a.o(spannableStr, "puzzleCount");
                            if (PatchProxy.applyVoidOneRefs(spannableStr, b, liveAudience, "7")) {
                               i2 = 0;
                            }else {
                               b.d.setText(spannableStr);
                               b.f.setVisibility(8);
                               i2 = 0;
                               b.e.setVisibility(i2);
                               b.d.setVisibility(i2);
                            }
                            b.b.setVisibility(i2);
                         }
                      }
                      spannableStr = a1.p(R.string.arg_RES_7f102ae9);
                      goto label_0191 ;
                   }
                   LiveLogTag lIVE_LINE_PU1 = LiveLogTag.LIVE_LINE_PUZZLE;
                   integer = Integer.valueOf(obj1.a());
                   LivePuzzleUserInfo livePuzzleUs1 = obj1.c();
                   str3 = (livePuzzleUs1 != null)? livePuzzleUs1.toString(): str;
                   b.d0(lIVE_LINE_PU1, "peerAnchorInfoUpdate", "roleType", integer, "puzzleUserInfo", str3);
                }
                obj.b.m.c();
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
