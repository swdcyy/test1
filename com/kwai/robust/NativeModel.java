package com.kwai.robust.NativeModel;
import java.io.Serializable;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import java.io.File;

public class NativeModel implements Serializable	// class@0013ec
{
    public String mAbi;
    public String mAlgorithm;
    public String mApkSoEntryName;
    public String mApkSoMd5;
    public String mApkSoSize;
    public String mNewMd5;
    public String mNewName;
    public String mNewSize;
    public String mPatchEntryMd5;
    public String mPatchEntryName;
    public String mPatchEntrySize;
    public static final long serialVersionUID = 0xe8d2c6f68e18ca96;

    public void NativeModel(){
       super();
    }
    public static NativeModel fromJson(JSONObject p0){
       NativeModel nativeModel = new NativeModel();
       nativeModel.mNewName = p0.getString("NewName");
       nativeModel.mNewMd5 = p0.getString("NewMd5");
       nativeModel.mNewSize = p0.getString("NewSize");
       nativeModel.mPatchEntryName = p0.getString("PatchEntryName");
       nativeModel.mPatchEntryMd5 = p0.getString("PatchEntryMd5");
       nativeModel.mPatchEntrySize = p0.getString("PatchEntrySize");
       nativeModel.mApkSoMd5 = p0.getString("ApkSoMd5");
       nativeModel.mApkSoSize = p0.getString("ApkSoSize");
       nativeModel.mApkSoEntryName = p0.getString("ApkSoEntryName");
       nativeModel.mAbi = p0.getString("Abi");
       nativeModel.mAlgorithm = p0.getString("Algorithm");
       return nativeModel;
    }
    public String getAbi(){
       return this.mAbi;
    }
    public String getAlgorithm(){
       return this.mAlgorithm;
    }
    public String getApkSoEntryName(){
       return this.mApkSoEntryName;
    }
    public String getApkSoMd5(){
       return this.mApkSoMd5;
    }
    public String getApkSoSize(){
       return this.mApkSoSize;
    }
    public File getNativeDir(File p0){
       return new File(p0, this.mNewName);
    }
    public String getNewMd5(){
       return this.mNewMd5;
    }
    public String getNewName(){
       return this.mNewName;
    }
    public String getNewSize(){
       return this.mNewSize;
    }
    public String getPatchEntryMd5(){
       return this.mPatchEntryMd5;
    }
    public String getPatchEntryName(){
       return this.mPatchEntryName;
    }
    public String getPatchEntrySize(){
       return this.mPatchEntrySize;
    }
    public void setAbi(String p0){
       this.mAbi = p0;
    }
    public void setAlgorithm(String p0){
       this.mAlgorithm = p0;
    }
    public void setApkSoEntryName(String p0){
       this.mApkSoEntryName = p0;
    }
    public void setApkSoMd5(String p0){
       this.mApkSoMd5 = p0;
    }
    public void setApkSoSize(String p0){
       this.mApkSoMd5 = p0;
    }
    public void setNewMd5(String p0){
       this.mNewMd5 = p0;
    }
    public void setNewName(String p0){
       this.mNewName = p0;
    }
    public void setNewSize(String p0){
       this.mNewSize = p0;
    }
    public void setPatchEntryMd5(String p0){
       this.mPatchEntryMd5 = p0;
    }
    public void setPatchEntryName(String p0){
       this.mPatchEntryName = p0;
    }
    public void setPatchEntrySize(String p0){
       this.mPatchEntrySize = p0;
    }
    public String toJsonString(){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("NewName", this.mNewName);
       jSONObject.put("NewMd5", this.mNewMd5);
       jSONObject.put("NewSize", this.mNewSize);
       jSONObject.put("PatchEntryName", this.mPatchEntryName);
       jSONObject.put("PatchEntryMd5", this.mPatchEntryMd5);
       jSONObject.put("PatchEntrySize", this.mPatchEntrySize);
       jSONObject.put("ApkSoMd5", this.mApkSoMd5);
       jSONObject.put("ApkSoEntryName", this.mApkSoEntryName);
       jSONObject.put("ApkSoSize", this.mApkSoSize);
       jSONObject.put("Abi", this.mAbi);
       jSONObject.put("Algorithm", this.mAlgorithm);
       return jSONObject.toString();
    }
    public String toString(){
       try{
          return this.toJsonString();
       }catch(org.json.JSONException e0){
          return super.toString();
       }
    }
}
