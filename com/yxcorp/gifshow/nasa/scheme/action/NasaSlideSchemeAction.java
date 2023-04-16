package com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeAction;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import ok.k;

public class NasaSlideSchemeAction implements Serializable	// class@0020d7
{
    public boolean mHasConsume;
    public final int mType;
    public static final long serialVersionUID = 0xb3bf57eed14c319a;

    public void NasaSlideSchemeAction(int p0){
       super();
       this.mType = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NasaSlideSchemeAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mType != p0.mType) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, NasaSlideSchemeAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mType)};
       return k.b(obj);
    }
}
