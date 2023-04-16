package z30.x;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.DeformParam;
import java.util.List;
import com.kuaishou.edit.draft.FeatureId;

public interface abstract x implements MessageLiteOrBuilder	// class@003473
{

    Attributes getAttributes();
    float getBeautifyLipsIntensity();
    float getBrightIntensity();
    DeformParam getDeformParams(int p0);
    int getDeformParamsCount();
    List getDeformParamsList();
    float getEyeBagRemoveIntensity();
    float getEyeBrightenIntensity();
    FeatureId getFeatureId();
    float getNoseShadowIntensity();
    float getSoftenIntensity();
    float getTeethBrightenIntensity();
    float getWrinkleRemoveIntensity();
    boolean hasAttributes();
    boolean hasFeatureId();
}
