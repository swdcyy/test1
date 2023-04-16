package com.kuaishou.merchant.home2.dynamic.HomeTabView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.merchant.home2.dynamic.HomeTabView$a;
import android.view.View$OnLayoutChangeListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;
import com.kuaishou.merchant.home2.dynamic.HomeTabView$b;
import java.lang.Runnable;
import ekd.k1;

public final class HomeTabView extends FrameLayout	// class@001704
{
    public TextView b;
    public TextView c;
    public boolean d;
    public Long e;
    public String f;
    public HashMap g;

    public void HomeTabView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void HomeTabView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void HomeTabView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = "";
       View view = a.e(this, R.layout.arg_RES_7f0d05ed);
       this.addView(view);
       this.b = m1.f(view, 0x7f0a3caa);
       this.c = m1.f(view, 0x7f0a3c7b);
       view.addOnLayoutChangeListener(new HomeTabView$a(this));
    }
    public void HomeTabView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, HomeTabView.class, "1")) {
          return;
       }
       HomeTabView te = this.e;
       if (te != null) {
          a.m(te);
          if (te.longValue() - null > 0 && this.d == null) {
             te = this.c;
             Rect obj = PatchProxy.applyOneRefs(te, this, HomeTabView.class, "2");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                obj = new Rect();
                this.getHitRect(obj);
                b = te.getLocalVisibleRect(obj);
             }
             if (b) {
                this.d = true;
                HomeTabView te1 = this.e;
                a.m(te1);
                k1.s(new HomeTabView$b(this), this.f, te1.longValue());
             }
          }
       }
       return;
    }
}
