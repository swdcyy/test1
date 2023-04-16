package com.kwai.live.gzone.bridge.function.e;
import java.lang.Object;
import com.kwai.live.gzone.bridge.function.LiveGzoneThirdPlatformParams;
import f55.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u37.d;
import u37.e;
import fg6.a;
import com.google.gson.Gson;
import brd.t;
import cjd.e;
import erd.o;
import a47.d;
import a47.e;
import erd.g;
import crd.b;
import android.os.Bundle;

public class e	// class@000c8a
{

    public void e(){
       super();
    }
    public void a(LiveGzoneThirdPlatformParams p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       if (p0.mParams != null) {
          e.b().u(p0.mPlatform, a.a.q(p0.mParams)).map(new e()).subscribe(new d(p1), new e(p1));
       }else {
          p1.a(-1, "params error", null);
       }
       return;
    }
}
