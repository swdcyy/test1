package com.kwai.video.westeros.models.PickMediaInfo$Builder;
import com.kwai.video.westeros.models.PickMediaInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.PickMediaInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.PickMediaInfo$1;
import com.kwai.video.westeros.models.PickMediaOutput;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.FMSize;
import com.kwai.video.westeros.models.PickMediaOutput$Builder;
import com.kwai.video.westeros.models.FMSize$Builder;

public final class PickMediaInfo$Builder extends GeneratedMessageLite$Builder implements PickMediaInfoOrBuilder	// class@000fec
{

    public void PickMediaInfo$Builder(){
       super(PickMediaInfo.DEFAULT_INSTANCE);
    }
    public void PickMediaInfo$Builder(PickMediaInfo$1 p0){
       super();
    }
    public PickMediaInfo$Builder clearDuration(){
       this.copyOnWrite();
       this.instance.clearDuration();
       return this;
    }
    public PickMediaInfo$Builder clearMaxLength(){
       this.copyOnWrite();
       this.instance.clearMaxLength();
       return this;
    }
    public PickMediaInfo$Builder clearOutput(){
       this.copyOnWrite();
       this.instance.clearOutput();
       return this;
    }
    public PickMediaInfo$Builder clearServerEffect(){
       this.copyOnWrite();
       this.instance.clearServerEffect();
       return this;
    }
    public PickMediaInfo$Builder clearSize(){
       this.copyOnWrite();
       this.instance.clearSize();
       return this;
    }
    public float getDuration(){
       return this.instance.getDuration();
    }
    public int getMaxLength(){
       return this.instance.getMaxLength();
    }
    public PickMediaOutput getOutput(){
       return this.instance.getOutput();
    }
    public String getServerEffect(){
       return this.instance.getServerEffect();
    }
    public ByteString getServerEffectBytes(){
       return this.instance.getServerEffectBytes();
    }
    public FMSize getSize(){
       return this.instance.getSize();
    }
    public boolean hasOutput(){
       return this.instance.hasOutput();
    }
    public boolean hasSize(){
       return this.instance.hasSize();
    }
    public PickMediaInfo$Builder mergeOutput(PickMediaOutput p0){
       this.copyOnWrite();
       this.instance.mergeOutput(p0);
       return this;
    }
    public PickMediaInfo$Builder mergeSize(FMSize p0){
       this.copyOnWrite();
       this.instance.mergeSize(p0);
       return this;
    }
    public PickMediaInfo$Builder setDuration(float p0){
       this.copyOnWrite();
       this.instance.setDuration(p0);
       return this;
    }
    public PickMediaInfo$Builder setMaxLength(int p0){
       this.copyOnWrite();
       this.instance.setMaxLength(p0);
       return this;
    }
    public PickMediaInfo$Builder setOutput(PickMediaOutput$Builder p0){
       this.copyOnWrite();
       this.instance.setOutput(p0);
       return this;
    }
    public PickMediaInfo$Builder setOutput(PickMediaOutput p0){
       this.copyOnWrite();
       this.instance.setOutput(p0);
       return this;
    }
    public PickMediaInfo$Builder setServerEffect(String p0){
       this.copyOnWrite();
       this.instance.setServerEffect(p0);
       return this;
    }
    public PickMediaInfo$Builder setServerEffectBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setServerEffectBytes(p0);
       return this;
    }
    public PickMediaInfo$Builder setSize(FMSize$Builder p0){
       this.copyOnWrite();
       this.instance.setSize(p0);
       return this;
    }
    public PickMediaInfo$Builder setSize(FMSize p0){
       this.copyOnWrite();
       this.instance.setSize(p0);
       return this;
    }
}
