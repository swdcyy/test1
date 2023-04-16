package com.yxcorp.gifshow.v3.editor.sticker.j0;
import com.yxcorp.gifshow.v3.editor.sticker.e;
import java.util.HashSet;
import com.yxcorp.gifshow.v3.editor.sticker.j0$a;
import io.reactivex.subjects.PublishSubject;
import itc.u1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.sticker.y0;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import itc.t1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import ekd.m1;
import com.yxcorp.gifshow.widget.adv.model.a;
import com.kwai.robust.PatchProxyResult;
import itc.a2;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.yxcorp.gifshow.v3.editor.sticker.i0;
import erd.o;
import t45.d;
import brd.z;
import itc.w1;
import itc.v1;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rwc.j;
import wba.b;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.List;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.Action;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public abstract class j0 extends e	// class@00125a
{
    public View N;
    public View O;
    public View P;
    public Set Q;
    public j R;
    public k S;
    public b T;
    public final c U;
    public final e$c V;

    public void j0(){
       super();
       this.Q = new HashSet();
       this.S = new j0$a(this);
       this.T = null;
       this.U = PublishSubject.g();
       this.V = new u1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "3")) {
          return;
       }
       super.E8();
       this.N.setVisibility(8);
       int i = 0;
       this.O.setVisibility(i);
       this.Q.add(this.V);
       if (this instanceof y0 && this.z.a1() != Workspace$Type.SINGLE_PICTURE) {
          this.P.setVisibility(i);
          this.P.setOnClickListener(new t1(this));
       }
       this.h9();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "10")) {
          return;
       }
       super.J8();
       this.Q.remove(this.V);
       return;
    }
    public void d9(StickerDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "8")) {
          return;
       }
       this.j9(p0, this.P8(p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.O = m1.f(p0, 0x7f0a3ef6);
       this.N = m1.f(p0, 0x7f0a3b67);
       this.P = m1.f(p0, 0x7f0a309c);
       return;
    }
    public abstract a e9(StickerDetailInfo p0,EditorSdk2V2$AnimatedSubAsset p1);
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, j0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(j0.class, new a2());
       }else {
          obj.put(j0.class, null);
       }
       return obj;
    }
    public final void h9(){
       if (PatchProxy.applyVoid(null, this, j0.class, "4")) {
          return;
       }
       this.T = this.U.debounce(50, TimeUnit.MILLISECONDS).flatMap(i0.b).observeOn(d.a).subscribe(new w1(this), new v1(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       super.j8();
       this.R = this.r8("STOP_SCROLL_LISTENER");
       this.Q = this.r8("STICKER_LISTENERS");
       return;
    }
    public EditStickerBaseDrawer j9(StickerDetailInfo p0,EditorSdk2V2$AnimatedSubAsset p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, j0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = b.o(p1.opaque());
       EditStickerBaseDrawer uEditSticker = null;
       if (i == -1) {
          i1.c(new RuntimeException("selectNotAddedSticker can not find animatedSubAsset zIndex"));
          return uEditSticker;
       }else {
          a uoa = this.e9(p0, p1);
          this.H.d.add(uoa);
          f.m = f.m + 1;
          EditStickerBaseDrawer uEditSticker1 = uoa.d().k();
          this.G.Z(uEditSticker1, uEditSticker);
          StringBuilder str = "selectNotAddedSticker zIndex:"+i+",needSelectedDefaultRangeData:"+uoa;
          obj = new Object[0];
          a.D().w("StickerEditorPresenter", str+",mEditableActionLayerCount:"+f.m, obj);
          return uEditSticker1;
       }
    }
}
