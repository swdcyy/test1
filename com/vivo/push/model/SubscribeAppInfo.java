package com.vivo.push.model.SubscribeAppInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.lang.StringBuilder;

public class SubscribeAppInfo	// class@001089
{
    public int mActualStatus;
    public String mName;
    public int mTargetStatus;

    public void SubscribeAppInfo(String p0,int p1,int p2){
       super();
       this.mName = p0;
       this.mTargetStatus = p1;
       this.mActualStatus = p2;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (this.getClass() != p0.getClass()) {
          return false;
       }
       SubscribeAppInfo tmName = this.mName;
       if (tmName == null) {
          if (p0.mName != null) {
             return false;
          }
       }else if(!tmName.equals(p0.mName)){
          return false;
       }
       if (this.mTargetStatus == p0.mTargetStatus) {
          return true;
       }else {
          return false;
       }
    }
    public int getActualStatus(){
       return this.mActualStatus;
    }
    public String getName(){
       return this.mName;
    }
    public int getTargetStatus(){
       return this.mTargetStatus;
    }
    public int hashCode(){
       SubscribeAppInfo tmName = this.mName;
       int i = (tmName == null)? 0: tmName.hashCode();
       return (((i + 31) * 31) + this.mTargetStatus);
    }
    public void setActualStatus(int p0){
       this.mActualStatus = p0;
    }
    public void setName(String p0){
       this.mName = p0;
    }
    public void setTargetStatus(int p0){
       this.mTargetStatus = p0;
    }
    public String toString(){
       return "SubscribeAppInfo [mName="+this.mName+", mTargetStatus="+this.mTargetStatus+", mActualStatus="+this.mActualStatus+"]";
    }
}
