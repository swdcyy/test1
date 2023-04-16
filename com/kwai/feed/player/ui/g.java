package com.kwai.feed.player.ui.g;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import i2b.a;
import b56.d0;
import android.view.View$OnClickListener;
import com.kwai.feed.player.ui.g$a;
import java.util.Iterator;
import java.util.Set;
import b56.e0;
import a56.c;

public abstract class g	// class@0014c0
{
    public View a;
    public ViewGroup b;
    public final e c;
    public int d;
    public final Set e;

    public void g(ViewGroup p0){
       super();
       this.e = new HashSet();
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          View view = a.d(p0.getContext(), R.layout.arg_RES_7f0d08d9, p0, false);
          this.a = view;
          p0.addView(view);
          this.b = this.a.findViewById(0x7f0a45f1);
       }
       this.a.setVisibility(8);
       this.a();
       this.a.setOnClickListener(new d0(this));
       this.c = new g$a(this, this.b);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.a);
       }
       return;
    }
    public abstract void b(c p0);
    public abstract void c();
    public abstract void d();
}
