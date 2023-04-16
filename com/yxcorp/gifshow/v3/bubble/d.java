package com.yxcorp.gifshow.v3.bubble.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.bubble.d$a;
import com.yxcorp.gifshow.v3.bubble.d$b;
import poc.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.v3.BubbleType;
import java.util.List;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import com.yxcorp.gifshow.bubble.b;
import com.kwai.robust.PatchProxyResult;
import ra9.c;
import poc.l;
import io.reactivex.g;
import brd.t;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import android.view.View;
import ooc.c;
import qsc.b;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import yaa.c;
import iba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import im8.f;
import voc.o;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;

public class d extends PresenterV2	// class@000d33
{
    public PostBubbleManager A;
    public j0 B;
    public boolean C;
    public final boolean D;
    public final boolean E;
    public final List F;
    public final r0 G;
    public s H;
    public final a I;
    public View p;
    public GifshowActivity q;
    public f r;
    public c s;
    public a t;
    public c u;
    public f v;
    public f w;
    public o x;
    public f y;
    public VideoSDKPlayerView z;
    public static final int J;

    static {
       d.J = a1.e(8.00f);
    }
    public void d(){
       super();
       this.C = false;
       this.D = PostExperimentUtils.S();
       this.E = PostExperimentUtils.T();
       this.F = new ArrayList();
       this.G = new d$a(this);
       this.H = new d$b(this);
       this.I = new k(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       this.r.d(this.H);
       this.y.d(this.I);
       this.B.o0().d(this.G);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       this.r.c(this.H);
       this.R8(BubbleType.TYPE_WITH_EDIT_ACTION);
       this.y.b();
       this.B.o0().c(this.G);
       return;
    }
    public b P8(List p0,List p1,EditBubbleItem p2){
       b obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b(p2);
       obj.h(t.create(new l(this, p0, p1, obj)));
       return obj;
    }
    public void R8(BubbleType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "10")) {
          return;
       }
       this.A.c();
       return;
    }
    public View S8(List p0,EditorItemFunc p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b(p0, p1);
    }
    public void V8(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       if (p0 == EditorItemFunc.PIC_TEMPLATE_V2) {
          b a = b.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(null, a, b.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "TEMPLATE_BUBBLE";
             u1.u0(3, uElementPack, null);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a318f);
       this.z = p0.findViewById(0x7f0a30f6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.r = this.r8("EDITOR_ITEM_LISTENERS");
       this.s = this.r8("MUSIC");
       this.t = this.r8("THEME");
       this.u = this.r8("WORKSPACE");
       this.v = this.x8("TASK_ID");
       this.w = this.w8("EDITOR_MANAGER");
       this.x = this.r8("EDITOR_CONTEXT");
       this.y = this.r8("BUBBLE_DISMISS_LIETENER");
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity);
       this.q = activity;
       this.B = ViewModelProviders.of(activity).get(j0.class);
       this.A = PostBubbleManager.e(this.q);
       return;
    }
}
