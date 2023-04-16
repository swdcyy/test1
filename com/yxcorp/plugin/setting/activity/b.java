package com.yxcorp.plugin.setting.activity.b;
import tyc.d3$b;
import com.yxcorp.plugin.setting.activity.AboutUsActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kz6.f$a;
import android.content.Context;
import java.lang.CharSequence;
import android.view.ViewGroup;
import i2b.a;
import ixc.c;
import lnc.pa;
import lnc.qa;
import android.widget.TextView;
import o56.a;
import zfd.g;
import java.util.concurrent.Callable;
import brd.t;
import t45.c;
import java.util.Objects;
import zfd.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.content.DialogInterface$OnClickListener;
import zfd.e;
import android.content.DialogInterface$OnDismissListener;
import kz6.f;

public class b implements d3$b	// class@00081e
{
    public final AboutUsActivity b;

    public void b(AboutUsActivity p0){
       this.b = p0;
       super();
    }
    public void v2(View p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       int i = 8;
       if (p1 >= i) {
          f$a uoa = new f$a(this.b);
          uoa.g("gifshow data");
          View view = a.c(this.b, R.layout.arg_RES_7f0d15cd, null);
          c uoc = qa.r(c.class);
          int i1 = 0x7f0a2a1c;
          if (uoc != null) {
             view.findViewById(i1).setText(String.valueOf(uoc.s9()));
          }else {
             view.findViewById(i1).setVisibility(i);
          }
          view.findViewById(R.id.channel).setText(a.k);
          TextView textView = view.findViewById(R.id.commit_id);
          Objects.requireNonNull(textView);
          f uof = new f(textView);
          uoa.h(view);
          uoa.f(R.string.arg_RES_7f103a83, null);
          uoa.d(new e(c.j(new g(this)).subscribe(uof, Functions.d())));
          uoa.i();
       }
       return;
    }
}
