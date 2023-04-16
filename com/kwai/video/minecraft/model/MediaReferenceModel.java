package com.kwai.video.minecraft.model.MediaReferenceModel;
import com.kwai.video.minecraft.model.OverdueableImpl;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableMediaReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class MediaReferenceModel extends OverdueableImpl	// class@000a02
{

    public void MediaReferenceModel(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native MutableMediaReference native_cloneMediaReference(long p0,ErrorStatus p1);
    public static native void native_destroy(long p0);
    public MutableMediaReference cloneMediaReference(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MediaReferenceModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MediaReferenceModel.native_cloneMediaReference(this.nativeRef, p0);
    }
}
