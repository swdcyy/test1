package com.kwai.video.westeros.models.TriggerInputTextConfig$Builder;
import com.kwai.video.westeros.models.TriggerInputTextConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.TriggerInputTextConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.TriggerInputTextConfig$1;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.ByteString;
import java.util.Collections;
import com.kwai.video.westeros.models.TriggerInputTextData;
import java.lang.IllegalArgumentException;

public final class TriggerInputTextConfig$Builder extends GeneratedMessageLite$Builder implements TriggerInputTextConfigOrBuilder	// class@001062
{

    public void TriggerInputTextConfig$Builder(){
       super(TriggerInputTextConfig.DEFAULT_INSTANCE);
    }
    public void TriggerInputTextConfig$Builder(TriggerInputTextConfig$1 p0){
       super();
    }
    public TriggerInputTextConfig$Builder clearBgColor(){
       this.copyOnWrite();
       this.instance.clearBgColor();
       return this;
    }
    public TriggerInputTextConfig$Builder clearData(){
       this.copyOnWrite();
       this.instance.getMutableDataMap().clear();
       return this;
    }
    public TriggerInputTextConfig$Builder clearFontPath(){
       this.copyOnWrite();
       this.instance.clearFontPath();
       return this;
    }
    public TriggerInputTextConfig$Builder clearMaxInputLength(){
       this.copyOnWrite();
       this.instance.clearMaxInputLength();
       return this;
    }
    public TriggerInputTextConfig$Builder clearTextColor(){
       this.copyOnWrite();
       this.instance.clearTextColor();
       return this;
    }
    public TriggerInputTextConfig$Builder clearTitle(){
       this.copyOnWrite();
       this.instance.clearTitle();
       return this;
    }
    public boolean containsData(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getDataMap().containsKey(p0);
    }
    public String getBgColor(){
       return this.instance.getBgColor();
    }
    public ByteString getBgColorBytes(){
       return this.instance.getBgColorBytes();
    }
    public Map getData(){
       return this.getDataMap();
    }
    public int getDataCount(){
       return this.instance.getDataMap().size();
    }
    public Map getDataMap(){
       return Collections.unmodifiableMap(this.instance.getDataMap());
    }
    public TriggerInputTextData getDataOrDefault(String p0,TriggerInputTextData p1){
       Objects.requireNonNull(p0);
       Map dataMap = this.instance.getDataMap();
       if (dataMap.containsKey(p0)) {
          p1 = dataMap.get(p0);
       }
       return p1;
    }
    public TriggerInputTextData getDataOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map dataMap = this.instance.getDataMap();
       if (dataMap.containsKey(p0)) {
          return dataMap.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public String getFontPath(){
       return this.instance.getFontPath();
    }
    public ByteString getFontPathBytes(){
       return this.instance.getFontPathBytes();
    }
    public int getMaxInputLength(){
       return this.instance.getMaxInputLength();
    }
    public String getTextColor(){
       return this.instance.getTextColor();
    }
    public ByteString getTextColorBytes(){
       return this.instance.getTextColorBytes();
    }
    public String getTitle(){
       return this.instance.getTitle();
    }
    public ByteString getTitleBytes(){
       return this.instance.getTitleBytes();
    }
    public TriggerInputTextConfig$Builder putAllData(Map p0){
       this.copyOnWrite();
       this.instance.getMutableDataMap().putAll(p0);
       return this;
    }
    public TriggerInputTextConfig$Builder putData(String p0,TriggerInputTextData p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableDataMap().put(p0, p1);
       return this;
    }
    public TriggerInputTextConfig$Builder removeData(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableDataMap().remove(p0);
       return this;
    }
    public TriggerInputTextConfig$Builder setBgColor(String p0){
       this.copyOnWrite();
       this.instance.setBgColor(p0);
       return this;
    }
    public TriggerInputTextConfig$Builder setBgColorBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setBgColorBytes(p0);
       return this;
    }
    public TriggerInputTextConfig$Builder setFontPath(String p0){
       this.copyOnWrite();
       this.instance.setFontPath(p0);
       return this;
    }
    public TriggerInputTextConfig$Builder setFontPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setFontPathBytes(p0);
       return this;
    }
    public TriggerInputTextConfig$Builder setMaxInputLength(int p0){
       this.copyOnWrite();
       this.instance.setMaxInputLength(p0);
       return this;
    }
    public TriggerInputTextConfig$Builder setTextColor(String p0){
       this.copyOnWrite();
       this.instance.setTextColor(p0);
       return this;
    }
    public TriggerInputTextConfig$Builder setTextColorBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTextColorBytes(p0);
       return this;
    }
    public TriggerInputTextConfig$Builder setTitle(String p0){
       this.copyOnWrite();
       this.instance.setTitle(p0);
       return this;
    }
    public TriggerInputTextConfig$Builder setTitleBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTitleBytes(p0);
       return this;
    }
}
