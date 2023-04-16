package com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import androidx.lifecycle.ViewModel;
import uuc.e;
import xuc.c;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import com.kuaishou.edit.draft.Workspace$Source;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import uld.g;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$a;
import androidx.lifecycle.LiveData;
import z0.a;
import androidx.lifecycle.Transformations;
import di0.b;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$mTextElementUiDataList$1;
import msd.p;
import di0.b$a;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$mAllTextAnimatedSubAsset$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$mBindPanelFinished$2;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$keyboardListener$2;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$defaultFontShowListener$2;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import msd.l;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import com.kuaishou.edit.draft.TimeRange;
import java.util.List;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.CustomTextStyle;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.CustomTextStyle$b;
import com.kuaishou.kotlin.livedata.ListHolder;
import tuc.b;
import com.kuaishou.edit.draft.Text;
import kotlin.Pair;
import brd.a0;
import com.kwai.robust.PatchProxyResult;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$b;
import erd.o;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$c;
import erd.a;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$d;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$e;
import huc.t;
import xuc.f;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Text$ParameterCase;
import com.kuaishou.edit.draft.FeatureId;
import huc.d;
import hba.a;
import xuc.b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import erd.r;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import tuc.a;
import wba.h0;
import com.kuaishou.edit.draft.TimeRange$b;
import java.lang.Float;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.f;
import uaa.a;
import wba.b;
import java.util.Collection;
import android.util.Pair;
import com.yxcorp.gifshow.edit.previewer.utils.d;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.util.Set;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import java.lang.Number;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import tuc.c;
import vuc.a;
import ypc.a;
import d0c.d;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import lwc.h;
import com.yxcorp.gifshow.util.PostUtils;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.StickerResult$b;
import uuc.d;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import uuc.a;
import uuc.b;
import uuc.c;
import erd.g;
import crd.b;
import htc.b;
import android.graphics.Rect;
import android.graphics.RectF;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.graphics.Bitmap;

public class TextElementViewModel extends ViewModel	// class@001425
{
    public final p A;
    public final p B;
    public final MutableLiveData C;
    public final MutableLiveData D;
    public final MutableLiveData E;
    public final e F;
    public final c G;
    public final boolean H;
    public final FontViewModel I;
    public final boolean J;
    public final Workspace$Source K;
    public g a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final MutableLiveData g;
    public final MutableLiveData h;
    public MutableLiveData i;
    public boolean j;
    public MutableLiveData k;
    public boolean l;
    public boolean m;
    public f n;
    public f o;
    public b p;
    public b q;
    public boolean r;
    public boolean s;
    public boolean t;
    public List u;
    public final LiveData v;
    public final b w;
    public final LiveData x;
    public final p y;
    public final p z;

    public void TextElementViewModel(e p0,c p1,boolean p2,FontViewModel p3,boolean p4,Workspace$Source p5){
       a.p(p0, "textElementRepo");
       a.p(p1, "layerIndexProvider");
       a.p(p3, "fontViewModel");
       super();
       this.F = p0;
       this.G = p1;
       this.H = p2;
       this.I = p3;
       this.J = p4;
       this.K = p5;
       this.a = new g(true);
       this.c = 0x3f800000;
       this.d = 0x3f800000;
       this.e = 0x3f800000;
       this.f = 0x3f800000;
       Boolean fALSE = Boolean.FALSE;
       this.g = new MutableLiveData(fALSE);
       this.h = new MutableLiveData(fALSE);
       this.i = new MutableLiveData(fALSE);
       this.k = new MutableLiveData(fALSE);
       this.s = true;
       this.u = new ArrayList();
       LiveData liveData = Transformations.map(p0.g(), new TextElementViewModel$a(this));
       a.o(liveData, "Transformations.map\(text¡­\n        it.first\n      }");
       this.v = liveData;
       this.w = b.a.a(p0.a, new TextElementViewModel$mTextElementUiDataList$1(this));
       this.x = new MutableLiveData();
       this.y = s.c(new TextElementViewModel$mAllTextAnimatedSubAsset$2(this));
       this.z = s.c(new TextElementViewModel$mBindPanelFinished$2(this));
       this.A = s.c(TextElementViewModel$keyboardListener$2.INSTANCE);
       this.B = s.c(TextElementViewModel$defaultFontShowListener$2.INSTANCE);
       this.C = new MutableLiveData();
       this.D = new MutableLiveData();
       this.E = new MutableLiveData();
    }
    public static void B1(TextElementViewModel p0,int p1,TextStyleValue p2,int p3,int p4,boolean p5,int p6,Object p7){
       int i = (p6 & 0x04)? 17: p3;
       int i1 = (p6 & 0x08)? 0: p4;
       p0.A1(p1, p2, i, i1, p5);
       return;
    }
    public static void b1(TextElementViewModel p0,int p1,l p2,int p3,Object p4){
       p0.a1(p1, null);
    }
    public static int s0(TextElementViewModel p0,TextConfigParam p1,TimeRange p2,List p3,String p4,boolean p5,boolean p6,boolean p7,float p8,float p9,TextStyleValue p10,int p11,Object p12){
       int i = p11;
       ArrayList uArrayList = (i & 0x04)? new ArrayList(): p3;
       float f = (i & 0x0080)? 0xbf800000: p8;
       float f1 = (i & 0x0100)? 0xbf800000: p9;
       TextStyleValue textStyleVal = (i & 0x0200)? new TextStyleValue(0, null, null, null, null, 0, null, false, 255, null): p10;
       return p0.p0(p1, p2, uArrayList, p4, p5, p6, p7, f, f1, textStyleVal);
    }
    public static void w0(TextElementViewModel p0,EditTextBaseElement p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = 9;
       }
       Objects.requireNonNull(p0);
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (!PatchProxy.isSupport(textElementV) || !PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p2), p0, textElementV, "41")) {
          a.p(p1, "editTextBaseElement");
          p0.a.f(p1);
          p0.F.b(p1.getLayerIndex(), p2);
          Object[] objArray = new Object[0];
          a.D().w("TextElementViewModel", "deleteTextElement editTextBaseElement:"+p1+", payload:"+p2, objArray);
       }
       return;
    }
    public static void x1(TextElementViewModel p0,int p1,String p2,int p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = 13;
       }
       p0.w1(p1, p2, p3);
       return;
    }
    public final MutableLiveData A0(){
       return this.k;
    }
    public final void A1(int p0,TextStyleValue p1,int p2,int p3,boolean p4){
       int i1;
       b uob1;
       TextElementViewModel textElementV = TextElementViewModel.class;
       int i = 1;
       if (PatchProxy.isSupport(textElementV)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, textElementV, "23")) {
             return;
          }
       }
       textElementV = this.F;
       Objects.requireNonNull(textElementV);
       if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), textElementV, e.class, "18")) {
          a.p(p1, "newStyle");
          textElementV.o(i);
          e c = textElementV.c;
          String str = "mTextDraft";
          if (c == null) {
             a.S(str);
          }
          if (!c.D()) {
             i1.c(new RuntimeException("updateTextElementFont error textDraft not editing"));
          }
          i1 = textElementV.m(p0);
          e c1 = textElementV.c;
          if (c1 == null) {
             a.S(str);
          }
          GeneratedMessageLite$Builder uBuilder = c1.n(i1);
          a.o(uBuilder, "mTextDraft.getBuilder\(updateDraftPosition\)");
          CustomTextStyle$b uob = uBuilder.getCustomTextStyle().toBuilder();
          uob.b(p1.e());
          uob.d(p1.g());
          uob.c(p1.f());
          uob.a(p1.d());
          uob.e(p1.h());
          uob.f(p1.i());
          uBuilder.f(uob.build());
          i = textElementV.l(p0);
          ListHolder value = textElementV.a.getValue();
          if (value != null) {
             List list = value.c();
             if (list != null) {
                uob1 = list.get(i);
             label_00e6 :
                if (uob1 != null) {
                   GeneratedMessageLite generatedMes = uBuilder.build();
                   a.o(generatedMes, "textBuilder.build\(\)");
                   uob1.b(generatedMes);
                   textElementV.a.y(i, uob1, Integer.valueOf(p2));
                }
             }
          }
          uob1 = null;
          goto label_00e6 ;
       }
       this.U0(p4).setValue(new Pair(p1, Integer.valueOf(p3)));
       Object[] objArray1 = new Object[0];
       a.D().w("TextElementViewModel", "updateTextStyle layerIndex:"+p0+", newStyle:"+p1, objArray1);
       return;
    }
    public final g C0(){
       return this.a;
    }
    public final a0 C1(boolean p0){
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, textElementV, "57");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          this.g.setValue(Boolean.TRUE);
       }
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "waitAllTaskComplete start", objArray);
       a0 uoa0 = this.a.h().G(d.a).C(TextElementViewModel$b.b).m(new TextElementViewModel$c(this, p0));
       a.o(uoa0, "decorationDrawerFileMana¡­Complete complete\"\)\n    }");
       return uoa0;
    }
    public final MutableLiveData D0(){
       Object obj = PatchProxy.apply(null, this, TextElementViewModel.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
    public final a0 D1(){
       a0 obj = PatchProxy.apply(null, this, TextElementViewModel.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "waitAllTaskCompleteAndCommitDraft start", objArray);
       obj = this.a.h().G(d.a).C(TextElementViewModel$d.b).m(new TextElementViewModel$e(this));
       a.o(obj, "decorationDrawerFileMana¡­mitDraft complete\"\)\n    }");
       return obj;
    }
    public final boolean E0(){
       return this.m;
    }
    public final String F0(){
       String obj = PatchProxy.apply(null, this, TextElementViewModel.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.s != null && (this.H == null && this.r == null)) {
          this.s = false;
          obj = t.b();
          a.o(obj, "getEditorCopyText\(\)");
       }else {
          obj = "";
       }
       return obj;
    }
    public final FontViewModel G0(){
       return this.I;
    }
    public final boolean H0(){
       return this.t;
    }
    public final MutableLiveData I0(){
       Object obj = PatchProxy.apply(null, this, TextElementViewModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.getValue();
    }
    public final float J0(){
       return this.e;
    }
    public final MutableLiveData K0(){
       return this.h;
    }
    public final LiveData L0(){
       Object obj = PatchProxy.apply(null, this, TextElementViewModel.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getValue();
    }
    public final boolean M0(){
       return this.J;
    }
    public final boolean O0(){
       return this.r;
    }
    public final MutableLiveData P0(){
       return this.g;
    }
    public final f Q0(){
       TextElementViewModel obj = PatchProxy.apply(null, this, TextElementViewModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj == null) {
          a.S("mSubtitlePanelVMDelegate");
       }
       return obj;
    }
    public final b R0(){
       return this.w;
    }
    public final f S0(){
       TextElementViewModel obj = PatchProxy.apply(null, this, TextElementViewModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n;
       if (obj == null) {
          a.S("mTextPanelVMDelegate");
       }
       return obj;
    }
    public final boolean T0(){
       return this.l;
    }
    public final MutableLiveData U0(boolean p0){
       TextElementViewModel tD = (p0)? this.D: this.C;
       return tD;
    }
    public final String V0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       TextElementViewModel obj = PatchProxy.apply(objArray, this, TextElementViewModel.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.F;
       Objects.requireNonNull(obj);
       String str = PatchProxy.apply(objArray, obj, e.class, "24");
       if (str != patchProxyRe) {
       }else {
          e c = obj.c;
          if (c == null) {
             a.S("mTextDraft");
          }
          List list = c.z();
          a.o(list, "mTextDraft.messages");
          Iterator iterator = list.iterator();
          str = "";
          while (iterator.hasNext()) {
             Text text = iterator.next();
             a.o(text, "it");
             if (text.getParameterCase() == Text$ParameterCase.SUBTITLE_EXTRA_PARAM) {
                str = d.f(text.getFeatureId());
                a.o(str, "EditTextIdHelper.findTex¡­omFeatureId\(it.featureId\)");
             }
          }
       }
       return str;
    }
    public final MutableLiveData W0(){
       return this.E;
    }
    public final void X0(a p0,boolean p1){
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, textElementV, "15")) {
          return;
       }
       String str = "textDraft";
       a.p(p0, str);
       this.r = p1;
       TextElementViewModel tF = this.F;
       Objects.requireNonNull(tF);
       if (!PatchProxy.applyVoidOneRefs(p0, tF, e.class, "4")) {
          a.p(p0, str);
          tF.c = p0;
          Object[] objArray = new Object[0];
          a.D().w("TextElementRepo", "init", objArray);
       }
       return;
    }
    public final void Z0(List p0,b p1,List p2,List p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, TextElementViewModel.class, "65")) {
          return;
       }
       a.p(p0, "idList");
       a.p(p1, "provider");
       a.p(p2, "newSavedOuterTextIdList");
       a.p(p3, "newSavedInnerTextIdList");
       TextElementViewModel tI = (PostExperimentUtils.t1() && this.J != null)? this.I: null;
       this.n = new f(p0, p2, p3, tI);
       this.p = p1;
       return;
    }
    public final void a1(int p0,l p1){
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, textElementV, "28")) {
          return;
       }
       textElementV = this.x;
       Objects.requireNonNull(textElementV, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Pair<kotlin.Int, \(\(kotlin.Any?\) -> kotlin.Any?\)?>>");
       textElementV.setValue(new Pair(Integer.valueOf(p0), p1));
       return;
    }
    public final void c1(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewModel.class, "17")) {
          return;
       }
       this.F.n(p0);
       return;
    }
    public final void d1(EditTextBaseElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewModel.class, "40")) {
          return;
       }
       a.p(p0, "editTextBaseElement");
       this.a.f(p0);
       return;
    }
    public final void f1(List p0,TextConfigParam p1,r p2,int p3,boolean p4){
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, textElementV, "52")) {
             return;
          }
       }
       a.p(p0, "currentTextElementList");
       a.p(p1, "textConfigParam");
       a.p(p2, "predicate");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          EditTextBaseElementData uEditTextBas = iterator.next();
          if (p2.test(uEditTextBas)) {
             uArrayList.add(uEditTextBas);
          }
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Objects.requireNonNull(obj);
          this.i1(obj, p1, new ArrayList(), 1, p4);
       }
       Object[] objArray1 = new Object[0];
       a.D().w("TextElementViewModel", "replaceAllTextElement textConfigParam:"+p1+", isLandscape:"+p4, objArray1);
       return;
    }
    public final void g1(EditTextBaseElementData p0,TextConfigParam p1){
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, TextElementViewModel.class, "67")) {
          return;
       }
       a.p(obj1, "oldEditTextBaseElementData");
       a.p(obj2, "newTextConfigParam");
       TextElementViewModel p = obj.p;
       if (p != null) {
          obj.E.setValue(p1.i().o());
          TextStyleValue textStyleVal = TextStyleValue.a(p1.i().l(), 0, null, null, null, null, 0, null, false, 255, null);
          obj.U0(false).setValue(new Pair(textStyleVal, Integer.valueOf(4)));
          this.h1(p0, p1, p.d(), 20, 19, p.c(), textStyleVal);
       }
       obj.x0(p1.i().k());
       return;
    }
    public final void h1(EditTextBaseElementData p0,TextConfigParam p1,List p2,int p3,int p4,boolean p5,TextStyleValue p6){
       a this;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV)) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Boolean.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, obj, textElementV, "54")) {
             return;
          }
       }
       if (a.g(p0.l(), p1.j())) {
          return;
       }else {
          obj.v0(p0.l0(), p4);
          this = this.y0(p0, p1, p2, p5, p6);
          this.a().l(p0.q());
          TextConfigParam textConfigPa = this.b();
          h0 oh0 = this.a();
          GeneratedMessageLite TimeRange$b this1 = TimeRange.newBuilder();
          this1.b(p0.m0());
          this1.a(p0.j0());
          this1 = this1.build();
          a.o(this1, "TimeRange.newBuilder\(\).s¡­entData.duration\).build\(\)");
          obj.F.a(textConfigPa, oh0, this1, p0.l0(), p2, p0.B0(), p0.y0(), p6, p3);
          Object[] objArray1 = new Object[0];
          a.D().w("TextElementViewModel", "replaceTextElement oldEditTextBaseElementData:"+oobject+", "+"textConfigParam:"+oobject1+", assetIdentifier:assetIdentifier, isLandscape:"+p5, objArray1);
          return;
       }
    }
    public final void i1(EditTextBaseElementData p0,TextConfigParam p1,List p2,int p3,boolean p4){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, textElementV, "53")) {
             return;
          }
       }
       a.p(oobject, "oldEditTextBaseElementData");
       a.p(oobject1, "newTextConfigParam");
       a.p(oobject2, "assetIdentifier");
       this.h1(p0, p1, p2, p3, 11, p4, TextStyleValue.a(p1.i().l(), 0, null, null, null, null, 0, null, false, 255, null));
       obj.x0(p1.i().k());
       return;
    }
    public final void j1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewModel.class, "60")) {
          return;
       }
       a.p(p0, "defaultTextId");
       TextElementViewModel tF = this.F;
       Objects.requireNonNull(tF);
       if (!PatchProxy.applyVoidOneRefs(p0, tF, e.class, "3")) {
          a.p(p0, "<set-?>");
          tF.f = p0;
       }
       return;
    }
    public final void k1(boolean p0){
       this.l = p0;
    }
    public final void l1(){
       ArrayList uArrayList;
       if (PatchProxy.applyVoid(null, this, TextElementViewModel.class, "55")) {
          return;
       }
       TextElementViewModel tF = this.F;
       TextElementViewModel te = this.e;
       TextElementViewModel tc = this.c;
       TextElementViewModel tr = this.r;
       Objects.requireNonNull(tF);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidThreeRefs(Float.valueOf(te), Float.valueOf(tc), Boolean.valueOf(tr), tF, e.class, "21")) {
          e b = tF.b;
          if (PatchProxy.isSupport(uoe)) {
             uArrayList = PatchProxy.applyThreeRefs(Float.valueOf(te), Float.valueOf(tc), Boolean.valueOf(tr), tF, e.class, "23");
             if (uArrayList != PatchProxyResult.class) {
             }else {
             label_005d :
                uArrayList = new ArrayList();
                Workspace$Type type = tF.i.a1();
                boolean b1 = true;
                if (f.z(tF.i) && tr != null) {
                   a uoa = tF.i.E0();
                   a.o(uoa, "workspaceDraft.karaokeDraft");
                   uoa = uoa.g0();
                   if (type == Workspace$Type.KTV_SONG) {
                      b1 = false;
                   }
                   List list = b.n(uoa, b1, tc);
                   a.o(list, "AnimatedSubAssetDraftUti¡­ricAssetTransformedScale\)");
                   uArrayList.addAll(list);
                }else {
                   Pair second = d.f(tF.i, 0, b1, 0, te).second;
                   a.o(second, "restoreAllAnimatedSubAss¡­tTransformedScale\).second");
                   uArrayList.addAll(second);
                }
             }
          }else {
             goto label_005d ;
          }
          b.setValue(uArrayList);
          Object[] objArray = new Object[0];
          a.D().w("TextElementRepo", "syncTextToPlayer", objArray);
       }
       return;
    }
    public final void m1(EditTextBaseElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewModel.class, "45")) {
          return;
       }
       a.p(p0, "editTextBaseElement");
       Pair pair = this.z0(p0);
       Size second = pair.getSecond();
       this.v1(p0.getEditTextBaseElementData(), second, pair.getFirst(), 5);
       return;
    }
    public final void n1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextElementViewModel.class, "61")) {
          return;
       }
       TextElementViewModel tF = this.F;
       Objects.requireNonNull(tF);
       if (!PatchProxy.applyVoid(objArray, tF, e.class, "30")) {
          Object[] objArray1 = new Object[false];
          a.D().w("TextElementRepo", "unbindPanel", objArray1);
          tF.g.setValue(Boolean.FALSE);
       }
       tF = this.a;
       Objects.requireNonNull(tF);
       g og = g.class;
       if (!PatchProxy.applyVoid(objArray, tF, og, "3")) {
          ArrayList uArrayList = new ArrayList(tF.b.keySet());
          if (!PatchProxy.applyVoidOneRefs(uArrayList, tF, og, "4") && uArrayList.size() > 0) {
             for (int i = 0; i < uArrayList.size(); i = i + 1) {
                tF.f(uArrayList.get(i));
             }
          }
       }
       this.h.setValue(Boolean.FALSE);
       this.b = false;
       return;
    }
    public final int o0(TimeRange p0,List p1,String p2,boolean p3,boolean p4){
       int this;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       TextElementViewModel textElementV = TextElementViewModel.class;
       int i = 4;
       int i1 = 0;
       if (PatchProxy.isSupport(textElementV)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          Object obj1 = PatchProxy.apply(objArray, obj, textElementV, "30");
          if (obj1 != PatchProxyResult.class) {
             return obj1.intValue();
          }
       }
       a.p(oobject, "timeRange");
       a.p(oobject1, "assetIdentifier");
       a.p(oobject2, "text");
       if (PostExperimentUtils.t1() && obj.J != null) {
          i1 = true;
       }
       TextConfigParam textConfigPa = d.i("shadow_01", i1);
       TextStyleValue textStyleVal = TextStyleValue.a(textConfigPa.i().l(), 0, null, null, null, null, 0, null, false, 255, null);
       if (!PostExperimentUtils.t1() || obj.J == null) {
          obj.U0(1).setValue(new Pair(textStyleVal, Integer.valueOf(i)));
       }
       obj.E.setValue(textConfigPa.i().o());
       a.o(textConfigPa, "textConfigParam");
       this = TextElementViewModel.s0(this, textConfigPa, p0, p1, p2, true, p3, p4, 0, 0, textStyleVal, 384, null);
       if (PostExperimentUtils.t1() && obj.J != null) {
          obj.u1(this, Integer.valueOf(textConfigPa.i().q()), 1);
          obj.p1(this, textConfigPa.i().k());
       }
       return this;
    }
    public final void o1(r p0,h0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextElementViewModel.class, "18")) {
          return;
       }
       a.p(p0, "predicate");
       a.p(p1, "stickerTextCommonData");
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "updateAllTextElementCommonData stickerTextCommonData:"+p1, objArray);
       if (p1.k() != StickerTextValueType.EditElement) {
          i1.c(new RuntimeException("updateAllTextElementCommonData StickerTextValueType error"));
       }
       ListHolder value = this.w.getValue();
       if (value != null) {
          List list = value.c();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                if (p0.test(uoc.a())) {
                   TimeRange$b uob = TimeRange.newBuilder();
                   uob.b(uoc.a().m0());
                   uob.a(uoc.a().j0());
                   GeneratedMessageLite generatedMes = uob.build();
                   a.o(generatedMes, "TimeRange.newBuilder\(\).s¡­entData.duration\).build\(\)");
                   e.s(this.F, uoc.a().l0(), p1.b(StickerTextValueType.Draft), generatedMes, uoc.a().B0(), null, null, 7, 48, null);
                }
             }
          }
       }
       return;
    }
    public final int p0(TextConfigParam p0,TimeRange p1,List p2,String p3,boolean p4,boolean p5,boolean p6,float p7,float p8,TextStyleValue p9){
       Object[] objArray;
       h0 obj1;
       float f;
       float f1;
       float f2;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       boolean b = p6;
       TextElementViewModel textElementV = TextElementViewModel.class;
       int i = 4;
       int i1 = 3;
       int i2 = 0;
       if (PatchProxy.isSupport(textElementV)) {
          objArray = new Object[10];
          objArray[i2] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[i1] = oobject3;
          objArray[i] = Boolean.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Float.valueOf(p7);
          objArray[8] = Float.valueOf(p8);
          objArray[9] = p9;
          obj1 = PatchProxy.apply(objArray, obj, textElementV, "36");
          if (obj1 != PatchProxyResult.class) {
             return obj1.intValue();
          }
       }
       obj1 = 0xbf800000;
       if (p8 - obj1) {
          f = p8;
       }else if(p4){
          f = 0x3f4ccccd;
       }else if(obj.F.f() == null){
          f = 0x3f000000;
       }else {
          h0 oh02 = obj.F.f();
          a.m(oh02);
          f = a.a.a(oh02.h());
       }
       if (p7 - obj1) {
          f1 = p7;
       }else if(p4 || obj.F.f() == null){
          f1 = 0x3f000000;
       }else {
          h0 oh01 = obj.F.f();
          a.m(oh01);
          f1 = a.a.a(oh01.g());
       }
       StickerTextValueType editElement = StickerTextValueType.EditElement;
       if (p4 || obj.F.f() == null) {
          f2 = (b)? 0x3f333333: 0x3f800000;
       }else {
          obj1 = obj.F.f();
          a.m(obj1);
          f2 = obj1.j();
       }
       h0 oh0 = new h0(f1, f, f2, 0, editElement, obj.f, 0, null, 200, null);
       int i3 = (p5)? 3: 4;
       int i4 = i3;
       obj.F.a(p0, v9.b(StickerTextValueType.Draft), p1, obj.G.a(), p2, p3, p4, p9, i4);
       objArray = new Object[0];
       a.D().w("TextElementViewModel", "addTextElement textConfigParam:"+oobject+", timeRange"+oobject1+", "+"assetIdentifier"+oobject2+", elementCommonData"+v9+", text:"+oobject3+", "+"isLandscape:"+b+", payload:"+i4, objArray);
       return this.G.b();
    }
    public final void p1(int p0,String p1){
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, textElementV, "22")) {
          return;
       }
       a.p(p1, "fontFileName");
       ListHolder value = this.w.getValue();
       if (value != null) {
          List list = value.c();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                if (uoc.a().y0()) {
                   if (p0 == uoc.a().l0() && this.l == null) {
                      TextElementViewModel.x1(this, uoc.a().l0(), p1, 0, 4, null);
                   }else {
                      this.w1(uoc.a().l0(), p1, 14);
                   }
                }
             }
          }
       }
       return;
    }
    public final void q0(TimeRange p0,List p1,boolean p2,boolean p3){
       String this;
       a uoa;
       TextConfigParam textConfigPa;
       TextStyleValue value2;
       boolean b1;
       TextElementViewModel textElementV = this;
       if (PatchProxy.isSupport(TextElementViewModel.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, TextElementViewModel.class, "29")) {
          return;
       }
       a.p(p0, "timeRange");
       a.p(p1, "assetIdentifier");
       TextElementViewModel n = textElementV.n;
       if (n == null) {
          a.S("mTextPanelVMDelegate");
       }
       ListHolder value = n.c().getValue();
       Pair pair = null;
       List list = (value != null)? value.c(): pair;
       this = "shadow_01";
       int i = 1;
       if (list != null && (list.isEmpty() ^ i)) {
          uoa = list.get(0);
          textConfigPa = uoa.p();
          if (textConfigPa == null) {
             boolean b = (PostExperimentUtils.t1() && textElementV.J != null)? true: false;
             textConfigPa = d.i(this, b);
          }
       }else if(PostExperimentUtils.t1() && textElementV.J != null){
          b1 = true;
       }else {
          b1 = false;
       }
       textConfigPa = d.i(this, b1);
       uoa = pair;
       Object[] objArray = new Object[0];
       String str = "TextElementViewModel";
       a.D().w(str, "addTextElement textConfigParam "+textConfigPa, objArray);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa1 = iterator.next();
             if (uoa1.t()) {
                textConfigPa = uoa1.p();
                uoa = uoa1;
             }
          }
       }
       if (p3 && uoa != null) {
          a.m(uoa);
          if (uoa.m() != null) {
             a.m(uoa);
             if (!d.c(uoa.m()).booleanValue()) {
                if (!PostExperimentUtils.t1() || textElementV.J == null) {
                   i = false;
                }
                textConfigPa = d.i(this, i);
             }
          }
       }
       TextConfigParam textConfigPa1 = textConfigPa;
       Object[] objArray1 = new Object[0];
       a.D().w(str, "addTextElement select textConfigParam "+textConfigPa1, objArray1);
       if (textConfigPa1 != null) {
          Pair value1 = textElementV.U0(0).getValue();
          if (value1 != null) {
             pair = value1.getFirst();
          }
          if (pair != null && (!PostExperimentUtils.t1() || textElementV.J == null)) {
             value2 = textElementV.U0(0).getValue();
             a.m(value2);
             value2 = value2.getFirst();
          }else {
             value2 = TextStyleValue.a(textConfigPa1.i().l(), 0, null, null, null, null, 0, null, false, 255, null);
          }
          TextStyleValue textStyleVal = value2;
          textElementV.U0(0).setValue(new Pair(textStyleVal, Integer.valueOf(4)));
          textElementV.E.setValue(textConfigPa1.i().o());
          a.o(textConfigPa1, "textConfigParam");
          int i1 = TextElementViewModel.s0(this, textConfigPa1, p0, p1, this.F0(), false, true, p2, 0, 0, textStyleVal, 384, null);
          if (PostExperimentUtils.t1() && textElementV.J != null) {
             textElementV.u1(i1, Integer.valueOf(textConfigPa1.i().q()), 0);
             TextElementViewModel.x1(this, i1, textConfigPa1.i().k(), 0, 4, null);
          }
          return;
       }else {
          ExceptionHandler.handleCaughtException(new IllegalStateException("textConfigParam is null"));
          return;
       }
    }
    public final void q1(int p0,h p1){
       float f1;
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, textElementV, "62")) {
          return;
       }
       a.p(p1, "editorPreviewViewModel");
       float f = 0x3f800000;
       if (p0 == -10) {
          this.c = f;
          this.e = f;
          this.f = f;
          return;
       }else if(this.H != null){
          f1 = p1.o0(p0);
       }else {
          f1 = p1.q0(p0);
       }
       this.c = f1;
       this.e = p1.r0(p0);
       this.f = p1.s0(p0);
       if (this.H == null) {
          f = p1.p0(p0);
       }
       this.d = f;
       return;
    }
    public final void r0(TextConfigParam p0,TimeRange p1,List p2,boolean p3){
       String this;
       int i;
       TextElementViewModel textElementV = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       TextElementViewModel textElementV1 = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV1) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, TextElementViewModel.class, "31")) {
          return;
       }
       a.p(obj, "textConfigParam");
       a.p(obj1, "timeRange");
       a.p(obj2, "assetIdentifier");
       if (textElementV.H != null) {
          textElementV.F.p(null);
       }
       this = this.F0();
       if (PatchProxy.isSupport(textElementV1)) {
          Object[] objArray = new Object[]{obj,obj1,obj2,this,Boolean.FALSE,Boolean.TRUE,Boolean.valueOf(p3)};
          Object obj3 = PatchProxy.apply(objArray, textElementV, textElementV1, "35");
          if (obj3 != PatchProxyResult.class) {
             i = obj3.intValue();
          label_00b0 :
             if (PostExperimentUtils.t1() && textElementV.J != null) {
                textElementV.u1(i, Integer.valueOf(p0.i().q()), 0);
                textElementV.p1(i, p0.i().k());
             }
             return;
          }
       }
       i = this.p0(p0, p1, p2, this, false, true, p3, 0xbf800000, 0xbf800000, TextStyleValue.a(p0.i().l(), 0, null, null, null, null, 0, null, false, 255, null));
       goto label_00b0 ;
    }
    public final void r1(int p0,String p1){
       int i1;
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, textElementV, "48")) {
          return;
       }
       String str = "text";
       a.p(p1, str);
       TextElementViewModel tF = this.F;
       Objects.requireNonNull(tF);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, tF, uoe, "15")) {
          a.p(p1, str);
          tF.o(true);
          int i = tF.m(p0);
          String str1 = "TextElementRepo";
          if (i < 0) {
             str = "updateTextString cannot find corresponding text updateDraftPosition = "+i;
             PostUtils.D(str1, str, new RuntimeException(str));
             i1.c(new RuntimeException("updateTextString error deleteDraftPosition"));
          }else {
             e c = tF.c;
             if (c == null) {
                a.S("mTextDraft");
             }
             GeneratedMessageLite$Builder uBuilder = c.n(i);
             a.o(uBuilder, "mTextDraft.getBuilder\(updateDraftPosition\)");
             uBuilder.m(p1);
             i1 = tF.l(p0);
             ListHolder value = tF.a.getValue();
             if (value != null) {
                List list = value.c();
                if (list != null) {
                   b uob = list.get(i1);
                   if (uob != null) {
                      uBuilder.h(uob.a().getFeatureId());
                      StickerResult$b uob1 = uBuilder.getResult().toBuilder();
                      StickerResult result = uob.a().getResult();
                      a.o(result, "it.draftText.result");
                      uob1.s(result.getRotate());
                      uBuilder.j(uob1);
                      GeneratedMessageLite generatedMes = uBuilder.build();
                      a.o(generatedMes, "textBuilder.build\(\)");
                      uob.b(generatedMes);
                   }
                }
             }
             Object[] objArray1 = new Object[0];
             a.D().w(str1, "updateTextDraft layerIndex:"+p0+", text:"+p1+", "+"updateDraftPosition:"+i+", updateDraftDataPosition:"+i1, objArray1);
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "updateDraftText layerIndex:"+p0+", text:"+p1, objArray);
       return;
    }
    public final void s1(int p0,String p1){
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, textElementV, "49")) {
          return;
       }
       String str = "fontName";
       a.p(p1, str);
       TextElementViewModel tF = this.F;
       Objects.requireNonNull(tF);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, tF, uoe, "17")) {
          a.p(p1, str);
          tF.o(true);
          int i = tF.m(p0);
          uoe = tF.c;
          if (uoe == null) {
             a.S("mTextDraft");
          }
          GeneratedMessageLite$Builder uBuilder = uoe.n(i);
          a.o(uBuilder, "mTextDraft.getBuilder\(updateDraftPosition\)");
          uBuilder.e(p1);
          int i1 = tF.l(p0);
          ListHolder value = tF.a.getValue();
          if (value != null) {
             List list = value.c();
             if (list != null) {
                b uob = list.get(i1);
                if (uob != null) {
                   GeneratedMessageLite generatedMes = uBuilder.build();
                   a.o(generatedMes, "textBuilder.build\(\)");
                   uob.b(generatedMes);
                }
             }
          }
          Object[] objArray1 = new Object[0];
          a.D().w("TextElementRepo", "updateTextFontName layerIndex:"+p0+", fontName:"+p1+", "+"updateDraftPosition:"+i+", updateDraftDataPosition:"+i1, objArray1);
       }
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "updateDraftTextFont layerIndex:"+p0+", fontName:"+p1, objArray);
       return;
    }
    public final void t0(boolean p0){
       boolean b3;
       e c;
       StickerResult result;
       double d;
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, textElementV, "16")) {
          return;
       }
       textElementV = this.F;
       boolean b = true;
       boolean b1 = false;
       boolean b2 = (p0 || this.j != null)? true: false;
       TextElementViewModel tH = this.H;
       Objects.requireNonNull(textElementV);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b2), Boolean.valueOf(tH), textElementV, uoe, "6")) {
          a0 uoa0 = a0.B(new Pair(new ArrayList(), new ArrayList())).C(new d(textElementV));
          ArrayList obj = PatchProxy.apply(null, textElementV, uoe, "7");
          if (obj != PatchProxyResult.class) {
             b3 = obj.booleanValue();
          }else {
             uoe = textElementV.c;
             if (uoe == null) {
                a.S("mTextDraft");
             }
             if (uoe.z().isEmpty()) {
                b3 = false;
             }else {
                uoe = textElementV.c;
                if (uoe == null) {
                   a.S("mTextDraft");
                }
                StickerResult obj1 = uoe.z().get(b1);
                a.o(obj1, "mTextDraft.messages[0]");
                obj1 = obj1.getResult();
                a.o(obj1, "mTextDraft.messages[0].result");
                double resourceWidt = obj1.getResourceWidth();
                d = (double)10;
                if (resourceWidt - d > 0) {
                   uoe = textElementV.c;
                   if (uoe == null) {
                      a.S("mTextDraft");
                   }
                   Object obj2 = uoe.z().get(b1);
                   a.o(obj2, "mTextDraft\n        .messages[0]");
                   obj1 = obj2.getResult();
                   a.o(obj1, "mTextDraft\n        .messages[0].result");
                   if (obj1.getResourceHeight() - d > 0) {
                      b3 = false;
                   label_00dd :
                      Object[] objArray2 = new Object[b1];
                      a.D().w("TextElementRepo", "isOldTextDraft isOldTextDraft:"+b3, objArray2);
                   }
                }
                b3 = true;
                goto label_00dd ;
             }
          }
          if (b3 && tH == null) {
             textElementV.d.setValue(new Pair(Boolean.TRUE, new ArrayList()));
             obj = new ArrayList();
             ArrayList uArrayList = new ArrayList();
             c = textElementV.c;
             if (c == null) {
                a.S("mTextDraft");
             }
             List list = c.z();
             a.o(list, "mTextDraft.messages");
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Text text = iterator.next();
                DraftFileManager uDraftFileMa = DraftFileManager.E();
                a.o(text, "it");
                result = text.getResult();
                a.o(result, "it.result");
                String previewImage = result.getPreviewImageFile();
                e c1 = textElementV.c;
                if (c1 == null) {
                   a.S("mTextDraft");
                }
                File uFile = uDraftFileMa.B(previewImage, c1);
                if (uFile != null) {
                   obj.add(uFile);
                   uArrayList.add(text);
                }
             }
             uoa0 = a0.B(new Pair(uArrayList, obj)).G(d.c).C(a.b);
          }
          uoa0.G(d.a).R(new b(textElementV, b2, tH), c.b);
          Object[] objArray1 = new Object[b1];
          a.D().w("TextElementRepo", "bindPanel loadAll:"+b2+", isCover:"+tH, objArray1);
       }
       this.j = b1;
       this.h.setValue(Boolean.TRUE);
       this.b = b;
       Object[] objArray = new Object[b1];
       a.D().w("TextElementViewModel", "bindPanel reloadAll:"+p0, objArray);
       return;
    }
    public final void t1(int p0,TextStyleValue p1,int p2){
       if (PatchProxy.isSupport(TextElementViewModel.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, TextElementViewModel.class, "24")) {
          return;
       }
       ListHolder value = this.w.getValue();
       if (value != null) {
          List list = value.c();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                if (uoc.a().y0()) {
                   if (p0 == uoc.a().l0()) {
                      this.A1(uoc.a().l0(), p1, 17, p2, true);
                   }else {
                      this.A1(uoc.a().l0(), p1, 18, p2, true);
                   }
                }
             }
          }
       }
       return;
    }
    public final boolean u0(int p0){
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, textElementV, "39");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       ListHolder value = this.w.getValue();
       if (value != null) {
          List list = value.c();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                if (iterator.next().a().l0() == p0) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
    public final void u1(int p0,Integer p1,boolean p2){
       if (PatchProxy.isSupport(TextElementViewModel.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, TextElementViewModel.class, "27")) {
          return;
       }
       Pair value = this.U0(p2).getValue();
       if (value != null) {
          Object obj = value.getFirst();
          if (obj != null) {
             int i = obj.h();
             int i1 = (p1 != null)? p1.intValue(): (i + 1) % 3;
             obj.k(i1);
             if (p2) {
                this.t1(p0, obj, 2);
             }else {
                TextElementViewModel.B1(this, p0, obj, 0, 2, false, 4, null);
             }
          }
       }
       return;
    }
    public final void v0(int p0,int p1){
       TextElementViewModel textElementV = TextElementViewModel.class;
       if (PatchProxy.isSupport(textElementV) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, textElementV, "42")) {
          return;
       }
       this.F.b(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "deleteTextElement layerIndex:"+p0+", payload:"+p1, objArray);
       return;
    }
    public final void v1(EditTextBaseElementData p0,Size p1,String p2,int p3){
       if (PatchProxy.isSupport(TextElementViewModel.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, TextElementViewModel.class, "51")) {
          return;
       }
       h0 oh0 = p0.e0();
       TimeRange$b uob = TimeRange.newBuilder();
       uob.b(p0.m0());
       uob.a(p0.j0());
       GeneratedMessageLite generatedMes = uob.build();
       a.o(generatedMes, "TimeRange.newBuilder\(\).s¡­entData.duration\).build\(\)");
       this.F.r(p0.l0(), oh0.b(StickerTextValueType.Draft), generatedMes, p0.B0(), p1, p2, p3);
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "unSelectTextElement editTextBaseElementData:"+p0+", assetSize:"+p1+", regenerateFilePath:"+p2+", elementCommonData"+oh0, objArray);
       return;
    }
    public final void w1(int p0,String p1,int p2){
       int i1;
       b uob;
       if (PatchProxy.isSupport(TextElementViewModel.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, TextElementViewModel.class, "21")) {
          return;
       }
       String str = "fontFileName";
       a.p(p1, str);
       TextElementViewModel tF = this.F;
       Objects.requireNonNull(tF);
       if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), tF, e.class, "19")) {
          a.p(p1, str);
          tF.o(true);
          e c = tF.c;
          String str1 = "mTextDraft";
          if (c == null) {
             a.S(str1);
          }
          if (!c.D()) {
             i1.c(new RuntimeException("updateTextElementFont error textDraft not editing"));
          }
          int i = tF.m(p0);
          e c1 = tF.c;
          if (c1 == null) {
             a.S(str1);
          }
          GeneratedMessageLite$Builder uBuilder = c1.n(i);
          a.o(uBuilder, "mTextDraft.getBuilder\(updateDraftPosition\)");
          uBuilder.e(p1);
          i1 = tF.l(p0);
          ListHolder value = tF.a.getValue();
          if (value != null) {
             List list = value.c();
             if (list != null) {
                uob = list.get(i1);
             label_009b :
                if (uob != null) {
                   GeneratedMessageLite generatedMes = uBuilder.build();
                   a.o(generatedMes, "textBuilder.build\(\)");
                   uob.b(generatedMes);
                   tF.a.y(i1, uob, Integer.valueOf(p2));
                }
                Object[] objArray1 = new Object[0];
                a.D().w("TextElementRepo", "updateTextElementFont updateDraftPosition:"+i+", updateDraftDataPosition:"+i1, objArray1);
             }
          }
          uob = null;
          goto label_009b ;
       }
       this.x0(p1);
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "updateTextElementFont layerIndex:"+p0+", fontFileName"+p1, objArray);
       return;
    }
    public final void x0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewModel.class, "72")) {
          return;
       }
       if (this.J != null && PostExperimentUtils.t1()) {
          Integer integer = this.I.r0(p0);
          if (integer != null) {
             this.I.z0(integer.intValue());
          }else {
             this.I.z0(0);
          }
       }
       return;
    }
    public final a y0(EditTextBaseElementData p0,TextConfigParam p1,List p2,boolean p3,TextStyleValue p4){
       Object obj1;
       float f2;
       String str1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TextElementViewModel textElementV = TextElementViewModel.class;
       boolean i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(textElementV)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          obj1 = PatchProxy.apply(objArray, obj, textElementV, "70");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       StickerTextValueType editElement = StickerTextValueType.EditElement;
       float f = (p1.f())? p0.w(): 0x3f000000;
       float f1 = p0.x();
       if (p1.b()) {
          f2 = p0.A();
       }else if(p3){
          f2 = 0x3f333333;
       }else {
          f2 = 0x3f800000;
       }
       TextElementViewModel f3 = obj.f;
       float f4 = (p1.a())? p0.z(): 0;
       h0 oh0 = new h0(f, f1, f2, f4, editElement, f3, 0, p0.i0(), 64, null);
       TextDrawConfigParam textDrawConf = p0.C0();
       String str = "SourceHanSansCN-Bold.otf";
       if (PostExperimentUtils.t1() && obj.J != null) {
          TextDrawConfigParam textDrawConf1 = ((p1.i().k()).length() > 0)? 1: null;
          if (textDrawConf1) {
             str1 = p1.i().k();
          }else {
             str1 = str;
          }
       }else {
          str1 = textDrawConf.k();
       }
       String str2 = (!p1.i().i())? str: str1;
       int i2 = 0;
       RectF rectF = null;
       TextDrawConfigParam textDrawConf2 = p1.i();
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       int i9 = 0;
       Rect rect = null;
       int i10 = 0;
       String str3 = p1.j();
       String str4 = p0.l();
       TimeRange$b obj2 = PatchProxy.applyTwoRefs(str3, str4, obj, textElementV, "64");
       if (obj2 != patchProxyRe) {
          i = obj2.booleanValue();
       }else if(b.a(str3) && (b.a(str4) || (d.q(str3) && d.q(str4)))){
          i = true;
       }else {
          i = false;
       }
       String str5 = (i)? textDrawConf.x(): p1.i().x();
       obj2 = TimeRange.newBuilder();
       obj2.b(p0.m0());
       obj2.a(p0.j0());
       GeneratedMessageLite generatedMes = obj2.build();
       a.o(generatedMes, "TimeRange.newBuilder\(\).s¡­entData.duration\).build\(\)");
       a uoa = new a(TextConfigParam.c(p1, i2, rectF, null, 0, 0, 0, 0, 0, 0, 0, TextDrawConfigParam.b(textDrawConf2, i3, i4, i5, i6, i7, i8, i9, rect, i10, 0, null, 0, 0, 0, str5, textDrawConf.e(), textDrawConf.m(), str2, false, 0, 0, 0, 0, 0, null, null, 0x3fc3fff, null), 1023, null), obj1.b(StickerTextValueType.Draft), generatedMes, p0.l0(), p2, p0.B0(), p0.y0(), p4);
       return str5;
    }
    public final void y1(EditTextBaseElement p0,float p1,float p2){
       if (PatchProxy.isSupport(TextElementViewModel.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, TextElementViewModel.class, "50")) {
          return;
       }
       a.p(p0, "editTextBaseElement");
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "updateTextElementPosition editTextBaseElement: "+p0+" positionXPercent: "+p1+" positionYPercent: "+p2, objArray);
       Pair pair = this.z0(p0);
       EditTextBaseElementData editTextBase = p0.getEditTextBaseElementData();
       editTextBase.Y(p1);
       editTextBase.Z(p2);
       Size second = pair.getSecond();
       String first = pair.getFirst();
       this.v1(editTextBase, second, first, 25);
       return;
    }
    public final Pair z0(EditTextBaseElement p0){
       String decorationFi;
       Size obj = PatchProxy.applyOneRefs(p0, this, TextElementViewModel.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = -1;
       obj = new Size(i, i);
       if (p0.isNeedReGenerateFile()) {
          float f = (this.r != null)? 0x3f800000: this.d;
          p0.generateDecorationBitmap(f);
          BaseDrawer mDecorationB = p0.mDecorationBitmap;
          int width = (mDecorationB != null)? mDecorationB.getWidth(): -1;
          obj.b = width;
          mDecorationB = p0.mDecorationBitmap;
          if (mDecorationB != null) {
             i = mDecorationB.getHeight();
          }
          obj.c = i;
          this.a.a(p0);
          decorationFi = p0.getDecorationFilePath();
          a.o(decorationFi, "editTextBaseElement.decorationFilePath");
       }else {
          decorationFi = "";
       }
       return new Pair(decorationFi, obj);
    }
    public final void z1(int p0,String p1,int p2){
       if (PatchProxy.isSupport(TextElementViewModel.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, TextElementViewModel.class, "20")) {
          return;
       }
       a.p(p1, "showingText");
       e.s(this.F, p0, null, null, p1, null, null, p2, 54, null);
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "updateTextElementShowingText layerIndex:"+p0+", showingText"+p1, objArray);
       return;
    }
}
