package o81.g;
import lnc.a1;
import java.lang.Object;
import r81.c$a;
import java.util.WeakHashMap;
import r81.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import n81.d;
import z1.k;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.lang.Boolean;
import java.util.Map;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import o81.g$a;
import d61.j0;
import android.view.ViewGroup;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.basic.widget.HollowTextView;
import java.lang.CharSequence;
import android.widget.TextView;
import r81.c$f;
import o81.c;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import o81.g$b;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentBadgeSegment;
import cp3.b;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentIconSegment;
import com.kuaishou.live.richtext.segment.IconSegmentDecoder;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;
import h81.b;
import h81.a;
import o81.b;
import h81.e;
import android.text.style.ClickableSpan;

public class g	// class@0034ae
{
    public c a;
    public c b;
    public final Map c;
    public g$b d;
    public g$a e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public e l;
    public boolean m;
    public k n;
    public e o;
    public d p;
    public static final int q;
    public static final int r;
    public static final int s;

    static {
       g.q = g.j(14.00f);
       g.r = a1.e(14.00f);
       g.s = a1.e(13.50f);
    }
    public void g(){
       super();
       this.a = new c$a();
       this.c = new WeakHashMap();
       this.i = 0;
       this.m = false;
       this.f = g.j(this.a.h());
    }
    public static int j(float p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, og, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return n.c0(a.a().a(), p0);
    }
    public g A(boolean p0){
       if (p0) {
          this.i = 1;
       }
       return this;
    }
    public g B(boolean p0){
       this.j = p0;
       return this;
    }
    public g C(d p0){
       this.p = p0;
       return this;
    }
    public g D(k p0){
       this.n = p0;
       return this;
    }
    public LiveSpannable$a a(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b(a1.f(p0));
    }
    public LiveSpannable$a b(Drawable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c(p0, p0.getIntrinsicWidth(), p0.getIntrinsicHeight());
    }
    public LiveSpannable$a c(Drawable p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       LiveSpannable$a uoa = new LiveSpannable$a(p0);
       float f = (float)this.f * a.a().a().getResources().getConfiguration().fontScale;
       float f1 = (float)g.q;
       if (!f - f1) {
          uoa.d(p1, p2);
          return uoa;
       }else {
          f = f / f1;
          uoa.d((int)((float)p1 * f), (int)(f * (float)p2));
          return uoa;
       }
    }
    public c d(){
       g obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n;
       if (obj != null) {
          this.a.a4(obj.get().booleanValue());
       }
       return this.a;
    }
    public LiveSpannable$a e(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.f(a1.p(p0));
    }
    public LiveSpannable$a f(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       BitmapDrawable obj = PatchProxy.applyOneRefs(p0, this, og, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.c.get(p0);
       if (obj == null) {
          obj = PatchProxy.applyOneRefs(p0, this, og, "8");
          if (obj != patchProxyRe) {
          }else {
             g te = this.e;
             if (te != null) {
                obj = j0.d(te.a(p0));
             }else {
                BitmapDrawable uBitmapDrawa = PatchProxy.applyOneRefs(p0, this, og, "15");
                if (uBitmapDrawa != patchProxyRe) {
                }else {
                   View view = a.c(a.B, R.layout.arg_RES_7f0d0abd, null);
                   View view1 = view.findViewById(R.id.button_icon);
                   if (this.j != null) {
                      ViewGroup$LayoutParams layoutParams = view1.getLayoutParams();
                      layoutParams.height = a1.e(17.50f);
                      view1.setLayoutParams(layoutParams);
                      view1.setPadding(a1.d(R.dimen.arg_RES_7f070334), 0, a1.d(R.dimen.arg_RES_7f070334), a1.d(R.dimen.arg_RES_7f0702ac));
                   }
                   if (view1 instanceof HollowTextView) {
                      view1.setText(p0);
                   }
                   uBitmapDrawa = j0.d(view);
                }
                obj = uBitmapDrawa;
             }
          }
          this.c.put(p0, obj);
       }
       LiveSpannable$a uoa = this.b(obj);
       if (this.a instanceof c$f) {
          uoa.b(-1);
       }
       return uoa;
    }
    public c g(){
       return this.b;
    }
    public int h(){
       g ti = this.i;
       if (ti == 2) {
          return 0x7f060649;
       }
       if (ti != 3) {
          return 0x7f060687;
       }
       return 0x7f06032f;
    }
    public String i(QLiveMessage p0){
       g obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          return null;
       }
       return obj.K8(p0);
    }
    public int k(){
       if (this.i != 3) {
          return 0x7f060687;
       }
       return 0x7f06032f;
    }
    public int l(){
       if (this.i != 3) {
          return 0x7f06031c;
       }
       return 0x7f060680;
    }
    public boolean m(){
       return this.g;
    }
    public boolean n(){
       return this.k;
    }
    public boolean o(){
       return this.h;
    }
    public boolean p(){
       boolean b = (this.i != null)? true: false;
       return b;
    }
    public boolean q(){
       return this.m;
    }
    public boolean r(){
       g obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.n;
       if (obj == null) {
          return false;
       }
       this.a.a4(obj.get().booleanValue());
       return this.n.get().booleanValue();
    }
    public LiveSpannable$a s(UserStateRichTextSegment p0){
       LiveSpannable$a uoa1;
       LiveSpannable$a uoa2;
       Drawable uDrawable;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyOneRefs(p0, this, g.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.d == null) {
          this.d = new g$b(this);
       }
       obj = this.d;
       Objects.requireNonNull(obj);
       LiveSpannable$a uoa = PatchProxy.applyOneRefs(p0, obj, g$b.class, "1");
       if (uoa != patchProxyRe) {
       }else {
          uoa = null;
          if (p0 != null) {
             int entryCase = p0.getEntryCase();
             if (entryCase != 1) {
                if (entryCase != 2) {
                   uoa1 = uoa;
                   uoa2 = uoa1;
                label_0064 :
                   if (uoa2 != null && uoa2.getIntrinsicHeight()) {
                      int r = g.r;
                      if (obj.c.j != null) {
                         r = g.s;
                      }
                      uoa = obj.c.c(uoa2, ((uoa2.getIntrinsicWidth() * r) / uoa2.getIntrinsicHeight()), r);
                      if (uoa1 != null) {
                         uoa.a(new b(obj.c.o, a.a(uoa1)));
                      }
                   }
                }else {
                   LiveCommentRichText$CommentBadgeSegment badgeSegment = p0.getBadgeSegment();
                   if (badgeSegment != null) {
                      uDrawable = obj.b.a(badgeSegment);
                   }else {
                      uDrawable = uoa;
                   }
                }
             }else {
                LiveCommentRichText$CommentIconSegment iconSegment = p0.getIconSegment();
                uoa2 = (iconSegment != null)? obj.a.a(iconSegment): uoa;
                if (iconSegment != null) {
                   iconSegment = iconSegment.tapAction;
                   goto label_0064 ;
                }else {
                   uDrawable = uoa2;
                }
             }
             uoa2 = uDrawable;
             uoa1 = uoa;
             goto label_0064 ;
          }
       }
       return uoa;
    }
    public g t(boolean p0){
       this.k = p0;
       return this;
    }
    public g u(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a = p0;
       this.f = g.j(p0.h());
       return this;
    }
    public g v(boolean p0){
       this.m = p0;
       return this;
    }
    public g w(boolean p0){
       this.h = p0;
       return this;
    }
    public void x(g$a p0){
       this.e = p0;
    }
    public g y(boolean p0){
       this.g = p0;
       return this;
    }
    public g z(c p0){
       this.b = p0;
       return this;
    }
}
