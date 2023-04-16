package com.kuaishou.edit.draft.AssetTransitionActionData$b;
import z30.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AssetTransitionActionData$a;
import com.kuaishou.edit.draft.AssetTransition;

public final class AssetTransitionActionData$b extends GeneratedMessageLite$Builder implements f	// class@001725
{

    public void AssetTransitionActionData$b(){
       super(AssetTransitionActionData.DEFAULT_INSTANCE);
    }
    public void AssetTransitionActionData$b(AssetTransitionActionData$a p0){
       super(AssetTransitionActionData.DEFAULT_INSTANCE);
    }
    public AssetTransitionActionData$b a(AssetTransition p0){
       this.copyOnWrite();
       this.instance.setAssetTransition(p0);
       return this;
    }
    public AssetTransitionActionData$b b(int p0){
       this.copyOnWrite();
       this.instance.setTrackIndex(p0);
       return this;
    }
    public AssetTransition getAssetTransition(){
       return this.instance.getAssetTransition();
    }
    public int getTrackIndex(){
       return this.instance.getTrackIndex();
    }
    public boolean hasAssetTransition(){
       return this.instance.hasAssetTransition();
    }
}
