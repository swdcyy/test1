package com.yxcorp.gifshow.camera.record.album.a0;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.album.RecordAlbumActivity;
import pi9.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import tkd.b;
import tkd.d;
import ra0.d;
import com.yxcorp.gifshow.util.PostExperimentUtils;

public final class a0 implements Runnable	// class@001cae
{
    public static final a0 b;

    static {
       a0.b = new a0();
    }
    public void a0(){
       super();
    }
    public final void run(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, null, q.class, "2")) {
       }else {
          int i = 0;
          if (q.a()) {
             objArray = new Object[i];
             a.D().w("SmartAlbumUtils", "startAlbumGeneration", objArray);
             d.a(0x1bf6ff1d).S1();
          }else if(PostExperimentUtils.s1()){
             objArray = new Object[i];
             a.D().w("SmartAlbumUtils", "startAlbumGeneration startSceneAnalyze", objArray);
             d.a(0x1bf6ff1d).am();
          }
       }
       return;
    }
}
