package com.yxcorp.gifshow.relation.feed.presenter.a;
import android.view.View$OnLongClickListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.relation.feed.presenter.a$a;
import vy6.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.yxcorp.gifshow.relation.feed.presenter.a$b;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import com.yxcorp.gifshow.relation.feed.presenter.a$d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.growth.privacy.dialog.helper.j;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.yxcorp.gifshow.relation.feed.presenter.a$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import android.widget.TextView;
import ekd.m1;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import y8c.g;
import gac.b;
import a7c.h;
import f7c.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.relation.feed.model.PymkRecoBigCardFeed;
import io.reactivex.subjects.PublishSubject;
import fac.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import g9c.a;
import com.kwai.framework.model.user.RecoUser;

public class a extends PresenterV2 implements View$OnLongClickListener	// class@0018a5
{
    public c A;
    public SwipeLayout B;
    public g C;
    public c D;
    public b p;
    public c q;
    public h r;
    public BaseFragment s;
    public PymkRecoBigCardFeed t;
    public SlidePlayViewModel u;
    public QPhoto v;
    public PublishSubject w;
    public View x;
    public TextView y;
    public KwaiEmptyStateView z;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.s.getParentFragment());
       this.u = slidePlayVie;
       slidePlayVie.P(this.s, new a$a(this));
       this.B = w9.c(this.s.requireActivity());
       this.X7(this.w.subscribe(new a$b(this)));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (VisitorModeManager.f()) {
          return;
       }
       d uod = new d(this.getActivity());
       uod.b1(KwaiDialogOption.d);
       uod.L(new a$d(this));
       uod.O(j.a);
       this.A = uod.Y(new a$c(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.y = p0.findViewById(0x7f0a2a4a);
       this.x = p0.findViewById(0x7f0a4430);
       this.z = m1.f(p0, 0x7f0a0d35);
       this.m8().setOnLongClickListener(this);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.C = this.r8("ADAPTER");
       this.p = this.r8("PAGE_LIST");
       this.r = this.r8("PYMK_ACCESS_IDSPYMK_PARAMS");
       this.q = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       this.s = this.r8("FRAGMENT");
       this.t = this.q8(PymkRecoBigCardFeed.class);
       this.w = this.r8("PYMK_ACCESS_IDSbigcard_btn");
       this.D = this.r8("PYMK_ACCESS_IDScard_size");
       this.v = this.q8(QPhoto.class);
       return;
    }
    public boolean onLongClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       RecoUser recoUser = this.C.N0(0);
       if (recoUser != null && (recoUser.mUser != null && recoUser.mType != 2)) {
          this.P8();
       }
    label_002a :
       return true;
    }
}
