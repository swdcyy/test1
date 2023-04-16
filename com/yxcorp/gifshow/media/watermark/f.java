package com.yxcorp.gifshow.media.watermark.f;
import exc.o;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.media.watermark.g;
import nxc.b;
import com.yxcorp.gifshow.video.d$b;
import com.yxcorp.gifshow.media.watermark.d;
import com.yxcorp.gifshow.media.watermark.f$c;
import java.io.File;
import com.yxcorp.gifshow.video.d$c;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.media.watermark.VideoWatermarkTask;
import com.yxcorp.gifshow.media.watermark.f$b;
import com.yxcorp.gifshow.video.d$a;
import y6b.a;
import com.yxcorp.gifshow.media.watermark.f$a;

public class f implements o	// class@001d38
{

    public void f(){
       super();
    }
    public String LZ(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.e(p0);
    }
    public d$b Oa(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f$c(new d(p0));
    }
    public d$c Tm(File p0,int p1,boolean p2,boolean p3,String p4,String p5,User p6){
       Object obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),Boolean.valueOf(p3),p4,p5,p6};
          obj = PatchProxy.apply(objArray, this, uof, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoWatermarkTask videoWaterma = new VideoWatermarkTask(p0, p1, p2, p3, p4, p5, p6);
       return new f$b(this, obj);
    }
    public d$a WV(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f$a(this, new a());
    }
    public boolean isAvailable(){
       return true;
    }
}
