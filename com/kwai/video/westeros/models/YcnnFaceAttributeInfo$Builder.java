package com.kwai.video.westeros.models.YcnnFaceAttributeInfo$Builder;
import com.kwai.video.westeros.models.YcnnFaceAttributeInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.YcnnFaceAttributeInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.YcnnFaceAttributeInfo$1;
import java.lang.Iterable;
import java.util.List;
import java.util.Collections;

public final class YcnnFaceAttributeInfo$Builder extends GeneratedMessageLite$Builder implements YcnnFaceAttributeInfoOrBuilder	// class@0010a5
{

    public void YcnnFaceAttributeInfo$Builder(){
       super(YcnnFaceAttributeInfo.DEFAULT_INSTANCE);
    }
    public void YcnnFaceAttributeInfo$Builder(YcnnFaceAttributeInfo$1 p0){
       super();
    }
    public YcnnFaceAttributeInfo$Builder addAllFeature(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllFeature(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder addFeature(float p0){
       this.copyOnWrite();
       this.instance.addFeature(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearAge(){
       this.copyOnWrite();
       this.instance.clearAge();
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearAgeConf(){
       this.copyOnWrite();
       this.instance.clearAgeConf();
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearBeauty(){
       this.copyOnWrite();
       this.instance.clearBeauty();
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearEyelidLeft(){
       this.copyOnWrite();
       this.instance.clearEyelidLeft();
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearEyelidLeftConf(){
       this.copyOnWrite();
       this.instance.clearEyelidLeftConf();
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearEyelidRight(){
       this.copyOnWrite();
       this.instance.clearEyelidRight();
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearEyelidRightConf(){
       this.copyOnWrite();
       this.instance.clearEyelidRightConf();
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearFaceid(){
       this.copyOnWrite();
       this.instance.clearFaceid();
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearFeature(){
       this.copyOnWrite();
       this.instance.clearFeature();
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearGender(){
       this.copyOnWrite();
       this.instance.clearGender();
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearIndex(){
       this.copyOnWrite();
       this.instance.clearIndex();
       return this;
    }
    public YcnnFaceAttributeInfo$Builder clearSkinSmooth(){
       this.copyOnWrite();
       this.instance.clearSkinSmooth();
       return this;
    }
    public float getAge(){
       return this.instance.getAge();
    }
    public float getAgeConf(){
       return this.instance.getAgeConf();
    }
    public float getBeauty(){
       return this.instance.getBeauty();
    }
    public int getEyelidLeft(){
       return this.instance.getEyelidLeft();
    }
    public float getEyelidLeftConf(){
       return this.instance.getEyelidLeftConf();
    }
    public int getEyelidRight(){
       return this.instance.getEyelidRight();
    }
    public float getEyelidRightConf(){
       return this.instance.getEyelidRightConf();
    }
    public int getFaceid(){
       return this.instance.getFaceid();
    }
    public float getFeature(int p0){
       return this.instance.getFeature(p0);
    }
    public int getFeatureCount(){
       return this.instance.getFeatureCount();
    }
    public List getFeatureList(){
       return Collections.unmodifiableList(this.instance.getFeatureList());
    }
    public float getGender(){
       return this.instance.getGender();
    }
    public int getIndex(){
       return this.instance.getIndex();
    }
    public float getSkinSmooth(){
       return this.instance.getSkinSmooth();
    }
    public YcnnFaceAttributeInfo$Builder setAge(float p0){
       this.copyOnWrite();
       this.instance.setAge(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder setAgeConf(float p0){
       this.copyOnWrite();
       this.instance.setAgeConf(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder setBeauty(float p0){
       this.copyOnWrite();
       this.instance.setBeauty(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder setEyelidLeft(int p0){
       this.copyOnWrite();
       this.instance.setEyelidLeft(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder setEyelidLeftConf(float p0){
       this.copyOnWrite();
       this.instance.setEyelidLeftConf(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder setEyelidRight(int p0){
       this.copyOnWrite();
       this.instance.setEyelidRight(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder setEyelidRightConf(float p0){
       this.copyOnWrite();
       this.instance.setEyelidRightConf(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder setFaceid(int p0){
       this.copyOnWrite();
       this.instance.setFaceid(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder setFeature(int p0,float p1){
       this.copyOnWrite();
       this.instance.setFeature(p0, p1);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder setGender(float p0){
       this.copyOnWrite();
       this.instance.setGender(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder setIndex(int p0){
       this.copyOnWrite();
       this.instance.setIndex(p0);
       return this;
    }
    public YcnnFaceAttributeInfo$Builder setSkinSmooth(float p0){
       this.copyOnWrite();
       this.instance.setSkinSmooth(p0);
       return this;
    }
}
