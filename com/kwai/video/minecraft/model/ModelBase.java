package com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.SerializableObject;
import java.lang.Object;
import com.kwai.video.minecraft.model.ErrorStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;

public abstract class ModelBase implements SerializableObject	// class@000a0a
{
    public long nativeRef;

    public void ModelBase(){
       super();
    }
    public static native byte[] native_getData(long p0,ErrorStatus p1);
    public byte[] getData(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ModelBase.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ModelBase.native_getData(this.nativeRef, p0);
    }
    public String toString(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ModelBase.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new String(this.getData(objArray), StandardCharsets.UTF_8);
    }
}
