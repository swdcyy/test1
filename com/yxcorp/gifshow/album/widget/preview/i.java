package com.yxcorp.gifshow.album.widget.preview.i;
import erd.g;
import com.yxcorp.gifshow.album.widget.preview.f;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o79.p;
import android.view.View;

public class i implements g	// class@001b3c
{
    public final ViewGroup b;
    public final f c;

    public void i(f p0,ViewGroup p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          p.a.a(p0.intValue(), this.b);
       }
       return;
    }
}
