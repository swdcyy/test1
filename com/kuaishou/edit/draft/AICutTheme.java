package com.kuaishou.edit.draft.AICutTheme;
import com.kuaishou.edit.draft.b;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.edit.draft.AICutTheme$b;
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
import com.kuaishou.edit.draft.Music$b;
import java.lang.Object;
import com.kuaishou.edit.draft.Music;
import java.util.Objects;
import com.kuaishou.edit.draft.RecommendStyle$b;
import com.kuaishou.edit.draft.RecommendStyle;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kuaishou.edit.draft.AICutTheme$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.AICutTheme$DpiType;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.m;
import z30.q1;
import com.kuaishou.edit.draft.Attributes$b;
import com.kuaishou.edit.draft.FeatureId$b;

public final class AICutTheme extends GeneratedMessageLite implements b	// class@0016fc
{
    public Attributes attributes_;
    public String checksum_;
    public String color_;
    public String coverFile_;
    public String directory_;
    public int dpi_;
    public FeatureId featureId_;
    public boolean isRecommend_;
    public Internal$ProtobufList musics_;
    public String name_;
    public Internal$ProtobufList newRecommendStyle_;
    public Internal$ProtobufList recommendStyle_;
    public String sceneResult_;
    public long seed_;
    public Music selectedMusic_;
    public Internal$ProtobufList visionEngineResult_;
    public static final AICutTheme DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AICutTheme uAICutTheme = new AICutTheme();
       AICutTheme.DEFAULT_INSTANCE = uAICutTheme;
       GeneratedMessageLite.registerDefaultInstance(AICutTheme.class, uAICutTheme);
    }
    public void AICutTheme(){
       super();
       this.musics_ = GeneratedMessageLite.emptyProtobufList();
       this.name_ = "";
       this.coverFile_ = "";
       this.color_ = "";
       this.checksum_ = "";
       this.directory_ = "";
       this.recommendStyle_ = GeneratedMessageLite.emptyProtobufList();
       this.newRecommendStyle_ = GeneratedMessageLite.emptyProtobufList();
       this.visionEngineResult_ = GeneratedMessageLite.emptyProtobufList();
       this.sceneResult_ = "";
    }
    public static AICutTheme getDefaultInstance(){
       return AICutTheme.DEFAULT_INSTANCE;
    }
    public static AICutTheme$b newBuilder(){
       return AICutTheme.DEFAULT_INSTANCE.createBuilder();
    }
    public static AICutTheme$b newBuilder(AICutTheme p0){
       return AICutTheme.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AICutTheme parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AICutTheme.DEFAULT_INSTANCE, p0);
    }
    public static AICutTheme parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AICutTheme.DEFAULT_INSTANCE, p0, p1);
    }
    public static AICutTheme parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AICutTheme.DEFAULT_INSTANCE, p0);
    }
    public static AICutTheme parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AICutTheme.DEFAULT_INSTANCE, p0, p1);
    }
    public static AICutTheme parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AICutTheme.DEFAULT_INSTANCE, p0);
    }
    public static AICutTheme parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AICutTheme.DEFAULT_INSTANCE, p0, p1);
    }
    public static AICutTheme parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AICutTheme.DEFAULT_INSTANCE, p0);
    }
    public static AICutTheme parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AICutTheme.DEFAULT_INSTANCE, p0, p1);
    }
    public static AICutTheme parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AICutTheme.DEFAULT_INSTANCE, p0);
    }
    public static AICutTheme parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AICutTheme.DEFAULT_INSTANCE, p0, p1);
    }
    public static AICutTheme parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AICutTheme.DEFAULT_INSTANCE, p0);
    }
    public static AICutTheme parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AICutTheme.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AICutTheme.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllMusics(Iterable p0){
       this.ensureMusicsIsMutable();
       AbstractMessageLite.addAll(p0, this.musics_);
    }
    public void addAllNewRecommendStyle(Iterable p0){
       this.ensureNewRecommendStyleIsMutable();
       AbstractMessageLite.addAll(p0, this.newRecommendStyle_);
    }
    public void addAllRecommendStyle(Iterable p0){
       this.ensureRecommendStyleIsMutable();
       AbstractMessageLite.addAll(p0, this.recommendStyle_);
    }
    public void addAllVisionEngineResult(Iterable p0){
       this.ensureVisionEngineResultIsMutable();
       AbstractMessageLite.addAll(p0, this.visionEngineResult_);
    }
    public void addMusics(int p0,Music$b p1){
       this.ensureMusicsIsMutable();
       this.musics_.add(p0, p1.build());
    }
    public void addMusics(int p0,Music p1){
       Objects.requireNonNull(p1);
       this.ensureMusicsIsMutable();
       this.musics_.add(p0, p1);
    }
    public void addMusics(Music$b p0){
       this.ensureMusicsIsMutable();
       this.musics_.add(p0.build());
    }
    public void addMusics(Music p0){
       Objects.requireNonNull(p0);
       this.ensureMusicsIsMutable();
       this.musics_.add(p0);
    }
    public void addNewRecommendStyle(int p0,RecommendStyle$b p1){
       this.ensureNewRecommendStyleIsMutable();
       this.newRecommendStyle_.add(p0, p1.build());
    }
    public void addNewRecommendStyle(int p0,RecommendStyle p1){
       Objects.requireNonNull(p1);
       this.ensureNewRecommendStyleIsMutable();
       this.newRecommendStyle_.add(p0, p1);
    }
    public void addNewRecommendStyle(RecommendStyle$b p0){
       this.ensureNewRecommendStyleIsMutable();
       this.newRecommendStyle_.add(p0.build());
    }
    public void addNewRecommendStyle(RecommendStyle p0){
       Objects.requireNonNull(p0);
       this.ensureNewRecommendStyleIsMutable();
       this.newRecommendStyle_.add(p0);
    }
    public void addRecommendStyle(int p0,RecommendStyle$b p1){
       this.ensureRecommendStyleIsMutable();
       this.recommendStyle_.add(p0, p1.build());
    }
    public void addRecommendStyle(int p0,RecommendStyle p1){
       Objects.requireNonNull(p1);
       this.ensureRecommendStyleIsMutable();
       this.recommendStyle_.add(p0, p1);
    }
    public void addRecommendStyle(RecommendStyle$b p0){
       this.ensureRecommendStyleIsMutable();
       this.recommendStyle_.add(p0.build());
    }
    public void addRecommendStyle(RecommendStyle p0){
       Objects.requireNonNull(p0);
       this.ensureRecommendStyleIsMutable();
       this.recommendStyle_.add(p0);
    }
    public void addVisionEngineResult(String p0){
       Objects.requireNonNull(p0);
       this.ensureVisionEngineResultIsMutable();
       this.visionEngineResult_.add(p0);
    }
    public void addVisionEngineResultBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureVisionEngineResultIsMutable();
       this.visionEngineResult_.add(p0.toStringUtf8());
    }
    public void clearAttributes(){
       this.attributes_ = null;
    }
    public void clearChecksum(){
       this.checksum_ = AICutTheme.getDefaultInstance().getChecksum();
    }
    public void clearColor(){
       this.color_ = AICutTheme.getDefaultInstance().getColor();
    }
    public void clearCoverFile(){
       this.coverFile_ = AICutTheme.getDefaultInstance().getCoverFile();
    }
    public void clearDirectory(){
       this.directory_ = AICutTheme.getDefaultInstance().getDirectory();
    }
    public void clearDpi(){
       this.dpi_ = 0;
    }
    public void clearFeatureId(){
       this.featureId_ = null;
    }
    public void clearIsRecommend(){
       this.isRecommend_ = false;
    }
    public void clearMusics(){
       this.musics_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearName(){
       this.name_ = AICutTheme.getDefaultInstance().getName();
    }
    public void clearNewRecommendStyle(){
       this.newRecommendStyle_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearRecommendStyle(){
       this.recommendStyle_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearSceneResult(){
       this.sceneResult_ = AICutTheme.getDefaultInstance().getSceneResult();
    }
    public void clearSeed(){
       this.seed_ = 0;
    }
    public void clearSelectedMusic(){
       this.selectedMusic_ = null;
    }
    public void clearVisionEngineResult(){
       this.visionEngineResult_ = GeneratedMessageLite.emptyProtobufList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = RecommendStyle.class;
       int i = 1;
       AICutTheme$a uoa = null;
       switch (AICutTheme$a.a[p0.ordinal()]){
           case 1:
             return new AICutTheme();
           case 2:
             return new AICutTheme$b(uoa);
           case 3:
             Object[] objArray = new Object[19];
             objArray[0] = "featureId_";
             objArray[i] = "attributes_";
             objArray[2] = "musics_";
             objArray[3] = Music.class;
             objArray[4] = "selectedMusic_";
             objArray[5] = "name_";
             objArray[6] = "coverFile_";
             objArray[7] = "color_";
             objArray[8] = "checksum_";
             objArray[9] = "directory_";
             objArray[10] = "seed_";
             objArray[11] = "recommendStyle_";
             objArray[12] = p1;
             objArray[13] = "newRecommendStyle_";
             objArray[14] = p1;
             objArray[15] = "visionEngineResult_";
             objArray[16] = "sceneResult_";
             objArray[17] = "isRecommend_";
             objArray[18] = "dpi_";
             return GeneratedMessageLite.newMessageInfo(AICutTheme.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x10\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x10\xff\x02\xff\x02\x04\xff\x02\xff\x02\x01\t\x02\t\x03\x1b\x04\t\x05\x02\x02\x06\x02\x02\x07\x02\x02\b\x02\x02\t\x02\x02\n\x02\x0b\x1b\f\x1b\r\x02\x02\x0e\x02\x02\x0f\x07\x10\f\x00", objArray);
           case 4:
             return AICutTheme.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AICutTheme.PARSER;
             if (pARSER == null) {
                _monitor_enter(AICutTheme.class);
                pARSER = AICutTheme.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AICutTheme.DEFAULT_INSTANCE);
                   AICutTheme.PARSER = pARSER;
                }
                _monitor_exit(AICutTheme.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return uoa;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureMusicsIsMutable(){
       if (!this.musics_.isModifiable()) {
          this.musics_ = GeneratedMessageLite.mutableCopy(this.musics_);
       }
       return;
    }
    public final void ensureNewRecommendStyleIsMutable(){
       if (!this.newRecommendStyle_.isModifiable()) {
          this.newRecommendStyle_ = GeneratedMessageLite.mutableCopy(this.newRecommendStyle_);
       }
       return;
    }
    public final void ensureRecommendStyleIsMutable(){
       if (!this.recommendStyle_.isModifiable()) {
          this.recommendStyle_ = GeneratedMessageLite.mutableCopy(this.recommendStyle_);
       }
       return;
    }
    public final void ensureVisionEngineResultIsMutable(){
       if (!this.visionEngineResult_.isModifiable()) {
          this.visionEngineResult_ = GeneratedMessageLite.mutableCopy(this.visionEngineResult_);
       }
       return;
    }
    public Attributes getAttributes(){
       AICutTheme tattributes_ = this.attributes_;
       if (tattributes_ == null) {
          tattributes_ = Attributes.getDefaultInstance();
       }
       return tattributes_;
    }
    public String getChecksum(){
       return this.checksum_;
    }
    public ByteString getChecksumBytes(){
       return ByteString.copyFromUtf8(this.checksum_);
    }
    public String getColor(){
       return this.color_;
    }
    public ByteString getColorBytes(){
       return ByteString.copyFromUtf8(this.color_);
    }
    public String getCoverFile(){
       return this.coverFile_;
    }
    public ByteString getCoverFileBytes(){
       return ByteString.copyFromUtf8(this.coverFile_);
    }
    public String getDirectory(){
       return this.directory_;
    }
    public ByteString getDirectoryBytes(){
       return ByteString.copyFromUtf8(this.directory_);
    }
    public AICutTheme$DpiType getDpi(){
       AICutTheme$DpiType uDpiType = AICutTheme$DpiType.forNumber(this.dpi_);
       if (uDpiType == null) {
          uDpiType = AICutTheme$DpiType.UNRECOGNIZED;
       }
       return uDpiType;
    }
    public int getDpiValue(){
       return this.dpi_;
    }
    public FeatureId getFeatureId(){
       AICutTheme tuAICutTheme = this.featureId_;
       if (tuAICutTheme == null) {
          tuAICutTheme = FeatureId.getDefaultInstance();
       }
       return tuAICutTheme;
    }
    public boolean getIsRecommend(){
       return this.isRecommend_;
    }
    public Music getMusics(int p0){
       return this.musics_.get(p0);
    }
    public int getMusicsCount(){
       return this.musics_.size();
    }
    public List getMusicsList(){
       return this.musics_;
    }
    public m getMusicsOrBuilder(int p0){
       return this.musics_.get(p0);
    }
    public List getMusicsOrBuilderList(){
       return this.musics_;
    }
    public String getName(){
       return this.name_;
    }
    public ByteString getNameBytes(){
       return ByteString.copyFromUtf8(this.name_);
    }
    public RecommendStyle getNewRecommendStyle(int p0){
       return this.newRecommendStyle_.get(p0);
    }
    public int getNewRecommendStyleCount(){
       return this.newRecommendStyle_.size();
    }
    public List getNewRecommendStyleList(){
       return this.newRecommendStyle_;
    }
    public q1 getNewRecommendStyleOrBuilder(int p0){
       return this.newRecommendStyle_.get(p0);
    }
    public List getNewRecommendStyleOrBuilderList(){
       return this.newRecommendStyle_;
    }
    public RecommendStyle getRecommendStyle(int p0){
       return this.recommendStyle_.get(p0);
    }
    public int getRecommendStyleCount(){
       return this.recommendStyle_.size();
    }
    public List getRecommendStyleList(){
       return this.recommendStyle_;
    }
    public q1 getRecommendStyleOrBuilder(int p0){
       return this.recommendStyle_.get(p0);
    }
    public List getRecommendStyleOrBuilderList(){
       return this.recommendStyle_;
    }
    public String getSceneResult(){
       return this.sceneResult_;
    }
    public ByteString getSceneResultBytes(){
       return ByteString.copyFromUtf8(this.sceneResult_);
    }
    public long getSeed(){
       return this.seed_;
    }
    public Music getSelectedMusic(){
       AICutTheme tselectedMus = this.selectedMusic_;
       if (tselectedMus == null) {
          tselectedMus = Music.getDefaultInstance();
       }
       return tselectedMus;
    }
    public String getVisionEngineResult(int p0){
       return this.visionEngineResult_.get(p0);
    }
    public ByteString getVisionEngineResultBytes(int p0){
       return ByteString.copyFromUtf8(this.visionEngineResult_.get(p0));
    }
    public int getVisionEngineResultCount(){
       return this.visionEngineResult_.size();
    }
    public List getVisionEngineResultList(){
       return this.visionEngineResult_;
    }
    public boolean hasAttributes(){
       boolean b = (this.attributes_ != null)? true: false;
       return b;
    }
    public boolean hasFeatureId(){
       boolean b = (this.featureId_ != null)? true: false;
       return b;
    }
    public boolean hasSelectedMusic(){
       boolean b = (this.selectedMusic_ != null)? true: false;
       return b;
    }
    public void mergeAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       AICutTheme tattributes_ = this.attributes_;
       this.attributes_ = (tattributes_ != null && tattributes_ != Attributes.getDefaultInstance())? Attributes.newBuilder(this.attributes_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       AICutTheme tuAICutTheme = this.featureId_;
       this.featureId_ = (tuAICutTheme != null && tuAICutTheme != FeatureId.getDefaultInstance())? FeatureId.newBuilder(this.featureId_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeSelectedMusic(Music p0){
       Objects.requireNonNull(p0);
       AICutTheme tselectedMus = this.selectedMusic_;
       this.selectedMusic_ = (tselectedMus != null && tselectedMus != Music.getDefaultInstance())? Music.newBuilder(this.selectedMusic_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeMusics(int p0){
       this.ensureMusicsIsMutable();
       this.musics_.remove(p0);
    }
    public void removeNewRecommendStyle(int p0){
       this.ensureNewRecommendStyleIsMutable();
       this.newRecommendStyle_.remove(p0);
    }
    public void removeRecommendStyle(int p0){
       this.ensureRecommendStyleIsMutable();
       this.recommendStyle_.remove(p0);
    }
    public void setAttributes(Attributes$b p0){
       this.attributes_ = p0.build();
    }
    public void setAttributes(Attributes p0){
       Objects.requireNonNull(p0);
       this.attributes_ = p0;
    }
    public void setChecksum(String p0){
       Objects.requireNonNull(p0);
       this.checksum_ = p0;
    }
    public void setChecksumBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.checksum_ = p0.toStringUtf8();
    }
    public void setColor(String p0){
       Objects.requireNonNull(p0);
       this.color_ = p0;
    }
    public void setColorBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.color_ = p0.toStringUtf8();
    }
    public void setCoverFile(String p0){
       Objects.requireNonNull(p0);
       this.coverFile_ = p0;
    }
    public void setCoverFileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.coverFile_ = p0.toStringUtf8();
    }
    public void setDirectory(String p0){
       Objects.requireNonNull(p0);
       this.directory_ = p0;
    }
    public void setDirectoryBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.directory_ = p0.toStringUtf8();
    }
    public void setDpi(AICutTheme$DpiType p0){
       Objects.requireNonNull(p0);
       this.dpi_ = p0.getNumber();
    }
    public void setDpiValue(int p0){
       this.dpi_ = p0;
    }
    public void setFeatureId(FeatureId$b p0){
       this.featureId_ = p0.build();
    }
    public void setFeatureId(FeatureId p0){
       Objects.requireNonNull(p0);
       this.featureId_ = p0;
    }
    public void setIsRecommend(boolean p0){
       this.isRecommend_ = p0;
    }
    public void setMusics(int p0,Music$b p1){
       this.ensureMusicsIsMutable();
       this.musics_.set(p0, p1.build());
    }
    public void setMusics(int p0,Music p1){
       Objects.requireNonNull(p1);
       this.ensureMusicsIsMutable();
       this.musics_.set(p0, p1);
    }
    public void setName(String p0){
       Objects.requireNonNull(p0);
       this.name_ = p0;
    }
    public void setNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.name_ = p0.toStringUtf8();
    }
    public void setNewRecommendStyle(int p0,RecommendStyle$b p1){
       this.ensureNewRecommendStyleIsMutable();
       this.newRecommendStyle_.set(p0, p1.build());
    }
    public void setNewRecommendStyle(int p0,RecommendStyle p1){
       Objects.requireNonNull(p1);
       this.ensureNewRecommendStyleIsMutable();
       this.newRecommendStyle_.set(p0, p1);
    }
    public void setRecommendStyle(int p0,RecommendStyle$b p1){
       this.ensureRecommendStyleIsMutable();
       this.recommendStyle_.set(p0, p1.build());
    }
    public void setRecommendStyle(int p0,RecommendStyle p1){
       Objects.requireNonNull(p1);
       this.ensureRecommendStyleIsMutable();
       this.recommendStyle_.set(p0, p1);
    }
    public void setSceneResult(String p0){
       Objects.requireNonNull(p0);
       this.sceneResult_ = p0;
    }
    public void setSceneResultBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.sceneResult_ = p0.toStringUtf8();
    }
    public void setSeed(long p0){
       this.seed_ = p0;
    }
    public void setSelectedMusic(Music$b p0){
       this.selectedMusic_ = p0.build();
    }
    public void setSelectedMusic(Music p0){
       Objects.requireNonNull(p0);
       this.selectedMusic_ = p0;
    }
    public void setVisionEngineResult(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureVisionEngineResultIsMutable();
       this.visionEngineResult_.set(p0, p1);
    }
}
