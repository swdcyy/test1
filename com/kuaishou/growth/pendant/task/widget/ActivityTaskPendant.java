package com.kuaishou.growth.pendant.task.widget.ActivityTaskPendant;
import com.kuaishou.growth.pendant.task.widget.KemTaskPendant;
import com.kuaishou.growth.pendant.task.widget.ActivityTaskPendant$a;
import nsd.u;
import kf0.s;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import nsd.r0;
import com.kuaishou.growth.taskcenter.model.TaskUIConfig;
import java.lang.Integer;
import java.util.Arrays;
import ie0.b;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import android.view.View;
import ekd.m1;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import android.view.ViewGroup;
import java.util.Objects;
import kf0.o;
import java.lang.Runnable;
import ekd.k1;
import kf0.f;
import lf0.a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import zsd.u;
import android.graphics.Color;
import java.lang.Boolean;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import lf0.b;
import kf0.r;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import java.util.concurrent.TimeUnit;
import kf0.q;

public final class ActivityTaskPendant extends KemTaskPendant	// class@0006dd
{
    public PendantAnimImageView h;
    public KwaiBindableImageView i;
    public TextView j;
    public ImageView k;
    public o l;
    public static final int m;
    public static final ActivityTaskPendant$a n;

    static {
       ActivityTaskPendant.n = new ActivityTaskPendant$a(null);
       ActivityTaskPendant.m = s.d.a(80.00f);
    }
    public void ActivityTaskPendant(Context p0){
       a.p(p0, "ctx");
       super(p0);
    }
    public void b(float p0){
       String str;
       String mInProgressT;
       Object[] objArray;
       if (PatchProxy.isSupport(ActivityTaskPendant.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ActivityTaskPendant.class, "11")) {
          return;
       }
       if (this.q()) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "ActivityTaskPendant", "onTaskProgressChanged, task is complete", false, 4, null);
          return;
       }else {
          ActivityTaskPendant tj = this.j;
          if (tj == null) {
             a.S("mStatusText");
          }
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (PatchProxy.isSupport(ActivityTaskPendant.class)) {
             str = PatchProxy.applyOneRefs(Float.valueOf(p0), this, ActivityTaskPendant.class, "12");
             if (str != patchProxyRe) {
             label_0137 :
                tj.setText(str);
                return;
             }
          }
          str = this.getMParams().getMTaskTypeId();
          if (str != null) {
             int i = 0;
             switch (str.hashCode()){
                 case 0x887d9817:
                   if (str.equals("watch_live_duration")) {
                   label_00d1 :
                      objArray = new Object[2];
                      objArray[0] = this.getMUiConfig().getMInProgressText();
                      int i1 = this.getMParams().getMTargetProgress() - (int)p0;
                      b uob = b.class;
                      if (PatchProxy.isSupport(uob)) {
                         mInProgressT = PatchProxy.applyOneRefs(Integer.valueOf(i1), null, uob, "1");
                         if (mInProgressT != patchProxyRe) {
                         label_0117 :
                            objArray[1] = mInProgressT;
                            mInProgressT = String.format("%s%s", Arrays.copyOf(objArray, 2));
                            a.o(mInProgressT, "java.lang.String.format\(format, *args\)");
                         label_00ab :
                            str = mInProgressT;
                            goto label_0137 ;
                         }
                      }
                      if (i1 >= 0) {
                         i = i1;
                      }
                      mInProgressT = b.a.format(new Date(((long)i * 1000)));
                      goto label_0117 ;
                   }
                   break;
                 case 0xccaa443f:
                   if (str.equals("browse_behind_page")) {
                      goto label_00d1 ;
                   }
                   break;
                 case 0xd0cdfb24:
                   if (str.equals("browse_page")) {
                      goto label_00d1 ;
                   }
                   break;
                 case 0xd7afaa71:
                   if (str.equals("watch_photo_duration")) {
                      goto label_00d1 ;
                   }
                   break;
                 case 0x1cc36952:
                   if (str.equals("watch_photo_count")) {
                      objArray = new Object[]{this.getMUiConfig().getMInProgressText(),Integer.valueOf((int)p0),Integer.valueOf(this.getMParams().getMTargetProgress())};
                      mInProgressT = String.format("%s%d/%d", Arrays.copyOf(objArray, 3));
                      a.o(mInProgressT, "java.lang.String.format\(format, *args\)");
                      goto label_00ab ;
                   }
                   break;
                 case 0x48c1a488:
                   if (str.equals("live_chat_duration")) {
                      goto label_00d1 ;
                   }
                   break;
                 default:
             }
          }
          mInProgressT = this.getMUiConfig().getMInProgressText();
          if (mInProgressT != null) {
             goto label_00ab ;
          }else {
             mInProgressT = "";
             goto label_00ab ;
          }
       }
    }
    public void c(TaskReportResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityTaskPendant.class, "13")) {
          return;
       }
       a.p(p0, "response");
       super.c(p0);
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "ActivityTaskPendant", "onTaskComplete", false, 4, null);
       this.r();
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityTaskPendant.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.doBindView(p0);
       view = m1.f(p0, R.id.pendant_bg);
       a.o(view, "bindWidget\(view, R.id.pendant_bg\)");
       this.h = view;
       view = m1.f(p0, R.id.pendant_task_status_bg);
       a.o(view, "bindWidget\(view, R.id.pendant_task_status_bg\)");
       this.i = view;
       view = m1.f(p0, R.id.pendant_task_status);
       a.o(view, "bindWidget\(view, R.id.pendant_task_status\)");
       this.j = view;
       p0 = m1.f(p0, R.id.pendant_close);
       a.o(p0, "bindWidget\(view, R.id.pendant_close\)");
       this.k = p0;
       return;
    }
    public int getLayoutResourceId(){
       return 0x7f0d0780;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ActivityTaskPendant.class, "14")) {
          return;
       }
       super.onAttachedToWindow();
       return;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ActivityTaskPendant.class, "15")) {
          return;
       }
       super.onDetachedFromWindow();
       ActivityTaskPendant tl = this.l;
       if (tl == null) {
          a.S("mAnimationHelper");
       }
       Objects.requireNonNull(tl);
       if (!PatchProxy.applyVoid(objArray, tl, o.class, "9")) {
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "onDetachedFromWindow", false, 4, null);
          o f = tl.f;
          if (f != null) {
             k1.m(f);
          }
          tl.j.a();
          tl.o.p0();
          tl.c();
       }
       return;
    }
    public void p(TaskCommonParams p0){
       ActivityTaskPendant tl;
       o a;
       int b;
       String mTextColor;
       s d;
       int i1;
       ActivityTaskPendant th2;
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityTaskPendant.class, "2")) {
          return;
       }
       a.p(p0, "params");
       super.p(p0);
       ActivityTaskPendant th = this.h;
       String str = "mBackgroundImg";
       if (th == null) {
          a.S(str);
       }
       this.l = new o(th, p0);
       this.setOnClickListener(new a(p0));
       if (this.q()) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "ActivityTaskPendant", "initPendantView, task is complete", false, 4, null);
          this.r();
          return;
       }else {
          Object[] objArray = null;
          String str1 = "mAnimationHelper";
          int i = 0;
          if (!PatchProxy.applyVoid(objArray, this, ActivityTaskPendant.class, "3")) {
             String str2 = "mStatusBg";
             String str3 = "mStatusText";
             if (!PatchProxy.applyVoid(objArray, this, ActivityTaskPendant.class, "4")) {
                if (this.getMUiConfig().getMWidth() == this.getMUiConfig().getMHeight() && (this.getMUiConfig().getMWidth() != ActivityTaskPendant.m && this.getMUiConfig().getMWidth() > 0)) {
                   d = s.d;
                   i1 = d.a((float)this.getMUiConfig().getMWidth());
                   b = d.a((float)this.getMUiConfig().getMHeight());
                   th2 = this.h;
                   if (th2 == null) {
                      a.S(str);
                   }
                   layoutParams = th2.getLayoutParams();
                   layoutParams.width = i1;
                   layoutParams.height = b;
                   tl = this.i;
                   if (tl == null) {
                      a.S(str2);
                   }
                   tl.width = i1;
                   tl = this.j;
                   if (tl == null) {
                      a.S(str3);
                   }
                   tl.width = i1;
                }
             label_00cf :
                if (this.getMUiConfig().getMTextBgHeight() > 0) {
                   d = s.d;
                   i1 = d.a((float)this.getMUiConfig().getMTextBgHeight());
                   b = d.a((float)this.getMUiConfig().getMTextBgBottom());
                   th2 = this.i;
                   if (th2 == null) {
                      a.S(str2);
                   }
                   layoutParams = th2.getLayoutParams();
                   String str4 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                   Objects.requireNonNull(layoutParams, str4);
                   layoutParams.height = i1;
                   layoutParams.bottomMargin = b;
                   th2 = this.j;
                   if (th2 == null) {
                      a.S(str3);
                   }
                   layoutParams = th2.getLayoutParams();
                   Objects.requireNonNull(layoutParams, str4);
                   layoutParams.height = i1;
                   layoutParams.bottomMargin = b;
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, ActivityTaskPendant.class, "8")) {
                b = 0x7f081a8f;
                ActivityTaskPendant th1 = this.h;
                if (th1 == null) {
                   a.S(str);
                }
                th1.setFailureImage(b);
                ActivityTaskPendant tl1 = this.l;
                if (tl1 == null) {
                   a.S(str1);
                }
                tl1.e = b;
             }
             str = 8;
             if (!PatchProxy.applyVoid(objArray, this, ActivityTaskPendant.class, "9")) {
                mTextColor = this.getMUiConfig().getMTextBgUrl();
                tl = (mTextColor == null || u.S1(mTextColor))? 1: null;
                if (!tl) {
                   tl = this.i;
                   if (tl == null) {
                      a.S(str2);
                   }
                   tl.setVisibility(i);
                   tl = this.i;
                   if (tl == null) {
                      a.S(str2);
                   }
                   tl.L(this.getMUiConfig().getMTextBgUrl());
                   tl = this.i;
                   if (tl == null) {
                      a.S(str2);
                   }
                   tl.setFailureImage(R.drawable.arg_RES_7f080075);
                }else {
                   tl = this.i;
                   if (tl == null) {
                      a.S(str2);
                   }
                   tl.setVisibility(str);
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, ActivityTaskPendant.class, "10")) {
                mTextColor = this.getMUiConfig().getMTextColor();
                tl = (mTextColor == null || u.S1(mTextColor))? 1: null;
                if (!tl) {
                   tl = this.j;
                   if (tl == null) {
                      a.S(str3);
                   }
                   tl.setTextColor(Color.parseColor(this.getMUiConfig().getMTextColor()));
                }
                if (this.getMUiConfig().getMTextSize() > 0) {
                   tl = this.j;
                   if (tl == null) {
                      a.S(str3);
                   }
                   tl.setTextSize(2, (float)this.getMUiConfig().getMTextSize());
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, ActivityTaskPendant.class, "5")) {
                p0 = PatchProxy.apply(objArray, this, ActivityTaskPendant.class, "6");
                if (p0 != PatchProxyResult.class) {
                   b = p0.booleanValue();
                }else {
                   Integer[] integerArray = new Integer[]{Integer.valueOf(1)};
                   b = CollectionsKt__CollectionsKt.P(integerArray).contains(Integer.valueOf(this.getMUiConfig().getMXPolicy()));
                }
                str2 = "mCloseBtn";
                if (b) {
                   tl = this.k;
                   if (tl == null) {
                      a.S(str2);
                   }
                   tl.setVisibility(i);
                   tl = this.k;
                   if (tl == null) {
                      a.S(str2);
                   }
                   tl.setOnClickListener(new b(this.getMParams()));
                }else {
                   tl = this.k;
                   if (tl == null) {
                      a.S(str2);
                   }
                   tl.setVisibility(str);
                }
             }
             this.b((float)this.getMParams().getMCurrentProgress());
          }
          tl = this.l;
          if (tl == null) {
             a.S(str1);
          }
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoid(objArray, tl, o.class, "1")) {
             TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "updateInProgressUi", false, 4, null);
             a = tl.a;
             if (a == null || u.S1(a)) {
                i = 1;
             }
             if (i || r.a.b()) {
                tl.e(tl.o, tl.b);
             }else {
                a = tl.a;
                a.m(a);
                tl.a(a, "doing", tl.b);
             }
          }
          return;
       }
    }
    public final boolean q(){
       Object obj = PatchProxy.apply(null, this, ActivityTaskPendant.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getMParams().isTaskComplete();
    }
    public final void r(){
       o a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ActivityTaskPendant.class, "7")) {
          return;
       }
       ActivityTaskPendant tk = this.k;
       if (tk == null) {
          a.S("mCloseBtn");
       }
       int i = 8;
       tk.setVisibility(i);
       String mCompleteTex = this.getMUiConfig().getMCompleteText();
       r or = 1;
       int i1 = 0;
       tk = (mCompleteTex == null || u.S1(mCompleteTex))? 1: null;
       String str = "mStatusText";
       if (tk) {
          tk = this.j;
          if (tk == null) {
             a.S(str);
          }
          tk.setVisibility(i);
          tk = this.i;
          if (tk == null) {
             a.S("mStatusBg");
          }
          tk.setVisibility(i);
       }else {
          tk = this.j;
          if (tk == null) {
             a.S(str);
          }
          tk.setText(this.getMUiConfig().getMCompleteText());
       }
       tk = this.l;
       if (tk == null) {
          a.S("mAnimationHelper");
       }
       Objects.requireNonNull(tk);
       o oo = o.class;
       if (!PatchProxy.applyVoid(objArray, tk, oo, "2")) {
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "updateCompleteUi", false, 4, null);
          a = tk.a;
          if (a != null && !u.S1(a)) {
             or = null;
          }
          if (or || r.a.b()) {
             tk.e(tk.o, tk.c);
          }else {
             o a1 = tk.a;
             a.m(a1);
             tk.a(a1, "end", tk.c);
          }
          if (!PatchProxy.applyVoid(objArray, tk, oo, "8")) {
             TaskPendantConfig mPendantConf = tk.p.getMPendantConfig();
             if (mPendantConf != null) {
                i1 = mPendantConf.getMDisappearSecondsIfComplete();
             }
             long l = TimeUnit.SECONDS.toMillis((long)i1);
             if (l - null > 0) {
                q oq = new q(tk);
                tk.f = oq;
                k1.r(oq, l);
             }
          }
       }
    label_00d7 :
       return;
    }
}
