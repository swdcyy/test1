package com.kds.headertabscrollview.animation.CoordinatorAnimation;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import vsd.h;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import com.kds.headertabscrollview.animation.CoordinatorAnimation$animationController$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.view.View;
import kotlin.jvm.internal.a;
import ff.c;
import in.b;

public final class CoordinatorAnimation	// class@000713
{
    public static final n[] a;
    public static boolean b;
    public static final p c;
    public static final CoordinatorAnimation d;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(m0.d(CoordinatorAnimation.class), "animationController", "getAnimationController\(\)Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;"))};
       CoordinatorAnimation.a = onArray;
       CoordinatorAnimation.d = new CoordinatorAnimation();
       CoordinatorAnimation.c = s.c(CoordinatorAnimation$animationController$2.INSTANCE);
    }
    public void CoordinatorAnimation(){
       super();
    }
    public final void a(View p0,int p1,int p2,int p3,int p4){
       a.q(p0, "view");
       this.b().a(p0, p1, p2, p3, p4);
       if (p0 instanceof b) {
          p0.a();
       }
       return;
    }
    public final c b(){
       return CoordinatorAnimation.c.getValue();
    }
    public final boolean c(){
       return CoordinatorAnimation.b;
    }
}
