package com.kuaishou.live.common.core.component.comments.item.voicecomment.b;
import k81.k;
import o81.g;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.b$b;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kf1.f;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.c;
import android.view.ViewGroup;
import g81.a;
import k81.h;
import android.content.Context;
import android.view.View;
import i2b.a;
import r81.c;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.b$a;
import android.view.GestureDetector$OnGestureListener;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.b$c;

public class b implements k	// class@0010ab
{
    public final g a;
    public GestureDetector b;
    public final b$b c;
    public final d d;
    public boolean e;

    public void b(g p0,b$b p1,d p2){
       super();
       this.e = false;
       this.a = p0;
       this.c = p1;
       this.d = p2;
       if (p2 instanceof a) {
          c uoc = PatchProxy.apply(null, this, b.class, "2");
          if (uoc != PatchProxyResult.class) {
          }else {
             uoc = new c(this);
          }
          p2.a = uoc;
       }
       return;
    }
    public h a(ViewGroup p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       View view = a.d(p0.getContext(), R.layout.arg_RES_7f0d0abe, p0, false);
       view.setBackground(this.a.d().a());
       this.b = new GestureDetector(view.getContext(), new b$a(this));
       return new b$c(this, view);
    }
}
