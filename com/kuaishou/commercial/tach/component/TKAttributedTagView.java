package com.kuaishou.commercial.tach.component.TKAttributedTagView;
import com.tachikoma.core.component.e;
import gx4.f;
import android.content.Context;
import android.view.View;
import com.yxcorp.gifshow.widget.TextWithEndTagView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8Value;
import java.util.Map;
import com.tkruntime.v8.V8;
import java.lang.Number;
import iq8.n;
import iq8.p;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.TextWithEndTagView$d;
import com.tachikoma.core.component.TKBaseNativeModule;
import android.content.res.Resources;
import tkd.b;
import tkd.d;
import nl9.u;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.yxcorp.gifshow.widget.TextWithEndTagView$c;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Typeface;
import yp8.a;
import jq8.a;

public class TKAttributedTagView extends e	// class@001659
{

    public void TKAttributedTagView(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public TextWithEndTagView createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKAttributedTagView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TextWithEndTagView(p0);
    }
    public void setAttributedText(V8Object p0){
       int i4;
       TextWithEndTagView e;
       TextWithEndTagView d;
       Map obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, TKAttributedTagView.class, "2")) {
          return;
       }
       if (obj == null) {
          return;
       }
       obj = obj.v8.getAll(p0.getHandle());
       TextWithEndTagView obj1 = obj.get("fontSize");
       if (obj1 instanceof Number) {
          this.getView().setTextSize(n.a(obj1.floatValue()));
       }
       obj1 = obj.get("color");
       if (obj1 instanceof String) {
          this.getView().setTextColor(p.b(obj1));
       }
       obj1 = obj.get("enableShowTag");
       if (obj1 instanceof Boolean && obj1.booleanValue()) {
          obj1 = obj.get("tagIconTintColor");
          if (obj1 instanceof String) {
             this.getView().setTagIconColor(p.b(obj1));
          }
          obj1 = obj.get("tagTextColor");
          if (obj1 instanceof String) {
             this.getView().setTagTextColor(p.b(obj1));
          }
          obj1 = obj.get("tagBackgroundColor");
          if (obj1 instanceof String) {
             this.getView().setTagBackground(p.b(obj1));
          }
          obj1 = obj.get("tagTextSize");
          if (obj1 instanceof Number) {
             this.getView().setTagTextSize((float)n.a(obj1.floatValue()));
          }else {
             this.getView().setTagTextSize((float)n.b(10));
          }
          obj1 = obj.get("tagBorderRadius");
          if (obj1 instanceof Number) {
             this.getView().setTagBorderRadius((float)n.a(obj1.floatValue()));
          }
          this.getView().setAlignCenter(true);
          obj1 = this.getView();
          int i = n.b(2);
          int i1 = n.b(3);
          int i2 = n.b(4);
          int i3 = n.b(3);
          Objects.requireNonNull(obj1);
          if (PatchProxy.isSupport(TextWithEndTagView.class)) {
             i4 = i3;
             if (!PatchProxy.applyVoidFourRefs(Integer.valueOf(i), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), obj1, TextWithEndTagView.class, "18")) {
             label_014c :
                if (!obj1.a()) {
                   d = obj1.d;
                   d.a = i;
                   d.b = i1;
                   d.c = i2;
                   d.d = i4;
                   obj1.requestLayout();
                   obj1.invalidate();
                }
             }
          }else {
             i4 = i3;
             goto label_014c ;
          }
          obj1 = this.getView();
          i4 = n.b(4);
          int i5 = 0;
          Objects.requireNonNull(obj1);
          if (!PatchProxy.isSupport(TextWithEndTagView.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i4), Integer.valueOf(i5), obj1, TextWithEndTagView.class, "19") && !obj1.a())) {
             e = obj1.d;
             e.f = i4;
             e.g = i5;
             obj1.requestLayout();
             obj1.invalidate();
          }
          this.getView().setTagText(this.getContext().getResources().getString(R.string.arg_RES_7f103ca0));
          this.getView().setTagIcon(BitmapFactory.decodeResource(this.getContext().getResources(), d.a(-1694791652).Zx()));
          this.getView().setTagIconPadding(n.b(2));
          obj1 = this.getView();
          i5 = n.b(12);
          i4 = n.b(12);
          Objects.requireNonNull(obj1);
          if (!PatchProxy.isSupport(TextWithEndTagView.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i5), Integer.valueOf(i4), obj1, TextWithEndTagView.class, "23") && !obj1.a())) {
             e = obj1.e;
             e.e = i5;
             e.f = i4;
             obj1.requestLayout();
             obj1.invalidate();
          }
       }else {
          this.getView().setTagText("");
          this.getView().setTagIcon(null);
       }
       this.getView().setLineSpace(n.b(5));
       Object obj2 = obj.get("textLineClamp");
       if (obj2 instanceof Integer) {
          this.getView().setMaxLine(obj2.intValue());
       }
       obj2 = obj.get("textAlign");
       if (obj2 instanceof String) {
          this.getView().setAlignCenter(TextUtils.equals(obj2, "center"));
       }
       obj2 = obj.get("fontWeight");
       if (obj2 instanceof String) {
          if (("bold").equals(obj2)) {
             this.getView().setTextStyle(Typeface.DEFAULT_BOLD);
          }else {
             this.getView().setTextStyle(Typeface.DEFAULT);
          }
       }
       Object obj3 = obj.get("text");
       if (obj3 instanceof String) {
          this.getView().setText(obj3);
       }else {
          this.getView().setText("");
       }
       this.getDomNode().c().b();
       return;
    }
}
