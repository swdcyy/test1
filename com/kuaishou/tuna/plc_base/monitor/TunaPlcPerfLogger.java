package com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger;
import a16.a;
import com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger$a;
import nsd.u;
import com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger$Companion$NEED_REPORT$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.HashMap;
import com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger$b;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import java.lang.StringBuilder;
import java.lang.Long;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.util.Objects;
import android.os.SystemClock;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.util.List;
import com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger$logPlcRenderFinish$1;
import c15.b;
import java.util.Map;
import tkd.b;
import tkd.d;
import xx5.g;
import zx5.a;
import zx5.e;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger$uploadPerf$1;
import com.kuaishou.tuna.plc_base.monitor.TunaPlcPerfLogger$uploadPerf$2;
import zx5.a$a;

public final class TunaPlcPerfLogger implements a	// class@001079
{
    public long a;
    public long b;
    public HashMap c;
    public TunaPlcPerfLogger$b d;
    public static final p e;
    public static final TunaPlcPerfLogger$a f;

    static {
       TunaPlcPerfLogger.f = new TunaPlcPerfLogger$a(null);
       TunaPlcPerfLogger.e = s.c(TunaPlcPerfLogger$Companion$NEED_REPORT$2.INSTANCE);
    }
    public void TunaPlcPerfLogger(){
       super();
       this.c = new HashMap();
       this.d = new TunaPlcPerfLogger$b();
    }
    public void a(int p0,PlcEntryStyleInfo p1,boolean p2){
       int b;
       String str;
       StringBuilder str1;
       PlcEntryStyleInfo mStyleInfo;
       PlcEntryStyleInfo$StyleInfo mCommentStyl;
       PlcEntryStyleInfo mStyleInfo1;
       PlcEntryStyleInfo$StyleInfo mCommentStyl1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TunaPlcPerfLogger tunaPlcPerfL = TunaPlcPerfLogger.class;
       if (PatchProxy.isSupport(tunaPlcPerfL) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, TunaPlcPerfLogger.class, "5")) {
          return;
       }
       TunaPlcPerfLogger td = this.d;
       long l = 6;
       Integer integer = null;
       int i = 1;
       PlcEntryStyleInfo plcEntryStyl = null;
       if (PatchProxy.isSupport(tunaPlcPerfL)) {
          Integer obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, tunaPlcPerfL, "7");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(p1 == null){
             if (p0 != i) {
                if (p0 != 2) {
                   if (p0 != 3) {
                      if (p0 != 4) {
                         if (p0 != l) {
                            obj = Integer.valueOf(plcEntryStyl);
                         label_00a1 :
                            b = (obj != null)? obj.intValue(): 0;
                            if (b > 0) {
                               b = true;
                            }
                         }else {
                            mStyleInfo1 = p1.mStyleInfo;
                            if (mStyleInfo1 != null) {
                               mCommentStyl1 = mStyleInfo1.mCommentStyleInfo;
                               if (mCommentStyl1 != null) {
                                  obj = Integer.valueOf(mCommentStyl1.mStyleType);
                                  goto label_00a1 ;
                               }
                            }
                         }
                      }else {
                         mStyleInfo1 = p1.mStyleInfo;
                         if (mStyleInfo1 != null) {
                            mCommentStyl1 = mStyleInfo1.mCoverStyleTemplateInfo;
                            if (mCommentStyl1 != null) {
                               obj = Integer.valueOf(mCommentStyl1.mStyleType);
                               goto label_00a1 ;
                            }
                         }
                      }
                   }else {
                      mStyleInfo1 = p1.mStyleInfo;
                      if (mStyleInfo1 != null) {
                         mCommentStyl1 = mStyleInfo1.mLongVideoStyleTemplateInfo;
                         if (mCommentStyl1 != null) {
                            obj = Integer.valueOf(mCommentStyl1.mStyleType);
                            goto label_00a1 ;
                         }
                      }
                   }
                }else {
                   mStyleInfo1 = p1.mStyleInfo;
                   if (mStyleInfo1 != null) {
                      mCommentStyl1 = mStyleInfo1.mStrongStyleTemplateInfo;
                      if (mCommentStyl1 != null) {
                         obj = Integer.valueOf(mCommentStyl1.mStyleType);
                         goto label_00a1 ;
                      }
                   }
                }
             }else {
                mStyleInfo1 = p1.mStyleInfo;
                if (mStyleInfo1 != null) {
                   mCommentStyl1 = mStyleInfo1.mWeakStyleTemplateInfo;
                   if (mCommentStyl1 != null) {
                      obj = Integer.valueOf(mCommentStyl1.mStyleType);
                      goto label_00a1 ;
                   }
                }
             }
             obj = integer;
             goto label_00a1 ;
          }
          b = false;
       }else {
          goto label_0042 ;
       }
       b = (b)? 0: 2;
       td.d(b);
       if (PatchProxy.isSupport(tunaPlcPerfL)) {
          str = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, tunaPlcPerfL, "8");
          if (str != patchProxyRe) {
          }else if(p1 == null){
             str = "";
          }else if(p0 != i){
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 != 4) {
                      if (p0 == l) {
                         str1 = "comment_";
                         mStyleInfo = p1.mStyleInfo;
                         if (mStyleInfo != null) {
                            mCommentStyl = mStyleInfo.mCommentStyleInfo;
                            if (mCommentStyl != null) {
                               integer = Integer.valueOf(mCommentStyl.mStyleType);
                            }
                         }
                         integer = str1+integer;
                      }
                   }else {
                      str1 = "cover_";
                      mStyleInfo = p1.mStyleInfo;
                      if (mStyleInfo != null) {
                         mCommentStyl = mStyleInfo.mCoverStyleTemplateInfo;
                         if (mCommentStyl != null) {
                            integer = Integer.valueOf(mCommentStyl.mStyleType);
                         }
                      }
                      integer = str1+integer;
                   }
                }else {
                   str1 = "long_video_";
                   mStyleInfo = p1.mStyleInfo;
                   if (mStyleInfo != null) {
                      mCommentStyl = mStyleInfo.mLongVideoStyleTemplateInfo;
                      if (mCommentStyl != null) {
                         integer = Integer.valueOf(mCommentStyl.mStyleType);
                      }
                   }
                   integer = str1+integer;
                }
             }else {
                str1 = "strong_";
                mStyleInfo = p1.mStyleInfo;
                if (mStyleInfo != null) {
                   mCommentStyl = mStyleInfo.mStrongStyleTemplateInfo;
                   if (mCommentStyl != null) {
                      integer = Integer.valueOf(mCommentStyl.mStyleType);
                   }
                }
                integer = str1+integer;
             }
          }else {
             str1 = "weak_";
             mStyleInfo = p1.mStyleInfo;
             if (mStyleInfo != null) {
                mCommentStyl = mStyleInfo.mWeakStyleTemplateInfo;
                if (mCommentStyl != null) {
                   integer = Integer.valueOf(mCommentStyl.mStyleType);
                }
             }
             integer = str1+integer;
          }
          str = integer;
       }else {
          goto label_00cc ;
       }
       Long longx = this.c.get(Integer.valueOf(p0));
       if (longx == null) {
          longx = Long.valueOf(0);
       }
       a.o(longx, "mPlcRenderStartTimestamp[plcViewType] ?: 0L");
       l = longx.longValue();
       if (str != null && str.length()) {
          i = 0;
       }
       if (i || l <= 0) {
          b.d(KsLogTunaPlcTag.PLC.appendTag("TunaPlcPerfLogger"), new TunaPlcPerfLogger$logPlcRenderFinish$1(str, l));
          return;
       }else {
          TunaPlcPerfLogger td1 = this.d;
          if (p1 != null) {
             plcEntryStyl = p1.mBizType;
          }
          td1.b(plcEntryStyl);
          td1 = this.d;
          Objects.requireNonNull(td1);
          if (!PatchProxy.applyVoidOneRefs(str, td1, TunaPlcPerfLogger$b.class, "1")) {
             a.p(str, "<set-?>");
             td1.d = str;
          }
          td1.e = SystemClock.elapsedRealtime() - l;
          if (p2) {
             td1 = this.d;
             td1.c((td1.a() + this.d.e));
          }else {
             this.d.c((SystemClock.elapsedRealtime() - this.a));
          }
          this.f();
          return;
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, TunaPlcPerfLogger.class, "1")) {
          return;
       }
       this.a = SystemClock.elapsedRealtime();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, TunaPlcPerfLogger.class, "2")) {
          return;
       }
       this.b = SystemClock.elapsedRealtime();
       return;
    }
    public void d(int p0){
       TunaPlcPerfLogger tunaPlcPerfL = TunaPlcPerfLogger.class;
       if (PatchProxy.isSupport(tunaPlcPerfL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tunaPlcPerfL, "4")) {
          return;
       }
       this.c.put(Integer.valueOf(p0), Long.valueOf(SystemClock.elapsedRealtime()));
       return;
    }
    public void e(PlcEntryStyleInfo p0,boolean p1,boolean p2){
       int i;
       if (PatchProxy.isSupport(TunaPlcPerfLogger.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, TunaPlcPerfLogger.class, "3")) {
          return;
       }
       TunaPlcPerfLogger td = this.d;
       p0 = (p0 != null)? p0.mBizType: 0;
       td.b(p0);
       if (this.b - null > 0) {
          p0.f = SystemClock.elapsedRealtime() - this.b;
       }
       if (p1) {
          this.d.d(1);
          TunaPlcPerfLogger td1 = this.d;
          td1.c(td1.a());
       }else {
          this.d.d(0);
       }
       if (p2) {
          this.f();
       }
       return;
    }
    public final void f(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoid(null, this, TunaPlcPerfLogger.class, "6")) {
          return;
       }
       g og = d.a(-174493078);
       a uoa = (og != null)? og.PB(a.class): null;
       TunaPlcPerfLogger td = this.d;
       Objects.requireNonNull(td);
       Object[] objArray = PatchProxy.apply(null, td, TunaPlcPerfLogger$b.class, "2");
       if (objArray != patchProxyRe) {
       }else if(td.b - null <= 0){
          objArray = null;
       }else {
          i3 oi3 = i3.f();
          oi3.c("business_type", Integer.valueOf(td.a));
          oi3.c("render_cost", Long.valueOf(td.b));
          oi3.c("render_result", Integer.valueOf(td.c));
          oi3.d("style", td.d);
          oi3.c("view_create_cost", Long.valueOf(td.e));
          oi3.c("show_eval_cost", Long.valueOf(td.f));
          objArray = oi3.e();
       }
       if (TextUtils.x(objArray)) {
          return;
       }else {
          b.f(KsLogTunaPlcTag.PLC.appendTag("TunaPlcPerfLogger"), new TunaPlcPerfLogger$uploadPerf$1(objArray));
          TunaPlcPerfLogger$a f = TunaPlcPerfLogger.f;
          Objects.requireNonNull(f);
          Boolean uBoolean = PatchProxy.apply(null, f, TunaPlcPerfLogger$a.class, "1");
          if (uBoolean == patchProxyRe) {
             uBoolean = TunaPlcPerfLogger.e.getValue();
          }
          if (!uBoolean.booleanValue()) {
             return;
          }else if(uoa != null){
             a$a.a(uoa, "tuna_plc_render", false, new TunaPlcPerfLogger$uploadPerf$2(objArray), 2, null);
          }
          return;
       }
    }
}
