package com.yxcorp.gifshow.home.block.topbar.view.BlockTabView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.home.block.topbar.view.BlockTabView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewParent;
import java.util.Objects;
import android.view.ViewGroup;
import usd.q;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import ura.o;
import java.lang.Math;
import android.view.View$MeasureSpec;
import com.yxcorp.gifshow.home.block.topbar.view.BlockTabView$b;
import java.lang.Runnable;
import java.lang.Boolean;

public final class BlockTabView extends FrameLayout	// class@00168c
{
    public int b;
    public static final BlockTabView$a c;

    static {
       BlockTabView.c = new BlockTabView$a(null);
    }
    public void BlockTabView(Context p0){
       super(p0, null);
    }
    public void BlockTabView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0, 0);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(BlockTabView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BlockTabView.class, "1")) {
          return;
       }
       ViewParent parent = this.getParent();
       Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
       o e = o.e;
       Context context = this.getContext();
       a.o(context, "context");
       Objects.requireNonNull(e);
       super.onMeasure(View$MeasureSpec.makeMeasureSpec(Math.max(((n.k(n.d(this)) - (e.a(context) * 2)) / q.u(parent.getChildCount(), 5)), o.a), 0x40000000), p1);
       if (a.g(parent.getChildAt(0), this)) {
          p0 = View$MeasureSpec.getSize(p0);
          if (this.b != p0) {
             this.b = p0;
             this.postOnAnimation(new BlockTabView$b(this));
          }
       }
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(BlockTabView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BlockTabView.class, "2")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? 0x3f000000: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
