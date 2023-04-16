package com.yxcorp.gifshow.init.module.EmotionPluginInitModule$4;
import ak5.a$c;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.resource.Category;
import wkd.b;
import j80.c;
import java.io.File;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Application;
import o56.a;

public class EmotionPluginInitModule$4 implements a$c	// class@00197d
{
    public final EmotionPluginInitModule a;

    public void EmotionPluginInitModule$4(EmotionPluginInitModule p0){
       this.a = p0;
       super();
    }
    public String a(){
       String obj = PatchProxy.applyWithListener(null, this, EmotionPluginInitModule$4.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Category.MESSAGE_EMOJI.getUnzipDir();
       PatchProxy.onMethodExit(EmotionPluginInitModule$4.class, "3");
       return obj.substring(0, (obj.length() - 1));
    }
    public String b(){
       Object obj = PatchProxy.applyWithListener(null, this, EmotionPluginInitModule$4.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(EmotionPluginInitModule$4.class, "5");
       return b.a(-1504323719).o().getAbsolutePath();
    }
    public String c(){
       Object obj = PatchProxy.applyWithListener(null, this, EmotionPluginInitModule$4.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(EmotionPluginInitModule$4.class, "2");
       return QCurrentUser.me().getAvatar();
    }
    public String d(){
       Object obj = PatchProxy.applyWithListener(null, this, EmotionPluginInitModule$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(EmotionPluginInitModule$4.class, "1");
       return QCurrentUser.me().getId();
    }
    public String e(){
       Object obj = PatchProxy.applyWithListener(null, this, EmotionPluginInitModule$4.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(EmotionPluginInitModule$4.class, "4");
       return new File(a.b().getFilesDir(), "emotionsdk").getAbsolutePath();
    }
}
