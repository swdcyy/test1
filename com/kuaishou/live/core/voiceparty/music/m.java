package com.kuaishou.live.core.voiceparty.music.m;
import java.lang.String;
import java.lang.Object;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import brd.t;
import q21.b0;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import z12.e;
import com.kuaishou.live.core.voiceparty.music.m$a;
import java.lang.Runnable;
import ok.h;
import java.lang.StringBuilder;
import bs2.b;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.MusicType;
import cjd.e;
import erd.o;
import tt2.y;
import java.util.Objects;
import tt2.x;

public class m	// class@0017e0
{
    public final String a;
    public boolean b;
    public final a c;
    public boolean d;

    public void m(String p0){
       super();
       this.b = false;
       this.c = new a();
       this.d = false;
       this.a = p0;
    }
    public void a(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "2")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       LiveVoicePartyApi.b().e(p0, p1, p2).subscribe(b0.b, e.b);
       this.b = false;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c(this.a, "disableOrderAndCancelRequest", stringArray);
       this.d(0);
       this.c.d();
       return;
    }
    public void c(m$a p0,Runnable p1,h p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "1")) {
          return;
       }
       int i = 0;
       if (this.d == null) {
          String[] stringArray = new String[i];
          e.c(this.a, "orderMusic is disabled, music:"+p0, stringArray);
          return;
       }else {
          String[] stringArray1 = new String[i];
          e.c(this.a, "orderMusic: "+p0, stringArray1);
          p0 = p0.d;
          Objects.requireNonNull(p2);
          this.c.c(LiveVoicePartyApi.c().w(p0.a, p0.b, p0.c, p0.mId, p0.mType.mValue).map(new e()).subscribe(new y(this, p1), new x(p2)));
          return;
       }
    }
    public void d(boolean p0){
       this.d = p0;
    }
}
