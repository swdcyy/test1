package com.kwai.user.base.chat.target.bean.IMChatTargetRequest;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import z1.d;

public class IMChatTargetRequest implements Serializable	// class@001977
{
    public String mSubbiz;
    public String mTargetId;
    public int mTargetType;
    public static final List b;
    public static final long serialVersionUID;

    static {
       String[] stringArray = new String[]{"MERCHANT","adIm","MiniProgram"};
       IMChatTargetRequest.b = Arrays.asList(stringArray);
    }
    public void IMChatTargetRequest(){
       super();
    }
    public void IMChatTargetRequest(String p0,int p1,String p2){
       super();
       if (TextUtils.isEmpty(p0)) {
          p0 = "0";
       }
       this.mSubbiz = p0;
       this.mTargetType = p1;
       this.mTargetId = p2;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMChatTargetRequest.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || (p0.getClass() == IMChatTargetRequest.class && (this.mTargetType == p0.mTargetType && (TextUtils.equals(this.mSubbiz, p0.mSubbiz) && TextUtils.equals(this.mTargetId, p0.mTargetId))))) {
          b = true;
       }
    label_003c :
       return b;
    }
    public String getSubbiz(){
       return this.mSubbiz;
    }
    public String getTargetId(){
       return this.mTargetId;
    }
    public int getTargetType(){
       return this.mTargetType;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, IMChatTargetRequest.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mSubbiz,Integer.valueOf(this.mTargetType),this.mTargetId};
       return d.b(obj);
    }
    public void setSubbiz(String p0){
       this.mSubbiz = p0;
    }
    public void setTargetId(String p0){
       this.mTargetId = p0;
    }
    public void setTargetType(int p0){
       this.mTargetType = p0;
    }
}
