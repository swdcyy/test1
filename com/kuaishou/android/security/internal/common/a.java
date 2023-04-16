package com.kuaishou.android.security.internal.common.a;
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
import java.lang.Boolean;
import java.lang.Enum;
import com.kuaishou.android.security.internal.common.h$a;
import com.kuaishou.android.security.internal.common.a$b;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a extends h	// class@0006cc
{
    public final Context a;
    public final String b;
    public final String c;
    public final KSecuritySdkILog d;
    public final KSecurityContext$Mode e;
    public final KSecurityTrack$IKSecurityTrackCallback f;

    public void a(Context p0,String p1,String p2,KSecuritySdkILog p3,KSecurityContext$Mode p4,KSecurityTrack$IKSecurityTrackCallback p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public void a(Context p0,String p1,String p2,KSecuritySdkILog p3,KSecurityContext$Mode p4,KSecurityTrack$IKSecurityTrackCallback p5,a$a p6){
       super(p0, p1, p2, p3, p4, p5);
    }
    public String a(){
       return this.b;
    }
    public Context c(){
       return this.a;
    }
    public KSecurityContext$Mode d(){
       return this.e;
    }
    public KSecuritySdkILog e(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof h) {
          return false;
       }
       if (!this.a.equals(p0.c()) || (!(this.b).equals(p0.a()) || (!(this.c).equals(p0.h()) || (!this.d.equals(p0.e()) || (!this.e.equals(p0.d()) || !this.f.equals(p0.g())))))) {
          b = false;
       }
       return b;
    }
    public h$a f(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$b(this, null);
    }
    public KSecurityTrack$IKSecurityTrackCallback g(){
       return this.f;
    }
    public String h(){
       return this.c;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (((((((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ (this.b).hashCode()) * 0xf4243) ^ (this.c).hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ this.e.hashCode()) * 0xf4243) ^ this.f.hashCode());
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "InitCommonParams{context="+this.a+", appkey="+this.b+", wbKey="+this.c+", logCallback="+this.d+", initMode="+this.e+", trackerDelegate="+this.f+"}";
    }
}
