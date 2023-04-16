package com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData;
import xnd.b;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import android.graphics.RectF;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement$editTextContainer$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.io.File;
import wnd.b;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import muc.c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.CreateTextElementException;
import java.lang.StringBuilder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import kotlin.Pair;
import juc.b;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import faa.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import q87.c;
import juc.c;
import android.graphics.Bitmap;
import voc.l;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.widget.AbsoluteLayout;
import java.util.ArrayList;
import jod.f;
import jod.b;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import android.graphics.Point;
import xnd.a;
import usd.q;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.TextPainterContentDimensionException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import w46.b;
import com.yxcorp.gifshow.v3.editor.text.model.TextChangeParam;
import android.content.Context;
import juc.a;
import java.lang.CharSequence;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement$a;
import qvc.b;
import android.widget.AbsoluteLayout$LayoutParams;
import juc.d;
import com.yxcorp.gifshow.v3.editor.text.dynamic.TemplateEditText;
import iuc.a;
import android.widget.EditText;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import android.widget.RelativeLayout;
import android.os.Parcel;

public final class NewEditTextElement extends NewEditTextBaseElement	// class@000b8e
{
    public DecorationContainerView containerView;
    public NewTextElementData currentTextElementData;
    public final p editTextContainer$delegate;
    public final NewTextElementData initTextElementData;
    public boolean isNeedGenerateBitmap;
    public final b onTextChangeListener;
    public TextDrawerLayout textDrawerLayout;

    public void NewEditTextElement(NewTextElementData p0){
       super(p0, null, 2, null);
    }
    public void NewEditTextElement(NewTextElementData p0,b p1){
       NewTextElementData newTextEleme1;
       float f2;
       float f3;
       BaseDrawerData$CustomButtonMode uCustomButto1;
       List list1;
       NewTextElementData newTextEleme2;
       int i = this;
       BaseDrawerData$CustomButtonMode obj = p0;
       a.p(obj, "initTextElementData");
       super(p0);
       i.initTextElementData = obj;
       i.onTextChangeListener = p1;
       int i1 = p0.l0();
       String str = p0.i0();
       double d = p0.m0();
       double d1 = p0.j0();
       List list = p0.A0();
       float f = p0.w();
       float f1 = p0.x();
       boolean b = p0.J0();
       String str1 = p0.F0();
       DraftTextStyleInfo uDraftTextSt = p0.G0();
       int i2 = p0.H0();
       NewTextElementData v = obj.V;
       NewTextElementData w = obj.W;
       DraftTTSInfo uDraftTTSInf = p0.I0();
       NewTextElementData newTextEleme = obj.X;
       NewTextElementData z = obj.Z;
       int i3 = p0.B0();
       obj = p0.E0();
       RectF rectF = p0.R0();
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(NewTextElementData.class)) {
          BaseDrawerData$CustomButtonMode uCustomButto = obj;
          Object[] objArray = new Object[19];
          objArray[0] = Integer.valueOf(i1);
          objArray[1] = str;
          objArray[2] = Double.valueOf(d);
          objArray[3] = Double.valueOf(d1);
          objArray[4] = list;
          objArray[5] = Float.valueOf(f);
          objArray[6] = Float.valueOf(f1);
          objArray[7] = Boolean.valueOf(b);
          objArray[8] = str1;
          objArray[9] = uDraftTextSt;
          objArray[10] = Integer.valueOf(i2);
          objArray[11] = v;
          objArray[12] = w;
          objArray[13] = newTextEleme;
          objArray[14] = uDraftTTSInf;
          objArray[15] = z;
          objArray[16] = Integer.valueOf(i3);
          objArray[17] = uCustomButto;
          objArray[18] = rectF;
          newTextEleme1 = w;
          f2 = f1;
          f3 = f;
          uCustomButto1 = uCustomButto;
          list1 = list;
          newTextEleme2 = PatchProxy.apply(objArray, p0, NewTextElementData.class, "9");
          if (newTextEleme2 != PatchProxyResult.class) {
          label_0144 :
             NewEditTextBaseElement newEditTextB = this;
             newEditTextB.currentTextElementData = newTextEleme2;
             newEditTextB.editTextContainer$delegate = s.c(new NewEditTextElement$editTextContainer$2(newEditTextB));
             return;
          }
       }else {
          list1 = list;
          f3 = f;
          f2 = f1;
          newTextEleme1 = w;
          uCustomButto1 = obj;
       }
       a.p(str, "decorationId");
       a.p(str1, "text");
       a.p(uDraftTextSt, "textStyleInfo");
       a.p(newTextEleme, "sk2cUnzipPath");
       a.p(z, "outputImageFile");
       a.p(uCustomButto1, "customIconMode");
       w = new NewTextElementData(b, str1, uDraftTextSt, i2, v, newTextEleme1, newTextEleme, uDraftTTSInf, z, i3, uCustomButto1, rectF, 0, 4096, null);
       newTextEleme2 = newTextEleme2.Q0(i1, str, d, d1, list1, f3, f2, i3);
       goto label_0144 ;
    }
    public void NewEditTextElement(NewTextElementData p0,b p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static boolean calculateAndUpdateDimen$default(NewEditTextElement p0,boolean p1,int p2,Object p3){
       if (p2 & 1) {
          p1 = true;
       }
       return p0.g(p1);
    }
    public final void checkNeedGenerateFile(){
       if (PatchProxy.applyVoid(null, this, NewEditTextElement.class, "15")) {
          return;
       }
       this.setNeedReGenerateFile((new File(b.b(this.currentTextElementData)).exists() ^ 0x01));
       return;
    }
    public final c createTextDrawer(NewTextElementData p0){
       DynamicTextParams obj = PatchProxy.applyOneRefs(p0, this, NewEditTextElement.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.T0();
       if (obj == null) {
          throw new CreateTextElementException("sk2cParams is null: "+p0);
       }
       TextDrawConfigParam textDrawConf = p0.V0();
       if (textDrawConf != null) {
          return new c(textDrawConf, obj, p0.U0());
       }
       throw new CreateTextElementException("textDrawConfigParam is null: "+p0);
    }
    public int describeContents(){
       return 0;
    }
    public void drawDebug(Canvas p0,Paint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NewEditTextElement.class, "22")) {
          return;
       }
       a.p(p0, "canvas");
       a.p(p1, "linePaint");
       super.drawDebug(p0, p1);
       Rect contentRect = super.getContentRect();
       p0.drawRect(contentRect, p1);
       float f = (float)4;
       p1.setStrokeWidth((p1.getStrokeWidth() * f));
       p0.drawPoint(((float)contentRect.centerX() * 0x3f800000), ((float)contentRect.centerY() * 0x3f800000), p1);
       p1.setStrokeWidth((p1.getStrokeWidth() / f));
       p0.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
       return;
    }
    public final boolean g(boolean p0){
       Pair obj;
       if (PatchProxy.isSupport(NewEditTextElement.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, NewEditTextElement.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.h().c();
       a.o(obj, "editTextContainer.getContentDimension\(\)");
       Object first = obj.getFirst();
       a.o(first, "contentDimension.first");
       float f = first.floatValue();
       BaseDrawer second = obj.getSecond();
       a.o(second, "contentDimension.second");
       float f1 = second.floatValue();
       float f2 = (float)2;
       float f3 = ((((((this.mBaseDrawerData.A() * f) * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()) + (float)this.getWholeRect().width()) - (float)this.getContentRect().width()) - (float)this.getWholeRect().width()) / f2;
       float f4 = ((((((this.mBaseDrawerData.A() * f1) * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()) + (float)this.getWholeRect().height()) - (float)this.getContentRect().height()) - (float)this.getWholeRect().height()) / f2;
       boolean b = true;
       f3 = this.computeShowingWidthFitLimit(f3, b);
       f4 = this.computeShowingHeightFitLimit(f4);
       int i = 0xbf800000;
       if (!f3 - i) {
          f = this.mBaseDrawerData.i();
          f3 = 0;
       }
       if (!f4 - i) {
          f1 = this.mBaseDrawerData.f();
          f4 = 0;
       }
       if (!p0) {
          f3 = 0;
          f4 = 0;
       }
       if (!PatchProxy.isSupport(NewEditTextElement.class) || !PatchProxy.applyVoidFourRefs(Float.valueOf(f), Float.valueOf(f1), Float.valueOf(f3), Float.valueOf(f4), this, NewEditTextElement.class, "26")) {
          this.mBaseDrawerData.M(f1);
          this.mBaseDrawerData.P(f);
          BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
          tmBaseDrawer.Y((tmBaseDrawer.w() + (f3 / (float)this.mEditRect.width())));
          tmBaseDrawer = this.mBaseDrawerData;
          tmBaseDrawer.Z((tmBaseDrawer.x() + (f4 / (float)this.mEditRect.height())));
          tmBaseDrawer = this.mDecorationShowingView;
          a.o(tmBaseDrawer, "mDecorationShowingView");
          ViewGroup$LayoutParams layoutParams = tmBaseDrawer.getLayoutParams();
          layoutParams.width = (int)f;
          layoutParams.height = (int)f1 + (int)this.h().k();
          second = this.mDecorationShowingView;
          a.o(second, "mDecorationShowingView");
          second.setLayoutParams(layoutParams);
          this.update();
       }
       if (!f3 && !f4) {
          b = false;
       }
       return b;
    }
    public void generateDecorationBitmap(){
       if (PatchProxy.applyVoid(null, this, NewEditTextElement.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("NewEditTextElement", "generateDecorationBitmap mediaProportion:"+this.getAssetProportion()+", this:"+this+','+" mBaseDrawerData.scale:"+this.mBaseDrawerData.A()+", getInputScale\(\):"+this.mBaseDrawerData.d(), objArray);
       this.mDecorationBitmap = l.b(this.h(), ((this.getAssetProportion() * this.mBaseDrawerData.A()) * this.mBaseDrawerData.d()));
       return;
    }
    public final DecorationContainerView getContainerView(){
       NewEditTextElement obj = PatchProxy.apply(null, this, NewEditTextElement.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.containerView;
       if (obj == null) {
          a.S("containerView");
       }
       return obj;
    }
    public Rect getContainerViewRect(){
       NewEditTextElement obj = PatchProxy.apply(null, this, NewEditTextElement.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.containerView;
       if (obj == null) {
          a.S("containerView");
       }
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2<com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData, com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement>");
       return new Rect(obj.getLeft(), obj.getTop(), obj.getRight(), obj.getBottom());
    }
    public Rect getContentRect(){
       Rect obj = PatchProxy.apply(null, this, NewEditTextElement.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getContentRect();
       return new Rect(obj.left, ((obj.top + this.getAdditionOffsetY()) - ((int)this.h().k() / 2)), obj.right, ((obj.bottom + this.getAdditionOffsetY()) + ((int)this.h().k() / 2)));
    }
    public final String getCurrentText(){
       Object obj = PatchProxy.apply(null, this, NewEditTextElement.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.currentTextElementData.F0();
    }
    public final NewTextElementData getCurrentTextElementData(){
       return this.currentTextElementData;
    }
    public List getIdentifyList(){
       List obj = PatchProxy.apply(null, this, NewEditTextElement.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.currentTextElementData.A0();
       if (obj == null) {
          ArrayList uArrayList = new ArrayList();
       }
       return obj;
    }
    public final f getKeyboardData(){
       TextStyleAttrs textStyleAtt1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       NewEditTextElement obj1 = PatchProxy.apply(objArray, obj, NewEditTextElement.class, "11");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = obj.currentTextElementData;
       f uof = PatchProxy.applyOneRefs(obj1, objArray, b.class, "1");
       if (uof != patchProxyRe) {
       }else {
          a.p(obj1, "$this$mapToKeyboardData");
          String str = obj1.G0().j();
          String str1 = obj1.G0().f();
          TextDrawConfigParam textDrawConf = obj1.V0();
          if (textDrawConf != null) {
             TextStyleAttrs textStyleAtt = textDrawConf.o();
             if (textStyleAtt != null) {
                textStyleAtt1 = textStyleAtt;
             label_0053 :
                uof = new f(str, str1, textStyleAtt1, TextStyleValue.a(obj1.G0().e(), 0, null, null, null, null, 0, null, false, 255, null), 1, TextStyleDataManager.b.c, "", "");
             }
          }
          textStyleAtt1 = new TextStyleAttrs(false, false, false, null, 15, null);
          goto label_0053 ;
       }
       return uof;
    }
    public Rect getOriginContentRect(){
       Rect obj = PatchProxy.apply(null, this, NewEditTextElement.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getOriginContentRect();
       return new Rect(obj.left, (obj.top - ((int)this.h().k() / 2)), obj.right, (obj.bottom + ((int)this.h().k() / 2)));
    }
    public Rect getOutBoxRect(){
       Rect obj = PatchProxy.apply(null, this, NewEditTextElement.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getOutBoxRect();
       return new Rect(obj.left, obj.top, obj.right, (obj.bottom - (int)this.h().k()));
    }
    public String getOutputFilePath(){
       Object obj = PatchProxy.apply(null, this, NewEditTextElement.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b(this.currentTextElementData);
    }
    public Rect getScaleContentRect(){
       Rect obj = PatchProxy.apply(null, this, NewEditTextElement.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getScaleContentRect();
       return new Rect(obj.left, ((obj.top + this.getAdditionOffsetY()) - ((int)this.h().k() / 2)), obj.right, ((obj.bottom + this.getAdditionOffsetY()) + ((int)this.h().k() / 2)));
    }
    public final TextDrawerLayout getTextDrawerLayout(){
       NewEditTextElement obj = PatchProxy.apply(null, this, NewEditTextElement.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.textDrawerLayout;
       if (obj == null) {
          a.S("textDrawerLayout");
       }
       return obj;
    }
    public Point getTipLocationBottomCenter(){
       Object[] objArray = null;
       BaseDrawer obj = PatchProxy.apply(objArray, this, NewEditTextElement.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mDecorationShowingView;
       if (obj == null) {
          return objArray;
       }
       int[] ointArray = new int[2];
       obj.getLocationOnScreen(ointArray);
       BaseDrawer tmDecoration = this.mDecorationShowingView;
       a.o(tmDecoration, "mDecorationShowingView");
       BaseDrawer tmDecoration1 = this.mDecorationShowingView;
       a.o(tmDecoration1, "mDecorationShowingView");
       float f = (float)2;
       tmDecoration = this.mDecorationShowingView;
       a.o(tmDecoration, "mDecorationShowingView");
       BaseDrawer tmDecoration2 = this.mDecorationShowingView;
       a.o(tmDecoration2, "mDecorationShowingView");
       return new Point((int)((float)ointArray[0] + (((float)tmDecoration.getWidth() * tmDecoration1.getScaleX()) / f)), (int)((((float)ointArray[1] + (((float)tmDecoration.getHeight() * tmDecoration2.getScaleY()) / f)) - (float)((this.getOutBoxRect().bottom - this.getOutBoxRect().top) / 2)) - (float)a.b));
    }
    public View getView(){
       return this.mDecorationShowingView;
    }
    public final c h(){
       Object obj = PatchProxy.apply(null, this, NewEditTextElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.editTextContainer$delegate.getValue();
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, NewEditTextElement.class, "27")) {
          return;
       }
       float f = (this.mBaseDrawerData.A() * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d();
       if (f - (float)0 > 0) {
          this.h().A(f);
       }
       return;
    }
    public View initView(DecorationContainerView p0){
       int i1;
       int b;
       NewEditTextElement ttextDrawerL1;
       String first;
       NewEditTextElement obj = PatchProxy.applyOneRefs(p0, this, NewEditTextElement.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "decorationContainerView");
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, NewEditTextElement.class, "23")) {
          float f1 = (float)p0.getWidth() - (((this.mBaseDrawerData.n().left + this.mBaseDrawerData.n().right) + (float)BaseDrawer.DECORATION_REMOVE_ICON_WIDTH) / p0.getScaleX());
          float f2 = ((float)p0.getHeight() - (this.mBaseDrawerData.n().top + this.mBaseDrawerData.n().bottom)) / p0.getScaleX();
          int i2 = (this.h().r().g0() > 0)? q.u((int)f1, this.h().r().g0()): (int)f1;
          i1 = (int)f2;
          int i3 = q.u(i1, this.h().r().v());
          if (!i2 || !i3) {
             first = "initPainterMaxDimension, width = "+i2+", height = "+i3+", containerViewWidth = "+p0.getWidth()+", containerViewHeight = "+p0.getHeight();
             ExceptionHandler.handleCaughtException(new TextPainterContentDimensionException(first));
             Object[] objArray = new Object[i];
             a.D().t("TextPainterContentDimensionException", first, objArray);
          }
          c uoc1 = this.h();
          b = (this.h().r().g0() > 0)? q.u((int)f1, this.h().r().g0()): (int)f1;
          uoc1.e(b, q.u(i1, this.h().r().v()));
       }
       this.h().q().j(p0.getWidth());
       this.h().q().i(p0.getHeight());
       this.containerView = p0;
       Context context = p0.getContext();
       a.o(context, "decorationContainerView.getContext\(\)");
       this.textDrawerLayout = this.h().b(context);
       i1 = 1;
       b = (this.initTextElementData.F0().length() > 0)? true: false;
       NewEditTextElement ttextDrawerL = this.textDrawerLayout;
       String str = "textDrawerLayout";
       if (ttextDrawerL == null) {
          a.S(str);
       }
       ttextDrawerL.a(new NewEditTextElement$a(this, p0, b));
       this.h().C(this.initTextElementData.G0().f());
       this.h().f(this.initTextElementData.G0().e());
       this.i();
       c uoc = this.h();
       float f = this.mBaseDrawerData.d();
       Objects.requireNonNull(uoc);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), uoc, uob, "3")) {
          uoc.a.l(f);
       }
       if (b) {
          ttextDrawerL1 = this.textDrawerLayout;
          if (ttextDrawerL1 == null) {
             a.S(str);
          }
          ttextDrawerL1.setText(this.initTextElementData.F0());
       }
       ttextDrawerL1 = this.textDrawerLayout;
       if (ttextDrawerL1 == null) {
          a.S(str);
       }
       this.mDecorationShowingView = ttextDrawerL1;
       Pair pair = this.h().c();
       a.o(pair, "editTextContainer.getContentDimension\(\)");
       first = pair.getFirst();
       a.o(first, "contentDimension.first");
       this.mBaseDrawerData.P(first.floatValue());
       first = pair.getSecond();
       a.o(first, "contentDimension.second");
       this.mBaseDrawerData.M(first.floatValue());
       BaseDrawer tmDecoration = this.mDecorationShowingView;
       a.o(tmDecoration, "mDecorationShowingView");
       tmDecoration.setLayoutParams(new AbsoluteLayout$LayoutParams((int)pair.getFirst().floatValue(), (int)(pair.getSecond().floatValue() + this.h().k()), i, i));
       this.setNeedReGenerateFile((this.mBaseDrawerData.k0() ^ i1));
       tmDecoration = this.mBaseDrawerData;
       obj = this.containerView;
       if (obj == null) {
          a.S("containerView");
       }
       tmDecoration.Q(obj.P());
       tmDecoration = this.mDecorationShowingView;
       a.o(tmDecoration, "mDecorationShowingView");
       return tmDecoration;
    }
    public boolean interceptTouchEvent(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, NewEditTextElement.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.h();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, a.class, "5");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b e = obj.e;
          b = (e != null)? e.d(): false;
       }
       return b;
    }
    public boolean isEnableSelectBox(){
       return true;
    }
    public boolean isInWholeDecoration(float p0,float p1){
       if (PatchProxy.isSupport(NewEditTextElement.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, NewEditTextElement.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (!this.isPointInTheRect(p0, p1, this.getOutBoxRect()) && (!this.isPointInTheRect(p0, p1, this.getRemoveButtonRect()) && (this.isPointInTheRect(p0, p1, this.getScaleOrRotateButtonRect()) || this.isPointInTheRect(p0, p1, this.getCustomButtonRect()))))? true: false;
       return b;
    }
    public final boolean isNeedGenerateBitmap(){
       return this.isNeedGenerateBitmap;
    }
    public boolean isNewText(){
       return true;
    }
    public boolean isSubtitle(){
       Object obj = PatchProxy.apply(null, this, NewEditTextElement.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.currentTextElementData.J0();
    }
    public boolean limitDrawerAreaLeftRight(float p0){
       if (PatchProxy.isSupport(NewEditTextElement.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, NewEditTextElement.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.mBaseDrawerData.R0() != null)? super.limitDrawerAreaLeftRight(p0): true;
       return b;
    }
    public boolean limitDrawerAreaTopBottom(float p0){
       if (PatchProxy.isSupport(NewEditTextElement.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, NewEditTextElement.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.mBaseDrawerData.R0() != null)? super.limitDrawerAreaTopBottom(p0): true;
       return b;
    }
    public final boolean reCalculateAndUpdateDimen(boolean p0){
       if (PatchProxy.isSupport(NewEditTextElement.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, NewEditTextElement.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       float f = this.h().q().c() * (((((this.h().p() + (float)this.h().r().w().left) + (float)this.h().r().w().right) + (float)BaseDrawer.DECORATION_REMOVE_ICON_WIDTH) + this.mBaseDrawerData.n().left) + this.mBaseDrawerData.n().right);
       int i = this.h().q().a();
       float f1 = (float)i;
       int i1 = 1;
       a uoa = ((float)this.getWholeRect().width() - (this.mBaseDrawerData.m() * f1) > 0 || (this.mBaseDrawerData.A() * f) - (this.mBaseDrawerData.m() * f1) > 0)? 1: null;
       if (p0 && uoa) {
          Object[] objArray = new Object[0];
          a.D().w("NewEditTextElement", "mBaseDrawerData.editorScale = "+this.mBaseDrawerData.m()+' '+"editPainter.textChangeParam.containerViewWidth = "+i+' '+"wholeRect.width\(\) = "+this.getWholeRect().width()+" mBaseDrawerData.contentWidth = "+this.mBaseDrawerData.i()+' '+"editPainter.textAreaWidth = "+this.h().p()+' '+"editPainter.textDrawConfigParam.textPadding  = "+this.h().r().w()+' '+"mBaseDrawerData.elementDrawLimit = "+this.mBaseDrawerData.n()+' '+"before mBaseDrawerData.scale = "+this.mBaseDrawerData.A()+' ', objArray);
          BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
          BaseDrawer uBaseDrawer = tmBaseDrawer;
          uBaseDrawer.b0((((f1 * tmBaseDrawer.m()) * 0x3f800000) / f));
          Object[] objArray1 = new Object[0];
          a.D().w("NewEditTextElement", "after mBaseDrawerData.scale = "+this.mBaseDrawerData.A(), objArray1);
       }else {
          i1 = 0;
       }
       this.mBaseDrawerData.K(this.h().q().c());
       f = (this.mBaseDrawerData.A() * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d();
       if (f - (float)0 > 0) {
          Object[] objArray2 = new Object[0];
          a.D().w("NewEditTextElement", "mBaseDrawerData.scale = "+this.mBaseDrawerData.A()+' '+"mBaseDrawerData.editorScale = "+this.mBaseDrawerData.m()+' '+"mBaseDrawerData.additionalScale = "+this.mBaseDrawerData.d()+' '+"scale = "+f, objArray2);
          this.h().q().w(f);
       }
       if (i1) {
          this.h().d(this.h().q().e());
       }
       return this.g(p0);
    }
    public final void setContainerView(DecorationContainerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditTextElement.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.containerView = p0;
       return;
    }
    public final void setCurrentTextElementData(NewTextElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditTextElement.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.currentTextElementData = p0;
       return;
    }
    public final void setNeedGenerateBitmap(boolean p0){
       this.isNeedGenerateBitmap = p0;
    }
    public final void setTextDrawerLayout(TextDrawerLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditTextElement.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.textDrawerLayout = p0;
       return;
    }
    public void update(){
       if (PatchProxy.applyVoid(null, this, NewEditTextElement.class, "16")) {
          return;
       }
       super.update();
       BaseDrawer tmDecoration = this.mDecorationShowingView;
       if (tmDecoration != null) {
          tmDecoration.setTranslationY((tmDecoration.getTranslationY() + (float)this.getAdditionOffsetY()));
       }
       return;
    }
    public void updateElement(NewTextBaseElementData p0){
       c uoc1;
       String str3;
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditTextElement.class, "9")) {
          return;
       }
       a.p(p0, "newElementData");
       NewTextElementData newTextEleme = p0;
       if (newTextEleme.V0() != null && newTextEleme.T0() != null) {
          if (a.g(p0.G0().j(), this.currentTextElementData.G0().j()) ^ 1) {
             c uoc = this.h();
             NewTextElementData newTextEleme1 = p0;
             TextDrawConfigParam textDrawConf = newTextEleme1.V0();
             DynamicTextParams uDynamicText = newTextEleme1.T0();
             String str = newTextEleme1.U0();
             Objects.requireNonNull(uoc);
             if (!PatchProxy.applyVoidThreeRefs(textDrawConf, uDynamicText, str, uoc, c.class, "17")) {
                uoc.b = textDrawConf;
                uoc.j = uDynamicText;
                uoc.p = str;
                uoc1 = uoc.m;
                if (uoc1 != null) {
                   uoc1.j(uDynamicText);
                   uoc.g = new a(uoc.b, uoc.a);
                   uoc.m.invalidate();
                }
             }
             this.isNeedGenerateBitmap = true;
          }
          if (a.g(p0.G0().e(), this.currentTextElementData.G0().e()) ^ 1) {
             this.h().f(p0.G0().e());
             this.isNeedGenerateBitmap = true;
          }
          if (a.g(p0.G0().f(), this.currentTextElementData.G0().f()) ^ 1) {
             this.h().C(p0.G0().f());
             this.isNeedGenerateBitmap = true;
          }
          this.mBaseDrawerData.P0(p0);
          BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
          NewEditTextElement tcontainerVi = this.containerView;
          if (tcontainerVi == null) {
             a.S("containerView");
          }
          tmBaseDrawer.Q(tcontainerVi.P());
          this.i();
          String str1 = p0.F0();
          uoc1 = this.h();
          Objects.requireNonNull(uoc1);
          String str2 = PatchProxy.apply(null, uoc1, c.class, "16");
          if (str2 != PatchProxyResult.class) {
          }else {
             uoc1 = uoc1.m;
             str3 = (uoc1 != null)? uoc1.getText().toString(): "";
             str2 = str3;
          }
          if (a.g(str1, str2) ^ 1) {
             this.updateText(p0.F0());
             this.isNeedGenerateBitmap = true;
          }else {
             this.g(1);
             NewEditTextElement tcontainerVi1 = this.containerView;
             if (tcontainerVi1 == null) {
                a.S("containerView");
             }
             tcontainerVi1.U(this);
             tcontainerVi1 = this.textDrawerLayout;
             str3 = "textDrawerLayout";
             if (tcontainerVi1 == null) {
                a.S(str3);
             }
             tcontainerVi1.invalidate();
             tcontainerVi1 = this.textDrawerLayout;
             if (tcontainerVi1 == null) {
                a.S(str3);
             }
             tcontainerVi1.c();
          }
          if (!p0.G0().i() - this.currentTextElementData.G0().i() && (p0.G0().b() - this.currentTextElementData.G0().b() || (a.g(p0.F0(), this.currentTextElementData.F0()) ^ 1))) {
             this.isNeedGenerateBitmap = true;
          }
          this.currentTextElementData = p0;
          this.checkNeedGenerateFile();
       }
       return;
    }
    public final void updateText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditTextElement.class, "10")) {
          return;
       }
       a.p(p0, "text");
       BaseDrawer tmDecoration = this.mDecorationShowingView;
       if (!tmDecoration instanceof TextDrawerLayout) {
          tmDecoration = null;
       }
       if (tmDecoration != null) {
          tmDecoration.setText(p0);
          tmDecoration.h();
       }
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
    }
}
