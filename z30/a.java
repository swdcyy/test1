package z30.a;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import java.util.List;
import com.kuaishou.edit.draft.Asset;

public interface abstract a implements MessageLiteOrBuilder	// class@003418
{

    AssetTransitionActionData getOriginalAssetTransitions(int p0);
    int getOriginalAssetTransitionsCount();
    List getOriginalAssetTransitionsList();
    Asset getOriginalAssets(int p0);
    int getOriginalAssetsCount();
    List getOriginalAssetsList();
}
