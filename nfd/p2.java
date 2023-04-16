package nfd.p2;
import jd.a;
import com.yxcorp.plugin.search.entity.CoordinateCropPosition;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ta.d;
import java.lang.StringBuilder;
import android.graphics.Bitmap;
import sc.d;
import com.facebook.common.references.a;

public class p2 extends a	// class@001df1
{
    public float c;
    public float d;
    public float e;
    public float f;

    public void p2(CoordinateCropPosition p0){
       super();
       this.c = p0.mX1_ratio;
       this.d = p0.my1_ratio;
       this.e = p0.mX2_ratio;
       this.f = p0.my2_ratio;
    }
    public CacheKey a(){
       Object obj = PatchProxy.apply(null, this, p2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d("SearchPhotoCoverCropPostProcessor_"+this.c+"_"+this.d+"_"+this.e+"_"+this.f);
    }
    public a b(Bitmap p0,d p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, p2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int width = p0.getWidth();
       int height = p0.getHeight();
       p2 tc = this.c;
       float f = (float)width;
       int i = (int)(tc * f);
       p2 td = this.d;
       float f1 = (float)height;
       int i1 = (int)(td * f1);
       int i2 = (int)((this.e - tc) * f);
       int i3 = (int)((this.f - td) * f1);
       a uoa = ((i2 + i) <= width && (i3 + i1) <= height)? p1.f(p0, i, i1, i2, i3): p1.e(p0);
       a.f(uoa);
       return a.d(uoa);
    }
    public String getName(){
       return "SearchPhotoCoverCropPostProcessor";
    }
}
