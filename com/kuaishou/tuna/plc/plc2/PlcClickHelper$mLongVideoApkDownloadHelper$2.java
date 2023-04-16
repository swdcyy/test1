package com.kuaishou.tuna.plc.plc2.PlcClickHelper$mLongVideoApkDownloadHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tuna.plc.plc2.PlcClickHelper;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper;
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
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import u06.e;
import com.yxcorp.gifshow.detail.plc.adapter.LongVideoStyleDataAdapter;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import f4a.b0;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import f4a.i;
import j4a.c;
import f4a.i0;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$b;
import o4a.b;
import o4a.a;

public final class PlcClickHelper$mLongVideoApkDownloadHelper$2 extends Lambda implements a	// class@001037
{
    public final PlcClickHelper this$0;

    public void PlcClickHelper$mLongVideoApkDownloadHelper$2(PlcClickHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final ApkDownloadHelper invoke(){
       Object[] objArray1;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, PlcClickHelper$mLongVideoApkDownloadHelper$2.class, "1");
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
                   uoa = this.this$0.d().g();
                   if (uoa != null) {
                      Activity activity = uoa.getActivity();
                      if (activity != null && activity.isFinishing() == true) {
                      label_0060 :
                         objArray1 = objArray;
                      label_0061 :
                         uoa = this.this$0.d().g();
                         if (uoa != null) {
                            BaseFragment uBaseFragmen = uoa.b();
                            if (uBaseFragmen != null) {
                               List list = this.this$0.d().a();
                               if (list != null) {
                                  e uoe = list.get(0);
                               }
                               if (objArray1 != null) {
                                  LongVideoStyleDataAdapter longVideoSty = new LongVideoStyleDataAdapter(photo, plcEntryStyl);
                                  uoa = this.this$0.d().g();
                                  if (uoa != null) {
                                     PLCLogHelper pLCLogHelper = uoa.c();
                                     if (pLCLogHelper != null) {
                                        objArray = pLCLogHelper.h();
                                     }
                                  }
                                  ApkDownloadHelper uApkDownload = new ApkDownloadHelper(objArray1, uBaseFragmen, longVideoSty, objArray, null, null, null, photo, c.a(longVideoSty), new i0(longVideoSty));
                                  return plcEntryStyl;
                               }
                            }
                         }
                      }
                   }
                   uoa = this.this$0.d().g();
                   if (uoa != null) {
                      objArray1 = uoa.getActivity();
                      goto label_0061 ;
                   }else {
                      goto label_0060 ;
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
