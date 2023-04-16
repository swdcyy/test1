package com.kwai.video.kstmf.KSTMFSoManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.kstmf.KSTMFSoManager$1;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import com.kwai.video.kstmf.KSTMFSoManager$2;
import java.io.File;
import java.lang.Integer;
import com.google.gson.JsonObject;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.util.List;
import java.util.Iterator;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import java.lang.StringBuilder;
import android.content.Context;
import java.util.concurrent.Executors;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonElement;
import com.google.gson.c;
import java.lang.Boolean;
import java.lang.Exception;
import com.kwai.video.kstmf.KSTMFMD5Utils;

public class KSTMFSoManager	// class@000943
{
    public File mBackupSoDir;
    public Context mContext;
    public final Object mLock;
    public String mSoLoadErrorMsg;
    public boolean mTmfEnableBackupApkFFmpeg;
    public boolean mTmfEnableBackupDvaFFmpeg;
    public boolean mTmfEnableDvaDownload;
    public boolean mTmfEnableLoadSo;
    public boolean mTmfEnableUseBackupFFmpeg;
    public boolean mTmfForceEnableDvaDownload;
    public int mTmfSoLoadMaxRetryCount;
    public int mTmfSoLoadRetryCount;
    public JsonObject reportJsonObject;
    public ExecutorService singleThreadExecutor;
    public static String TAG = "KSTMF";
    public static KSTMFSoManager sInstance;

    public void KSTMFSoManager(){
       super();
       this.mSoLoadErrorMsg = null;
       this.mTmfEnableBackupApkFFmpeg = false;
       this.mTmfEnableUseBackupFFmpeg = false;
       this.mTmfEnableBackupDvaFFmpeg = true;
       this.mTmfForceEnableDvaDownload = false;
       this.mTmfEnableLoadSo = false;
       this.mTmfEnableDvaDownload = false;
       this.mTmfSoLoadMaxRetryCount = 3;
       this.mTmfSoLoadRetryCount = 0;
       this.mLock = new Object();
       this.singleThreadExecutor = null;
    }
    public static int copyFile(String p0,String p1){
       FileInputStream obj = PatchProxy.applyTwoRefs(p0, p1, null, KSTMFSoManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new FileInputStream(p0);
       FileOutputStream uFileOutputS = new FileOutputStream(p1);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       byte[] uobyteArray = new byte[1024];
       int i = obj.read(uobyteArray);
       while (i != -1) {
          uByteArrayOu.write(uobyteArray, 0, i);
       }
       uFileOutputS.write(uByteArrayOu.toByteArray());
       uByteArrayOu.close();
       uFileOutputS.close();
       obj.close();
       return 0;
    }
    public static String getExtensionName(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSTMFSoManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          int i = p0.lastIndexOf(46);
          if (i > -1 && i < (p0.length() - 1)) {
             return (p0.substring((i + 1))).toLowerCase();
          }
       }
       return null;
    }
    public static synchronized KSTMFSoManager getInstance(){
       _monitor_enter(KSTMFSoManager.class);
       Object obj = PatchProxy.apply(null, null, KSTMFSoManager.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(KSTMFSoManager.class);
          return obj;
       }else if(KSTMFSoManager.sInstance == null){
          KSTMFSoManager.sInstance = new KSTMFSoManager();
       }
       _monitor_exit(KSTMFSoManager.class);
       return KSTMFSoManager.sInstance;
    }
    public static native String nativeGetFFVersion();
    public synchronized void backupApkFFmpeg(){
       if (PatchProxy.applyVoid(null, this, KSTMFSoManager.class, "12")) {
          return;
       }
       if (this.mTmfEnableBackupApkFFmpeg == null || TextUtils.equals("NONE", "TMF_THIN_FULL")) {
          return;
       }
       this.singleThreadExecutor.execute(new KSTMFSoManager$1(this));
       return;
    }
    public synchronized void backupPluginSo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSTMFSoManager.class, "13")) {
          return;
       }
       if (this.mTmfEnableBackupDvaFFmpeg == null) {
          return;
       }
       this.singleThreadExecutor.execute(new KSTMFSoManager$2(this, p0));
       return;
    }
    public synchronized final String getBackupFullFFmpegPath(){
       object oobject;
       object oobject1;
       KSTMFSoManager obj = PatchProxy.apply(null, this, KSTMFSoManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBackupSoDir;
       if (obj != null && (!obj.exists() || !this.mBackupSoDir.isDirectory())) {
          return null;
       }
       File[] uFileArray = this.mBackupSoDir.listFiles();
       if (uFileArray == null || uFileArray.length <= 0) {
          return null;
       }
       int len = uFileArray.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < len) {
             oobject = uFileArray[i1];
             String extensionNam = KSTMFSoManager.getExtensionName(oobject.getPath());
             String name = oobject.getName();
             name = (TextUtils.isEmpty(name))? "": name.split("-")[i];
             if (!TextUtils.isEmpty(extensionNam) && (TextUtils.equals(extensionNam, "so") && TextUtils.equals("30d6bc259d76805709c1e4f0dc1c8f3955a7729a", name))) {
                obj = this.reportJsonObject;
                if (obj != null) {
                   this.safeAddJsonProperty(obj, "local_find", Integer.valueOf(1));
                label_00a5 :
                   if (oobject == null) {
                      break ;
                   }else {
                      return oobject.getAbsolutePath();
                   }
                }else {
                   goto label_00a5 ;
                }
             }else if(this.reportJsonObject != null){
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("new_abi", "30d6bc259d76805709c1e4f0dc1c8f3955a7729a");
                jsonObject.c0("old_abi", oobject.getName());
                this.safeAddJsonProperty(this.reportJsonObject, "abi_remove", this.safeGetJsonString(jsonObject));
             }
             oobject.delete();
             i1 = i1 + 1;
          }else {
             oobject = null;
             goto label_00a5 ;
          }
       }
       return null;
    }
    public boolean getForceEnableDvaDownload(){
       return this.mTmfForceEnableDvaDownload;
    }
    public synchronized final String getNameFromDvaPlugin(){
       PluginConfig pluginConfig;
       Iterator obj = PatchProxy.apply(null, this, KSTMFSoManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Dva.instance().getPluginInstallManager().b().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return "30d6bc259d76805709c1e4f0dc1c8f3955a7729a";
          }
          pluginConfig = obj.next();
          if (TextUtils.equals("tmf_ffmpeg_full", pluginConfig.name)) {
             break ;
          }
       }
       return "30d6bc259d76805709c1e4f0dc1c8f3955a7729a-"+pluginConfig.md5;
    }
    public boolean getTmfEnableDvaDownload(){
       return this.mTmfEnableDvaDownload;
    }
    public void init(Context p0,JsonObject p1){
       int i1;
       String str7;
       String str = "tmfSoLoadMaxRetryCount";
       String str1 = "tmfForceEnableDvaDownload";
       String str2 = "tmfEnableDvaDownload";
       String str3 = "tmfEnableLoadSo";
       String str4 = "tmfEnableBackupDvaFFmpeg";
       String str5 = "tmfEnableUseBackupFFmpeg";
       String str6 = "tmfEnableBackupApkFFmpeg";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSTMFSoManager.class, "2")) {
          return;
       }
       this.mContext = p0;
       int i = 0;
       this.mBackupSoDir = p0.getDir("tmf", i);
       this.singleThreadExecutor = Executors.newSingleThreadExecutor();
       try{
          i1 = 1;
          str7 = a.t().c("tmfFFConfig", "{}");
          if (!TextUtils.isEmpty(str7)) {
             this.safeAddJsonProperty(p1, "ori_config", str7);
             JsonObject jsonObject1 = c.d(str7).r();
             if (jsonObject1.s0(str6)) {
                this.mTmfEnableBackupApkFFmpeg = jsonObject1.e0(str6).d();
             }
             if (jsonObject1.s0(str5)) {
                this.mTmfEnableUseBackupFFmpeg = jsonObject1.e0(str5).d();
             }
             if (jsonObject1.s0(str4)) {
                this.mTmfEnableBackupDvaFFmpeg = jsonObject1.e0(str4).d();
             }
             if (jsonObject1.s0(str3)) {
                this.mTmfEnableLoadSo = jsonObject1.e0(str3).d();
             }
             if (jsonObject1.s0(str2)) {
                this.mTmfEnableDvaDownload = jsonObject1.e0(str2).d();
             }
             if (jsonObject1.s0(str1)) {
                this.mTmfForceEnableDvaDownload = jsonObject1.e0(str1).d();
             }
             if (jsonObject1.s0(str)) {
                this.mTmfSoLoadMaxRetryCount = jsonObject1.e0(str).p();
             }
          }
       }catch(java.lang.Exception e0){
          this.safeAddJsonProperty(p1, "switch_config_error", Integer.valueOf(i1));
       }
       str7 = "NONE";
       if (TextUtils.equals(str7, "TMF_THIN_FULL")) {
          this.mTmfEnableLoadSo = i1;
       }
       if (this.mTmfEnableBackupApkFFmpeg != null && TextUtils.equals(str7, "TMF_THIN_FULL")) {
          this.safeAddJsonProperty(p1, "backup_apk_error_thin", Integer.valueOf(i1));
          this.mTmfEnableBackupApkFFmpeg = i;
       }
       if (this.mTmfEnableDvaDownload == null && TextUtils.equals(str7, "TMF_THIN_FULL")) {
          this.safeAddJsonProperty(p1, "download_dva_error_thin", Integer.valueOf(i1));
          this.mTmfEnableDvaDownload = i1;
       }
       if (this.mTmfEnableUseBackupFFmpeg == null && TextUtils.equals(str7, "TMF_THIN_FULL")) {
          this.safeAddJsonProperty(p1, "use_backup_error_thin", Integer.valueOf(i1));
          this.mTmfEnableUseBackupFFmpeg = i1;
       }
       this.reportJsonObject = p1;
       if (p1 != null) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.H(str6, Boolean.valueOf(this.mTmfEnableBackupApkFFmpeg));
          jsonObject.H(str5, Boolean.valueOf(this.mTmfEnableUseBackupFFmpeg));
          jsonObject.H(str4, Boolean.valueOf(this.mTmfEnableBackupDvaFFmpeg));
          jsonObject.H(str3, Boolean.valueOf(this.mTmfEnableLoadSo));
          jsonObject.H(str2, Boolean.valueOf(this.mTmfEnableDvaDownload));
          jsonObject.H(str1, Boolean.valueOf(this.mTmfForceEnableDvaDownload));
          jsonObject.a0(e0, Integer.valueOf(this.mTmfSoLoadMaxRetryCount));
          this.safeAddJsonProperty(p1, "config", this.safeGetJsonString(jsonObject));
          this.safeAddJsonProperty(p1, "new_config", jsonObject);
       }
       return;
    }
    public int loadBackupFFmpegSo(){
       String obj = PatchProxy.apply(null, this, KSTMFSoManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.mTmfEnableUseBackupFFmpeg == null) {
          return -60011;
       }
       try{
          obj = KSTMFSoManager.getInstance().getBackupFullFFmpegPath();
          if (!TextUtils.isEmpty(obj)) {
             return this.loadFullFFmpeg(obj, 1);
          }
          return -60009;
       }catch(java.lang.Exception e0){
          e0.getMessage();
          return -1;
       }
    }
    public int loadFullFFmpeg(String p0,int p1){
       KSTMFSoManager kSTMFSoManag = KSTMFSoManager.class;
       if (PatchProxy.isSupport(kSTMFSoManag)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, kSTMFSoManag, "18");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.mTmfEnableLoadSo == null) {
          return -60007;
       }else {
          int i = this.nativeLoadFullFFmpeg(p0, p1);
          String str = KSTMFSoManager.nativeGetFFVersion();
          kSTMFSoManag = this.reportJsonObject;
          if (kSTMFSoManag != null) {
             KSTMFSoManager tmSoLoadErro = this.mSoLoadErrorMsg;
             if (tmSoLoadErro != null) {
                this.safeAddJsonProperty(kSTMFSoManag, "so_load_msg", tmSoLoadErro);
             }
             this.safeAddJsonProperty(this.reportJsonObject, "so_load_retry", Integer.valueOf(this.mTmfSoLoadRetryCount));
             this.safeAddJsonProperty(this.reportJsonObject, "ff_version", str);
          }
          return i;
       }
    }
    public native final int nativeLoadFullFFmpeg(String p0,int p1);
    public synchronized boolean needDownload(){
       boolean i;
       JsonObject obj = PatchProxy.apply(null, this, KSTMFSoManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new JsonObject();
       try{
          i = 1;
          String backupFullFF = this.getBackupFullFFmpegPath();
          if (TextUtils.isEmpty(backupFullFF)) {
             return i;
          }else {
             File uFile = new File(backupFullFF);
             if (!uFile.exists()) {
                return i;
             }else {
                backupFullFF = this.getNameFromDvaPlugin()+".so";
                obj.c0("need_so_name", backupFullFF);
                obj.c0("local_so_name", uFile.getName());
                if (TextUtils.equals(backupFullFF, uFile.getName())) {
                   obj.H("need_download", Boolean.FALSE);
                   i = false;
                }else {
                   obj.H("need_download", Boolean.TRUE);
                }
             }
          }
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          obj.H("occur_exception", Boolean.TRUE);
       }
       if (this.reportJsonObject != null) {
          this.safeAddJsonProperty(this.reportJsonObject, "need_download", this.safeGetJsonString(obj));
       }
       return i;
    }
    public void safeAddJsonProperty(JsonObject p0,String p1,JsonElement p2){
       KSTMFSoManager tmLock;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSTMFSoManager.class, "5")) {
          return;
       }
       try{
          tmLock = this.mLock;
          _monitor_enter(tmLock);
          if (p0 != null && (p2 != null && !TextUtils.isEmpty(p1))) {
             p0.G(p1, p2);
          }
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       _monitor_exit(tmLock);
       return;
    }
    public void safeAddJsonProperty(JsonObject p0,String p1,Boolean p2){
       KSTMFSoManager tmLock;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSTMFSoManager.class, "6")) {
          return;
       }
       try{
          tmLock = this.mLock;
          _monitor_enter(tmLock);
          if (p0 != null && (p2 != null && !TextUtils.isEmpty(p1))) {
             p0.H(p1, p2);
          }
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       _monitor_exit(tmLock);
       return;
    }
    public void safeAddJsonProperty(JsonObject p0,String p1,Number p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSTMFSoManager.class, "3")) {
          return;
       }
       try{
          KSTMFSoManager tmLock = this.mLock;
          _monitor_enter(tmLock);
          if (p0 != null && (p2 != null && !TextUtils.isEmpty(p1))) {
             p0.a0(p1, p2);
          }
       label_001f :
          _monitor_exit(tmLock);
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
    public void safeAddJsonProperty(JsonObject p0,String p1,String p2){
       KSTMFSoManager tmLock;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSTMFSoManager.class, "4")) {
          return;
       }
       try{
          tmLock = this.mLock;
          _monitor_enter(tmLock);
          if (p0 != null && (!TextUtils.isEmpty(p2) && !TextUtils.isEmpty(p1))) {
             p0.c0(p1, p2);
          }
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       _monitor_exit(tmLock);
       return;
    }
    public String safeGetJsonString(JsonObject p0){
       KSTMFSoManager obj = PatchProxy.applyOneRefs(p0, this, KSTMFSoManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = this.mLock;
          _monitor_enter(obj);
          if (p0 != null) {
             _monitor_exit(obj);
             return p0.toString();
          }else {
             _monitor_exit(obj);
             return "";
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          _monitor_exit(obj);
          return "";
       }
    }
    public int startBackupFFmpeg(String p0,JsonObject p1){
       File uFile;
       File uFile1;
       boolean b;
       File obj = PatchProxy.applyTwoRefs(p0, p1, this, KSTMFSoManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       boolean i = -60001;
       if (TextUtils.isEmpty(p0)) {
          return i;
       }
       obj = new File(p0);
       if (!obj.exists()) {
          return i;
       }
       String backupFullFF = this.getBackupFullFFmpegPath();
       String str = "md5check";
       String str1 = "/backup.so";
       String str2 = "local_found";
       if (TextUtils.isEmpty(backupFullFF) || !new File(backupFullFF).exists()) {
          this.safeAddJsonProperty(p1, str2, Integer.valueOf(0));
          backupFullFF = this.mBackupSoDir.getAbsolutePath()+str1;
          uFile = new File(backupFullFF);
          if (uFile.exists()) {
             uFile.delete();
          }
          KSTMFSoManager.copyFile(p0, backupFullFF);
          uFile1 = new File(backupFullFF);
          if (!uFile1.exists()) {
             return -60003;
          }else {
             b = this.validateSoMD5(obj, uFile1);
             this.safeAddJsonProperty(p1, str, Boolean.valueOf(b));
             if (!b) {
                uFile1.delete();
                return -60004;
             }else if(!uFile1.renameTo(new File(this.mBackupSoDir.getAbsolutePath()+"/"+this.getNameFromDvaPlugin()+".so"))){
                return -60002;
             }
          }
       }else {
          int i1 = 1;
          this.safeAddJsonProperty(p1, str2, Integer.valueOf(i1));
          File uFile2 = new File(backupFullFF);
          i = this.validateSoMD5(obj, uFile2);
          this.safeAddJsonProperty(p1, str, Boolean.valueOf(i));
          if (i) {
             return i1;
          }else {
             backupFullFF = this.mBackupSoDir.getAbsolutePath()+str1;
             uFile = new File(backupFullFF);
             if (uFile.exists()) {
                uFile.delete();
             }
             KSTMFSoManager.copyFile(p0, backupFullFF);
             uFile1 = new File(backupFullFF);
             if (uFile1.exists()) {
                b = this.validateSoMD5(uFile1, obj);
                this.safeAddJsonProperty(p1, "rename_md5check", Boolean.valueOf(b));
                if (b) {
                   boolean b1 = uFile1.renameTo(new File(this.mBackupSoDir.getAbsolutePath()+"/"+this.getNameFromDvaPlugin()+".so"));
                   this.safeAddJsonProperty(p1, "rename_ret", Boolean.valueOf(b1));
                   if (!b1) {
                      return -60002;
                   }else {
                      uFile2.delete();
                   }
                }else {
                   return -60004;
                }
             }else {
                return -60003;
             }
          }
       }
       return 0;
    }
    public final boolean validateSoMD5(File p0,File p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KSTMFSoManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p1 != null && p0 != null) {
          String fileMD5 = KSTMFMD5Utils.getFileMD5(p0);
          String fileMD51 = KSTMFMD5Utils.getFileMD5(p1);
          if (!TextUtils.isEmpty(fileMD5) && TextUtils.equals(fileMD5, fileMD51)) {
             return true;
          }
       }
       return false;
    }
}
