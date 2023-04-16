package com.yxcrop.gifshow.v3.editor.text_v3.model.TextBeanQT;
import java.io.Serializable;
import java.lang.Long;
import com.yxcrop.gifshow.v3.editor.text_v3.model.BoxQT;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.text_v3.model.DecorationNinepatchQT;
import com.yxcrop.gifshow.v3.editor.text_v3.model.DrawableBackgroundQT;
import java.lang.String;
import com.yxcrop.gifshow.v3.editor.text_v3.model.FillBackgroundQT;
import com.yxcrop.gifshow.v3.editor.text_v3.model.FillContentQT;
import bod.a;
import java.lang.Double;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v3.model.PerWordImageQT;
import com.yxcrop.gifshow.v3.editor.text_v3.model.ShadowQT;
import com.yxcrop.gifshow.v3.editor.text_v3.model.TextLayerQT;
import com.yxcrop.gifshow.v3.editor.text_v3.model.ShiftQT;
import com.yxcrop.gifshow.v3.editor.text_v3.model.UnderlineConfigQT;
import nsd.u;
import java.lang.Object;

public final class TextBeanQT implements Serializable	// class@000c19
{
    public Long alignType;
    public BoxQT box;
    public List characterColor;
    public List colorgradient;
    public DecorationNinepatchQT decorationNinepatch;
    public DrawableBackgroundQT drawableBackground;
    public String effectSourcePath;
    public Long effectType;
    public FillBackgroundQT fillBackground;
    public FillContentQT fillContent;
    public String fontID;
    public a fontItem;
    public Double freezeFrame;
    public Long fullImageIndex;
    public List fullfileImage;
    public Double gradientDegree;
    public Long gradientIndex;
    public Boolean hideText;
    public List innerShadows;
    public Double italicDegree;
    public Double letterSpace;
    public Double lineSpace;
    public Double loopEnd;
    public Long loopNum;
    public Double loopStart;
    public List multiTextLayer;
    public PerWordImageQT perWordImage;
    public ShadowQT shadow;
    public List shadows;
    public List stroke;
    public String text;
    public Long textBeanQTAlignType;
    public Long textBeanQTTextColorAlpha;
    public String textColor;
    public Long textColorAlpha;
    public List textFieldDecoration;
    public Long textFillBlendMode;
    public Long textFullFillBlendMode;
    public ShiftQT textFullfillBias;
    public TextLayerQT textLayer;
    public Double textSize;
    public Double thickness;
    public String typeFacePath;
    public UnderlineConfigQT underlineConfig;

    public void TextBeanQT(){
       super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4095, null);
    }
    public void TextBeanQT(Long p0,Long p1,BoxQT p2,List p3,List p4,DecorationNinepatchQT p5,DrawableBackgroundQT p6,String p7,Long p8,FillBackgroundQT p9,FillContentQT p10,String p11,a p12,Double p13,List p14,Long p15,Double p16,Long p17,Boolean p18,List p19,Double p20,Double p21,Double p22,Double p23,Long p24,Double p25,List p26,PerWordImageQT p27,ShadowQT p28,List p29,List p30,String p31,String p32,Long p33,TextLayerQT p34,Double p35,Long p36,List p37,Long p38,ShiftQT p39,Long p40,Double p41,String p42,UnderlineConfigQT p43){
       int i = this;
       super();
       i.textBeanQTAlignType = p0;
       i.alignType = p1;
       i.box = p2;
       i.characterColor = p3;
       i.colorgradient = p4;
       i.decorationNinepatch = p5;
       i.drawableBackground = p6;
       i.effectSourcePath = p7;
       i.effectType = p8;
       i.fillBackground = p9;
       i.fillContent = p10;
       i.fontID = p11;
       i.fontItem = p12;
       i.freezeFrame = p13;
       i.fullfileImage = p14;
       i.fullImageIndex = p15;
       i.gradientDegree = p16;
       i.gradientIndex = p17;
       i.hideText = p18;
       i.innerShadows = p19;
       i.italicDegree = p20;
       i.letterSpace = p21;
       i.lineSpace = p22;
       i.loopEnd = p23;
       i.loopNum = p24;
       i.loopStart = p25;
       i.multiTextLayer = p26;
       i.perWordImage = p27;
       i.shadow = p28;
       i.shadows = p29;
       i.stroke = p30;
       i.text = p31;
       i.textColor = p32;
       i.textBeanQTTextColorAlpha = p33;
       i.textLayer = p34;
       i.textSize = p35;
       i.textColorAlpha = p36;
       i.textFieldDecoration = p37;
       i.textFillBlendMode = p38;
       i.textFullfillBias = p39;
       i.textFullFillBlendMode = p40;
       i.thickness = p41;
       i.typeFacePath = p42;
       i.underlineConfig = p43;
    }
    public void TextBeanQT(Long p0,Long p1,BoxQT p2,List p3,List p4,DecorationNinepatchQT p5,DrawableBackgroundQT p6,String p7,Long p8,FillBackgroundQT p9,FillContentQT p10,String p11,a p12,Double p13,List p14,Long p15,Double p16,Long p17,Boolean p18,List p19,Double p20,Double p21,Double p22,Double p23,Long p24,Double p25,List p26,PerWordImageQT p27,ShadowQT p28,List p29,List p30,String p31,String p32,Long p33,TextLayerQT p34,Double p35,Long p36,List p37,Long p38,ShiftQT p39,Long p40,Double p41,String p42,UnderlineConfigQT p43,int p44,int p45,u p46){
       int i = p44;
       int i1 = p45;
       int i2 = (i & 0x01)? 0: p0;
       int i3 = (i & 0x02)? 0: p1;
       int i4 = (i & 0x04)? 0: p2;
       int i5 = (i & 0x08)? 0: p3;
       int i6 = (i & 0x10)? 0: p4;
       int i7 = (i & 0x20)? 0: p5;
       int i8 = (i & 0x40)? 0: p6;
       int i9 = (i & 0x0080)? 0: p7;
       int i10 = (i & 0x0100)? 0: p8;
       int i11 = (i & 0x0200)? 0: p9;
       int i12 = (i & 0x0400)? 0: p10;
       int i13 = (i & 0x0800)? 0: p11;
       int i14 = (i & 0x1000)? 0: p12;
       int i15 = (i & 0x2000)? 0: p13;
       int i16 = i15;
       i15 = (i & 0x4000)? 0: p14;
       int i17 = (i & 0x8000)? 0: p15;
       int i18 = (i & 0x10000)? 0: p16;
       int i19 = (i & 0x20000)? 0: p17;
       int i20 = (i & 0x40000)? 0: p18;
       int i21 = (i & 0x80000)? 0: p19;
       int i22 = (i & 0x100000)? 0: p20;
       int i23 = (i & 0x200000)? 0: p21;
       int i24 = (i & 0x400000)? 0: p22;
       int i25 = (i & Float.MIN_NORMAL)? 0: p23;
       int i26 = (i & 0x1000000)? 0: p24;
       int i27 = (i & 0x2000000)? 0: p25;
       int i28 = (i & 0x4000000)? 0: p26;
       int i29 = (i & 0x8000000)? 0: p27;
       int i30 = (i & 0x10000000)? 0: p28;
       int i31 = (i & 0x20000000)? 0: p29;
       int i32 = (i & 0x40000000)? 0: p30;
       i = (i & Integer.MIN_VALUE)? 0: p31;
       int i33 = (i1 & 0x01)? 0: p32;
       int i34 = (i1 & 0x02)? 0: p33;
       int i35 = (i1 & 0x04)? 0: p34;
       int i36 = (i1 & 0x08)? 0: p35;
       int i37 = (i1 & 0x10)? 0: p36;
       int i38 = (i1 & 0x20)? 0: p37;
       int i39 = (i1 & 0x40)? 0: p38;
       p44 = i;
       i = (i1 & 0x0080)? 0: p39;
       int i40 = i;
       i = (i1 & 0x0100)? 0: p40;
       int i41 = i;
       i = (i1 & 0x0200)? 0: p41;
       int i42 = i;
       i = (i1 & 0x0400)? 0: p42;
       i1 = (i1 & 0x0800)? 0: p43;
       super(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i16, i15, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, p44, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, i, i1);
       return;
    }
    public final Long getAlignType(){
       return this.alignType;
    }
    public final BoxQT getBox(){
       return this.box;
    }
    public final List getCharacterColor(){
       return this.characterColor;
    }
    public final List getColorgradient(){
       return this.colorgradient;
    }
    public final DecorationNinepatchQT getDecorationNinepatch(){
       return this.decorationNinepatch;
    }
    public final DrawableBackgroundQT getDrawableBackground(){
       return this.drawableBackground;
    }
    public final String getEffectSourcePath(){
       return this.effectSourcePath;
    }
    public final Long getEffectType(){
       return this.effectType;
    }
    public final FillBackgroundQT getFillBackground(){
       return this.fillBackground;
    }
    public final FillContentQT getFillContent(){
       return this.fillContent;
    }
    public final String getFontID(){
       return this.fontID;
    }
    public final a getFontItem(){
       return this.fontItem;
    }
    public final Double getFreezeFrame(){
       return this.freezeFrame;
    }
    public final Long getFullImageIndex(){
       return this.fullImageIndex;
    }
    public final List getFullfileImage(){
       return this.fullfileImage;
    }
    public final Double getGradientDegree(){
       return this.gradientDegree;
    }
    public final Long getGradientIndex(){
       return this.gradientIndex;
    }
    public final Boolean getHideText(){
       return this.hideText;
    }
    public final List getInnerShadows(){
       return this.innerShadows;
    }
    public final Double getItalicDegree(){
       return this.italicDegree;
    }
    public final Double getLetterSpace(){
       return this.letterSpace;
    }
    public final Double getLineSpace(){
       return this.lineSpace;
    }
    public final Double getLoopEnd(){
       return this.loopEnd;
    }
    public final Long getLoopNum(){
       return this.loopNum;
    }
    public final Double getLoopStart(){
       return this.loopStart;
    }
    public final List getMultiTextLayer(){
       return this.multiTextLayer;
    }
    public final PerWordImageQT getPerWordImage(){
       return this.perWordImage;
    }
    public final ShadowQT getShadow(){
       return this.shadow;
    }
    public final List getShadows(){
       return this.shadows;
    }
    public final List getStroke(){
       return this.stroke;
    }
    public final String getText(){
       return this.text;
    }
    public final Long getTextBeanQTAlignType(){
       return this.textBeanQTAlignType;
    }
    public final Long getTextBeanQTTextColorAlpha(){
       return this.textBeanQTTextColorAlpha;
    }
    public final String getTextColor(){
       return this.textColor;
    }
    public final Long getTextColorAlpha(){
       return this.textColorAlpha;
    }
    public final List getTextFieldDecoration(){
       return this.textFieldDecoration;
    }
    public final Long getTextFillBlendMode(){
       return this.textFillBlendMode;
    }
    public final Long getTextFullFillBlendMode(){
       return this.textFullFillBlendMode;
    }
    public final ShiftQT getTextFullfillBias(){
       return this.textFullfillBias;
    }
    public final TextLayerQT getTextLayer(){
       return this.textLayer;
    }
    public final Double getTextSize(){
       return this.textSize;
    }
    public final Double getThickness(){
       return this.thickness;
    }
    public final String getTypeFacePath(){
       return this.typeFacePath;
    }
    public final UnderlineConfigQT getUnderlineConfig(){
       return this.underlineConfig;
    }
    public final void setAlignType(Long p0){
       this.alignType = p0;
    }
    public final void setBox(BoxQT p0){
       this.box = p0;
    }
    public final void setCharacterColor(List p0){
       this.characterColor = p0;
    }
    public final void setColorgradient(List p0){
       this.colorgradient = p0;
    }
    public final void setDecorationNinepatch(DecorationNinepatchQT p0){
       this.decorationNinepatch = p0;
    }
    public final void setDrawableBackground(DrawableBackgroundQT p0){
       this.drawableBackground = p0;
    }
    public final void setEffectSourcePath(String p0){
       this.effectSourcePath = p0;
    }
    public final void setEffectType(Long p0){
       this.effectType = p0;
    }
    public final void setFillBackground(FillBackgroundQT p0){
       this.fillBackground = p0;
    }
    public final void setFillContent(FillContentQT p0){
       this.fillContent = p0;
    }
    public final void setFontID(String p0){
       this.fontID = p0;
    }
    public final void setFontItem(a p0){
       this.fontItem = p0;
    }
    public final void setFreezeFrame(Double p0){
       this.freezeFrame = p0;
    }
    public final void setFullImageIndex(Long p0){
       this.fullImageIndex = p0;
    }
    public final void setFullfileImage(List p0){
       this.fullfileImage = p0;
    }
    public final void setGradientDegree(Double p0){
       this.gradientDegree = p0;
    }
    public final void setGradientIndex(Long p0){
       this.gradientIndex = p0;
    }
    public final void setHideText(Boolean p0){
       this.hideText = p0;
    }
    public final void setInnerShadows(List p0){
       this.innerShadows = p0;
    }
    public final void setItalicDegree(Double p0){
       this.italicDegree = p0;
    }
    public final void setLetterSpace(Double p0){
       this.letterSpace = p0;
    }
    public final void setLineSpace(Double p0){
       this.lineSpace = p0;
    }
    public final void setLoopEnd(Double p0){
       this.loopEnd = p0;
    }
    public final void setLoopNum(Long p0){
       this.loopNum = p0;
    }
    public final void setLoopStart(Double p0){
       this.loopStart = p0;
    }
    public final void setMultiTextLayer(List p0){
       this.multiTextLayer = p0;
    }
    public final void setPerWordImage(PerWordImageQT p0){
       this.perWordImage = p0;
    }
    public final void setShadow(ShadowQT p0){
       this.shadow = p0;
    }
    public final void setShadows(List p0){
       this.shadows = p0;
    }
    public final void setStroke(List p0){
       this.stroke = p0;
    }
    public final void setText(String p0){
       this.text = p0;
    }
    public final void setTextBeanQTAlignType(Long p0){
       this.textBeanQTAlignType = p0;
    }
    public final void setTextBeanQTTextColorAlpha(Long p0){
       this.textBeanQTTextColorAlpha = p0;
    }
    public final void setTextColor(String p0){
       this.textColor = p0;
    }
    public final void setTextColorAlpha(Long p0){
       this.textColorAlpha = p0;
    }
    public final void setTextFieldDecoration(List p0){
       this.textFieldDecoration = p0;
    }
    public final void setTextFillBlendMode(Long p0){
       this.textFillBlendMode = p0;
    }
    public final void setTextFullFillBlendMode(Long p0){
       this.textFullFillBlendMode = p0;
    }
    public final void setTextFullfillBias(ShiftQT p0){
       this.textFullfillBias = p0;
    }
    public final void setTextLayer(TextLayerQT p0){
       this.textLayer = p0;
    }
    public final void setTextSize(Double p0){
       this.textSize = p0;
    }
    public final void setThickness(Double p0){
       this.thickness = p0;
    }
    public final void setTypeFacePath(String p0){
       this.typeFacePath = p0;
    }
    public final void setUnderlineConfig(UnderlineConfigQT p0){
       this.underlineConfig = p0;
    }
}
