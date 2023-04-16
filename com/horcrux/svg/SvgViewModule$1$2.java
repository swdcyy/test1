package com.horcrux.svg.SvgViewModule$1$2;
import java.lang.Runnable;
import com.horcrux.svg.SvgViewModule$1;
import java.lang.Object;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import java.lang.ref.WeakReference;
import com.horcrux.svg.SvgViewModule;

public class SvgViewModule$1$2 implements Runnable	// class@0005fc
{
    public final SvgViewModule$1 this$0;

    public void SvgViewModule$1$2(SvgViewModule$1 p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       SvgViewModule$1$2 tthis$0 = this.this$0;
       SvgViewModule.toDataURL(tthis$0.val$tag, tthis$0.val$options, tthis$0.val$successCallback, (tthis$0.val$attempt + 1), tthis$0.val$reactApplicationContextWeakReference);
    }
}
