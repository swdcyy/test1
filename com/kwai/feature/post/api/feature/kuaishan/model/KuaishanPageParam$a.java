package com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam$a;
import z36.d$a;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;

public class KuaishanPageParam$a extends d$a	// class@0013a5
{
    public MediaSceneConfig h;
    public MediaSceneLaunchParams i;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public NearbyCommunityParams p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;

    public void KuaishanPageParam$a(){
       super();
       this.q = true;
    }
    public d$a c(){
       return this;
    }
    public KuaishanPageParam f(){
       Object obj = PatchProxy.apply(null, this, KuaishanPageParam$a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.j = true;
       return new KuaishanPageParam(this);
    }
    public KuaishanPageParam$a g(boolean p0){
       KuaishanPageParam$a uoa = KuaishanPageParam$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.q = p0;
       return this;
    }
    public KuaishanPageParam$a h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KuaishanPageParam$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.m = p0;
       return this;
    }
    public KuaishanPageParam$a i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KuaishanPageParam$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.l = p0;
       return this;
    }
    public KuaishanPageParam$a j(int p0){
       KuaishanPageParam$a uoa = KuaishanPageParam$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.s = p0;
       return this;
    }
    public KuaishanPageParam$a k(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KuaishanPageParam$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.k = p0;
       return this;
    }
    public KuaishanPageParam$a l(boolean p0){
       KuaishanPageParam$a uoa = KuaishanPageParam$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.t = p0;
       return this;
    }
}
