package com.yxcorp.gifshow.comment.presenter.global.i$a;
import qvb.q;
import com.yxcorp.gifshow.comment.presenter.global.i;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import fk9.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;

public class i$a implements q	// class@0010fa
{
    public final i b;

    public void i$a(i p0){
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
       i$a tb;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!p0) {
          return;
       }
       if (this.b.p.g7() instanceof b) {
          tb = this.b;
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.apply(null, tb, i.class, "9");
          obj = (obj != PatchProxyResult.class)? obj.booleanValue(): tb.p.g7().u1();
          tb.A = obj ^ 0x01;
       }
       tb = this.b;
       if (tb.E != null && tb.A != null) {
          tb.R8();
       }
       return;
    }
}
