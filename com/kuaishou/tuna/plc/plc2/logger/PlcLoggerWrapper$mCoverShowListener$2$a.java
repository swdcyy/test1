package com.kuaishou.tuna.plc.plc2.logger.PlcLoggerWrapper$mCoverShowListener$2$a;
import erd.g;
import java.lang.Object;
import u06.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y06.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import f4a.b0;

public final class PlcLoggerWrapper$mCoverShowListener$2$a implements g	// class@001056
{
    public static final PlcLoggerWrapper$mCoverShowListener$2$a b;

    static {
       PlcLoggerWrapper$mCoverShowListener$2$a.b = new PlcLoggerWrapper$mCoverShowListener$2$a();
    }
    public void PlcLoggerWrapper$mCoverShowListener$2$a(){
       super();
    }
    public void accept(Object p0){
       PlcEntryStyleInfo$ActionInfo mActionType;
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLoggerWrapper$mCoverShowListener$2$a.class, "1")) {
       }else if(p0 != null){
          a uoa = p0.g();
          if (uoa != null) {
             PlcEntryStyleInfo plcEntryStyl = uoa.e();
             if (plcEntryStyl != null) {
                plcEntryStyl = plcEntryStyl.mStyleInfo;
                if (plcEntryStyl != null) {
                   PlcEntryStyleInfo$StyleInfo mCoverStyleT = plcEntryStyl.mCoverStyleTemplateInfo;
                   if (mCoverStyleT != null) {
                      PlcEntryStyleInfo$CoverStyleInfo mActionInfo = mCoverStyleT.mActionInfo;
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
                                     p0.F(mActionType);
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
