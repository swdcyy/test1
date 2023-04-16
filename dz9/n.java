package dz9.n;
import mf5.k;
import mf5.w0;
import dz9.n$a;
import nsd.u;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.component.photo.reduce.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import e0a.j;
import id5.o;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import dz9.n$b;
import android.view.View$OnClickListener;
import android.view.View;
import dz9.n$c;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.CharSequence;

public final class n extends w0 implements k	// class@00201c
{
    public final PhotoDetailParam C;
    public final QPhoto D;
    public final BaseFragment E;
    public final d F;
    public final SlidePlayViewModel G;
    public View H;
    public KwaiImageView I;
    public TextView J;
    public View K;
    public KwaiImageView L;
    public TextView M;
    public final m0 N;
    public final SlidePageConfig O;
    public static final n$a P;

    static {
       n.P = new n$a(null);
    }
    public void n(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("interest_management_type_v1");
       this.N = p0;
       this.O = p1;
       a c = p0.c;
       this.C = c;
       PhotoDetailParam mPhoto = c.mPhoto;
       this.D = mPhoto;
       a b = p0.b;
       this.E = b;
       this.F = new d(mPhoto, p0.a);
       a.o(b, "fragment");
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(b.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(fragment.parentFragment\)");
       this.G = slidePlayVie;
    }
    public static final TextView W(n p0){
       p0 = p0.J;
       if (p0 == null) {
          a.S("reduceRecoTitle");
       }
       return p0;
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.O.a0() && (j.e() && !o.d(this.D)))? true: false;
       return b;
    }
    public final void X(String p0,int p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, on, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 18;
       uElementPack.action2 = "NO_INTEREST_BTN_IN_LONG_PRESS_MASK";
       i3 oi3 = i3.f();
       oi3.d("source", "PLAYER_PANEL_SHARE");
       oi3.c("btn_type", Integer.valueOf(p1));
       if (p0 != null) {
          oi3.d("btn_text", p0);
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.D.mEntity);
       u1.D0("", this.E, 10, uElementPack, uContentPack, null);
       return;
    }
    public void a(){
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       n tH = this.H;
       if (tH == null) {
          a.S("reduceReco");
       }
       tH.setOnClickListener(new n$b(this));
       tH = this.K;
       if (tH == null) {
          a.S("increaseReco");
       }
       tH.setOnClickListener(new n$c(this));
       return;
    }
    public void c(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       LayoutInflater.from(p0.getContext()).inflate(R.layout.arg_RES_7f0d10ea, p0);
       View view = p0.findViewById(R.id.reduce_reco);
       a.o(view, "rootView.findViewById\(R.id.reduce_reco\)");
       this.H = view;
       view = p0.findViewById(R.id.reduce_reco_icon);
       a.o(view, "rootView.findViewById\(R.id.reduce_reco_icon\)");
       this.I = view;
       view = p0.findViewById(R.id.reduce_reco_title);
       a.o(view, "rootView.findViewById\(R.id.reduce_reco_title\)");
       this.J = view;
       view = p0.findViewById(R.id.increase_reco);
       a.o(view, "rootView.findViewById\(R.id.increase_reco\)");
       this.K = view;
       view = p0.findViewById(R.id.increase_reco_icon);
       a.o(view, "rootView.findViewById\(R.id.increase_reco_icon\)");
       this.L = view;
       View view1 = p0.findViewById(R.id.increase_reco_title);
       a.o(view1, "rootView.findViewById\(R.id.increase_reco_title\)");
       this.M = view1;
       n tI = this.I;
       if (tI == null) {
          a.S("reduceRecoIcon");
       }
       tI.setImageResource(R.drawable.arg_RES_7f08052c);
       tI = this.L;
       if (tI == null) {
          a.S("increaseRecoIcon");
       }
       tI.setImageResource(R.drawable.arg_RES_7f080b0f);
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, n.class, "4")) {
          return;
       }
       n tJ = this.J;
       if (tJ == null) {
          a.S("reduceRecoTitle");
       }
       this.X(tJ.getText().toString(), 1);
       tJ = this.M;
       if (tJ == null) {
          a.S("increaseRecoTitle");
       }
       this.X(tJ.getText().toString(), 2);
       return;
    }
}
