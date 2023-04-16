package com.kwai.video.westeros.models.PickMediaServerInfo$Builder;
import com.kwai.video.westeros.models.PickMediaServerInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.PickMediaServerInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.PickMediaServerInfo$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.PickMediaOutput$Builder;
import com.kwai.video.westeros.models.PickMediaOutput;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class PickMediaServerInfo$Builder extends GeneratedMessageLite$Builder implements PickMediaServerInfoOrBuilder	// class@000ff4
{

    public void PickMediaServerInfo$Builder(){
       super(PickMediaServerInfo.DEFAULT_INSTANCE);
    }
    public void PickMediaServerInfo$Builder(PickMediaServerInfo$1 p0){
       super();
    }
    public PickMediaServerInfo$Builder addAllOutput(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllOutput(p0);
       return this;
    }
    public PickMediaServerInfo$Builder addOutput(int p0,PickMediaOutput$Builder p1){
       this.copyOnWrite();
       this.instance.addOutput(p0, p1);
       return this;
    }
    public PickMediaServerInfo$Builder addOutput(int p0,PickMediaOutput p1){
       this.copyOnWrite();
       this.instance.addOutput(p0, p1);
       return this;
    }
    public PickMediaServerInfo$Builder addOutput(PickMediaOutput$Builder p0){
       this.copyOnWrite();
       this.instance.addOutput(p0);
       return this;
    }
    public PickMediaServerInfo$Builder addOutput(PickMediaOutput p0){
       this.copyOnWrite();
       this.instance.addOutput(p0);
       return this;
    }
    public PickMediaServerInfo$Builder clearAction(){
       this.copyOnWrite();
       this.instance.clearAction();
       return this;
    }
    public PickMediaServerInfo$Builder clearName(){
       this.copyOnWrite();
       this.instance.clearName();
       return this;
    }
    public PickMediaServerInfo$Builder clearOutput(){
       this.copyOnWrite();
       this.instance.clearOutput();
       return this;
    }
    public PickMediaServerInfo$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public String getAction(){
       return this.instance.getAction();
    }
    public ByteString getActionBytes(){
       return this.instance.getActionBytes();
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
    }
    public PickMediaOutput getOutput(int p0){
       return this.instance.getOutput(p0);
    }
    public int getOutputCount(){
       return this.instance.getOutputCount();
    }
    public List getOutputList(){
       return Collections.unmodifiableList(this.instance.getOutputList());
    }
    public String getType(){
       return this.instance.getType();
    }
    public ByteString getTypeBytes(){
       return this.instance.getTypeBytes();
    }
    public PickMediaServerInfo$Builder removeOutput(int p0){
       this.copyOnWrite();
       this.instance.removeOutput(p0);
       return this;
    }
    public PickMediaServerInfo$Builder setAction(String p0){
       this.copyOnWrite();
       this.instance.setAction(p0);
       return this;
    }
    public PickMediaServerInfo$Builder setActionBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setActionBytes(p0);
       return this;
    }
    public PickMediaServerInfo$Builder setName(String p0){
       this.copyOnWrite();
       this.instance.setName(p0);
       return this;
    }
    public PickMediaServerInfo$Builder setNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setNameBytes(p0);
       return this;
    }
    public PickMediaServerInfo$Builder setOutput(int p0,PickMediaOutput$Builder p1){
       this.copyOnWrite();
       this.instance.setOutput(p0, p1);
       return this;
    }
    public PickMediaServerInfo$Builder setOutput(int p0,PickMediaOutput p1){
       this.copyOnWrite();
       this.instance.setOutput(p0, p1);
       return this;
    }
    public PickMediaServerInfo$Builder setType(String p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public PickMediaServerInfo$Builder setTypeBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTypeBytes(p0);
       return this;
    }
}
