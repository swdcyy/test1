package com.yxcorp.gifshow.childlock.c;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.childlock.b;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.model.config.ChildlockStartupCommonPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wh5.a;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import wh5.b;
import wh5.d;
import com.yxcorp.gifshow.util.ChildLockDialogUtils;
import uj9.n;
import q87.c;
import oe6.a;
import android.app.Activity;
import o56.f;
import androidx.fragment.app.FragmentActivity;
import za5.a;
import java.lang.StringBuilder;
import wh5.c;
import uj9.l;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.r;
import lnc.p0;
import java.lang.Runnable;
import ekd.k1;
import zca.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class c extends ConfigAutoParseJsonConsumer	// class@00107c
{

    public void c(){
       super(b.b);
    }
    public void b(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
       }else {
          ChildlockStartupCommonPojo mTeenageConf = p0.mTeenageConfig;
          ChildlockStartupCommonPojo mTeenageFeat = p0.mTeenageFeatureConfig;
          Object[] obj = null;
          String str = "4";
          if (!PatchProxy.applyVoidTwoRefs(mTeenageConf, mTeenageFeat, obj, a.class, str)) {
             if (mTeenageConf != null) {
                b.b(mTeenageConf);
             }
             if (!PatchProxy.applyVoidOneRefs(mTeenageFeat, obj, b.class, str)) {
                d.e("teenage_mode_feature_config", mTeenageFeat);
             }
          }
          mTeenageConf = p0.mTeenageConfig;
          ChildLockDialogUtils.c = mTeenageConf;
          int i = 0;
          obj = new Object[i];
          str = "TeenageMode";
          n.C().w(str, "checkTeenageConfig", obj);
          b = a.a();
          if (mTeenageConf != null && b) {
             b = a.b();
             Activity uActivity = f.a();
             if (uActivity instanceof FragmentActivity) {
                boolean i1 = a.o0(uActivity).p0();
                Object[] objArray = new Object[i];
                n.C().w(str, "checkTeenageConfig, homeUiMode="+i1, objArray);
                StringBuilder str1 = 4;
                if (mTeenageConf.mIsOpen != null || c.l()) {
                   if (i1 == str1) {
                   label_008f :
                      i1 = false;
                   label_0090 :
                      objArray = new Object[i];
                      n.C().w(str, "checkTeenageConfig, lastChildLockEnable="+b+", currentEnable="+mTeenageConf.mIsOpen+", diff="+i1, objArray);
                      boolean b1 = (c.l())? true: mTeenageConf.mIsOpen;
                      a.j(b1);
                      if (!c.l()) {
                         TeenageModeConfig mIsOpen = mTeenageConf.mIsOpen;
                         if (b != mIsOpen || i1) {
                            Object[] objArray1 = new Object[i];
                            n.C().w(str, "updateTeenageModeStatus, isOpen="+mIsOpen, objArray1);
                            l.e(0);
                            RxBus.f.b(new r(mIsOpen));
                         }
                      }
                      ChildLockDialogUtils.a = true;
                      k1.r(new p0(mTeenageConf), (mTeenageConf.mDialogShowDelaySeconds * 1000));
                   }
                }else if(i1 == str1){
                }
                i1 = true;
                goto label_0090 ;
             }else {
                goto label_008f ;
             }
          }else {
             ChildLockDialogUtils.a = i;
             RxBus.f.b(new b(i, i));
          }
          SharedPreferences$Editor uEditor = l.a.edit();
          uEditor.putString("PrivacyPopupConfig", b.e(p0.mPrivacyPopupConfig));
          uEditor.putString("teenageModeAppealsUrl", p0.mTeenageModeAppealsUrl);
          uEditor.putString("teenageTools", b.e(p0.mTeenageToolsConfigs));
          g.a(uEditor);
       }
       return;
    }
}
