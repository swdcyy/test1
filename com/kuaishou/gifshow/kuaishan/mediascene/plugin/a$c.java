package com.kuaishou.gifshow.kuaishan.mediascene.plugin.a$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class a$c implements g	// class@001a8f
{
    public static final a$c b;

    static {
       a$c.b = new a$c();
    }
    public void a$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          String message = p0.getMessage();
          if (message == null) {
             message = "";
          }
          PostUtils.D("MediaScenePluginImpl", message, p0);
       }
       return;
    }
}
