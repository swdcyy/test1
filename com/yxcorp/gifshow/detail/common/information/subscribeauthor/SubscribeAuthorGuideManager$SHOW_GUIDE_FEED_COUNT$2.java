package com.yxcorp.gifshow.detail.common.information.subscribeauthor.SubscribeAuthorGuideManager$SHOW_GUIDE_FEED_COUNT$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.detail.model.SubscribeAuthorConfig;
import java.lang.reflect.Type;
import uw9.c;
import com.yxcorp.gifshow.detail.model.SnackBarConfig;
import java.lang.Integer;

public final class SubscribeAuthorGuideManager$SHOW_GUIDE_FEED_COUNT$2 extends Lambda implements a	// class@001454
{
    public static final SubscribeAuthorGuideManager$SHOW_GUIDE_FEED_COUNT$2 INSTANCE;

    static {
       SubscribeAuthorGuideManager$SHOW_GUIDE_FEED_COUNT$2.INSTANCE = new SubscribeAuthorGuideManager$SHOW_GUIDE_FEED_COUNT$2();
    }
    public void SubscribeAuthorGuideManager$SHOW_GUIDE_FEED_COUNT$2(){
       super(0);
    }
    public final int invoke(){
       SubscribeAuthorConfig obj = PatchProxy.apply(null, this, SubscribeAuthorGuideManager$SHOW_GUIDE_FEED_COUNT$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = c.t(SubscribeAuthorConfig.class);
       if (obj != null) {
          SnackBarConfig snackBarConf = obj.b();
          if (snackBarConf != null) {
             snackBarConf = snackBarConf.mNewFollowTriggerCount;
          label_0026 :
             return snackBarConf;
          }
       }
       int i = 5;
       goto label_0026 ;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
