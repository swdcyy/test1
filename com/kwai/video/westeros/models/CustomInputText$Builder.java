package com.kwai.video.westeros.models.CustomInputText$Builder;
import com.kwai.video.westeros.models.CustomInputTextOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.CustomInputText;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.CustomInputText$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class CustomInputText$Builder extends GeneratedMessageLite$Builder implements CustomInputTextOrBuilder	// class@000ef4
{

    public void CustomInputText$Builder(){
       super(CustomInputText.DEFAULT_INSTANCE);
    }
    public void CustomInputText$Builder(CustomInputText$1 p0){
       super();
    }
    public CustomInputText$Builder clearIndex(){
       this.copyOnWrite();
       this.instance.clearIndex();
       return this;
    }
    public CustomInputText$Builder clearInputText(){
       this.copyOnWrite();
       this.instance.clearInputText();
       return this;
    }
    public int getIndex(){
       return this.instance.getIndex();
    }
    public String getInputText(){
       return this.instance.getInputText();
    }
    public ByteString getInputTextBytes(){
       return this.instance.getInputTextBytes();
    }
    public CustomInputText$Builder setIndex(int p0){
       this.copyOnWrite();
       this.instance.setIndex(p0);
       return this;
    }
    public CustomInputText$Builder setInputText(String p0){
       this.copyOnWrite();
       this.instance.setInputText(p0);
       return this;
    }
    public CustomInputText$Builder setInputTextBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setInputTextBytes(p0);
       return this;
    }
}
