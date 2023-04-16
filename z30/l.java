package z30.l;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.EffectSource;
import com.kuaishou.edit.draft.FeatureId;

public interface abstract l implements MessageLiteOrBuilder	// class@003444
{

    Attributes getAttributes();
    double getBright();
    EffectSource getEffectSource();
    int getEffectSourceValue();
    FeatureId getFeatureId();
    double getSoft();
    boolean hasAttributes();
    boolean hasFeatureId();
}
