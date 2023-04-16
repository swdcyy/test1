package com.yxcorp.gifshow.album.widget.preview.c$h;
import erd.g;
import com.yxcorp.gifshow.album.widget.preview.c;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o79.p;
import android.view.View;

public class c$h implements g	// class@001b33
{
    public final ViewGroup b;
    public final c c;

    public void c$h(c p0,ViewGroup p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$h.class, "1")) {
       }else {
          p.a.a(p0.intValue(), this.b);
       }
       return;
    }
}
