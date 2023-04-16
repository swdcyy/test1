package cn.vimfung.luascriptcore.LuaContext;
import cn.vimfung.luascriptcore.LuaBaseObject;
import java.util.ArrayList;
import java.util.HashMap;
import android.content.Context;
import java.lang.String;
import cn.vimfung.luascriptcore.LuaEnv;
import cn.vimfung.luascriptcore.LuaNativeUtil;
import java.io.File;
import java.lang.Object;
import java.lang.CharSequence;
import java.util.regex.Pattern;
import java.lang.StringBuilder;
import cn.vimfung.luascriptcore.LuaValue;
import cn.vimfung.luascriptcore.LuaScriptController;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.Class;
import cn.vimfung.luascriptcore.LuaExportType;
import cn.vimfung.luascriptcore.LuaExportTypeManager;
import android.content.pm.PackageManager;
import java.util.List;
import com.kwai.privacykit.interceptor.PackageManagerInterceptor;
import java.util.Iterator;
import android.content.pm.PackageInfo;
import android.os.Environment;
import cn.vimfung.luascriptcore.LuaMethodHandler;
import cn.vimfung.luascriptcore.LuaExceptionHandler;
import java.io.InputStream;
import java.lang.Error;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class LuaContext extends LuaBaseObject	// class@000d35
{
    public Context _context;
    public LuaExceptionHandler _exceptionHandler;
    public HashMap _methods;
    public ArrayList _regTypes;
    public static boolean _isSetupLuaFolder;

    public void LuaContext(int p0){
       super(p0);
       this._regTypes = null;
       this._regTypes = new ArrayList();
       this._methods = new HashMap();
    }
    public static LuaContext create(Context p0,String p1){
       LuaEnv luaEnv = LuaEnv.defaultEnv();
       luaEnv.setAndroidApplicationContext(p0);
       return LuaContext.create(luaEnv, p1);
    }
    public static LuaContext create(LuaEnv p0,String p1){
       LuaContext luaContext = LuaNativeUtil.createContext(p1);
       luaContext._context = p0.getAndroidApplicationContext();
       Object[] objArray = new Object[]{luaContext.getCacheDir()};
       File uFile = new File(String.format("%s/lua", objArray));
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       luaContext.addSearchPath(uFile.toString());
       return luaContext;
    }
    public void addSearchPath(String p0){
       if (!Pattern.matches("/\([^/]+\)[.]\([^/]+\)$", p0)) {
          String str = "/";
          if (!p0.endsWith(str)) {
             p0 = p0+str;
          }
          p0 = p0+"?.lua";
       }
       LuaNativeUtil.addSearchPath(this._nativeId, p0);
       return;
    }
    public LuaValue callMethod(String p0,LuaValue[] p1){
       return this.callMethod(p0, p1, null);
    }
    public LuaValue callMethod(String p0,LuaValue[] p1,LuaScriptController p2){
       return LuaNativeUtil.callMethod(this._nativeId, p0, p1, p2);
    }
    public final void copyLuaFileFromAssets(String p0){
       try{
          String[] stringArray = SplitAssetHelper.list(this._context.getAssets(), p0);
          int i = 2;
          int i1 = 1;
          if (stringArray.length > 0) {
             int len = stringArray.length;
             for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                Object[] objArray = new Object[i];
                objArray[0] = p0;
                objArray[i1] = stringArray[i2];
                this.copyLuaFileFromAssets(String.format("%s%s/", objArray));
             }
          }else {
             try{
                p0 = p0.substring(0, (p0.length() - i1));
                if ((p0.toLowerCase()).endsWith(".lua")) {
                   ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                   Object[] objArray1 = new Object[i];
                   objArray1[0] = this.getCacheDir();
                   objArray1[i1] = p0;
                   File uFile = new File(String.format("%s/lua/%s", objArray1));
                   File parentFile = uFile.getParentFile();
                   if (!parentFile.exists()) {
                      parentFile.mkdirs();
                   }
                   this.readAssetFileContent(p0, uByteArrayOu);
                   this.writeToFile(uFile, uByteArrayOu);
                   uByteArrayOu.close();
                }
             }catch(java.io.IOException e10){
                try{
                   e10.printStackTrace();
                }catch(java.io.IOException e10){
                   e10.printStackTrace();
                }
             }
          }
       }catch(java.io.IOException e10){
       }
       return;
    }
    public LuaValue evalScript(String p0){
       return this.evalScript(p0, null);
    }
    public LuaValue evalScript(String p0,LuaScriptController p1){
       return LuaNativeUtil.evalScript(this._nativeId, p0, p1);
    }
    public LuaValue evalScriptFromFile(String p0){
       return this.evalScriptFromFile(p0, null);
    }
    public LuaValue evalScriptFromFile(String p0,LuaScriptController p1){
       String str = "/android_asset";
       if (!p0.startsWith("/") || p0.startsWith(str)) {
          if (p0.startsWith(str)) {
             p0 = p0.substring(15);
          }
          Object[] objArray = new Object[]{this.getCacheDir(),p0};
          p0 = String.format("%s/lua/%s", objArray);
       }
       File uFile = new File(p0);
       LuaValue luaValue = LuaNativeUtil.evalScriptFromFile(this._nativeId, p0, p1);
       if (luaValue == null) {
          luaValue = new LuaValue();
       }
       return luaValue;
    }
    public final void exportsNativeType(Class p0){
       if (!p0.isInterface() && (LuaExportType.class.isAssignableFrom(p0) && !this._regTypes.contains(p0))) {
          Class superclass = p0.getSuperclass();
          this.exportsNativeType(superclass);
          Object[] objArray = new Object[]{p0.getName()};
          String.format("Register type %s", objArray);
          this._regTypes.add(p0);
          LuaExportTypeManager.getDefaultManager().exportType(this, p0, superclass);
       }
    label_0038 :
       return;
    }
    public final void exportsNativeType(String p0){
       String str = "_";
       if (p0.startsWith(str)) {
          return;
       }
       try{
          this.exportsNativeType(Class.forName(p0.replace(str, ".")));
       }catch(java.lang.ClassNotFoundException e0){
          Iterator iterator = PackageManagerInterceptor.getInstalledPackages(this._context.getPackageManager(), 0).iterator();
       label_0026 :
          if (iterator.hasNext()) {
             PackageInfo packageInfo = iterator.next();
             try{
                Object[] objArray = new Object[]{packageInfo.packageName,p0};
                this.exportsNativeType(Class.forName(String.format("%s.%s", objArray)));
             }catch(java.lang.ClassNotFoundException e0){
                goto label_0026 ;
             }
          }
       }
       return;
    }
    public Context getApplicationContext(){
       return this._context.getApplicationContext();
    }
    public final File getCacheDir(){
       int i = this._context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
       File externalCach = (("mounted").equals(Environment.getExternalStorageState()) && !i)? this._context.getExternalCacheDir(): null;
       if (externalCach == null) {
          externalCach = this._context.getCacheDir();
       }
       return externalCach;
    }
    public LuaValue getExtra(String p0){
       return LuaNativeUtil.getExtra(this._nativeId, p0);
    }
    public LuaValue getGlobal(String p0){
       return LuaNativeUtil.getGlobal(this._nativeId, p0);
    }
    public void loadDynamicModule(String p0,String p1,String p2){
       LuaNativeUtil.loadDynaimicModule(this._nativeId, p0, p1, p2);
    }
    public final LuaValue methodInvoke(String p0,LuaValue[] p1){
       LuaValue luaValue = (this._methods.containsKey(p0))? this._methods.get(p0).onExecute(p1): new LuaValue();
       return luaValue;
    }
    public void onException(LuaExceptionHandler p0){
       this._exceptionHandler = p0;
       boolean b = (p0 != null)? true: false;
       LuaNativeUtil.catchException(this, b);
       return;
    }
    public void putExtra(String p0,LuaValue p1){
       LuaNativeUtil.putExtra(this._nativeId, p0, p1);
    }
    public void raiseException(String p0){
       LuaNativeUtil.raiseException(this, p0);
    }
    public final void readAssetFileContent(String p0,ByteArrayOutputStream p1){
       InputStream inputStream = null;
       try{
          inputStream = SplitAssetHelper.open(this._context.getAssets(), p0);
          byte[] uobyteArray = new byte[1024];
          int i = inputStream.read(uobyteArray);
          while (i != -1) {
             p1.write(uobyteArray, 0, i);
          }
          inputStream.close();
       }catch(java.io.IOException e4){
          e4.printStackTrace();
          if (inputStream) {
             inputStream.close();
          }
       }catch(java.io.IOException e4){
          e4.printStackTrace();
       }
       return;
    }
    public void registerMethod(String p0,LuaMethodHandler p1){
       if (this._methods.containsKey(p0)) {
          throw new Error("Method for the name already exists");
       }
       this._methods.put(p0, p1);
       LuaNativeUtil.registerMethod(this._nativeId, p0);
       return;
    }
    public void releaseValue(LuaValue p0){
       LuaNativeUtil.releaseValue(this, p0);
    }
    public void retainValue(LuaValue p0){
       LuaNativeUtil.retainValue(this, p0);
    }
    public void setGlobal(String p0,LuaValue p1){
       LuaNativeUtil.setGlobal(this._nativeId, p0, p1);
    }
    public final void writeToFile(File p0,ByteArrayOutputStream p1){
       try{
          FileOutputStream uFileOutputS = new FileOutputStream(p0);
          p1.writeTo(uFileOutputS);
          uFileOutputS.flush();
          uFileOutputS.close();
       }catch(java.io.IOException e2){
          e2.printStackTrace();
       }
       return;
    }
}
