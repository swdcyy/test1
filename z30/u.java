package z30.u;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import java.util.List;

public interface abstract u implements MessageLiteOrBuilder	// class@003469
{

    Asset getAsset();
    AssetTransitionActionData getOriginalAssetTransitions(int p0);
    int getOriginalAssetTransitionsCount();
    List getOriginalAssetTransitionsList();
    int getTrackIndex();
    boolean hasAsset();
}
