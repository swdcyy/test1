package com.horcrux.svg.TSpanView;
import com.horcrux.svg.TextView;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import com.horcrux.svg.VirtualView;
import android.content.res.Resources;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import java.lang.String;
import java.text.Bidi;
import java.lang.Integer;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.graphics.Paint;
import com.horcrux.svg.FontData;
import android.os.Build$VERSION;
import com.horcrux.svg.TextProperties$FontVariantLigatures;
import com.horcrux.svg.TextProperties$FontWeight;
import com.horcrux.svg.TextProperties$FontStyle;
import android.graphics.Typeface$Builder;
import android.graphics.Typeface;
import yf.j;
import android.graphics.Canvas;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.GlyphContext;
import com.horcrux.svg.GroupView;
import android.graphics.Matrix;
import android.text.TextPaint;
import com.horcrux.svg.TSpanView$1;
import java.lang.Enum;
import android.text.Layout$Alignment;
import android.text.SpannableString;
import com.horcrux.svg.PropHelper;
import android.text.StaticLayout;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.horcrux.svg.TextPathView;
import com.horcrux.svg.GlyphPathBag;
import com.horcrux.svg.TextProperties$TextAnchor;
import com.horcrux.svg.TextProperties$TextPathMidLine;
import com.horcrux.svg.TextProperties$TextPathSide;
import java.lang.IllegalArgumentException;
import android.graphics.Paint$FontMetrics;
import com.horcrux.svg.TextProperties$AlignmentBaseline;
import android.graphics.Rect;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Math;
import android.graphics.RectF;
import android.text.StaticLayout$Builder;
import java.lang.Double;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Region;
import android.view.ViewParent;
import java.lang.Class;

public class TSpanView extends TextView	// class@000601
{
    public final AssetManager assets;
    public final ArrayList emoji;
    public final ArrayList emojiTransforms;
    public Path mCachedPath;
    public String mContent;
    public TextPathView textPath;

    public void TSpanView(ReactContext p0){
       super(p0);
       this.emoji = new ArrayList();
       this.emojiTransforms = new ArrayList();
       this.assets = this.mContext.getResources().getAssets();
    }
    public static String visualToLogical(String p0){
       if (p0 != null && p0.length()) {
          Bidi uBidi = new Bidi(p0, -2);
          if (uBidi.isLeftToRight()) {
             return p0;
          }else {
             int runCount = uBidi.getRunCount();
             byte[] uobyteArray = new byte[runCount];
             Integer[] integerArray = new Integer[runCount];
             int i = 0;
             for (int i1 = 0; i1 < runCount; i1 = i1 + 1) {
                uobyteArray[i1] = (byte)uBidi.getRunLevel(i1);
                integerArray[i1] = Integer.valueOf(i1);
             }
             Bidi.reorderVisually(uobyteArray, i, integerArray, i, runCount);
             StringBuilder str = "";
             while (i < runCount) {
                int i2 = integerArray[i].intValue();
                int runStart = uBidi.getRunStart(i2);
                int runLimit = uBidi.getRunLimit(i2);
                i2 = uobyteArray[i2] & 0x01;
                if (i2) {
                   runLimit = runLimit - 1;
                   while (runLimit >= runStart) {
                      str = str+p0.charAt(runLimit);
                   }
                }else {
                   str = str+p0;
                }
                i = i + 1;
             }
             p0 = str;
          }
       }
       return p0;
    }
    public final void applySpacingAndFeatures(Paint p0,FontData p1){
       int sDK_INT = Build$VERSION.SDK_INT;
       FontData letterSpacin = p1.letterSpacing;
       p0.setLetterSpacing((float)(letterSpacin / (p1.fontSize * (double)this.mScale)));
       StringBuilder str = (!letterSpacin && p1.fontVariantLigatures == TextProperties$FontVariantLigatures.normal)? 1: null;
       if (str) {
          p0.setFontFeatureSettings("\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "+p1.fontFeatureSettings);
       }else {
          p0.setFontFeatureSettings("\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "+p1.fontFeatureSettings);
       }
       if (sDK_INT >= 26) {
          p0.setFontVariationSettings("\'wght\' "+p1.absoluteFontWeight+p1.fontVariationSettings);
       }
       return;
    }
    public final void applyTextPropertiesToPaint(Paint p0,FontData p1){
       int i = 0;
       int i1 = (p1.fontWeight == TextProperties$FontWeight.Bold || p1.absoluteFontWeight >= 550)? 1: 0;
       boolean b = (p1.fontStyle == TextProperties$FontStyle.italic)? true: false;
       if (i1 && b) {
          i = 3;
       }else if(i1){
          i = 1;
       }else if(b){
          i = 2;
       }
       Typeface$Builder uBuilder = null;
       FontData absoluteFont = p1.absoluteFontWeight;
       FontData fontFamily = p1.fontFamily;
       if (fontFamily != null && fontFamily.length() > 0) {
          String str = "fonts/"+fontFamily+".otf";
          String str1 = "fonts/"+fontFamily+".ttf";
          if (Build$VERSION.SDK_INT >= 26) {
             uBuilder = new Typeface$Builder(this.assets, str);
             uBuilder.setFontVariationSettings("\'wght\' "+absoluteFont+p1.fontVariationSettings);
             uBuilder.setWeight(absoluteFont);
             uBuilder.setItalic(b);
             uBuilder = uBuilder.build();
             if (uBuilder == null) {
                uBuilder = new Typeface$Builder(this.assets, str1);
                uBuilder.setFontVariationSettings("\'wght\' "+absoluteFont+p1.fontVariationSettings);
                uBuilder.setWeight(absoluteFont);
                uBuilder.setItalic(b);
                uBuilder = uBuilder.build();
             }
          }else {
             try{
                uBuilder = Typeface.create(Typeface.createFromAsset(this.assets, str), i);
             }catch(java.lang.Exception e0){
                try{
                   uBuilder = Typeface.create(Typeface.createFromAsset(this.assets, str1), i);
                }catch(java.lang.Exception e0){
                }
             }
          }
       }
    }
    public void clearCache(){
       this.mCachedPath = null;
       super.clearCache();
    }
    public void draw(Canvas p0,Paint p1,float p2){
       if (this.mContent != null) {
          TextView tmInlineSize = this.mInlineSize;
          if (tmInlineSize != null && tmInlineSize.value - null) {
             if (this.setupFillPaint(p1, (this.fillOpacity * p2))) {
                this.drawWrappedText(p0, p1);
             }
             if (this.setupStrokePaint(p1, (p2 * this.strokeOpacity))) {
                this.drawWrappedText(p0, p1);
             }
          }else {
             int i = this.emoji.size();
             if (i > 0) {
                this.applyTextPropertiesToPaint(p1, this.getTextRootGlyphContext().getFont());
                for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                   p0.save();
                   p0.concat(this.emojiTransforms.get(i1));
                   p0.drawText(this.emoji.get(i1), 0, 0, p1);
                   p0.restore();
                }
             }
             this.drawPath(p0, p1, p2);
          }
       }else {
          this.clip(p0, p1);
          this.drawGroup(p0, p1, p2);
       }
       return;
    }
    public final void drawWrappedText(Canvas p0,Paint p1){
       Layout$Alignment aLIGN_NORMAL;
       StaticLayout this;
       TSpanView tSpanView = this;
       Canvas uCanvas = p0;
       GlyphContext textRootGlyp = this.getTextRootGlyphContext();
       this.pushGlyphContext();
       FontData font = textRootGlyp.getFont();
       TextPaint textPaint = new TextPaint(p1);
       tSpanView.applyTextPropertiesToPaint(textPaint, font);
       tSpanView.applySpacingAndFeatures(textPaint, font);
       double fontSize = textRootGlyp.getFontSize();
       int i = TSpanView$1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[font.textAnchor.ordinal()];
       if (i != 2) {
          aLIGN_NORMAL = (i != 3)? Layout$Alignment.ALIGN_NORMAL: Layout$Alignment.ALIGN_OPPOSITE;
       }else {
          aLIGN_NORMAL = Layout$Alignment.ALIGN_CENTER;
       }
       Layout$Alignment uAlignment = aLIGN_NORMAL;
       this = this.getStaticLayout(textPaint, uAlignment, true, new SpannableString(tSpanView.mContent), (int)PropHelper.fromRelative(tSpanView.mInlineSize, (double)p0.getWidth(), 0, (double)tSpanView.mScale, fontSize));
       this.popGlyphContext();
       p0.save();
       uCanvas.translate((float)textRootGlyp.nextX(0), (float)(textRootGlyp.nextY() + (double)this.getLineAscent(0)));
       this.draw(uCanvas);
       p0.restore();
       return;
    }
    public final double getAbsoluteStartOffset(SVGLength p0,double p1,double p2){
       return PropHelper.fromRelative(p0, p1, 0, (double)this.mScale, p2);
    }
    public final Path getLinePath(String p0,Paint p1,Canvas p2){
       int b1;
       PathMeasure pathMeasure1;
       double d1;
       int b2;
       int i3;
       boolean[] uobooleanArr1;
       float[] uofloatArray1;
       GlyphContext glyphContext;
       GlyphPathBag glyphPathBag1;
       double this;
       double d2;
       int i5;
       int i6;
       int i7;
       double d5;
       int i9;
       String fontMetrics1;
       Matrix matrix;
       Matrix fontMetrics1;
       String str4;
       double d11;
       int i12;
       int i13;
       int i14;
       int i15;
       GlyphContext glyphContext1;
       FontData uFontData6;
       PathMeasure pathMeasure3;
       int i16;
       int i17;
       float[] uofloatArray6;
       double d16;
       GlyphPathBag glyphPathBag2;
       double d17;
       Path this1;
       Matrix matrix2;
       char c1;
       PathMeasure pathMeasure5;
       double d19;
       Path path2;
       String str6;
       GlyphPathBag glyphPathBag3;
       TSpanView tSpanView1;
       ReadableMap map1;
       int this2;
       TSpanView tSpanView = this;
       Paint paint = p1;
       Canvas uCanvas = p2;
       int i = p0.length();
       Path path = new Path();
       tSpanView.emoji.clear();
       tSpanView.emojiTransforms.clear();
       if (!i) {
          return path;
       }
       PathMeasure pathMeasure = null;
       boolean b = false;
       int i1 = (tSpanView.textPath != null)? 1: 0;
       if (i1) {
          pathMeasure = new PathMeasure(tSpanView.textPath.getTextPath(uCanvas, paint), b);
          double d = (double)pathMeasure.getLength();
          b1 = pathMeasure.isClosed();
          if (!d) {
             return path;
          }else {
             pathMeasure1 = pathMeasure;
             d1 = d;
             b2 = b1;
          }
       }else {
          pathMeasure1 = pathMeasure;
          d1 = 0;
          b2 = false;
       }
       GlyphContext textRootGlyp = this.getTextRootGlyphContext();
       FontData font = textRootGlyp.getFont();
       tSpanView.applyTextPropertiesToPaint(paint, font);
       GlyphPathBag glyphPathBag = new GlyphPathBag(paint);
       boolean[] uobooleanArr = new boolean[i];
       char[] uocharArray = p0.toCharArray();
       Path path1 = path;
       FontData uFontData = font.kerning;
       FontData uFontData1 = font.wordSpacing;
       FontData letterSpacin = font.letterSpacing;
       int i2 = font.manualKerning ^ 0x01;
       StringBuilder str = (!letterSpacin && font.fontVariantLigatures == TextProperties$FontVariantLigatures.normal)? 1: null;
       b1 = Build$VERSION.SDK_INT;
       if (str) {
          paint.setFontFeatureSettings("\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "+font.fontFeatureSettings);
       }else {
          paint.setFontFeatureSettings("\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "+font.fontFeatureSettings);
       }
       if (b1 >= 26) {
          paint.setFontVariationSettings("\'wght\' "+font.absoluteFontWeight+font.fontVariationSettings);
       }
       FontData fontData = font.fontData;
       float[] uofloatArray = new float[i];
       paint.getTextWidths(p0, uofloatArray);
       FontData textAnchor = font.textAnchor;
       PathMeasure pathMeasure2 = pathMeasure1;
       FontData uFontData2 = letterSpacin;
       double subtreeTextC = this.getTextAnchorRoot().getSubtreeTextChunksTotalAdvance(paint);
       double textAnchorOf = tSpanView.getTextAnchorOffset(textAnchor, subtreeTextC);
       double fontSize = textRootGlyp.getFontSize();
       if (i1) {
          b = (tSpanView.textPath.getMidLine() == TextProperties$TextPathMidLine.sharp)? 1: 0;
          FontData uFontData3 = textAnchor;
          i3 = (tSpanView.textPath.getSide() == TextProperties$TextPathSide.right)? -1: 1;
          int i4 = b;
          FontData uFontData4 = uFontData3;
          uobooleanArr1 = uobooleanArr;
          uofloatArray1 = uofloatArray;
          glyphContext = textRootGlyp;
          glyphPathBag1 = glyphPathBag;
          this = this.getAbsoluteStartOffset(tSpanView.textPath.getStartOffset(), d1, fontSize);
          textAnchorOf = textAnchorOf + this;
          if (b2) {
             d2 = d1 / 2.00f;
             d2 = (uFontData4 == TextProperties$TextAnchor.middle)? - d2: 0;
             this = this + d2;
             d2 = this + d1;
          }else {
             d2 = d1;
             this2 = 0;
          }
          i5 = i3;
          i6 = i4;
       }else {
          uobooleanArr1 = uobooleanArr;
          uofloatArray1 = uofloatArray;
          glyphContext = textRootGlyp;
          glyphPathBag1 = glyphPathBag;
          d2 = d1;
          this2 = 0;
          i5 = 1;
          i6 = null;
       }
       double d3 = 0x3ff0000000000000;
       TextView mTextLength = tSpanView.mTextLength;
       double d4 = d1;
       if (mTextLength != null) {
          i7 = i6;
          d5 = this;
          this = PropHelper.fromRelative(mTextLength, (double)p2.getWidth(), 0, (double)tSpanView.mScale, fontSize);
          if (this >= 0) {
             if (TSpanView$1.$SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust[tSpanView.mLengthAdjust.ordinal()] != -0.00f) {
                uFontData2 = uFontData2 + ((this - subtreeTextC) / (double)(i - 1));
             }else {
                d3 = this / subtreeTextC;
             }
          }else {
             throw super("Negative textLength value");
          }
       }else {
          d5 = this;
          i7 = i6;
       }
       this = (double)i5;
       Paint$FontMetrics fontMetrics = p1.getFontMetrics();
       d1 = (double)fontMetrics.descent;
       Paint$FontMetrics leading = fontMetrics.leading;
       double d6 = d3 * this;
       double d7 = (double)leading + d1;
       int i8 = i5;
       double d8 = d2;
       d2 = (double)((- fontMetrics.ascent) + leading);
       double d9 = (double)(- fontMetrics.top);
       double d10 = d9 + d7;
       String baselineShif = this.getBaselineShift();
       TextProperties$AlignmentBaseline alignmentBas = this.getAlignmentBaseline();
       if (alignmentBas != null) {
          switch (TSpanView$1.$SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[alignmentBas.ordinal()]){
              case 2:
              case 4:
              case 6:
              case 3:
                d7 = - d1;
                break;
              case 5:
             label_0202 :
                d7 = 0;
                break;
              case 7:
                Rect rect = new Rect();
                paint.getTextBounds("x", 0, 1, rect);
                d7 = (double)rect.height() / 2.00f;
                break;
              case 8:
                d7 = (d2 - d1) / 2.00f;
                break;
              case 9:
                d9 = 0x3fe0000000000000;
             label_01e3 :
                d7 = d2 * d9;
                break;
              case 10:
                d9 = 0x3fe999999999999a;
                goto label_01e3 ;
                break;
              case 11:
              case 13:
              case 12:
                d7 = d2;
              case 14:
             label_01e9 :
                matrix = null;
                break;
              case 15:
                d7 = d10 / 2.00f;
                goto label_01e9 ;
                break;
              case 16:
                d7 = d9;
                goto label_01e9 ;
                break;
              default:
                goto label_0202 ;
          }
       }else {
          goto label_0202 ;
       }
       if (baselineShif != null && !baselineShif.isEmpty()) {
          i9 = TSpanView$1.$SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[alignmentBas.ordinal()];
          if (i9 != 14 && i9 != 16) {
             switch (baselineShif.hashCode()){
                 case 0x996ee645:
                   if (baselineShif.equals("baseline")) {
                      i9 = 0;
                   }
                   break;
                 case 0x1be40:
                   if (baselineShif.equals("sub")) {
                      i9 = 1;
                   }
                   break;
                 case 0x68b6f7b:
                   if (baselineShif.equals("super")) {
                      i9 = 2;
                   }
                   break;
                 default:
                label_0224 :
                   i9 = -1;
             }
             String str1 = "os2";
             fontMetrics1 = "unitsPerEm";
             String str2 = "tables";
             switch (i9){
                 case 0:
                   break;
                 case 1:
                   if (fontData != null && (fontData.hasKey(str2) && fontData.hasKey(fontMetrics1))) {
                      i9 = fontData.getInt(fontMetrics1);
                      ReadableMap map = fontData.getMap(str2);
                      if (map.hasKey(str1)) {
                         map1 = map.getMap(str1);
                         String str8 = "ySubscriptYOffset";
                         if (map1.hasKey(str8)) {
                            d7 = d7 + ((((double)tSpanView.mScale * fontSize) * map1.getDouble(str8)) / (double)i9);
                         }
                      }
                   }
                   break;
                 case 2:
                   if (fontData != null && (fontData.hasKey(str2) && fontData.hasKey(fontMetrics1))) {
                      i9 = fontData.getInt(fontMetrics1);
                      ReadableMap fontMetrics11 = fontData.getMap(str2);
                      if (fontMetrics11.hasKey(str1)) {
                         map1 = fontMetrics11.getMap(str1);
                         fontMetrics1 = "ySuperscriptYOffset";
                         if (map1.hasKey(fontMetrics1)) {
                            d7 = d7 - ((((double)tSpanView.mScale * fontSize) * map1.getDouble(fontMetrics1)) / (double)i9);
                         }
                      }
                   }
                   break;
                 default:
                   VirtualView mScale = tSpanView.mScale;
                   d7 = d7 - PropHelper.fromRelative(baselineShif, ((double)mScale * fontSize), (double)mScale, fontSize);
             }
          }
       }
       d2 = d7;
       matrix = new Matrix();
       fontMetrics1 = new Matrix();
       Matrix matrix1 = new Matrix();
       int i10 = 9;
       float[] uofloatArray2 = new float[i10];
       float[] uofloatArray3 = new float[i10];
       int i11 = 0;
       while (i11 < i) {
          char c = uocharArray[i11];
          String str3 = String.valueOf(c);
          boolean b3 = uobooleanArr1[i11];
          if (b3) {
             str4 = "";
             i3 = i;
             d11 = 0;
          }else {
             String str7 = str3;
             int i19 = i11;
             d11 = 0;
             i14 = i19 + 1;
             while (i14 < i && uofloatArray1[i14] - null <= 0) {
                str7 = str7+uocharArray[i14];
                uobooleanArr1[i14] = true;
                i19 = i14;
                i = i;
                d11 = Double.MIN_VALUE;
             }
             i3 = i;
             str4 = str7;
          }
          double d12 = (double)paint.measureText(str4) * d3;
          String str5 = str4;
          if (i2) {
             i12 = d11;
             i13 = i11;
             d11 = (double)uofloatArray1[i11] * d3;
             d11 = d11 - d12;
             uFontData = d11;
          }else {
             i12 = d11;
             i13 = i11;
          }
          i14 = (c == ' ')? 1: 0;
          FontData uFontData5 = (i14)? uFontData1: 0;
          d11 = uFontData5 + uFontData2;
          d11 = d11 + d12;
          if (b3) {
             fontSize = d2;
             d2 = 0;
          }else {
             d17 = uFontData + d11;
             fontSize = d2;
             d2 = d17;
          }
          d2 = glyphContext.nextX(d2);
          float[] uofloatArray4 = uofloatArray3;
          float[] uofloatArray5 = uofloatArray2;
          double d13 = glyphContext.nextDeltaX();
          double d14 = glyphContext.nextDeltaY();
          double d15 = glyphContext.nextY();
          d7 = glyphContext.nextRotation();
          if (b3 || i14) {
          label_04f7 :
             i11 = this;
             i15 = p1;
             glyphContext1 = glyphContext;
             uFontData6 = uFontData1;
             pathMeasure3 = pathMeasure2;
             i16 = i3;
             i17 = i13;
             uofloatArray = uofloatArray5;
             uofloatArray6 = uofloatArray4;
             d16 = d6;
             glyphPathBag2 = glyphPathBag1;
             d6 = d4;
             i14 = i8;
             d17 = this;
             this1 = path1;
             matrix2 = matrix1;
          }else {
             d11 = d11 * this;
             d12 = d12 * this;
             d2 = d2 + d13;
             d2 = d2 * this;
             d2 = textAnchorOf + d2;
             d2 = d2 - d11;
             if (i1) {
                d11 = d2 + d12;
                d12 = d12 / 2.00f;
                c1 = c;
                double d18 = d2 + d12;
                if (d18 - d8 > 0 || d18 - d5 < 0) {
                   goto label_04f7 ;
                }else {
                   glyphContext1 = glyphContext;
                   int i18 = 3;
                   if (i7 != null) {
                      PathMeasure pathMeasure4 = pathMeasure2;
                      pathMeasure4.getMatrix((float)d18, fontMetrics1, i18);
                      pathMeasure5 = pathMeasure4;
                      d19 = d7;
                   }else {
                      pathMeasure5 = pathMeasure2;
                      if (d2 < 0) {
                         d19 = d7;
                         float f = 0;
                         pathMeasure5.getMatrix(f, matrix, 3);
                         matrix.preTranslate((float)d2, f);
                         i15 = 1;
                      }else {
                         d19 = d7;
                         i15 = 1;
                         pathMeasure5.getMatrix((float)d2, matrix, i15);
                      }
                      pathMeasure5.getMatrix((float)d18, fontMetrics1, i15);
                      if (d11 - d4 > 0) {
                         d18 = d4;
                         pathMeasure5.getMatrix((float)d18, matrix1, 3);
                         d11 = d11 - d18;
                         matrix1.preTranslate((float)d11, 0);
                      }else {
                         d18 = d4;
                         pathMeasure5.getMatrix((float)d11, matrix1, i15);
                      }
                      uofloatArray2 = uofloatArray5;
                      matrix.getValues(uofloatArray2);
                      float[] uofloatArray7 = uofloatArray4;
                      matrix1.getValues(uofloatArray7);
                      b2 = 5;
                      d4 = d18;
                      uofloatArray5 = uofloatArray2;
                      d7 = (double)uofloatArray7[2] - (double)uofloatArray2[2];
                      d11 = (double)uofloatArray7[b2] - (double)uofloatArray2[b2];
                      d2 = Math.atan2(d11, d7) * 0x404ca5dc1a63c1f8;
                      d2 = d2 * this;
                      fontMetrics1.preRotate((float)d2);
                   }
                   d2 = - d12;
                   d18 = d14 + fontSize;
                   fontMetrics1.preTranslate((float)d2, (float)d18);
                   d7 = d6;
                   i14 = i8;
                   fontMetrics1.preScale((float)d7, (float)i14);
                   fontMetrics1.postTranslate(0, (float)d15);
                }
             }else {
                c1 = c;
                d19 = d7;
                glyphContext1 = glyphContext;
                pathMeasure5 = pathMeasure2;
                d7 = d6;
                i14 = i8;
                d1 = d15 + d14;
                d1 = d1 + fontSize;
                fontMetrics1.setTranslate((float)d2, (float)d1);
             }
             fontMetrics1.preRotate((float)d19);
             if (i12) {
                path2 = new Path();
                d6 = d4;
                pathMeasure3 = pathMeasure5;
                i17 = i13;
                uofloatArray6 = uofloatArray4;
                d16 = d7;
                uFontData6 = uFontData1;
                uofloatArray = uofloatArray5;
                matrix2 = matrix1;
                d17 = this;
                this1 = path1;
                i16 = i3;
                p1.getTextPath(str5, 0, str5.length(), null, 0, path2);
                str6 = str5;
                glyphPathBag3 = glyphPathBag1;
             }else {
                uFontData6 = uFontData1;
                i16 = i3;
                str6 = str5;
                i17 = i13;
                uofloatArray = uofloatArray5;
                d6 = d4;
                d16 = d7;
                pathMeasure3 = pathMeasure5;
                uofloatArray6 = uofloatArray4;
                d17 = this;
                this1 = path1;
                glyphPathBag3 = glyphPathBag1;
                matrix2 = matrix1;
                path2 = glyphPathBag3.getOrCreateAndCache(c1, str6);
             }
             RectF rectF = new RectF();
             path2.computeBounds(rectF, true);
             if (!rectF.width()) {
                p2.save();
                glyphPathBag2 = glyphPathBag3;
                Canvas uCanvas1 = p2;
                uCanvas1.concat(fontMetrics1);
                tSpanView1 = this;
                tSpanView1.emoji.add(str6);
                tSpanView1.emojiTransforms.add(new Matrix(fontMetrics1));
                i15 = p1;
                uCanvas1.drawText(str6, 0, 0, i15);
                p2.restore();
             }else {
                tSpanView1 = this;
                i15 = p1;
                glyphPathBag2 = glyphPathBag3;
                path2.transform(fontMetrics1);
                this1.addPath(path2);
             }
          }
          i9 = i17 + 1;
          uofloatArray2 = uofloatArray;
          i8 = i14;
          glyphPathBag1 = glyphPathBag2;
          tSpanView = i11;
          i = i16;
          matrix1 = matrix2;
          uFontData1 = uFontData6;
          pathMeasure2 = pathMeasure3;
          d4 = d6;
          path1 = this1;
          i11 = i9;
          paint = i15;
          uofloatArray3 = uofloatArray6;
          d6 = d16;
          this = d17;
          d2 = fontSize;
          glyphContext = glyphContext1;
       }
       return path1;
    }
    public Path getPath(Canvas p0,Paint p1){
       TSpanView tmCachedPath = this.mCachedPath;
       if (tmCachedPath != null) {
          return tmCachedPath;
       }
       if (this.mContent == null) {
          Path groupPath = this.getGroupPath(p0, p1);
          this.mCachedPath = groupPath;
          return groupPath;
       }else {
          this.setupTextPath();
          this.pushGlyphContext();
          this.mCachedPath = this.getLinePath(TSpanView.visualToLogical(this.mContent), p1, p0);
          this.popGlyphContext();
          return this.mCachedPath;
       }
    }
    public final StaticLayout getStaticLayout(TextPaint p0,Layout$Alignment p1,boolean p2,SpannableString p3,int p4){
       if (Build$VERSION.SDK_INT >= 23) {
          return StaticLayout$Builder.obtain(p3, 0, p3.length(), p0, p4).setAlignment(p1).setLineSpacing(0, 0x3f800000).setIncludePad(p2).setBreakStrategy(1).setHyphenationFrequency(1).build();
       }
       StaticLayout staticLayout = new StaticLayout(p3, p0, p4, p1, 0x3f800000, 0, p2);
       return v0;
    }
    public double getSubtreeTextChunksTotalAdvance(Paint p0){
       if (!Double.isNaN(this.cachedAdvance)) {
          return this.cachedAdvance;
       }
       TSpanView tmContent = this.mContent;
       double d = 0;
       if (tmContent == null) {
          int i = 0;
          while (i < this.getChildCount()) {
             View childAt = this.getChildAt(i);
             if (childAt instanceof TextView) {
                d = d + childAt.getSubtreeTextChunksTotalAdvance(p0);
             }
             i = i + 1;
          }
          this.cachedAdvance = d;
          return d;
       }else if(!tmContent.length()){
          this.cachedAdvance = d;
          return d;
       }else {
          FontData font = this.getTextRootGlyphContext().getFont();
          this.applyTextPropertiesToPaint(p0, font);
          this.applySpacingAndFeatures(p0, font);
          double d1 = (double)p0.measureText(tmContent);
          this.cachedAdvance = d1;
          return d1;
       }
    }
    public final double getTextAnchorOffset(TextProperties$TextAnchor p0,double p1){
       int i = TSpanView$1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[p0.ordinal()];
       if (i == 2) {
          return ((- p1) / 2.00f);
       }
       if (i != 3) {
          return 0;
       }
       return (- p1);
    }
    public int hitTest(float[] p0){
       if (this.mContent == null) {
          return super.hitTest(p0);
       }
       if (this.mPath == null || (this.mInvertible != null && this.mTransformInvertible != null)) {
          float[] uofloatArray = new float[2];
          this.mInvMatrix.mapPoints(uofloatArray, p0);
          this.mInvTransform.mapPoints(uofloatArray);
          int i = Math.round(uofloatArray[0]);
          int i1 = Math.round(uofloatArray[1]);
          this.initBounds();
          VirtualView tmRegion = this.mRegion;
          if (tmRegion == null || !tmRegion.contains(i, i1)) {
             tmRegion = this.mStrokeRegion;
             if (tmRegion != null && tmRegion.contains(i, i1)) {
             }
          }else if(this.getClipPath() != null && !this.mClipRegion.contains(i, i1)){
             return -1;
          }else {
             return this.getId();
          }
       }
    label_005e :
       return -1;
    }
    public void invalidate(){
       this.mCachedPath = null;
       super.invalidate();
    }
    public void setContent(String p0){
       this.mContent = p0;
       this.invalidate();
    }
    public final void setupTextPath(){
       for (ViewParent parent = this.getParent(); parent != null; parent = parent.getParent()) {
          if (parent.getClass() == TextPathView.class) {
             this.textPath = parent;
             break ;
          }else if(!parent instanceof TextView){
             break ;
          }else {
          }
       }
       return;
    }
}
