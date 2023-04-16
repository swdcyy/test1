package com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$isPostHomeRecoEnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Boolean;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$a;
import java.lang.Integer;

public final class PostEntranceEveManager	// class@00104e
{
    public static final p a;
    public static boolean b;
    public static final Object c;
    public static b d;
    public static final PostEntranceEveManager e;

    static {
       PostEntranceEveManager.e = new PostEntranceEveManager();
       PostEntranceEveManager.a = s.c(PostEntranceEveManager$isPostHomeRecoEnable$2.INSTANCE);
       PostEntranceEveManager.c = new Object();
    }
    public void PostEntranceEveManager(){
       super();
    }
    public final String a(CDNUrl[] p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PostEntranceEveManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = 0;
       if (p0 != null) {
          int i = (!p0.length)? 1: 0;
          if (!i) {
          label_001c :
             if (obj) {
                return p1;
             }else {
                return a.a.q(p0);
             }
          }
       }
       obj = 1;
       goto label_001c ;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, PostEntranceEveManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = PostEntranceEveManager.a.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean c(PostEntranceEveManager$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostEntranceEveManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.b() != null && (p0.c() != null && p0.a() != null)))? true: false;
       return b;
    }
}
