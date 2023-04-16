package com.kwai.video.westeros.models.PopupWindowConfigData$Builder;
import com.kwai.video.westeros.models.PopupWindowConfigDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.PopupWindowConfigData;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.PopupWindowConfigData$1;
import java.lang.Iterable;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class PopupWindowConfigData$Builder extends GeneratedMessageLite$Builder implements PopupWindowConfigDataOrBuilder	// class@001017
{

    public void PopupWindowConfigData$Builder(){
       super(PopupWindowConfigData.DEFAULT_INSTANCE);
    }
    public void PopupWindowConfigData$Builder(PopupWindowConfigData$1 p0){
       super();
    }
    public PopupWindowConfigData$Builder addAllAlternativeContent(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllAlternativeContent(p0);
       return this;
    }
    public PopupWindowConfigData$Builder addAlternativeContent(String p0){
       this.copyOnWrite();
       this.instance.addAlternativeContent(p0);
       return this;
    }
    public PopupWindowConfigData$Builder addAlternativeContentBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addAlternativeContentBytes(p0);
       return this;
    }
    public PopupWindowConfigData$Builder clearAlternativeContent(){
       this.copyOnWrite();
       this.instance.clearAlternativeContent();
       return this;
    }
    public PopupWindowConfigData$Builder clearInputHint(){
       this.copyOnWrite();
       this.instance.clearInputHint();
       return this;
    }
    public PopupWindowConfigData$Builder clearTitle(){
       this.copyOnWrite();
       this.instance.clearTitle();
       return this;
    }
    public String getAlternativeContent(int p0){
       return this.instance.getAlternativeContent(p0);
    }
    public ByteString getAlternativeContentBytes(int p0){
       return this.instance.getAlternativeContentBytes(p0);
    }
    public int getAlternativeContentCount(){
       return this.instance.getAlternativeContentCount();
    }
    public List getAlternativeContentList(){
       return Collections.unmodifiableList(this.instance.getAlternativeContentList());
    }
    public String getInputHint(){
       return this.instance.getInputHint();
    }
    public ByteString getInputHintBytes(){
       return this.instance.getInputHintBytes();
    }
    public String getTitle(){
       return this.instance.getTitle();
    }
    public ByteString getTitleBytes(){
       return this.instance.getTitleBytes();
    }
    public PopupWindowConfigData$Builder setAlternativeContent(int p0,String p1){
       this.copyOnWrite();
       this.instance.setAlternativeContent(p0, p1);
       return this;
    }
    public PopupWindowConfigData$Builder setInputHint(String p0){
       this.copyOnWrite();
       this.instance.setInputHint(p0);
       return this;
    }
    public PopupWindowConfigData$Builder setInputHintBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setInputHintBytes(p0);
       return this;
    }
    public PopupWindowConfigData$Builder setTitle(String p0){
       this.copyOnWrite();
       this.instance.setTitle(p0);
       return this;
    }
    public PopupWindowConfigData$Builder setTitleBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTitleBytes(p0);
       return this;
    }
}
