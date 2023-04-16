package z30.e;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import java.util.List;

public interface abstract e implements MessageLiteOrBuilder	// class@003428
{

    int getEditingIndex();
    AssetTransitionActionData getOriginalAssetTransitions(int p0);
    int getOriginalAssetTransitionsCount();
    List getOriginalAssetTransitionsList();
    double getSpeed();
}
