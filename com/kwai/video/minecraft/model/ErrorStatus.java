package com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;

public class ErrorStatus extends ModelBase	// class@0009fc
{

    public void ErrorStatus(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void ErrorStatus(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native String native_description(long p0);
    public static native void native_destroy(long p0);
    public static native int native_errorCode(long p0);
    public static native String native_message(long p0);
    public String description(){
       Object obj = PatchProxy.apply(null, this, ErrorStatus.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ErrorStatus.native_description(this.nativeRef);
    }
    public int errorCode(){
       Object obj = PatchProxy.apply(null, this, ErrorStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ErrorStatus.native_errorCode(this.nativeRef);
    }
    public byte[] getData(ErrorStatus p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ErrorStatus.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return ("{errorCode : "+this.errorCode()+"\nmessage : "+this.message()+"\ndescription : }"+this.description()).getBytes(StandardCharsets.UTF_8);
    }
    public String message(){
       Object obj = PatchProxy.apply(null, this, ErrorStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ErrorStatus.native_message(this.nativeRef);
    }
    public native final long native_create();
}
