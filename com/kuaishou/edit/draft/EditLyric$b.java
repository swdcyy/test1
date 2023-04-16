package com.kuaishou.edit.draft.EditLyric$b;
import z30.z;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.EditLyric;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.EditLyric$a;
import java.lang.String;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.Attributes;
import java.util.List;
import java.util.Collections;
import com.kuaishou.edit.draft.Url;
import com.kuaishou.edit.draft.StickerResult$b;

public final class EditLyric$b extends GeneratedMessageLite$Builder implements z	// class@00177a
{

    public void EditLyric$b(){
       super(EditLyric.DEFAULT_INSTANCE);
    }
    public void EditLyric$b(EditLyric$a p0){
       super(EditLyric.DEFAULT_INSTANCE);
    }
    public EditLyric$b a(String p0){
       this.copyOnWrite();
       this.instance.addLyricTexts(p0);
       return this;
    }
    public EditLyric$b b(StickerResult p0){
       this.copyOnWrite();
       this.instance.addStickerResults(p0);
       return this;
    }
    public EditLyric$b c(){
       this.copyOnWrite();
       this.instance.clearLyricTexts();
       return this;
    }
    public EditLyric$b d(){
       this.copyOnWrite();
       this.instance.clearStickerResults();
       return this;
    }
    public EditLyric$b e(boolean p0){
       this.copyOnWrite();
       this.instance.setAeRender(p0);
       return this;
    }
    public EditLyric$b f(double p0){
       this.copyOnWrite();
       this.instance.setAnimateInRatio(p0);
       return this;
    }
    public EditLyric$b g(String p0){
       this.copyOnWrite();
       this.instance.setAnimateInputPath(p0);
       return this;
    }
    public boolean getAeRender(){
       return this.instance.getAeRender();
    }
    public double getAnimateInRatio(){
       return this.instance.getAnimateInRatio();
    }
    public String getAnimateInputPath(){
       return this.instance.getAnimateInputPath();
    }
    public ByteString getAnimateInputPathBytes(){
       return this.instance.getAnimateInputPathBytes();
    }
    public double getAnimateOutRatio(){
       return this.instance.getAnimateOutRatio();
    }
    public String getAnimateOutputPath(){
       return this.instance.getAnimateOutputPath();
    }
    public ByteString getAnimateOutputPathBytes(){
       return this.instance.getAnimateOutputPathBytes();
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public String getFontFilePath(){
       return this.instance.getFontFilePath();
    }
    public ByteString getFontFilePathBytes(){
       return this.instance.getFontFilePathBytes();
    }
    public String getFontName(){
       return this.instance.getFontName();
    }
    public ByteString getFontNameBytes(){
       return this.instance.getFontNameBytes();
    }
    public String getLyricTexts(int p0){
       return this.instance.getLyricTexts(p0);
    }
    public ByteString getLyricTextsBytes(int p0){
       return this.instance.getLyricTextsBytes(p0);
    }
    public int getLyricTextsCount(){
       return this.instance.getLyricTextsCount();
    }
    public List getLyricTextsList(){
       return Collections.unmodifiableList(this.instance.getLyricTextsList());
    }
    public String getLyricsFile(){
       return this.instance.getLyricsFile();
    }
    public ByteString getLyricsFileBytes(){
       return this.instance.getLyricsFileBytes();
    }
    public Url getMmuLrcUrls(int p0){
       return this.instance.getMmuLrcUrls(p0);
    }
    public int getMmuLrcUrlsCount(){
       return this.instance.getMmuLrcUrlsCount();
    }
    public List getMmuLrcUrlsList(){
       return Collections.unmodifiableList(this.instance.getMmuLrcUrlsList());
    }
    public StickerResult getStickerResults(int p0){
       return this.instance.getStickerResults(p0);
    }
    public int getStickerResultsCount(){
       return this.instance.getStickerResultsCount();
    }
    public List getStickerResultsList(){
       return Collections.unmodifiableList(this.instance.getStickerResultsList());
    }
    public String getStyleId(){
       return this.instance.getStyleId();
    }
    public ByteString getStyleIdBytes(){
       return this.instance.getStyleIdBytes();
    }
    public double getTextRangeRatio(){
       return this.instance.getTextRangeRatio();
    }
    public String getTextStylePath(){
       return this.instance.getTextStylePath();
    }
    public ByteString getTextStylePathBytes(){
       return this.instance.getTextStylePathBytes();
    }
    public EditLyric$b h(double p0){
       this.copyOnWrite();
       this.instance.setAnimateOutRatio(p0);
       return this;
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public EditLyric$b i(String p0){
       this.copyOnWrite();
       this.instance.setAnimateOutputPath(p0);
       return this;
    }
    public EditLyric$b j(Attributes p0){
       this.copyOnWrite();
       this.instance.setAttributes(p0);
       return this;
    }
    public EditLyric$b k(String p0){
       this.copyOnWrite();
       this.instance.setFontFilePath(p0);
       return this;
    }
    public EditLyric$b l(int p0,StickerResult$b p1){
       this.copyOnWrite();
       this.instance.setStickerResults(p0, p1);
       return this;
    }
    public EditLyric$b m(double p0){
       this.copyOnWrite();
       this.instance.setTextRangeRatio(p0);
       return this;
    }
    public EditLyric$b n(String p0){
       this.copyOnWrite();
       this.instance.setTextStylePath(p0);
       return this;
    }
}
