package com.kuaishou.krn.page.c;
import android.view.ViewGroup;
import ik0.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kuaishou.krn.page.c$a;
import android.view.View$OnClickListener;
import com.kuaishou.krn.page.c$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.page.c$b;
import java.lang.Throwable;
import android.view.ViewParent;

public final class c	// class@000915
{
    public View a;
    public View b;
    public View c;
    public boolean d;
    public boolean e;
    public c$b f;

    public void c(ViewGroup p0,b p1){
       a.p(p0, "parent");
       super();
       this.a = p0.findViewById(0x7f0a1604);
       this.b = p0.findViewById(0x7f0a1609);
       this.c = p0.findViewById(0x7f0a1605);
       boolean b = true;
       this.d = b;
       this.e = b;
       if (p1 != null) {
          b = p1.c();
          this.d = b;
          if (b) {
             this.b = p1.a(p0, this.b);
          }
          b = p1.isErrorEnabled();
          this.e = b;
          if (b) {
             this.c = p1.b(p0, this.c);
          }
       }
       c tc = this.c;
       if (!tc instanceof KwaiEmptyStateView) {
          tc = null;
       }
       if (tc != null) {
          tc.p(new c$a(this));
       }
       this.f = new c$c();
       return;
    }
    public final View a(){
       return this.c;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       c tb = this.b;
       if (tb != null) {
          tb.setVisibility(8);
       }
       return;
    }
    public final void c(c$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "listener");
       this.f = p0;
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       c tc = this.c;
       int i = 8;
       if (tc != null) {
          tc.setVisibility(i);
       }
       tc = this.b;
       if (tc != null) {
          tc.setVisibility(i);
       }
       tc = this.a;
       if (tc != null) {
          tc.setVisibility(0);
       }
       return;
    }
    public final void e(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       c tf = this.f;
       c ta = this.a;
       ViewGroup viewGroup = null;
       ViewParent parent = (ta != null)? ta.getParent(): viewGroup;
       if (parent instanceof ViewGroup) {
          viewGroup = parent;
       }
       tf.b(viewGroup, p0);
       if (this.e == null) {
          return;
       }else {
          c ta1 = this.a;
          int i = 8;
          if (ta1 != null) {
             ta1.setVisibility(i);
          }
          ta1 = this.b;
          if (ta1 != null) {
             ta1.setVisibility(i);
          }
          ta1 = this.c;
          if (ta1 != null) {
             ta1.setVisibility(0);
          }
          return;
       }
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       c ta = this.a;
       int i = 8;
       if (ta != null) {
          ta.setVisibility(i);
       }
       ta = this.c;
       if (ta != null) {
          ta.setVisibility(i);
       }
       ta = this.b;
       if (ta != null) {
          ta.setVisibility(0);
       }
       return;
    }
}
