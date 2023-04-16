package com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import java.lang.String;
import suc.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import htc.b;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import java.lang.CharSequence;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.HashMap;
import juc.b;
import huc.d;
import java.lang.Integer;
import nsd.u;
import java.lang.UnsupportedOperationException;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import java.lang.Double;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import kotlin.Pair;
import java.lang.Number;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import juc.c;
import android.graphics.Bitmap;
import voc.l;
import suc.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextChangeParam;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import h80.c;
import h80.k;
import h80.m;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.widget.AbsoluteLayout;
import android.graphics.RectF;
import usd.q;
import com.yxcorp.gifshow.edit.previewer.utils.TextPainterContentDimensionException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import w46.b;
import android.content.Context;
import android.widget.AbsoluteLayout$LayoutParams;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement$a;
import qvc.b;
import android.widget.RelativeLayout;
import wba.h0;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import java.lang.RuntimeException;
import lnc.i1;
import android.widget.EditText;
import android.os.Parcel;

public class EditTextBaseElement extends EditDecorationBaseDrawer	// class@0013f6
{
    public final b editPainter;
    public b iTextElementAction;
    public final String initText;
    public boolean isInitText;
    public final boolean isTextModUpdate;
    public TextDrawerLayout textDrawerLayout;

    public void EditTextBaseElement(EditTextBaseElementData p0,String p1,b p2,boolean p3){
       String str;
       HashMap hashMap;
       b uob;
       a.p(p0, "editTextBaseElementData");
       a.p(p1, "initText");
       super(p0, p0.l(), p0.m0(), p0.j0(), p0.l0());
       this.initText = p1;
       this.iTextElementAction = p2;
       this.isTextModUpdate = p3;
       p1 = null;
       p2 = 1;
       if (b.a(this.mBaseDrawerData.l())) {
          if (this.mBaseDrawerData.C0().x().length()) {
             p2 = null;
          }
          str = (p2)? a1.p(R.string.arg_RES_7f1048a6): this.mBaseDrawerData.C0().x();
          hashMap = PatchProxy.applyOneRefs(str, p1, b.class, "3");
          if (hashMap != PatchProxyResult.class) {
          }else {
             hashMap = new HashMap();
             hashMap.put("title", str);
          }
          uob = d.j(this.mBaseDrawerData.l(), hashMap, p3);
          a.o(uob, "generateTextPainter\(mBas¡­aramMap, isTextModUpdate\)");
       }else if(d.q(this.mBaseDrawerData.l())){
          if (this.mBaseDrawerData.C0().x().length()) {
             p2 = null;
          }
          str = (p2 != null)? "": this.mBaseDrawerData.C0().x();
          hashMap = PatchProxy.applyOneRefs(str, p1, d.class, "22");
          if (hashMap != PatchProxyResult.class) {
          }else {
             hashMap = new HashMap();
             hashMap.put("timeText", str);
          }
          uob = d.j(this.mBaseDrawerData.l(), hashMap, p3);
          a.o(uob, "generateTextPainter\(mBas¡­aramMap, isTextModUpdate\)");
       }else {
          HashMap hashMap1 = new HashMap();
          hashMap1.put("nowShowFrom", Integer.valueOf(this.mBaseDrawerData.A0()));
          uob = d.j(this.mBaseDrawerData.l(), hashMap1, p3);
          a.o(uob, "generateTextPainter\(mBas¡­aramMap, isTextModUpdate\)");
       }
       this.editPainter = uob;
       return;
    }
    public void EditTextBaseElement(EditTextBaseElementData p0,String p1,b p2,boolean p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = "";
       }
       if (p4 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public void EditTextBaseElement(EditTextBaseElementData p0,String p1,boolean p2){
       super(p0, p1, null, p2, 4, null);
    }
    public void EditTextBaseElement(EditTextBaseElementData p0,boolean p1){
       super(p0, null, null, p1, 6, null);
    }
    public static void calculateAndUpdateDimen$default(EditTextBaseElement p0,boolean p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateAndUpdateDimen");
       }
       if (p2 & 1) {
          p1 = true;
       }
       p0.g(p1);
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void drawDebug(Canvas p0,Paint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditTextBaseElement.class, "33")) {
          return;
       }
       a.p(p0, "canvas");
       a.p(p1, "linePaint");
       super.drawDebug(p0, p1);
       p0.drawRect(this.getTextContentRect(), p1);
       Rect textContentR = this.getTextContentRect();
       float f = (float)4;
       p1.setStrokeWidth((p1.getStrokeWidth() * f));
       p0.drawPoint(((float)textContentR.centerX() * 0x3f800000), ((float)textContentR.centerY() * 0x3f800000), p1);
       p1.setStrokeWidth((p1.getStrokeWidth() / f));
       p0.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
       return;
    }
    public final void fixOldTextScale(double p0){
       if (PatchProxy.isSupport(EditTextBaseElement.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, EditTextBaseElement.class, "34")) {
          return;
       }
       this.mBaseDrawerData.b0((float)(p0 / (double)this.getOriginContentRect().width()));
       Object[] objArray = new Object[0];
       a.D().w("EditTextBaseElement", "fixOldTextScale oldTextFixParam:"+p0+", mBaseDrawerData.scale:"+this.mBaseDrawerData.A()+", contentRect.width\(\):"+this.getContentRect().width(), objArray);
       return;
    }
    public final void g(boolean p0){
       if (PatchProxy.isSupport(EditTextBaseElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditTextBaseElement.class, "12")) {
          return;
       }
       Pair pair = this.editPainter.c();
       a.o(pair, "editPainter.getContentDimension\(\)");
       Object first = pair.getFirst();
       a.o(first, "contentDimension.first");
       float f = first.floatValue();
       BaseDrawer second = pair.getSecond();
       a.o(second, "contentDimension.second");
       float f1 = second.floatValue();
       float f2 = (float)2;
       float f3 = ((((((this.mBaseDrawerData.A() * f) * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()) + (float)this.getWholeRect().width()) - (float)this.getContentRect().width()) - (float)this.getWholeRect().width()) / f2;
       float f4 = ((((((this.mBaseDrawerData.A() * f1) * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()) + (float)this.getWholeRect().height()) - (float)this.getContentRect().height()) - (float)this.getWholeRect().height()) / f2;
       f3 = this.computeShowingWidthFitLimit(f3, true);
       f4 = this.computeShowingHeightFitLimit(f4);
       f2 = 0xbf800000;
       float f5 = 0;
       if (!f3 - f2) {
          f = this.mBaseDrawerData.i();
          f3 = 0;
       }
       if (!f4 - f2) {
          f1 = this.mBaseDrawerData.f();
          f4 = 0;
       }
       if (!p0) {
          f4 = 0;
       }else {
          f5 = f3;
       }
       if (!PatchProxy.isSupport(EditTextBaseElement.class) || !PatchProxy.applyVoidFourRefs(Float.valueOf(f), Float.valueOf(f1), Float.valueOf(f5), Float.valueOf(f4), this, EditTextBaseElement.class, "22")) {
          f1 = f1 + this.editPainter.k();
          this.mBaseDrawerData.M(f1);
          this.mBaseDrawerData.P(f);
          BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
          tmBaseDrawer.Y((tmBaseDrawer.w() + (f5 / (float)this.mEditRect.width())));
          tmBaseDrawer = this.mBaseDrawerData;
          tmBaseDrawer.Z((tmBaseDrawer.x() + (f4 / (float)this.mEditRect.height())));
          tmBaseDrawer = this.mDecorationShowingView;
          a.o(tmBaseDrawer, "mDecorationShowingView");
          ViewGroup$LayoutParams layoutParams = tmBaseDrawer.getLayoutParams();
          layoutParams.width = (int)f;
          layoutParams.height = (int)f1;
          second = this.mDecorationShowingView;
          a.o(second, "mDecorationShowingView");
          second.setLayoutParams(layoutParams);
          this.update();
       }
       return;
    }
    public final void generateDecorationBitmap(float p0){
       if (PatchProxy.isSupport(EditTextBaseElement.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, EditTextBaseElement.class, "21")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditTextBaseElement", "generateDecorationBitmap mediaProportion:"+p0+", this:"+this+','+" mBaseDrawerData.scale:"+this.mBaseDrawerData.A()+", getInputScale\(\):"+this.getInputScale(), objArray);
       this.mDecorationBitmap = l.b(this.editPainter, ((p0 * this.mBaseDrawerData.A()) * this.getInputScale()));
       return;
    }
    public Rect getContentRect(){
       Rect obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getContentRect();
       int a = a.a;
       obj.top = obj.top - (int)((float)a / this.mBaseDrawerData.t());
       obj.bottom = obj.bottom + (int)((float)a / this.mBaseDrawerData.t());
       a.o(obj, "contentRect");
       return obj;
    }
    public final String getDecorName(){
       Object obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.l();
    }
    public final b getEditPainter(){
       return this.editPainter;
    }
    public final EditTextBaseElementData getEditTextBaseElementData(){
       Object obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditTextBaseElementData uEditTextBas = new EditTextBaseElementData(this.mBaseDrawerData.C0(), this.mBaseDrawerData.i0(), null, 0, 0, 0, null, 124, null);
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       a.o(tmBaseDrawer, "mBaseDrawerData");
       obj.a(tmBaseDrawer);
       return obj;
    }
    public final int getFromWhere(){
       Object obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBaseDrawerData.A0();
    }
    public final b getITextElementAction(){
       return this.iTextElementAction;
    }
    public final float getInputScale(){
       Object obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.d();
    }
    public final Rect getOriginTextContentRect(){
       Rect obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getOriginContentRect();
       a.o(obj, "super.getOriginContentRect\(\)");
       return obj;
    }
    public Rect getRemoveButtonRect(){
       Rect obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getRemoveButtonRect();
       c uoc = k.a();
       a.o(uoc, "PostConfiguration.getEditEnvContext\(\)");
       int i = 0;
       if (uoc.b().c()) {
          obj.offset((BaseDrawer.DECORATION_REMOVE_ICON_WIDTH / 2), i);
       }
       Object[] objArray = new Object[i];
       a.D().s("EditTextBaseElement", "getRemoveButtonRect removeButtonRect = "+obj, objArray);
       a.o(obj, "removeButtonRect");
       return obj;
    }
    public Rect getScaleOrRotateButtonRect(){
       Rect obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getScaleOrRotateButtonRect();
       c uoc = k.a();
       a.o(uoc, "PostConfiguration.getEditEnvContext\(\)");
       int i = 0;
       if (uoc.b().c()) {
          obj.offset(((- BaseDrawer.DECORATION_SCALE_ROTATE_ICON_WIDTH) / 2), i);
       }
       Object[] objArray = new Object[i];
       a.D().s("EditTextBaseElement", "getScaleOrRotateButtonRect scaleOrRotateButtonRect = "+obj, objArray);
       a.o(obj, "scaleOrRotateButtonRect");
       return obj;
    }
    public final String getText(){
       Object obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.B0();
    }
    public final Rect getTextContentRect(){
       Rect obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getContentRect();
       a.o(obj, "super.getContentRect\(\)");
       return obj;
    }
    public final TextDrawerLayout getTextDrawerLayout(){
       EditTextBaseElement obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.textDrawerLayout;
       if (obj == null) {
          a.S("textDrawerLayout");
       }
       return obj;
    }
    public final String getTextFontName(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       EditTextBaseElement obj = PatchProxy.apply(objArray, this, EditTextBaseElement.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.editPainter;
       Objects.requireNonNull(obj);
       String str = PatchProxy.apply(objArray, obj, b.class, "9");
       if (str != patchProxyRe) {
       }else {
          str = obj.b.k();
       }
       a.o(str, "editPainter.textFont");
       return str;
    }
    public final TextStyleAttrs getTextStyleAttrs(){
       Object obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.C0().o();
    }
    public final TextStyleValue getTextStyleValue(){
       Object[] objArray = null;
       BaseDrawer obj = PatchProxy.apply(objArray, this, EditTextBaseElement.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBaseDrawerData;
       if (obj != null) {
          objArray = obj.z0();
       }
       return objArray;
    }
    public String getUploadText(){
       Object obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.B0();
    }
    public Rect getWholeRect(){
       Rect obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getWholeRect();
       c uoc = k.a();
       a.o(uoc, "PostConfiguration.getEditEnvContext\(\)");
       if (uoc.b().c()) {
          obj.left = this.getOutBoxRect().left;
          obj.right = this.getOutBoxRect().right;
       }
       a.o(obj, "wholeRect");
       return obj;
    }
    public void initPainterMaxDimension(DecorationContainerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextBaseElement.class, "5")) {
          return;
       }
       a.p(p0, "decorationContainerView");
       float f = (float)p0.getWidth() - ((this.mBaseDrawerData.n().left + this.mBaseDrawerData.n().right) / p0.getScaleX());
       float f1 = ((float)p0.getHeight() - (this.mBaseDrawerData.n().top + this.mBaseDrawerData.n().bottom)) / p0.getScaleX();
       int i = (this.editPainter.r().g0() > 0)? q.u((int)f, this.editPainter.r().g0()): (int)f;
       int i1 = (int)f1;
       int i2 = q.u(i1, this.editPainter.r().v());
       if (!i || !i2) {
          String str = "initPainterMaxDimension, width = "+i+", height = "+i2+", containerViewWidth = "+p0.getWidth()+", containerViewHeight = "+p0.getHeight();
          ExceptionHandler.handleCaughtException(new TextPainterContentDimensionException(str));
          Object[] objArray = new Object[0];
          a.D().t("TextPainterContentDimensionException", str, objArray);
       }
       EditTextBaseElement teditPainter = this.editPainter;
       int i3 = (teditPainter.r().g0() > 0)? q.u((int)f, this.editPainter.r().g0()): (int)f;
       teditPainter.e(i3, q.u(i1, this.editPainter.r().v()));
       return;
    }
    public View initView(DecorationContainerView p0){
       TextDrawerLayout obj = PatchProxy.applyOneRefs(p0, this, EditTextBaseElement.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "decorationContainerView");
       this.initPainterMaxDimension(p0);
       this.editPainter.q().j(p0.getWidth());
       this.editPainter.q().i(p0.getHeight());
       Context context = p0.getContext();
       a.o(context, "decorationContainerView.getContext\(\)");
       obj = this.editPainter.b(context);
       this.textDrawerLayout = obj;
       if (obj == null) {
          a.S("textDrawerLayout");
       }
       this.mDecorationShowingView = obj;
       a.o(obj, "mDecorationShowingView");
       obj.setLayoutParams(new AbsoluteLayout$LayoutParams(0, 0, 0, 0));
       EditTextBaseElement ttextDrawerL = this.textDrawerLayout;
       if (ttextDrawerL == null) {
          a.S("textDrawerLayout");
       }
       ttextDrawerL.a(new EditTextBaseElement$a(this, p0));
       this.editPainter.C(this.mBaseDrawerData.C0().k());
       this.editPainter.f(this.mBaseDrawerData.z0());
       float f = (this.mBaseDrawerData.A() * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d();
       if (f - (float)0 > 0) {
          Object[] objArray = new Object[0];
          a.D().w("EditTextBaseElement", "initView mBaseDrawerData.scale = "+this.mBaseDrawerData.A()+' '+"mBaseDrawerData.editorScale = "+this.mBaseDrawerData.m()+' '+"mBaseDrawerData.additionalScale = "+this.mBaseDrawerData.d()+' '+"scale = "+f, objArray);
          this.editPainter.q().w(f);
       }
       this.editPainter.q().l(this.mBaseDrawerData.d());
       boolean b = true;
       EditTextBaseElement uEditTextBas = (this.initText.length() > 0)? 1: null;
       if (uEditTextBas) {
          this.isInitText = b;
          uEditTextBas = this.textDrawerLayout;
          if (uEditTextBas == null) {
             a.S("textDrawerLayout");
          }
          uEditTextBas.setText(this.initText);
          this.isInitText = false;
       }
       Pair pair = this.editPainter.c();
       a.o(pair, "editPainter.getContentDimension\(\)");
       float f1 = pair.getSecond().floatValue() + this.editPainter.k();
       TextChangeParam first = pair.getFirst();
       a.o(first, "contentDimension.first");
       this.mBaseDrawerData.P(first.floatValue());
       this.mBaseDrawerData.M(f1);
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       first = this.editPainter.q();
       a.o(first, "editPainter.textChangeParam");
       Objects.requireNonNull(tmBaseDrawer);
       if (!PatchProxy.applyVoidOneRefs(first, tmBaseDrawer, EditTextBaseElementData.class, "2")) {
          a.p(first, "textChangeParam");
          tmBaseDrawer.I = first;
       }
       AbsoluteLayout$LayoutParams layoutParams = new AbsoluteLayout$LayoutParams((int)pair.getFirst().floatValue(), (int)f1, 0, 0);
       uEditTextBas = this.textDrawerLayout;
       if (uEditTextBas == null) {
          a.S("textDrawerLayout");
       }
       uEditTextBas.setLayoutParams(layoutParams);
       uEditTextBas = this.textDrawerLayout;
       if (uEditTextBas == null) {
          a.S("textDrawerLayout");
       }
       return uEditTextBas;
    }
    public boolean interceptTouchEvent(){
       EditTextBaseElement obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.textDrawerLayout;
       if (obj == null) {
          a.S("textDrawerLayout");
       }
       return obj.d();
    }
    public boolean isEnableSelectBox(){
       c obj = PatchProxy.apply(null, this, EditTextBaseElement.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = k.a();
       a.o(obj, "PostConfiguration.getEditEnvContext\(\)");
       return obj.b().c;
    }
    public boolean isInWholeDecoration(float p0,float p1){
       c obj;
       boolean b;
       if (PatchProxy.isSupport(EditTextBaseElement.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, EditTextBaseElement.class, "35");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = k.a();
       a.o(obj, "PostConfiguration.getEditEnvContext\(\)");
       if (obj.b().c()) {
          return super.isInWholeDecoration(p0, p1);
       }else if(!this.isPointInTheRect(p0, p1, this.getOutBoxRect()) && (this.isPointInTheRect(p0, p1, this.getRemoveButtonRect()) || this.isPointInTheRect(p0, p1, this.getScaleOrRotateButtonRect()))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public final boolean isInitText(){
       return this.isInitText;
    }
    public void onDoubleFingerScaleAndRotateEnd(){
       if (PatchProxy.applyVoid(null, this, EditTextBaseElement.class, "32")) {
          return;
       }
       super.onDoubleFingerScaleAndRotateEnd();
       this.editPainter.A(((this.mBaseDrawerData.A() * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()));
       return;
    }
    public void onSingleFingerScaleAndRotateEnd(){
       if (PatchProxy.applyVoid(null, this, EditTextBaseElement.class, "31")) {
          return;
       }
       super.onSingleFingerScaleAndRotateEnd();
       this.editPainter.A(((this.mBaseDrawerData.A() * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()));
       return;
    }
    public final void reCalculateAndUpdateDimen(boolean p0){
       if (PatchProxy.isSupport(EditTextBaseElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditTextBaseElement.class, "7")) {
          return;
       }
       float f = this.editPainter.q().c() * ((((this.editPainter.p() + (float)this.editPainter.r().w().left) + (float)this.editPainter.r().w().right) + this.mBaseDrawerData.n().left) + this.mBaseDrawerData.n().right);
       int i = this.editPainter.q().a();
       float f1 = (float)i;
       int i1 = 1;
       a uoa = ((float)this.getWholeRect().width() - (this.mBaseDrawerData.m() * f1) > 0 || (this.mBaseDrawerData.A() * f) - (this.mBaseDrawerData.m() * f1) > 0)? 1: null;
       if (p0 && uoa) {
          Object[] objArray = new Object[0];
          a.D().w("EditTextBaseElement", "mBaseDrawerData.editorScale = "+this.mBaseDrawerData.m()+' '+"editPainter.textChangeParam.containerViewWidth = "+i+' '+"wholeRect.width\(\) = "+this.getWholeRect().width()+" mBaseDrawerData.contentWidth = "+this.mBaseDrawerData.i()+' '+"editPainter.textAreaWidth = "+this.editPainter.p()+' '+"editPainter.textDrawConfigParam.textPadding  = "+this.editPainter.r().w()+' '+"mBaseDrawerData.elementDrawLimit = "+this.mBaseDrawerData.n()+' '+"before mBaseDrawerData.scale = "+this.mBaseDrawerData.A()+' ', objArray);
          BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
          BaseDrawer uBaseDrawer = tmBaseDrawer;
          uBaseDrawer.b0((((f1 * tmBaseDrawer.m()) * 0x3f800000) / f));
          Object[] objArray1 = new Object[0];
          a.D().w("EditTextBaseElement", "after mBaseDrawerData.scale = "+this.mBaseDrawerData.A(), objArray1);
       }else {
          i1 = 0;
       }
       this.mBaseDrawerData.K(this.editPainter.q().c());
       f = (this.mBaseDrawerData.A() * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d();
       if (f - (float)0 > 0) {
          Object[] objArray2 = new Object[0];
          a.D().w("EditTextBaseElement", "reCalculateAndUpdateDimen mBaseDrawerData.scale = "+this.mBaseDrawerData.A()+' '+"mBaseDrawerData.editorScale = "+this.mBaseDrawerData.m()+' '+"mBaseDrawerData.additionalScale = "+this.mBaseDrawerData.d()+' '+"scale = "+f, objArray2);
          this.editPainter.q().w(f);
       }
       if (i1) {
          EditTextBaseElement teditPainter = this.editPainter;
          teditPainter.d(teditPainter.q().e());
       }
       this.g(p0);
       return;
    }
    public final void setITextElementAction(b p0){
       this.iTextElementAction = p0;
    }
    public final void setInitText(boolean p0){
       this.isInitText = p0;
    }
    public final void setTextDrawerLayout(TextDrawerLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextBaseElement.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.textDrawerLayout = p0;
       return;
    }
    public final void updateAlpha(float p0){
       if (PatchProxy.isSupport(EditTextBaseElement.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, EditTextBaseElement.class, "16")) {
          return;
       }
       this.mBaseDrawerData.L(p0);
       return;
    }
    public final void updateCommonData(h0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextBaseElement.class, "15")) {
          return;
       }
       a.p(p0, "stickerTextCommonData");
       if (p0.k() != StickerTextValueType.EditElement) {
          i1.c(new RuntimeException("updateCommonData error stickerTextCommonData:"+p0));
          return;
       }else {
          this.mBaseDrawerData.Y(p0.g());
          this.mBaseDrawerData.Z(p0.h());
          if (this.mBaseDrawerData.A() - p0.j()) {
             this.mBaseDrawerData.b0(p0.j());
             this.mIsNeedReGenerateFile = true;
          }
          if (this.mBaseDrawerData.m() - p0.d()) {
             this.mBaseDrawerData.U(p0.d());
             this.mIsNeedReGenerateFile = true;
          }
          if (this.mBaseDrawerData.d() - p0.c()) {
             this.mBaseDrawerData.K(p0.c());
             this.mIsNeedReGenerateFile = true;
          }
          this.mBaseDrawerData.a0(p0.i());
          this.mBaseDrawerData.W(p0.f());
          this.update();
          return;
       }
    }
    public final void updateText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextBaseElement.class, "6")) {
          return;
       }
       a.p(p0, "originText");
       EditTextBaseElement ttextDrawerL = this.textDrawerLayout;
       if (ttextDrawerL == null) {
          a.S("textDrawerLayout");
       }
       ttextDrawerL.setText(p0);
       EditTextBaseElement ttextDrawerL1 = this.textDrawerLayout;
       if (ttextDrawerL1 == null) {
          a.S("textDrawerLayout");
       }
       ttextDrawerL1.h();
       return;
    }
    public final void updateTextFont(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextBaseElement.class, "8")) {
          return;
       }
       a.p(p0, "fontName");
       this.editPainter.C(p0);
       TextDrawConfigParam textDrawConf = this.editPainter.r();
       a.o(textDrawConf, "editPainter.textDrawConfigParam");
       this.mBaseDrawerData.F0(textDrawConf);
       EditTextBaseElement.calculateAndUpdateDimen$default(this, false, 1, null);
       return;
    }
    public final void updateTextStyle(TextStyleValue p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextBaseElement.class, "9")) {
          return;
       }
       a.p(p0, "newTextStyle");
       this.mBaseDrawerData.D0(p0);
       this.editPainter.f(p0);
       EditTextBaseElement ttextDrawerL = this.textDrawerLayout;
       String str = "textDrawerLayout";
       if (ttextDrawerL == null) {
          a.S(str);
       }
       ttextDrawerL.c();
       ttextDrawerL = this.textDrawerLayout;
       if (ttextDrawerL == null) {
          a.S(str);
       }
       ttextDrawerL.getFocusEditText().invalidate();
       EditTextBaseElement.calculateAndUpdateDimen$default(this, false, 1, null);
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
    }
}
