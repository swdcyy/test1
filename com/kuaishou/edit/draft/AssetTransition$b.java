package com.kuaishou.edit.draft.AssetTransition$b;
import z30.h;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AssetTransition;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AssetTransition$a;

public final class AssetTransition$b extends GeneratedMessageLite$Builder implements h	// class@00171f
{

    public void AssetTransition$b(){
       super(AssetTransition.DEFAULT_INSTANCE);
    }
    public void AssetTransition$b(AssetTransition$a p0){
       super(AssetTransition.DEFAULT_INSTANCE);
    }
    public AssetTransition$b a(double p0){
       this.copyOnWrite();
       this.instance.setDuration(p0);
       return this;
    }
    public AssetTransition$b b(int p0){
       this.copyOnWrite();
       this.instance.setSdkType(p0);
       return this;
    }
    public double getDuration(){
       return this.instance.getDuration();
    }
    public int getSdkType(){
       return this.instance.getSdkType();
    }
}
