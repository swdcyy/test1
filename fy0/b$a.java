package fy0.b$a;
import fy0.b$b;
import fy0.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fy0.j$a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t02.a0;
import ft5.b;
import xl8.b;
import ow0.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import fy0.j;
import java.util.Objects;
import java.util.List;
import lnc.a1;
import java.util.Collections;
import fy0.i;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import fy0.f;
import androidx.recyclerview.widget.RecyclerView$n;
import fy0.i$a;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.CharSequence;
import fq5.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import hy0.v;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class b$a implements b$b	// class@0023cc
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "5")) {
          return;
       }
       this.a.W8();
       return;
    }
    public j$a b(int p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.P8(p0, p1);
    }
    public void c(boolean p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       uoa = this.a;
       if (uoa.r == null) {
          return;
       }
       if (uoa.w.Y1.Kh()) {
          return;
       }
       if (!this.a.S8(4)) {
          return;
       }
       if (this.a.t.a().intValue() == 4) {
          return;
       }
       int intx = a.a.getInt(b.d("user")+"live_comment_editor_panel_last_selected_tab", 0);
       if (intx == 4 || (p0 && !intx)) {
          this.a.t.d(Integer.valueOf(4));
          this.a.V8(0);
       }
       return;
    }
    public boolean d(){
       boolean b = (this.a.r != null)? true: false;
       return b;
    }
    public void e(j p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       b$a ta = this.a;
       if (ta.r == null) {
          return;
       }
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, uob, "6") && ta.s.isEmpty()) {
          j$a uoa = ta.P8(1, 1);
          uoa.c(a1.p(R.string.arg_RES_7f101fa7));
          uoa.b(R.drawable.arg_RES_7f08117c);
          ta.s.add(uoa.a());
       }
       this.a.s.add(p0);
       Collections.sort(this.a.s);
       b$a ta1 = this.a;
       b u = ta1.u;
       b s = ta1.s;
       Objects.requireNonNull(u);
       i oi = i.class;
       String str = "1";
       if (!PatchProxy.applyVoidOneRefs(s, u, oi, str)) {
          if (!PatchProxy.applyVoid(null, u, oi, "4") && u.b == null) {
             ViewGroup viewGroup = u.a.inflate();
             u.b = viewGroup;
             u.d = viewGroup.findViewById(0x7f0a1b47);
             u.c = u.b.findViewById(0x7f0a1b41);
             oi = u.d;
             oi.setLayoutManager(new LinearLayoutManager(oi.getContext(), false, false));
             u.d.addItemDecoration(new f(u));
          }
          oi = u.e;
          if (oi == null) {
             u.e = new i$a(s);
          }else if(PatchProxy.applyVoidOneRefs(s, oi, i$a.class, str)){
             oi.e.clear();
             oi.e.addAll(s);
          }
          if (u.d.getAdapter() == null) {
             u.d.setAdapter(u.e);
          }
          u.e.k0();
       }
       ta1 = this.a;
       Objects.requireNonNull(ta1);
       if (!PatchProxy.applyVoid(null, ta1, uob, "12") && !ta1.t.a().intValue()) {
          if (ta1.w.Y1.Kh()) {
             ta1.t.d(Integer.valueOf(2));
          }else {
             ta1.t.d(Integer.valueOf(1));
          }
          ta1.V8(false);
       }
       return;
    }
    public boolean f(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.a.t.a().intValue() == p0)? true: false;
       return b;
    }
    public CharSequence g(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.R8();
    }
    public void h(boolean p0){
       int b;
       int i;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoa, uob, "5") && uoa.r != null)) {
          uob = uoa.u;
          Objects.requireNonNull(uob);
          i oi = i.class;
          String str = null;
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, oi, "3")) {
             i b1 = uob.b;
             if (b1 != null) {
                b = (p0)? 0: 8;
                b1.setVisibility(b);
             }
          }
          if (p0) {
             b = true;
             if (uoa.t.a().intValue() == 2) {
                uoa.w.Y1.nn(b);
             }else if(uoa.t.a().intValue() == 4){
                uoa.w.Y1.Ii(b);
             }
             ClientContent$LiveStreamPackage liveStreamPa = uoa.w.b().a();
             i = uoa.t.a().intValue();
             v ov = v.class;
             if (!PatchProxy.isSupport(ov) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Integer.valueOf(i), null, ov, "1")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "COMMENT_TYPE_TAB";
                i3 oi3 = i3.f();
                oi3.d("select_tab", v.f(i));
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                u1.u0(9, uElementPack, uContentPack);
             }
          }else {
             uoa.w.Y1.nn(str);
             uoa.w.Y1.Ii(str);
          }
       }
    label_00f1 :
       return;
    }
    public boolean i(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.a.S8(p0);
    }
}
