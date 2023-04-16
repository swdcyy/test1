package com.yxcorp.gifshow.activity.share.presenter.m2$j;
import ub.a;
import com.yxcorp.gifshow.activity.share.presenter.m2;
import com.yxcorp.gifshow.activity.share.presenter.l2;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.callercontext.a;

public class m2$j extends a	// class@00140c
{
    public a b;
    public final m2 c;

    public void m2$j(m2 p0){
       this.c = p0;
       super();
    }
    public void m2$j(m2 p0,l2 p1){
       super(p0);
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
    }
    public void onSubmit(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m2$j.class, "1")) {
          return;
       }
       if (p1 instanceof a) {
          this.b = p1;
       }
       return;
    }
}
