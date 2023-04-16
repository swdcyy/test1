package com.facebook.react.views.textinput.ReactTextInputManager$$PropsSetter;
import com.facebook.react.uimanager.k$e;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.textinput.ReactEditText;
import java.util.Objects;
import java.lang.Double;
import java.lang.Integer;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.Boolean;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.Dynamic;

public class ReactTextInputManager$$PropsSetter implements k$e	// class@001427
{

    public void ReactTextInputManager$$PropsSetter(){
       super();
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextInputManager$$PropsSetter.class, "2")) {
          return;
       }
       p0.put("accessibilityActions", "Array");
       p0.put("accessibilityHint", "String");
       p0.put("accessibilityLabel", "String");
       p0.put("accessibilityLiveRegion", "String");
       p0.put("accessibilityRole", "String");
       p0.put("accessibilityState", "Map");
       p0.put("accessibilityValue", "Map");
       p0.put("allowFontScaling", "boolean");
       p0.put("autoCapitalize", "Dynamic");
       p0.put("autoCompleteType", "String");
       p0.put("autoCorrect", "boolean");
       p0.put("backgroundColor", "Color");
       p0.put("blurOnSubmit", "boolean");
       p0.put("borderBottomColor", "Color");
       p0.put("borderBottomLeftRadius", "number");
       p0.put("borderBottomRightRadius", "number");
       p0.put("borderBottomWidth", "number");
       p0.put("borderColor", "Color");
       p0.put("borderLeftColor", "Color");
       p0.put("borderLeftWidth", "number");
       p0.put("borderRadius", "number");
       p0.put("borderRightColor", "Color");
       p0.put("borderRightWidth", "number");
       p0.put("borderStyle", "String");
       p0.put("borderTopColor", "Color");
       p0.put("borderTopLeftRadius", "number");
       p0.put("borderTopRightRadius", "number");
       p0.put("borderTopWidth", "number");
       p0.put("borderWidth", "number");
       p0.put("caretHidden", "boolean");
       p0.put("color", "Color");
       p0.put("contextMenuHidden", "boolean");
       p0.put("cursorColor", "Color");
       p0.put("disableFullscreenUI", "boolean");
       p0.put("editable", "boolean");
       p0.put("elevation", "number");
       p0.put("fontFamily", "String");
       p0.put("fontSize", "number");
       p0.put("fontStyle", "String");
       p0.put("fontWeight", "String");
       p0.put("importantForAccessibility", "String");
       p0.put("importantForAutofill", "String");
       p0.put("includeFontPadding", "boolean");
       p0.put("inlineImageLeft", "String");
       p0.put("inlineImagePadding", "number");
       p0.put("keyboardType", "String");
       p0.put("letterSpacing", "number");
       p0.put("maxFontSizeMultiplier", "number");
       p0.put("maxLength", "number");
       p0.put("mostRecentEventCount", "number");
       p0.put("multiline", "boolean");
       p0.put("nativeID", "String");
       p0.put("numberOfLines", "number");
       p0.put("onContentSizeChange", "boolean");
       p0.put("onKeyPress", "boolean");
       p0.put("onScroll", "boolean");
       p0.put("onSelectionChange", "boolean");
       p0.put("opacity", "number");
       p0.put("placeholder", "String");
       p0.put("placeholderTextColor", "Color");
       p0.put("renderToHardwareTextureAndroid", "boolean");
       p0.put("returnKeyLabel", "String");
       p0.put("returnKeyType", "String");
       p0.put("rotation", "number");
       p0.put("scaleX", "number");
       p0.put("scaleY", "number");
       p0.put("secureTextEntry", "boolean");
       p0.put("selectTextOnFocus", "boolean");
       p0.put("selectionColor", "Color");
       p0.put("showSoftInputOnFocus", "boolean");
       p0.put("testID", "String");
       p0.put("textAlign", "String");
       p0.put("textAlignVertical", "String");
       p0.put("transform", "Array");
       p0.put("translateX", "number");
       p0.put("translateY", "number");
       p0.put("underlineColorAndroid", "Color");
       p0.put("zIndex", "number");
       return;
    }
    public void setProperty(ViewManager p0,View p1,String p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ReactTextInputManager$$PropsSetter.class, "1")) {
       }else {
          Objects.requireNonNull(p2);
          int i = -1;
          boolean b = false;
          int i1 = 1;
          switch (p2.hashCode()){
              case 0x896977f3:
                if (p2.equals("borderRightColor")) {
                   i = 0;
                }
                break;
              case 0x8a807656:
                if (p2.equals("borderRightWidth")) {
                   i = 1;
                }
                break;
              case 0x96283a03:
                if (p2.equals("placeholderTextColor")) {
                   i = 2;
                }
                break;
              case 0x995d38ca:
                if (p2.equals("translateX")) {
                   i = 3;
                }
                break;
              case 0x995d38cb:
                if (p2.equals("translateY")) {
                   i = 4;
                }
                break;
              case 0x9fbb830d:
                if (p2.equals("caretHidden")) {
                   i = 5;
                }
                break;
              case 0xa0e2d1ad:
                if (p2.equals("cursorColor")) {
                   i = 6;
                }
                break;
              case 0xa2306278:
                if (p2.equals("underlineColorAndroid")) {
                   i = 7;
                }
                break;
              case 0xa38e7aa2:
                if (p2.equals("fontStyle")) {
                   i = 8;
                }
                break;
              case 0xa854f75a:
                if (p2.equals("borderTopColor")) {
                   i = 9;
                }
                break;
              case 0xa96bf5bd:
                if (p2.equals("borderTopWidth")) {
                   i = 10;
                }
                break;
              case 0xb02829fb:
                if (p2.equals("autoCapitalize")) {
                   i = 11;
                }
                break;
              case 0xb0bb87df:
                if (p2.equals("numberOfLines")) {
                   i = 12;
                }
                break;
              case 0xb1fc682c:
                if (p2.equals("borderBottomColor")) {
                   i = 13;
                }
                break;
              case 0xb313668f:
                if (p2.equals("borderBottomWidth")) {
                   i = 14;
                }
                break;
              case 0xb477f80b:
                if (p2.equals("opacity")) {
                   i = 15;
                }
                break;
              case 0xb6cd31e2:
                if (p2.equals("borderTopLeftRadius")) {
                   i = 16;
                }
                break;
              case 0xb7009c93:
                if (p2.equals("fontFamily")) {
                   i = 17;
                }
                break;
              case 0xb81a40ad:
                if (p2.equals("multiline")) {
                   i = 18;
                }
                break;
              case 0xc07d95d8:
                if (p2.equals("textAlign")) {
                   i = 19;
                }
                break;
              case 0xc2245c23:
                if (p2.equals("onKeyPress")) {
                   i = 20;
                }
                break;
              case 0xc9de204e:
                if (p2.equals("scaleX")) {
                   i = 21;
                }
                break;
              case 0xc9de204f:
                if (p2.equals("scaleY")) {
                   i = 22;
                }
                break;
              case 0xcbb7712d:
                if (p2.equals("testID")) {
                   i = 23;
                }
                break;
              case 0xcc32545e:
                if (p2.equals("blurOnSubmit")) {
                   i = 24;
                }
                break;
              case 0xd0d4316a:
                if (p2.equals("maxLength")) {
                   i = 25;
                }
                break;
              case 0xd43983a7:
                if (p2.equals("fontWeight")) {
                   i = 26;
                }
                break;
              case 0xd4677478:
                if (p2.equals("zIndex")) {
                   i = 27;
                }
                break;
              case 0xd63a8525:
                if (p2.equals("returnKeyLabel")) {
                   i = 28;
                }
                break;
              case 0xda077db0:
                if (p2.equals("selectTextOnFocus")) {
                   i = 29;
                }
                break;
              case 0xe6046fbb:
                if (p2.equals("autoCorrect")) {
                   i = 30;
                }
                break;
              case 0xe7ba2d2f:
                if (p2.equals("allowFontScaling")) {
                   i = 31;
                }
                break;
              case 0xf18f28d0:
                if (p2.equals("borderLeftColor")) {
                   i = 32;
                }
                break;
              case 0xf2a62733:
                if (p2.equals("borderLeftWidth")) {
                   i = 33;
                }
                break;
              case 0xf9f0bcf5:
                if (p2.equals("accessibilityHint")) {
                   i = 34;
                }
                break;
              case 0xf9f55ee4:
                if (p2.equals("accessibilityRole")) {
                   i = 35;
                }
                break;
              case 0xfb2db0ed:
                if (p2.equals("renderToHardwareTextureAndroid")) {
                   i = 36;
                }
                break;
              case 0xfd990f7e:
                if (p2.equals("rotation")) {
                   i = 37;
                }
                break;
              case 0xffbd2e5d:
                if (p2.equals("elevation")) {
                   i = 38;
                }
                break;
              case 0x22936ee:
                if (p2.equals("accessibilityLiveRegion")) {
                   i = 39;
                }
                break;
              case 0x5a72f63:
                if (p2.equals("color")) {
                   i = 40;
                }
                break;
              case 0xc742bc1:
                if (p2.equals("keyboardType")) {
                   i = 41;
                }
                break;
              case 0x13dfc885:
                if (p2.equals("borderTopRightRadius")) {
                   i = 42;
                }
                break;
              case 0x15caa0f0:
                if (p2.equals("fontSize")) {
                   i = 43;
                }
                break;
              case 0x1ea3de97:
                if (p2.equals("disableFullscreenUI")) {
                   i = 44;
                }
                break;
              case 0x20b7df55:
                if (p2.equals("maxFontSizeMultiplier")) {
                   i = 45;
                }
                break;
              case 0x20eb687d:
                if (p2.equals("onSelectionChange")) {
                   i = 46;
                }
                break;
              case 0x21e7c18e:
                if (p2.equals("secureTextEntry")) {
                   i = 47;
                }
                break;
              case 0x22a57450:
                if (p2.equals("borderBottomLeftRadius")) {
                   i = 48;
                }
                break;
              case 0x230fd3d7:
                if (p2.equals("borderBottomRightRadius")) {
                   i = 49;
                }
                break;
              case 0x23a88573:
                if (p2.equals("placeholder")) {
                   i = 50;
                }
                break;
              case 0x2b158697:
                if (p2.equals("borderColor")) {
                   i = 51;
                }
                break;
              case 0x2bf974e5:
                if (p2.equals("borderStyle")) {
                   i = 52;
                }
                break;
              case 0x2c2c84fa:
                if (p2.equals("borderWidth")) {
                   i = 53;
                }
                break;
              case 0x2c861b47:
                if (p2.equals("importantForAccessibility")) {
                   i = 54;
                }
                break;
              case 0x38797ee9:
                if (p2.equals("returnKeyType")) {
                   i = 55;
                }
                break;
              case 0x3e371362:
                if (p2.equals("autoCompleteType")) {
                   i = 56;
                }
                break;
              case 0x3ebe6b6c:
                if (p2.equals("transform")) {
                   i = 57;
                }
                break;
              case 0x3ef4744b:
                if (p2.equals("onContentSizeChange")) {
                   i = 58;
                }
                break;
              case 0x43f1c4f3:
                if (p2.equals("mostRecentEventCount")) {
                   i = 59;
                }
                break;
              case 0x445b6e46:
                if (p2.equals("accessibilityLabel")) {
                   i = 60;
                }
                break;
              case 0x44c6b3e3:
                if (p2.equals("accessibilityState")) {
                   i = 61;
                }
                break;
              case 0x44e880c3:
                if (p2.equals("accessibilityValue")) {
                   i = 62;
                }
                break;
              case 0x471af219:
                if (p2.equals("importantForAutofill")) {
                   i = 63;
                }
                break;
              case 0x4cb7f6d5:
                if (p2.equals("backgroundColor")) {
                   i = 64;
                }
                break;
              case 0x4dc3f169:
                if (p2.equals("inlineImageLeft")) {
                   i = 65;
                }
                break;
              case 0x506afbde:
                if (p2.equals("borderRadius")) {
                   i = 66;
                }
                break;
              case 0x58dabd8c:
                if (p2.equals("onScroll")) {
                   i = 67;
                }
                break;
              case 0x59bdabcf:
                if (p2.equals("accessibilityActions")) {
                   i = 68;
                }
                break;
              case 0x5f82ee64:
                if (p2.equals("editable")) {
                   i = 69;
                }
                break;
              case 0x6b33def8:
                if (p2.equals("contextMenuHidden")) {
                   i = 70;
                }
                break;
              case 0x6f6d096e:
                if (p2.equals("textAlignVertical")) {
                   i = 71;
                }
                break;
              case 0x71bdd76f:
                if (p2.equals("inlineImagePadding")) {
                   i = 72;
                }
                break;
              case 0x737ad176:
                if (p2.equals("showSoftInputOnFocus")) {
                   i = 73;
                }
                break;
              case 0x78687afa:
                if (p2.equals("includeFontPadding")) {
                   i = 74;
                }
                break;
              case 0x79eeaf72:
                if (p2.equals("nativeID")) {
                   i = 75;
                }
                break;
              case 0x7dd4813d:
                if (p2.equals("letterSpacing")) {
                   i = 76;
                }
                break;
              case 0x7fb0e537:
                if (p2.equals("selectionColor")) {
                   i = 77;
                }
                break;
              default:
          }
       label_0452 :
          int i2 = 0x3f800000;
          float f = 0;
          float f1 = Float.NaN;
          Integer integer = null;
          switch (i){
              case 0:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setBorderColor(p1, 2, integer);
                break;
              case 1:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderWidth(p1, 2, f1);
                break;
              case 2:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setPlaceholderTextColor(p1, integer);
                break;
              case 3:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setTranslateX(p1, f);
                break;
              case 4:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setTranslateY(p1, f);
                break;
              case 5:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setCaretHidden(p1, b);
                break;
              case 6:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setCursorColor(p1, integer);
                break;
              case 7:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setUnderlineColor(p1, integer);
                break;
              case 8:
                p0.setFontStyle(p1, p3);
                break;
              case 9:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setBorderColor(p1, 3, integer);
                break;
              case 10:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderWidth(p1, 3, f1);
                break;
              case 11:
                p0.setAutoCapitalize(p1, new DynamicFromObject(p3));
                break;
              case 12:
                if (p3 != null) {
                   i1 = p3.intValue();
                }
                p0.setNumLines(p1, i1);
                break;
              case 13:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setBorderColor(p1, 4, integer);
                break;
              case 14:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderWidth(p1, 4, f1);
                break;
              case 15:
                if (p3 != null) {
                   i2 = p3.floatValue();
                }
                p0.setOpacity(p1, i2);
                break;
              case 16:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, i1, f1);
                break;
              case 17:
                p0.setFontFamily(p1, p3);
                break;
              case 18:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setMultiline(p1, b);
                break;
              case 19:
                p0.setTextAlign(p1, p3);
                break;
              case 20:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setOnKeyPress(p1, b);
                break;
              case 21:
                if (p3 != null) {
                   i2 = p3.floatValue();
                }
                p0.setScaleX(p1, i2);
                break;
              case 22:
                if (p3 != null) {
                   i2 = p3.floatValue();
                }
                p0.setScaleY(p1, i2);
                break;
              case 23:
                p0.setTestId(p1, p3);
                break;
              case 24:
                if (p3 != null) {
                   integer = Boolean.valueOf(p3.booleanValue());
                }
                p0.setBlurOnSubmit(p1, integer);
                break;
              case 25:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setMaxLength(p1, integer);
                break;
              case 26:
                p0.setFontWeight(p1, p3);
                break;
              case 27:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setZIndex(p1, f);
                break;
              case 28:
                p0.setReturnKeyLabel(p1, p3);
                break;
              case 29:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setSelectTextOnFocus(p1, b);
                break;
              case 30:
                if (p3 != null) {
                   integer = Boolean.valueOf(p3.booleanValue());
                }
                p0.setAutoCorrect(p1, integer);
                break;
              case 31:
                if (p3 != null) {
                   i1 = p3.booleanValue();
                }
                p0.setAllowFontScaling(p1, i1);
                break;
              case 32:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setBorderColor(p1, i1, integer);
                break;
              case '!':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderWidth(p1, i1, f1);
                break;
              case '"':
                p0.setAccessibilityHint(p1, p3);
                break;
              case '#':
                p0.setAccessibilityRole(p1, p3);
                break;
              case '$':
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setRenderToHardwareTexture(p1, b);
                break;
              case '%':
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setRotation(p1, f);
                break;
              case '&':
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setElevation(p1, f);
                break;
              case 39:
                p0.setAccessibilityLiveRegion(p1, p3);
                break;
              case '(':
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setColor(p1, integer);
                break;
              case ')':
                p0.setKeyboardType(p1, p3);
                break;
              case '*':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, 2, f1);
                break;
              case '+':
                float f2 = (p3 == null)? 14.00f: p3.floatValue();
                p0.setFontSize(p1, f2);
                break;
              case ',':
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setDisableFullscreenUI(p1, b);
                break;
              case '-':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setMaxFontSizeMultiplier(p1, f1);
                break;
              case '.':
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setOnSelectionChange(p1, b);
                break;
              case '/':
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setSecureTextEntry(p1, b);
                break;
              case '0':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, 4, f1);
                break;
              case '1':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, 3, f1);
                break;
              case '2':
                p0.setPlaceholder(p1, p3);
                break;
              case '3':
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setBorderColor(p1, b, integer);
                break;
              case '4':
                p0.setBorderStyle(p1, p3);
                break;
              case '5':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderWidth(p1, b, f1);
                break;
              case '6':
                p0.setImportantForAccessibility(p1, p3);
                break;
              case '7':
                p0.setReturnKeyType(p1, p3);
                break;
              case '8':
                p0.setTextContentType(p1, p3);
                break;
              case '9':
                p0.setTransform(p1, p3);
                break;
              case ':':
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setOnContentSizeChange(p1, b);
                break;
              case ';':
                if (p3 != null) {
                   b = p3.intValue();
                }
                p0.setMostRecentEventCount(p1, b);
                break;
              case '<':
                p0.setAccessibilityLabel(p1, p3);
                break;
              case '=':
                p0.setViewState(p1, p3);
                break;
              case '>':
                p0.setAccessibilityValue(p1, p3);
                break;
              case '?':
                p0.setImportantForAutofill(p1, p3);
                break;
              case '@':
                if (p3 != null) {
                   b = p3.intValue();
                }
                p0.setBackgroundColor(p1, b);
                break;
              case 'A':
                p0.setInlineImageLeft(p1, p3);
                break;
              case 'B':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, b, f1);
                break;
              case 'C':
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setOnScroll(p1, b);
                break;
              case 'D':
                p0.setAccessibilityActions(p1, p3);
                break;
              case 'E':
                if (p3 != null) {
                   i1 = p3.booleanValue();
                }
                p0.setEditable(p1, i1);
                break;
              case 'F':
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setContextMenuHidden(p1, b);
                break;
              case 'G':
                p0.setTextAlignVertical(p1, p3);
                break;
              case 'H':
                if (p3 != null) {
                   b = p3.intValue();
                }
                p0.setInlineImagePadding(p1, b);
                break;
              case 'I':
                if (p3 != null) {
                   i1 = p3.booleanValue();
                }
                p0.showKeyboardOnFocus(p1, i1);
                break;
              case 'J':
                if (p3 != null) {
                   i1 = p3.booleanValue();
                }
                p0.setIncludeFontPadding(p1, i1);
                break;
              case 'K':
                p0.setNativeId(p1, p3);
                break;
              case 'L':
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setLetterSpacing(p1, f);
                break;
              case 'M':
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setSelectionColor(p1, integer);
                break;
              default:
          }
       }
       return;
    }
}
