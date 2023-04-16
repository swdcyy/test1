package com.frog.engine.keyboard.KeyBoardShowParam;
import java.lang.String;
import java.lang.Object;
import org.json.JSONObject;

public class KeyBoardShowParam	// class@001546
{
    public boolean confirmHold;
    public String confirmType;
    public String defaultValue;
    public int maxLength;
    public boolean multiple;

    public void KeyBoardShowParam(String p0,int p1,boolean p2,boolean p3,String p4){
       super();
       this.defaultValue = "";
       this.maxLength = Integer.MAX_VALUE;
       this.confirmType = "done";
       this.defaultValue = p0;
       this.maxLength = p1;
       this.multiple = p2;
       this.confirmHold = p3;
       this.confirmType = p4;
    }
    public void KeyBoardShowParam(JSONObject p0){
       super();
       this.defaultValue = "";
       int i = Integer.MAX_VALUE;
       this.maxLength = i;
       this.confirmType = "done";
       if (p0 != null) {
          this.defaultValue = p0.optString("defaultValue");
          this.maxLength = p0.optInt("maxLength", i);
          this.multiple = p0.optBoolean("multiple");
          this.confirmHold = p0.optBoolean("confirmHold");
          this.confirmType = p0.optString("confirmType");
       }
       return;
    }
    public String getConfirmType(){
       return this.confirmType;
    }
    public String getDefaultValue(){
       return this.defaultValue;
    }
    public int getMaxLength(){
       return this.maxLength;
    }
    public boolean isConfirmHold(){
       return this.confirmHold;
    }
    public boolean isMultiple(){
       return this.multiple;
    }
    public void setConfirmHold(boolean p0){
       this.confirmHold = p0;
    }
    public void setConfirmType(String p0){
       this.confirmType = p0;
    }
    public void setDefaultValue(String p0){
       this.defaultValue = p0;
    }
    public void setMaxLength(int p0){
       this.maxLength = p0;
    }
    public void setMultiple(boolean p0){
       this.multiple = p0;
    }
}
