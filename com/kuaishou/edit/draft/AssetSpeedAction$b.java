package com.kuaishou.edit.draft.AssetSpeedAction$b;
import z30.e;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AssetSpeedAction;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AssetSpeedAction$a;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import java.util.List;
import java.util.Collections;

public final class AssetSpeedAction$b extends GeneratedMessageLite$Builder implements e	// class@00171c
{

    public void AssetSpeedAction$b(){
       super(AssetSpeedAction.DEFAULT_INSTANCE);
    }
    public void AssetSpeedAction$b(AssetSpeedAction$a p0){
       super(AssetSpeedAction.DEFAULT_INSTANCE);
    }
    public AssetSpeedAction$b a(int p0){
       this.copyOnWrite();
       this.instance.setEditingIndex(p0);
       return this;
    }
    public int getEditingIndex(){
       return this.instance.getEditingIndex();
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
    public double getSpeed(){
       return this.instance.getSpeed();
    }
}
