package com.yxcorp.gifshow.init.module.EmojiInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import pxa.e;
import q87.c;
import sxa.g;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import android.app.Activity;
import android.os.Bundle;
import sxa.f;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import c60.a;
import com.lsjwzh.fonts.a;
import wkd.b;
import rnc.e;
import java.util.Objects;
import com.yxcorp.utility.Log;
import java.lang.StringBuilder;
import j80.c;
import java.io.File;
import rnc.i;
import rnc.l;

public class EmojiInitModule extends TTIInitModule	// class@001979
{
    public boolean q;
    public boolean r;
    public static final int s;

    public void EmojiInitModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, EmojiInitModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(EmojiInitModule.class, "5");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, EmojiInitModule.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("EmojiInit", "onLaunchFinish", objArray);
       e.g(new g(this), "EmojiInitModule");
       PatchProxy.onMethodExit(EmojiInitModule.class, "1");
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, EmojiInitModule.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoidWithListener(null, this, EmojiInitModule.class, "3")) {
          n.a(new f(this));
          PatchProxy.onMethodExit(EmojiInitModule.class, "3");
       }
       PatchProxy.onMethodExit(EmojiInitModule.class, "2");
       return;
    }
    public final void n0(){
       if (PatchProxy.applyVoidWithListener(null, this, EmojiInitModule.class, "4")) {
          return;
       }
       if (this.q == null) {
          Object[] objArray = new Object[0];
          e.C().w("EmojiCompat", "injectFontsDownloader", objArray);
          a.a = new a();
          this.q = true;
       }
       e uoe = b.a(0x712fffa4);
       Objects.requireNonNull(uoe);
       Log.g("EmojiCompat", "init");
       uoe.a(0);
       PatchProxy.onMethodExit(EmojiInitModule.class, "4");
       return;
    }
    public final void o0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, EmojiInitModule.class, "6")) {
          return;
       }
       if (this.r == null) {
          this.r = true;
          String str = PatchProxy.applyWithListener(objArray, objArray, EmojiInitModule.class, "7");
          if (str != PatchProxyResult.class) {
          }else {
             String separator = File.separator;
             str = b.a(-1504323719).k()+separator+".emoji"+separator;
             PatchProxy.onMethodExit(EmojiInitModule.class, "7");
          }
          l.b = str;
       }
       PatchProxy.onMethodExit(EmojiInitModule.class, "6");
       return;
    }
}
