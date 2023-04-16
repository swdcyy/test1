package com.kwai.video.westeros.models.PopupWindowConfig$Builder;
import com.kwai.video.westeros.models.PopupWindowConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.PopupWindowConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.PopupWindowConfig$1;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.ByteString;
import java.util.Collections;
import com.kwai.video.westeros.models.PopupWindowConfigData;
import java.lang.IllegalArgumentException;

public final class PopupWindowConfig$Builder extends GeneratedMessageLite$Builder implements PopupWindowConfigOrBuilder	// class@001013
{

    public void PopupWindowConfig$Builder(){
       super(PopupWindowConfig.DEFAULT_INSTANCE);
    }
    public void PopupWindowConfig$Builder(PopupWindowConfig$1 p0){
       super();
    }
    public PopupWindowConfig$Builder clearBgColor(){
       this.copyOnWrite();
       this.instance.clearBgColor();
       return this;
    }
    public PopupWindowConfig$Builder clearData(){
       this.copyOnWrite();
       this.instance.getMutableDataMap().clear();
       return this;
    }
    public PopupWindowConfig$Builder clearMaxInputLength(){
       this.copyOnWrite();
       this.instance.clearMaxInputLength();
       return this;
    }
    public PopupWindowConfig$Builder clearTriggerHeight(){
       this.copyOnWrite();
       this.instance.clearTriggerHeight();
       return this;
    }
    public PopupWindowConfig$Builder clearTriggerWidth(){
       this.copyOnWrite();
       this.instance.clearTriggerWidth();
       return this;
    }
    public PopupWindowConfig$Builder clearTriggerX(){
       this.copyOnWrite();
       this.instance.clearTriggerX();
       return this;
    }
    public PopupWindowConfig$Builder clearTriggerY(){
       this.copyOnWrite();
       this.instance.clearTriggerY();
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
    public PopupWindowConfigData getDataOrDefault(String p0,PopupWindowConfigData p1){
       Objects.requireNonNull(p0);
       Map dataMap = this.instance.getDataMap();
       if (dataMap.containsKey(p0)) {
          p1 = dataMap.get(p0);
       }
       return p1;
    }
    public PopupWindowConfigData getDataOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map dataMap = this.instance.getDataMap();
       if (dataMap.containsKey(p0)) {
          return dataMap.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public int getMaxInputLength(){
       return this.instance.getMaxInputLength();
    }
    public float getTriggerHeight(){
       return this.instance.getTriggerHeight();
    }
    public float getTriggerWidth(){
       return this.instance.getTriggerWidth();
    }
    public float getTriggerX(){
       return this.instance.getTriggerX();
    }
    public float getTriggerY(){
       return this.instance.getTriggerY();
    }
    public PopupWindowConfig$Builder putAllData(Map p0){
       this.copyOnWrite();
       this.instance.getMutableDataMap().putAll(p0);
       return this;
    }
    public PopupWindowConfig$Builder putData(String p0,PopupWindowConfigData p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableDataMap().put(p0, p1);
       return this;
    }
    public PopupWindowConfig$Builder removeData(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableDataMap().remove(p0);
       return this;
    }
    public PopupWindowConfig$Builder setBgColor(String p0){
       this.copyOnWrite();
       this.instance.setBgColor(p0);
       return this;
    }
    public PopupWindowConfig$Builder setBgColorBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setBgColorBytes(p0);
       return this;
    }
    public PopupWindowConfig$Builder setMaxInputLength(int p0){
       this.copyOnWrite();
       this.instance.setMaxInputLength(p0);
       return this;
    }
    public PopupWindowConfig$Builder setTriggerHeight(float p0){
       this.copyOnWrite();
       this.instance.setTriggerHeight(p0);
       return this;
    }
    public PopupWindowConfig$Builder setTriggerWidth(float p0){
       this.copyOnWrite();
       this.instance.setTriggerWidth(p0);
       return this;
    }
    public PopupWindowConfig$Builder setTriggerX(float p0){
       this.copyOnWrite();
       this.instance.setTriggerX(p0);
       return this;
    }
    public PopupWindowConfig$Builder setTriggerY(float p0){
       this.copyOnWrite();
       this.instance.setTriggerY(p0);
       return this;
    }
}
