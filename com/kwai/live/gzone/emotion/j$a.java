package com.kwai.live.gzone.emotion.j$a;
import zk5.a;
import y47.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.emotion.m$d;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import al5.a;
import com.kwai.live.gzone.emotion.m;

public class j$a extends a	// class@000ce3
{
    public ViewGroup e;
    public m$d f;
    public a g;

    public void j$a(a p0){
       super();
       this.g = p0;
    }
    public Object d(){
       m$d obj = PatchProxy.apply(null, this, j$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          obj = new m$d();
          this.f = obj;
          obj.b = this.e;
          obj.c = this.g;
       }
       return this.f;
    }
    public View e(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.e = p0;
       return a.c(LayoutInflater.from(p0.getContext()), 0x7f0d03f3, p0, false);
    }
    public a f(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m();
    }
}
