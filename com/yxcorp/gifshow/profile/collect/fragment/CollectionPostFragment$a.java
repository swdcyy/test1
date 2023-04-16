package com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment$a;
import qvb.q;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.a;
import qvb.n0;
import java.util.Objects;
import android.view.View;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class CollectionPostFragment$a implements q	// class@0012a2
{
    public final CollectionPostFragment b;

    public void CollectionPostFragment$a(CollectionPostFragment p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p0.W = -1;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       CollectionPostFragment$a tb;
       CollectionPostFragment$a uoa = CollectionPostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0) {
          tb = this.b;
          tb.W = tb.V.getCount();
       }
       CollectionPostFragment v = this.b.V;
       if (v != null && v.hasMore()) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, CollectionPostFragment.class, "35")) {
             View view = tb.Kh();
             if (view != null) {
                view.setVisibility(8);
                if (tb.ia() != null && tb.ia().T0(view)) {
                   tb.ia().l1(view);
                }
             }
          }
       }
       return;
    }
}
