package z30.b0;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;

public interface abstract b0 implements MessageLiteOrBuilder	// class@003419
{

    Attributes getAttributes();
    FeatureId getFeatureId();
    double getIntensity();
    String getResources(int p0);
    ByteString getResourcesBytes(int p0);
    int getResourcesCount();
    List getResourcesList();
    int getSdkType();
    boolean hasAttributes();
    boolean hasFeatureId();
}
