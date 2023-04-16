package com.kwai.sdk.switchconfig.v1.SwitchConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.reflect.Type;
import com.kwai.sdk.switchconfig.v1.ConfigPriority;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.Class;
import mo7.b;
import java.util.Set;
import java.util.Map;
import com.google.gson.Gson;
import com.kwai.sdk.switchconfig.v1.internal.a;
import mo7.e;

public class SwitchConfig implements Serializable	// class@000f26
{
    public ConfigPriority b;
    public Object mParsedValue;
    public int mPolicyType;
    public JsonElement mValueJsonElement;
    public String mVarTag;
    public String mVersion;
    public int mWorldType;
    public static final long serialVersionUID = 0xe3c76fa0c3d9efe2;

    public void SwitchConfig(){
       super();
       this.mWorldType = 0;
       this.mPolicyType = 0;
       this.mVarTag = "";
       this.mVersion = "";
       this.mValueJsonElement = null;
    }
    public boolean getBooleanValue(boolean p0){
       return this.getValue(Boolean.class, Boolean.valueOf(p0)).booleanValue();
    }
    public ConfigPriority getConfigPriority(){
       return this.b;
    }
    public int getIntValue(int p0){
       return this.getValue(Integer.class, Integer.valueOf(p0)).intValue();
    }
    public long getLongValue(long p0){
       return this.getValue(Long.class, Long.valueOf(p0)).longValue();
    }
    public int getPolicyType(){
       return this.mPolicyType;
    }
    public String getStringValue(String p0){
       return this.getValue(String.class, p0);
    }
    public JsonElement getValue(){
       return this.mValueJsonElement;
    }
    public Object getValue(Type p0,Object p1){
       try{
          SwitchConfig tmParsedValu = this.mParsedValue;
          if (tmParsedValu != null) {
             boolean b = p0.equals(tmParsedValu.getClass());
             SwitchConfig switchConfig = 1;
             if (!b && b.a.keySet().contains(p0)) {
                Class class = this.mParsedValue.getClass();
                Map b1 = b.b;
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
                switchConfig = b;
             }
             if (switchConfig) {
                return this.mParsedValue;
             }
          }
          if (this.mValueJsonElement != null) {
             p0 = new Gson().d(this.mValueJsonElement, p0);
             this.mParsedValue = p0;
          }else {
             p0 = null;
          }
          if (p0 != null) {
             p1 = p0;
          }
          return p1;
       }catch(java.lang.Exception e0){
          a.d().c();
          return p1;
       }
    }
    public String getVarTag(){
       return this.mVarTag;
    }
    public String getVersion(){
       return this.mVersion;
    }
    public int getWorldType(){
       return this.mWorldType;
    }
    public void setConfigPriority(ConfigPriority p0){
       this.b = p0;
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
    public void setVarTag(String p0){
       this.mVarTag = p0;
    }
    public void setVersion(String p0){
       this.mVersion = p0;
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
       return e.a.q(this);
    }
}
