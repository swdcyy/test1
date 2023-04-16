package com.kwai.video.westeros.models.AnimojiOutFaceOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import com.kwai.video.westeros.models.FaceProp;
import com.kwai.video.westeros.models.Pose3D;
import com.kwai.video.westeros.models.TongueInfo;

public interface abstract AnimojiOutFaceOrBuilder implements MessageLiteOrBuilder	// class@000ea2
{

    float getExpressions(int p0);
    int getExpressionsCount();
    List getExpressionsList();
    FaceProp getFaceProp();
    Pose3D getPose3D();
    TongueInfo getTongue();
    float getTransmat(int p0);
    int getTransmatCount();
    List getTransmatList();
    boolean hasFaceProp();
    boolean hasPose3D();
    boolean hasTongue();
}
