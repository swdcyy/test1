package com.yxcorp.gifshow.camerasdk.j$h;
import com.kwai.camerasdk.render.VideoViewListener;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qi9.w0;
import java.lang.Runnable;
import ekd.k1;

public class j$h implements VideoViewListener	// class@001021
{
    public final j b;

    public void j$h(j p0){
       this.b = p0;
       super();
    }
    public void onPreviewSizeChange(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(j$h.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, j$h.class, "1")) {
          return;
       }
       w0 ow0 = new w0(this, p0, p1, p2, p3);
       k1.o(v0);
       return;
    }
}
