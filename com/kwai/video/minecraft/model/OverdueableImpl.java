package com.kwai.video.minecraft.model.OverdueableImpl;
import com.kwai.video.minecraft.model.Overdueable;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class OverdueableImpl extends ModelBase implements Overdueable	// class@000a1e
{

    public void OverdueableImpl(){
       super();
    }
    public static native boolean native_isValid(long p0);
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, OverdueableImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return OverdueableImpl.native_isValid(this.nativeRef);
    }
}
