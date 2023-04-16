package com.kwai.video.westeros.models.MmuFeatureParams$Builder;
import com.kwai.video.westeros.models.MmuFeatureParamsOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MmuFeatureParams;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MmuFeatureParams$1;
import com.kwai.video.westeros.models.MemojiConfig;
import com.kwai.video.westeros.models.MmuFacePropConfig;
import com.kwai.video.westeros.models.MemojiConfig$Builder;
import com.kwai.video.westeros.models.MmuFacePropConfig$Builder;

public final class MmuFeatureParams$Builder extends GeneratedMessageLite$Builder implements MmuFeatureParamsOrBuilder	// class@000fd2
{

    public void MmuFeatureParams$Builder(){
       super(MmuFeatureParams.DEFAULT_INSTANCE);
    }
    public void MmuFeatureParams$Builder(MmuFeatureParams$1 p0){
       super();
    }
    public MmuFeatureParams$Builder clearMemojiConfig(){
       this.copyOnWrite();
       this.instance.clearMemojiConfig();
       return this;
    }
    public MmuFeatureParams$Builder clearMmuFacePropConfig(){
       this.copyOnWrite();
       this.instance.clearMmuFacePropConfig();
       return this;
    }
    public MemojiConfig getMemojiConfig(){
       return this.instance.getMemojiConfig();
    }
    public MmuFacePropConfig getMmuFacePropConfig(){
       return this.instance.getMmuFacePropConfig();
    }
    public boolean hasMemojiConfig(){
       return this.instance.hasMemojiConfig();
    }
    public boolean hasMmuFacePropConfig(){
       return this.instance.hasMmuFacePropConfig();
    }
    public MmuFeatureParams$Builder mergeMemojiConfig(MemojiConfig p0){
       this.copyOnWrite();
       this.instance.mergeMemojiConfig(p0);
       return this;
    }
    public MmuFeatureParams$Builder mergeMmuFacePropConfig(MmuFacePropConfig p0){
       this.copyOnWrite();
       this.instance.mergeMmuFacePropConfig(p0);
       return this;
    }
    public MmuFeatureParams$Builder setMemojiConfig(MemojiConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setMemojiConfig(p0);
       return this;
    }
    public MmuFeatureParams$Builder setMemojiConfig(MemojiConfig p0){
       this.copyOnWrite();
       this.instance.setMemojiConfig(p0);
       return this;
    }
    public MmuFeatureParams$Builder setMmuFacePropConfig(MmuFacePropConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setMmuFacePropConfig(p0);
       return this;
    }
    public MmuFeatureParams$Builder setMmuFacePropConfig(MmuFacePropConfig p0){
       this.copyOnWrite();
       this.instance.setMmuFacePropConfig(p0);
       return this;
    }
}
