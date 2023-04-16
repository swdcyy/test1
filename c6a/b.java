package c6a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.school.SchoolSquareResponse$b;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Integer;
import java.util.ArrayList;
import c6a.b$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import c6a.b$e;
import android.view.View$OnClickListener;
import qvb.q;
import sy6.a;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import android.widget.TextView;
import java.lang.CharSequence;
import c6a.b$a;
import c6a.b$b;
import c6a.b$c;
import e17.i;
import android.graphics.drawable.Drawable;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class b extends PresenterV2	// class@000561
{
    public t p;
    public View q;
    public boolean r;
    public KwaiImageView s;
    public a t;
    public List u;
    public List v;
    public List w;
    public int x;
    public View y;
    public final b$d z;

    public void b(){
       String str;
       super();
       SchoolSquareResponse$b[] uobArray = new SchoolSquareResponse$b[]{new SchoolSquareResponse$b(str, 0, 1)};
       str = a1.p(R.string.arg_RES_7f10443b);
       a.o(str, "CommonUtil.string\(R.stri¡­ol_trends_filter_default\)");
       this.u = CollectionsKt__CollectionsKt.P(uobArray);
       Integer[] integerArray = new Integer[]{Integer.valueOf(0x7f0a3723),Integer.valueOf(0x7f0a3724),Integer.valueOf(0x7f0a3725)};
       this.v = CollectionsKt__CollectionsKt.P(integerArray);
       this.w = new ArrayList();
       this.z = new b$d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       b ts = this.s;
       if (ts != null) {
          ts.setVisibility(0);
       }
       ts = this.s;
       if (ts != null) {
          ts.setOnClickListener(new b$e(this));
       }
       ts = this.t;
       if (ts != null) {
          ts.e(this.z);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          tp.o();
       }
       tp = this.t;
       if (tp != null) {
          tp.b(this.z);
       }
       return;
    }
    public final boolean P8(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 < this.u.size()) {
          return this.u.get(p0).enable;
       }else {
          return false;
       }
    }
    public final void R8(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       b = false;
       if (this.r != null) {
          this.r = b;
       }
       this.w.clear();
       Iterator iterator = this.u.iterator();
       int i = 0;
       String str = "it";
       while (iterator.hasNext()) {
          TextView obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          if (i < this.v.size()) {
             obj = p0.findViewById(this.v.get(i).intValue());
             a.o(obj, str);
             obj.setText(this.u.get(i).desc);
             obj.setVisibility(b);
             obj.setOnClickListener(new b$a(i, this, p0));
             this.w.add(obj);
          }
          i = i1;
       }
       this.S8(b, true);
       View view = p0.findViewById(R.id.school_filter_confirm);
       view.setOnClickListener(new b$b(this));
       a.o(view, str);
       view.setSelected(true);
       this.q = view;
       p0.findViewById(R.id.school_filter_close).setOnClickListener(new b$c(this));
       return;
    }
    public final void S8(int p0,boolean p1){
       int i;
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uob, "8")) {
          return;
       }
       if (!p1) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10443f);
          return;
       }else {
          Iterator iterator = this.w.iterator();
          i = 0;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             b = true;
             boolean b1 = (p0 == i)? true: false;
             obj.setSelected(b1);
             b1 = this.P8(i);
             if (p0 != i) {
                b = false;
             }
             this.V8(b1, b, obj);
             i = i1;
          }
          return;
       }
    }
    public final void V8(boolean p0,boolean p1,TextView p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, b.class, "6")) {
          return;
       }
       if (!p0) {
          p2.setBackground(a1.f(R.drawable.arg_RES_7f081e53));
          p2.setTextColor(a1.a(R.color.arg_RES_7f0607be));
       }else if(p1){
          p2.setBackground(a1.f(R.drawable.arg_RES_7f081e52));
          p2.setTextColor(a1.a(R.color.arg_RES_7f061b29));
       }else {
          p2.setBackground(a1.f(R.drawable.arg_RES_7f081e53));
          p2.setTextColor(a1.a(R.color.arg_RES_7f06163d));
       }
       return;
    }
    public final void W8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       Iterator iterator = this.w.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          b = true;
          boolean b1 = (i == this.x)? true: false;
          obj.setSelected(b1);
          b1 = this.P8(i);
          if (i != this.x) {
             b = false;
          }
          this.V8(b1, b, obj);
          i = i1;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0e5f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.t = this.r8("SLIDE_PLAY_VIEW_MODEL");
       return;
    }
}
