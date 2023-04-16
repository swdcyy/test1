package com.kuaishou.edit.draft.EditLyric;
import z30.z;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.EditLyric$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.edit.draft.Url$b;
import com.kuaishou.edit.draft.Url;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.EditLyric$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.Attributes;
import z30.p2;
import com.kuaishou.edit.draft.a0;
import com.kuaishou.edit.draft.Attributes$b;

public final class EditLyric extends GeneratedMessageLite implements z	// class@00177b
{
    public boolean aeRender_;
    public double animateInRatio_;
    public String animateInputPath_;
    public double animateOutRatio_;
    public String animateOutputPath_;
    public Attributes attributes_;
    public String fontFilePath_;
    public String fontName_;
    public Internal$ProtobufList lyricTexts_;
    public String lyricsFile_;
    public Internal$ProtobufList mmuLrcUrls_;
    public Internal$ProtobufList stickerResults_;
    public String styleId_;
    public double textRangeRatio_;
    public String textStylePath_;
    public static final EditLyric DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EditLyric uEditLyric = new EditLyric();
       EditLyric.DEFAULT_INSTANCE = uEditLyric;
       GeneratedMessageLite.registerDefaultInstance(EditLyric.class, uEditLyric);
    }
    public void EditLyric(){
       super();
       this.styleId_ = "";
       this.stickerResults_ = GeneratedMessageLite.emptyProtobufList();
       this.lyricsFile_ = "";
       this.mmuLrcUrls_ = GeneratedMessageLite.emptyProtobufList();
       this.fontName_ = "";
       this.animateInputPath_ = "";
       this.animateOutputPath_ = "";
       this.textStylePath_ = "";
       this.fontFilePath_ = "";
       this.lyricTexts_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static EditLyric getDefaultInstance(){
       return EditLyric.DEFAULT_INSTANCE;
    }
    public static EditLyric$b newBuilder(){
       return EditLyric.DEFAULT_INSTANCE.createBuilder();
    }
    public static EditLyric$b newBuilder(EditLyric p0){
       return EditLyric.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EditLyric parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EditLyric.DEFAULT_INSTANCE, p0);
    }
    public static EditLyric parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EditLyric.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditLyric parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EditLyric.DEFAULT_INSTANCE, p0);
    }
    public static EditLyric parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditLyric.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditLyric parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EditLyric.DEFAULT_INSTANCE, p0);
    }
    public static EditLyric parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditLyric.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditLyric parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EditLyric.DEFAULT_INSTANCE, p0);
    }
    public static EditLyric parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditLyric.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditLyric parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EditLyric.DEFAULT_INSTANCE, p0);
    }
    public static EditLyric parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditLyric.DEFAULT_INSTANCE, p0, p1);
    }
    public static EditLyric parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EditLyric.DEFAULT_INSTANCE, p0);
    }
    public static EditLyric parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EditLyric.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EditLyric.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllLyricTexts(Iterable p0){
       this.ensureLyricTextsIsMutable();
       AbstractMessageLite.addAll(p0, this.lyricTexts_);
    }
    public void addAllMmuLrcUrls(Iterable p0){
       this.ensureMmuLrcUrlsIsMutable();
       AbstractMessageLite.addAll(p0, this.mmuLrcUrls_);
    }
    public void addAllStickerResults(Iterable p0){
       this.ensureStickerResultsIsMutable();
       AbstractMessageLite.addAll(p0, this.stickerResults_);
    }
    public void addLyricTexts(String p0){
       Objects.requireNonNull(p0);
       this.ensureLyricTextsIsMutable();
       this.lyricTexts_.add(p0);
    }
    public void addLyricTextsBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureLyricTextsIsMutable();
       this.lyricTexts_.add(p0.toStringUtf8());
    }
    public void addMmuLrcUrls(int p0,Url$b p1){
       this.ensureMmuLrcUrlsIsMutable();
       this.mmuLrcUrls_.add(p0, p1.build());
    }
    public void addMmuLrcUrls(int p0,Url p1){
       Objects.requireNonNull(p1);
       this.ensureMmuLrcUrlsIsMutable();
       this.mmuLrcUrls_.add(p0, p1);
    }
    public void addMmuLrcUrls(Url$b p0){
       this.ensureMmuLrcUrlsIsMutable();
       this.mmuLrcUrls_.add(p0.build());
    }
    public void addMmuLrcUrls(Url p0){
       Objects.requireNonNull(p0);
       this.ensureMmuLrcUrlsIsMutable();
       this.mmuLrcUrls_.add(p0);
    }
    public void addStickerResults(int p0,StickerResult$b p1){
       this.ensureStickerResultsIsMutable();
       this.stickerResults_.add(p0, p1.build());
    }
    public void addStickerResults(int p0,StickerResult p1){
       Objects.requireNonNull(p1);
       this.ensureStickerResultsIsMutable();
       this.stickerResults_.add(p0, p1);
    }
    public void addStickerResults(StickerResult$b p0){
       this.ensureStickerResultsIsMutable();
       this.stickerResults_.add(p0.build());
    }
    public void addStickerResults(StickerResult p0){
       Objects.requireNonNull(p0);
       this.ensureStickerResultsIsMutable();
       this.stickerResults_.add(p0);
    }
    public void clearAeRender(){
       this.aeRender_ = false;
    }
    public void clearAnimateInRatio(){
       this.animateInRatio_ = 0;
    }
    public void clearAnimateInputPath(){
       this.animateInputPath_ = EditLyric.getDefaultInstance().getAnimateInputPath();
    }
    public void clearAnimateOutRatio(){
       this.animateOutRatio_ = 0;
    }
    public void clearAnimateOutputPath(){
       this.animateOutputPath_ = EditLyric.getDefaultInstance().getAnimateOutputPath();
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearFontFilePath(){
       this.fontFilePath_ = EditLyric.getDefaultInstance().getFontFilePath();
    }
    public void clearFontName(){
       this.fontName_ = EditLyric.getDefaultInstance().getFontName();
    }
    public void clearLyricTexts(){
       this.lyricTexts_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearLyricsFile(){
       this.lyricsFile_ = EditLyric.getDefaultInstance().getLyricsFile();
    }
    public void clearMmuLrcUrls(){
       this.mmuLrcUrls_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearStickerResults(){
       this.stickerResults_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearStyleId(){
       this.styleId_ = EditLyric.getDefaultInstance().getStyleId();
    }
    public void clearTextRangeRatio(){
       this.textRangeRatio_ = 0;
    }
    public void clearTextStylePath(){
       this.textStylePath_ = EditLyric.getDefaultInstance().getTextStylePath();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EditLyric$a.a[p0.ordinal()]){
           case 1:
             return new EditLyric();
           case 2:
             return new EditLyric$b(p2);
           case 3:
             Object[] objArray = new Object[17];
             objArray[0] = "styleId_";
             objArray[i] = "attributes_";
             objArray[2] = "stickerResults_";
             objArray[3] = StickerResult.class;
             objArray[4] = "lyricsFile_";
             objArray[5] = "mmuLrcUrls_";
             objArray[6] = Url.class;
             objArray[7] = "fontName_";
             objArray[8] = "animateInputPath_";
             objArray[9] = "animateOutputPath_";
             objArray[10] = "textStylePath_";
             objArray[11] = "fontFilePath_";
             objArray[12] = "aeRender_";
             objArray[13] = "animateInRatio_";
             objArray[14] = "animateOutRatio_";
             objArray[15] = "lyricTexts_";
             objArray[16] = "textRangeRatio_";
             return GeneratedMessageLite.newMessageInfo(EditLyric.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0f\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0f\x0f\xff\x02\xff\x02\x03\xff\x02\xff\x02\x01\x02\x02\x02\t\x03\x1b\x04\x02\x02\x05\x1b\x06\x02\x02\x07\x02\x02\b\x02\x02\t\x02\x02\n\x02\x02\x0b\x07\f\xff\x02\xff\x02\r\xff\x02\xff\x02\x0e\x02\x02\x0f\xff\x02\xff\x02\x00", objArray);
           case 4:
             return EditLyric.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EditLyric.PARSER;
             if (pARSER == null) {
                _monitor_enter(EditLyric.class);
                pARSER = EditLyric.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EditLyric.DEFAULT_INSTANCE);
                   EditLyric.PARSER = pARSER;
                }
                _monitor_exit(EditLyric.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureLyricTextsIsMutable(){
       if (!this.lyricTexts_.isModifiable()) {
          this.lyricTexts_ = GeneratedMessageLite.mutableCopy(this.lyricTexts_);
       }
       return;
    }
    public final void ensureMmuLrcUrlsIsMutable(){
       if (!this.mmuLrcUrls_.isModifiable()) {
          this.mmuLrcUrls_ = GeneratedMessageLite.mutableCopy(this.mmuLrcUrls_);
       }
       return;
    }
    public final void ensureStickerResultsIsMutable(){
       if (!this.stickerResults_.isModifiable()) {
          this.stickerResults_ = GeneratedMessageLite.mutableCopy(this.stickerResults_);
       }
       return;
    }
    public boolean getAeRender(){
       return this.aeRender_;
    }
    public double getAnimateInRatio(){
       return this.animateInRatio_;
    }
    public String getAnimateInputPath(){
       return this.animateInputPath_;
    }
    public ByteString getAnimateInputPathBytes(){
       return ByteString.copyFromUtf8(this.animateInputPath_);
    }
    public double getAnimateOutRatio(){
       return this.animateOutRatio_;
    }
    public String getAnimateOutputPath(){
       return this.animateOutputPath_;
    }
    public ByteString getAnimateOutputPathBytes(){
       return ByteString.copyFromUtf8(this.animateOutputPath_);
    }
    public Attributes getAttributes(){
       EditLyric tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public String getFontFilePath(){
       return this.fontFilePath_;
    }
    public ByteString getFontFilePathBytes(){
       return ByteString.copyFromUtf8(this.fontFilePath_);
    }
    public String getFontName(){
       return this.fontName_;
    }
    public ByteString getFontNameBytes(){
       return ByteString.copyFromUtf8(this.fontName_);
    }
    public String getLyricTexts(int p0){
       return this.lyricTexts_.get(p0);
    }
    public ByteString getLyricTextsBytes(int p0){
       return ByteString.copyFromUtf8(this.lyricTexts_.get(p0));
    }
    public int getLyricTextsCount(){
       return this.lyricTexts_.size();
    }
    public List getLyricTextsList(){
       return this.lyricTexts_;
    }
    public String getLyricsFile(){
       return this.lyricsFile_;
    }
    public ByteString getLyricsFileBytes(){
       return ByteString.copyFromUtf8(this.lyricsFile_);
    }
    public Url getMmuLrcUrls(int p0){
       return this.mmuLrcUrls_.get(p0);
    }
    public int getMmuLrcUrlsCount(){
       return this.mmuLrcUrls_.size();
    }
    public List getMmuLrcUrlsList(){
       return this.mmuLrcUrls_;
    }
    public p2 getMmuLrcUrlsOrBuilder(int p0){
       return this.mmuLrcUrls_.get(p0);
    }
    public List getMmuLrcUrlsOrBuilderList(){
       return this.mmuLrcUrls_;
    }
    public StickerResult getStickerResults(int p0){
       return this.stickerResults_.get(p0);
    }
    public int getStickerResultsCount(){
       return this.stickerResults_.size();
    }
    public List getStickerResultsList(){
       return this.stickerResults_;
    }
    public a0 getStickerResultsOrBuilder(int p0){
       return this.stickerResults_.get(p0);
    }
    public List getStickerResultsOrBuilderList(){
       return this.stickerResults_;
    }
    public String getStyleId(){
       return this.styleId_;
    }
    public ByteString getStyleIdBytes(){
       return ByteString.copyFromUtf8(this.styleId_);
    }
    public double getTextRangeRatio(){
       return this.textRangeRatio_;
    }
    public String getTextStylePath(){
       return this.textStylePath_;
    }
    public ByteString getTextStylePathBytes(){
       return ByteString.copyFromUtf8(this.textStylePath_);
    }
    public boolean hasAttributes(){
       boolean b = (this.attributes_ != null)? true: false;
       return b;
    }
    public void mergeAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       EditLyric tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeMmuLrcUrls(int p0){
       this.ensureMmuLrcUrlsIsMutable();
       this.mmuLrcUrls_.remove(p0);
    }
    public void removeStickerResults(int p0){
       this.ensureStickerResultsIsMutable();
       this.stickerResults_.remove(p0);
    }
    public void setAeRender(boolean p0){
       this.aeRender_ = p0;
    }
    public void setAnimateInRatio(double p0){
       this.animateInRatio_ = p0;
    }
    public void setAnimateInputPath(String p0){
       Objects.requireNonNull(p0);
       this.animateInputPath_ = p0;
    }
    public void setAnimateInputPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.animateInputPath_ = p0.toStringUtf8();
    }
    public void setAnimateOutRatio(double p0){
       this.animateOutRatio_ = p0;
    }
    public void setAnimateOutputPath(String p0){
       Objects.requireNonNull(p0);
       this.animateOutputPath_ = p0;
    }
    public void setAnimateOutputPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.animateOutputPath_ = p0.toStringUtf8();
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setFontFilePath(String p0){
       Objects.requireNonNull(p0);
       this.fontFilePath_ = p0;
    }
    public void setFontFilePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.fontFilePath_ = p0.toStringUtf8();
    }
    public void setFontName(String p0){
       Objects.requireNonNull(p0);
       this.fontName_ = p0;
    }
    public void setFontNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.fontName_ = p0.toStringUtf8();
    }
    public void setLyricTexts(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureLyricTextsIsMutable();
       this.lyricTexts_.set(p0, p1);
    }
    public void setLyricsFile(String p0){
       Objects.requireNonNull(p0);
       this.lyricsFile_ = p0;
    }
    public void setLyricsFileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.lyricsFile_ = p0.toStringUtf8();
    }
    public void setMmuLrcUrls(int p0,Url$b p1){
       this.ensureMmuLrcUrlsIsMutable();
       this.mmuLrcUrls_.set(p0, p1.build());
    }
    public void setMmuLrcUrls(int p0,Url p1){
       Objects.requireNonNull(p1);
       this.ensureMmuLrcUrlsIsMutable();
       this.mmuLrcUrls_.set(p0, p1);
    }
    public void setStickerResults(int p0,StickerResult$b p1){
       this.ensureStickerResultsIsMutable();
       this.stickerResults_.set(p0, p1.build());
    }
    public void setStickerResults(int p0,StickerResult p1){
       Objects.requireNonNull(p1);
       this.ensureStickerResultsIsMutable();
       this.stickerResults_.set(p0, p1);
    }
    public void setStyleId(String p0){
       Objects.requireNonNull(p0);
       this.styleId_ = p0;
    }
    public void setStyleIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.styleId_ = p0.toStringUtf8();
    }
    public void setTextRangeRatio(double p0){
       this.textRangeRatio_ = p0;
    }
    public void setTextStylePath(String p0){
       Objects.requireNonNull(p0);
       this.textStylePath_ = p0;
    }
    public void setTextStylePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.textStylePath_ = p0.toStringUtf8();
    }
}
