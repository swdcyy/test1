package com.yxcorp.gifshow.fragment.user.k;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.fragment.user.l;
import m8c.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k8c.a;
import q87.c;
import com.yxcorp.gifshow.fragment.user.l$b;

public class k extends m	// class@00128a
{
    public final e c;
    public final l d;

    public void k(l p0,e p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("LocalAlbumHolder", "lzx-option button clicked", objArray);
       k td = this.d;
       td.k.A2(this.c, td);
       return;
    }
}
