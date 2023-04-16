package com.facebook.react.views.text.ReactTextShadowNode$$PropsSetter;
import com.facebook.react.uimanager.k$d;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.x;
import com.facebook.react.views.text.ReactTextShadowNode;
import java.util.Objects;
import java.lang.Double;
import com.facebook.react.uimanager.LayoutShadowNode;
import yf.i;
import java.lang.Boolean;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.Dynamic;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableMap;

public class ReactTextShadowNode$$PropsSetter implements k$d	// class@00140b
{

    public void ReactTextShadowNode$$PropsSetter(){
       super();
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextShadowNode$$PropsSetter.class, "2")) {
          return;
       }
       p0.put("adjustsFontSizeToFit", "boolean");
       p0.put("alignContent", "String");
       p0.put("alignItems", "String");
       p0.put("alignSelf", "String");
       p0.put("allowFontScaling", "boolean");
       p0.put("aspectRatio", "number");
       p0.put("backgroundColor", "Color");
       p0.put("borderBottomWidth", "number");
       p0.put("borderEndWidth", "number");
       p0.put("borderLeftWidth", "number");
       p0.put("borderRightWidth", "number");
       p0.put("borderStartWidth", "number");
       p0.put("borderTopWidth", "number");
       p0.put("borderWidth", "number");
       p0.put("bottom", "Dynamic");
       p0.put("collapsable", "boolean");
       p0.put("color", "number");
       p0.put("display", "String");
       p0.put("end", "Dynamic");
       p0.put("flex", "number");
       p0.put("flexBasis", "Dynamic");
       p0.put("flexDirection", "String");
       p0.put("flexGrow", "number");
       p0.put("flexShrink", "number");
       p0.put("flexWrap", "String");
       p0.put("fontFamily", "String");
       p0.put("fontSize", "number");
       p0.put("fontStyle", "String");
       p0.put("fontVariant", "Array");
       p0.put("fontWeight", "String");
       p0.put("height", "Dynamic");
       p0.put("includeFontPadding", "boolean");
       p0.put("justifyContent", "String");
       p0.put("left", "Dynamic");
       p0.put("letterSpacing", "number");
       p0.put("lineHeight", "number");
       p0.put("margin", "Dynamic");
       p0.put("marginBottom", "Dynamic");
       p0.put("marginEnd", "Dynamic");
       p0.put("marginHorizontal", "Dynamic");
       p0.put("marginLeft", "Dynamic");
       p0.put("marginRight", "Dynamic");
       p0.put("marginStart", "Dynamic");
       p0.put("marginTop", "Dynamic");
       p0.put("marginVertical", "Dynamic");
       p0.put("maxFontSizeMultiplier", "number");
       p0.put("maxHeight", "Dynamic");
       p0.put("maxWidth", "Dynamic");
       p0.put("minHeight", "Dynamic");
       p0.put("minWidth", "Dynamic");
       p0.put("minimumFontScale", "number");
       p0.put("numberOfLines", "number");
       p0.put("onLayout", "boolean");
       p0.put("onTextLayout", "boolean");
       p0.put("overflow", "String");
       p0.put("padding", "Dynamic");
       p0.put("paddingBottom", "Dynamic");
       p0.put("paddingEnd", "Dynamic");
       p0.put("paddingHorizontal", "Dynamic");
       p0.put("paddingLeft", "Dynamic");
       p0.put("paddingRight", "Dynamic");
       p0.put("paddingStart", "Dynamic");
       p0.put("paddingTop", "Dynamic");
       p0.put("paddingVertical", "Dynamic");
       p0.put("position", "String");
       p0.put("right", "Dynamic");
       p0.put("start", "Dynamic");
       p0.put("textAlign", "String");
       p0.put("textBreakStrategy", "String");
       p0.put("textDecorationLine", "String");
       p0.put("textShadowColor", "Color");
       p0.put("textShadowOffset", "Map");
       p0.put("textShadowRadius", "number");
       p0.put("textTransform", "String");
       p0.put("top", "Dynamic");
       p0.put("width", "Dynamic");
       return;
    }
    public void setProperty(x p0,String p1,Object p2){
       int i1;
       String str = p1;
       Object obj = p2;
       LayoutShadowNode layoutShadow = p0;
       if (PatchProxy.applyVoidThreeRefs(layoutShadow, p1, p2, this, ReactTextShadowNode$$PropsSetter.class, "1")) {
       }else {
          Objects.requireNonNull(p1);
          boolean b = false;
          boolean b1 = true;
          int i = -1;
          switch (p1.hashCode()){
              case 0x8a807656:
                if (!str.equals("borderRightWidth")) {
                label_0442 :
                   i1 = -1;
                }else {
                   i1 = 0;
                }
                break;
              case 0x8e632c72:
                if (!str.equals("marginHorizontal")) {
                   goto label_0442 ;
                }else {
                   i1 = 1;
                }
                break;
              case 0x95adf7c5:
                if (!str.equals("flexBasis")) {
                   goto label_0442 ;
                }else {
                   i1 = 2;
                }
                break;
              case 0xa2d46d65:
                if (!str.equals("textBreakStrategy")) {
                   goto label_0442 ;
                }else {
                   i1 = 3;
                }
                break;
              case 0xa38e7aa2:
                if (!str.equals("fontStyle")) {
                   goto label_0442 ;
                }else {
                   i1 = 4;
                }
                break;
              case 0xa685dfb8:
                if (!str.equals("paddingLeft")) {
                   goto label_0442 ;
                }else {
                   i1 = 5;
                }
                break;
              case 0xa96bf5bd:
                if (!str.equals("borderTopWidth")) {
                   goto label_0442 ;
                }else {
                   i1 = 6;
                }
                break;
              case 0xad55c822:
                if (!str.equals("adjustsFontSizeToFit")) {
                   goto label_0442 ;
                }else {
                   i1 = 7;
                }
                break;
              case 0xad8d9a2b:
                if (!str.equals("bottom")) {
                   goto label_0442 ;
                }else {
                   i1 = 8;
                }
                break;
              case 0xadfeba94:
                if (!str.equals("minWidth")) {
                   goto label_0442 ;
                }else {
                   i1 = 9;
                }
                break;
              case 0xb0bb87df:
                if (!str.equals("numberOfLines")) {
                   goto label_0442 ;
                }else {
                   i1 = 10;
                }
                break;
              case 0xb1044d12:
                if (!str.equals("collapsable")) {
                   goto label_0442 ;
                }else {
                   i1 = 11;
                }
                break;
              case 0xb313668f:
                if (!str.equals("borderBottomWidth")) {
                   goto label_0442 ;
                }else {
                   i1 = 12;
                }
                break;
              case 0xb7009c93:
                if (!str.equals("fontFamily")) {
                   goto label_0442 ;
                }else {
                   i1 = 13;
                }
                break;
              case 0xb7389127:
                if (!str.equals("height")) {
                   goto label_0442 ;
                }else {
                   i1 = 14;
                }
                break;
              case 0xbf8c85ae:
                if (!str.equals("margin")) {
                   goto label_0442 ;
                }else {
                   i1 = 15;
                }
                break;
              case 0xc07d95d8:
                if (!str.equals("textAlign")) {
                   goto label_0442 ;
                }else {
                   i1 = 16;
                }
                break;
              case 0xc09ffbbb:
                if (!str.equals("alignItems")) {
                   goto label_0442 ;
                }else {
                   i1 = 17;
                }
                break;
              case 0xc1b9844d:
                if (!str.equals("marginEnd")) {
                   goto label_0442 ;
                }else {
                   i1 = 18;
                }
                break;
              case 0xc1b9bcc7:
                if (!str.equals("marginTop")) {
                   goto label_0442 ;
                }else {
                   i1 = 19;
                }
                break;
              case 0xc5e00f86:
                if (!str.equals("flexDirection")) {
                   goto label_0442 ;
                }else {
                   i1 = 20;
                }
                break;
              case 0xc9fe87ab:
                if (!str.equals("maxHeight")) {
                   goto label_0442 ;
                }else {
                   i1 = 21;
                }
                break;
              case 0xcff03c11:
                if (!str.equals("padding")) {
                   goto label_0442 ;
                }else {
                   i1 = 22;
                }
                break;
              case 0xd32435b4:
                if (!str.equals("alignContent")) {
                   goto label_0442 ;
                }else {
                   i1 = 23;
                }
                break;
              case 0xd43983a7:
                if (!str.equals("fontWeight")) {
                   goto label_0442 ;
                }else {
                   i1 = 24;
                }
                break;
              case 0xe141663b:
                if (!str.equals("lineHeight")) {
                   goto label_0442 ;
                }else {
                   i1 = 25;
                }
                break;
              case 0xe7ba2d2f:
                if (!str.equals("allowFontScaling")) {
                   goto label_0442 ;
                }else {
                   i1 = 26;
                }
                break;
              case 0xea8c8315:
                if (!str.equals("paddingHorizontal")) {
                   goto label_0442 ;
                }else {
                   i1 = 27;
                }
                break;
              case 0xeec39179:
                if (!str.equals("marginBottom")) {
                   goto label_0442 ;
                }else {
                   i1 = 28;
                }
                break;
              case 0xf2a62733:
                if (!str.equals("borderLeftWidth")) {
                   goto label_0442 ;
                }else {
                   i1 = 29;
                }
                break;
              case 0xf8099e19:
                if (!str.equals("minHeight")) {
                   goto label_0442 ;
                }else {
                   i1 = 30;
                }
                break;
              case 0x188db:
                if (!str.equals("end")) {
                   goto label_0442 ;
                }else {
                   i1 = 31;
                }
                break;
              case 0x1c155:
                if (!str.equals("top")) {
                   goto label_0442 ;
                }else {
                   i1 = 32;
                }
                break;
              case 0x2ffff9:
                if (!str.equals("flex")) {
                   goto label_0442 ;
                }else {
                   i1 = 33;
                }
                break;
              case 0x32a007:
                if (!str.equals("left")) {
                   goto label_0442 ;
                }else {
                   i1 = 34;
                }
                break;
              case 0x55f0f0a:
                if (!str.equals("paddingEnd")) {
                   goto label_0442 ;
                }else {
                   i1 = 35;
                }
                break;
              case 0x55f4784:
                if (!str.equals("paddingTop")) {
                   goto label_0442 ;
                }else {
                   i1 = 36;
                }
                break;
              case 0x5a72f63:
                if (!str.equals("color")) {
                   goto label_0442 ;
                }else {
                   i1 = 37;
                }
                break;
              case 0x677c21c:
                if (!str.equals("right")) {
                   goto label_0442 ;
                }else {
                   i1 = 38;
                }
                break;
              case 0x68ac462:
                if (!str.equals("start")) {
                   goto label_0442 ;
                }else {
                   i1 = 39;
                }
                break;
              case 0x6be2dc6:
                if (!str.equals("width")) {
                   goto label_0442 ;
                }else {
                   i1 = 40;
                }
                break;
              case 0xc0fb19c:
                if (!str.equals("paddingBottom")) {
                   goto label_0442 ;
                }else {
                   i1 = 41;
                }
                break;
              case 0x15caa0f0:
                if (!str.equals("fontSize")) {
                   goto label_0442 ;
                }else {
                   i1 = 42;
                }
                break;
              case 0x17dd56c2:
                if (!str.equals("maxWidth")) {
                   goto label_0442 ;
                }else {
                   i1 = 43;
                }
                break;
              case 0x1f91b402:
                if (!str.equals("overflow")) {
                   goto label_0442 ;
                }else {
                   i1 = 44;
                }
                break;
              case 0x20b7df55:
                if (!str.equals("maxFontSizeMultiplier")) {
                   goto label_0442 ;
                }else {
                   i1 = 45;
                }
                break;
              case 0x227eceb6:
                if (!str.equals("textShadowColor")) {
                   goto label_0442 ;
                }else {
                   i1 = 46;
                }
                break;
              case 0x288435f6:
                if (!str.equals("onTextLayout")) {
                   goto label_0442 ;
                }else {
                   i1 = 47;
                }
                break;
              case 0x2a8c788b:
                if (!str.equals("paddingRight")) {
                   goto label_0442 ;
                }else {
                   i1 = 48;
                }
                break;
              case 0x2a9f7ad1:
                if (!str.equals("paddingStart")) {
                   goto label_0442 ;
                }else {
                   i1 = 49;
                }
                break;
              case 0x2c2c84fa:
                if (!str.equals("borderWidth")) {
                   goto label_0442 ;
                }else {
                   i1 = 50;
                }
                break;
              case 0x2c929929:
                if (!str.equals("position")) {
                   goto label_0442 ;
                }else {
                   i1 = 51;
                }
                break;
              case 0x388b25cd:
                if (!str.equals("minimumFontScale")) {
                   goto label_0442 ;
                }else {
                   i1 = 52;
                }
                break;
              case 0x3a1ea90e:
                if (!str.equals("marginRight")) {
                   goto label_0442 ;
                }else {
                   i1 = 53;
                }
                break;
              case 0x3a31ab54:
                if (!str.equals("marginStart")) {
                   goto label_0442 ;
                }else {
                   i1 = 54;
                }
                break;
              case 0x3d759362:
                if (!str.equals("flexShrink")) {
                   goto label_0442 ;
                }else {
                   i1 = 55;
                }
                break;
              case 0x41194293:
                if (!str.equals("aspectRatio")) {
                   goto label_0442 ;
                }else {
                   i1 = 56;
                }
                break;
              case 0x4153afa0:
                if (!str.equals("textShadowOffset")) {
                   goto label_0442 ;
                }else {
                   i1 = 57;
                }
                break;
              case 0x462ab79f:
                if (!str.equals("textShadowRadius")) {
                   goto label_0442 ;
                }else {
                   i1 = 58;
                }
                break;
              case 0x49d9f1f7:
                if (!str.equals("borderEndWidth")) {
                   goto label_0442 ;
                }else {
                   i1 = 59;
                }
                break;
              case 0x4cb7f6d5:
                if (!str.equals("backgroundColor")) {
                   goto label_0442 ;
                }else {
                   i1 = 60;
                }
                break;
              case 0x4ccfd1e9:
                if (!str.equals("onLayout")) {
                   goto label_0442 ;
                }else {
                   i1 = 61;
                }
                break;
              case 0x4f20c8bf:
                if (!str.equals("textTransform")) {
                   goto label_0442 ;
                }else {
                   i1 = 62;
                }
                break;
              case 0x501666a7:
                if (!str.equals("paddingVertical")) {
                   goto label_0442 ;
                }else {
                   i1 = 63;
                }
                break;
              case 0x5551c344:
                if (!str.equals("marginVertical")) {
                   goto label_0442 ;
                }else {
                   i1 = 64;
                }
                break;
              case 0x63a518c2:
                if (!str.equals("display")) {
                   goto label_0442 ;
                }else {
                   i1 = 65;
                }
                break;
              case 0x67ef5bac:
                if (!str.equals("flexGrow")) {
                   goto label_0442 ;
                }else {
                   i1 = 66;
                }
                break;
              case 0x67f69fe3:
                if (!str.equals("flexWrap")) {
                   goto label_0442 ;
                }else {
                   i1 = 67;
                }
                break;
              case 0x6953cff1:
                if (!str.equals("alignSelf")) {
                   goto label_0442 ;
                }else {
                   i1 = 68;
                }
                break;
              case 0x6ee75fc9:
                if (!str.equals("justifyContent")) {
                   goto label_0442 ;
                }else {
                   i1 = 69;
                }
                break;
              case 0x757a12d5:
                if (!str.equals("marginLeft")) {
                   goto label_0442 ;
                }else {
                   i1 = 70;
                }
                break;
              case 0x77bcf536:
                if (!str.equals("fontVariant")) {
                   goto label_0442 ;
                }else {
                   i1 = 71;
                }
                break;
              case 0x78687afa:
                if (!str.equals("includeFontPadding")) {
                   goto label_0442 ;
                }else {
                   i1 = 72;
                }
                break;
              case 0x79180351:
                if (!str.equals("textDecorationLine")) {
                   goto label_0442 ;
                }else {
                   i1 = 73;
                }
                break;
              case 0x7dd4813d:
                if (!str.equals("letterSpacing")) {
                   goto label_0442 ;
                }else {
                   i1 = 74;
                }
                break;
              case 0x7f71efd0:
                if (!str.equals("borderStartWidth")) {
                   goto label_0442 ;
                }else {
                   i1 = 75;
                }
                break;
              default:
                goto label_0442 ;
          }
          Integer integer = null;
          float f = 0;
          float f1 = Float.NaN;
          switch (i1){
              case 0:
                if (obj) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setBorderWidths(6, f1);
                break;
              case 1:
                layoutShadow.setMargins(2, new DynamicFromObject(obj));
                break;
              case 2:
                layoutShadow.setFlexBasis(new DynamicFromObject(obj));
                break;
              case 3:
                layoutShadow.setTextBreakStrategy(obj);
                break;
              case 4:
                layoutShadow.setFontStyle(obj);
                break;
              case 5:
                layoutShadow.setPaddings(7, new DynamicFromObject(obj));
                break;
              case 6:
                if (obj != null) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setBorderWidths(3, f1);
                break;
              case 7:
                if (obj != null) {
                   b = obj.booleanValue();
                }
                layoutShadow.setAdjustFontSizeToFit(b);
                break;
              case 8:
                layoutShadow.setPositionValues(5, new DynamicFromObject(obj));
                break;
              case 9:
                layoutShadow.setMinWidth(new DynamicFromObject(obj));
                break;
              case 10:
                if (obj != null) {
                   i = obj.intValue();
                }
                layoutShadow.setNumberOfLines(i);
                break;
              case 11:
                if (obj != null) {
                   b = obj.booleanValue();
                }
                layoutShadow.setCollapsable(b);
                break;
              case 12:
                if (obj != null) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setBorderWidths(4, f1);
                break;
              case 13:
                layoutShadow.setFontFamily(obj);
                break;
              case 14:
                layoutShadow.setHeight(new DynamicFromObject(obj));
                break;
              case 15:
                layoutShadow.setMargins(b, new DynamicFromObject(obj));
                break;
              case 16:
                layoutShadow.setTextAlign(obj);
                break;
              case 17:
                layoutShadow.setAlignItems(obj);
                break;
              case 18:
                layoutShadow.setMargins(4, new DynamicFromObject(obj));
                break;
              case 19:
                layoutShadow.setMargins(5, new DynamicFromObject(obj));
                break;
              case 20:
                layoutShadow.setFlexDirection(obj);
                break;
              case 21:
                layoutShadow.setMaxHeight(new DynamicFromObject(obj));
                break;
              case 22:
                layoutShadow.setPaddings(b, new DynamicFromObject(obj));
                break;
              case 23:
                layoutShadow.setAlignContent(obj);
                break;
              case 24:
                layoutShadow.setFontWeight(obj);
                break;
              case 25:
                if (obj != null) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setLineHeight(f1);
                break;
              case 26:
                if (obj != null) {
                   b1 = obj.booleanValue();
                }
                layoutShadow.setAllowFontScaling(b1);
                break;
              case 27:
                layoutShadow.setPaddings(2, new DynamicFromObject(obj));
                break;
              case 28:
                layoutShadow.setMargins(6, new DynamicFromObject(obj));
                break;
              case 29:
                if (obj != null) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setBorderWidths(5, f1);
                break;
              case 30:
                layoutShadow.setMinHeight(new DynamicFromObject(obj));
                break;
              case 31:
                layoutShadow.setPositionValues(b1, new DynamicFromObject(obj));
                break;
              case 32:
                layoutShadow.setPositionValues(4, new DynamicFromObject(obj));
                break;
              case '!':
                if (obj != null) {
                   f = obj.floatValue();
                }
                layoutShadow.setFlex(f);
                break;
              case '"':
                layoutShadow.setPositionValues(2, new DynamicFromObject(obj));
                break;
              case '#':
                layoutShadow.setPaddings(4, new DynamicFromObject(obj));
                break;
              case '$':
                layoutShadow.setPaddings(5, new DynamicFromObject(obj));
                break;
              case '%':
                if (obj != null) {
                   integer = Integer.valueOf(obj.intValue());
                }
                layoutShadow.setColor(integer);
                break;
              case '&':
                layoutShadow.setPositionValues(3, new DynamicFromObject(obj));
                break;
              case 39:
                layoutShadow.setPositionValues(b, new DynamicFromObject(obj));
                break;
              case '(':
                layoutShadow.setWidth(new DynamicFromObject(obj));
                break;
              case ')':
                layoutShadow.setPaddings(6, new DynamicFromObject(obj));
                break;
              case '*':
                if (obj != null) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setFontSize(f1);
                break;
              case '+':
                layoutShadow.setMaxWidth(new DynamicFromObject(obj));
                break;
              case ',':
                layoutShadow.setOverflow(obj);
                break;
              case '-':
                if (obj != null) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setMaxFontSizeMultiplier(f1);
                break;
              case '.':
                i1 = (obj == null)? 0x55000000: obj.intValue();
                layoutShadow.setTextShadowColor(i1);
                break;
              case '/':
                if (obj != null) {
                   b = obj.booleanValue();
                }
                layoutShadow.setShouldNotifyOnTextLayout(b);
                break;
              case '0':
                layoutShadow.setPaddings(8, new DynamicFromObject(obj));
                break;
              case '1':
                layoutShadow.setPaddings(3, new DynamicFromObject(obj));
                break;
              case '2':
                if (obj != null) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setBorderWidths(b, f1);
                break;
              case '3':
                layoutShadow.setPosition(obj);
                break;
              case '4':
                if (obj != null) {
                   f = obj.floatValue();
                }
                layoutShadow.setMinimumFontScale(f);
                break;
              case '5':
                layoutShadow.setMargins(8, new DynamicFromObject(obj));
                break;
              case '6':
                layoutShadow.setMargins(3, new DynamicFromObject(obj));
                break;
              case '7':
                if (obj != null) {
                   f = obj.floatValue();
                }
                layoutShadow.setFlexShrink(f);
                break;
              case '8':
                if (obj != null) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setAspectRatio(f1);
                break;
              case '9':
                layoutShadow.setTextShadowOffset(obj);
                break;
              case ':':
                if (obj != null) {
                   f = obj.floatValue();
                }
                layoutShadow.setTextShadowRadius(f);
                break;
              case ';':
                if (obj != null) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setBorderWidths(2, f1);
                break;
              case '<':
                if (obj != null) {
                   integer = Integer.valueOf(obj.intValue());
                }
                layoutShadow.setBackgroundColor(integer);
                break;
              case '=':
                if (obj != null) {
                   b = obj.booleanValue();
                }
                layoutShadow.setShouldNotifyOnLayout(b);
                break;
              case '>':
                layoutShadow.setTextTransform(obj);
                break;
              case '?':
                layoutShadow.setPaddings(b1, new DynamicFromObject(obj));
                break;
              case '@':
                layoutShadow.setMargins(b1, new DynamicFromObject(obj));
                break;
              case 'A':
                layoutShadow.setDisplay(obj);
                break;
              case 'B':
                if (obj != null) {
                   f = obj.floatValue();
                }
                layoutShadow.setFlexGrow(f);
                break;
              case 'C':
                layoutShadow.setFlexWrap(obj);
                break;
              case 'D':
                layoutShadow.setAlignSelf(obj);
                break;
              case 'E':
                layoutShadow.setJustifyContent(obj);
                break;
              case 'F':
                layoutShadow.setMargins(7, new DynamicFromObject(obj));
                break;
              case 'G':
                layoutShadow.setFontVariant(obj);
                break;
              case 'H':
                if (obj != null) {
                   b1 = obj.booleanValue();
                }
                layoutShadow.setIncludeFontPadding(b1);
                break;
              case 'I':
                layoutShadow.setTextDecorationLine(obj);
                break;
              case 'J':
                if (obj != null) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setLetterSpacing(f1);
                break;
              case 'K':
                if (obj != null) {
                   f1 = obj.floatValue();
                }
                layoutShadow.setBorderWidths(b1, f1);
                break;
              default:
          }
       }
       return;
    }
}
