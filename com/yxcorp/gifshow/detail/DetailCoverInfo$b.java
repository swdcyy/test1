package com.yxcorp.gifshow.detail.DetailCoverInfo$b;
import java.lang.Object;
import com.yxcorp.gifshow.detail.DetailCoverInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.DetailCoverInfo$a;

public final class DetailCoverInfo$b	// class@001333
{
    public float a;
    public String b;
    public String c;
    public String d;
    public int e;

    public void DetailCoverInfo$b(){
       super();
    }
    public DetailCoverInfo a(){
       Object obj = PatchProxy.apply(null, this, DetailCoverInfo$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DetailCoverInfo(this, null);
    }
    public DetailCoverInfo$b b(int p0){
       this.e = p0;
       return this;
    }
    public DetailCoverInfo$b c(String p0){
       this.d = p0;
       return this;
    }
    public DetailCoverInfo$b d(String p0){
       this.b = p0;
       return this;
    }
    public DetailCoverInfo$b e(float p0){
       this.a = p0;
       return this;
    }
}
