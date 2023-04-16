package com.facebook.react.uimanager.j$l;
import com.facebook.react.uimanager.j$b0;
import com.facebook.react.uimanager.j;
import com.facebook.react.bridge.JavaOnlyArray;
import ze.y;
import ze.k0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ze.f;
import com.facebook.react.views.kdslist.KdsSyncRenderDataView;
import com.facebook.react.bridge.ReadableArray;

public final class j$l extends j$b0	// class@00135e
{
    public JavaOnlyArray e;
    public y f;
    public k0 g;
    public final j h;

    public void j$l(j p0,int p1,JavaOnlyArray p2,y p3,k0 p4){
       this.h = p0;
       super(p0, p1);
       this.e = p2;
       this.f = p3;
       this.g = p4;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, j$l.class, "1")) {
          return;
       }
       View view = this.h.b.p(this.a);
       if (view instanceof KdsSyncRenderDataView) {
          view.a(this.e, this.f, this.g);
       }
       return;
    }
}
