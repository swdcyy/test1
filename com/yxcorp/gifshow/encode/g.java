package com.yxcorp.gifshow.encode.g;
import com.yxcorp.gifshow.encode.i$b;
import com.yxcorp.gifshow.encode.i;
import java.lang.Object;
import pca.k;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import gq.a;
import java.lang.StringBuilder;
import q87.c;

public class g implements i$b	// class@000d1f
{
    public final i$b a;
    public final i b;

    public void g(i p0,i$b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onComplete(){
       k.a(this);
    }
    public void onError(Throwable p0){
       k.b(this, p0);
    }
    public void onProgress(double p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, og, "1")) {
          return;
       }
       g tb = this.b;
       i c = tb.c;
       int i = (int)((100.00f * p0) * (double)c);
       int i1 = (int)((((float)tb.d * c) * 100.00f) + (float)i);
       StringBuilder str = "exportVideos currentExportProgress: "+i;
       Object[] objArray = new Object[0];
       a.D().s("AssetExportManager", str+", currentTotalProgress: "+i1+", mProgressRatio: "+this.b.c+", progress: "+p0, objArray);
       if (i1 >= 100) {
          i1 = 100;
       }
       g ta = this.a;
       if (ta != null) {
          ta.onProgress((double)i1);
       }
       return;
    }
}
