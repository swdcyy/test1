package com.kuaishou.post.story.edit.decoration.text.j0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import com.kuaishou.post.story.widget.StoryEditText;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.lang.Integer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import dq4.f;
import rp4.c;
import ekd.m1;
import dq4.v;
import android.view.View$OnClickListener;
import dq4.w;
import dq4.x;

public class j0 extends PresenterV2	// class@000b01
{
    public Button p;
    public Button q;
    public Button r;
    public StoryEditText s;
    public ImageView t;
    public View u;
    public ViewGroup v;
    public ViewGroup w;
    public StoryTextDrawer x;
    public int y;
    public int z;
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;

    static {
       j0.A = a1.e(12.00f);
       j0.B = a1.e(19.00f);
       j0.C = a1.e(24.00f);
       j0.D = a1.e(0x3f800000);
       j0.E = a1.e(68.00f);
       j0.F = a1.e(8.00f);
       j0.G = a.a().a().getResources().getColor(0x7f060658);
    }
    public void j0(){
       super();
       this.z = 0;
    }
    public void E8(){
       j0 oj0 = j0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj0, "3")) {
          return;
       }
       j0 tx = this.x;
       if (tx != null) {
          int textMode = tx.getTextMode();
          this.z = textMode;
          this.s.setTextMode(textMode);
          this.R8();
       }
       if (!PatchProxy.applyVoid(objArray, this, oj0, "4") && this.getActivity() != null) {
          int i = (int)((float)((n.k(this.getActivity()) - (((j0.C * 2) + (j0.E * 3)) + j0.D)) - (j0.B * 2)) / 5.00f);
          int a = j0.A;
          if (i < a) {
             i = a;
          }
          this.t.getLayoutParams().leftMargin = i;
          this.u.getLayoutParams().leftMargin = i;
          this.v.getLayoutParams().leftMargin = i;
          this.q.getLayoutParams().leftMargin = i;
          this.r.getLayoutParams().leftMargin = i;
          this.w.requestLayout();
       }
       this.r.setShadowLayer((float)j0.F, 0, 0, j0.G);
       return;
    }
    public final void P8(int p0){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj0, "5")) {
          return;
       }
       this.z = p0;
       this.x.setTextMode(p0);
       this.s.setTextMode(this.z);
       this.x.sync();
       this.R8();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = this.y;
       uElementPack.name = "select_text_font";
       uElementPack.params = c.a("font_style", f.c(this.z));
       c.c(uElementPack);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "6")) {
          return;
       }
       j0 tp = this.p;
       boolean b = false;
       boolean b1 = (this.z == null)? true: false;
       tp.setSelected(b1);
       tp = this.q;
       b1 = (this.z == 1)? true: false;
       tp.setSelected(b1);
       tp = this.r;
       if (this.z == 2) {
          b = true;
       }
       tp.setSelected(b);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3e28);
       this.q = m1.f(p0, 0x7f0a3e2a);
       this.r = m1.f(p0, 0x7f0a3e29);
       this.t = m1.f(p0, 0x7f0a3df7);
       this.s = m1.f(p0, 0x7f0a3e20);
       this.u = m1.f(p0, 0x7f0a0bdd);
       this.v = m1.f(p0, 0x7f0a3e26);
       this.w = m1.f(p0, 0x7f0a3e07);
       m1.a(p0, new v(this), R.id.text_mode_switch_classic);
       m1.a(p0, new w(this), R.id.text_mode_switch_strong);
       m1.a(p0, new x(this), R.id.text_mode_switch_neon);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       this.x = this.r8("STORY_TEXT_DRAWER");
       this.y = this.r8("LOGGER_ACTION").intValue();
       return;
    }
}
