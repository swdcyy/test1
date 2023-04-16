package com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.LayoutShadowNode$b;
import com.facebook.react.uimanager.LayoutShadowNode$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import pe.a;
import ze.n0;
import android.content.Context;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.f;
import ef.a;
import ze.x;
import ze.j0;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReadableArray;
import java.util.Objects;
import com.facebook.yoga.YogaAlign;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Float;
import ze.d1;
import ze.p;
import com.facebook.yoga.YogaDisplay;
import com.facebook.react.bridge.Dynamic;
import java.lang.Enum;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaWrap;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import java.lang.Boolean;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;

public class LayoutShadowNode extends ReactShadowNodeImpl	// class@001319
{
    public boolean mCollapsable;
    public boolean mIsFixedNode;
    public final LayoutShadowNode$b mTempYogaValue;

    public void LayoutShadowNode(){
       super();
       this.mIsFixedNode = false;
       this.mTempYogaValue = new LayoutShadowNode$b(null);
    }
    public boolean getSelfLayoutFlag(){
       return false;
    }
    public boolean isFixedNode(){
       return this.mIsFixedNode;
    }
    public final int maybeTransformLeftRightToStartEnd(int p0){
       LayoutShadowNode layoutShadow = LayoutShadowNode.class;
       if (PatchProxy.isSupport(layoutShadow)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, layoutShadow, "24");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!a.b().a(this.getThemedContext())) {
          return p0;
       }else if(p0){
          if (p0 != 2) {
             return p0;
          }else {
             return 5;
          }
       }else {
          return 4;
       }
    }
    public void moveToOriginalParent(){
       if (PatchProxy.applyVoid(null, this, LayoutShadowNode.class, "26")) {
          return;
       }
       if (this.getThemedContext() != null) {
          f uIImplementa = this.getThemedContext().getNativeModule(UIManagerModule.class).getUIImplementation();
          if (!uIImplementa instanceof a || (this.mIsFixedNode == null || (this.getParent() == null || (uIImplementa.G(this.getParent().getReactTag()) && (PatchProxy.applyVoidOneRefs(this, uIImplementa, a.class, "8") || (uIImplementa.G(this.getReactTag()) || (this.getParent() != null && uIImplementa.G(this.getParent().getReactTag())))))))) {
             int reactTag = this.getReactTag();
             x ox = uIImplementa.d.a((- reactTag));
             x ox1 = uIImplementa.d.a(this.getOriginalParentTag());
             uIImplementa.E(this, ox1, ox1.indexOf(ox));
             uIImplementa.H(ox1, reactTag);
             JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
             javaOnlyArra.pushInt(ox1.indexOf(ox));
             ox.setBindingVirtualNode(false);
             uIImplementa.n(ox1.getReactTag(), null, null, null, null, javaOnlyArra);
             uIImplementa.g(-1);
             ox1.indexOf(this);
             ox1.getReactTag();
             Objects.toString(ox1.getMovedOutFixedChildTags());
          }
       }
    label_00b6 :
       return;
    }
    public void moveToRootView(){
       if (PatchProxy.applyVoid(null, this, LayoutShadowNode.class, "27")) {
          return;
       }
       if (this.getThemedContext() != null) {
          f uIImplementa = this.getThemedContext().getNativeModule(UIManagerModule.class).getUIImplementation();
          if (uIImplementa instanceof a && (this.getParent() != null && !uIImplementa.G(this.getParent().getReactTag()))) {
             ReactShadowNodeImpl parent = this.getParent();
             if (PatchProxy.applyVoidTwoRefs(this, parent, uIImplementa, a.class, "7") || (!uIImplementa.G(this.getReactTag()) && parent != null)) {
                x ox = uIImplementa.d.a(this.getRootTag());
                if (ox != null) {
                   int i = - this.getReactTag();
                   uIImplementa.D(this.getViewClass(), i, this.getRootTag());
                   parent.setMovedOutFixedChildTag(this.getReactTag());
                   this.setOriginalParentTag(parent.getReactTag());
                   uIImplementa.E(this, ox, ox.getChildCount());
                   JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
                   javaOnlyArra.pushInt(i);
                   JavaOnlyArray javaOnlyArra1 = new JavaOnlyArray();
                   javaOnlyArra1.pushInt(parent.indexOf(this));
                   uIImplementa.n(parent.getReactTag(), null, null, javaOnlyArra, javaOnlyArra1, null);
                   uIImplementa.g(-1);
                   this.getReactTag();
                   parent.getReactTag();
                   Objects.toString(parent.getMovedOutFixedChildTags());
                   parent.indexOf(uIImplementa.d.a(i));
                }
             }
          }
       }
       return;
    }
    public void setAlignContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "16")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       if (p0 == null) {
          this.setAlignContent(YogaAlign.FLEX_START);
          return;
       }else {
          int i = -1;
          switch (p0.hashCode()){
              case 0x8fd4e705:
                if (p0.equals("stretch")) {
                   i = 0;
                }
                break;
              case 0x996ee645:
                if (p0.equals("baseline")) {
                   i = 1;
                }
                break;
              case 0xaeb2cc55:
                if (p0.equals("center")) {
                   i = 2;
                }
                break;
              case 0xfd39398e:
                if (p0.equals("flex-start")) {
                   i = 3;
                }
                break;
              case 0x2dddaf:
                if (p0.equals("auto")) {
                   i = 4;
                }
                break;
              case 0x1a4dda41:
                if (p0.equals("space-between")) {
                   i = 5;
                }
                break;
              case 0x67e35907:
                if (p0.equals("flex-end")) {
                   i = 6;
                }
                break;
              case 0x73762c74:
                if (p0.equals("space-around")) {
                   i = 7;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                this.setAlignContent(YogaAlign.STRETCH);
                return;
              case 1:
                this.setAlignContent(YogaAlign.BASELINE);
                return;
              case 2:
                this.setAlignContent(YogaAlign.CENTER);
                return;
              case 3:
                this.setAlignContent(YogaAlign.FLEX_START);
                return;
              case 4:
                this.setAlignContent(YogaAlign.AUTO);
                return;
              case 5:
                this.setAlignContent(YogaAlign.SPACE_BETWEEN);
                return;
              case 6:
                this.setAlignContent(YogaAlign.FLEX_END);
                return;
              case 7:
                this.setAlignContent(YogaAlign.SPACE_AROUND);
                return;
              default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignContent: "+p0);
          }
       }
    }
    public void setAlignItems(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "15")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       if (p0 == null) {
          this.setAlignItems(YogaAlign.STRETCH);
          return;
       }else {
          int i = -1;
          switch (p0.hashCode()){
              case 0x8fd4e705:
                if (p0.equals("stretch")) {
                   i = 0;
                }
                break;
              case 0x996ee645:
                if (p0.equals("baseline")) {
                   i = 1;
                }
                break;
              case 0xaeb2cc55:
                if (p0.equals("center")) {
                   i = 2;
                }
                break;
              case 0xfd39398e:
                if (p0.equals("flex-start")) {
                   i = 3;
                }
                break;
              case 0x2dddaf:
                if (p0.equals("auto")) {
                   i = 4;
                }
                break;
              case 0x1a4dda41:
                if (p0.equals("space-between")) {
                   i = 5;
                }
                break;
              case 0x67e35907:
                if (p0.equals("flex-end")) {
                   i = 6;
                }
                break;
              case 0x73762c74:
                if (p0.equals("space-around")) {
                   i = 7;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                this.setAlignItems(YogaAlign.STRETCH);
                return;
              case 1:
                this.setAlignItems(YogaAlign.BASELINE);
                return;
              case 2:
                this.setAlignItems(YogaAlign.CENTER);
                return;
              case 3:
                this.setAlignItems(YogaAlign.FLEX_START);
                return;
              case 4:
                this.setAlignItems(YogaAlign.AUTO);
                return;
              case 5:
                this.setAlignItems(YogaAlign.SPACE_BETWEEN);
                return;
              case 6:
                this.setAlignItems(YogaAlign.FLEX_END);
                return;
              case 7:
                this.setAlignItems(YogaAlign.SPACE_AROUND);
                return;
              default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignItems: "+p0);
          }
       }
    }
    public void setAlignSelf(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "14")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       if (p0 == null) {
          this.setAlignSelf(YogaAlign.AUTO);
          return;
       }else {
          int i = -1;
          switch (p0.hashCode()){
              case 0x8fd4e705:
                if (p0.equals("stretch")) {
                   i = 0;
                }
                break;
              case 0x996ee645:
                if (p0.equals("baseline")) {
                   i = 1;
                }
                break;
              case 0xaeb2cc55:
                if (p0.equals("center")) {
                   i = 2;
                }
                break;
              case 0xfd39398e:
                if (p0.equals("flex-start")) {
                   i = 3;
                }
                break;
              case 0x2dddaf:
                if (p0.equals("auto")) {
                   i = 4;
                }
                break;
              case 0x1a4dda41:
                if (p0.equals("space-between")) {
                   i = 5;
                }
                break;
              case 0x67e35907:
                if (p0.equals("flex-end")) {
                   i = 6;
                }
                break;
              case 0x73762c74:
                if (p0.equals("space-around")) {
                   i = 7;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                this.setAlignSelf(YogaAlign.STRETCH);
                return;
              case 1:
                this.setAlignSelf(YogaAlign.BASELINE);
                return;
              case 2:
                this.setAlignSelf(YogaAlign.CENTER);
                return;
              case 3:
                this.setAlignSelf(YogaAlign.FLEX_START);
                return;
              case 4:
                this.setAlignSelf(YogaAlign.AUTO);
                return;
              case 5:
                this.setAlignSelf(YogaAlign.SPACE_BETWEEN);
                return;
              case 6:
                this.setAlignSelf(YogaAlign.FLEX_END);
                return;
              case 7:
                this.setAlignSelf(YogaAlign.SPACE_AROUND);
                return;
              default:
                throw new JSApplicationIllegalArgumentException("invalid value for alignSelf: "+p0);
          }
       }
    }
    public void setAspectRatio(float p0){
       LayoutShadowNode layoutShadow = LayoutShadowNode.class;
       if (PatchProxy.isSupport(layoutShadow) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, layoutShadow, "11")) {
          return;
       }
       this.setStyleAspectRatio(p0);
       return;
    }
    public void setBorderWidths(int p0,float p1){
       LayoutShadowNode layoutShadow = LayoutShadowNode.class;
       if (PatchProxy.isSupport(layoutShadow) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, layoutShadow, "22")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       this.setBorder(this.maybeTransformLeftRightToStartEnd(d1.a[p0]), p.c(p1));
       return;
    }
    public void setCollapsable(boolean p0){
       this.mCollapsable = p0;
    }
    public void setDisplay(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "19")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       if (p0 == null) {
          this.setDisplay(YogaDisplay.FLEX);
          return;
       }else if(!p0.equals("flex")){
          if (p0.equals("none")) {
             this.setDisplay(YogaDisplay.NONE);
          }else {
             throw new JSApplicationIllegalArgumentException("invalid value for display: "+p0);
          }
       }else {
          this.setDisplay(YogaDisplay.FLEX);
       }
       return;
    }
    public void setFlex(float p0){
       LayoutShadowNode layoutShadow = LayoutShadowNode.class;
       if (PatchProxy.isSupport(layoutShadow) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, layoutShadow, "7")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       super.setFlex(p0);
       return;
    }
    public void setFlexBasis(Dynamic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "10")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       this.mTempYogaValue.a(p0);
       int i = LayoutShadowNode$a.a[this.mTempYogaValue.b.ordinal()];
       if (i != 1 && i != 2) {
          if (i != 3) {
             if (i == 4) {
                this.setFlexBasisPercent(this.mTempYogaValue.a);
             }
          }else {
             this.setFlexBasisAuto();
          }
       }else {
          this.setFlexBasis(this.mTempYogaValue.a);
       }
       p0.recycle();
       return;
    }
    public void setFlexDirection(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "12")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       if (p0 == null) {
          this.setFlexDirection(YogaFlexDirection.COLUMN);
          return;
       }else {
          int i = -1;
          switch (p0.hashCode()){
              case 0xa9a275ef:
                if (p0.equals("row-reverse")) {
                   i = 0;
                }
                break;
              case 0xaf3ed356:
                if (p0.equals("column")) {
                   i = 1;
                }
                break;
              case 0x1b9da:
                if (p0.equals("row")) {
                   i = 2;
                }
                break;
              case 0x4bdc536b:
                if (p0.equals("column-reverse")) {
                   i = 3;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                this.setFlexDirection(YogaFlexDirection.ROW_REVERSE);
                break;
              case 1:
                this.setFlexDirection(YogaFlexDirection.COLUMN);
                break;
              case 2:
                this.setFlexDirection(YogaFlexDirection.ROW);
                break;
              case 3:
                this.setFlexDirection(YogaFlexDirection.COLUMN_REVERSE);
                break;
              default:
                throw new JSApplicationIllegalArgumentException("invalid value for flexDirection: "+p0);
          }
          return;
       }
    }
    public void setFlexGrow(float p0){
       LayoutShadowNode layoutShadow = LayoutShadowNode.class;
       if (PatchProxy.isSupport(layoutShadow) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, layoutShadow, "8")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       super.setFlexGrow(p0);
       return;
    }
    public void setFlexShrink(float p0){
       LayoutShadowNode layoutShadow = LayoutShadowNode.class;
       if (PatchProxy.isSupport(layoutShadow) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, layoutShadow, "9")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       super.setFlexShrink(p0);
       return;
    }
    public void setFlexWrap(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "13")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       if (p0 == null) {
          this.setFlexWrap(YogaWrap.NO_WRAP);
          return;
       }else {
          int i = -1;
          switch (p0.hashCode()){
              case 0xc209158b:
                if (p0.equals("nowrap")) {
                   i = 0;
                }
                break;
              case 0xd3531c5f:
                if (p0.equals("wrap-reverse")) {
                   i = 1;
                }
                break;
              case 0x37d04a:
                if (p0.equals("wrap")) {
                   i = 2;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                this.setFlexWrap(YogaWrap.NO_WRAP);
                break;
              case 1:
                this.setFlexWrap(YogaWrap.WRAP_REVERSE);
                break;
              case 2:
                this.setFlexWrap(YogaWrap.WRAP);
                break;
              default:
                throw new JSApplicationIllegalArgumentException("invalid value for flexWrap: "+p0);
          }
          return;
       }
    }
    public void setHeight(Dynamic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "4")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       this.mTempYogaValue.a(p0);
       int i = LayoutShadowNode$a.a[this.mTempYogaValue.b.ordinal()];
       if (i != 1 && i != 2) {
          if (i != 3) {
             if (i == 4) {
                this.setStyleHeightPercent(this.mTempYogaValue.a);
             }
          }else {
             this.setStyleHeightAuto();
          }
       }else {
          this.setStyleHeight(this.mTempYogaValue.a);
       }
       p0.recycle();
       return;
    }
    public void setJustifyContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "17")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       if (p0 == null) {
          this.setJustifyContent(YogaJustify.FLEX_START);
          return;
       }else {
          int i = -1;
          switch (p0.hashCode()){
              case 0xaeb2cc55:
                if (p0.equals("center")) {
                   i = 0;
                }
                break;
              case 0xfd39398e:
                if (p0.equals("flex-start")) {
                   i = 1;
                }
                break;
              case 0x1a4dda41:
                if (p0.equals("space-between")) {
                   i = 2;
                }
                break;
              case 0x67e35907:
                if (p0.equals("flex-end")) {
                   i = 3;
                }
                break;
              case 0x73762c74:
                if (p0.equals("space-around")) {
                   i = 4;
                }
                break;
              case 0x7a7d46ce:
                if (p0.equals("space-evenly")) {
                   i = 5;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                this.setJustifyContent(YogaJustify.CENTER);
                break;
              case 1:
                this.setJustifyContent(YogaJustify.FLEX_START);
                break;
              case 2:
                this.setJustifyContent(YogaJustify.SPACE_BETWEEN);
                break;
              case 3:
                this.setJustifyContent(YogaJustify.FLEX_END);
                break;
              case 4:
                this.setJustifyContent(YogaJustify.SPACE_AROUND);
                break;
              case 5:
                this.setJustifyContent(YogaJustify.SPACE_EVENLY);
                break;
              default:
                throw new JSApplicationIllegalArgumentException("invalid value for justifyContent: "+p0);
          }
          return;
       }
    }
    public void setMargins(int p0,Dynamic p1){
       LayoutShadowNode layoutShadow = LayoutShadowNode.class;
       if (PatchProxy.isSupport(layoutShadow) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, layoutShadow, "20")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       p0 = this.maybeTransformLeftRightToStartEnd(d1.b[p0]);
       this.mTempYogaValue.a(p1);
       int i = LayoutShadowNode$a.a[this.mTempYogaValue.b.ordinal()];
       if (i != 1 && i != 2) {
          if (i != 3) {
             if (i == 4) {
                this.setMarginPercent(p0, this.mTempYogaValue.a);
             }
          }else {
             this.setMarginAuto(p0);
          }
       }else {
          this.setMargin(p0, this.mTempYogaValue.a);
       }
       p1.recycle();
       return;
    }
    public void setMaxHeight(Dynamic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "6")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       this.mTempYogaValue.a(p0);
       int i = LayoutShadowNode$a.a[this.mTempYogaValue.b.ordinal()];
       if (i != 1 && i != 2) {
          if (i == 4) {
             this.setStyleMaxHeightPercent(this.mTempYogaValue.a);
          }
       }else {
          this.setStyleMaxHeight(this.mTempYogaValue.a);
       }
       p0.recycle();
       return;
    }
    public void setMaxWidth(Dynamic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "3")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       this.mTempYogaValue.a(p0);
       int i = LayoutShadowNode$a.a[this.mTempYogaValue.b.ordinal()];
       if (i != 1 && i != 2) {
          if (i == 4) {
             this.setStyleMaxWidthPercent(this.mTempYogaValue.a);
          }
       }else {
          this.setStyleMaxWidth(this.mTempYogaValue.a);
       }
       p0.recycle();
       return;
    }
    public void setMinHeight(Dynamic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "5")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       this.mTempYogaValue.a(p0);
       int i = LayoutShadowNode$a.a[this.mTempYogaValue.b.ordinal()];
       if (i != 1 && i != 2) {
          if (i == 4) {
             this.setStyleMinHeightPercent(this.mTempYogaValue.a);
          }
       }else {
          this.setStyleMinHeight(this.mTempYogaValue.a);
       }
       p0.recycle();
       return;
    }
    public void setMinWidth(Dynamic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "2")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       this.mTempYogaValue.a(p0);
       int i = LayoutShadowNode$a.a[this.mTempYogaValue.b.ordinal()];
       if (i != 1 && i != 2) {
          if (i == 4) {
             this.setStyleMinWidthPercent(this.mTempYogaValue.a);
          }
       }else {
          this.setStyleMinWidth(this.mTempYogaValue.a);
       }
       p0.recycle();
       return;
    }
    public void setOverflow(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "18")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       if (p0 == null) {
          this.setOverflow(YogaOverflow.VISIBLE);
          return;
       }else {
          int i = -1;
          switch (p0.hashCode()){
              case 0xb76e9daa:
                if (p0.equals("hidden")) {
                   i = 0;
                }
                break;
              case 0xc9e5e6cd:
                if (p0.equals("scroll")) {
                   i = 1;
                }
                break;
              case 0x1bd1f072:
                if (p0.equals("visible")) {
                   i = 2;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                this.setOverflow(YogaOverflow.HIDDEN);
                break;
              case 1:
                this.setOverflow(YogaOverflow.SCROLL);
                break;
              case 2:
                this.setOverflow(YogaOverflow.VISIBLE);
                break;
              default:
                throw new JSApplicationIllegalArgumentException("invalid value for overflow: "+p0);
          }
          return;
       }
    }
    public void setPaddings(int p0,Dynamic p1){
       LayoutShadowNode layoutShadow = LayoutShadowNode.class;
       if (PatchProxy.isSupport(layoutShadow) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, layoutShadow, "21")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       p0 = this.maybeTransformLeftRightToStartEnd(d1.b[p0]);
       this.mTempYogaValue.a(p1);
       int i = LayoutShadowNode$a.a[this.mTempYogaValue.b.ordinal()];
       if (i != 1 && i != 2) {
          if (i == 4) {
             this.setPaddingPercent(p0, this.mTempYogaValue.a);
          }
       }else {
          this.setPadding(p0, this.mTempYogaValue.a);
       }
       p1.recycle();
       return;
    }
    public void setPosition(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "25")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       boolean b = false;
       if (p0 == null) {
          this.setPositionType(YogaPositionType.RELATIVE);
          this.mIsFixedNode = b;
          return;
       }else {
          int i = -1;
          switch (p0.hashCode()){
              case 0xdef3facc:
                if (p0.equals("relative")) {
                   i = 0;
                }
                break;
              case 0x5cee774:
                if (p0.equals("fixed")) {
                   i = 1;
                }
                break;
              case 0x67010d77:
                if (p0.equals("absolute")) {
                   i = 2;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                this.moveToOriginalParent();
                this.setPositionType(YogaPositionType.RELATIVE);
                this.mIsFixedNode = b;
                break;
              case 1:
                this.moveToRootView();
                this.setPositionType(YogaPositionType.ABSOLUTE);
                this.mIsFixedNode = true;
                break;
              case 2:
                this.moveToOriginalParent();
                this.setPositionType(YogaPositionType.ABSOLUTE);
                this.mIsFixedNode = b;
                break;
              default:
                throw new JSApplicationIllegalArgumentException("invalid value for position: "+p0);
          }
          return;
       }
    }
    public void setPositionValues(int p0,Dynamic p1){
       LayoutShadowNode layoutShadow = LayoutShadowNode.class;
       if (PatchProxy.isSupport(layoutShadow) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, layoutShadow, "23")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       p0 = this.maybeTransformLeftRightToStartEnd(new int[6]{4,5,0,2,1,3}[p0]);
       this.mTempYogaValue.a(p1);
       int i = LayoutShadowNode$a.a[this.mTempYogaValue.b.ordinal()];
       if (i != 1 && i != 2) {
          if (i == 4) {
             this.setPositionPercent(p0, this.mTempYogaValue.a);
          }
       }else {
          this.setPosition(p0, this.mTempYogaValue.a);
       }
       p1.recycle();
       return;
    }
    public void setShouldNotifyOnLayout(boolean p0){
       LayoutShadowNode layoutShadow = LayoutShadowNode.class;
       if (PatchProxy.isSupport(layoutShadow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, layoutShadow, "28")) {
          return;
       }
       super.setShouldNotifyOnLayout(p0);
       return;
    }
    public void setWidth(Dynamic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode.class, "1")) {
          return;
       }
       if (this.isVirtual()) {
          return;
       }
       this.mTempYogaValue.a(p0);
       int i = LayoutShadowNode$a.a[this.mTempYogaValue.b.ordinal()];
       if (i != 1 && i != 2) {
          if (i != 3) {
             if (i == 4) {
                this.setStyleWidthPercent(this.mTempYogaValue.a);
             }
          }else {
             this.setStyleWidthAuto();
          }
       }else {
          this.setStyleWidth(this.mTempYogaValue.a);
       }
       p0.recycle();
       return;
    }
    public void synchronouslyUpdateLayoutInfoForKdsList(ViewManager p0,View p1){
    }
}
