package com.kwai.video.westeros.models.TriggerInputTextData$Builder;
import com.kwai.video.westeros.models.TriggerInputTextDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.TriggerInputTextData;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.TriggerInputTextData$1;
import java.lang.Iterable;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class TriggerInputTextData$Builder extends GeneratedMessageLite$Builder implements TriggerInputTextDataOrBuilder	// class@001067
{

    public void TriggerInputTextData$Builder(){
       super(TriggerInputTextData.DEFAULT_INSTANCE);
    }
    public void TriggerInputTextData$Builder(TriggerInputTextData$1 p0){
       super();
    }
    public TriggerInputTextData$Builder addAllText(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllText(p0);
       return this;
    }
    public TriggerInputTextData$Builder addText(String p0){
       this.copyOnWrite();
       this.instance.addText(p0);
       return this;
    }
    public TriggerInputTextData$Builder addTextBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addTextBytes(p0);
       return this;
    }
    public TriggerInputTextData$Builder clearInputHint(){
       this.copyOnWrite();
       this.instance.clearInputHint();
       return this;
    }
    public TriggerInputTextData$Builder clearText(){
       this.copyOnWrite();
       this.instance.clearText();
       return this;
    }
    public String getInputHint(){
       return this.instance.getInputHint();
    }
    public ByteString getInputHintBytes(){
       return this.instance.getInputHintBytes();
    }
    public String getText(int p0){
       return this.instance.getText(p0);
    }
    public ByteString getTextBytes(int p0){
       return this.instance.getTextBytes(p0);
    }
    public int getTextCount(){
       return this.instance.getTextCount();
    }
    public List getTextList(){
       return Collections.unmodifiableList(this.instance.getTextList());
    }
    public TriggerInputTextData$Builder setInputHint(String p0){
       this.copyOnWrite();
       this.instance.setInputHint(p0);
       return this;
    }
    public TriggerInputTextData$Builder setInputHintBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setInputHintBytes(p0);
       return this;
    }
    public TriggerInputTextData$Builder setText(int p0,String p1){
       this.copyOnWrite();
       this.instance.setText(p0, p1);
       return this;
    }
}
