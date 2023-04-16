package com.yxcorp.gifshow.util.Edge2EdgeHelperKt$adaptEdge2Edge$1$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.View;
import a2.l;
import lnc.f3;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;
import p1.b;

public final class Edge2EdgeHelperKt$adaptEdge2Edge$1$1 extends Lambda implements q	// class@001ee9
{
    public static final Edge2EdgeHelperKt$adaptEdge2Edge$1$1 INSTANCE;

    static {
       Edge2EdgeHelperKt$adaptEdge2Edge$1$1.INSTANCE = new Edge2EdgeHelperKt$adaptEdge2Edge$1$1();
    }
    public void Edge2EdgeHelperKt$adaptEdge2Edge$1$1(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2);
       return l1.a;
    }
    public final void invoke(View p0,l p1,f3 p2){
       a.p(p0, "v");
       a.p(p1, "insets");
       a.p(p2, "padding");
       p0.setPadding(p0.getPaddingLeft(), p0.getPaddingTop(), p0.getPaddingRight(), (p2.a() + p1.f(2).d));
    }
}
