package com.kwai.live.gzone.guess.kshell.n0;
import com.kwai.live.gzone.widget.b;
import com.kwai.live.gzone.guess.kshell.n0$b;
import android.app.Activity;
import com.kwai.live.gzone.widget.e$a;
import com.kwai.live.gzone.guess.bean.ResultOption;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.guess.bean.KShellGuessResultStatus;
import com.kwai.live.gzone.guess.kshell.n0$a;
import java.lang.Enum;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p57.z1;
import android.view.View$OnClickListener;
import p57.a2;
import p57.b2;
import android.os.Bundle;
import com.kwai.library.widget.popup.common.c;
import d61.y;
import z8c.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import p57.f;
import j47.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.List;
import com.kwai.live.gzone.guess.bean.KShellGuessPaperResponse;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.kwai.live.gzone.guess.bean.LiveGzoneAudienceGuessQuestion;
import java.util.Iterator;
import com.kwai.live.gzone.guess.bean.UserBetInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.guess.bean.ResultQuestion;
import com.kwai.live.gzone.guess.bean.BetOptionInfo;
import com.kwai.live.gzone.guess.bean.UserBetOption;
import p57.g;
import com.kwai.live.gzone.guess.bean.BetOption;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import java.lang.StringBuilder;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import ync.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import q57.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import k2b.u1;

public class n0 extends b	// class@000d54
{
    public RecyclerView A;
    public View B;
    public TextView C;
    public View D;
    public TextView E;
    public TextView F;
    public TextView G;
    public View H;
    public f I;
    public Activity J;
    public n0$b K;
    public a L;
    public f z;

    public void n0(n0$b p0,Activity p1,boolean p2){
       super(p0);
       this.J = p1;
       this.K = p0;
    }
    public static void n0(ResultOption p0,ResultOption p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, n0.class, "3")) {
          return;
       }
       KShellGuessResultStatus uNKNOWN = KShellGuessResultStatus.UNKNOWN;
       if (p0.mKShellGuessResultStatus == uNKNOWN) {
          int i = n0$a.a[p1.mKShellGuessResultStatus.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   p0.mKShellGuessResultStatus = KShellGuessResultStatus.ABORT;
                }
             }else {
                p0.mKShellGuessResultStatus = KShellGuessResultStatus.WIN;
             }
          }else {
             p0.mKShellGuessResultStatus = KShellGuessResultStatus.LOSE;
          }
       }else if(p1.mKShellGuessResultStatus == uNKNOWN){
          n0.n0(p1, p0);
       }
       return;
    }
    public int c0(){
       Object obj = PatchProxy.apply(null, this, n0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.u(a.b());
    }
    public int d0(){
       return 0x7f0d0b4c;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a1716);
       this.C = m1.f(p0, 0x7f0a35df);
       this.A = m1.f(p0, 0x7f0a33a7);
       this.D = m1.f(p0, 0x7f0a35dd);
       this.E = m1.f(p0, 0x7f0a1e54);
       this.F = m1.f(p0, 0x7f0a1e56);
       this.G = m1.f(p0, 0x7f0a1e55);
       this.H = m1.f(p0, 0x7f0a1f23);
       m1.a(p0, new z1(this), R.id.left_btn);
       m1.a(p0, new a2(this), R.id.result_detail);
       m1.a(p0, new b2(this), R.id.live_gzone_audience_guess_report_text_view);
       return;
    }
    public int e0(){
       Object obj = PatchProxy.apply(null, this, n0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.c(this.m0(), 448.00f);
    }
    public void f0(View p0,Bundle p1){
       String str;
       int i2;
       int i3;
       Object[] objArray;
       UserBetInfo userBetInfo;
       n0 on0 = n0.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, on0, "4")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, on0, "7")) {
          p0 = p0.findViewById(R.id.live_gzone_guess_result_container);
          this.doBindView(p0);
          if (y.d(this.u())) {
             p0.setBackgroundResource(R.drawable.arg_RES_7f080215);
          }
          boolean i = 1;
          boolean b = false;
          a uoa = new a(i, i, b);
          this.L = uoa;
          uoa.o(a1.f(R.drawable.arg_RES_7f081251));
          boolean b1 = (this.K.L.S2() && !this.K.L.V2())? true: false;
          this.I = new f(b1);
          this.A.setLayoutManager(new LinearLayoutManager(this.u()));
          this.V(i);
          n0$b i1 = this.K.I;
          Object obj = null;
          ArrayList uArrayList = PatchProxy.applyOneRefs(i1, obj, on0, "2");
          if (uArrayList != PatchProxyResult.class) {
          }else if(i1 != null && (q.f(i1.mUserBetInfos) || q.f(i1.mBets))){
             uArrayList = obj;
          }else {
             uArrayList = new ArrayList();
             int i4 = i1.mBets.size();
             for (i2 = 0; i2 < i4; i2 = i2 + 1) {
                LiveGzoneAudienceGuessQuestion liveGzoneAud = i1.mBets.get(i2);
                Iterator iterator = i1.mUserBetInfos.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      userBetInfo = iterator.next();
                      if (TextUtils.x(userBetInfo.mBetId) || !TextUtils.n(userBetInfo.mBetId, liveGzoneAud.mBetId)) {
                         continue ;
                      }
                   }else {
                      userBetInfo = obj;
                   }
                   ResultQuestion resultQuesti = new ResultQuestion();
                   resultQuesti.mSelectedQuestionList = new ArrayList();
                   resultQuesti.title = liveGzoneAud.mTitle;
                   if (userBetInfo != null) {
                      UserBetOption userBetOptio = g.a(liveGzoneAud.mBetOptionInfos.get(b), userBetInfo);
                      UserBetOption userBetOptio1 = g.a(liveGzoneAud.mBetOptionInfos.get(i), userBetInfo);
                      ResultOption resultOption = new ResultOption(userBetOptio);
                      ResultOption resultOption1 = new ResultOption(userBetOptio1);
                      if (userBetOptio == null) {
                         resultOption.mText = liveGzoneAud.mBetOptionInfos.get(b).mBetOption.mContent;
                      }
                      if (userBetOptio1 == null) {
                         resultOption1.mText = liveGzoneAud.mBetOptionInfos.get(i).mBetOption.mContent;
                      }
                      n0.n0(resultOption, resultOption1);
                      resultQuesti.mSelectedQuestionList.add(resultOption);
                      resultQuesti.mSelectedQuestionList.add(resultOption1);
                   }else {
                      LiveGzoneAudienceGuessQuestion mRightBetOpt = liveGzoneAud.mRightBetOption;
                      resultQuesti.mSelectedQuestionList.add(new ResultOption(liveGzoneAud.mBetOptionInfos.get(b), mRightBetOpt));
                      resultQuesti.mSelectedQuestionList.add(new ResultOption(liveGzoneAud.mBetOptionInfos.get(i), mRightBetOpt));
                   }
                   resultQuesti.index = i2;
                   uArrayList.add(resultQuesti);
                }
             }
          }
          i1 = this.K.I;
          if (!PatchProxy.applyVoidOneRefs(i1, this, on0, "9")) {
             i2 = 8;
             if (!q.f(i1.mBets) && KShellGuessQuestionStatus.PAPER_ABORT == KShellGuessQuestionStatus.fromStatus(i1.mBets.get(b).mStatus)) {
                this.C.setVisibility(i2);
                this.D.setVisibility(b);
                this.H.setVisibility(b);
             }else {
                long l = g.d(i1);
                i3 = 0x7f1022ee;
                if (l - null < 0) {
                   objArray = new Object[i];
                   objArray[b] = String.valueOf(l);
                   str = String.format(a1.p(i3), objArray);
                }else {
                   objArray = new Object[i];
                   objArray[b] = "+"+l;
                   str = String.format(a1.p(i3), objArray);
                }
                this.D.setVisibility(i2);
                this.C.setVisibility(b);
                this.C.setText(str);
             }
          }
          if (uArrayList != null) {
             this.I.W0(uArrayList);
          }
          this.A.addItemDecoration(this.L);
          this.A.setAdapter(this.I);
          if (!PatchProxy.applyVoid(obj, this, on0, "8")) {
             str = a1.p(R.string.arg_RES_7f102435);
             SpannableStringBuilder spannableStr = new SpannableStringBuilder(a1.p(0x7f102434));
             spannableStr.append("  ");
             spannableStr.append(str);
             spannableStr.setSpan(new ForegroundColorSpan(a.e(a1.c(), b)), (spannableStr.length() - str.length()), spannableStr.length(), 33);
             this.E.setText(spannableStr);
          }
          ClientContent$LiveStreamPackage liveStreamPa = this.K.K.a();
          i = y.d(this.u());
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, Boolean.TRUE, Boolean.valueOf(i), null, a.class, "13")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "GUESS_RESULT_HALF_PAGE";
             i3 oi3 = i3.f();
             oi3.c("ui_type", Integer.valueOf(2));
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             uContentPack.screenPackage = a.a(i);
             u1.u0(9, uElementPack, uContentPack);
          }
       }
       return;
    }
    public boolean j0(){
       return true;
    }
}
