package com.yxcorp.gifshow.home.block.a;
import com.kwai.kcube.decorator.IContainerDecorator;
import java.lang.String;
import ura.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import br6.a;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import com.yxcorp.gifshow.home.block.topbar.appbar.GestureCollapseAppBarBehavior;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.kwai.kcube.ext.MvpDecoratorViewHolder;
import ura.j;
import ura.l;
import com.yxcorp.gifshow.home.block.topbar.appbar.FullHeightScrollingBehavior;
import z1.a;
import msd.a;
import ura.k;
import ura.n;
import ura.i;
import ura.m;
import nsd.u;

public class a extends IContainerDecorator	// class@001646
{
    public final int h;
    public final d i;
    public String j;

    public void a(String p0,int p1){
       super();
       this.i = new d();
       this.j = "Block_Decorator";
       this.j = p0;
       this.h = p1;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.i.b = this;
       return;
    }
    public List g(ViewGroup p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, uoa, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       MvpDecoratorViewHolder mvpDecorator = PatchProxy.applyOneRefs(p0, this, uoa, "3");
       if (mvpDecorator != patchProxyRe) {
       }else {
          View view = a.i(p0, R.layout.arg_RES_7f0d05bc);
          GestureCollapseAppBarBehavior gestureColla = 2;
          if (this.h == gestureColla) {
             view.getLayoutParams().o(new GestureCollapseAppBarBehavior(view.getContext()));
          }
          if (this.h == gestureColla) {
             view.getLayoutParams().o(new GestureCollapseAppBarBehavior(view.getContext()));
          }
          MvpDecoratorViewHolder mvpDecorator2 = new MvpDecoratorViewHolder(view, 0, new j(this), new l(this), null, false, new FullHeightScrollingBehavior());
       }
       obj.add(mvpDecorator);
       mvpDecorator = PatchProxy.applyOneRefs(p0, this, uoa, "5");
       if (mvpDecorator != patchProxyRe) {
       }else {
          mvpDecorator = new MvpDecoratorViewHolder(a.i(p0, 0x7f0d05be), 0, new k(this), new n(this));
       }
       obj.add(mvpDecorator);
       MvpDecoratorViewHolder mvpDecorator1 = PatchProxy.applyOneRefs(p0, this, uoa, "4");
       if (mvpDecorator1 != patchProxyRe) {
       }else {
          mvpDecorator = new MvpDecoratorViewHolder(a.i(p0, 0x7f0d05bd), 0, new i(this), new m(this), null, false, null, 64, null);
       }
       obj.add(mvpDecorator1);
       return obj;
    }
}
