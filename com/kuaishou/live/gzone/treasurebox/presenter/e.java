package com.kuaishou.live.gzone.treasurebox.presenter.e;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.presenter.h;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import p53.q;
import com.kwai.robust.PatchProxyResult;
import k77.t;
import android.animation.AnimatorSet;
import k77.v;
import k77.t$b;
import java.util.ArrayList;
import k77.a;
import java.lang.Runnable;
import java.lang.Long;
import java.lang.Float;
import android.animation.ValueAnimator;
import k77.t$a;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator;
import k77.k;
import android.animation.Animator$AnimatorListener;
import k77.b;
import java.util.Iterator;
import pp.a;
import q87.c;

public final class e implements g	// class@001c7e
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Iterator this;
       Object[] objArray1;
       long[] olongArray1;
       ValueAnimator valueAnimato;
       float[] uofloatArray1;
       ArrayList uArrayList3;
       ValueAnimator valueAnimato2;
       e b = this.b;
       Objects.requireNonNull(b);
       if (p0.booleanValue()) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, b, h.class, "14")) {
             h x = b.X;
             if (x == null || x.size() <= 0) {
                x = b.W;
                q oq = new q(b);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                t ot = t.class;
                ArrayList uArrayList = PatchProxy.applyTwoRefs(x, oq, objArray, ot, "1");
                boolean b1 = false;
                if (uArrayList != patchProxyRe) {
                }else {
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   long[] olongArray = new long[6]{0,200,400,600,800,1200};
                   float[] uofloatArray = new float[6]{0,0x40c00000,0xc0000000,0x40800000,0,0};
                   v ov = new v(true, b1, x);
                   int i = 5;
                   ArrayList uArrayList1 = new ArrayList(i);
                   a uoa = new a(oq);
                   int i1 = 0;
                   int i2 = 4;
                   int i3 = 3;
                   while (i1 < i) {
                      int i4 = i1 + 1;
                      ArrayList uArrayList2 = uArrayList1;
                      long l = olongArray[i4] - olongArray[i1];
                      i1 = uofloatArray[i1];
                      i = uofloatArray[i4];
                      if (PatchProxy.isSupport(ot)) {
                         Object[] objArray2 = new Object[7];
                         objArray2[0] = Long.valueOf(l);
                         objArray2[1] = Float.valueOf(0x3f800000);
                         objArray2[2] = Float.valueOf(0x3f800000);
                         objArray2[i3] = Float.valueOf(i1);
                         objArray2[i2] = Float.valueOf(i);
                         objArray2[5] = ov;
                         objArray2[6] = uoa;
                         olongArray1 = olongArray;
                         valueAnimato = PatchProxy.apply(objArray2, null, ot, "2");
                         if (valueAnimato != patchProxyRe) {
                            uofloatArray1 = uofloatArray;
                            uArrayList3 = uArrayList2;
                            olongArray = null;
                         label_00f3 :
                            uArrayList3.add(valueAnimato);
                            uArrayList1 = uArrayList3;
                            i1 = i4;
                            olongArray = olongArray1;
                            uofloatArray = uofloatArray1;
                            i = 5;
                         }
                      }else {
                         olongArray1 = olongArray;
                         int i5 = 6;
                      }
                      t$b valueAnimato1 = new t$b();
                      t$b uob = new t$b();
                      uofloatArray1 = uofloatArray;
                      float f = 0x3f800000;
                      valueAnimato1.a.c(f, i1);
                      uob.a.c(f, i);
                      Object[] objArray3 = new Object[]{valueAnimato1,uob};
                      valueAnimato = ValueAnimator.ofObject(ov, objArray3);
                      valueAnimato.setDuration(l);
                      valueAnimato.addUpdateListener(uoa);
                      uArrayList3 = uArrayList2;
                      goto label_00f3 ;
                   }
                   ValueAnimator[] v this1 = new ValueAnimator[0];
                   uAnimatorSet.playSequentially(uArrayList1.toArray(this1));
                   uAnimatorSet.addListener(new k(uAnimatorSet));
                   this1 = new v(0, true, x);
                   t$b uob1 = new t$b();
                   uob1.b.c(0x3f800000, 5.00f);
                   uob1.c.c(0x3f800000, 0);
                   t$b uob2 = new t$b();
                   uob2.b.c(0x3f666666, 10.00f);
                   uob2.c.c(0x3f666666, -15.00f);
                   b uob3 = new b(oq);
                   if (PatchProxy.isSupport(ot)) {
                      objArray1 = new Object[]{Long.valueOf(600),uob1,uob2,this1,uob3};
                      valueAnimato2 = PatchProxy.apply(objArray1, null, ot, "3");
                      if (valueAnimato2 != patchProxyRe) {
                      label_0190 :
                         ArrayList this11 = new ArrayList(2);
                         this11.add(uAnimatorSet);
                         this11.add(valueAnimato2);
                         uArrayList = this11;
                      }
                   }else {
                      int i6 = 2;
                   }
                   objArray1 = new Object[]{uob1,uob2};
                   valueAnimato2 = ValueAnimator.ofObject(this1, objArray1);
                   valueAnimato2.setDuration(600);
                   valueAnimato2.setRepeatCount(-1);
                   valueAnimato2.setRepeatMode(2);
                   valueAnimato2.addUpdateListener(uob3);
                   goto label_0190 ;
                }
                b.X = uArrayList;
                this = uArrayList.iterator();
                while (this.hasNext()) {
                   objArray1 = new Object[0];
                   a.C().s("TreasureBoxV2StyleCell-", "startBoxReadyShakeAnimation: start", objArray1);
                   this.next().start();
                }
             }
          }
       }else {
          b.k9();
       }
       return;
    }
}
