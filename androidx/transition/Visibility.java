package androidx.transition.Visibility;
import androidx.transition.Transition;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.c;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import o1.g;
import e3.o;
import java.lang.Object;
import java.util.Map;
import androidx.transition.Visibility$c;
import android.view.View;
import java.lang.Integer;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.animation.Animator;
import androidx.transition.f;
import e3.r;
import e3.s;
import e3.q;
import androidx.transition.Visibility$a;
import androidx.transition.Transition$f;
import e3.w;
import androidx.transition.Visibility$b;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.a;
import java.lang.IllegalArgumentException;

public abstract class Visibility extends Transition	// class@0009df
{
    public int L;
    public static final String[] M;

    static {
       String[] stringArray = new String[]{"android:visibility:visibility","android:visibility:parent"};
       Visibility.M = stringArray;
    }
    public void Visibility(){
       super();
       this.L = 3;
    }
    public void Visibility(Context p0,AttributeSet p1){
       super(p0, p1);
       this.L = 3;
       XmlResourceParser xmlResourceP = p0.obtainStyledAttributes(p1, c.e);
       int i = g.g(xmlResourceP, p1, "transitionVisibilityMode", 0, 0);
       xmlResourceP.recycle();
       if (i) {
          this.q0(i);
       }
       return;
    }
    public String[] F(){
       return Visibility.M;
    }
    public boolean H(o p0,o p1){
       boolean b = false;
       if (p0 == null && p1 == null) {
          return b;
       }
       if (p0 != null && (p1 != null && p1.a.containsKey("android:visibility:visibility") != p0.a.containsKey("android:visibility:visibility"))) {
          return b;
       }
       Visibility$c uoc = this.l0(p0, p1);
       if (uoc.a != null && (uoc.c == null || uoc.d == null)) {
          b = true;
       }
       return b;
    }
    public void g(o p0){
       this.j0(p0);
    }
    public void j(o p0){
       this.j0(p0);
    }
    public final void j0(o p0){
       p0.a.put("android:visibility:visibility", Integer.valueOf(p0.b.getVisibility()));
       p0.a.put("android:visibility:parent", p0.b.getParent());
       int[] ointArray = new int[2];
       p0.b.getLocationOnScreen(ointArray);
       p0.a.put("android:visibility:screenLocation", ointArray);
    }
    public int k0(){
       return this.L;
    }
    public final Visibility$c l0(o p0,o p1){
       Visibility$c uoc = new Visibility$c();
       uoc.a = false;
       uoc.b = false;
       String str = "android:visibility:parent";
       o oo = null;
       Visibility$c uoc1 = -1;
       if (p0 != null && p0.a.containsKey("android:visibility:visibility")) {
          uoc.c = p0.a.get("android:visibility:visibility").intValue();
          uoc.e = p0.a.get(str);
       }else {
          uoc.c = uoc1;
          uoc.e = oo;
       }
       if (p1 != null && p1.a.containsKey("android:visibility:visibility")) {
          uoc.d = p1.a.get("android:visibility:visibility").intValue();
          uoc.f = p1.a.get(str);
       }else {
          uoc.d = uoc1;
          uoc.f = oo;
       }
       if (p0 != null && p1 != null) {
          Visibility$c c = uoc.c;
          Visibility$c d = uoc.d;
          if (c == d && uoc.e == uoc.f) {
             return uoc;
          }else if(c != d){
             if (c == null) {
                uoc.b = false;
                uoc.a = true;
             }else if(d == null){
                uoc.b = true;
                uoc.a = true;
             }
          }else if(uoc.f == null){
             uoc.b = false;
             uoc.a = true;
          }else if(uoc.e == null){
             uoc.b = true;
             uoc.a = true;
          }
       }else if(p0 == null && uoc.d == null){
          uoc.b = true;
          uoc.a = true;
       }else if(p1 == null && uoc.c == null){
          uoc.b = false;
          uoc.a = true;
       }
       return uoc;
    }
    public Animator m0(ViewGroup p0,View p1,o p2,o p3){
       return null;
    }
    public Animator n(ViewGroup p0,o p1,o p2){
       Visibility$c uoc = this.l0(p1, p2);
       if (uoc.a == null || (uoc.e == null && uoc.f == null)) {
          return null;
       }
       if (uoc.b != null) {
          return this.n0(p0, p1, uoc.c, p2, uoc.d);
       }
       return this.p0(p0, p1, uoc.c, p2, uoc.d);
    }
    public Animator n0(ViewGroup p0,o p1,int p2,o p3,int p4){
       p4 = 1;
       if ((this.L & p4) != p4 || p3 == null) {
          return null;
       }
       if (p1 == null) {
          View parent = p3.b.getParent();
          o oo = this.v(parent, false);
          if (this.l0(oo, this.G(parent, false)).a != null) {
             return null;
          }
       }
       return this.m0(p0, p3.b, p1, p3);
    }
    public Animator o0(ViewGroup p0,View p1,o p2,o p3){
       return null;
    }
    public Animator p0(ViewGroup p0,o p1,int p2,o p3,int p4){
       Animator uAnimator1;
       int i2;
       Animator uAnimator4;
       ViewParent viewParent;
       int id;
       Visibility visibility = this;
       ViewGroup viewGroup = p0;
       o oo = p1;
       o oo1 = p3;
       int i = p4;
       int i1 = 2;
       Animator uAnimator = null;
       if ((visibility.L & i1) != i1) {
          return uAnimator;
       }
       if (!oo) {
          return uAnimator;
       }
       o b = oo.b;
       o b1 = (oo1)? oo1.b: uAnimator;
       View tag = b.getTag(R.id.save_overlay_view);
       if (tag != null) {
          uAnimator1 = uAnimator;
          i2 = 1;
       }else if(b1 == null || b1.getParent() == null){
          if (b1 != null) {
             uAnimator4 = uAnimator;
             viewParent = null;
          }else {
          label_0046 :
             uAnimator1 = uAnimator;
             uAnimator4 = uAnimator1;
             viewParent = 1;
          }
       }else if(i == 4 || b == b1){
          uAnimator4 = b1;
          viewParent = null;
          uAnimator1 = uAnimator;
       }else {
          goto label_0046 ;
       }
       if (viewParent) {
          if (b.getParent() != null) {
             if (b.getParent() instanceof View) {
                View parent = b.getParent();
                if (visibility.l0(visibility.G(parent, 1), visibility.v(parent, 1)).a == null) {
                   b1 = f.a(viewGroup, b, parent);
                }else {
                   id = parent.getId();
                   if (parent.getParent() != null || (id == -1 || (viewGroup.findViewById(id) == null || visibility.x == null))) {
                   label_0090 :
                      parent = 0;
                      tag = b1;
                      uAnimator1 = uAnimator4;
                   }
                }
             }else {
                goto label_0090 ;
             }
          }
          uAnimator1 = uAnimator4;
          viewParent = 0;
          tag = b;
       }else {
          goto label_0090 ;
       }
       if (tag != null) {
          if (!i2) {
             int[] ointArray = oo.a.get("android:visibility:screenLocation");
             int[] ointArray1 = new int[i1];
             viewGroup.getLocationOnScreen(ointArray1);
             tag.offsetLeftAndRight(((ointArray[0] - ointArray1[0]) - tag.getLeft()));
             tag.offsetTopAndBottom(((ointArray[1] - ointArray1[1]) - tag.getTop()));
             s.b(p0).c(tag);
          }
          Animator uAnimator2 = visibility.o0(viewGroup, tag, oo, oo1);
          if (!i2) {
             if (uAnimator2 == null) {
                s.b(p0).a(tag);
             }else {
                b.setTag(R.id.save_overlay_view, tag);
                visibility.a(new Visibility$a(visibility, viewGroup, tag, b));
             }
          }
          return uAnimator2;
       }else if(uAnimator1 != null){
          int visibility1 = uAnimator1.getVisibility();
          w.j(uAnimator1, 0);
          Animator uAnimator3 = visibility.o0(viewGroup, uAnimator1, oo, oo1);
          if (uAnimator3 != null) {
             Visibility$b uob = new Visibility$b(uAnimator1, i, 1);
             uAnimator3.addListener(uob);
             a.a(uAnimator3, uob);
             visibility.a(uob);
          }else {
             w.j(uAnimator1, visibility1);
          }
          return uAnimator3;
       }else {
          return uAnimator;
       }
    }
    public void q0(int p0){
       if (p0 & 0xfc) {
          throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
       }
       this.L = p0;
       return;
    }
}
