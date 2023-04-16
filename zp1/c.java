package zp1.c;
import zp1.p;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import zp1.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Integer;
import yh3.a;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import zp1.j;
import com.kuaishou.live.common.core.component.follow.cache.c;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.LayoutInflater;
import ag6.a;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import android.graphics.Rect;
import java.lang.Float;
import fq1.d;
import lnc.a1;
import nsd.u;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import zp1.c$e;
import java.lang.Runnable;
import zp1.c$f;
import androidx.lifecycle.Transformations;
import zp1.c$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import zp1.c$b;
import d61.j0;
import xh3.g;
import zp1.d;
import zp1.f;
import zp1.g;
import android.view.View$OnClickListener;
import zp1.c$c;
import zp1.c$d;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import java.lang.CharSequence;

public abstract class c extends p	// class@004ae5
{
    public TextView A;
    public ViewGroup B;
    public j C;
    public final String D;
    public final b E;
    public final i F;
    public final l G;
    public View r;
    public ViewGroup s;
    public ViewGroup t;
    public ViewGroup u;
    public ImageView v;
    public View w;
    public TextView x;
    public LiveMediumTextView y;
    public ImageView z;

    public void c(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.D = p0;
       this.E = p1;
       this.F = p2;
       this.G = p3;
    }
    public void A3(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "38")) {
          return;
       }
       a.p(p0, "viewModel");
       return;
    }
    public void B3(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "37")) {
          return;
       }
       a.p(p0, "viewModel");
       return;
    }
    public final void C3(){
       if (PatchProxy.applyVoid(null, this, c.class, "28")) {
          return;
       }
       c tu = this.u;
       if (tu == null) {
          a.S("multiChatGiftContainer");
       }
       if (tu.getVisibility() != 8) {
          tu = this.w;
          if (tu == null) {
             a.S("multiChatCellInfoLayout");
          }
          tu.requestLayout();
       }
       return;
    }
    public final void D3(int p0){
       boolean b1;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "31")) {
          return;
       }
       boolean b = true;
       if (this.y3()) {
          if (a.g(this.b3().w0().getValue(), Boolean.TRUE)) {
             uoc = this.C;
             if (uoc != null && uoc.f() == b) {
                b1 = true;
             label_0042 :
                if (!c.b().c(this.D)) {
                   c tC = this.C;
                   if (tC != null && tC.e() == b) {
                   label_005a :
                      this.E3(p0, b1, b);
                   }
                }
                b = false;
                goto label_005a ;
             }
          }
          b1 = false;
          goto label_0042 ;
       }else {
          this.E3(p0, a.g(this.b3().w0().getValue(), Boolean.TRUE), (b ^ c.b().c(this.D)));
       }
       return;
    }
    public abstract void E3(int p0,boolean p1,boolean p2);
    public void J2(){
       if (PatchProxy.applyVoid(null, this, c.class, "36")) {
          return;
       }
       super.J2();
       k1.n(this);
       return;
    }
    public void V2(a p0){
       this.f3(p0);
    }
    public View W2(ViewGroup p0){
       c tr1;
       View view1;
       c uoc = c.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       boolean b = false;
       View view = a.c(LayoutInflater.from(this.D2()), this.g3(), p0, b);
       a.o(view, "LayoutInflater.from\(cont¡­ayoutId\(\), parent, false\)");
       this.r = view;
       if (view == null) {
          a.S("multiChatCellView");
       }
       view = view.findViewById(R.id.live_multi_chat_user_tag_container);
       a.o(view, "multiChatCellView.findVi¡­_chat_user_tag_container\)");
       this.t = view;
       c tr = this.r;
       if (tr == null) {
          a.S("multiChatCellView");
       }
       view = tr.findViewById(R.id.live_multi_chat_gift_container);
       a.o(view, "multiChatCellView.findVi¡­ulti_chat_gift_container\)");
       this.u = view;
       tr = this.r;
       if (tr == null) {
          a.S("multiChatCellView");
       }
       view = tr.findViewById(R.id.live_multi_chat_info_container);
       a.o(view, "multiChatCellView.findVi¡­ulti_chat_info_container\)");
       this.s = view;
       if (this.G.c()) {
          tr = this.u;
          if (tr == null) {
             a.S("multiChatGiftContainer");
          }
          tr.setVisibility(b);
       }else {
          this.v3();
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uoc, "21")) {
          tr1 = this.r;
          if (tr1 == null) {
             a.S("multiChatCellView");
          }
          view1 = tr1.findViewById(R.id.live_multi_chat_gift_layout);
          a.o(view1, "multiChatCellView.findVi¡­e_multi_chat_gift_layout\)");
          this.B = view1;
          tr1 = this.r;
          if (tr1 == null) {
             a.S("multiChatCellView");
          }
          view1 = tr1.findViewById(R.id.live_multi_chat_gift_text);
          a.o(view1, "multiChatCellView.findVi¡­ive_multi_chat_gift_text\)");
          this.A = view1;
          tr1 = this.r;
          if (tr1 == null) {
             a.S("multiChatCellView");
          }
          view1 = tr1.findViewById(R.id.live_multi_chat_gift_icon);
          a.o(view1, "multiChatCellView.findVi¡­ive_multi_chat_gift_icon\)");
          this.z = view1;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "20")) {
          tr1 = this.r;
          if (tr1 == null) {
             a.S("multiChatCellView");
          }
          view1 = tr1.findViewById(R.id.live_multi_chat_user_tag);
          a.o(view1, "multiChatCellView.findVi¡­live_multi_chat_user_tag\)");
          this.y = view1;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "22")) {
          tr = this.r;
          if (tr == null) {
             a.S("multiChatCellView");
          }
          view = tr.findViewById(R.id.live_multi_chat_info_layout);
          a.o(view, "multiChatCellView.findVi¡­e_multi_chat_info_layout\)");
          this.w = view;
          tr = this.r;
          if (tr == null) {
             a.S("multiChatCellView");
          }
          view = tr.findViewById(R.id.live_multi_chat_user_name);
          a.o(view, "multiChatCellView.findVi¡­ive_multi_chat_user_name\)");
          this.x = view;
          tr = this.r;
          if (tr == null) {
             a.S("multiChatCellView");
          }
          view = tr.findViewById(R.id.live_multi_chat_mute_icon);
          a.o(view, "multiChatCellView.findVi¡­ive_multi_chat_mute_icon\)");
          this.v = view;
       }
       tr = this.r;
       if (tr == null) {
          a.S("multiChatCellView");
       }
       this.x3(tr);
       tr = this.r;
       if (tr == null) {
          a.S("multiChatCellView");
       }
       return tr;
    }
    public void d3(float p0,Rect p1){
       j oj1;
       c c;
       j h;
       double d;
       j oj = this;
       float f = p0;
       d obj = p1;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), obj, oj, uoc, "30")) {
          return;
       }
       a.p(obj, "cellRect");
       obj = d.class;
       int i = 0;
       int i1 = 1;
       Integer integer = null;
       if (PatchProxy.isSupport(obj)) {
          oj1 = PatchProxy.applyOneRefs(Float.valueOf(p0), integer, obj, "8");
          if (oj1 != PatchProxyResult.class) {
          }else if(f - (float)i1 > 0 || f - (float)i < 0){
             oj1 = integer;
          }else {
             d = (double)f;
             float f1 = 16.00f;
             if (d - 0x3fd5c28f5c28f5c3 > 0) {
                float f2 = 20.00f;
                j oj2 = new j(false, false, false, a1.e(3.00f), a1.e(f2), a1.e(f2), 11, 11, 12, a1.e(0x41f00000), a1.e(f2), a1.e(6.00f), a1.e(0x41f00000), a1.e(89.00f), a1.e(f2), a1.e(f2), a1.e(f1), a1.e(f1), a1.e(14.00f), a1.e(14.00f), 7, null);
             }else {
                float f3 = 70.00f;
                float f4 = 4.00f;
                if (d - 0x3fd0a3d70a3d70a4 > 0) {
                   j oj3 = new j(false, false, false, 0, 0, 0, 9, 9, 10, a1.e(23.00f), a1.e(f1), a1.e(f4), a1.e(23.00f), a1.e(f3), a1.e(f1), a1.e(f1), a1.e(14.00f), a1.e(14.00f), a1.e(12.00f), a1.e(12.00f), 61, null);
                }else {
                   j oj4 = new j(false, false, false, 0, 0, 0, 9, 9, 10, a1.e(23.00f), a1.e(f1), a1.e(f4), a1.e(23.00f), a1.e(f3), a1.e(f1), a1.e(f1), a1.e(14.00f), a1.e(14.00f), a1.e(12.00f), a1.e(12.00f), 57, null);
                }
             }
          }
       }else {
          goto label_003d ;
       }
       oj.C = oj1;
       if (oj1 == null) {
          return;
       }else if(this.y3()){
          c y = oj.y;
          String str = "multiChatUserTagView";
          if (y == null) {
             a.S(str);
          }
          ViewGroup$LayoutParams layoutParams = y.getLayoutParams();
          c = oj.C;
          Integer integer1 = (c != null)? Integer.valueOf(c.k): integer;
          a.m(integer1);
          layoutParams.height = integer1.intValue();
          y = oj.y;
          if (y == null) {
             a.S(str);
          }
          c = oj.C;
          integer1 = (c != null)? Integer.valueOf(c.d()): integer;
          a.m(integer1);
          int i2 = integer1.intValue();
          c y1 = oj.y;
          if (y1 == null) {
             a.S(str);
          }
          int paddingTop = y1.getPaddingTop();
          c c1 = oj.C;
          Integer integer2 = (c1 != null)? Integer.valueOf(c1.d()): integer;
          a.m(integer2);
          int i3 = integer2.intValue();
          c y2 = oj.y;
          if (y2 == null) {
             a.S(str);
          }
          y.setPadding(i2, paddingTop, i3, y2.getPaddingBottom());
          y = oj.y;
          if (y == null) {
             a.S(str);
          }
          c = oj.C;
          integer1 = (c != null)? Integer.valueOf(c.m): integer;
          a.m(integer1);
          y.setMinWidth(integer1.intValue());
          y = oj.y;
          if (y == null) {
             a.S(str);
          }
          c = oj.C;
          integer1 = (c != null)? Integer.valueOf(c.n): integer;
          a.m(integer1);
          y.setMaxWidth(integer1.intValue());
          y = oj.C;
          if (y != null) {
             h = y.h;
             c = oj.y;
             if (c == null) {
                a.S(str);
             }
             c.setTextSize(i1, (float)h);
          }
          y = oj.z;
          str = "multiChatGiftImageView";
          if (y == null) {
             a.S(str);
          }
          layoutParams = y.getLayoutParams();
          c = oj.C;
          integer1 = (c != null)? Integer.valueOf(c.q): integer;
          a.m(integer1);
          layoutParams.width = integer1.intValue();
          y = oj.z;
          if (y == null) {
             a.S(str);
          }
          layoutParams = y.getLayoutParams();
          c = oj.C;
          integer1 = (c != null)? Integer.valueOf(c.r): integer;
          a.m(integer1);
          layoutParams.height = integer1.intValue();
          y = oj.C;
          if (y != null) {
             h = y.i;
             c = oj.A;
             if (c == null) {
                a.S("multiGiftNumberTextView");
             }
             c.setTextSize(i1, (float)h);
          }
          y = oj.z;
          if (y == null) {
             a.S(str);
          }
          c c2 = oj.C;
          int i4 = (c2 != null && (c2.c == i1 && oj.G.c()))? 0: 8;
          y.setVisibility(i4);
          y = oj.B;
          if (y == null) {
             a.S("multiGiftLayout");
          }
          layoutParams = y.getLayoutParams();
          c2 = oj.C;
          Integer integer3 = (c2 != null)? Integer.valueOf(c2.e): integer;
          a.m(integer3);
          layoutParams.height = integer3.intValue();
          y = oj.C;
          if (y != null) {
             h = y.g;
             c2 = oj.x;
             if (c2 == null) {
                a.S("multiChatUserNameTextView");
             }
             c2.setTextSize(i1, (float)h);
          }
          this.u3();
          y = oj.v;
          if (y == null) {
             a.S("multiChatMuteImageView");
          }
          c2 = oj.C;
          if (c2 == null || (c2.f() != i1 || !a.g(this.b3().w0().getValue(), Boolean.TRUE))) {
             i = 8;
          }
          y.setVisibility(i);
          y = oj.w;
          if (y == null) {
             a.S("multiChatCellInfoLayout");
          }
          layoutParams = y.getLayoutParams();
          c c3 = oj.C;
          if (c3 != null) {
             integer = Integer.valueOf(c3.f);
          }
          a.m(integer);
          layoutParams.height = integer.intValue();
          k1.s(new c$e(oj), oj, 0);
       }
       k1.s(new c$f(oj), oj, 0);
       return;
    }
    public void e3(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "18")) {
          return;
       }
       a.p(p0, "viewModel");
       LiveData liveData = Transformations.distinctUntilChanged(p0.d);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observe(this, new c$a(this));
       liveData = Transformations.distinctUntilChanged(p0.w0());
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observe(this, new c$b(this, p0));
       c tv = this.v;
       if (tv == null) {
          a.S("multiChatMuteImageView");
       }
       j0.b(tv, a1.e(2.00f));
       return;
    }
    public void f3(m p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "16")) {
          return;
       }
       a.p(p0, "viewModel");
       c tx = this.x;
       String str = "multiChatUserNameTextView";
       if (tx == null) {
          a.S(str);
       }
       g.a(tx, this, p0.j);
       this.e3(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "19")) {
          p0.v0().observe(this, new d(this, p0));
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "17")) {
          p0.f.observe(this, new f(this));
          uoc = this.B;
          String str1 = "multiGiftLayout";
          if (uoc == null) {
             a.S(str1);
          }
          j0.b(uoc, a1.e(6.00f));
          uoc = this.B;
          if (uoc == null) {
             a.S(str1);
          }
          uoc.setOnClickListener(new g(this, p0));
       }
       uoc = this.x;
       if (uoc == null) {
          a.S(str);
       }
       uoc.setOnClickListener(new c$c(p0));
       k1.s(new c$d(this), this, 0);
       c tD = this.D;
       e0 uoe0 = this.E.d();
       ClientContent$LiveStreamPackage liveStreamPa = this.E.f();
       int i = 1;
       int i1 = 0;
       boolean b = (!this.E.i(this.D) && (!this.E.j() && !c.b().c(this.D)))? true: false;
       boolean b1 = this.z3();
       boolean b2 = (!this.E.i(this.D) && this.G.c())? true: false;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{tD,uoe0,liveStreamPa,Boolean.valueOf(b),Boolean.valueOf(b1),Boolean.valueOf(b2)};
          if (PatchProxy.applyVoid(objArray, null, uoa, "11")) {
          label_0168 :
             return;
          }
       }
       a.p(tD, "userId");
       a.p(uoe0, "logPage");
       a.p(liveStreamPa, "liveStreamPackage");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "USER_CHAT";
       i3 oi3 = i3.f();
       oi3.c("if_follow_button", Integer.valueOf(b));
       str = (b1)? "VIDEO": "VOICE";
       oi3.d("type", str);
       str = (b2)? "1": "0";
       oi3.d("gift_area", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = a.b(liveStreamPa);
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       uContentPack.userPackage = userPackage;
       userPackage.identity = tD;
       u1.B0(new ShowMetaData().setLogPage(uoe0).setType(9).setElementPackage(uElementPack).setContentPackage(uContentPack));
       goto label_0168 ;
    }
    public abstract int g3();
    public final String h3(){
       c obj = PatchProxy.apply(null, this, c.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj == null) {
          a.S("multiGiftNumberTextView");
       }
       return obj.getText().toString();
    }
    public final j j3(){
       return this.C;
    }
    public final View k3(){
       c obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj == null) {
          a.S("multiChatCellInfoLayout");
       }
       return obj;
    }
    public final View l3(){
       c obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("multiChatCellView");
       }
       return obj;
    }
    public final ImageView m3(){
       c obj = PatchProxy.apply(null, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       if (obj == null) {
          a.S("multiChatGiftImageView");
       }
       return obj;
    }
    public final ImageView n3(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("multiChatMuteImageView");
       }
       return obj;
    }
    public final TextView o3(){
       c obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj == null) {
          a.S("multiChatUserNameTextView");
       }
       return obj;
    }
    public final LiveMediumTextView p3(){
       c obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          a.S("multiChatUserTagView");
       }
       return obj;
    }
    public final ViewGroup q3(){
       c obj = PatchProxy.apply(null, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.B;
       if (obj == null) {
          a.S("multiGiftLayout");
       }
       return obj;
    }
    public final int r3(){
       c obj = PatchProxy.apply(null, this, c.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.B;
       if (obj == null) {
          a.S("multiGiftLayout");
       }
       return obj.getMeasuredWidth();
    }
    public final int s3(){
       Object obj = PatchProxy.apply(null, this, c.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070840);
    }
    public final int t3(){
       Object obj = PatchProxy.apply(null, this, c.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070843);
    }
    public void u3(){
    }
    public final void v3(){
       if (PatchProxy.applyVoid(null, this, c.class, "26")) {
          return;
       }
       c tu = this.u;
       if (tu == null) {
          a.S("multiChatGiftContainer");
       }
       tu.setVisibility(8);
       return;
    }
    public final void w3(){
       if (PatchProxy.applyVoid(null, this, c.class, "27")) {
          return;
       }
       c tz = this.z;
       if (tz == null) {
          a.S("multiChatGiftImageView");
       }
       tz.setVisibility(8);
       return;
    }
    public void x3(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "23")) {
          return;
       }
       a.p(p0, "chatCellView");
       return;
    }
    public abstract boolean y3();
    public abstract boolean z3();
}
