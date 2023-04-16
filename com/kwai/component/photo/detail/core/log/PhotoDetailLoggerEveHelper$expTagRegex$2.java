package com.kwai.component.photo.detail.core.log.PhotoDetailLoggerEveHelper$expTagRegex$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kotlin.text.Regex;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class PhotoDetailLoggerEveHelper$expTagRegex$2 extends Lambda implements a	// class@000a27
{
    public static final PhotoDetailLoggerEveHelper$expTagRegex$2 INSTANCE;

    static {
       PhotoDetailLoggerEveHelper$expTagRegex$2.INSTANCE = new PhotoDetailLoggerEveHelper$expTagRegex$2();
    }
    public void PhotoDetailLoggerEveHelper$expTagRegex$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Regex invoke(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, PhotoDetailLoggerEveHelper$expTagRegex$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().c("eveExpTagRegex", objArray);
       if (obj != null) {
          objArray = new Regex(obj);
       }
       return objArray;
    }
}
