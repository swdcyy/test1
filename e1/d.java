package e1.d;
import e1.s;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import android.util.Pair;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.a;
import android.view.View;
import java.lang.String;
import java.lang.Float;
import android.view.ViewGroup;
import e1.p;
import android.view.ViewParent;
import e1.l;
import androidx.constraintlayout.motion.widget.a;
import java.lang.Boolean;

public class d implements s	// class@001e80
{
    public final MotionLayout a;
    public a b;
    public String c;
    public String d;
    public int e;
    public int f;
    public static final HashMap g;
    public static final HashMap h;

    static {
       HashMap hashMap = new HashMap();
       d.g = hashMap;
       HashMap hashMap1 = new HashMap();
       d.h = hashMap1;
       Integer integer = Integer.valueOf(4);
       hashMap.put(Pair.create(integer, integer), "layout_constraintBottom_toBottomOf");
       Integer integer1 = Integer.valueOf(3);
       hashMap.put(Pair.create(integer, integer1), "layout_constraintBottom_toTopOf");
       hashMap.put(Pair.create(integer1, integer), "layout_constraintTop_toBottomOf");
       Pair pair = Pair.create(integer1, integer1);
       hashMap.put(pair, "layout_constraintTop_toTopOf");
       integer = Integer.valueOf(6);
       hashMap.put(Pair.create(integer, integer), "layout_constraintStart_toStartOf");
       Integer integer2 = Integer.valueOf(7);
       hashMap.put(Pair.create(integer, integer2), "layout_constraintStart_toEndOf");
       hashMap.put(Pair.create(integer2, integer), "layout_constraintEnd_toStartOf");
       pair = Pair.create(integer2, integer2);
       hashMap.put(pair, "layout_constraintEnd_toEndOf");
       integer = Integer.valueOf(1);
       hashMap.put(Pair.create(integer, integer), "layout_constraintLeft_toLeftOf");
       Integer integer3 = Integer.valueOf(2);
       hashMap.put(Pair.create(integer, integer3), "layout_constraintLeft_toRightOf");
       hashMap.put(Pair.create(integer3, integer3), "layout_constraintRight_toRightOf");
       pair = Pair.create(integer3, integer);
       hashMap.put(pair, "layout_constraintRight_toLeftOf");
       hashMap.put(Pair.create(Integer.valueOf(5), Integer.valueOf(5)), "layout_constraintBaseline_toBaselineOf");
       hashMap1.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
       hashMap1.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
       hashMap1.put("layout_constraintTop_toBottomOf", "layout_marginTop");
       hashMap1.put("layout_constraintTop_toTopOf", "layout_marginTop");
       hashMap1.put("layout_constraintStart_toStartOf", "layout_marginStart");
       hashMap1.put("layout_constraintStart_toEndOf", "layout_marginStart");
       hashMap1.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
       hashMap1.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
       hashMap1.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
       hashMap1.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
       hashMap1.put("layout_constraintRight_toRightOf", "layout_marginRight");
       hashMap1.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }
    public void d(MotionLayout p0){
       super();
       this.c = null;
       this.d = null;
       this.e = -1;
       this.f = -1;
       this.a = p0;
    }
    public static void j(int p0,a p1,View p2,HashMap p3,int p4,int p5){
       String str = d.g.get(Pair.create(Integer.valueOf(p4), Integer.valueOf(p5)));
       String str1 = p3.get(str);
       if (str1 != null) {
          str = d.h.get(str);
          int i = (str != null)? d.k(p0, p3.get(str)): 0;
          p1.m(p2.getId(), p4, Integer.parseInt(str1), p5, i);
       }
       return;
    }
    public static int k(int p0,String p1){
       if (p1 == null) {
          return 0;
       }
       int i = p1.indexOf(100);
       if (i == -1) {
          return 0;
       }
       return (int)((float)(Integer.valueOf(p1.substring(0, i)).intValue() * p0) / 160.00f);
    }
    public static void l(int p0,a p1,View p2,HashMap p3){
       String str = p3.get("layout_editor_absoluteX");
       if (str != null) {
          p1.K(p2.getId(), d.k(p0, str));
       }
       String str1 = p3.get("layout_editor_absoluteY");
       if (str1 != null) {
          p1.L(p2.getId(), d.k(p0, str1));
       }
       return;
    }
    public static void m(a p0,View p1,HashMap p2,int p3){
       String str = (p3 == 1)? "layout_constraintVertical_bias": "layout_constraintHorizontal_bias";
       String str1 = p2.get(str);
       if (str1 != null) {
          if (!p3) {
             p0.O(p1.getId(), Float.parseFloat(str1));
          }else if(p3 == 1){
             p0.S(p1.getId(), Float.parseFloat(str1));
          }
       }
       return;
    }
    public static void n(int p0,a p1,View p2,HashMap p3,int p4){
       String str = (p4 == 1)? "layout_height": "layout_width";
       String str1 = p3.get(str);
       if (str1 != null) {
          int i = -2;
          if (!str1.equalsIgnoreCase("wrap_content")) {
             i = d.k(p0, str1);
          }
          if (!p4) {
             p1.q(p2.getId(), i);
          }else {
             p1.n(p2.getId(), i);
          }
       }
       return;
    }
    public long a(){
       return this.a.getTransitionTimeMs();
    }
    public void b(float p0){
       d ta = this.a;
       if (ta.B == null) {
          ta.B = this.b;
       }
       ta.setProgress(p0);
       this.a.Q(true);
       this.a.requestLayout();
       this.a.invalidate();
       return;
    }
    public float c(Object p0,int p1,float p2,float p3){
       return this.a.K.get(p0).m(p1, p2, p3);
    }
    public Object d(Object p0,float p1,float p2){
       d ta = this.a;
       if (ta.B == null) {
          return Integer.valueOf(-1);
       }
       Object obj = null;
       if (p0 == null) {
          return obj;
       }
       p op = ta.K.get(p0);
       if (op == null) {
          return obj;
       }
       p0 = p0.getParent();
       int width = p0.getWidth();
       return op.n(width, p0.getHeight(), p1, p2);
    }
    public int e(int p0,String p1,Object p2,float[] p3,int p4,float[] p5,int p6){
       int[] ointArray = null;
       if (p0) {
          d ta = this.a;
          if (ta.B == null) {
             return -1;
          }else if(p2 != null){
             p2 = ta.K.get(p2);
             if (p2 != null) {
             label_001b :
                int i = 1;
                if (p0) {
                   if (p0 != i) {
                      if (p0 != 2) {
                         if (p0 != 3) {
                            return -1;
                         }else {
                            return p2.g(p1, p5, p6);
                         }
                      }else {
                         p2.c(p5, ointArray);
                         return (this.a.B.i() / 16);
                      }
                   }else {
                      p0 = this.a.B.i() / 16;
                      p2.d(p5, p0);
                      return p0;
                   }
                }else {
                   return i;
                }
             }
          }
          return -1;
       }else {
          p2 = ointArray;
          goto label_001b ;
       }
    }
    public Boolean f(Object p0,Object p1,float p2,float p3,String[] p4,float[] p5){
       if (!p0 instanceof l) {
          return Boolean.FALSE;
       }
       Object obj = p1;
       this.a.K.get(obj).s(obj, p0, p2, p3, p4, p5);
       this.a.f0();
       p0.S = true;
       return Boolean.TRUE;
    }
    public boolean g(Object p0,int p1,int p2,float p3,float p4){
       d ta = this.a;
       if (ta.B != null) {
          p op = ta.K.get(p0);
          d ta1 = this.a;
          int i = (int)(ta1.N * 100.00f);
          if (op != null && ta1.B.x(p0, i)) {
             this.a.B.K(p0, i, "motion:percentX", Float.valueOf(op.m(2, p3, p4)));
             this.a.B.K(p0, i, "motion:percentY", Float.valueOf(op.m(5, p3, p4)));
             this.a.f0();
             this.a.Q(true);
             this.a.invalidate();
             return true;
          }
       }
       return false;
    }
    public void h(int p0,String p1,Object p2,Object p3){
       int i = this.a.b0(p1);
       a uoa = this.a.B.e(i);
       if (uoa == null) {
          return;
       }
       uoa.f(p2.getId());
       d.n(p0, uoa, p2, p3, 0);
       d.n(p0, uoa, p2, p3, 1);
       int i1 = p0;
       a uoa1 = uoa;
       View view = p2;
       HashMap hashMap = p3;
       d.j(i1, uoa1, view, hashMap, 6, 6);
       d.j(i1, uoa1, view, hashMap, 6, 7);
       d.j(i1, uoa1, view, hashMap, 7, 7);
       d.j(i1, uoa1, view, hashMap, 7, 6);
       d.j(i1, uoa1, view, hashMap, 1, 1);
       d.j(i1, uoa1, view, hashMap, 1, 2);
       d.j(i1, uoa1, view, hashMap, 2, 2);
       d.j(i1, uoa1, view, hashMap, 2, 1);
       d.j(i1, uoa1, view, hashMap, 3, 3);
       d.j(i1, uoa1, view, hashMap, 3, 4);
       d.j(i1, uoa1, view, hashMap, 4, 3);
       d.j(i1, uoa1, view, hashMap, 4, 4);
       d.j(i1, uoa1, view, hashMap, 5, 5);
       d.m(uoa, p2, p3, 0);
       d.m(uoa, p2, p3, 1);
       d.l(p0, uoa, p2, p3);
       this.a.q0(i, uoa);
       this.a.requestLayout();
       return;
    }
    public void i(Object p0,int p1,String p2,Object p3){
       MotionLayout b = this.a.B;
       if (b != null) {
          b.K(p0, p1, p2, p3);
          p0 = this.a;
          p0.Q = (float)p1 / 100.00f;
          p0.O = 0;
          p0.f0();
          this.a.Q(true);
       }
       return;
    }
}
