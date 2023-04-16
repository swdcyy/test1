package nod.g;
import uxb.t;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xod.f;
import r1c.h;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import android.graphics.RectF;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import uxb.t$a;
import uxb.s$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.lang.Number;
import wnd.e;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import xvc.b;
import brd.t;
import java.lang.Boolean;
import qrd.l1;
import hba.a;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import java.lang.Integer;
import evc.c;
import voc.o;
import crd.b;
import nod.g$a;
import erd.g;
import com.yxcorp.gifshow.v3.editor.i;
import aw9.z;
import wnd.h;
import com.yxcorp.gifshow.v3.editor.j;
import nod.d;
import java.lang.Float;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.FeatureId;
import huc.d;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import htc.c;
import juc.c;
import android.graphics.Bitmap;
import voc.l;
import huc.c;
import tkd.b;
import tkd.d;
import uxb.u;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import yod.k;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$a;
import java.lang.Double;
import ood.d;
import ood.e;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$ResourceType;
import bod.a;
import xod.d;
import wba.l0;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$PropertyKeyFrame$a;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$AssetTransform;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$AssetTransform$a;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$PropertyKeyFrame;
import knd.d;
import knd.d$a;
import tnd.b;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;

public class g implements t	// class@001ea8
{

    public void g(){
       super();
    }
    public String A1(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.a.c();
    }
    public List AV(h p0,c p1,EditorSdk2V2$VideoEditorProject p2,Object p3){
       p2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, g.class, "22");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "nextStepTaskManager");
       a.p(p1, "workspaceDraft");
       return new ArrayList();
    }
    public EditSdkAction Dz(RectF p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(this, p0, null, t$a.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          EditSdkAction uEditSdkActi = PatchProxy.applyTwoRefs(this, p0, null, s$a.class, "2");
          if (uEditSdkActi != PatchProxyResult.class) {
          }else {
             uEditSdkActi = new EditSdkAction();
          }
          obj = uEditSdkActi;
       }
       return obj;
    }
    public void Fn(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "20")) {
          return;
       }
       a.p(p0, "previewFragment");
       View view = p0.getView();
       EditDecorationContainerViewV2 uEditDecorat = (view != null)? view.findViewById(R.id.new_text_decoration_editor_view): null;
       if (uEditDecorat != null) {
          uEditDecorat.R();
       }
       return;
    }
    public int Gk(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "textId");
       if (p0.hashCode() == -1972576896 && p0.equals("shadow_01")) {
          return 0x7f082390;
       }
       return 0;
    }
    public int Gt(){
       Object obj = PatchProxy.apply(null, this, g.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.a();
    }
    public void K0(EditorDelegate p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "23")) {
          return;
       }
       a.p(p0, "editorDelegate");
       a.p(p1, "action");
       if (!PatchProxy.applyVoidThreeRefs(this, p0, p1, null, t$a.class, "1")) {
          a.p(p0, "editorDelegate");
          a.p(p1, "action");
          if (!PatchProxy.applyVoidThreeRefs(this, p0, p1, null, s$a.class, "1")) {
             a.p(p0, "editorDelegate");
             a.p(p1, "action");
          }
       }
       return;
    }
    public t Ld(BaseFragment p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, og, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "fragment");
       t ot = t.just(l1.a);
       a.o(ot, "Observable.just\(Unit\)");
       return ot;
    }
    public void PV(a p0,int p1,String p2,TimeRange p3,DraftTextStyleInfo p4,boolean p5,List p6){
       if (PatchProxy.isSupport(g.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,Boolean.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, g.class, "16")) {
             return;
          }
       }
       a.p(p0, "textDraft");
       a.p(p2, "text");
       a.p(p3, "timeRange");
       a.p(p4, "textStyleInfo");
       a.p(p6, "assetIdentifierList");
       return;
    }
    public float Qq(){
       return 0x3f333333;
    }
    public String R10(){
       return "°¡";
    }
    public void U60(EditorDelegate p0,EditDecorationContainerViewV2 p1,int p2,List p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, g.class, "19")) {
          return;
       }
       a.p(p0, "editorDelegate");
       a.p(p1, "containerView");
       a.p(p3, "identifier");
       return;
    }
    public b VN(c p0,o p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subtitlePostInfo");
       a.p(p1, "editorContext");
       b uob = t.just(new Object()).subscribe(g$a.b);
       a.o(uob, "Observable.just\(Any\(\)\).subscribe { }");
       return uob;
    }
    public void Yx(i p0,z p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "11")) {
          return;
       }
       a.p(p0, "editorHelperContract");
       a.p(p1, "decorationPlayer");
       return;
    }
    public DraftTextStyleInfo bA(){
       Object obj = PatchProxy.apply(null, this, g.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.o();
    }
    public boolean bo(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "revertableEditor");
       return p0 instanceof d;
    }
    public void fF(a p0,String p1,String p2,String p3,float p4){
       g og = g.class;
       int i = 0;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, og, "8")) {
             return;
          }
       }
       a.p(p0, "textDraft");
       a.p(p1, "text");
       a.p(p2, "title");
       a.p(p3, "textId");
       p0.c0();
       Text$b uob = p0.k();
       uob.h(d.e(p3));
       a.o(uob, "textBuilder");
       StickerResult$b uob1 = uob.getResult().toBuilder();
       uob1.f(0x3f000000);
       uob1.g(0x3f000000);
       uob1.t(0x3f800000);
       uob1.v(0x3f800000);
       uob1.s(0);
       uob1.w(i);
       c uoc = c.G(p1, p2, p3);
       a.o(uoc, "SmartAlbumV2Drawer.getSm¡­awer\(text, title, textId\)");
       Bitmap uBitmap = l.b(uoc, p4);
       if (uBitmap != null) {
          a.o(uob1, "stickerResultBuilder");
          uob1.l(p0.N(uBitmap, ".png"));
       }
       uob.j(uob1);
       uob.m(p1);
       uob.o(p2);
       uob.e("SourceHanSansCN-Bold.otf");
       a.o(uob, "textBuilder.setResult\(st¡­ourceHanSansCN-Bold.otf\"\)");
       uob.h(d.e(p3));
       p0.f();
       return;
    }
    public c i70(){
       Object obj = PatchProxy.apply(null, this, g.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-1527502188).i70();
    }
    public boolean isAvailable(){
       return true;
    }
    public Object m5(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "textFontRepoV3");
       return new TextTemplateRepoV3("DESIGN_FONT_TEMPLATE", p0);
    }
    public void mM(Object p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, g.class, "1")) {
          return;
       }
       a.p(p0, "viewModel");
       f.a.a(p0, p1, p2);
       return;
    }
    public boolean ov(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "textId");
       return TextTemplateRepo.k.b(p0);
    }
    public void qd(int p0,a p1,double p2,double p3,String p4){
       int i = p0;
       object oobject = p1;
       object oobject1 = p4;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,Double.valueOf(p2),Double.valueOf(p3),oobject1};
          if (PatchProxy.applyVoid(objArray, this, og, "6")) {
             return;
          }
       }else {
          int i2 = this;
       }
       a.p(oobject, "textDraft");
       a.p(oobject1, "text");
       d.k(p0, e.a(), p1, p2, p3, null, true, e.a().q(), 32, null);
       int i1 = l0.a.a(i, oobject);
       if (i1 < 0) {
          PostUtils.D("addDefaultSubtitleToDraft", "addDefaultSubtitleToDraft", new RuntimeException("draft is empty"));
          return;
       }else {
          GeneratedMessageLite$Builder uBuilder = oobject.n(i1);
          a.o(uBuilder, "textDraft.getBuilder\(draftPosition\)");
          uBuilder.m(oobject1);
          CommonDraftBaseAssetModel$PropertyKeyFrame$a propertyKeyF = d.g(p0, p1);
          if (propertyKeyF != null) {
             CommonDraftBaseAssetModel$AssetTransform$a uAssetTransf = propertyKeyF.getAssetTransform().toBuilder();
             uAssetTransf.b(75.00f);
             propertyKeyF.a(uAssetTransf);
             GeneratedMessageLite generatedMes = propertyKeyF.build();
             a.o(generatedMes, "transformBuilder.build\(\)");
             d.n(generatedMes, i, oobject);
             d.a.i(i, oobject);
          }
          return;
       }
    }
    public Object u20(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "textFontRepoV3");
       return new TextTemplateRepoV3("TEXT_TEMPLATE", p0);
    }
    public void w1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "12")) {
          return;
       }
       a.p(p0, "defaultRecoTextList");
       d.e.a(p0);
       return;
    }
    public Object zn(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       ViewModel viewModel = ViewModelProviders.of(b.b(p0)).get(k.class);
       a.o(viewModel, "ViewModelProviders.of\(fi¡­tViewModelV3::class.java\)");
       return viewModel;
    }
    public EditDecorationBaseDrawer zv(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "beClonedDrawer");
       return p0;
    }
}
