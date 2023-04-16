package com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import android.view.View;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.View$OnClickListener;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$b;
import java.lang.String;
import lnc.a1;

public class KwaiEmptyStateView$a	// class@000934
{
    public int a;
    public int b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public boolean h;
    public int i;
    public KwaiEmptyStateView$b j;
    public View$OnClickListener k;
    public View$OnClickListener l;

    public void KwaiEmptyStateView$a(){
       super();
       this.a = 0;
       this.b = -1;
       this.h = false;
       this.i = 1;
    }
    public KwaiEmptyStateView a(View p0){
       if (!p0 instanceof KwaiEmptyStateView) {
          return new KwaiEmptyStateView(p0.getContext());
       }
       KwaiEmptyStateView$a ta = this.a;
       if (ta > null) {
          p0.i(ta);
       }else {
          ta = this.c;
          if (ta != null) {
             p0.j(ta);
          }
       }
       if (!TextUtils.isEmpty(this.d)) {
          p0.h(this.d);
       }
       if (!TextUtils.isEmpty(this.e)) {
          p0.o(this.e);
       }
       if (!TextUtils.isEmpty(this.f)) {
          p0.l(this.f);
       }
       int i = 8;
       if (!TextUtils.isEmpty(this.g)) {
          ta = this.g;
          p0.e = ta;
          if (!TextUtils.isEmpty(ta)) {
             p0.u.setText(p0.e);
             p0.u.setVisibility(0);
             p0.c();
          }else {
             p0.u.setVisibility(i);
          }
       }
       ta = this.i;
       if (ta != 1) {
          p0.q(ta);
       }
       ta = this.k;
       if (ta != null) {
          p0.p(ta);
       }
       ta = this.j;
       if (ta != null) {
          ta.a(p0.s);
       }
       ta = this.l;
       if (ta != null) {
          p0.m(ta);
       }
       if (this.h != null) {
          p0.r.setVisibility(i);
          p0.c();
       }
       ta = this.b;
       if (ta != -1) {
          p0.d(ta);
       }
       return p0;
    }
    public KwaiEmptyStateView$a b(){
       this.i = 3;
       return this;
    }
    public KwaiEmptyStateView$a c(){
       this.i = 2;
       return this;
    }
    public KwaiEmptyStateView$a d(){
       this.h = true;
       return this;
    }
    public KwaiEmptyStateView$a e(int p0){
       this.f(a1.p(p0));
       return this;
    }
    public KwaiEmptyStateView$a f(CharSequence p0){
       this.e = p0;
       return this;
    }
    public KwaiEmptyStateView$a g(KwaiEmptyStateView$b p0){
       this.j = p0;
       return this;
    }
    public KwaiEmptyStateView$a h(int p0){
       this.i(a1.p(p0));
       return this;
    }
    public KwaiEmptyStateView$a i(CharSequence p0){
       this.d = p0;
       return this;
    }
    public KwaiEmptyStateView$a j(int p0){
       this.b = p0;
       return this;
    }
    public KwaiEmptyStateView$a k(int p0){
       this.a = p0;
       return this;
    }
    public KwaiEmptyStateView$a l(Drawable p0){
       this.c = p0;
       return this;
    }
    public KwaiEmptyStateView$a m(int p0){
       this.n(a1.p(p0));
       return this;
    }
    public KwaiEmptyStateView$a n(CharSequence p0){
       this.g = p0;
       return this;
    }
    public KwaiEmptyStateView$a o(View$OnClickListener p0){
       this.l = p0;
       return this;
    }
    public KwaiEmptyStateView$a p(View$OnClickListener p0){
       this.k = p0;
       return this;
    }
    public KwaiEmptyStateView$a q(int p0){
       this.i = p0;
       return this;
    }
}
