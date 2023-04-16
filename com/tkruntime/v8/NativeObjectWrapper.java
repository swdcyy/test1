package com.tkruntime.v8.NativeObjectWrapper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class NativeObjectWrapper	// class@000fa2
{
    public boolean mIsNeedReadPropertyFromJs;
    public Object mNativeObject;

    public void NativeObjectWrapper(Object p0,boolean p1){
       super();
       this.mNativeObject = p0;
       this.mIsNeedReadPropertyFromJs = p1;
    }
    public static NativeObjectWrapper wrapNativeObject(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NativeObjectWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NativeObjectWrapper.wrapNativeObject(p0, false);
    }
    public static NativeObjectWrapper wrapNativeObject(Object p0,boolean p1){
       NativeObjectWrapper nativeObject = NativeObjectWrapper.class;
       if (PatchProxy.isSupport(nativeObject)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, nativeObject, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new NativeObjectWrapper(p0, p1);
    }
    public Object getNativeObject(){
       return this.mNativeObject;
    }
    public boolean isNeedReadPropertyFromJs(){
       return this.mIsNeedReadPropertyFromJs;
    }
}
