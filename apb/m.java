package apb.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.utils.g;
import android.view.ViewGroup;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$MusicState;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import com.kwai.library.widget.specific.misc.PlayBackView;
import android.widget.ImageView;
import apb.i;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import com.kwai.library.widget.specific.misc.SpectrumView;
import android.view.View;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.HashMap;
import jqb.c;
import java.lang.Boolean;
import a2.i0;
import apb.k;
import java.lang.Runnable;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import java.lang.Float;
import com.yxcorp.utility.n;
import android.util.Property;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import th0.n;
import apb.m$d;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import java.util.Collection;
import android.animation.AnimatorSet;
import kqb.d0;
import android.animation.PropertyValuesHolder;
import java.util.List;
import java.lang.CharSequence;
import java.util.Iterator;
import android.animation.ValueAnimator;
import kob.k;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.utility.TextUtils;
import android.text.TextPaint;
import apb.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import apb.f;
import th0.i;
import apb.g;
import apb.h;
import apb.c;
import apb.d;
import apb.n;
import java.util.Set;
import apb.m$a;
import apb.m$b;
import apb.m$c;
import ekd.m1;
import androidx.constraintlayout.widget.ConstraintLayout;
import apb.j;
import kob.n;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class m extends PresenterV2	// class@0002b3
{
    public LinearLayout A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public ViewGroup H;
    public ViewGroup I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public List N;
    public Set O;
    public CloudMusicHelper$MusicState P;
    public HashMap Q;
    public Music p;
    public CloudMusicHelper q;
    public int r;
    public int s;
    public n t;
    public BaseFragment u;
    public PlayBackView v;
    public SpectrumView w;
    public ImageView x;
    public ConstraintLayout y;
    public RelativeLayout z;
    public static final int R;
    public static final int S;
    public static final int T;

    static {
       m.R = a1.e(18.50f);
       m.S = a1.e(12.50f);
       m.T = a1.e(6.00f);
    }
    public void m(){
       super();
       this.J = false;
       this.O = new HashSet();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       boolean b = true;
       this.M = b;
       m ts = this.s;
       boolean b1 = false;
       boolean b2 = (ts != null && g.c(this.p, this.r, ts))? true: false;
       this.L = b2;
       this.v.setClickable(b1);
       ts = this.p;
       this.J = ts.isOriginal;
       CloudMusicHelper$MusicState musicState = this.q.j(ts.hashCode());
       if (!musicState.isIdle() && (musicState.isStop() || musicState.isCompleted())) {
          this.v.d();
          this.b9(b1);
          this.c9();
          this.S8(b1, (b ^ musicState.isIdle()));
       }else if(musicState.isPreparing()){
          this.v.b();
          this.c9();
       }else if(musicState.isPlaying() || musicState.isPause()){
          this.v.c();
          this.b9(b);
          this.c9();
          this.S8(b, musicState.isPlaying());
       }else if(musicState.isError()){
          this.v.d();
          this.b9(b1);
          this.c9();
          this.S8(b1, b1);
       }else {
          this.v.d();
          this.b9(b1);
          m tx = this.x;
          if (tx != null) {
             tx.setVisibility(8);
          }
          tx = this.P;
          if (tx != null && tx.isPlaying()) {
             this.S8(b1, b);
          }else {
             this.S8(b1, b1);
          }
       }
       this.P = musicState;
       this.A.setOnClickListener(new i(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, m.class, "5")) {
          return;
       }
       this.w.b();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       this.M = false;
       return;
    }
    public final int P8(View p0,int p1){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, om, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.Q == null) {
          this.Q = new HashMap();
       }
       if (this.Q.containsKey(Integer.valueOf(p0.getId()))) {
          return this.Q.get(Integer.valueOf(p0.getId())).intValue();
       }else {
          int i = 0;
          if (p0.getId() == 0x7f0a3b97) {
             i = 1;
          }else if(p0.getId() == 0x7f0a3b96){
             i = 2;
          }else if(p0.getId() == 0x7f0a3b98){
             i = 3;
          }
          p1 = p1 + (c.c * i);
          this.Q.put(Integer.valueOf(p0.getId()), Integer.valueOf(p1));
          return p1;
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, m.class, "25")) {
          return;
       }
       if (this.J != null) {
          m tI = this.I;
          if (tI != null) {
             tI.setTranslationX((float)(this.K * -1));
          }
       }
       return;
    }
    public final void S8(boolean p0,boolean p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, om, "9")) {
          return;
       }
       if (i0.Y(this.y)) {
          this.d9(p0, p1);
       }else {
          this.y.post(new k(this, p0, p1));
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, m.class, "26")) {
          return;
       }
       if (this.J == null) {
          return;
       }
       m tG = this.G;
       if (tG != null) {
          tG.setVisibility(0);
          this.G.setAlpha(0x3f800000);
          this.G.setTranslationX(0);
       }
       tG = this.I;
       if (tG != null) {
          tG.setTranslationX(0);
       }
       return;
    }
    public final void W8(){
       int i;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "16")) {
          return;
       }
       if (this.H != null) {
          m tw = this.w;
          if (tw != null && ("Mode Changed").equals(tw.getTag())) {
             ViewGroup$LayoutParams layoutParams = this.H.getLayoutParams();
             Object obj = PatchProxy.apply(objArray, this, om, "18");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else {
                om = this.I;
                int i1 = 0;
                if (om == null) {
                   i = 0;
                }else {
                   i = om.getWidth();
                   if (this.J != null) {
                      m tG = this.G;
                      if (tG != null) {
                         i1 = tG.getWidth() + m.T;
                      }
                   }
                   i = i - i1;
                }
             }
             layoutParams.width = i;
             this.H.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, m.class, "17")) {
          return;
       }
       if (("Mode Changed").equals(this.w.getTag())) {
          RelativeLayout$LayoutParams layoutParams = this.w.getLayoutParams();
          layoutParams.width = m.S;
          layoutParams.leftMargin = m.T;
          layoutParams.setLayoutDirection(15);
          layoutParams.addRule(1, R.id.description);
          this.w.setLayoutParams(layoutParams);
          this.w.setTag(null);
       }
       return;
    }
    public final void Y8(float p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, om, "24")) {
          return;
       }
       if (this.J != null) {
          om = this.I;
          if (om != null) {
             om.setTranslationX(((float)(this.K * -1) * p0));
          }
       }
       return;
    }
    public final void Z8(ViewGroup$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "14")) {
          return;
       }
       if (this.H == null) {
          return;
       }
       this.E.setVisibility(0);
       this.E.setLayoutParams(p0);
       ViewGroup$LayoutParams layoutParams = this.H.getLayoutParams();
       layoutParams.width = m.R + p0.width;
       this.H.setLayoutParams(layoutParams);
       RelativeLayout$LayoutParams layoutParams1 = this.w.getLayoutParams();
       layoutParams1.width = m.S;
       layoutParams1.leftMargin = m.T;
       layoutParams1.setLayoutDirection(15);
       layoutParams1.addRule(1, R.id.description_ellipsized);
       this.w.setLayoutParams(layoutParams1);
       this.w.setTag("Mode Changed");
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, m.class, "21")) {
          return;
       }
       m tH = this.H;
       if (tH == null) {
          return;
       }
       int[] ointArray = n.o(tH);
       int[] ointArray1 = n.o(this.y);
       int i = 0;
       if ((ointArray[i] - ointArray1[i]) > 0) {
          if (this.J != null) {
             i = ointArray[i] - ointArray1[i];
          }
          this.K = i;
       }
       return;
    }
    public final void b9(boolean p0){
       ObjectAnimator objectAnimat;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "22")) {
          return;
       }
       int i = 2;
       if (p0) {
          this.w.a();
          objectAnimat = ObjectAnimator.ofFloat(this.w, View.ALPHA, new float[i]{0,0x3f800000});
          objectAnimat.setInterpolator(new e());
          objectAnimat.setDuration(300);
       }else {
          objectAnimat = ObjectAnimator.ofFloat(this.w, View.ALPHA, new float[i]{0x3f800000,0});
          objectAnimat.setInterpolator(new n());
          objectAnimat.setDuration(240);
       }
       objectAnimat.addListener(new m$d(this, p0));
       objectAnimat.start();
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, m.class, "8")) {
          return;
       }
       m tx = this.x;
       if (tx != null) {
          tx.setVisibility(0);
       }
       return;
    }
    public final void d9(boolean p0,boolean p1){
       ArrayList uArrayList1;
       int i4;
       int i5;
       PropertyValuesHolder propertyValu2;
       PropertyValuesHolder propertyValu3;
       ArrayList uArrayList2;
       float[] uofloatArray;
       int i6;
       PropertyValuesHolder propertyValu4;
       PropertyValuesHolder propertyValu5;
       boolean i7;
       ValueAnimator valueAnimato1;
       ValueAnimator valueAnimato2;
       ViewGroup$LayoutParams width;
       View obj2;
       Object obj = this;
       boolean b = p0;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), obj, om, "10")) {
          return;
       }
       ArrayList uArrayList = new ArrayList(obj.N);
       m a = obj.A;
       if (a != null) {
          int i = 0;
          a.setVisibility(i);
          uArrayList.add(obj.A);
          int i1 = 0x7f0a08fd;
          AnimatorSet tag = obj.A.getTag(i1);
          ArrayList obj1 = null;
          if (tag != null && tag.isRunning()) {
             tag.end();
             obj.A.setTag(i1, obj1);
          }
          boolean c = d0.c;
          int b1 = d0.b;
          int i2 = 0;
          if (p1) {
             if (!b && !obj.A.getTranslationX() - i2) {
                return;
             }else if(b && obj.A.getTranslationX() - i2){
                return;
             }else {
                int i3 = 2;
                PropertyValuesHolder propertyValu = PropertyValuesHolder.ofFloat(View.ALPHA, new float[i3]{0,0x3f800000});
                PropertyValuesHolder propertyValu1 = PropertyValuesHolder.ofFloat(View.ALPHA, new float[i3]{0x3f800000,0});
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (PatchProxy.isSupport(om)) {
                   obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p0), obj, om, "13");
                   if (obj1 != patchProxyRe) {
                      uArrayList1 = uArrayList;
                      i4 = c;
                      i5 = b1;
                      propertyValu2 = propertyValu;
                      propertyValu3 = propertyValu1;
                      uArrayList2 = v15;
                   label_036b :
                      ArrayList uArrayList3 = new ArrayList(obj1);
                      Iterator iterator = uArrayList1.iterator();
                      while (iterator.hasNext()) {
                         View view = iterator.next();
                         i = (view instanceof LinearLayout)? i5: i4;
                         if (b) {
                            uofloatArray = new float[2];
                            i6 = 0;
                            uofloatArray[i6] = 0;
                            i2 = 1;
                            uofloatArray[i2] = (float)obj.P8(view, i);
                            propertyValu4 = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray);
                            propertyValu5 = propertyValu2;
                         }else {
                            i6 = 0;
                            i2 = 1;
                            uofloatArray = new float[2];
                            uofloatArray[i6] = (float)obj.P8(view, i);
                            uofloatArray[i2] = 0;
                            propertyValu4 = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray);
                            propertyValu5 = propertyValu3;
                         }
                         PropertyValuesHolder[] propertyValu6 = new PropertyValuesHolder[i2];
                         propertyValu6[i6] = propertyValu4;
                         ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(view, propertyValu6);
                         objectAnimat.setDuration(300);
                         objectAnimat.setInterpolator(new e());
                         uArrayList3.add(objectAnimat);
                         if (!obj.O.contains(view)) {
                            PropertyValuesHolder[] propertyValu7 = new PropertyValuesHolder[i2];
                            propertyValu7[i6] = propertyValu5;
                            objectAnimat = ObjectAnimator.ofPropertyValuesHolder(view, propertyValu7);
                            if (b) {
                               objectAnimat.setDuration(240);
                               objectAnimat.setInterpolator(new n());
                               objectAnimat.addListener(new m$a(obj, view));
                               uofloatArray = 300;
                            }else {
                               objectAnimat.setDuration(300);
                               objectAnimat.setInterpolator(new i());
                               objectAnimat.addListener(new m$b(obj, view));
                            }
                            uArrayList3.add(objectAnimat);
                         }else {
                            uofloatArray = 300;
                         }
                      }
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      uAnimatorSet.addListener(new m$c(obj, b));
                      uAnimatorSet.playTogether(uArrayList3);
                      obj.A.setTag(R.id.confirm_btn_v2, uAnimatorSet);
                      uAnimatorSet.start();
                   }
                }
                obj1 = new ArrayList();
                obj.B.setText(obj.C.getText());
                obj.E.setText(obj.D.getText());
                i7 = a1.h();
                Iterator iterator1 = obj.N.iterator();
                i2 = 0;
                while (iterator1.hasNext()) {
                   View view1 = iterator1.next();
                   if (!view1.getVisibility()) {
                      int[] ointArray = n.o(view1);
                      if (i7 > ointArray[i]) {
                         i7 = ointArray[i];
                      }
                      i2 = i2 + 1;
                      i3 = 2;
                   }
                }
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[i3]{0,0x3f800000});
                valueAnimato1 = ValueAnimator.ofFloat(new float[i3]{0x3f800000,0});
                propertyValu2 = propertyValu;
                valueAnimato.setDuration(300);
                valueAnimato1.setDuration(300);
                ArrayList uArrayList4 = new ArrayList();
                ArrayList uArrayList5 = new ArrayList();
                if (b) {
                   this.a9();
                   i4 = c;
                   int[] ointArray1 = n.o(obj.C);
                   propertyValu3 = propertyValu1;
                   i5 = b1;
                   uArrayList1 = uArrayList;
                   int c1 = d0.c;
                   uArrayList2 = v15;
                   Object[] objArray = new Object[0];
                   k.D().s("PlayHistoryPV2", "name width:"+((i7 - ointArray1[0]) + c1), objArray);
                   ViewGroup$LayoutParams layoutParams = obj.B.getLayoutParams();
                   b1 = 0;
                   i2 = i2 * c.c;
                   c = ((i7 - ointArray1[b1]) + c1) + i2;
                   layoutParams.width = c;
                   if (c < obj.C.getMeasuredWidth()) {
                      obj.B.setVisibility(b1);
                      uArrayList4.add(obj.B);
                      uArrayList5.add(obj.C);
                   }
                   obj.B.setLayoutParams(layoutParams);
                   layoutParams = obj.E.getLayoutParams();
                   layoutParams.width = (((i7 - n.o(obj.y)[0]) + c1) - d0.d) + i2;
                   a = obj.G;
                   if (a != null && !a.getVisibility()) {
                      uArrayList5.add(obj.G);
                   }
                   if (layoutParams.width < obj.D.getMeasuredWidth()) {
                      if (layoutParams.width < a1.e(24.00f)) {
                         if (layoutParams.width < (- a1.e(10.00f)) && obj.F.getVisibility() != 8) {
                            uArrayList5.add(obj.F);
                         }
                         layoutParams.width = 0;
                      }
                      obj.Z8(layoutParams);
                      uArrayList4.add(obj.E);
                      uArrayList5.add(obj.D);
                   }else {
                      width = layoutParams.width;
                      if (PatchProxy.isSupport(om)) {
                         obj2 = PatchProxy.applyOneRefs(Integer.valueOf(width), obj, om, "15");
                         if (obj2 != patchProxyRe) {
                            c = obj2.booleanValue();
                         }else if(obj.H == null){
                            b1 = obj.D.getWidth();
                            Object obj3 = PatchProxy.apply(null, obj, om, "19");
                            if (obj3 != patchProxyRe) {
                               i7 = obj3.intValue();
                            }else if(TextUtils.x(obj.D.getText())){
                               i7 = 0;
                            }else {
                               i7 = (int)obj.D.getPaint().measureText(obj.D.getText().toString());
                            }
                            if (b1 < i7 && obj.H.getWidth() < (m.R + width)) {
                               c = true;
                            }
                         }
                      label_0251 :
                         c = false;
                      }else {
                         goto label_0204 ;
                      }
                      if (c) {
                         obj.Z8(layoutParams);
                         uArrayList4.add(obj.E);
                         uArrayList5.add(obj.D);
                      }
                   }
                   valueAnimato.setInterpolator(new e());
                   valueAnimato1.setInterpolator(new e());
                   valueAnimato.addUpdateListener(new e(uArrayList4));
                   valueAnimato1.addUpdateListener(new f(uArrayList5));
                }else {
                   uArrayList1 = uArrayList;
                   i4 = c;
                   i5 = b1;
                   propertyValu3 = propertyValu1;
                   uArrayList2 = v15;
                   this.W8();
                   this.X8();
                   valueAnimato.setInterpolator(new i());
                   valueAnimato1.setInterpolator(new i());
                   if (obj.F.getVisibility() == 4) {
                      uArrayList4.add(obj.F);
                   }
                   if (obj.J != null) {
                      m g = obj.G;
                      if (g != null && (g.getVisibility() || !obj.G.getAlpha() - null)) {
                         uArrayList4.add(obj.G);
                      }
                   }
                   if (!obj.E.getVisibility()) {
                      uArrayList4.add(obj.D);
                      uArrayList5.add(obj.E);
                   }
                   if (!obj.B.getVisibility()) {
                      uArrayList4.add(obj.C);
                      uArrayList5.add(obj.B);
                   }
                   valueAnimato.addUpdateListener(new g(uArrayList4));
                   valueAnimato1.addUpdateListener(new h(uArrayList5));
                }
                obj1.add(valueAnimato1);
                obj1.add(valueAnimato);
                if (PatchProxy.isSupport(om)) {
                   valueAnimato2 = PatchProxy.applyOneRefs(Boolean.valueOf(p0), obj, om, "23");
                   if (valueAnimato2 != patchProxyRe) {
                   }else if(b){
                      ValueAnimator valueAnimato3 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                      valueAnimato3.setInterpolator(new e());
                      valueAnimato3.setDuration(300);
                      valueAnimato3.addUpdateListener(new c(obj));
                      valueAnimato2 = valueAnimato3;
                   }else {
                      valueAnimato2 = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
                      valueAnimato2.setInterpolator(new e());
                      valueAnimato2.setDuration(300);
                      valueAnimato2.addUpdateListener(new d(obj));
                      valueAnimato2.addListener(new n(obj));
                   }
                }else {
                   goto label_031e ;
                }
                obj1.add(valueAnimato2);
                goto label_036b ;
             }
          }else {
             uArrayList1 = uArrayList;
             i4 = c;
             i5 = b1;
             float f = 0x3f800000;
             if (b) {
                this.a9();
                obj.A.setTranslationX(0);
                obj.C.setAlpha(0);
                obj.B.setVisibility(0);
                obj.B.setAlpha(f);
                obj.E.setVisibility(0);
                obj.E.setAlpha(f);
                this.R8();
                i = i5;
             }else {
                i = i5;
                obj.A.setTranslationX((float)i);
                obj.C.setAlpha(f);
                i1 = 8;
                obj.B.setVisibility(i1);
                obj.D.setAlpha(f);
                obj.E.setVisibility(i1);
                this.W8();
                this.X8();
                this.V8();
             }
             Iterator iterator2 = uArrayList1.iterator();
             while (iterator2.hasNext()) {
                View view2 = iterator2.next();
                if (b) {
                   int i8 = (view2 instanceof LinearLayout)? i: i4;
                   view2.setTranslationX((float)obj.P8(view2, i8));
                   view2.setAlpha(f);
                   c.b(view2, true);
                }else {
                   view2.setTranslationX(0);
                   obj2 = view2;
                   if (obj2.getChildCount()) {
                      i7 = 0;
                      if (!obj2.getChildAt(i7).getVisibility()) {
                         obj.O.add(view2);
                      }
                   }else {
                      i7 = false;
                   }
                   view2.setAlpha(0);
                   c.b(view2, i7);
                }
                float f1 = 0;
             }
             Object[] objArray1 = null;
             if (!PatchProxy.applyVoid(objArray1, obj, om, "11")) {
                float f2 = Float.MAX_VALUE;
                Iterator iterator3 = obj.O.iterator();
                while (true) {
                   Object[] objArray2 = objArray1;
                   break ;
                }
                while (true) {
                   if (iterator3.hasNext()) {
                      objArray1 = iterator3.next();
                      if (objArray1.getX() - f2 < 0) {
                         if (objArray1.getId() != 0x7f0a08fd) {
                            f2 = objArray1.getX();
                         }
                      }else {
                         valueAnimato1 = 0x7f0a08fd;
                      }
                   }else if(objArray2 != null){
                      RelativeLayout$LayoutParams layoutParams1 = obj.y.getLayoutParams();
                      layoutParams1.removeRule(0);
                      layoutParams1.addRule(0, objArray2.getId());
                      obj.y.setLayoutParams(layoutParams1);
                      break ;
                   }
                }
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a3728);
       this.w = m1.f(p0, 0x7f0a3aab);
       this.y = m1.f(p0, 0x7f0a0953);
       this.v = m1.f(p0, 0x7f0a30c5);
       this.A = m1.f(p0, 0x7f0a08fd);
       ArrayList uArrayList = new ArrayList();
       this.N = uArrayList;
       uArrayList.add(m1.f(p0, R.id.stub_view_1));
       this.N.add(m1.f(p0, R.id.stub_view_2));
       this.N.add(m1.f(p0, R.id.stub_view_3));
       this.D = m1.f(p0, 0x7f0a0a95);
       this.E = m1.f(p0, 0x7f0a0a97);
       this.B = m1.f(p0, 0x7f0a2d14);
       this.C = m1.f(p0, 0x7f0a2d10);
       this.F = m1.f(p0, 0x7f0a3b3f);
       this.G = m1.f(p0, 0x7f0a3cc3);
       this.H = m1.f(p0, 0x7f0a0a99);
       this.I = m1.f(p0, 0x7f0a0a98);
       m1.a(p0, new j(this), R.id.item_root);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.q8(Music.class);
       this.q = this.r8("CLOUD_MUSIC_HELPER");
       this.r = this.r8("REQUEST_DURATION").intValue();
       this.s = this.r8("COULD_MUSIC_ENTER_TYPE").intValue();
       this.t = this.r8("CLOUD_MUSIC_INTENT_FETCHER");
       this.u = this.r8("FRAGMENT");
       return;
    }
}
