package com.facebook.jni.HybridData$Destructor;
import com.facebook.jni.a$b;
import java.lang.Object;

public class HybridData$Destructor extends a$b	// class@00115a
{
    public long mNativePointer;

    public void HybridData$Destructor(Object p0){
       super(p0);
    }
    public static native void deleteNative(long p0);
    public final void a(){
       HybridData$Destructor.deleteNative(this.mNativePointer);
       this.mNativePointer = 0;
    }
}
