package com.kuaishou.edit.draft.AssetTransitionAction$b;
import z30.g;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AssetTransitionAction;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AssetTransitionAction$a;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import java.util.List;
import java.util.Collections;

public final class AssetTransitionAction$b extends GeneratedMessageLite$Builder implements g	// class@001722
{

    public void AssetTransitionAction$b(){
       super(AssetTransitionAction.DEFAULT_INSTANCE);
    }
    public void AssetTransitionAction$b(AssetTransitionAction$a p0){
       super(AssetTransitionAction.DEFAULT_INSTANCE);
    }
    public boolean getCurApplyToAll(){
       return this.instance.getCurApplyToAll();
    }
    public int getCurType(){
       return this.instance.getCurType();
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
    public boolean getPreApplyToAll(){
       return this.instance.getPreApplyToAll();
    }
}
