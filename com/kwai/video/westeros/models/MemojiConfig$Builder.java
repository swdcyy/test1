package com.kwai.video.westeros.models.MemojiConfig$Builder;
import com.kwai.video.westeros.models.MemojiConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MemojiConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MemojiConfig$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class MemojiConfig$Builder extends GeneratedMessageLite$Builder implements MemojiConfigOrBuilder	// class@000fae
{

    public void MemojiConfig$Builder(){
       super(MemojiConfig.DEFAULT_INSTANCE);
    }
    public void MemojiConfig$Builder(MemojiConfig$1 p0){
       super();
    }
    public MemojiConfig$Builder clearAnimojiScriptPath(){
       this.copyOnWrite();
       this.instance.clearAnimojiScriptPath();
       return this;
    }
    public MemojiConfig$Builder clearFacePropScriptPath(){
       this.copyOnWrite();
       this.instance.clearFacePropScriptPath();
       return this;
    }
    public MemojiConfig$Builder clearStylesJsonPath(){
       this.copyOnWrite();
       this.instance.clearStylesJsonPath();
       return this;
    }
    public String getAnimojiScriptPath(){
       return this.instance.getAnimojiScriptPath();
    }
    public ByteString getAnimojiScriptPathBytes(){
       return this.instance.getAnimojiScriptPathBytes();
    }
    public String getFacePropScriptPath(){
       return this.instance.getFacePropScriptPath();
    }
    public ByteString getFacePropScriptPathBytes(){
       return this.instance.getFacePropScriptPathBytes();
    }
    public String getStylesJsonPath(){
       return this.instance.getStylesJsonPath();
    }
    public ByteString getStylesJsonPathBytes(){
       return this.instance.getStylesJsonPathBytes();
    }
    public MemojiConfig$Builder setAnimojiScriptPath(String p0){
       this.copyOnWrite();
       this.instance.setAnimojiScriptPath(p0);
       return this;
    }
    public MemojiConfig$Builder setAnimojiScriptPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setAnimojiScriptPathBytes(p0);
       return this;
    }
    public MemojiConfig$Builder setFacePropScriptPath(String p0){
       this.copyOnWrite();
       this.instance.setFacePropScriptPath(p0);
       return this;
    }
    public MemojiConfig$Builder setFacePropScriptPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setFacePropScriptPathBytes(p0);
       return this;
    }
    public MemojiConfig$Builder setStylesJsonPath(String p0){
       this.copyOnWrite();
       this.instance.setStylesJsonPath(p0);
       return this;
    }
    public MemojiConfig$Builder setStylesJsonPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setStylesJsonPathBytes(p0);
       return this;
    }
}
