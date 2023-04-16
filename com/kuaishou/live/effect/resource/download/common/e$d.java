package com.kuaishou.live.effect.resource.download.common.e$d;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.effect.resource.download.v2.Status;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class e$d	// class@001b37
{
    public String a;
    public String b;
    public Map c;

    public void e$d(String p0,String p1,String p2){
       super();
       this.c = new ConcurrentHashMap();
       this.a = p1;
       this.b = p0;
       if (!TextUtils.x(p2)) {
          this.c.put(p2, Status.IDLE);
       }
       this.c.put(this.a, Status.IDLE);
       return;
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.c.containsKey(p0)) {
          return false;
       }
       return Status.isDownloadSuccess(this.c.get(p0));
    }
    public void b(String p0,Status p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$d.class, "1")) {
          return;
       }
       if (this.c.containsKey(p0)) {
          this.c.put(p0, p1);
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e$d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DownloadStatus{mMagicFaceId=\'"+this.a+'''+", mEffectKey=\'"+this.b+'''+", mDownloadStatus="+this.c+'}';
    }
}
