package b99.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import b99.f$a;
import java.util.Set;
import b99.e;
import android.view.View$OnLayoutChangeListener;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import java.util.Objects;
import p4a.a;
import java.lang.Float;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.lifecycle.Observer;
import f4a.j0;
import android.view.ViewGroup;
import com.yxcorp.gifshow.entity.QPhoto;
import im8.f;

public class f extends PresenterV2	// class@0003a0
{
    public float A;
    public Set p;
    public ViewGroup q;
    public QPhoto r;
    public View s;
    public int t;
    public y u;
    public View$OnLayoutChangeListener v;
    public j0 w;
    public a x;
    public View y;
    public f z;

    public void f(){
       super();
       this.A = 0xbf800000;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.y = this.s.findViewById(0x7f0a3f4a);
       f$a uoa = new f$a(this);
       this.u = uoa;
       this.p.add(uoa);
       this.v = new e(this);
       this.m8().addOnLayoutChangeListener(this.v);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.s = this.getActivity().findViewById(0x1020002);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       this.p.remove(this.u);
       this.m8().removeOnLayoutChangeListener(this.v);
       return;
    }
    public void P8(){
       float f;
       int i4;
       int i5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "9")) {
          return;
       }
       View view = this.m8();
       View view1 = PatchProxy.apply(objArray, this, uof, "8");
       int i = 0x7f0a3125;
       int i1 = 0x7f0a3126;
       if (view1 != patchProxyRe) {
       }else {
          view1 = this.m8();
          View view3 = view1.findViewById(i1);
          view1 = view1.findViewById(i);
          if (view3 != null && !view3.getVisibility()) {
             view1 = view3;
          }else if(view1 != null && !view1.getVisibility()){
             view1 = objArray;
          }
       }
       f = this.R8(false);
       float f1 = 0x3f800000;
       if (view1 == null) {
          f = 0x3f800000;
       label_00fb :
          if (f - f1 <= 0) {
             f1 = f;
          }
          if (f1 < 0) {
             f1 = 0;
          }
          if (!f1) {
             view.setVisibility(4);
          }else {
             view.setVisibility(false);
          }
          if (view.getAlpha() - f1) {
             view.setAlpha(f1);
             f tx = this.x;
             if (tx != null) {
                Objects.requireNonNull(tx);
                a uoa = a.class;
                if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f1), tx, uoa, "1")) {
                   Iterator iterator = tx.a.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().onChanged(Float.valueOf(f1));
                   }
                }
             }
          }
       }else {
          int[] ointArray = new int[2];
          view1.getLocationOnScreen(ointArray);
          int i2 = 1;
          float f2 = (float)ointArray[i2];
          if (this.A - f2 && f2 - f1 >= 0) {
             this.A = f2;
             f ty = this.y;
             int i3 = (ty == null)? a1.d(R.dimen.arg_RES_7f070fdc): ty.getHeight();
             View obj = PatchProxy.apply(objArray, this, uof, "7");
             if (obj != patchProxyRe) {
                i4 = obj.intValue();
             }else {
                View view2 = this.m8();
                obj = view2.findViewById(i1);
                view2 = view2.findViewById(i);
                i = (obj != null && !obj.getVisibility())? 1: 0;
                i = (i)? obj.getHeight(): 0;
                Object[] objArray1 = (obj == null)? objArray: obj.getLayoutParams();
                if (objArray1 instanceof ViewGroup$MarginLayoutParams) {
                   i = i + (objArray1.getMarginEnd() + objArray1.bottomMargin);
                }
                if (view2 == null || view2.getVisibility()) {
                   i2 = 0;
                }
                i5 = (i2)? view2.getHeight(): 0;
                if (view2 != null) {
                   objArray = view2.getLayoutParams();
                }
                if (objArray instanceof ViewGroup$MarginLayoutParams) {
                   i5 = i5 + (objArray.getMarginEnd() + objArray.bottomMargin);
                }
                i4 = Math.max(i, i5);
             }
             i5 = i3 + i4;
             if (f2 - (float)i3 <= 0) {
                f = 0;
                goto label_00fb ;
             }else {
                float f3 = (float)i5;
                if (f2 - f3 < 0) {
                   f = f1 - ((f3 - f2) / (float)i4);
                   goto label_00fb ;
                }else {
                   goto label_00fb ;
                }
             }
          }
       }
       return;
    }
    public float R8(boolean p0){
       float f = (p0)? 0: 0x3f800000;
       return f;
    }
    public final void S8(float p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uof, "6")) {
          return;
       }
       this.w.b(1, p0);
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       int[] ointArray = new int[2];
       this.q.getLocationOnScreen(ointArray);
       this.S8((float)(- Math.max(((ointArray[1] + this.q.getHeight()) - this.t), 0)));
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       if (this.s.getHeight()) {
          int[] ointArray = new int[2];
          this.s.getLocationOnScreen(ointArray);
          this.t = this.s.getHeight() + ointArray[1];
       }else {
          this.t = a1.g();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_SCROLL_LISTENERS");
       this.q = this.q8(ViewGroup.class);
       this.r = this.q8(QPhoto.class);
       this.w = this.q8(j0.class);
       this.x = this.t8("PLC_WEAK_EVENT_BUS");
       this.z = this.w8("DETAIL_COMMENT_RECYCLER_VIEW");
       return;
    }
}
