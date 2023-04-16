package com.kuaishou.edit.draft.AssetArrangeAction$b;
import z30.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AssetArrangeAction;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AssetArrangeAction$a;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import java.util.List;
import java.util.Collections;
import com.kuaishou.edit.draft.Asset;

public final class AssetArrangeAction$b extends GeneratedMessageLite$Builder implements a	// class@001710
{

    public void AssetArrangeAction$b(){
       super(AssetArrangeAction.DEFAULT_INSTANCE);
    }
    public void AssetArrangeAction$b(AssetArrangeAction$a p0){
       super(AssetArrangeAction.DEFAULT_INSTANCE);
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
    public Asset getOriginalAssets(int p0){
       return this.instance.getOriginalAssets(p0);
    }
    public int getOriginalAssetsCount(){
       return this.instance.getOriginalAssetsCount();
    }
    public List getOriginalAssetsList(){
       return Collections.unmodifiableList(this.instance.getOriginalAssetsList());
    }
}
