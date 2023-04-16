package com.horcrux.svg.SvgViewModule$1$1$1;
import java.lang.Runnable;
import com.horcrux.svg.SvgViewModule$1$1;
import java.lang.Object;
import com.horcrux.svg.SvgViewModule$1;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import java.lang.ref.WeakReference;
import com.horcrux.svg.SvgViewModule;

public class SvgViewModule$1$1$1 implements Runnable	// class@0005fa
{
    public final SvgViewModule$1$1 this$1;

    public void SvgViewModule$1$1$1(SvgViewModule$1$1 p0){
       this.this$1 = p0;
       super();
    }
    public void run(){
       SvgViewModule$1$1 this$0 = this.this$1.this$0;
       SvgViewModule.toDataURL(this$0.val$tag, this$0.val$options, this$0.val$successCallback, (this$0.val$attempt + 1), this$0.val$reactApplicationContextWeakReference);
    }
}
