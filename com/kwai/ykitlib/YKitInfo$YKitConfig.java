package com.kwai.ykitlib.YKitInfo$YKitConfig;
import java.lang.Object;
import java.util.HashMap;

public class YKitInfo$YKitConfig	// class@001151
{
    public String business;
    public int gpuType;
    public String jsonParam;
    public HashMap modelFolderPaths;
    public String modelPath;
    public String moduleType;
    public String useMode;

    public void YKitInfo$YKitConfig(){
       super();
       this.moduleType = "";
       this.modelFolderPaths = new HashMap();
       this.gpuType = 0;
       this.useMode = "";
       this.business = "";
       this.modelPath = "";
       this.jsonParam = "";
    }
}
