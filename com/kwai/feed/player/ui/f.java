package com.kwai.feed.player.ui.f;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import i2b.a;
import b56.a0;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feed.player.ui.e;
import b56.b0;
import a56.a;

public abstract class f	// class@0014be
{
    public List a;
    public View b;
    public ViewGroup c;
    public final e d;
    public int e;

    public void f(ViewGroup p0){
       f uof = f.class;
       super();
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "2")) {
       }else {
          View view = a.d(p0.getContext(), R.layout.arg_RES_7f0d08d8, p0, false);
          this.b = view;
          p0.addView(view);
          this.c = this.b.findViewById(0x7f0a45ec);
       }
       this.b.setVisibility(8);
       this.b.setOnClickListener(new a0(this));
       b0 uob0 = PatchProxy.apply(null, this, uof, "1");
       if (uob0 != PatchProxyResult.class) {
       }else {
          uob0 = new b0(this, this.c);
       }
       this.d = uob0;
       return;
    }
    public abstract void a(a p0);
    public abstract void b();
    public abstract void c();
}
