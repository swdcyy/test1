package mg.h3;
import erd.g;
import com.feature.post.bridge.y;
import com.kwai.feature.post.api.feature.bridge.JsPublishToMiddlePlatformParams;
import f55.g;
import java.lang.Object;
import exc.l;
import java.util.Objects;
import og.l;
import java.lang.String;
import q87.c;
import java.lang.Class;
import lnc.v7;
import o56.c;
import o56.a;
import xf6.l;
import java.util.List;
import java.util.Collections;
import mg.m3;
import mg.n3;
import exc.l$e;
import exc.l$a;
import exc.l$c;

public final class h3 implements g	// class@002607
{
    public final y b;
    public final JsPublishToMiddlePlatformParams c;
    public final g d;

    public void h3(y p0,JsPublishToMiddlePlatformParams p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       String str1;
       h3 oh3 = this;
       h3 b = oh3.b;
       h3 c = oh3.c;
       h3 d = oh3.d;
       l ol = p0;
       Objects.requireNonNull(b);
       Object[] objArray = new Object[0];
       String str = "PostBridgeModuleImpl";
       l.D().w(str, "publishToMiddlePlatform real call", objArray);
       if (!y.f) {
          str.r(l.class, null).YU();
          y.f = true;
       }
       JsPublishToMiddlePlatformParams subBiz = c.subBiz;
       if (a.a().c()) {
          str1 = l.g("KEY_CUSTOM_POST_MIDDLE_PLATFORM_URL", "");
          if (!str1.isEmpty()) {
          label_004a :
             ol.DF(subBiz, Collections.singletonList(str1), 0x300000, c.filePathList, c.bizCustomParam, new m3(b), new n3(b, d), c.photoMeta, c.content, c.caption).onStart();
             return;
          }
       }
       str1 = "http://api.kuaishouzt.com";
       goto label_004a ;
    }
}
