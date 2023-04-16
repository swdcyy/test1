package com.kwai.video.minecraft.model.EffectModel;
import com.kwai.video.minecraft.model.OverdueableImpl;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableEffect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class EffectModel extends OverdueableImpl	// class@0009fa
{

    public void EffectModel(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native MutableEffect native_cloneEffect(long p0,ErrorStatus p1);
    public static native void native_destroy(long p0);
    public MutableEffect cloneEffect(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EffectModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EffectModel.native_cloneEffect(this.nativeRef, p0);
    }
}
