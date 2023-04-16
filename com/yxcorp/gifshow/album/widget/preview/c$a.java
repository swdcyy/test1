package com.yxcorp.gifshow.album.widget.preview.c$a;
import erd.o;
import com.yxcorp.gifshow.album.widget.preview.c;
import w69.n0;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import brd.t;

public class c$a implements o	// class@001b2c
{
    public final n0 b;
    public final c c;

    public void c$a(c p0,n0 p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = this.b.a(p0);
       }
       return ot;
    }
}
