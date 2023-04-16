package gib.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import boc.b;
import com.yxcorp.gifshow.util.resource.p;
import java.lang.StringBuilder;
import t16.a;
import com.yxcorp.gifshow.util.resource.n;

public final class a implements Runnable	// class@002aeb
{
    public final IMBeautyController b;

    public void a(IMBeautyController p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.b.j()) {
          c.g("IMBeautyController", "isResourceExist true.");
          return;
       }else if(this.b.f() == null){
          c.g("IMBeautyController", "lastConfig is null");
          return;
       }else {
          c.g("IMBeautyController", "lastConfig isn\'t null, auto download resource");
          Iterator iterator = this.b.g().iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (!p.h(uob)) {
                c.g("IMBeautyController", "need download "+uob);
                n.o(uob, new a("record", "inner_resource"));
             }else {
                c.g("IMBeautyController", "don\'t need download "+uob);
             }
          }
          return;
       }
    }
}
