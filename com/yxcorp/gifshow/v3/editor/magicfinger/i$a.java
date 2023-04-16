package com.yxcorp.gifshow.v3.editor.magicfinger.i$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.editor.magicfinger.i;
import com.yxcorp.gifshow.v3.editor.magicfinger.model.MagicFingerItem;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.v3.editor.magicfinger.i$b;

public class i$a extends m	// class@001032
{
    public final int c;
    public final MagicFingerItem d;
    public final i e;

    public void i$a(i p0,int p1,MagicFingerItem p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(View p0){
       i i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       i$a te = this.e;
       i$a tc = this.c;
       Objects.requireNonNull(te);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tc), te, oi, "6")) {
          oi = te.g;
          te.g = tc;
          te.h = false;
          int i1 = 1;
          if (oi >= null && oi < te.getItemCount()) {
             te.m0(oi, Integer.valueOf(i1));
          }
          oi = te.g;
          if (oi >= null && oi < te.getItemCount()) {
             te.m0(te.g, Integer.valueOf(i1));
          }
       }
    label_0051 :
       i = this.e.i;
       if (i != null) {
          i.a(this.d, this.c);
       }
       return;
    }
}
