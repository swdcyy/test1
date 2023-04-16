package com.kuaishou.android.security.internal.common.a$b;
import com.kuaishou.android.security.internal.common.h$a;
import com.kuaishou.android.security.internal.common.h;
import android.content.Context;
import java.lang.String;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.kuaishou.android.security.internal.common.KSecurityContext$Mode;
import com.kuaishou.android.security.base.util.KSecurityTrack$IKSecurityTrackCallback;
import com.kuaishou.android.security.internal.common.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.StringBuilder;
import com.kuaishou.android.security.internal.common.a;
import java.lang.IllegalStateException;

public final class a$b extends h$a	// class@0006cb
{
    public Context a;
    public String b;
    public String c;
    public KSecuritySdkILog d;
    public KSecurityContext$Mode e;
    public KSecurityTrack$IKSecurityTrackCallback f;

    public void a$b(){
       super();
    }
    public void a$b(h p0){
       super();
       this.a = p0.c();
       this.b = p0.a();
       this.c = p0.h();
       this.d = p0.e();
       this.e = p0.d();
       this.f = p0.g();
    }
    public void a$b(h p0,a$a p1){
       super(p0);
    }
    public h$a a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null context");
       this.a = p0;
       return this;
    }
    public h$a a(KSecuritySdkILog p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null logCallback");
       this.d = p0;
       return this;
    }
    public h$a a(KSecurityTrack$IKSecurityTrackCallback p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null trackerDelegate");
       this.f = p0;
       return this;
    }
    public h$a a(KSecurityContext$Mode p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null initMode");
       this.e = p0;
       return this;
    }
    public h$a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null appkey");
       this.b = p0;
       return this;
    }
    public h a(){
       String obj = PatchProxy.apply(null, this, a$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.a == null)? " context": "";
       if (this.b == null) {
          obj = obj+" appkey";
       }
       if (this.c == null) {
          obj = obj+" wbKey";
       }
       if (this.d == null) {
          obj = obj+" logCallback";
       }
       if (this.e == null) {
          obj = obj+" initMode";
       }
       if (this.f == null) {
          obj = obj+" trackerDelegate";
       }
       if (obj.isEmpty()) {
          a uoa = new a(this.a, this.b, this.c, this.d, this.e, this.f, null);
          return obj;
       }else {
          throw new IllegalStateException("Missing required properties:"+obj);
       }
    }
    public h$a b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null wbKey");
       this.c = p0;
       return this;
    }
}
