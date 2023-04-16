package com.horcrux.svg.SvgViewModule$1;
import java.lang.Runnable;
import java.lang.ref.WeakReference;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.SvgViewManager;
import com.horcrux.svg.SvgViewModule$1$1;
import com.horcrux.svg.SvgViewModule$1$2;
import java.lang.String;

public final class SvgViewModule$1 implements Runnable	// class@0005fd
{
    public final int val$attempt;
    public final ReadableMap val$options;
    public final WeakReference val$reactApplicationContextWeakReference;
    public final Callback val$successCallback;
    public final int val$tag;

    public void SvgViewModule$1(WeakReference p0,int p1,ReadableMap p2,Callback p3,int p4){
       this.val$reactApplicationContextWeakReference = p0;
       this.val$tag = p1;
       this.val$options = p2;
       this.val$successCallback = p3;
       this.val$attempt = p4;
       super();
    }
    public void run(){
       Object[] objArray;
       if (this.val$reactApplicationContextWeakReference.get() != null && this.val$reactApplicationContextWeakReference.get().hasActiveCatalystInstance()) {
          SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.val$tag);
          if (svgViewByTag == null) {
             SvgViewManager.runWhenViewIsAvailable(this.val$tag, new SvgViewModule$1$1(this), this.val$reactApplicationContextWeakReference.get().hashCode());
          }else if(svgViewByTag.notRendered()){
             svgViewByTag.setToDataUrlTask(new SvgViewModule$1$2(this));
          }else {
             SvgViewModule$1 tval$options = this.val$options;
             int i = 1;
             if (tval$options != null) {
                objArray = new Object[i];
                objArray[0] = svgViewByTag.toDataURL(tval$options.getInt("width"), this.val$options.getInt("height"));
                this.val$successCallback.invoke(objArray);
             }else {
                objArray = new Object[i];
                objArray[0] = svgViewByTag.toDataURL();
                this.val$successCallback.invoke(objArray);
             }
          }
       }
       return;
    }
}
