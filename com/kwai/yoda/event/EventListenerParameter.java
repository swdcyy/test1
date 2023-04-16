package com.kwai.yoda.event.EventListenerParameter;
import java.io.Serializable;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class EventListenerParameter implements Serializable	// class@0011c1
{
    public String mHybridId;
    public String mListener;
    public String mType;
    public WeakReference mYodaBaseWebViewWeakReference;
    public static final long serialVersionUID = 0x27b3c64a2a5b51c0;

    public void EventListenerParameter(YodaBaseWebView p0,String p1,String p2){
       super();
       this.mHybridId = String.valueOf(p0.hashCode());
       this.mYodaBaseWebViewWeakReference = new WeakReference(p0);
       this.mType = p1;
       this.mListener = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EventListenerParameter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 instanceof EventListenerParameter && (p0.getHybridId() != null && (p0.getListener() != null && (p0.getType() != null && ((p0.getType()).equals(this.mType) && ((p0.getListener()).equals(this.mListener) && (p0.getHybridId()).equals(this.mHybridId))))))) {
          b = true;
       }
    label_0051 :
       return b;
    }
    public String getHybridId(){
       return this.mHybridId;
    }
    public String getListener(){
       return this.mListener;
    }
    public String getType(){
       return this.mType;
    }
    public YodaBaseWebView getYodaBaseWebView(){
       Object[] objArray = null;
       EventListenerParameter obj = PatchProxy.apply(objArray, this, EventListenerParameter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mYodaBaseWebViewWeakReference;
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
    public WeakReference getYodaBaseWebViewRef(){
       return this.mYodaBaseWebViewWeakReference;
    }
    public int hashCode(){
       EventListenerParameter obj = PatchProxy.apply(null, this, EventListenerParameter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mType;
       int i = 0;
       int i1 = (obj == null)? 0: obj.hashCode();
       i1 = (i1 + 31) * 31;
       EventListenerParameter tmListener = this.mListener;
       int i2 = (tmListener == null)? 0: tmListener.hashCode();
       i1 = (i1 + i2) * 31;
       EventListenerParameter tmHybridId = this.mHybridId;
       if (tmHybridId != null) {
          i = tmHybridId.hashCode();
       }
       return (i1 + i);
    }
}
