package com.yxcorp.gifshow.growth.home.pymk.widget.a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.home.pymk.widget.a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.yxcorp.gifshow.growth.home.pymk.widget.a$e;
import java.util.Objects;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.View;
import android.animation.ValueAnimator;
import wna.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import wna.e;
import android.animation.Animator$AnimatorListener;

public class a$a implements Runnable	// class@0013ab
{
    public final ArrayList b;
    public final a c;

    public void a$a(a p0,ArrayList p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       int i4;
       boolean b1;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, a$a.class, "1")) {
          return;
       }
       Iterator iterator = obj.b.iterator();
       while (iterator.hasNext()) {
          a$e uoe = iterator.next();
          a$a c = obj.c;
          a$e a = uoe.a;
          a$e b = uoe.b;
          a$e c1 = uoe.c;
          a$e d = uoe.d;
          uoe = uoe.e;
          Objects.requireNonNull(c);
          a uoa = a.class;
          int i = 1;
          int i1 = 2;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray = new Object[5];
             objArray[0] = a;
             objArray[i] = Integer.valueOf(b);
             objArray[i1] = Integer.valueOf(c1);
             objArray[3] = Integer.valueOf(d);
             objArray[4] = Integer.valueOf(uoe);
             if (PatchProxy.applyVoid(objArray, c, uoa, "7")) {
                continue ;
             }
          }
          RecyclerView$ViewHolder itemView = a.itemView;
          int i2 = d - b;
          int i3 = uoe - c1;
          c.p.add(a);
          if (i2 < 0) {
             i4 = n.z(a.b()) / i1;
             if (d < i4) {
             label_008a :
                b1 = true;
             label_008f :
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[i1]{0x3f800000,0});
                b uob = new b(itemView, i2, itemView.getTranslationX(), b1, itemView.getScaleX(), itemView.getScaleY(), itemView.getAlpha());
                valueAnimato.setDuration(500).addUpdateListener(c1);
                e uoe1 = new e(c, a, i2, itemView, i3);
                valueAnimato.addListener(i1);
                valueAnimato.start();
             }
          }else {
             int i5 = d + itemView.getWidth();
             i4 = n.z(a.b()) / i1;
             if (i5 > i4) {
                goto label_008a ;
             }
          }
          b1 = false;
          goto label_008f ;
       }
       obj.b.clear();
       obj.c.m.remove(obj.b);
       return;
    }
}
