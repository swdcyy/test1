package com.kuaishou.gifshow.kuaishan.model.KSLaunchParams$b;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams$a;

public class KSLaunchParams$b	// class@001a95
{
    public String a;
    public String b;
    public String c;
    public boolean d;
    public NearbyCommunityParams e;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public int j;
    public VideoContext k;
    public KSSource l;
    public boolean m;
    public boolean n;
    public MediaSceneLaunchParams o;
    public MediaSceneConfig p;
    public String q;
    public boolean r;
    public boolean s;

    public void KSLaunchParams$b(){
       super();
       this.a = "";
       this.b = "";
       this.d = true;
    }
    public KSLaunchParams a(){
       Object obj = PatchProxy.apply(null, this, KSLaunchParams$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KSLaunchParams(this, null);
    }
    public KSLaunchParams$b b(boolean p0){
       this.d = p0;
       return this;
    }
    public KSLaunchParams$b c(String p0){
       this.a = p0;
       return this;
    }
    public KSLaunchParams$b d(boolean p0){
       this.s = p0;
       return this;
    }
    public KSLaunchParams$b e(boolean p0){
       this.r = p0;
       return this;
    }
    public KSLaunchParams$b f(boolean p0){
       this.n = p0;
       return this;
    }
    public KSLaunchParams$b g(String p0){
       this.g = p0;
       return this;
    }
    public KSLaunchParams$b h(String p0){
       this.c = p0;
       return this;
    }
    public KSLaunchParams$b i(String p0){
       this.i = p0;
       return this;
    }
}
