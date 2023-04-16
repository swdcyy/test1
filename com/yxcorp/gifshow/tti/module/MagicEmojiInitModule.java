package com.yxcorp.gifshow.tti.module.MagicEmojiInitModule;
import com.kwai.framework.init.TTIInitModule;
import com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hlc.f;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import com.yxcorp.gifshow.tti.module.d;

public class MagicEmojiInitModule extends TTIInitModule	// class@001dbe
{
    public static final int q;

    public void MagicEmojiInitModule(){
       super();
    }
    public static void onResourceConfigEvent(ResourceDownloadInitModule$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, MagicEmojiInitModule.class, "1")) {
          return;
       }
       c.b(new f(p0));
       return;
    }
    public int f0(){
       return 2;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, MagicEmojiInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmojiInitModule.class, "3")) {
          return;
       }
       c.d(d.b);
       return;
    }
}
