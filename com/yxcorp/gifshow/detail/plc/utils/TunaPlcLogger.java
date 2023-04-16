package com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.util.List;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$e$1;
import msd.a;
import c15.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$e$2;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$Event;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$i$1;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$w$1;

public final class TunaPlcLogger	// class@0016a3
{
    public static final TunaPlcLogger a;

    static {
       TunaPlcLogger.a = new TunaPlcLogger();
    }
    public void TunaPlcLogger(){
       super();
    }
    public static final void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, TunaPlcLogger.class, "6")) {
          return;
       }
       a.p(p0, "tag");
       KsLogTunaPlcTag pLC = KsLogTunaPlcTag.PLC;
       pLC.appendTag(p0);
       KsLogTunaPlcTag ksLogTunaPlc = pLC;
       b.d(ksLogTunaPlc, new TunaPlcLogger$e$1(p1));
       return;
    }
    public static final void b(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, TunaPlcLogger.class, "7")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p2, "throwable");
       KsLogTunaPlcTag pLC = KsLogTunaPlcTag.PLC;
       pLC.appendTag(p0);
       KsLogTunaPlcTag ksLogTunaPlc = pLC;
       b.e(ksLogTunaPlc, new TunaPlcLogger$e$2(p1), p2);
       return;
    }
    public static final void c(TunaPlcLogger$Event p0,PlcEntryDataAdapter p1){
       TunaPlcLogger a;
       String photoId;
       TunaPlcLogger tunaPlcLogge = TunaPlcLogger.class;
       String str = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, str, tunaPlcLogge, "1")) {
          return;
       }
       a.p(p0, "event");
       String str1 = p0.eventName();
       a = TunaPlcLogger.a;
       Objects.requireNonNull(a);
       StringBuilder str2 = PatchProxy.applyOneRefs(p1, a, tunaPlcLogge, "8");
       if (str2 != PatchProxyResult.class) {
       }else {
          str2 = "photoId:";
          if (p1 != null) {
             QPhoto photo = p1.getPhoto();
             if (photo != null) {
                photoId = photo.getPhotoId();
             label_003f :
                str2 = str2+photoId+", styleType:";
                Integer integer = (p1 != null)? Integer.valueOf(p1.getStyleType()): str;
                str2 = str2+integer+", bizType:";
                integer = (p1 != null)? Integer.valueOf(p1.getBizType()): str;
                str2 = str2+integer+", title:";
                if (p1 != null) {
                   str = p1.getTitle();
                }
                str2 = str2+str;
             }
          }
          photoId = str;
          goto label_003f ;
       }
       TunaPlcLogger.e(str1, str2);
       return;
    }
    public static final void d(TunaPlcLogger$Event p0,QPhoto p1){
       TunaPlcLogger a;
       TunaPlcLogger tunaPlcLogge = TunaPlcLogger.class;
       String str = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, str, tunaPlcLogge, "2")) {
          return;
       }
       a.p(p0, "event");
       String str1 = p0.eventName();
       a = TunaPlcLogger.a;
       Objects.requireNonNull(a);
       StringBuilder str2 = PatchProxy.applyOneRefs(p1, a, tunaPlcLogge, "9");
       if (str2 != PatchProxyResult.class) {
       }else {
          str2 = "photoId:";
          if (p1 != null) {
             str = p1.getPhotoId();
          }
          str2 = str2+str;
       }
       TunaPlcLogger.e(str1, str2);
       return;
    }
    public static final void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, TunaPlcLogger.class, "4")) {
          return;
       }
       a.p(p0, "tag");
       KsLogTunaPlcTag pLC = KsLogTunaPlcTag.PLC;
       pLC.appendTag(p0);
       KsLogTunaPlcTag ksLogTunaPlc = pLC;
       b.f(ksLogTunaPlc, new TunaPlcLogger$i$1(p1));
       return;
    }
    public static final void f(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, TunaPlcLogger.class, "5")) {
          return;
       }
       a.p(p0, "tag");
       KsLogTunaPlcTag pLC = KsLogTunaPlcTag.PLC;
       pLC.appendTag(p0);
       KsLogTunaPlcTag ksLogTunaPlc = pLC;
       b.g(ksLogTunaPlc, new TunaPlcLogger$w$1(p1));
       return;
    }
}
