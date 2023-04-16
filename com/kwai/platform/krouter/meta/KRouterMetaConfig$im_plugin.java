package com.kwai.platform.krouter.meta.KRouterMetaConfig$im_plugin;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wh7.b;
import java.util.ArrayList;
import java.util.List;
import rh7.a;
import wh7.c;

public class KRouterMetaConfig$im_plugin	// class@0012aa
{

    public void KRouterMetaConfig$im_plugin(){
       super();
    }
    public static void init(){
       if (PatchProxy.applyVoid(null, null, KRouterMetaConfig$im_plugin.class, "1")) {
          return;
       }
       b uob = new b("notice/push", "com.yxcorp.gifshow.message.notice.push.NoticePushHandler", new ArrayList(), null, "im_plugin");
       c.c("notice/push", v0);
       return;
    }
}
