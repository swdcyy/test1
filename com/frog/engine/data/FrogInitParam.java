package com.frog.engine.data.FrogInitParam;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.Exception;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class FrogInitParam	// class@0014fb
{
    public boolean enableDebugger;
    public boolean enableReportFrogNetwork;
    public String fileSystemRootDir;
    public String frogConfigPath;
    public int frogSourceType;
    public Map frogSubPkgPathMap;
    public String gamePath;
    public Boolean isLandScapeGame;
    public String jsPluginName;
    public String jsPluginRootDir;
    public JSONObject launchOption;
    public boolean reportPrefLogger;
    public String scriptName;
    public boolean trustLoadSoLib;
    public boolean useFfmpeg;

    public void FrogInitParam(){
       super();
       this.trustLoadSoLib = false;
       this.frogSourceType = 0;
    }
    public void FrogInitParam(String p0){
       String str1;
       super();
       boolean b = false;
       this.trustLoadSoLib = b;
       this.frogSourceType = b;
       if (!TextUtils.isEmpty(p0)) {
          try{
             JSONObject jSONObject = new JSONObject(p0);
             this.trustLoadSoLib = jSONObject.optBoolean("trust_load_so_lib");
             this.gamePath = jSONObject.optString("game_path");
             this.scriptName = jSONObject.optString("script_path");
             this.launchOption = jSONObject.optJSONObject("launch_option");
             this.fileSystemRootDir = jSONObject.optString("file_system_root_dir");
             this.jsPluginRootDir = jSONObject.optString("js_plugin_root_dir");
             this.jsPluginName = jSONObject.optString("js_plugin_root_script_path");
             this.enableDebugger = jSONObject.optBoolean("enable_debugger");
             this.useFfmpeg = jSONObject.optBoolean("use_ffmpeg");
             this.reportPrefLogger = jSONObject.optBoolean("report_pref_logger");
             this.enableReportFrogNetwork = jSONObject.optBoolean("report_pref_http");
             this.frogSourceType = jSONObject.optInt("frog_source_type", b);
             JSONObject jSONObject1 = jSONObject.optJSONObject("frog_subpkg_path_map");
             if (jSONObject1 != null) {
                this.frogSubPkgPathMap = new HashMap();
                Iterator iterator = jSONObject1.keys();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   if (TextUtils.isEmpty(str)) {
                      continue ;
                   }else {
                      str1 = jSONObject1.optString(str);
                      if (TextUtils.isEmpty(str1)) {
                         continue ;
                      }
                   }
                   this.frogSubPkgPathMap.put(str, str1);
                }
             }else {
                this.frogSubPkgPathMap = null;
             }
             this.frogConfigPath = jSONObject.optString("key_frog_config_path");
          }catch(java.lang.Exception e6){
             e6.printStackTrace();
          }
       }
    }
    public String getFileSystemRootDir(){
       return this.fileSystemRootDir;
    }
    public String getGamePath(){
       return this.gamePath;
    }
    public String getJsPluginName(){
       return this.jsPluginName;
    }
    public String getJsPluginRootDir(){
       return this.jsPluginRootDir;
    }
    public Boolean getLandScapeGame(){
       return this.isLandScapeGame;
    }
    public JSONObject getLaunchOption(){
       return this.launchOption;
    }
    public String getScriptName(){
       return this.scriptName;
    }
    public boolean isEnableDebugger(){
       return this.enableDebugger;
    }
    public boolean isReportPrefLogger(){
       return this.reportPrefLogger;
    }
    public boolean isTrustLoadSoLib(){
       return this.trustLoadSoLib;
    }
    public boolean isUseFfmpeg(){
       return this.useFfmpeg;
    }
    public boolean legal(){
       Object obj = PatchProxy.apply(null, this, FrogInitParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(this.gamePath)) {
          return false;
       }
       return true;
    }
    public void setEnableDebugger(boolean p0){
       this.enableDebugger = p0;
    }
    public void setEnableReportFrogNetwork(boolean p0){
       this.enableReportFrogNetwork = p0;
    }
    public void setFileSystemRootDir(String p0){
       this.fileSystemRootDir = p0;
    }
    public void setFrogConfigPath(String p0){
       this.frogConfigPath = p0;
    }
    public void setFrogSourceType(int p0){
       this.frogSourceType = p0;
    }
    public void setFrogSubPkgPathMap(Map p0){
       this.frogSubPkgPathMap = p0;
    }
    public void setGamePath(String p0){
       this.gamePath = p0;
    }
    public void setJsPluginName(String p0){
       this.jsPluginName = p0;
    }
    public void setJsPluginRootDir(String p0){
       this.jsPluginRootDir = p0;
    }
    public void setLandScapeGame(Boolean p0){
       this.isLandScapeGame = p0;
    }
    public void setLaunchOption(JSONObject p0){
       this.launchOption = p0;
    }
    public void setReportPrefLogger(boolean p0){
       this.reportPrefLogger = p0;
    }
    public void setScriptName(String p0){
       this.scriptName = p0;
    }
    public void setTrustLoadSoLib(boolean p0){
       this.trustLoadSoLib = p0;
    }
    public void setUseFfmpeg(boolean p0){
       this.useFfmpeg = p0;
    }
    public String toJSONString(){
       JSONObject obj = PatchProxy.apply(null, this, FrogInitParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       try{
          String str = "trust_load_so_lib";
          obj.put(str, this.trustLoadSoLib);
          obj.put("game_path", this.gamePath);
          obj.put("script_path", this.scriptName);
          try{
             str = "launch_option";
             obj.put(str, this.launchOption);
             obj.put("file_system_root_dir", this.fileSystemRootDir);
             obj.put("js_plugin_root_dir", this.jsPluginRootDir);
             try{
                str = "js_plugin_root_script_path";
                obj.put(str, this.jsPluginName);
                obj.put("enable_debugger", this.enableDebugger);
                obj.put("use_ffmpeg", this.useFfmpeg);
                try{
                   str = "report_pref_logger";
                   obj.put(str, this.reportPrefLogger);
                   obj.put("report_pref_http", this.enableReportFrogNetwork);
                   obj.put("frog_source_type", this.frogSourceType);
                   try{
                      str = "key_frog_config_path";
                      obj.put(str, this.frogConfigPath);
                      FrogInitParam tfrogSubPkgP = this.frogSubPkgPathMap;
                      if (tfrogSubPkgP != null && !tfrogSubPkgP.isEmpty()) {
                         obj.put("frog_subpkg_path_map", new JSONObject(this.frogSubPkgPathMap));
                      }
                   }catch(java.lang.Exception e1){
                   label_0087 :
                      e1.printStackTrace();
                   }
                   return obj.toString();
                }catch(java.lang.Exception e1){
                }
             }catch(java.lang.Exception e1){
             }
          }catch(java.lang.Exception e1){
          }
       }catch(java.lang.Exception e1){
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FrogInitParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "[trustLoadSoLib:"+this.trustLoadSoLib+",gamePath:"+this.gamePath+",scriptPath:"+this.scriptName+",systempath:"+this.fileSystemRootDir+"  isLandScapre"+this.isLandScapeGame+"]";
    }
}
