package com.yxcorp.gifshow.model.topic.RecommendItem$Tag;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class RecommendItem$Tag implements Serializable	// class@001fa5
{
    public String mContent;
    public int mId;
    public String mKsOrderId;
    public boolean mMarkedWorthless;
    public String mName;
    public String mSpecialId;
    public int mType;
    public static final long serialVersionUID = 0x2e0b2f2a6b8dd766;

    public void RecommendItem$Tag(){
       super();
       this.mType = 0;
    }
    public String getContent(){
       return this.mContent;
    }
    public int getId(){
       return this.mId;
    }
    public String getKsOrderId(){
       return this.mKsOrderId;
    }
    public boolean getMarkedWorthless(){
       return this.mMarkedWorthless;
    }
    public String getName(){
       return this.mName;
    }
    public String getSpecialId(){
       return this.mSpecialId;
    }
    public int getType(){
       return this.mType;
    }
    public void setContent(String p0){
       this.mContent = p0;
    }
    public void setId(int p0){
       this.mId = p0;
    }
    public void setMarkedWorthless(boolean p0){
       this.mMarkedWorthless = p0;
    }
    public void setName(String p0){
       this.mName = p0;
    }
}
