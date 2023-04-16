package com.kuaishou.tuna.plc.plc2.PlcClickHelper$mCoverClickHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tuna.plc.plc2.PlcClickHelper;
import com.kuaishou.tuna.plc_base.logic.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u06.a;
import y06.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.yxcorp.gifshow.detail.plc.adapter.CoverStyleDataAdapter;
import f4a.i0;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;

public final class PlcClickHelper$mCoverClickHelper$2 extends Lambda implements a	// class@001036
{
    public final PlcClickHelper this$0;

    public void PlcClickHelper$mCoverClickHelper$2(PlcClickHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final a invoke(){
       Object[] objArray1;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, PlcClickHelper$mCoverClickHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.d().g();
       if (obj != null) {
          PlcEntryStyleInfo plcEntryStyl = obj.e();
          if (plcEntryStyl != null) {
             a uoa = this.this$0.d().g();
             if (uoa != null) {
                QPhoto photo = uoa.getPhoto();
                if (photo != null) {
                   a uoa1 = this.this$0.d().g();
                   if (uoa1 != null) {
                      Activity activity = uoa1.getActivity();
                      if (activity != null && activity.isFinishing() == true) {
                      label_005f :
                         objArray1 = objArray;
                      label_0060 :
                         if (objArray1 != null) {
                            CoverStyleDataAdapter uCoverStyleD = new CoverStyleDataAdapter(photo, plcEntryStyl);
                            this.this$0.a = new i0(uCoverStyleD);
                            return new a(uCoverStyleD, photo, objArray1, this.this$0.a);
                         }
                      }
                   }
                   uoa1 = this.this$0.d().g();
                   if (uoa1 != null) {
                      objArray1 = uoa1.getActivity();
                      goto label_0060 ;
                   }else {
                      goto label_005f ;
                   }
                }
             }
          }
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
