package com.kuaishou.live.gzone.barrage.BarrageView$a;
import ekd.b;
import com.kuaishou.live.gzone.barrage.BarrageView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import android.os.SystemClock;
import java.lang.Math;
import java.util.Iterator;
import com.kuaishou.live.gzone.barrage.BarrageView$d;
import pp.a;
import q87.c;
import z1.e;
import java.lang.Integer;
import java.util.Objects;
import com.kuaishou.live.gzone.barrage.BarrageView$f;
import android.util.SparseArray;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import android.animation.AnimatorSet;
import android.view.animation.OvershootInterpolator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import java.util.Queue;
import com.kuaishou.live.gzone.barrage.BarrageView$g;
import android.content.Context;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.widget.RelativeLayout;
import com.kuaishou.live.gzone.barrage.c;
import com.kuaishou.live.gzone.barrage.BarrageView$e;
import com.kuaishou.live.gzone.barrage.d;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.gzone.barrage.e;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView$b;
import com.kuaishou.live.gzone.barrage.a;
import android.view.View$OnTouchListener;
import android.view.View$OnLayoutChangeListener;
import com.lsjwzh.widget.text.FastTextView;
import com.kuaishou.live.gzone.barrage.BarrageView$h;
import com.kuaishou.live.common.core.component.comments.model.LiveGzoneInteractiveCommentMessage;
import android.text.SpannableStringBuilder;
import fz1.b;
import java.lang.CharSequence;
import com.kuaishou.live.gzone.barrage.b;

public class BarrageView$a extends b	// class@001c23
{
    public final BarrageView a;

    public void BarrageView$a(BarrageView p0,long p1){
       this.a = p0;
       super(p1);
    }
    public Object prepareData(long p0){
       ArrayList uArrayList;
       boolean i2;
       BarrageView$a uoa = BarrageView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uArrayList = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoa, "1");
          if (uArrayList != PatchProxyResult.class) {
          }
       }
       uArrayList = new ArrayList();
       SystemClock.elapsedRealtime();
       BarrageView c = this.a.c;
       _monitor_enter(c);
       BarrageView k = this.a.k;
       int i = 2;
       int i1 = 1;
       if (this.a.c.size() <= (this.a.k * 2)) {
          i2 = k / 2;
          if (!i2) {
             i2 = 1;
          }
          i2 = Math.min(i2, i);
       }
       Iterator iterator = this.a.c.iterator();
       while (true) {
          int i3 = 0;
          if (iterator.hasNext()) {
             BarrageView$d uod = iterator.next();
             uod.c = this.a.d(uod);
             long l = SystemClock.elapsedRealtime();
             if (this.a.h(uod, i2) >= 0) {
                iterator.remove();
                long l1 = SystemClock.elapsedRealtime() - l;
                if (l1 - 10 > 0) {
                   Object[] objArray = new Object[i];
                   objArray[i3] = "cost";
                   objArray[i1] = Long.valueOf(l1);
                   a.C().s("ks://BarrageView", "getAvailableLine", objArray);
                }
             }else {
             label_0095 :
                i2 = this.a.a();
                BarrageView$a ta = this.a;
                BarrageView h = ta.h;
                while (i3 < h.length) {
                   object oobject = h[i3];
                   object oobject1 = null;
                   if (i3 < ta.k) {
                      if (oobject != null && this.a.g(i3, oobject, i2)) {
                         uArrayList.add(new e(oobject, Integer.valueOf(i3)));
                         this.a.h[i3] = oobject1;
                      }
                   }else if(oobject != null){
                      this.a.c.add(oobject);
                      this.a.h[i3] = oobject1;
                   }
                   i3 = i3 + 1;
                }
                _monitor_exit(c);
             }
          }else {
             goto label_0095 ;
          }
       }
       return uArrayList;
    }
    public void run(long p0,Object p1){
       e a;
       Iterator iterator;
       Object[] objArray1;
       long l4;
       Object[] objArray2;
       BarrageView$a uoa = this;
       Iterator obj = p1;
       BarrageView$a uoa1 = BarrageView$a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), obj, uoa, uoa1, "2")) {
          long l = SystemClock.elapsedRealtime();
          int i = 2;
          boolean b = false;
          BarrageView uBarrageView = 10;
          if (!obj.isEmpty()) {
             obj = obj.iterator();
             while (obj.hasNext()) {
                e uoe = obj.next();
                a = uoe.a;
                if (a != null) {
                   uoe = uoe.b;
                   if (uoe != null) {
                      BarrageView$a a1 = uoa.a;
                      int i1 = uoe.intValue();
                      Objects.requireNonNull(a1);
                      if (!PatchProxy.isSupport(BarrageView.class) || !PatchProxy.applyVoidTwoRefs(a, Integer.valueOf(i1), a1, BarrageView.class, "21")) {
                         long l1 = SystemClock.elapsedRealtime();
                         if (!a1.g(i1, a, b)) {
                            long l2 = SystemClock.elapsedRealtime() - l1;
                            if (l2 - uBarrageView > 0) {
                               Object[] objArray = new Object[i];
                               objArray[b] = "cost";
                               objArray[1] = Long.valueOf(l2);
                               a.C().s("ks://BarrageView", "lineEnableInsert", objArray);
                            }
                         }else if(a instanceof BarrageView$f){
                            e uoe1 = a;
                            BarrageView$f g = uoe1.g;
                            LiveComboCommentView liveComboCom = a1.f.get(g);
                            if (liveComboCom != null) {
                               liveComboCom.setComboCommentMessage(uoe1.f);
                               LiveComboCommentView d = liveComboCom.d;
                               AnimatorSet uAnimatorSet = new AnimatorSet();
                               uAnimatorSet.setDuration(300);
                               uAnimatorSet.setInterpolator(new OvershootInterpolator());
                               uAnimatorSet.play(ObjectAnimator.ofFloat(d, View.SCALE_X, new float[i]{0x3fd9999a,0x3f800000})).with(ObjectAnimator.ofFloat(d, View.SCALE_Y, new float[i]{0x3fd9999a,0x3f800000}));
                               uAnimatorSet.start();
                               long l3 = SystemClock.elapsedRealtime() - l1;
                               if (l3 - 10 > 0) {
                                  objArray1 = new Object[i];
                                  objArray1[0] = "cost";
                                  objArray1[1] = Long.valueOf(l3);
                                  a.C().s("ks://BarrageView", "ComboCommentBarrage", objArray1);
                               }
                            }else {
                               BarrageView$g og = a1.e.poll();
                               if (og == null) {
                                  objArray1 = null;
                                  BarrageView$g og1 = PatchProxy.apply(objArray1, a1, BarrageView.class, "23");
                                  if (og1 != PatchProxyResult.class) {
                                     iterator = obj;
                                  }else {
                                     og1 = new BarrageView$g(objArray1);
                                     liveComboCom = new LiveComboCommentView(a1.getContext(), a1.z);
                                     og1.g = liveComboCom;
                                     iterator = obj;
                                     liveComboCom.setLayoutParams(new ViewGroup$LayoutParams(-2, a1.d(R.dimen.arg_RES_7f07060c)));
                                     og1.f = new c(a1, og1);
                                     ObjectAnimator objectAnimat = new ObjectAnimator();
                                     og1.e = objectAnimat;
                                     objectAnimat.setTarget(og1.g);
                                     og1.e.setProperty(View.TRANSLATION_X);
                                     og1.e.setInterpolator(null);
                                     og1.e.addListener(new d(a1, og1));
                                     og1.g.setOnCustomClickListener(new e(a1));
                                     a1.addView(og1.g);
                                  }
                                  og = og1;
                               }else {
                                  iterator = obj;
                               }
                               og.d = a.c;
                               if (og.g.getLayoutParams() == null) {
                                  og.g.setLayoutParams(a1.i);
                               }
                               og.h = g;
                               a1.f.put(g, og.g);
                               a1.g[i1] = og;
                               og.a = i1;
                               og.b = true;
                               og.g.setOnTouchListener(new a(a1, a));
                               og.g.setComboCommentMessage(uoe1.f);
                               BarrageView$d b1 = a.b;
                               if (b1 != null) {
                                  og.g.setBackgroundResource(b1);
                                  og.g.setTag(R.id.key_barrage_background, Integer.valueOf(a.b));
                               }
                               og.g.addOnLayoutChangeListener(og.f);
                               og.g.requestLayout();
                               l4 = SystemClock.elapsedRealtime() - l1;
                               if (l4 - 10 > 0) {
                                  objArray2 = new Object[]{"cost",Long.valueOf(l4)};
                                  a.C().s("ks://BarrageView", "comboBarrageHolder", objArray2);
                               label_02a7 :
                                  uoa = this;
                                  obj = iterator;
                                  i = 2;
                                  b = false;
                                  uBarrageView = 10;
                               }
                            }
                         }else {
                            iterator = obj;
                            BarrageView$e uoe2 = a1.d.poll();
                            if (uoe2 == null) {
                               uoe2 = a1.b();
                            }
                            a1.g[i1] = uoe2;
                            uoe2.a = i1;
                            boolean b2 = true;
                            uoe2.b = b2;
                            BarrageView i2 = a1.i;
                            if (uoe2.c.getLayoutParams() != i2) {
                               uoe2.c.setLayoutParams(i2);
                            }
                            uoe2.c.j(a1.r, b2);
                            if (a instanceof BarrageView$h) {
                               e uoe3 = a;
                               uoe2.c.setText(b.a(uoe3.e, a1.r, a1.s));
                               uoe2.c.setTag(R.id.key_barrage_interactive_comment_message, uoe3.e);
                            }else {
                               uoe2.c.setText(a.a);
                            }
                            uoe2.d = a.c;
                            uoe2.c.setOnTouchListener(new b(a1, a));
                            BarrageView$d b3 = a.b;
                            if (b3 != null) {
                               uoe2.c.setBackgroundResource(b3);
                               uoe2.c.setTag(R.id.key_barrage_background, Integer.valueOf(a.b));
                            }
                            uoe2.c.addOnLayoutChangeListener(uoe2.f);
                            uoe2.c.requestLayout();
                            l4 = SystemClock.elapsedRealtime() - l1;
                            if (l4 - 10 > 0) {
                               objArray2 = new Object[]{"cost",Long.valueOf(l4)};
                               a.C().s("ks://BarrageView", "barrageHolder", objArray2);
                               goto label_02a7 ;
                            }
                         }
                      }
                   }
                }
                iterator = obj;
                goto label_02a7 ;
             }
          }
          l4 = SystemClock.elapsedRealtime() - l;
          if (l4 - 10 > 0) {
             Object[] objArray3 = new Object[]{"cost",Long.valueOf(l4)};
             a.C().s("ks://BarrageView", "handleMessage", objArray3);
          }
       }
       return;
    }
}
