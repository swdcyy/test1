package com.kuaishou.live.effect.resource.download.common.c;
import com.kuaishou.live.effect.resource.download.common.c$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class c	// class@001b32
{
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final int l;

    public void c(c$a p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
       this.l = p0.l;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveEffectResourceEnvRecord{effectDirFolder=\'"+this.a+'''+", effectDirFileNum="+this.b+", needDownloadResourceNum="+this.c+", resourceListTotalNum="+this.d+", effectDirCacheHitNum="+this.e+", effectUselessFileNum="+this.f+", effectFolderLeftDiskSize="+this.g+", availableInnerDiskSize="+this.h+", totalInnerDiskSize="+this.i+", availableExterDiskSize="+this.j+", totalExterDiskSize="+this.k+", from="+this.l+'}';
    }
}
