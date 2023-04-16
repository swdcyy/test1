package ab2.d;
import k51.c;
import ab2.d$a;
import ab2.d$b;
import ab2.d$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.view.ViewStub;
import com.kuaishou.live.core.basic.preload.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import r12.i;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import ab2.e;
import android.view.View$OnClickListener;
import java.util.Set;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import brd.t;
import xl8.b;
import ab2.a;
import erd.g;
import crd.b;
import ab2.c;
import lnc.b9;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import ab2.d$d;
import android.animation.Animator$AnimatorListener;
import io.reactivex.subjects.PublishSubject;
import androidx.lifecycle.MutableLiveData;

public class d extends c	// class@00009e
{
    public final b A;
    public final Observer B;
    public final Observer C;
    public View p;
    public KwaiImageView q;
    public KwaiImageView r;
    public TextView s;
    public ObjectAnimator t;
    public ObjectAnimator u;
    public b v;
    public PublishSubject w;
    public MutableLiveData x;
    public b y;
    public Set z;
    public static String sLivePresenterClassName = "LiveSquareSideBarStartPushEntrancePresenter";

    public void d(){
       super();
       this.A = new d$a(this);
       this.B = new d$b(this);
       this.C = new d$c(this);
    }
    public void E8(){
       Boolean obj;
       LiveLogTag obj1;
       Object obj3;
       String str1;
       View view = this;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, view, uod, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, view, uod, "4")) {
          ViewStub viewStub = this.getActivity().findViewById(R.id.live_square_start_live_layout_view_stub);
          if (viewStub != null) {
             Activity activity = this.getActivity();
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             a uoa = a.class;
             int i = 5;
             int i1 = 4;
             int i2 = 3;
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray1 = new Object[i];
                objArray1[0] = activity;
                objArray1[1] = viewStub;
                objArray1[2] = Integer.valueOf(0x7f0d0ddb);
                objArray1[i2] = objArray;
                objArray1[i1] = objArray;
                obj = PatchProxy.apply(objArray1, objArray, uoa, "11");
                if (obj != patchProxyRe) {
                }else {
                label_005f :
                   obj = Boolean.TRUE;
                   Boolean fALSE = Boolean.FALSE;
                   if (PatchProxy.isSupport(uoa)) {
                      Object[] objArray2 = new Object[]{activity,viewStub,Integer.valueOf(0x7f0d0ddb),obj,fALSE,objArray,objArray};
                      obj1 = PatchProxy.apply(objArray2, objArray, uoa, "13");
                      if (obj1 != patchProxyRe) {
                         obj = obj1;
                      }
                   }
                   obj1 = LiveLogTag.LIVE_PRELOAD;
                   String str = "viewStubInflate";
                   b.Z(obj1, str);
                   long l = i.a();
                   if (PatchProxy.isSupport(uoa)) {
                      Object[] objArray3 = new Object[i];
                      objArray3[0] = activity;
                      objArray3[1] = viewStub;
                      objArray3[2] = Integer.valueOf(0x7f0d0ddb);
                      objArray3[3] = obj;
                      objArray3[4] = fALSE;
                      Object obj2 = PatchProxy.apply(objArray3, objArray, uoa, "16");
                      if (obj2 != patchProxyRe) {
                         obj3 = obj2;
                         str1 = str;
                      }else {
                      label_00c1 :
                         str1 = str;
                         View view1 = a.b(activity, R.layout.arg_RES_7f0d0ddb, null, false, true, 0);
                         if (view1 != null) {
                            ViewGroup parent = viewStub.getParent();
                            if (parent != null) {
                               int i4 = parent.indexOfChild(viewStub);
                               parent.removeViewInLayout(viewStub);
                               ViewGroup$LayoutParams layoutParams = viewStub.getLayoutParams();
                               if (layoutParams != null) {
                                  parent.addView(view1, i4, layoutParams);
                               }else {
                                  parent.addView(view1, i4);
                               }
                               obj3 = view1;
                            }
                         }
                         obj3 = null;
                      }
                   }else {
                      goto label_00c1 ;
                   }
                   if (obj3 == null) {
                      b.Z(obj1, "viewStubInflate cache not hit");
                      viewStub.setLayoutResource(R.layout.arg_RES_7f0d0ddb);
                      obj = viewStub.inflate();
                   }else {
                      obj = obj3;
                   }
                   int[] ointArray = new int[]{0x7f0d0ddb};
                   i.b(l, str1, ointArray);
                }
             }else {
                goto label_005f ;
             }
             int i3 = 0x7f0a3b2b;
             view.p = obj.findViewById(i3);
          }else {
             view.p = this.getActivity().findViewById(0x7f0a3b2b);
          }
          view.q = view.p.findViewById(0x7f0a2603);
          KwaiImageView kwaiImageVie = view.p.findViewById(R.id.live_start_icon_image_view);
          view.r = kwaiImageVie;
          kwaiImageVie.setVisibility(8);
          view.s = view.p.findViewById(0x7f0a2606);
          view.p.setVisibility(0);
          view.p.setOnClickListener(new e(view));
       }
       view.z.add(view.A);
       view.x.observeForever(view.B);
       view.X7(view.y.observable().subscribe(new a(view)));
       view.X7(view.w.subscribe(new c(view)));
       return;
    }
    public void J8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       b9.a(this.v);
       if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
          uod = this.t;
          if (uod != null) {
             if (uod.isRunning()) {
                this.t.cancel();
             }
             this.t = objArray;
          }
          uod = this.u;
          if (uod != null) {
             if (uod.isRunning()) {
                this.u.cancel();
             }
             this.u = objArray;
          }
       }
       this.z.remove(this.A);
       this.x.removeObserver(this.B);
       return;
    }
    public boolean P8(){
       d obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       boolean b = true;
       if (obj != null && obj.isRunning()) {
          return b;
       }
       obj = this.u;
       if (obj != null && obj.isRunning()) {
          return false;
       }
       if (this.p.getVisibility()) {
          b = false;
       }
       return b;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       d tu = this.u;
       if (tu != null && tu.isRunning()) {
          this.u.cancel();
       }
       if (this.t == null) {
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{j.b(new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f000000,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f000000,0x3f800000})};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.p, propertyValu);
          this.t = objectAnimat;
          objectAnimat.setDuration(300);
          this.t.setInterpolator(new LinearInterpolator());
          this.t.addListener(new d$d(this));
       }
       if (this.t.isRunning()) {
          return;
       }else {
          this.t.start();
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.w = this.r8("LIVE_SQUARE_LOAD_TAB_LIST_PUBLISHER");
       this.z = this.r8("LIVE_SQUARE_SIDE_BAR_SCROLL_LISTENER_SET");
       this.x = this.r8("LIVE_SQUARE_SIDE_BAR_OPEN_STATUS_LIVE_DATA");
       this.y = this.r8("LIVE_SQUARE_CURRENT_TAB_POSITION");
       return;
    }
}
