package com.yxcorp.gifshow.profile.collect.fragment.CollectionTemplateFragment$a;
import qvb.q;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionTemplateFragment;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class CollectionTemplateFragment$a implements q	// class@0012ac
{
    public final CollectionTemplateFragment b;

    public void CollectionTemplateFragment$a(CollectionTemplateFragment p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(CollectionTemplateFragment$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, CollectionTemplateFragment$a.class, "1")) {
          return;
       }
       if (p0 && this.b.q() != null) {
          CollectionTemplateFragment$a tb = this.b;
          tb.K = tb.q().getCount();
       }
       return;
    }
}
