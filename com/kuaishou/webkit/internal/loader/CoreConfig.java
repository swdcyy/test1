package com.kuaishou.webkit.internal.loader.CoreConfig;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.InputStream;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Exception;
import com.kuaishou.webkit.internal.FileLockHelper;
import com.kuaishou.webkit.internal.FileUtils;

public class CoreConfig	// class@001331
{
    public final String abiDir;
    public final String version;

    public void CoreConfig(String p0,String p1){
       super();
       this.version = p0;
       this.abiDir = p1;
    }
    public static File getConfigFile(File p0){
       return new File(p0, "libkswebview_config.so");
    }
    public static File getNewConfigFile(File p0){
       return new File(p0, "new_libkswebview_config.so");
    }
    public static File getOldConfigFile(File p0){
       return new File(p0, "old_libkswebview_config.so");
    }
    public static CoreConfig makeNullConfig(){
       return new CoreConfig(null, null);
    }
    public static CoreConfig readConfig(File p0){
       return CoreConfig.readConfigFile(CoreConfig.getConfigFile(p0));
    }
    public static CoreConfig readConfigFile(File p0){
       if (!p0.exists()) {
          return CoreConfig.makeNullConfig();
       }
       try{
          FileInputStream uFileInputSt = new FileInputStream(p0);
          Properties properties = new Properties();
          properties.load(uFileInputSt);
          String property = properties.getProperty("version");
          if (!TextUtils.isEmpty(property)) {
             property = property.trim();
          }else {
             KsWebViewUtils.addLoaderStep("d35_"+p0.getAbsolutePath());
          }
          String property1 = properties.getProperty("abi");
          if (property1 != null) {
             property1 = property1.trim();
          }
          if (TextUtils.isEmpty(property1)) {
             property1 = (KsWebViewUtils.is64Bit())? "arm64-v8a": "armeabi-v7a";
          }
       label_0060 :
          uFileInputSt.close();
          return new CoreConfig(property, "lib/"+property1);
       }catch(java.lang.Exception e6){
          KsWebViewUtils.addLoaderStep("d32_"+e6.getClass().getSimpleName());
          e6.printStackTrace();
          return CoreConfig.makeNullConfig();
       }
    }
    public static CoreConfig readNewConfig(File p0){
       return CoreConfig.readConfigFile(CoreConfig.getNewConfigFile(p0));
    }
    public static CoreConfig readOldConfig(File p0){
       return CoreConfig.readConfigFile(CoreConfig.getOldConfigFile(p0));
    }
    public static boolean syncDeleteConfig(File p0){
       File configFile = CoreConfig.getConfigFile(p0);
       FileLockHelper uFileLockHel = CoreConfig.tryLockConfigFile(p0, 8);
       if (uFileLockHel != null) {
          uFileLockHel.close();
          return FileUtils.deleteFileOrDir(configFile);
       }else if(uFileLockHel != null){
          uFileLockHel.close();
       }
       return false;
    }
    public static boolean syncInstallConfig(File p0){
       File newConfigFil = CoreConfig.getNewConfigFile(p0);
       File configFile = CoreConfig.getConfigFile(p0);
       FileLockHelper uFileLockHel = CoreConfig.tryLockConfigFile(p0, 8);
       if (uFileLockHel != null) {
          uFileLockHel.close();
          return FileUtils.moveFile(newConfigFil, configFile);
       }else if(uFileLockHel != null){
          uFileLockHel.close();
       }
       return false;
    }
    public static CoreConfig syncReadConfig(File p0){
       FileLockHelper uFileLockHel = CoreConfig.tryLockConfigFile(p0, 3);
       if (uFileLockHel == null) {
          KsWebViewUtils.addLoaderStep("d11_"+p0.getAbsolutePath());
       }
       CoreConfig uCoreConfig = CoreConfig.readConfig(p0);
       if (uFileLockHel != null) {
          uFileLockHel.close();
       }
       return uCoreConfig;
    }
    public static FileLockHelper tryLockConfigFile(File p0,int p1){
       if (!p0.exists()) {
          KsWebViewUtils.addLoaderStep("d21");
          return null;
       }else {
          File uFile = new File(p0, "core_config.lock");
          while (true) {
             FileLockHelper uFileLockHel = FileLockHelper.tryGetFileLock(uFile);
             if (uFileLockHel != null) {
                return uFileLockHel;
             }
             p1--;
             if (p1 <= 0) {
                break ;
             }
          }
          KsWebViewUtils.addLoaderStep("d22");
          return null;
       }
    }
    public boolean isArm64(){
       if (!TextUtils.isEmpty(this.abiDir) && (this.abiDir).contains("arm64-v8a")) {
          return true;
       }
       return false;
    }
}
