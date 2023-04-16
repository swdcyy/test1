package com.kuaishou.krn.log.model.KrnPageRenderParams;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import lj0.c;
import java.lang.String;
import com.kuaishou.krn.log.model.KrnDurationModel;
import java.util.Map;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.PluginTrackInfo;

public final class KrnPageRenderParams extends KrnLogCommonParams	// class@0008e8
{
    public final Map extra;
    public final int isTurboModuleEnabled;
    public long mAssetGetBaseJsTime;
    public long mAssetLoadFromLocalTime;
    public long mAssetLoadFromNotLocalTime;
    public long mBundleCheckTime;
    public long mBundleDownloadTime;
    public long mBundleGetInfoTime;
    public long mBundleInstallTime;
    public long mBundleLoadFromMemoryTime;
    public long mBundleLoadTime;
    public long mLoadBaseJsTime;
    public long mLoadScriptTime;
    public final KrnDurationModel pluginTime;
    public final KrnDurationModel t0;
    public final KrnDurationModel t1;
    public final KrnDurationModel t1native;
    public final KrnDurationModel t2;
    public final KrnDurationModel t3;

    public void KrnPageRenderParams(c p0,String p1,KrnDurationModel p2,KrnDurationModel p3,KrnDurationModel p4,KrnDurationModel p5,KrnDurationModel p6,KrnDurationModel p7,Map p8,int p9,long p10,long p11,long p12,long p13,long p14,long p15,long p16,long p17,long p18,long p19,long p20){
       boolean b1;
       int i = this;
       int i1 = p0;
       Object obj = p6;
       Object obj1 = p7;
       a.p(p2, "pluginTime");
       a.p(p3, "t0");
       a.p(p4, "t1");
       a.p(p5, "t1native");
       a.p(obj, "t2");
       a.p(obj1, "t3");
       super(p0, null);
       i.pluginTime = p2;
       i.t0 = p3;
       i.t1 = p4;
       i.t1native = p5;
       i.t2 = obj;
       i.t3 = obj1;
       i.extra = p8;
       i.isTurboModuleEnabled = p9;
       i.mBundleLoadTime = p10;
       i.mBundleGetInfoTime = p11;
       i.mBundleDownloadTime = p12;
       i.mBundleCheckTime = p13;
       i.mBundleInstallTime = p14;
       i.mAssetGetBaseJsTime = p15;
       i.mBundleLoadFromMemoryTime = p16;
       i.mAssetLoadFromLocalTime = p17;
       i.mAssetLoadFromNotLocalTime = p18;
       i.mLoadBaseJsTime = p19;
       i.mLoadScriptTime = p20;
       boolean b = false;
       if (i1) {
          LaunchModel launchModel = p0.m();
          if (launchModel != null) {
             PluginTrackInfo pluginTrackI = launchModel.j();
             if (pluginTrackI != null) {
                b1 = pluginTrackI.h();
             label_0081 :
                this.d(b1);
                if (i1) {
                   LaunchModel launchModel1 = p0.m();
                   if (launchModel1 != null) {
                      PluginTrackInfo pluginTrackI1 = launchModel1.j();
                      if (pluginTrackI1 != null) {
                         b = pluginTrackI1.g();
                      }
                   }
                }
                this.c(b);
                return;
             }
          }
       }
       b1 = false;
       goto label_0081 ;
    }
}
