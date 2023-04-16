package com.kwai.video.westeros.models.YcnnFaceAttributeInfoOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface abstract YcnnFaceAttributeInfoOrBuilder implements MessageLiteOrBuilder	// class@0010a7
{

    float getAge();
    float getAgeConf();
    float getBeauty();
    int getEyelidLeft();
    float getEyelidLeftConf();
    int getEyelidRight();
    float getEyelidRightConf();
    int getFaceid();
    float getFeature(int p0);
    int getFeatureCount();
    List getFeatureList();
    float getGender();
    int getIndex();
    float getSkinSmooth();
}
