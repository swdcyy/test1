package com.facebook.react.animated.NativeAnimatedModule$k;
import ze.e;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import sd.l;
import android.util.SparseArray;
import java.lang.Object;
import od.a;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import com.facebook.react.modules.core.a$a;
import java.lang.String;
import java.lang.Throwable;
import cb.a;
import java.lang.RuntimeException;

public class NativeAnimatedModule$k extends e	// class@00118a
{
    public final NativeAnimatedModule d;

    public void NativeAnimatedModule$k(NativeAnimatedModule p0,ReactContext p1){
       this.d = p0;
       super(p1);
    }
    public void c(long p0){
       try{
          l nodesManager = this.d.getNodesManager();
          if (nodesManager != null) {
             int i = (nodesManager.b.size() > 0 || nodesManager.c.size() > 0)? 1: 0;
             if (i) {
                nodesManager.c(p0);
             }
          }
          if (nodesManager == null && this.d.mReactChoreographer == null) {
             return;
          }else {
             NativeAnimatedModule mReactChoreo = this.d.mReactChoreographer;
             a.c(mReactChoreo);
             mReactChoreo.d(ReactChoreographer$CallbackType.NATIVE_ANIMATED_MODULE, this.d.mAnimatedFrameCallback);
             return;
          }
       }catch(java.lang.Exception e3){
          a.h("ReactNative", "Exception while executing animated frame callback.", e3);
          throw new RuntimeException(e3);
       }
    }
}
