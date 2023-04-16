package com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantCommonLogBiz extends Enum implements a	// class@001ae3
{
    public final String mBiz;
    public static final MerchantCommonLogBiz[] $VALUES;
    public static final MerchantCommonLogBiz BRIDGE;
    public static final MerchantCommonLogBiz DIALOG;
    public static final MerchantCommonLogBiz FOLD_ADAPTION;
    public static final MerchantCommonLogBiz KERNELS;
    public static final MerchantCommonLogBiz LIFECYCLE;
    public static final MerchantCommonLogBiz LOG_DYEING;
    public static final MerchantCommonLogBiz MIX_RN_H5_CONTAINER;
    public static final MerchantCommonLogBiz NETWORKERROR;
    public static final MerchantCommonLogBiz PERFMONITOR;
    public static final MerchantCommonLogBiz PRELOADER;
    public static final MerchantCommonLogBiz RN;
    public static final MerchantCommonLogBiz ROUTER;
    public static final MerchantCommonLogBiz SCREEN_SHOT;
    public static final MerchantCommonLogBiz TOAST;
    public static final MerchantCommonLogBiz TOASTERROR;
    public static final MerchantCommonLogBiz UTILS;
    public static final MerchantCommonLogBiz WEB;
    public static final MerchantCommonLogBiz WEBVIEW;

    static {
       MerchantCommonLogBiz merchantComm = new MerchantCommonLogBiz("LIFECYCLE", 0, "Lifecycle");
       MerchantCommonLogBiz.LIFECYCLE = merchantComm;
       MerchantCommonLogBiz merchantComm1 = new MerchantCommonLogBiz("ROUTER", 1, "MerchantRouter");
       MerchantCommonLogBiz.ROUTER = merchantComm1;
       MerchantCommonLogBiz merchantComm2 = new MerchantCommonLogBiz("PRELOADER", 2, "MerchantPreloader");
       MerchantCommonLogBiz.PRELOADER = merchantComm2;
       MerchantCommonLogBiz merchantComm3 = new MerchantCommonLogBiz("WEBVIEW", 3, "Webview");
       MerchantCommonLogBiz.WEBVIEW = merchantComm3;
       MerchantCommonLogBiz merchantComm4 = new MerchantCommonLogBiz("PERFMONITOR", 4, "PerfMonitor");
       MerchantCommonLogBiz.PERFMONITOR = merchantComm4;
       MerchantCommonLogBiz merchantComm5 = new MerchantCommonLogBiz("TOASTERROR", 5, "ToastError");
       MerchantCommonLogBiz.TOASTERROR = merchantComm5;
       MerchantCommonLogBiz merchantComm6 = new MerchantCommonLogBiz("DIALOG", 6, "Dialog");
       MerchantCommonLogBiz.DIALOG = merchantComm6;
       MerchantCommonLogBiz merchantComm7 = new MerchantCommonLogBiz("NETWORKERROR", 7, "NetworkError");
       MerchantCommonLogBiz.NETWORKERROR = merchantComm7;
       MerchantCommonLogBiz merchantComm8 = new MerchantCommonLogBiz("UTILS", 8, "Utils");
       MerchantCommonLogBiz.UTILS = merchantComm8;
       MerchantCommonLogBiz merchantComm9 = new MerchantCommonLogBiz("KERNELS", 9, "Kernels");
       MerchantCommonLogBiz.KERNELS = merchantComm9;
       MerchantCommonLogBiz merchantComm10 = new MerchantCommonLogBiz("BRIDGE", 10, "bridge");
       MerchantCommonLogBiz.BRIDGE = merchantComm10;
       MerchantCommonLogBiz merchantComm11 = new MerchantCommonLogBiz("FOLD_ADAPTION", 11, "foldAdaption");
       MerchantCommonLogBiz.FOLD_ADAPTION = merchantComm11;
       MerchantCommonLogBiz merchantComm12 = new MerchantCommonLogBiz("RN", 12, "RN");
       MerchantCommonLogBiz.RN = merchantComm12;
       MerchantCommonLogBiz merchantComm13 = merchantComm12;
       MerchantCommonLogBiz merchantComm14 = new MerchantCommonLogBiz("TOAST", 13, "Toast");
       MerchantCommonLogBiz.TOAST = merchantComm14;
       MerchantCommonLogBiz merchantComm15 = merchantComm14;
       merchantComm12 = new MerchantCommonLogBiz("SCREEN_SHOT", 14, "screenShot");
       MerchantCommonLogBiz.SCREEN_SHOT = merchantComm12;
       MerchantCommonLogBiz merchantComm16 = merchantComm12;
       MerchantCommonLogBiz merchantComm17 = new MerchantCommonLogBiz("WEB", 15, "merchantYodaWeb");
       MerchantCommonLogBiz.WEB = merchantComm17;
       MerchantCommonLogBiz merchantComm18 = merchantComm17;
       merchantComm12 = new MerchantCommonLogBiz("MIX_RN_H5_CONTAINER", 16, "MixRNH5Container");
       MerchantCommonLogBiz.MIX_RN_H5_CONTAINER = merchantComm12;
       MerchantCommonLogBiz merchantComm19 = merchantComm12;
       merchantComm17 = new MerchantCommonLogBiz("LOG_DYEING", 17, "LogDyeing");
       MerchantCommonLogBiz.LOG_DYEING = merchantComm17;
       MerchantCommonLogBiz[] merchantComm20 = new MerchantCommonLogBiz[18];
       merchantComm20[0] = merchantComm;
       merchantComm20[1] = merchantComm1;
       merchantComm20[2] = merchantComm2;
       merchantComm20[3] = merchantComm3;
       merchantComm20[4] = merchantComm4;
       merchantComm20[5] = merchantComm5;
       merchantComm20[6] = merchantComm6;
       merchantComm20[7] = merchantComm7;
       merchantComm20[8] = merchantComm8;
       merchantComm20[9] = merchantComm9;
       merchantComm20[10] = merchantComm10;
       merchantComm20[11] = merchantComm11;
       merchantComm20[12] = merchantComm13;
       merchantComm20[13] = merchantComm15;
       merchantComm20[14] = merchantComm16;
       merchantComm20[15] = merchantComm18;
       merchantComm20[16] = merchantComm19;
       merchantComm20[17] = merchantComm17;
       MerchantCommonLogBiz.$VALUES = merchantComm20;
    }
    public void MerchantCommonLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static MerchantCommonLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantCommonLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantCommonLogBiz.class, p0);
    }
    public static MerchantCommonLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantCommonLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantCommonLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
