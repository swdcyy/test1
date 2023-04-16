package com.yxcorp.gifshow.postwork.e$b;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.CharSequence;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import r26.a;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import z30.n0;
import com.kuaishou.edit.draft.Workspace;
import z30.o0;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Enum;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$UploadSource;

public class e$b	// class@0010c7
{
    public final String a;
    public final Map b;
    public int c;
    public String d;
    public long e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public final List j;
    public boolean k;

    public void e$b(String p0){
       super();
       this.b = new HashMap();
       this.c = 0;
       this.d = "";
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = false;
       this.j = new LinkedList();
       this.k = false;
       this.a = p0;
    }
    public void a(String p0,long p1){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uob, "6")) {
          return;
       }
       if (!p0.contains("progress") || (p1 - this.e) - 0x2710 > 0) {
          Object[] objArray = new Object[0];
          a.D().w("PostStuckDetector", "addEvent\(\) called with: eventKey = ["+p0+"], eventTime = ["+p1+"]", objArray);
       }
       String str = "start_";
       if (p0.startsWith(str)) {
          this.j.add(p0.replace(str, ""));
       }else {
          str = "end_";
          if (p0.startsWith(str)) {
             this.j.remove(p0.replace(str, ""));
          }
       }
       this.b.put(p0, Long.valueOf(p1));
       this.d = p0;
       this.e = p1;
       return;
    }
    public final String b(String p0){
       Workspace obj = PatchProxy.applyOneRefs(p0, this, e$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = d.a(-273232199).a20().Q3(p0);
       if (uoa != null) {
          if (uoa.getEncodeInfo() != null && uoa.getEncodeInfo().mIWorkspace != null) {
             obj = o0.a(uoa.getEncodeInfo().mIWorkspace);
             if (obj != null) {
                return obj.getType().name();
             }
          }
          if (uoa.getUploadInfo() != null) {
             obj = o0.a(uoa.getUploadInfo().getWorkSpace());
             if (obj != null) {
                return obj.getType().name();
             }else {
                return uoa.getUploadInfo().getSource().name();
             }
          }
       }
       return "unknown";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostTask{mTaskId=\'"+this.a+'''+", mLastEvent=\'"+this.d+'''+", mLastUpdateTime="+this.e+'}';
    }
}
