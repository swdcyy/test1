package com.yxcorp.gifshow.util.Edge2EdgeHelper$adaptEdge2Edge$1;
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
import lnc.a1;
import usd.q;
import com.yxcorp.gifshow.util.Edge2EdgeHelper;

public final class Edge2EdgeHelper$adaptEdge2Edge$1 extends Lambda implements q	// class@001ee6
{
    public static final Edge2EdgeHelper$adaptEdge2Edge$1 INSTANCE;

    static {
       Edge2EdgeHelper$adaptEdge2Edge$1.INSTANCE = new Edge2EdgeHelper$adaptEdge2Edge$1();
    }
    public void Edge2EdgeHelper$adaptEdge2Edge$1(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2);
       return l1.a;
    }
    public final void invoke(View p0,l p1,f3 p2){
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "insets");
       a.p(p2, "<anonymous parameter 2>");
       b uob = p1.f(2);
       a.o(uob, "insets.getInsets\(KwaiWin¡­at.Type.navigationBars\(\)\)");
       boolean b = (uob.d <= q.n(a1.e(20.00f), 44))? true: false;
       Edge2EdgeHelper.a = b;
       return;
    }
}
