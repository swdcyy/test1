package com.kuaishou.edit.draft.AssetRangeAction$b;
import z30.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AssetRangeAction;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AssetRangeAction$a;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import java.util.List;
import java.util.Collections;
import com.kuaishou.edit.draft.TimeRange;

public final class AssetRangeAction$b extends GeneratedMessageLite$Builder implements b	// class@001713
{

    public void AssetRangeAction$b(){
       super(AssetRangeAction.DEFAULT_INSTANCE);
    }
    public void AssetRangeAction$b(AssetRangeAction$a p0){
       super(AssetRangeAction.DEFAULT_INSTANCE);
    }
    public AssetRangeAction$b a(int p0){
       this.copyOnWrite();
       this.instance.setTrackIndex(p0);
       return this;
    }
    public AssetTransitionActionData getOriginalAssetTransitions(int p0){
       return this.instance.getOriginalAssetTransitions(p0);
    }
    public int getOriginalAssetTransitionsCount(){
       return this.instance.getOriginalAssetTransitionsCount();
    }
    public List getOriginalAssetTransitionsList(){
       return Collections.unmodifiableList(this.instance.getOriginalAssetTransitionsList());
    }
    public TimeRange getOriginalRange(){
       return this.instance.getOriginalRange();
    }
    public int getTrackIndex(){
       return this.instance.getTrackIndex();
    }
    public boolean hasOriginalRange(){
       return this.instance.hasOriginalRange();
    }
}
