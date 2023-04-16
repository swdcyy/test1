package z30.d0;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;

public interface abstract d0 implements MessageLiteOrBuilder	// class@003421
{

    Attributes getAttributes();
    int getDehazeFilterType();
    boolean getEnableCorrection();
    FeatureId getFeatureId();
    int getGrayFilterType();
    String getResources(int p0);
    ByteString getResourcesBytes(int p0);
    int getResourcesCount();
    List getResourcesList();
    float getSigmaNoiseVariance();
    boolean hasAttributes();
    boolean hasFeatureId();
}
