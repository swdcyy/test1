package djc.i0;
import mp7.e;
import com.yxcorp.gifshow.share.widget.ForwardFansSectionFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import uo7.j0;
import android.view.View;
import com.kwai.sharelib.model.ShareInitResponse$ThemeAreaElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.widget.TextView;
import com.yxcorp.gifshow.share.widget.ForwardFansSectionFragment$b;
import java.lang.CharSequence;
import djc.i0$a;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import yic.s0;
import lnc.a1;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView$n;
import yic.s0$a;
import uo7.i0;
import com.kwai.sharelib.model.ShareInitResponse$ThemeItemElement;
import mp7.e$a;
import java.lang.Number;
import java.util.List;
import mp7.d;

public final class i0 implements e	// class@0021fb
{
    public final ForwardFansSectionFragment a;
    public final GifshowActivity b;
    public final int c;

    public void i0(ForwardFansSectionFragment p0,GifshowActivity p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean a(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       ForwardFansSectionFragment$b obj;
       i0 a;
       View view;
       TextView textView;
       ForwardFansSectionFragment$b a1;
       i0 oi0 = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = 4;
       int i1 = 1;
       if (PatchProxy.isSupport2(i0.class, "2")) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, i0.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(oobject, "bundle");
       a.p(oobject1, "v");
       if (a.g(p0.c(), "FANS_POP_BANNER")) {
          a = oi0.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(oobject1, a, ForwardFansSectionFragment.class, "6")) {
             int i2 = 0x7f0a3912;
             if (a.Z0 != null) {
                obj = null;
                if (oobject1 != null) {
                   textView = oobject1.findViewById(i2);
                   if (textView != null) {
                      ForwardFansSectionFragment z0 = a.Z0;
                      a1 = (z0 != null)? z0.a: obj;
                      textView.setText(a1);
                   }
                }
                if (oobject1 != null) {
                   textView = oobject1.findViewById(R.id.share_sub_title);
                   if (textView != null) {
                      ForwardFansSectionFragment z01 = a.Z0;
                      if (z01 != null) {
                         obj = z01.b;
                      }
                      textView.setText(obj);
                   }
                }
             }else if(oobject1 != null){
                view = oobject1.findViewById(i2);
                if (view != null) {
                   view.setVisibility(i);
                }
             }
             if (oobject1 != null) {
                view = oobject1.findViewById(R.id.share_sub_title);
                if (view != null) {
                   view.setVisibility(i);
                }
             }
             if (oobject1 != null) {
                view = oobject1.findViewById(R.id.share_exposure_icon);
                if (view != null) {
                   view.setVisibility(i);
                }
             }
          }
       label_00b6 :
          view = oobject1.findViewById(R.id.cancel_button);
          view.setVisibility(0);
          view.setOnClickListener(new i0$a(this));
       }else {
          RecyclerView recyclerView = oobject1.findViewById(R.id.recyclerView);
          if (recyclerView != null) {
             recyclerView.addItemDecoration(s0.a.a(oi0.b, a1.e(20.00f), a1.e(336.00f), R.id.image, (- a1.e(11.00f))));
          }
          i1 = false;
       }
       PatchProxy.onMethodExit(i0.class, "2");
       return i1;
    }
    public void b(i0 p0,View p1,int p2,int p3,int p4,ShareInitResponse$ThemeItemElement p5){
       if (PatchProxy.isSupport2(i0.class, "6")) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, i0.class, "6")) {
             return;
          }
       }
       a.p(p0, "op");
       a.p(p1, "v");
       e$a.f(this, p0, p1, p2, p3, p4, p5);
       PatchProxy.onMethodExit(i0.class, "6");
       return;
    }
    public int c(i0 p0,int p1,int p2){
       if (PatchProxy.isSupport2(i0.class, "4")) {
          Object obj = PatchProxy.applyThreeRefsWithListener(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, i0.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "op");
       PatchProxy.onMethodExit(i0.class, "4");
       return e$a.d(this, p0, p1, p2);
    }
    public void d(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       if (PatchProxy.isSupport2(i0.class, "5")) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, i0.class, "5")) {
             return;
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "v");
       e$a.e(this, p0, p1, p2, p3, p4);
       PatchProxy.onMethodExit(i0.class, "5");
       return;
    }
    public List e(int p0){
       return d.b(this, p0);
    }
    public boolean f(i0 p0,View p1,int p2,int p3,int p4,ShareInitResponse$ThemeItemElement p5){
       if (PatchProxy.isSupport2(i0.class, "3")) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, this, i0.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "op");
       a.p(p1, "v");
       PatchProxy.onMethodExit(i0.class, "3");
       return e$a.b(this, p0, p1, p2, p3, p4, p5);
    }
    public int g(int p0){
       p0 = (p0 == 1)? 0x7f0d14e6: -1;
       return p0;
    }
    public int h(j0 p0,int p1){
       if (PatchProxy.isSupport2(i0.class, "1")) {
          Object obj = PatchProxy.applyTwoRefsWithListener(p0, Integer.valueOf(p1), this, i0.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "op");
       int i = (a.g(p0.c(), "FANS_POP_BANNER"))? 1: -1;
       PatchProxy.onMethodExit(i0.class, "1");
       return i;
    }
    public int i(int p0){
       return 0x7f0d1289;
    }
}
