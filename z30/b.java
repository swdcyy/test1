package z30.b;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import java.util.List;
import com.kuaishou.edit.draft.TimeRange;

public interface abstract b implements MessageLiteOrBuilder	// class@00341c
{

    AssetTransitionActionData getOriginalAssetTransitions(int p0);
    int getOriginalAssetTransitionsCount();
    List getOriginalAssetTransitionsList();
    TimeRange getOriginalRange();
    int getTrackIndex();
    boolean hasOriginalRange();
}
