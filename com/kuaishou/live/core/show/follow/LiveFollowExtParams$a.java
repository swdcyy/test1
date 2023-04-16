package com.kuaishou.live.core.show.follow.LiveFollowExtParams$a;
import java.lang.Object;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveFollowExtParams$a	// class@000bae
{
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    public void LiveFollowExtParams$a(){
       super();
    }
    public LiveFollowExtParams a(){
       Object obj = PatchProxy.apply(null, this, LiveFollowExtParams$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFollowExtParams(this);
    }
    public LiveFollowExtParams$a b(String p0){
       this.d = p0;
       return this;
    }
    public LiveFollowExtParams$a c(String p0){
       this.g = p0;
       return this;
    }
    public LiveFollowExtParams$a d(String p0){
       this.i = p0;
       return this;
    }
    public LiveFollowExtParams$a e(String p0){
       this.b = p0;
       return this;
    }
    public LiveFollowExtParams$a f(int p0){
       this.a = p0;
       return this;
    }
}
