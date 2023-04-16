package com.yxcorp.gifshow.growth.kwaibubble.KwaiBubbleManager$a;
import qn.l;
import com.yxcorp.gifshow.growth.kwaibubble.model.KemKwaiBubbleDialogModel;
import java.lang.Object;
import rn.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qn.k;
import i89.f;
import i89.e;
import brd.t;
import crd.b;

public final class KwaiBubbleManager$a implements l	// class@00141c
{
    public final KemKwaiBubbleDialogModel a;

    public void KwaiBubbleManager$a(KemKwaiBubbleDialogModel p0){
       this.a = p0;
       super();
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBubbleManager$a.class, "1")) {
          return;
       }
       a.p(p0, "pop");
       k.d(this, p0);
       e.a().b(this.a.getActivityId()).subscribe();
       return;
    }
    public void d(a p0){
       k.a(this, p0);
    }
    public void e(a p0){
       k.c(this, p0);
    }
    public void f(a p0,int p1){
       k.b(this, p0, p1);
    }
}
