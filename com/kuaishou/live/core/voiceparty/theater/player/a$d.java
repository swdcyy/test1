package com.kuaishou.live.core.voiceparty.theater.player.a$d;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.theater.model.TheaterLiveDataSource;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$d extends a	// class@0019a7
{
    public final String b;
    public final TheaterLiveDataSource c;

    public void a$d(String p0,TheaterLiveDataSource p1){
       a.p(p0, "photoId");
       a.p(p1, "liveDataSource");
       super(null);
       this.b = p0;
       this.c = p1;
    }
    public final TheaterLiveDataSource c(){
       return this.c;
    }
    public final String d(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$d && (a.g(this.b, p0.b) && a.g(this.c, p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$d obj = PatchProxy.apply(null, this, a$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$d tc = this.c;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveSource\(photoId="+this.b+", liveDataSource="+this.c+"\)";
    }
}
