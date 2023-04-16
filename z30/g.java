package z30.g;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import java.util.List;

public interface abstract g implements MessageLiteOrBuilder	// class@003430
{

    boolean getCurApplyToAll();
    int getCurType();
    AssetTransitionActionData getOriginalAssetTransitions(int p0);
    int getOriginalAssetTransitionsCount();
    List getOriginalAssetTransitionsList();
    boolean getPreApplyToAll();
}
