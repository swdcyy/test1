package com.yxcorp.gifshow.media.watermark.f$a;
import com.yxcorp.gifshow.video.d$a;
import com.yxcorp.gifshow.media.watermark.f;
import y6b.a;
import java.lang.Object;
import nxc.d;
import android.graphics.Bitmap;
import java.lang.String;
import com.yxcorp.gifshow.video.api.watermark.BitmapAlignType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;

public class f$a implements d$a	// class@001d34
{
    public final a a;
    public final f b;

    public void f$a(f p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public d a(){
       return this.a.a;
    }
    public Bitmap b(Bitmap p0,String p1,boolean p2,boolean p3,BitmapAlignType p4){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.a(p0, p1, p2, p3, p4);
    }
}
