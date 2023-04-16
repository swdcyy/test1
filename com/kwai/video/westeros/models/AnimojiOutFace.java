package com.kwai.video.westeros.models.AnimojiOutFace;
import com.kwai.video.westeros.models.AnimojiOutFaceOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$FloatList;
import com.kwai.video.westeros.models.AnimojiOutFace$Builder;
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
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.AnimojiOutFace$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.FaceProp;
import com.kwai.video.westeros.models.Pose3D;
import com.kwai.video.westeros.models.TongueInfo;
import java.util.Objects;
import com.kwai.video.westeros.models.FaceProp$Builder;
import com.kwai.video.westeros.models.Pose3D$Builder;
import com.kwai.video.westeros.models.TongueInfo$Builder;

public final class AnimojiOutFace extends GeneratedMessageLite implements AnimojiOutFaceOrBuilder	// class@000ea1
{
    public int expressionsMemoizedSerializedSize;
    public Internal$FloatList expressions_;
    public FaceProp faceProp_;
    public Pose3D pose3D_;
    public TongueInfo tongue_;
    public int transmatMemoizedSerializedSize;
    public Internal$FloatList transmat_;
    public static final AnimojiOutFace DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       AnimojiOutFace uAnimojiOutF = new AnimojiOutFace();
       AnimojiOutFace.DEFAULT_INSTANCE = uAnimojiOutF;
       GeneratedMessageLite.registerDefaultInstance(AnimojiOutFace.class, uAnimojiOutF);
    }
    public void AnimojiOutFace(){
       super();
       this.expressionsMemoizedSerializedSize = -1;
       this.transmatMemoizedSerializedSize = -1;
       this.expressions_ = GeneratedMessageLite.emptyFloatList();
       this.transmat_ = GeneratedMessageLite.emptyFloatList();
    }
    public static AnimojiOutFace getDefaultInstance(){
       return AnimojiOutFace.DEFAULT_INSTANCE;
    }
    public static AnimojiOutFace$Builder newBuilder(){
       return AnimojiOutFace.DEFAULT_INSTANCE.createBuilder();
    }
    public static AnimojiOutFace$Builder newBuilder(AnimojiOutFace p0){
       return AnimojiOutFace.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static AnimojiOutFace parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiOutFace parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiOutFace parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiOutFace parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiOutFace parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiOutFace parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiOutFace parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiOutFace parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiOutFace parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiOutFace parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static AnimojiOutFace parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0);
    }
    public static AnimojiOutFace parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(AnimojiOutFace.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return AnimojiOutFace.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllExpressions(Iterable p0){
       this.ensureExpressionsIsMutable();
       AbstractMessageLite.addAll(p0, this.expressions_);
    }
    public void addAllTransmat(Iterable p0){
       this.ensureTransmatIsMutable();
       AbstractMessageLite.addAll(p0, this.transmat_);
    }
    public void addExpressions(float p0){
       this.ensureExpressionsIsMutable();
       this.expressions_.addFloat(p0);
    }
    public void addTransmat(float p0){
       this.ensureTransmatIsMutable();
       this.transmat_.addFloat(p0);
    }
    public void clearExpressions(){
       this.expressions_ = GeneratedMessageLite.emptyFloatList();
    }
    public void clearFaceProp(){
       this.faceProp_ = null;
    }
    public void clearPose3D(){
       this.pose3D_ = null;
    }
    public void clearTongue(){
       this.tongue_ = null;
    }
    public void clearTransmat(){
       this.transmat_ = GeneratedMessageLite.emptyFloatList();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (AnimojiOutFace$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new AnimojiOutFace();
           case 2:
             return new AnimojiOutFace$Builder(p2);
           case 3:
             Object[] objArray = new Object[]{"expressions_","pose3D_","faceProp_","tongue_","transmat_"};
             return GeneratedMessageLite.newMessageInfo(AnimojiOutFace.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01$\x02\t\x03\t\x04\t\x05$\x00", objArray);
           case 4:
             return AnimojiOutFace.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = AnimojiOutFace.PARSER;
             if (pARSER == null) {
                _monitor_enter(AnimojiOutFace.class);
                pARSER = AnimojiOutFace.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(AnimojiOutFace.DEFAULT_INSTANCE);
                   AnimojiOutFace.PARSER = pARSER;
                }
                _monitor_exit(AnimojiOutFace.class);
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
    public final void ensureExpressionsIsMutable(){
       if (!this.expressions_.isModifiable()) {
          this.expressions_ = GeneratedMessageLite.mutableCopy(this.expressions_);
       }
       return;
    }
    public final void ensureTransmatIsMutable(){
       if (!this.transmat_.isModifiable()) {
          this.transmat_ = GeneratedMessageLite.mutableCopy(this.transmat_);
       }
       return;
    }
    public float getExpressions(int p0){
       return this.expressions_.getFloat(p0);
    }
    public int getExpressionsCount(){
       return this.expressions_.size();
    }
    public List getExpressionsList(){
       return this.expressions_;
    }
    public FaceProp getFaceProp(){
       AnimojiOutFace tuAnimojiOut = this.faceProp_;
       if (tuAnimojiOut == null) {
          tuAnimojiOut = FaceProp.getDefaultInstance();
       }
       return tuAnimojiOut;
    }
    public Pose3D getPose3D(){
       AnimojiOutFace tpose3D_ = this.pose3D_;
       if (tpose3D_ == null) {
          tpose3D_ = Pose3D.getDefaultInstance();
       }
       return tpose3D_;
    }
    public TongueInfo getTongue(){
       AnimojiOutFace ttongue_ = this.tongue_;
       if (ttongue_ == null) {
          ttongue_ = TongueInfo.getDefaultInstance();
       }
       return ttongue_;
    }
    public float getTransmat(int p0){
       return this.transmat_.getFloat(p0);
    }
    public int getTransmatCount(){
       return this.transmat_.size();
    }
    public List getTransmatList(){
       return this.transmat_;
    }
    public boolean hasFaceProp(){
       boolean b = (this.faceProp_ != null)? true: false;
       return b;
    }
    public boolean hasPose3D(){
       boolean b = (this.pose3D_ != null)? true: false;
       return b;
    }
    public boolean hasTongue(){
       boolean b = (this.tongue_ != null)? true: false;
       return b;
    }
    public void mergeFaceProp(FaceProp p0){
       Objects.requireNonNull(p0);
       AnimojiOutFace tuAnimojiOut = this.faceProp_;
       this.faceProp_ = (tuAnimojiOut != null && tuAnimojiOut != FaceProp.getDefaultInstance())? FaceProp.newBuilder(this.faceProp_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergePose3D(Pose3D p0){
       Objects.requireNonNull(p0);
       AnimojiOutFace tpose3D_ = this.pose3D_;
       this.pose3D_ = (tpose3D_ != null && tpose3D_ != Pose3D.getDefaultInstance())? Pose3D.newBuilder(this.pose3D_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeTongue(TongueInfo p0){
       Objects.requireNonNull(p0);
       AnimojiOutFace ttongue_ = this.tongue_;
       this.tongue_ = (ttongue_ != null && ttongue_ != TongueInfo.getDefaultInstance())? TongueInfo.newBuilder(this.tongue_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setExpressions(int p0,float p1){
       this.ensureExpressionsIsMutable();
       this.expressions_.setFloat(p0, p1);
    }
    public void setFaceProp(FaceProp$Builder p0){
       this.faceProp_ = p0.build();
    }
    public void setFaceProp(FaceProp p0){
       Objects.requireNonNull(p0);
       this.faceProp_ = p0;
    }
    public void setPose3D(Pose3D$Builder p0){
       this.pose3D_ = p0.build();
    }
    public void setPose3D(Pose3D p0){
       Objects.requireNonNull(p0);
       this.pose3D_ = p0;
    }
    public void setTongue(TongueInfo$Builder p0){
       this.tongue_ = p0.build();
    }
    public void setTongue(TongueInfo p0){
       Objects.requireNonNull(p0);
       this.tongue_ = p0;
    }
    public void setTransmat(int p0,float p1){
       this.ensureTransmatIsMutable();
       this.transmat_.setFloat(p0, p1);
    }
}
