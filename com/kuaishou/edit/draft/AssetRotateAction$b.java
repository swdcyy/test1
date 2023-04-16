package com.kuaishou.edit.draft.AssetRotateAction$b;
import z30.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AssetRotateAction;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AssetRotateAction$a;

public final class AssetRotateAction$b extends GeneratedMessageLite$Builder implements c	// class@001716
{

    public void AssetRotateAction$b(){
       super(AssetRotateAction.DEFAULT_INSTANCE);
    }
    public void AssetRotateAction$b(AssetRotateAction$a p0){
       super(AssetRotateAction.DEFAULT_INSTANCE);
    }
    public AssetRotateAction$b a(int p0){
       this.copyOnWrite();
       this.instance.setTrackIndex(p0);
       return this;
    }
    public int getRotationDeg(){
       return this.instance.getRotationDeg();
    }
    public int getTrackIndex(){
       return this.instance.getTrackIndex();
    }
}
