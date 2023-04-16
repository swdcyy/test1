package com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.g;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.Cover$b;
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
import com.kuaishou.edit.draft.Sticker$b;
import java.lang.Object;
import com.kuaishou.edit.draft.Sticker;
import java.util.Objects;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.Text;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.Cover$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.kuaishou.edit.draft.PictureCoverParam;
import com.kuaishou.edit.draft.ImportCoverParam;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.ImportCoverParamV2;
import com.kuaishou.edit.draft.Cover$ParameterCase;
import com.kuaishou.edit.draft.z;
import com.kuaishou.edit.draft.b0;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.ImportCoverParam$b;
import com.kuaishou.edit.draft.ImportCoverParamV2$b;
import com.kuaishou.edit.draft.PictureCoverParam$b;
import com.kuaishou.edit.draft.VideoCoverParam$b;

public final class Cover extends GeneratedMessageLite implements g	// class@00175d
{
    public Attributes attributes_;
    public ImportCoverParamV2 importCoverParamV2_;
    public String originalFrameFile_;
    public String outputFile_;
    public int parameterCase_;
    public Object parameter_;
    public Internal$ProtobufList stickers_;
    public Internal$ProtobufList texts_;
    public int type_;
    public static final Cover DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       Cover uCover = new Cover();
       Cover.DEFAULT_INSTANCE = uCover;
       GeneratedMessageLite.registerDefaultInstance(Cover.class, uCover);
    }
    public void Cover(){
       super();
       this.parameterCase_ = 0;
       this.texts_ = GeneratedMessageLite.emptyProtobufList();
       this.stickers_ = GeneratedMessageLite.emptyProtobufList();
       this.outputFile_ = "";
       this.originalFrameFile_ = "";
    }
    public static Cover getDefaultInstance(){
       return Cover.DEFAULT_INSTANCE;
    }
    public static Cover$b newBuilder(){
       return Cover.DEFAULT_INSTANCE.createBuilder();
    }
    public static Cover$b newBuilder(Cover p0){
       return Cover.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static Cover parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(Cover.DEFAULT_INSTANCE, p0);
    }
    public static Cover parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(Cover.DEFAULT_INSTANCE, p0, p1);
    }
    public static Cover parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(Cover.DEFAULT_INSTANCE, p0);
    }
    public static Cover parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Cover.DEFAULT_INSTANCE, p0, p1);
    }
    public static Cover parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(Cover.DEFAULT_INSTANCE, p0);
    }
    public static Cover parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Cover.DEFAULT_INSTANCE, p0, p1);
    }
    public static Cover parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(Cover.DEFAULT_INSTANCE, p0);
    }
    public static Cover parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Cover.DEFAULT_INSTANCE, p0, p1);
    }
    public static Cover parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(Cover.DEFAULT_INSTANCE, p0);
    }
    public static Cover parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Cover.DEFAULT_INSTANCE, p0, p1);
    }
    public static Cover parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(Cover.DEFAULT_INSTANCE, p0);
    }
    public static Cover parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(Cover.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return Cover.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllStickers(Iterable p0){
       this.ensureStickersIsMutable();
       AbstractMessageLite.addAll(p0, this.stickers_);
    }
    public void addAllTexts(Iterable p0){
       this.ensureTextsIsMutable();
       AbstractMessageLite.addAll(p0, this.texts_);
    }
    public void addStickers(int p0,Sticker$b p1){
       this.ensureStickersIsMutable();
       this.stickers_.add(p0, p1.build());
    }
    public void addStickers(int p0,Sticker p1){
       Objects.requireNonNull(p1);
       this.ensureStickersIsMutable();
       this.stickers_.add(p0, p1);
    }
    public void addStickers(Sticker$b p0){
       this.ensureStickersIsMutable();
       this.stickers_.add(p0.build());
    }
    public void addStickers(Sticker p0){
       Objects.requireNonNull(p0);
       this.ensureStickersIsMutable();
       this.stickers_.add(p0);
    }
    public void addTexts(int p0,Text$b p1){
       this.ensureTextsIsMutable();
       this.texts_.add(p0, p1.build());
    }
    public void addTexts(int p0,Text p1){
       Objects.requireNonNull(p1);
       this.ensureTextsIsMutable();
       this.texts_.add(p0, p1);
    }
    public void addTexts(Text$b p0){
       this.ensureTextsIsMutable();
       this.texts_.add(p0.build());
    }
    public void addTexts(Text p0){
       Objects.requireNonNull(p0);
       this.ensureTextsIsMutable();
       this.texts_.add(p0);
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearImportCoverParam(){
       if (this.parameterCase_ == 18) {
          this.parameterCase_ = 0;
          this.parameter_ = null;
       }
       return;
    }
    public void clearImportCoverParamV2(){
       this.importCoverParamV2_ = null;
    }
    public void clearOriginalFrameFile(){
       this.originalFrameFile_ = Cover.getDefaultInstance().getOriginalFrameFile();
    }
    public void clearOutputFile(){
       this.outputFile_ = Cover.getDefaultInstance().getOutputFile();
    }
    public void clearParameter(){
       this.parameterCase_ = 0;
       this.parameter_ = null;
    }
    public void clearPictureCoverParam(){
       if (this.parameterCase_ == 17) {
          this.parameterCase_ = 0;
          this.parameter_ = null;
       }
       return;
    }
    public void clearStickers(){
       this.stickers_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearTexts(){
       this.texts_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearType(){
       this.type_ = 0;
    }
    public void clearVideoCoverParam(){
       if (this.parameterCase_ == 16) {
          this.parameterCase_ = 0;
          this.parameter_ = null;
       }
       return;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (Cover$a.a[p0.ordinal()]){
           case 1:
             return new Cover();
           case 2:
             return new Cover$b(p2);
           case 3:
             Object[] objArray = new Object[14];
             objArray[0] = "parameter_";
             objArray[i] = "parameterCase_";
             objArray[2] = "type_";
             objArray[3] = "attributes_";
             objArray[4] = "texts_";
             objArray[5] = Text.class;
             objArray[6] = "stickers_";
             objArray[7] = Sticker.class;
             objArray[8] = VideoCoverParam.class;
             objArray[9] = PictureCoverParam.class;
             objArray[10] = ImportCoverParam.class;
             objArray[11] = "outputFile_";
             objArray[12] = "originalFrameFile_";
             objArray[13] = "importCoverParamV2_";
             return GeneratedMessageLite.newMessageInfo(Cover.DEFAULT_INSTANCE, "\xff\x02\xff\x02\n\x01\xff\x02\xff\x02\x01f\n\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\f\x02\t\x03\x1b\x04\x1b\x10<\xff\x02\xff\x02\x11<\xff\x02\xff\x02\x12<\xff\x02\xff\x02d\x02\x02e\x02\x02f\t\x00", objArray);
           case 4:
             return Cover.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = Cover.PARSER;
             if (pARSER == null) {
                _monitor_enter(Cover.class);
                pARSER = Cover.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(Cover.DEFAULT_INSTANCE);
                   Cover.PARSER = pARSER;
                }
                _monitor_exit(Cover.class);
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
    public final void ensureStickersIsMutable(){
       if (!this.stickers_.isModifiable()) {
          this.stickers_ = GeneratedMessageLite.mutableCopy(this.stickers_);
       }
       return;
    }
    public final void ensureTextsIsMutable(){
       if (!this.texts_.isModifiable()) {
          this.texts_ = GeneratedMessageLite.mutableCopy(this.texts_);
       }
       return;
    }
    public Attributes getAttributes(){
       Cover tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public ImportCoverParam getImportCoverParam(){
       if (this.parameterCase_ == 18) {
          return this.parameter_;
       }
       return ImportCoverParam.getDefaultInstance();
    }
    public ImportCoverParamV2 getImportCoverParamV2(){
       Cover timportCover = this.importCoverParamV2_;
       if (timportCover == null) {
          timportCover = ImportCoverParamV2.getDefaultInstance();
       }
       return timportCover;
    }
    public String getOriginalFrameFile(){
       return this.originalFrameFile_;
    }
    public ByteString getOriginalFrameFileBytes(){
       return ByteString.copyFromUtf8(this.originalFrameFile_);
    }
    public String getOutputFile(){
       return this.outputFile_;
    }
    public ByteString getOutputFileBytes(){
       return ByteString.copyFromUtf8(this.outputFile_);
    }
    public Cover$ParameterCase getParameterCase(){
       return Cover$ParameterCase.forNumber(this.parameterCase_);
    }
    public PictureCoverParam getPictureCoverParam(){
       if (this.parameterCase_ == 17) {
          return this.parameter_;
       }
       return PictureCoverParam.getDefaultInstance();
    }
    public Sticker getStickers(int p0){
       return this.stickers_.get(p0);
    }
    public int getStickersCount(){
       return this.stickers_.size();
    }
    public List getStickersList(){
       return this.stickers_;
    }
    public z getStickersOrBuilder(int p0){
       return this.stickers_.get(p0);
    }
    public List getStickersOrBuilderList(){
       return this.stickers_;
    }
    public Text getTexts(int p0){
       return this.texts_.get(p0);
    }
    public int getTextsCount(){
       return this.texts_.size();
    }
    public List getTextsList(){
       return this.texts_;
    }
    public b0 getTextsOrBuilder(int p0){
       return this.texts_.get(p0);
    }
    public List getTextsOrBuilderList(){
       return this.texts_;
    }
    public Cover$Type getType(){
       Cover$Type type = Cover$Type.forNumber(this.type_);
       if (type == null) {
          type = Cover$Type.UNRECOGNIZED;
       }
       return type;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public VideoCoverParam getVideoCoverParam(){
       if (this.parameterCase_ == 16) {
          return this.parameter_;
       }
       return VideoCoverParam.getDefaultInstance();
    }
    public boolean hasAttributes(){
       boolean b = (this.attributes_ != null)? true: false;
       return b;
    }
    public boolean hasImportCoverParam(){
       boolean b = (this.parameterCase_ == 18)? true: false;
       return b;
    }
    public boolean hasImportCoverParamV2(){
       boolean b = (this.importCoverParamV2_ != null)? true: false;
       return b;
    }
    public boolean hasPictureCoverParam(){
       boolean b = (this.parameterCase_ == 17)? true: false;
       return b;
    }
    public boolean hasVideoCoverParam(){
       boolean b = (this.parameterCase_ == 16)? true: false;
       return b;
    }
    public void mergeAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       Cover tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeImportCoverParam(ImportCoverParam p0){
       Objects.requireNonNull(p0);
       this.parameter_ = (this.parameterCase_ == 18 && this.parameter_ != ImportCoverParam.getDefaultInstance())? ImportCoverParam.newBuilder(this.parameter_).mergeFrom(p0).buildPartial(): p0;
       this.parameterCase_ = 18;
       return;
    }
    public void mergeImportCoverParamV2(ImportCoverParamV2 p0){
       Objects.requireNonNull(p0);
       Cover timportCover = this.importCoverParamV2_;
       this.importCoverParamV2_ = (timportCover != null && timportCover != ImportCoverParamV2.getDefaultInstance())? ImportCoverParamV2.newBuilder(this.importCoverParamV2_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergePictureCoverParam(PictureCoverParam p0){
       Objects.requireNonNull(p0);
       this.parameter_ = (this.parameterCase_ == 17 && this.parameter_ != PictureCoverParam.getDefaultInstance())? PictureCoverParam.newBuilder(this.parameter_).mergeFrom(p0).buildPartial(): p0;
       this.parameterCase_ = 17;
       return;
    }
    public void mergeVideoCoverParam(VideoCoverParam p0){
       Objects.requireNonNull(p0);
       this.parameter_ = (this.parameterCase_ == 16 && this.parameter_ != VideoCoverParam.getDefaultInstance())? VideoCoverParam.newBuilder(this.parameter_).mergeFrom(p0).buildPartial(): p0;
       this.parameterCase_ = 16;
       return;
    }
    public void removeStickers(int p0){
       this.ensureStickersIsMutable();
       this.stickers_.remove(p0);
    }
    public void removeTexts(int p0){
       this.ensureTextsIsMutable();
       this.texts_.remove(p0);
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setImportCoverParam(ImportCoverParam$b p0){
       this.parameter_ = p0.build();
       this.parameterCase_ = 18;
    }
    public void setImportCoverParam(ImportCoverParam p0){
       Objects.requireNonNull(p0);
       this.parameter_ = p0;
       this.parameterCase_ = 18;
    }
    public void setImportCoverParamV2(ImportCoverParamV2$b p0){
       this.importCoverParamV2_ = p0.build();
    }
    public void setImportCoverParamV2(ImportCoverParamV2 p0){
       Objects.requireNonNull(p0);
       this.importCoverParamV2_ = p0;
    }
    public void setOriginalFrameFile(String p0){
       Objects.requireNonNull(p0);
       this.originalFrameFile_ = p0;
    }
    public void setOriginalFrameFileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.originalFrameFile_ = p0.toStringUtf8();
    }
    public void setOutputFile(String p0){
       Objects.requireNonNull(p0);
       this.outputFile_ = p0;
    }
    public void setOutputFileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.outputFile_ = p0.toStringUtf8();
    }
    public void setPictureCoverParam(PictureCoverParam$b p0){
       this.parameter_ = p0.build();
       this.parameterCase_ = 17;
    }
    public void setPictureCoverParam(PictureCoverParam p0){
       Objects.requireNonNull(p0);
       this.parameter_ = p0;
       this.parameterCase_ = 17;
    }
    public void setStickers(int p0,Sticker$b p1){
       this.ensureStickersIsMutable();
       this.stickers_.set(p0, p1.build());
    }
    public void setStickers(int p0,Sticker p1){
       Objects.requireNonNull(p1);
       this.ensureStickersIsMutable();
       this.stickers_.set(p0, p1);
    }
    public void setTexts(int p0,Text$b p1){
       this.ensureTextsIsMutable();
       this.texts_.set(p0, p1.build());
    }
    public void setTexts(int p0,Text p1){
       Objects.requireNonNull(p1);
       this.ensureTextsIsMutable();
       this.texts_.set(p0, p1);
    }
    public void setType(Cover$Type p0){
       Objects.requireNonNull(p0);
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
    public void setVideoCoverParam(VideoCoverParam$b p0){
       this.parameter_ = p0.build();
       this.parameterCase_ = 16;
    }
    public void setVideoCoverParam(VideoCoverParam p0){
       Objects.requireNonNull(p0);
       this.parameter_ = p0;
       this.parameterCase_ = 16;
    }
}
