package com.kwai.sdk.eve.internal.api.EveApi$b;
import u97.c;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import okhttp3.Request;

public final class EveApi$b extends c	// class@001460
{
    public final c a;

    public void EveApi$b(c p0){
       this.a = p0;
       super();
    }
    public Map a(Map p0){
       EveApi$b obj = PatchProxy.applyOneRefs(p0, this, EveApi$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cookieMap");
       obj = this.a;
       if (obj != null) {
          Map map = obj.a(p0);
          if (map != null) {
             p0 = map;
          label_0023 :
             return p0;
          }
       }
       super.a(p0);
       goto label_0023 ;
    }
    public Map b(Map p0){
       EveApi$b obj = PatchProxy.applyOneRefs(p0, this, EveApi$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "headerMap");
       obj = this.a;
       if (obj != null) {
          Map map = obj.b(p0);
          if (map != null) {
             p0 = map;
          label_0023 :
             return p0;
          }
       }
       super.b(p0);
       goto label_0023 ;
    }
    public Map c(Map p0){
       EveApi$b obj = PatchProxy.applyOneRefs(p0, this, EveApi$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "postMap");
       obj = this.a;
       if (obj != null) {
          Map map = obj.c(p0);
          if (map != null) {
             p0 = map;
          label_0023 :
             return p0;
          }
       }
       super.c(p0);
       goto label_0023 ;
    }
    public Map d(Map p0){
       EveApi$b obj = PatchProxy.applyOneRefs(p0, this, EveApi$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "queryMap");
       obj = this.a;
       if (obj != null) {
          Map map = obj.d(p0);
          if (map != null) {
             p0 = map;
          label_0023 :
             return p0;
          }
       }
       super.d(p0);
       goto label_0023 ;
    }
    public Map e(Request p0,Map p1,Map p2){
       EveApi$b obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, EveApi$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "request");
       a.p(p1, "params");
       a.p(p2, "sigMap");
       obj = this.a;
       if (obj != null) {
          Map map = obj.e(p0, p1, p2);
          if (map != null) {
             p2 = map;
          label_0031 :
             return p2;
          }
       }
       super.e(p0, p1, p2);
       goto label_0031 ;
    }
}
