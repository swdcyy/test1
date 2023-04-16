package com.yxcorp.gifshow.album.widget.preview.a;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import z1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.yxcorp.gifshow.album.widget.preview.a$a;
import r79.e;
import java.lang.Runnable;
import erd.g;
import crd.b;
import android.view.ViewGroup;
import android.view.View;

public abstract class a	// class@001b2a
{
    public KsAlbumVideoPlayerView a;
    public boolean b;
    public Map c;

    public void a(KsAlbumVideoPlayerView p0){
       super();
       this.c = new ConcurrentHashMap();
       this.a = p0;
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       Iterator iterator = this.c.values().iterator();
       while (iterator.hasNext()) {
          p0.accept(iterator.next());
       }
       return;
    }
    public abstract String b();
    public abstract double c();
    public abstract void d();
    public abstract boolean e();
    public abstract boolean f();
    public abstract b g(e p0,Runnable p1,g p2);
    public abstract View h(ViewGroup p0);
    public void i(){
    }
    public void j(){
    }
    public abstract void k();
    public abstract void l();
    public abstract void m();
    public abstract void n(double p0);
    public void o(boolean p0){
       this.b = p0;
    }
    public void p(String p0,a$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       if (p1 == null) {
          this.c.remove(p0);
       }else {
          this.c.put(p0, p1);
       }
       return;
    }
}
