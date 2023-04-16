package nmd.q;
import yld.l;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nmd.q$f;
import nmd.q$a;
import ynd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nmd.q$b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import mod.a;
import smd.d;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import java.util.Objects;
import nmd.q$c;
import nmd.q$d;
import java.lang.Boolean;
import xld.a;
import qmd.a;
import fmd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;
import faa.a;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import qvc.b;
import qmd.f;
import android.widget.PopupWindow;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Integer;
import java.lang.StringBuilder;
import androidx.fragment.app.FragmentActivity;
import ttc.e;
import android.content.Intent;
import android.app.Activity;
import nmd.r;
import z1.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.ArrayList;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData;
import java.util.Collection;
import lmd.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerKeyboardPanelViewBinder$initPopupIfNeeded$clickConsumer$1;
import nmd.s;
import nmd.u;
import msd.l;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.utility.n;
import ttc.a;
import rmd.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog;
import nmd.q$h;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPageList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayDataItem;
import qvb.n0;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayRecoInputInfo;
import nmd.q$g;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.relay.RelayStickerFriendsDialogAction;
import xvc.b;
import nmd.q$e;
import nmd.q$i;
import erd.r;
import kotlin.collections.CollectionsKt___CollectionsKt;
import lnc.a1;

public class q extends KeyBoardPanelBaseViewBinder implements l	// class@001e73
{
    public final b A;
    public final q$a B;
    public a x;
    public a y;
    public SelectFriendsDialog z;

    public void q(Fragment p0,View p1,EditorDelegate p2){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "delegate");
       super(p1, p0, false, true, p2);
       this.A = new q$f(this);
       this.B = new q$a(this);
    }
    public c F(){
       Object obj = PatchProxy.apply(null, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new q$b();
    }
    public DecorationContainerView$d G(){
       return this.B;
    }
    public a I(){
       Object obj = PatchProxy.apply(null, this, q.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h0().o0().y();
    }
    public EditDecorationBaseDrawer J(){
       EditDecorationBaseDrawer obj = PatchProxy.apply(null, this, q.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.N().getSelectDrawer() instanceof NewEditStickerBaseDrawer) {
          obj = this.N().getSelectDrawer();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer<out com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData>");
       }else {
          obj = super.J();
       }
       return obj;
    }
    public c K(){
       Object obj = PatchProxy.apply(null, this, q.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new q$c();
    }
    public EditReduxViewModel P(){
       return this.h0();
    }
    public c T(){
       Object obj = PatchProxy.apply(null, this, q.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new q$d();
    }
    public boolean V(){
       Object obj = PatchProxy.apply(null, this, q.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.h0().o0().s();
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, q.class, "11")) {
          return;
       }
       super.Z();
       q ty = this.y;
       if (ty != null) {
          a uoa = ty.b();
          if (uoa != null) {
             uoa.e();
          }
       }
       return;
    }
    public void a0(){
       if (PatchProxy.applyVoid(null, this, q.class, "10")) {
          return;
       }
       super.a0();
       if (this.N().getSelectDrawer() instanceof NewRelayStickerDrawer) {
          q ty = this.y;
          if (ty != null) {
             a uoa = ty.b();
             if (uoa != null) {
                uoa.a();
             }
          }
       }
       return;
    }
    public void d0(){
       q tx;
       if (PatchProxy.applyVoid(null, this, q.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("StickerKeyboardPanelViewBinder", "releaseTextPanelPopup: ", objArray);
       if (this.x != null) {
          if (this.N().getSelectDrawer() instanceof NewTagStickerElement) {
             EditDecorationBaseDrawer selectDrawer = this.N().getSelectDrawer();
             Objects.requireNonNull(selectDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement");
             selectDrawer.removeOnTextChangeWatcher(this.A);
          }
          if (this.x instanceof f) {
             this.l0();
          }
          tx = this.x;
          a.m(tx);
          tx.dismiss();
          this.x = null;
       }
       tx = this.z;
       if (tx != null) {
          tx.dismissAllowingStateLoss();
       }
       this.z = null;
       return;
    }
    public void f0(int p0){
       EditDecorationBaseDrawer selectDrawer;
       EditDecorationBaseDrawer selectDrawer1;
       FragmentActivity uFragmentAct;
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oq, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       String str = "StickerKeyboardPanelViewBinder";
       a.D().w(str, "showTextPanelPopup: offsetY = "+p0, objArray);
       if (p0 <= 0) {
          return;
       }
       if (this.L().getActivity() == null) {
          return;
       }
       String str1 = "fragment.requireActivity\(\)";
       if (this.N().getSelectDrawer() instanceof NewTagStickerElement) {
          selectDrawer = this.N().getSelectDrawer();
          Objects.requireNonNull(selectDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement");
          if (!PatchProxy.applyVoidOneRefs(selectDrawer, this, oq, "16")) {
             Object[] objArray1 = new Object[0];
             a.D().w(str, "initPopupIfNeeded: NewTagStickerElement", objArray1);
             if (this.x == null) {
                uFragmentAct = this.L().requireActivity();
                a.o(uFragmentAct, str1);
                String str2 = PatchProxy.apply(null, this, oq, "15");
                if (str2 != PatchProxyResult.class) {
                }else {
                   FragmentActivity uFragmentAct1 = this.L().requireActivity();
                   a.o(uFragmentAct1, str1);
                   Intent intent = uFragmentAct1.getIntent();
                   if (intent != null) {
                      str2 = intent.getStringExtra("editSessionId");
                      Object[] objArray2 = new Object[0];
                      a.D().w(str, "getEditSessionId: sessionId = "+str2, objArray2);
                      if (str2 == null) {
                      }
                   }else {
                   }
                }
                this.x = new e(uFragmentAct, str2, new r(this, selectDrawer));
             }
          }
          selectDrawer1 = this.N().getSelectDrawer();
          Objects.requireNonNull(selectDrawer1, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement");
          selectDrawer1.addOnTextChangeWatcher(this.A);
       }else if(this.N().getSelectDrawer() instanceof NewRelayStickerDrawer){
          selectDrawer = this.N().getSelectDrawer();
          Objects.requireNonNull(selectDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer");
          if (!PatchProxy.applyVoidOneRefs(selectDrawer, this, oq, "17")) {
             objArray = new Object[0];
             a.D().w(str, "initPopupIfNeeded: NewRelayStickerDrawer", objArray);
             if (this.x == null) {
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                ArrayList uArrayList = new ArrayList();
                NewStickerElementData elementData = selectDrawer.getElementData();
                Objects.requireNonNull(elementData, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData");
                objectRef.element = elementData.W0();
                uArrayList.addAll(elementData.T0());
                int i = ((objectRef.element).length() > 0)? 1: 0;
                int i1 = (this instanceof b)? i ^ 0x01: false;
                uFragmentAct = this.L().requireActivity();
                a.o(uFragmentAct, str1);
                f uof = new f(uFragmentAct, i1, i, new u(new StickerKeyboardPanelViewBinder$initPopupIfNeeded$clickConsumer$1(this, selectDrawer, objectRef)), new s(this));
                objectRef.c(uArrayList);
                this.x = objectRef;
             }
          }
       }
       selectDrawer1 = this.N().getTopElement();
       if (selectDrawer1 != null && selectDrawer1.mIsSelected == null) {
          return;
       }else {
          oq = this.x;
          if (oq != null) {
             if (oq.getWidth() <= 0) {
                oq.setWidth(n.k(this.L().requireActivity()));
             }
             p0 = p0 - oq.a();
             if (oq.isShowing()) {
                oq.update(0, p0, oq.getWidth(), oq.getHeight());
             }else {
                oq.showAtLocation(this.L().requireView(), 48, 0, p0);
             }
          }
          return;
       }
    }
    public final a g0(){
       return this.y;
    }
    public d h0(){
       Object obj = PatchProxy.apply(null, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.a(this.L());
    }
    public void i0(b p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q.class, "8")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       this.U(p0.y(), p1.y());
       return;
    }
    public final void j0(NewRelayStickerDrawer p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "18")) {
          return;
       }
       SelectFriendsDialog selectFriend = new SelectFriendsDialog(new q$h(this));
       ArrayList uArrayList = new ArrayList();
       NewStickerElementData elementData = p0.getElementData();
       Objects.requireNonNull(elementData, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData");
       uArrayList.addAll(elementData.T0());
       q tx = this.x;
       if (tx instanceof f) {
          Objects.requireNonNull(tx, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPopupWindow");
          Object[] objArray = null;
          ArrayList uArrayList1 = PatchProxy.apply(objArray, tx, f.class, "3");
          if (uArrayList1 != patchProxyRe) {
          }else {
             f c1 = tx.c;
             if (c1 == null) {
                a.S("mPageList");
             }
             ArrayList uArrayList2 = new ArrayList();
             Iterator iterator = c1.h2().iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                Object obj1 = (obj.getType() == 1)? 1: null;
                if (obj1) {
                   uArrayList2.add(obj);
                }
             }
             uArrayList1 = uArrayList2;
          }
          Object[] objArray1 = PatchProxy.apply(objArray, tx, f.class, "4");
          if (objArray1 != patchProxyRe) {
          }else {
             f c = tx.c;
             if (c == null) {
                a.S("mPageList");
             }
             RelayRecoInputInfo relayRecoInp = c.L0();
             if (relayRecoInp != null) {
                objArray = relayRecoInp.getCursor();
             }
             objArray1 = objArray;
          }
          if (!PatchProxy.applyVoidTwoRefs(uArrayList1, objArray1, selectFriend, SelectFriendsDialog.class, "8")) {
             SelectFriendsDialog b = selectFriend.B;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidTwoRefs(uArrayList1, objArray1, b, RelayInputPageList.class, "3")) {
                if (uArrayList1 != null) {
                   b.r.addAll(uArrayList1);
                }
                b.s = objArray1;
             }
          }
       }
    label_00c1 :
       if (!PatchProxy.applyVoidOneRefs(uArrayList, selectFriend, SelectFriendsDialog.class, "7")) {
          a.p(uArrayList, "selectedFriends");
          selectFriend.B.i2().clear();
          selectFriend.B.i2().addAll(uArrayList);
       }
       selectFriend.k0(new q$g(this));
       c fragmentMana = this.L().getFragmentManager();
       if (fragmentMana != null) {
          FragmentActivity uFragmentAct = this.L().requireActivity();
          a.o(uFragmentAct, "fragment.requireActivity\(\)");
          if (!PatchProxy.applyVoidOneRefs(uFragmentAct, selectFriend, SelectFriendsDialog.class, "3")) {
             a.p(uFragmentAct, "activity");
             selectFriend.z = (int)((float)n.j(uFragmentAct) * 0x3f400000);
          }
          selectFriend.show(fragmentMana, "Friend");
          this.h0().t0(new RelayStickerFriendsDialogAction(true));
          Object[] objArray2 = new Object[0];
          a.D().w("StickerKeyboardPanelViewBinder", "initPopupIfNeeded: show friends dialog", objArray2);
       }
       this.z = selectFriend;
       return;
    }
    public final void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.y = p0;
       if (p0 != null) {
          q$e uoe = new q$e(this);
          if (!PatchProxy.applyVoidOneRefs(uoe, p0, a.class, "1")) {
             a.p(uoe, "listener");
             p0.a = uoe;
          }
       }
       return;
    }
    public final void l0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q.class, "14")) {
          return;
       }
       List list = this.N().o0(q$i.b);
       if (list != null) {
          objArray = CollectionsKt___CollectionsKt.p2(list);
       }
       if (objArray instanceof NewRelayStickerDrawer) {
          NewStickerElementData elementData = objArray.getElementData();
          if (elementData instanceof NewRelayStickerDrawerData) {
             int i = elementData.T0().size();
             if (i > 0) {
                q ty = this.y;
                if (ty != null) {
                   a uoa = ty.b();
                   if (uoa != null) {
                      String str = a1.q(R.string.arg_RES_7f10424d, i);
                      a.o(str, "CommonUtil.string\(R.stri¡­ted_friends_count, count\)");
                      uoa.c(str, i);
                   }
                }
             }
          }
       }
       return;
    }
    public void x(a p0,a p1){
       this.i0(p0, p1);
    }
}
