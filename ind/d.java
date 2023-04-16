package ind.d;
import uxb.s;
import java.lang.Object;
import r1c.h;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import android.graphics.RectF;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationContainerLimitRectAction;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.lang.Number;
import wnd.e;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import xvc.b;
import und.l;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import brd.t;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import ind.d$b;
import io.reactivex.g;
import ind.d$c;
import t45.d;
import brd.z;
import hba.a;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import java.lang.Integer;
import wnd.h;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationUpdateIdentifyAction;
import wnd.b;
import evc.c;
import voc.o;
import crd.b;
import ind.d$a;
import erd.g;
import com.yxcorp.gifshow.v3.editor.i;
import aw9.z;
import com.yxcorp.gifshow.v3.editor.j;
import ind.a;
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
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$a;
import knd.d;
import knd.d$a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;

public class d implements s	// class@001033
{

    public void d(){
       super();
    }
    public List AV(h p0,c p1,EditorSdk2V2$VideoEditorProject p2,Object p3){
       p2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, d.class, "18");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "nextStepTaskManager");
       a.p(p1, "workspaceDraft");
       return new ArrayList();
    }
    public EditSdkAction Dz(RectF p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DecorationContainerLimitRectAction(p0);
    }
    public void Fn(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "16")) {
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
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "7");
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
       Object obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.a();
    }
    public void K0(EditorDelegate p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "14")) {
          return;
       }
       a.p(p0, "editorDelegate");
       a.p(p1, "action");
       p0.s(l.class).t0(p1);
       return;
    }
    public t Ld(BaseFragment p0,boolean p1){
       t ot;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uod, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "fragment");
       if (PostExperimentUtils.m()) {
          ot = t.create(new d$b(p0, p1));
          a.o(ot, "Observable.create<Unit> ¡­nimatedSubAsset\)\)\n      }");
          return ot;
       }else {
          ot = t.create(new d$c(p0, p1)).subscribeOn(d.a);
          a.o(ot, "Observable.create<Unit> ¡­beOn\(KwaiSchedulers.MAIN\)");
          return ot;
       }
    }
    public void PV(a p0,int p1,String p2,TimeRange p3,DraftTextStyleInfo p4,boolean p5,List p6){
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p6;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),oobject1,oobject2,oobject3,Boolean.valueOf(p5),oobject4};
          if (PatchProxy.applyVoid(objArray, this, uod, "10")) {
             return;
          }
       }else {
          int i = this;
       }
       a.p(p0, "textDraft");
       a.p(p2, "text");
       a.p(oobject2, "timeRange");
       a.p(oobject3, "textStyleInfo");
       a.p(oobject4, "assetIdentifierList");
       h.b(p0, p1, p2, p3, p4, true, null, 0, 0, 448, null);
       return;
    }
    public float Qq(){
       return 0x3f333333;
    }
    public String R10(){
       return "°¡";
    }
    public void U60(EditorDelegate p0,EditDecorationContainerViewV2 p1,int p2,List p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, d.class, "13")) {
          return;
       }
       a.p(p0, "editorDelegate");
       a.p(p1, "containerView");
       a.p(p3, "identifier");
       ViewModel viewModel = p0.s(l.class);
       viewModel.t0(new DecorationUpdateIdentifyAction(p2, p3));
       a.o(viewModel, "viewModel");
       b.e(p1, viewModel, false, false, 8, null);
       return;
    }
    public b VN(c p0,o p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subtitlePostInfo");
       a.p(p1, "editorContext");
       b uob = t.just(new Object()).subscribe(d$a.b);
       a.o(uob, "Observable.just\(Any\(\)\).subscribe { }");
       return uob;
    }
    public void Yx(i p0,z p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "5")) {
          return;
       }
       a.p(p0, "editorHelperContract");
       a.p(p1, "decorationPlayer");
       return;
    }
    public DraftTextStyleInfo bA(){
       Object obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.o();
    }
    public boolean bo(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "revertableEditor");
       return p0 instanceof a;
    }
    public void fF(a p0,String p1,String p2,String p3,float p4){
       d uod = d.class;
       int i = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
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
       Object obj = PatchProxy.apply(null, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-1527502188).i70();
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean ov(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "textId");
       return TextTemplateRepo.k.b(p0);
    }
    public void w1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       a.p(p0, "defaultRecoTextList");
       d.e.a(p0);
       return;
    }
    public EditDecorationBaseDrawer zv(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "beClonedDrawer");
       return p0;
    }
}
