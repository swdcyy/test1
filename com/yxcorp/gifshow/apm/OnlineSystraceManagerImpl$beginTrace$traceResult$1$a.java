package com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$beginTrace$traceResult$1$a;
import erd.a;
import com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$beginTrace$traceResult$1;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import java.lang.Long;
import o56.a;
import k2b.u1;
import java.lang.Throwable;
import android.util.Log;

public final class OnlineSystraceManagerImpl$beginTrace$traceResult$1$a implements a	// class@001b8d
{
    public final OnlineSystraceManagerImpl$beginTrace$traceResult$1 b;
    public final File c;
    public final File d;

    public void OnlineSystraceManagerImpl$beginTrace$traceResult$1$a(OnlineSystraceManagerImpl$beginTrace$traceResult$1 p0,File p1,File p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, OnlineSystraceManagerImpl$beginTrace$traceResult$1$a.class, "1")) {
          return;
       }
       this.c.delete();
       this.d.delete();
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("type", this.b.$type.longValue());
       jSONObject.put("scene", this.b.$scene);
       jSONObject.put("mLogUUID", this.b.$logUUID);
       jSONObject.put("did", a.a);
       jSONObject.put("uploadReason", "dummy");
       u1.Y("chronos_upload_event", jSONObject.toString(), 19);
       return;
    }
}
