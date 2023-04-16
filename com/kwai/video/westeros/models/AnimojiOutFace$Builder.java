package com.kwai.video.westeros.models.AnimojiOutFace$Builder;
import com.kwai.video.westeros.models.AnimojiOutFaceOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.AnimojiOutFace;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.AnimojiOutFace$1;
import java.lang.Iterable;
import java.util.List;
import java.util.Collections;
import com.kwai.video.westeros.models.FaceProp;
import com.kwai.video.westeros.models.Pose3D;
import com.kwai.video.westeros.models.TongueInfo;
import com.kwai.video.westeros.models.FaceProp$Builder;
import com.kwai.video.westeros.models.Pose3D$Builder;
import com.kwai.video.westeros.models.TongueInfo$Builder;

public final class AnimojiOutFace$Builder extends GeneratedMessageLite$Builder implements AnimojiOutFaceOrBuilder	// class@000ea0
{

    public void AnimojiOutFace$Builder(){
       super(AnimojiOutFace.DEFAULT_INSTANCE);
    }
    public void AnimojiOutFace$Builder(AnimojiOutFace$1 p0){
       super();
    }
    public AnimojiOutFace$Builder addAllExpressions(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllExpressions(p0);
       return this;
    }
    public AnimojiOutFace$Builder addAllTransmat(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllTransmat(p0);
       return this;
    }
    public AnimojiOutFace$Builder addExpressions(float p0){
       this.copyOnWrite();
       this.instance.addExpressions(p0);
       return this;
    }
    public AnimojiOutFace$Builder addTransmat(float p0){
       this.copyOnWrite();
       this.instance.addTransmat(p0);
       return this;
    }
    public AnimojiOutFace$Builder clearExpressions(){
       this.copyOnWrite();
       this.instance.clearExpressions();
       return this;
    }
    public AnimojiOutFace$Builder clearFaceProp(){
       this.copyOnWrite();
       this.instance.clearFaceProp();
       return this;
    }
    public AnimojiOutFace$Builder clearPose3D(){
       this.copyOnWrite();
       this.instance.clearPose3D();
       return this;
    }
    public AnimojiOutFace$Builder clearTongue(){
       this.copyOnWrite();
       this.instance.clearTongue();
       return this;
    }
    public AnimojiOutFace$Builder clearTransmat(){
       this.copyOnWrite();
       this.instance.clearTransmat();
       return this;
    }
    public float getExpressions(int p0){
       return this.instance.getExpressions(p0);
    }
    public int getExpressionsCount(){
       return this.instance.getExpressionsCount();
    }
    public List getExpressionsList(){
       return Collections.unmodifiableList(this.instance.getExpressionsList());
    }
    public FaceProp getFaceProp(){
       return this.instance.getFaceProp();
    }
    public Pose3D getPose3D(){
       return this.instance.getPose3D();
    }
    public TongueInfo getTongue(){
       return this.instance.getTongue();
    }
    public float getTransmat(int p0){
       return this.instance.getTransmat(p0);
    }
    public int getTransmatCount(){
       return this.instance.getTransmatCount();
    }
    public List getTransmatList(){
       return Collections.unmodifiableList(this.instance.getTransmatList());
    }
    public boolean hasFaceProp(){
       return this.instance.hasFaceProp();
    }
    public boolean hasPose3D(){
       return this.instance.hasPose3D();
    }
    public boolean hasTongue(){
       return this.instance.hasTongue();
    }
    public AnimojiOutFace$Builder mergeFaceProp(FaceProp p0){
       this.copyOnWrite();
       this.instance.mergeFaceProp(p0);
       return this;
    }
    public AnimojiOutFace$Builder mergePose3D(Pose3D p0){
       this.copyOnWrite();
       this.instance.mergePose3D(p0);
       return this;
    }
    public AnimojiOutFace$Builder mergeTongue(TongueInfo p0){
       this.copyOnWrite();
       this.instance.mergeTongue(p0);
       return this;
    }
    public AnimojiOutFace$Builder setExpressions(int p0,float p1){
       this.copyOnWrite();
       this.instance.setExpressions(p0, p1);
       return this;
    }
    public AnimojiOutFace$Builder setFaceProp(FaceProp$Builder p0){
       this.copyOnWrite();
       this.instance.setFaceProp(p0);
       return this;
    }
    public AnimojiOutFace$Builder setFaceProp(FaceProp p0){
       this.copyOnWrite();
       this.instance.setFaceProp(p0);
       return this;
    }
    public AnimojiOutFace$Builder setPose3D(Pose3D$Builder p0){
       this.copyOnWrite();
       this.instance.setPose3D(p0);
       return this;
    }
    public AnimojiOutFace$Builder setPose3D(Pose3D p0){
       this.copyOnWrite();
       this.instance.setPose3D(p0);
       return this;
    }
    public AnimojiOutFace$Builder setTongue(TongueInfo$Builder p0){
       this.copyOnWrite();
       this.instance.setTongue(p0);
       return this;
    }
    public AnimojiOutFace$Builder setTongue(TongueInfo p0){
       this.copyOnWrite();
       this.instance.setTongue(p0);
       return this;
    }
    public AnimojiOutFace$Builder setTransmat(int p0,float p1){
       this.copyOnWrite();
       this.instance.setTransmat(p0, p1);
       return this;
    }
}
