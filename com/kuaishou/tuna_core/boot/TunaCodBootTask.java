package com.kuaishou.tuna_core.boot.TunaCodBootTask;
import omc.b;
import com.kuaishou.tuna_core.boot.TunaCodBootTask$a;
import nsd.u;
import java.lang.Object;
import omc.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import nmc.b;
import java.util.List;
import com.kuaishou.tuna_logger.KsLogTunaCodDynamicLogTag;
import com.kuaishou.tuna_core.boot.TunaCodBootTask$execute$1;
import msd.a;
import c15.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$Companion;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;

public final class TunaCodBootTask implements b	// class@00108a
{
    public static final TunaCodBootTask$a a;

    static {
       TunaCodBootTask.a = new TunaCodBootTask$a(null);
    }
    public void TunaCodBootTask(){
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public final boolean b(PlcEntryStyleInfo$ActionInfo p0){
       boolean b;
       String str;
       b obj = PatchProxy.applyOneRefs(p0, this, TunaCodBootTask.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = d.a(0x11c60373);
       if (obj != null) {
          p0 = (p0 != null)? p0.mActionUrl: null;
          b = obj.AA(p0);
       }else {
          b = false;
       }
       return b;
    }
    public void execute(List p0){
       PlcEntryStyleInfo$WeakStyleInfo mActionInfo;
       TunaCodBootTask tunaCodBootT = TunaCodBootTask.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tunaCodBootT, "1")) {
          return;
       }
       b uob = d.a(0x11c60373);
       boolean b = (uob != null && uob.Ji() == true)? true: false;
       b.b(KsLogTunaCodDynamicLogTag.PLUGIN.appendTag("TunaCodBootTask"), new TunaCodBootTask$execute$1(b));
       if (!b) {
          return;
       }else if(PatchProxy.applyVoidOneRefs(p0, this, tunaCodBootT, "2")){
          if (p0 != null) {
             QPhoto qPhoto = CollectionsKt___CollectionsKt.p2(p0);
             if (qPhoto != null) {
                PlcEntryStyleInfo plcEntryStyl = qPhoto.getPlcEntryStyleInfo();
                if (plcEntryStyl != null) {
                   PlcEntryStyleInfo mStyleInfo = plcEntryStyl.mStyleInfo;
                   PlcEntryStyleInfo$StrongStyleInfo strongStyleI = null;
                   if (mStyleInfo != null) {
                      PlcEntryStyleInfo$StyleInfo mWeakStyleTe = mStyleInfo.mWeakStyleTemplateInfo;
                      if (mWeakStyleTe != null) {
                         mActionInfo = mWeakStyleTe.mActionInfo;
                      label_005a :
                         if (this.b(mActionInfo)) {
                            TunaCodPluginReporter.e.a(true, true);
                         }else {
                            plcEntryStyl = plcEntryStyl.mStyleInfo;
                            if (plcEntryStyl != null) {
                               PlcEntryStyleInfo$StyleInfo mStrongStyle = plcEntryStyl.mStrongStyleTemplateInfo;
                               if (mStrongStyle != null) {
                                  strongStyleI = mStrongStyle.mActionInfo;
                               }
                            }
                            if (this.b(strongStyleI)) {
                               TunaCodPluginReporter.e.a(true, true);
                            }else {
                               TunaCodPluginReporter.e.a(true, false);
                            }
                         }
                      }
                   }
                   mActionInfo = strongStyleI;
                   goto label_005a ;
                }
             }
          }
          TunaCodPluginReporter.e.a(false, false);
       }
       return;
    }
    public String z1(){
       return "TunaCodBootTask";
    }
}
