package com.yxcorp.gifshow.model.CustomConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.util.Map;

public final class CustomConfig implements Serializable	// class@001dff
{
    public List filePaths;
    public Map inputText;
    public Map pickMoreMedia;
    public List thingsTodo;

    public void CustomConfig(){
       super();
    }
    public final List getFilePaths(){
       return this.filePaths;
    }
    public final Map getInputText(){
       return this.inputText;
    }
    public final Map getPickMoreMedia(){
       return this.pickMoreMedia;
    }
    public final List getThingsTodo(){
       return this.thingsTodo;
    }
    public final void setFilePaths(List p0){
       this.filePaths = p0;
    }
    public final void setInputText(Map p0){
       this.inputText = p0;
    }
    public final void setPickMoreMedia(Map p0){
       this.pickMoreMedia = p0;
    }
    public final void setThingsTodo(List p0){
       this.thingsTodo = p0;
    }
}
