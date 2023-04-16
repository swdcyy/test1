package com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$mLongVideoClickListener$2$a;
import erd.g;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$mLongVideoClickListener$2;
import java.lang.Object;
import u06.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper;
import y06.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import f4a.b0;

public final class PlcLoggerWrapper$mLongVideoClickListener$2$a implements g	// class@00105a
{
    public final PlcLoggerWrapper$mLongVideoClickListener$2 b;

    public void PlcLoggerWrapper$mLongVideoClickListener$2$a(PlcLoggerWrapper$mLongVideoClickListener$2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PlcEntryStyleInfo$ActionInfo mActionType;
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLoggerWrapper$mLongVideoClickListener$2$a.class, "1")) {
       }else {
          a uoa = this.b.this$0.f.g();
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
                      label_002f :
                         if (p0 != null) {
                            p0 = p0.g();
                            if (p0 != null) {
                               p0 = p0.c();
                               if (p0 != null) {
                                  p0 = p0.h();
                                  if (p0 != null) {
                                     p0.l(mActionType);
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
          goto label_002f ;
       }
    label_0046 :
       return;
    }
}
