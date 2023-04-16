package com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$mLongVideoShowListener$2$a;
import erd.g;
import java.lang.Object;
import u06.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y06.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import f4a.b0;

public final class PlcLoggerWrapper$mLongVideoShowListener$2$a implements g	// class@00105c
{
    public static final PlcLoggerWrapper$mLongVideoShowListener$2$a b;

    static {
       PlcLoggerWrapper$mLongVideoShowListener$2$a.b = new PlcLoggerWrapper$mLongVideoShowListener$2$a();
    }
    public void PlcLoggerWrapper$mLongVideoShowListener$2$a(){
       super();
    }
    public void accept(Object p0){
       PlcEntryStyleInfo$ActionInfo mActionType;
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLoggerWrapper$mLongVideoShowListener$2$a.class, "1")) {
       }else if(p0 != null){
          a uoa = p0.g();
          if (uoa != null) {
             PlcEntryStyleInfo plcEntryStyl = uoa.e();
             if (plcEntryStyl != null) {
                plcEntryStyl = plcEntryStyl.mStyleInfo;
                if (plcEntryStyl != null) {
                   PlcEntryStyleInfo$StyleInfo mLongVideoSt = plcEntryStyl.mLongVideoStyleTemplateInfo;
                   if (mLongVideoSt != null) {
                      PlcEntryStyleInfo$LongVideoStyleInfo mActionInfo = mLongVideoSt.mActionInfo;
                      if (mActionInfo != null) {
                         mActionType = mActionInfo.mActionType;
                      label_002b :
                         if (p0 != null) {
                            p0 = p0.g();
                            if (p0 != null) {
                               p0 = p0.c();
                               if (p0 != null) {
                                  p0 = p0.h();
                                  if (p0 != null) {
                                     p0.p(mActionType);
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       mActionType = 0;
       goto label_002b ;
    label_0042 :
       return;
    }
}
