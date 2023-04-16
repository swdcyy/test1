package com.feature.post.bridge.z0;
import erd.o;
import com.feature.post.bridge.jsmodel.JsSaveImageParams;
import android.app.Activity;
import java.lang.Object;
import zq8.a;
import mg.l4;
import io.reactivex.g;
import brd.t;

public final class z0 implements o	// class@0014e1
{
    public final JsSaveImageParams b;
    public final Activity c;

    public void z0(JsSaveImageParams p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       return t.create(new l4(this.b, this.c));
    }
}
