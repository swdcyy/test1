package com.feature.post.bridge.util.UploadTokenHelper$ApplyTokenResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class UploadTokenHelper$ApplyTokenResponse implements Serializable	// class@0014c5
{
    public int mCode;
    public List mEndPoints;
    public String mFileToken;
    public String mResourceId;

    public void UploadTokenHelper$ApplyTokenResponse(){
       super();
       this.mEndPoints = new ArrayList();
    }
    public final int getMCode(){
       return this.mCode;
    }
    public final List getMEndPoints(){
       return this.mEndPoints;
    }
    public final String getMFileToken(){
       return this.mFileToken;
    }
    public final String getMResourceId(){
       return this.mResourceId;
    }
    public final void setMCode(int p0){
       this.mCode = p0;
    }
    public final void setMEndPoints(List p0){
       a.p(p0, "<set-?>");
       this.mEndPoints = p0;
    }
    public final void setMFileToken(String p0){
       this.mFileToken = p0;
    }
    public final void setMResourceId(String p0){
       this.mResourceId = p0;
    }
}
