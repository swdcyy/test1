package com.kwai.video.westeros.models.GuideConfig$Builder;
import com.kwai.video.westeros.models.GuideConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.GuideConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.GuideConfig$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class GuideConfig$Builder extends GeneratedMessageLite$Builder implements GuideConfigOrBuilder	// class@000f81
{

    public void GuideConfig$Builder(){
       super(GuideConfig.DEFAULT_INSTANCE);
    }
    public void GuideConfig$Builder(GuideConfig$1 p0){
       super();
    }
    public GuideConfig$Builder clearContent(){
       this.copyOnWrite();
       this.instance.clearContent();
       return this;
    }
    public GuideConfig$Builder clearImage(){
       this.copyOnWrite();
       this.instance.clearImage();
       return this;
    }
    public GuideConfig$Builder clearTitle(){
       this.copyOnWrite();
       this.instance.clearTitle();
       return this;
    }
    public String getContent(){
       return this.instance.getContent();
    }
    public ByteString getContentBytes(){
       return this.instance.getContentBytes();
    }
    public String getImage(){
       return this.instance.getImage();
    }
    public ByteString getImageBytes(){
       return this.instance.getImageBytes();
    }
    public String getTitle(){
       return this.instance.getTitle();
    }
    public ByteString getTitleBytes(){
       return this.instance.getTitleBytes();
    }
    public GuideConfig$Builder setContent(String p0){
       this.copyOnWrite();
       this.instance.setContent(p0);
       return this;
    }
    public GuideConfig$Builder setContentBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setContentBytes(p0);
       return this;
    }
    public GuideConfig$Builder setImage(String p0){
       this.copyOnWrite();
       this.instance.setImage(p0);
       return this;
    }
    public GuideConfig$Builder setImageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setImageBytes(p0);
       return this;
    }
    public GuideConfig$Builder setTitle(String p0){
       this.copyOnWrite();
       this.instance.setTitle(p0);
       return this;
    }
    public GuideConfig$Builder setTitleBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTitleBytes(p0);
       return this;
    }
}
