package com.yxcorp.experiment.ABConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.Class;
import yu8.a;
import java.util.Set;
import java.util.Map;
import zk.g;
import com.google.gson.c;
import wu8.a;
import com.google.gson.Gson;
import com.yxcorp.experiment.exception.ParseABConfigValueException;
import java.lang.Throwable;

public class ABConfig implements Serializable	// class@00100b
{
    public int mDynamicFlag;
    public Long mGroupId;
    public String mKey;
    public int mLogPolicy;
    public Object mParsedValue;
    public int mPolicyType;
    public JsonElement mValueJsonElement;
    public String mValueRawString;
    public int mWorldType;
    public static final long serialVersionUID = 0xe3c76fa0c3d9efe2;

    public void ABConfig(){
       super();
       this.mWorldType = 0;
       this.mPolicyType = 0;
       this.mLogPolicy = 0;
       this.mGroupId = null;
       this.mDynamicFlag = 0;
    }
    public boolean getBooleanValue(boolean p0){
       return this.getValue(Boolean.TYPE, Boolean.valueOf(p0)).booleanValue();
    }
    public int getDynamicFlag(){
       return this.mDynamicFlag;
    }
    public Long getGroupId(){
       return this.mGroupId;
    }
    public int getIntValue(int p0){
       return this.getValue(Integer.TYPE, Integer.valueOf(p0)).intValue();
    }
    public String getKey(){
       return this.mKey;
    }
    public int getLogPolicy(){
       return this.mLogPolicy;
    }
    public long getLongValue(long p0){
       return this.getValue(Long.TYPE, Long.valueOf(p0)).longValue();
    }
    public Object getParsedValue(){
       return this.mParsedValue;
    }
    public int getPolicyType(){
       return this.mPolicyType;
    }
    public String getStringValue(String p0){
       return this.getValue(String.class, p0);
    }
    public Object getValue(Type p0,Object p1){
       try{
          p0 = this.getValueWithException(p0);
          if (p0 == null) {
          }else {
             p1 = p0;
          }
          return p1;
       }catch(java.lang.Exception e0){
       }
    }
    public JsonElement getValueJsonElement(){
       return this.mValueJsonElement;
    }
    public String getValueRawString(){
       return this.mValueRawString;
    }
    public Object getValueWithException(Type p0){
       ABConfig tmKey;
       ABConfig tmValueJsonE;
       Object obj;
       String str = "";
       try{
          ABConfig tmParsedValu = this.mParsedValue;
          if (tmParsedValu != null) {
             boolean b = p0.equals(tmParsedValu.getClass());
             ABConfig uABConfig = 1;
             if (!b && a.a.keySet().contains(p0)) {
                Class class = this.mParsedValue.getClass();
                Map b1 = a.b;
                if (b1.containsKey(class)) {
                   Class uClass = b1.get(class);
                   if (uClass != null) {
                      class = uClass;
                   }
                   if (p0.equals(class)) {
                      b = true;
                   }
                }
             }
             if (b || (!p0 instanceof Class || !p0.isAssignableFrom(this.mParsedValue.getClass()))) {
                uABConfig = b;
             }
             if (uABConfig) {
                return this.mParsedValue;
             }
          }
          if (this.mValueJsonElement != null) {
             if (!p0.equals(String.class)) {
                tmParsedValu = this.mValueJsonElement;
                if (tmParsedValu instanceof g && tmParsedValu.a0()) {
                   try{
                      obj = a.a.d(new c().a(this.mValueJsonElement.w()), p0);
                      this.mParsedValue = obj;
                   }catch(java.lang.Exception e1){
                      tmKey = this.mKey;
                      tmValueJsonE = this.mValueJsonElement;
                      String str1 = (tmValueJsonE != null)? tmValueJsonE.toString(): str;
                      throw new ParseABConfigValueException(tmKey, str1, p0.toString(), e1);
                   }
                }
             }
             obj = a.a.d(this.mValueJsonElement, p0);
             this.mParsedValue = obj;
          }else {
             obj = null;
          }
          return obj;
       }catch(java.lang.Exception e1){
          tmKey = this.mKey;
          tmValueJsonE = this.mValueJsonElement;
          if (tmValueJsonE != null) {
             str = tmValueJsonE.toString();
          }
          throw new ParseABConfigValueException(tmKey, str, p0.toString(), e1);
       }
    }
    public int getWorldType(){
       return this.mWorldType;
    }
    public void setDynamicFlag(int p0){
       this.mDynamicFlag = p0;
    }
    public void setGroupId(Long p0){
       this.mGroupId = p0;
    }
    public void setKey(String p0){
       this.mKey = p0;
    }
    public void setLogPolicy(int p0){
       this.mLogPolicy = p0;
       if (p0 && (p0 != 1 && p0 != 2)) {
          this.mLogPolicy = 0;
       }
    label_000d :
       return;
    }
    public void setParsedValue(Object p0){
       this.mParsedValue = p0;
    }
    public void setPolicyType(int p0){
       this.mPolicyType = p0;
       if (p0 && (p0 != 3 && (p0 != 1 && p0 != 2))) {
          this.mPolicyType = 0;
       }
    label_0010 :
       return;
    }
    public void setValueJsonElement(JsonElement p0){
       this.mValueJsonElement = p0;
       this.mParsedValue = null;
    }
    public void setValueRawString(String p0){
       this.mValueRawString = p0;
    }
    public void setWorldType(int p0){
       this.mWorldType = p0;
       if (p0 != 1 && (p0 && p0 != 2)) {
          this.mWorldType = 0;
       }
    label_000d :
       return;
    }
    public String toString(){
       return a.a.q(this);
    }
}
