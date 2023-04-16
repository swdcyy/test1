package com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$b;
import y8c.g;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$c;
import kotlin.Pair;
import ml8.c;

public final class ForwardGridSectionRefactorFragment$b extends g	// class@001cd7
{
    public Pair w;
    public final ForwardGridSectionRefactorFragment x;

    public void ForwardGridSectionRefactorFragment$b(ForwardGridSectionRefactorFragment p0){
       this.x = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       ForwardGridSectionRefactorFragment$b uob = ForwardGridSectionRefactorFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d048e), new ForwardGridSectionRefactorFragment$c(this.x, this.w));
    }
    public final void r1(Pair p0){
       this.w = p0;
    }
}
