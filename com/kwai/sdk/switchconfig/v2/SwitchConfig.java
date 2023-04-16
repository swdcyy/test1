package com.kwai.sdk.switchconfig.v2.SwitchConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.Objects;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import zk.g;
import com.kwai.sdk.switchconfig.v2.internal.SwitchConfigJsonTypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.c;
import java.lang.Long;
import java.lang.Number;
import java.lang.Double;
import java.lang.Boolean;
import java.lang.reflect.Type;
import com.kwai.sdk.switchconfig.v2.ConfigPriority;
import java.lang.Class;
import po7.b;
import java.util.Set;
import java.util.Map;
import com.google.gson.Gson;
import com.kwai.sdk.switchconfig.v2.internal.a;
import java.lang.CharSequence;

public class SwitchConfig implements Serializable	// class@001677
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
    public static SwitchConfig parseFromFastString(String p0){
       if (!p0.startsWith("V")) {
          return SwitchConfig.parseFromFastStringV1(p0);
       }
       if (p0.startsWith("V2")) {
          return SwitchConfig.parseFromFastStringV2(p0);
       }
       return null;
    }
    public static SwitchConfig parseFromFastStringV1(String p0){
       int i = 5;
       String[] stringArray = p0.split("\\|", i);
       SwitchConfig switchConfig = new SwitchConfig();
       switchConfig.mWorldType = Integer.parseInt(stringArray[0]);
       switchConfig.mPolicyType = Integer.parseInt(stringArray[1]);
       switchConfig.mVarTag = stringArray[2];
       object oobject = stringArray[3];
       object oobject1 = stringArray[4];
       Objects.requireNonNull(oobject);
       switch (oobject.hashCode()){
           case 'B':
             if (oobject.equals("B")) {
                i = 0;
             }else {
             }
             break;
           case 'D':
             if (oobject.equals("D")) {
                i = 1;
             }else {
             }
             break;
           case 'L':
             if (oobject.equals("L")) {
                i = 2;
             }else {
             }
             break;
           case 'N':
             if (oobject.equals("N")) {
                i = 3;
             }else {
             }
             break;
           case 'O':
             if (oobject.equals("O")) {
                i = 4;
             }else {
             }
             break;
           case 'S':
             if (oobject.equals("S")) {
             }else {
             }
             break;
           default:
             i = -1;
       }
       switch (i){
           case 0:
             switchConfig.mValueJsonElement = new g(Boolean.valueOf(Boolean.parseBoolean(oobject1)));
             break;
           case 1:
             switchConfig.mValueJsonElement = new g(Double.valueOf(Double.parseDouble(oobject1)));
             break;
           case 2:
             switchConfig.mValueJsonElement = new g(Long.valueOf(Long.parseLong(oobject1)));
             break;
           case 3:
             switchConfig.mValueJsonElement = null;
             break;
           case 4:
             switchConfig.mValueJsonElement = SwitchConfigJsonTypeAdapter.JSON_PARSER.a(oobject1);
             break;
           case 5:
             switchConfig.mValueJsonElement = new g(oobject1);
             break;
           default:
             throw new RuntimeException("unknow data type:"+oobject);
       }
       return switchConfig;
    }
    public static SwitchConfig parseFromFastStringV2(String p0){
       String[] stringArray = p0.split("\\|", 7);
       SwitchConfig switchConfig = new SwitchConfig();
       int i = 1;
       switchConfig.mWorldType = Integer.parseInt(stringArray[i]);
       switchConfig.mPolicyType = Integer.parseInt(stringArray[2]);
       switchConfig.mVarTag = stringArray[3];
       switchConfig.mVersion = stringArray[4];
       object oobject = stringArray[5];
       object oobject1 = stringArray[6];
       Objects.requireNonNull(oobject);
       switch (oobject.hashCode()){
           case 'B':
             if (oobject.equals("B")) {
                i = 0;
             }else {
             }
             break;
           case 'D':
             if (oobject.equals("D")) {
             }else {
             }
             break;
           case 'L':
             if (oobject.equals("L")) {
                i = 2;
             }else {
             }
             break;
           case 'N':
             if (oobject.equals("N")) {
                i = 3;
             }else {
             }
             break;
           case 'O':
             if (oobject.equals("O")) {
                i = 4;
             }else {
             }
             break;
           case 'S':
             if (oobject.equals("S")) {
                i = 5;
             }else {
             }
             break;
           default:
             i = -1;
       }
       switch (i){
           case 0:
             switchConfig.mValueJsonElement = new g(Boolean.valueOf(Boolean.parseBoolean(oobject1)));
             break;
           case 1:
             switchConfig.mValueJsonElement = new g(Double.valueOf(Double.parseDouble(oobject1)));
             break;
           case 2:
             switchConfig.mValueJsonElement = new g(Long.valueOf(Long.parseLong(oobject1)));
             break;
           case 3:
             switchConfig.mValueJsonElement = null;
             break;
           case 4:
             switchConfig.mValueJsonElement = SwitchConfigJsonTypeAdapter.JSON_PARSER.a(oobject1);
             break;
           case 5:
             switchConfig.mValueJsonElement = new g(oobject1);
             break;
           default:
             throw new RuntimeException("unknow data type:"+oobject);
       }
       return switchConfig;
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
             Gson gson = 1;
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
                gson = b;
             }
             if (gson) {
                return this.mParsedValue;
             }
          }
          tmParsedValu = this.mValueJsonElement;
          if (tmParsedValu != null) {
             p0 = SwitchConfigJsonTypeAdapter.GSON.d(tmParsedValu, p0);
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
    public String toFastString(){
       String str;
       if (this.mValueJsonElement.E() || this.mValueJsonElement.B()) {
          str = "O|"+SwitchConfigJsonTypeAdapter.GSON.p(this.mValueJsonElement);
       }else if(this.mValueJsonElement.D()){
          str = "N|N";
       }else if(this.mValueJsonElement.F()){
          SwitchConfig tmValueJsonE = this.mValueJsonElement;
          if (tmValueJsonE.G()) {
             str = "B|"+tmValueJsonE.d();
          }else if(tmValueJsonE.a0()){
             str = "S|"+tmValueJsonE.w();
          }else if(tmValueJsonE.N()){
             str = tmValueJsonE.w();
             str = (!str.contains(".") && (str.contains("e") || str.contains("E")))? "D|"+str: "L|"+str;
          }else {
             throw new RuntimeException("unknow primitive type:"+tmValueJsonE.w());
          }
       }else {
          str = "";
       }
       return "V2|"+this.mWorldType+'|'+this.mPolicyType+'|'+this.mVarTag+'|'+this.mVersion+'|'+str;
    }
    public String toString(){
       return new Gson().q(this);
    }
}
