package com.yxcorp.gifshow.camera.record.widget.AnimCameraView$CameraSwitchAnim;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AnimCameraView$CameraSwitchAnim extends Enum	// class@000fb0
{
    public static final AnimCameraView$CameraSwitchAnim[] $VALUES;
    public static final AnimCameraView$CameraSwitchAnim None;
    public static final AnimCameraView$CameraSwitchAnim ToBack;
    public static final AnimCameraView$CameraSwitchAnim ToFront;

    static {
       AnimCameraView$CameraSwitchAnim uCameraSwitc = new AnimCameraView$CameraSwitchAnim("None", 0);
       AnimCameraView$CameraSwitchAnim.None = uCameraSwitc;
       AnimCameraView$CameraSwitchAnim uCameraSwitc1 = new AnimCameraView$CameraSwitchAnim("ToFront", 1);
       AnimCameraView$CameraSwitchAnim.ToFront = uCameraSwitc1;
       AnimCameraView$CameraSwitchAnim uCameraSwitc2 = new AnimCameraView$CameraSwitchAnim("ToBack", 2);
       AnimCameraView$CameraSwitchAnim.ToBack = uCameraSwitc2;
       AnimCameraView$CameraSwitchAnim[] uCameraSwitc3 = new AnimCameraView$CameraSwitchAnim[]{uCameraSwitc,uCameraSwitc1,uCameraSwitc2};
       AnimCameraView$CameraSwitchAnim.$VALUES = uCameraSwitc3;
    }
    public void AnimCameraView$CameraSwitchAnim(String p0,int p1){
       super(p0, p1);
    }
    public static AnimCameraView$CameraSwitchAnim valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AnimCameraView$CameraSwitchAnim.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AnimCameraView$CameraSwitchAnim.class, p0);
    }
    public static AnimCameraView$CameraSwitchAnim[] values(){
       Object obj = PatchProxy.apply(null, null, AnimCameraView$CameraSwitchAnim.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AnimCameraView$CameraSwitchAnim.$VALUES.clone();
    }
}
