package com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ApiManager$UploadStep extends Enum	// class@000989
{
    public static final ApiManager$UploadStep[] $VALUES;
    public static final ApiManager$UploadStep Apply;
    public static final ApiManager$UploadStep Publish;
    public static final ApiManager$UploadStep UploadFragment;
    public static final ApiManager$UploadStep UploadFragmentFinished;

    static {
       ApiManager$UploadStep uploadStep = new ApiManager$UploadStep("Apply", 0);
       ApiManager$UploadStep.Apply = uploadStep;
       ApiManager$UploadStep uploadStep1 = new ApiManager$UploadStep("Publish", 1);
       ApiManager$UploadStep.Publish = uploadStep1;
       ApiManager$UploadStep uploadStep2 = new ApiManager$UploadStep("UploadFragment", 2);
       ApiManager$UploadStep.UploadFragment = uploadStep2;
       ApiManager$UploadStep uploadStep3 = new ApiManager$UploadStep("UploadFragmentFinished", 3);
       ApiManager$UploadStep.UploadFragmentFinished = uploadStep3;
       ApiManager$UploadStep[] uploadStepAr = new ApiManager$UploadStep[]{uploadStep,uploadStep1,uploadStep2,uploadStep3};
       ApiManager$UploadStep.$VALUES = uploadStepAr;
    }
    public void ApiManager$UploadStep(String p0,int p1){
       super(p0, p1);
    }
    public static ApiManager$UploadStep valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ApiManager$UploadStep.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ApiManager$UploadStep.class, p0);
    }
    public static ApiManager$UploadStep[] values(){
       Object obj = PatchProxy.apply(null, null, ApiManager$UploadStep.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ApiManager$UploadStep.$VALUES.clone();
    }
}
