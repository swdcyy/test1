package com.kwai.video.westeros.v2.ykitplugin.YKitSoLoader;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import com.kwai.video.westeros.v2.ykitplugin.CpuInfoChecker;

public class YKitSoLoader	// class@0010fc
{

    public void YKitSoLoader(){
       super();
    }
    public static void loadNative(){
       if (PatchProxy.applyVoid(null, null, YKitSoLoader.class, "1")) {
          return;
       }
       WesterosSoLoader.loadNative();
       WesterosSoLoader.loadLibrary("ykit_plugin");
       WesterosSoLoader.loadLibrary("tensorflow-lite");
       WesterosSoLoader.loadLibrary("ykit_module");
       return;
    }
    public static void loadYKitExtraSo(){
       if (PatchProxy.applyVoid(null, null, YKitSoLoader.class, "2")) {
          return;
       }
       CpuInfoChecker cpuInfo = CpuInfoChecker.getCpuInfo();
       if (cpuInfo.supportHiAI()) {
          WesterosSoLoader.loadLibrary("hiai_c_def");
          WesterosSoLoader.loadLibrary("hiai_enhance");
          WesterosSoLoader.loadLibrary("hiai");
          WesterosSoLoader.loadLibrary("hiai_ir");
          WesterosSoLoader.loadLibrary("hiai_ir_build");
          WesterosSoLoader.loadLibrary("hiai_ir_infershape");
          WesterosSoLoader.loadLibrary("hiai_binary_model_runtime");
          WesterosSoLoader.loadLibrary("ai_fmk_dnnacl");
          WesterosSoLoader.loadLibrary("hiai_hcl_model_runtime");
          WesterosSoLoader.loadLibrary("hiai_session_impl");
       }
       if (cpuInfo.supportNeuroPilot()) {
          WesterosSoLoader.loadLibrary("tflite_static_mtk");
       }
       if (cpuInfo.supportSNPE()) {
          WesterosSoLoader.loadLibrary("SNPE");
          WesterosSoLoader.loadLibrary("ycnn_ext_snpe");
          WesterosSoLoader.loadLibrary("PlatformValidatorShared");
          WesterosSoLoader.loadLibrary("calculator");
          WesterosSoLoader.loadLibrary("snpe_dsp_domains_v2");
          WesterosSoLoader.loadLibrary("snpe_dsp_domains_v2_system");
       }
       return;
    }
}
