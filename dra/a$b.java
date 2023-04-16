package dra.a$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import fra.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fra.c;
import gra.m;
import gra.j;
import fra.a;
import gra.g;
import fra.g;
import gra.v;
import fra.e;
import gra.d;
import fra.d;
import gra.n;
import fra.f;
import gra.y;
import i2b.a;
import im8.c;
import kotlin.NoWhenBranchMatchedException;
import o07.n;

public final class a$b implements PopupInterface$f	// class@0024fd
{
    public PresenterV2 b;
    public final b c;

    public void a$b(b p0){
       a.p(p0, "callContext");
       super();
       this.c = p0;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a$b.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       PresenterV2 presenterV2 = new PresenterV2();
       this.b = presenterV2;
       a$b tc = this.c;
       int i = 0x7f0d0585;
       String str = "mPresenter";
       if (tc instanceof c) {
          presenterV2.U7(new m());
          a$b tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          tb.U7(new j());
          i = 0x7f0d0586;
       }else if(tc instanceof a){
          presenterV2.U7(new g());
       }else if(tc instanceof g){
          presenterV2.U7(new v());
          i = 0x7f0d058d;
       }else if(tc instanceof e){
          presenterV2.U7(new d());
       }else if(tc instanceof d){
          presenterV2.U7(new n());
          i = 0x7f0d0588;
       }else if(tc instanceof f){
          presenterV2.U7(new y());
          i = 0x7f0d058c;
       }else {
          throw new NoWhenBranchMatchedException();
       }
       boolean b = false;
       View view = a.g(p1, i, p2, b);
       a$b tb1 = this.b;
       if (tb1 == null) {
          a.S(str);
       }
       tb1.f(view);
       tb1 = this.b;
       if (tb1 == null) {
          a.S(str);
       }
       Object[] objArray = new Object[]{new c("GROWTH_VFC_DIALOG_CONTEXT", this.c),new c("GROWTH_VFC_DIALOG", p0)};
       tb1.i(objArray);
       a.o(view, "view");
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       n.a(this, p0);
       a$b tb = this.b;
       if (tb == null) {
          a.S("mPresenter");
       }
       tb.destroy();
       return;
    }
}
