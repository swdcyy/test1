package com.yxcorp.gifshow.media.builder.MP4Builder$ActionCallbackWrap;
import com.yxcorp.gifshow.media.builder.MP4Builder;
import t6b.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class MP4Builder$ActionCallbackWrap	// class@001cf6
{
    public b _callback;
    public final MP4Builder this$0;

    public void MP4Builder$ActionCallbackWrap(MP4Builder p0,b p1){
       this.this$0 = p0;
       super();
       this._callback = p1;
    }
    public boolean onActionCallback(long p0,long p1,long p2){
       if (PatchProxy.isSupport(MP4Builder$ActionCallbackWrap.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, MP4Builder$ActionCallbackWrap.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this._callback.a((int)p1, (int)p2);
    }
}
