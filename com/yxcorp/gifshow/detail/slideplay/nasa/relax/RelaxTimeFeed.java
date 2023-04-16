package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.b;
import ok.h;
import kp.w1;
import com.kwai.robust.PatchProxyResult;
import p6a.o;
import java.util.Map;

public class RelaxTimeFeed extends BaseFeed	// class@0017b4
{
    public CommonMeta mCommonMeta;
    public RelaxTimeMeta mRelaxTimeMeta;
    public static final long serialVersionUID = 0x770acd453565a2c1;

    public void RelaxTimeFeed(){
       super();
    }
    public static PhotoType lambda$registerPhotoTypeProvider$0(BaseFeed p0){
       return PhotoType.RELAX_TIME;
    }
    public static void registerPhotoTypeProvider(){
       if (PatchProxy.applyVoidWithListener(null, null, RelaxTimeFeed.class, "1")) {
          return;
       }
       w1.u(RelaxTimeFeed.class, b.b);
       PatchProxy.onMethodExit(RelaxTimeFeed.class, "1");
       return;
    }
    public String getId(){
       return "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, RelaxTimeFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(RelaxTimeFeed.class, "2");
          return new o();
       }else {
          PatchProxy.onMethodExit(RelaxTimeFeed.class, "2");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefsWithListener(p0, this, RelaxTimeFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(RelaxTimeFeed.class, new o());
       }else {
          obj.put(RelaxTimeFeed.class, null);
       }
       PatchProxy.onMethodExit(RelaxTimeFeed.class, "3");
       return obj;
    }
}
