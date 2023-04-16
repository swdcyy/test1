package lmd.c;
import itc.a;
import lmd.c$a;
import nsd.u;
import java.util.ArrayList;
import xvc.f;
import java.util.List;
import lmd.c$b;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import ei0.a;
import com.yxcorp.gifshow.record.interactive.RecordStickerBaseData;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.record.interactive.RecordInteractiveStickerData;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer$a;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import fmd.a;
import smd.d;
import qmd.i;
import nmd.q;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import java.lang.Boolean;
import lmd.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import lmd.b;
import android.view.View;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;
import nmd.t;
import erd.r;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;

public final class c extends a	// class@001c58
{
    public c A;
    public float B;
    public final d C;
    public final List x;
    public b y;
    public final f z;
    public static final c$a D;

    static {
       c.D = new c$a(null);
    }
    public void c(){
       super();
       this.x = new ArrayList();
       f uof = new f(new ArrayList());
       this.z = uof;
       this.B = 0x3f733333;
       this.C = new c$b(this, false, uof, null);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       super.E8();
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       super.J8();
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       return;
    }
    public EditDecorationBaseDrawer P8(RecordStickerBaseData p0){
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NewRelayStickerDrawer newRelayStic = PatchProxy.applyOneRefs(obj1, obj, c.class, "7");
       if (newRelayStic != patchProxyRe) {
       }else {
          a.p(obj1, "data");
          a v = obj.v;
          a.o(v, "mRootView");
          NewRelayStickerDrawerData newRelayStic1 = PatchProxy.applyThreeRefs(obj1, this.getActivity(), v, this, c.class, "8");
          boolean b = true;
          if (newRelayStic1 != patchProxyRe) {
          }else {
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("RecordRelayStickerPresenter", "convertToRelayDrawerData: data = "+obj1, objArray);
             NewRelayStickerDrawerData newRelayStic3 = new NewRelayStickerDrawerData(null, 0, null, false, false, false, 0, false, 0, 511, null);
             newRelayStic1.K0(3);
             newRelayStic1.Y(obj1.getCenterX());
             newRelayStic1.Z(obj1.getCenterY());
             newRelayStic1.b0(0x3f800000);
             NewRelayStickerDrawer$a companion = NewRelayStickerDrawer.Companion;
             newRelayStic1.P((float)companion.d());
             newRelayStic1.M((float)companion.c());
             newRelayStic1.M0(4097);
             newRelayStic1.c1(b);
             newRelayStic1.b(4096);
             newRelayStic1.v0(0x4e20);
             newRelayStic1.N0(6);
             newRelayStic1.O0(b);
             newRelayStic1.u0((TextUtils.x(obj1.getTitle()) ^ b));
             companion = ((obj1.getFromPhotoId()).length() > 0)? 1: 0;
             if (companion) {
                newRelayStic1.L(0x3f4ccccd);
                newRelayStic1.Z0(b);
             }else {
                newRelayStic1.L(0x3f733333);
                newRelayStic1.Z0(i);
             }
             newRelayStic1.c1(b);
             newRelayStic1.f1(obj1.getTitle());
             newRelayStic1.d1(obj1.getRelatedPostCount());
             newRelayStic1.e1(obj1.isTitleEditable());
             if (!newRelayStic1.Y0()) {
                newRelayStic1.V0().addAll(obj1.getFromPhotoUserInfoList());
             }
             newRelayStic1.g1(obj1.getUserInfoList());
          }
          v = new a(obj.C, b);
          NewRelayStickerDrawer newRelayStic2 = new NewRelayStickerDrawer(newRelayStic1, v, new i());
          c y = obj.y;
          if (y != null) {
             y.k0(v);
          }
          newRelayStic = newRelayStic2;
       }
       return newRelayStic;
    }
    public void R8(Fragment p0,ViewGroup p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "4")) {
          return;
       }
       a.p(p0, "fragment");
       a.p(p1, "view");
       super.R8(p0, p1, p2);
       a tt = this.t;
       a.o(tt, "mContainerViewV2");
       this.U7(new a(tt, p0));
       b uob = new b(this.C, p0, p1);
       this.y = uob;
       a.m(uob);
       this.x.add(uob);
       return;
    }
    public boolean S8(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "decorationDrawer");
       boolean b = true;
       if (!p0 instanceof NewEditStickerBaseDrawer || p0.getEditStickerSubType() != b) {
          b = false;
       }
       return b;
    }
    public void V8(PresenterV2 p0,RecordStickerBaseData p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, c.class, "9")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().s("RecordRelayStickerPresenter", "onAddStickerReClick\(\) called with: presenter = "+p0+", data = "+p1, objArray);
          c ty = this.y;
          if (ty != null && !PatchProxy.applyVoid(null, ty, q.class, "19")) {
             List list = ty.N().o0(t.b);
             a.o(list, "drawer");
             EditDecorationBaseDrawer uEditDecorat = CollectionsKt___CollectionsKt.p2(list);
             if (uEditDecorat != null) {
                q z = ty.z;
                if (z == null || !z.isAdded()) {
                   ty.j0(uEditDecorat);
                }
             }
          }
          PatchProxy.onMethodExit(c.class, "9");
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       a tt = this.t;
       if (tt == null) {
          Object[] objArray = new Object[0];
          a.D().A("RecordRelayStickerPresenter", "onStickerDraggingEndInRecord, mContainerViewV2 is null", objArray);
          return;
       }else {
          a.o(tt, "mContainerViewV2");
          Iterator iterator = tt.getDecorationDrawerList().iterator();
          while (iterator.hasNext()) {
             EditDecorationBaseDrawer uEditDecorat = iterator.next();
             a.m(uEditDecorat);
             if (this.S8(uEditDecorat)) {
                uEditDecorat.setAlpha(this.B);
             }
          }
          return;
       }
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       a tt = this.t;
       if (tt == null) {
          Object[] objArray = new Object[0];
          a.D().A("RecordRelayStickerPresenter", "onStickerDraggingStartInRecord, mContainerViewV2 is null", objArray);
          return;
       }else {
          a.o(tt, "mContainerViewV2");
          Iterator iterator = tt.getDecorationDrawerList().iterator();
          while (iterator.hasNext()) {
             EditDecorationBaseDrawer uEditDecorat = iterator.next();
             a.m(uEditDecorat);
             if (this.S8(uEditDecorat)) {
                this.B = uEditDecorat.getAlpha();
                uEditDecorat.setAlpha(0x3f733333);
                uEditDecorat.update();
             }
          }
          return;
       }
    }
}
