package com.kuaishou.edit.draft.DeleteAssetAction$b;
import z30.u;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.DeleteAssetAction;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.DeleteAssetAction$a;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import java.util.List;
import java.util.Collections;

public final class DeleteAssetAction$b extends GeneratedMessageLite$Builder implements u	// class@00176b
{

    public void DeleteAssetAction$b(){
       super(DeleteAssetAction.DEFAULT_INSTANCE);
    }
    public void DeleteAssetAction$b(DeleteAssetAction$a p0){
       super(DeleteAssetAction.DEFAULT_INSTANCE);
    }
    public DeleteAssetAction$b a(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllOriginalAssetTransitions(p0);
       return this;
    }
    public DeleteAssetAction$b b(Asset p0){
       this.copyOnWrite();
       this.instance.setAsset(p0);
       return this;
    }
    public DeleteAssetAction$b c(int p0){
       this.copyOnWrite();
       this.instance.setTrackIndex(p0);
       return this;
    }
    public Asset getAsset(){
       return this.instance.getAsset();
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
    public int getTrackIndex(){
       return this.instance.getTrackIndex();
    }
    public boolean hasAsset(){
       return this.instance.hasAsset();
    }
}
