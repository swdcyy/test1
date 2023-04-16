package com.kwai.feature.post.api.core.model.RecreationParam$a;
import java.lang.Object;
import com.kwai.feature.post.api.core.model.RecreationParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class RecreationParam$a	// class@001308
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public List l;
    public List m;
    public JsMerchantCommentParams n;

    public void RecreationParam$a(){
       super();
    }
    public RecreationParam a(){
       Object obj = PatchProxy.apply(null, this, RecreationParam$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecreationParam(this);
    }
    public RecreationParam$a b(boolean p0){
       this.j = p0;
       return this;
    }
    public RecreationParam$a c(String p0){
       this.k = p0;
       return this;
    }
    public RecreationParam$a d(int p0){
       this.g = p0;
       return this;
    }
    public RecreationParam$a e(String p0){
       this.d = p0;
       return this;
    }
    public RecreationParam$a f(String p0){
       this.b = p0;
       return this;
    }
    public RecreationParam$a g(int p0){
       this.f = p0;
       return this;
    }
    public RecreationParam$a h(String p0){
       this.c = p0;
       return this;
    }
    public RecreationParam$a i(String p0){
       this.e = p0;
       return this;
    }
}
