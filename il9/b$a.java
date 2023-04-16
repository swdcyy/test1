package il9.b$a;
import android.view.TouchDelegate;
import android.view.View;
import android.view.Window;
import il9.b$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import il9.e;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import il9.b;
import android.graphics.Rect;
import android.content.Context;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.graphics.PointF;
import java.lang.Math;
import android.view.ViewParent;
import com.yxcorp.gifshow.comment.utils.comboanim.ComboAnimView;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.os.Handler;
import il9.b$a$a;
import il9.d;
import il9.b$a$b;
import android.view.View$OnAttachStateChangeListener;
import java.util.Objects;
import lnc.h2;
import android.app.Activity;
import lnc.b5;
import android.view.GestureDetector;

public final class b$a extends TouchDelegate	// class@002866
{
    public final View a;
    public final View b;
    public final Window c;
    public final boolean d;
    public final boolean e;
    public final b$b f;
    public ComboAnimView g;
    public ClientContent$ContentPackage h;
    public boolean i;
    public e j;
    public String k;
    public PointF l;
    public final float m;
    public boolean n;
    public QPhoto o;

    public void b$a(View p0,View p1,Window p2,boolean p3,boolean p4,b$b p5,ClientContent$ContentPackage p6,e p7,String p8,QPhoto p9){
       super(b.b, p0);
       this.i = true;
       this.j = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.h = p6;
       this.j = p7;
       this.k = p8;
       this.o = p9;
       this.m = (float)ViewConfiguration.get(p0.getContext()).getScaledTouchSlop();
    }
    public boolean onTouchEvent(MotionEvent p0){
       b$a c;
       ViewParent obj3;
       b$a b;
       int i2;
       PointF pointF = this;
       Object obj = p0;
       b$a obj1 = PatchProxy.applyOneRefs(obj, pointF, b$a.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       int i = 2;
       if (!(p0.getAction() & 0x00ff)) {
          pointF.l = new PointF(p0.getRawX(), p0.getRawY());
          pointF.n = false;
       }else if(pointF.n == null && (pointF.l != null && ((p0.getAction() & 0x00ff) == i && (Math.abs((p0.getRawY() - pointF.l.y)) - pointF.m > 0 && pointF.a.getParent() != null)))){
          pointF.a.getParent().requestDisallowInterceptTouchEvent(false);
          return false;
       }
    label_006a :
       int i1 = 0x1020002;
       b$a obj2 = null;
       if (!p0.getAction() && !b.a) {
          obj1 = pointF.j;
          if (obj1 == null) {
             e uoe = b.b(pointF.c.getContext(), pointF.k, pointF.o);
          }
          c = pointF.c;
          obj3 = PatchProxy.applyTwoRefs(c, obj1, obj2, b.class, "9");
          if (obj3 != PatchProxyResult.class) {
          }else {
             ViewGroup viewGroup = c.findViewById(i1);
             i2 = 0x7f0a1779;
             ComboAnimView tag = viewGroup.getTag(i2);
             if (tag != null) {
             }else {
                tag = new ComboAnimView(c.getContext());
                tag.setProvider(obj1);
                tag.setSelfAdaption(false);
                viewGroup.addView(tag, new ViewGroup$LayoutParams(-1, -1));
                viewGroup.setTag(i2, tag);
             }
             obj3 = tag;
             if (!PatchProxy.applyVoid(obj2, obj3, ComboAnimView.class, "13")) {
                obj3.j = false;
                obj3.m = false;
                obj3.e.removeMessages(3);
             }
          }
          pointF.g = obj3;
          pointF.g.setComboSession(new d(pointF.a, new b$a$a(pointF, obj3.getProvider())));
          pointF.g.setEnableCombo(pointF.d);
          pointF.g.setEnableSingleCombo(pointF.e);
          pointF.g.addOnAttachStateChangeListener(new b$a$b(pointF));
          b.a = true;
       }
       if (pointF.g != null && (b.a && pointF.a.getParent() instanceof ViewGroup)) {
          b$a g = pointF.g;
          b = pointF.b;
          ViewParent viewParent = pointF.a.getParent();
          Objects.requireNonNull(g);
          c = b;
          obj3 = viewParent;
          ViewParent viewParent1 = viewParent;
          b$a uoa = g;
          obj2 = b;
          b$a uoa1 = g;
          int[] obj4 = PatchProxy.applyThreeRefs(p0, c, obj3, uoa, ComboAnimView.class, "2");
          if (obj4 != PatchProxyResult.class) {
             obj4.booleanValue();
          }else {
             int action = p0.getAction();
             if (action) {
                if (action == 1 || action == 3) {
                   if (uoa1.g != null) {
                      uoa1.g = false;
                      uoa1.e.removeMessages(2);
                      uoa1.c();
                   }
                   viewParent1.requestDisallowInterceptTouchEvent(false);
                }
             }else {
                obj2.getLocationInWindow(uoa1.b);
                obj4 = h2.a(uoa1.getContext());
                if (b5.a(uoa1.getContext())) {
                   i2 = 2;
                   uoa1.h = (uoa1.b[0] + (obj2.getWidth() / i2)) - obj4[0];
                   uoa1.i = (uoa1.b[1] + (obj2.getHeight() / i2)) - obj4[1];
                }else {
                   i2 = 2;
                   uoa1.h = uoa1.b[0] + (obj2.getWidth() / i2);
                   uoa1.i = uoa1.b[1] + (obj2.getHeight() / i2);
                }
                viewParent1.requestDisallowInterceptTouchEvent(true);
             }
             uoa1.f.onTouchEvent(obj);
          }
          if (p0.getAction() == 1 || p0.getAction() == 3) {
             obj1 = pointF.g;
             c = pointF.c;
             if (!PatchProxy.applyVoidTwoRefs(obj1, c, null, b.class, "5")) {
                obj1.setDetachOnFinish(c.findViewById(0x1020002));
             }
             pointF.g = null;
             b.a = false;
             pointF.n = false;
          }
       }
    label_01f0 :
       return true;
    }
}
