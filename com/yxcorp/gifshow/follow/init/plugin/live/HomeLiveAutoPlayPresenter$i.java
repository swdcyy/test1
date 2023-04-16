package com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$i;
import s99.d;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import im8.f;
import io.reactivex.subjects.PublishSubject;
import tkd.b;
import tkd.d;
import os5.l;

public final class HomeLiveAutoPlayPresenter$i implements d	// class@0010c5
{
    public final HomeLiveAutoPlayPresenter a;

    public void HomeLiveAutoPlayPresenter$i(HomeLiveAutoPlayPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeLiveAutoPlayPresenter$i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "type");
       HomeLiveAutoPlayPresenter w = this.a.w;
       Boolean uBoolean = (w != null)? w.get(): null;
       if (a.g(uBoolean, Boolean.FALSE)) {
          w = this.a.G;
          if (w != null) {
             w.onNext("disable");
          }
          return true;
       }else {
          b uob = d.a(-1492894991);
          a.o(uob, "PluginManager.get\(LivePlugin::class.java\)");
          if (uob.h1()) {
             w = this.a.G;
             if (w != null) {
                w.onNext("floatingWindow");
             }
             return true;
          }else {
             return false;
          }
       }
    }
}
