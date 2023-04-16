package com.oasisfeng.condom.PseudoContextWrapper;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.String;
import android.net.Uri;
import android.content.res.Configuration;
import pd6.b;
import android.view.Display;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import java.io.File;
import java.lang.ClassLoader;
import android.content.ContentResolver;
import android.os.Looper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Object;
import java.lang.Class;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseErrorHandler;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.UserHandle;
import android.os.Bundle;
import android.graphics.Bitmap;
import java.io.InputStream;
import android.content.ComponentName;
import android.content.IntentSender;

public class PseudoContextWrapper extends Context	// class@000a97
{
    public final Context mBase;

    public void PseudoContextWrapper(Context p0){
       super();
       this.mBase = p0;
    }
    public boolean bindService(Intent p0,ServiceConnection p1,int p2){
       return a.a(this.mBase, p0, p1, p2);
    }
    public int checkCallingOrSelfPermission(String p0){
       return this.mBase.checkCallingOrSelfPermission(p0);
    }
    public int checkCallingOrSelfUriPermission(Uri p0,int p1){
       return this.mBase.checkCallingOrSelfUriPermission(p0, p1);
    }
    public int checkCallingPermission(String p0){
       return this.mBase.checkCallingPermission(p0);
    }
    public int checkCallingUriPermission(Uri p0,int p1){
       return this.mBase.checkCallingUriPermission(p0, p1);
    }
    public int checkPermission(String p0,int p1,int p2){
       return this.mBase.checkPermission(p0, p1, p2);
    }
    public int checkSelfPermission(String p0){
       return this.mBase.checkSelfPermission(p0);
    }
    public int checkUriPermission(Uri p0,int p1,int p2,int p3){
       return this.mBase.checkUriPermission(p0, p1, p2, p3);
    }
    public int checkUriPermission(Uri p0,String p1,String p2,int p3,int p4,int p5){
       return this.mBase.checkUriPermission(p0, p1, p2, p3, p4, p5);
    }
    public void clearWallpaper(){
       this.mBase.clearWallpaper();
    }
    public Context createConfigurationContext(Configuration p0){
       return b.a(this.mBase, p0);
    }
    public Context createContextForSplit(String p0){
       return this.mBase.createContextForSplit(p0);
    }
    public Context createDeviceProtectedStorageContext(){
       return this.mBase.createDeviceProtectedStorageContext();
    }
    public Context createDisplayContext(Display p0){
       return this.mBase.createDisplayContext(p0);
    }
    public Context createPackageContext(String p0,int p1){
       return this.mBase.createPackageContext(p0, p1);
    }
    public String[] databaseList(){
       return this.mBase.databaseList();
    }
    public boolean deleteDatabase(String p0){
       return this.mBase.deleteDatabase(p0);
    }
    public boolean deleteFile(String p0){
       return this.mBase.deleteFile(p0);
    }
    public boolean deleteSharedPreferences(String p0){
       return this.mBase.deleteSharedPreferences(p0);
    }
    public void enforceCallingOrSelfPermission(String p0,String p1){
       this.mBase.enforceCallingOrSelfPermission(p0, p1);
    }
    public void enforceCallingOrSelfUriPermission(Uri p0,int p1,String p2){
       this.mBase.enforceCallingOrSelfUriPermission(p0, p1, p2);
    }
    public void enforceCallingPermission(String p0,String p1){
       this.mBase.enforceCallingPermission(p0, p1);
    }
    public void enforceCallingUriPermission(Uri p0,int p1,String p2){
       this.mBase.enforceCallingUriPermission(p0, p1, p2);
    }
    public void enforcePermission(String p0,int p1,int p2,String p3){
       this.mBase.enforcePermission(p0, p1, p2, p3);
    }
    public void enforceUriPermission(Uri p0,int p1,int p2,int p3,String p4){
       this.mBase.enforceUriPermission(p0, p1, p2, p3, p4);
    }
    public void enforceUriPermission(Uri p0,String p1,String p2,int p3,int p4,int p5,String p6){
       this.mBase.enforceUriPermission(p0, p1, p2, p3, p4, p5, p6);
    }
    public String[] fileList(){
       return this.mBase.fileList();
    }
    public Context getApplicationContext(){
       return this.mBase.getApplicationContext();
    }
    public ApplicationInfo getApplicationInfo(){
       return this.mBase.getApplicationInfo();
    }
    public AssetManager getAssets(){
       return this.mBase.getAssets();
    }
    public File getCacheDir(){
       return this.mBase.getCacheDir();
    }
    public ClassLoader getClassLoader(){
       return this.mBase.getClassLoader();
    }
    public File getCodeCacheDir(){
       return this.mBase.getCodeCacheDir();
    }
    public ContentResolver getContentResolver(){
       return this.mBase.getContentResolver();
    }
    public File getDataDir(){
       return this.mBase.getDataDir();
    }
    public File getDatabasePath(String p0){
       return this.mBase.getDatabasePath(p0);
    }
    public File getDir(String p0,int p1){
       return this.mBase.getDir(p0, p1);
    }
    public File getExternalCacheDir(){
       return this.mBase.getExternalCacheDir();
    }
    public File[] getExternalCacheDirs(){
       return this.mBase.getExternalCacheDirs();
    }
    public File getExternalFilesDir(String p0){
       return this.mBase.getExternalFilesDir(p0);
    }
    public File[] getExternalFilesDirs(String p0){
       return this.mBase.getExternalFilesDirs(p0);
    }
    public File[] getExternalMediaDirs(){
       return this.mBase.getExternalMediaDirs();
    }
    public File getFileStreamPath(String p0){
       return this.mBase.getFileStreamPath(p0);
    }
    public File getFilesDir(){
       return this.mBase.getFilesDir();
    }
    public Looper getMainLooper(){
       return this.mBase.getMainLooper();
    }
    public File getNoBackupFilesDir(){
       return this.mBase.getNoBackupFilesDir();
    }
    public File getObbDir(){
       return this.mBase.getObbDir();
    }
    public File[] getObbDirs(){
       return this.mBase.getObbDirs();
    }
    public String getPackageCodePath(){
       return this.mBase.getPackageCodePath();
    }
    public PackageManager getPackageManager(){
       return this.mBase.getPackageManager();
    }
    public String getPackageName(){
       return this.mBase.getPackageName();
    }
    public String getPackageResourcePath(){
       return this.mBase.getPackageResourcePath();
    }
    public Resources getResources(){
       return this.mBase.getResources();
    }
    public SharedPreferences getSharedPreferences(String p0,int p1){
       return o.c(this.mBase, p0, p1);
    }
    public Object getSystemService(String p0){
       return this.mBase.getSystemService(p0);
    }
    public String getSystemServiceName(Class p0){
       return this.mBase.getSystemServiceName(p0);
    }
    public Resources$Theme getTheme(){
       return this.mBase.getTheme();
    }
    public Drawable getWallpaper(){
       return this.mBase.getWallpaper();
    }
    public int getWallpaperDesiredMinimumHeight(){
       return this.mBase.getWallpaperDesiredMinimumHeight();
    }
    public int getWallpaperDesiredMinimumWidth(){
       return this.mBase.getWallpaperDesiredMinimumWidth();
    }
    public void grantUriPermission(String p0,Uri p1,int p2){
       this.mBase.grantUriPermission(p0, p1, p2);
    }
    public boolean isDeviceProtectedStorage(){
       return this.mBase.isDeviceProtectedStorage();
    }
    public boolean isRestricted(){
       return this.mBase.isRestricted();
    }
    public boolean moveDatabaseFrom(Context p0,String p1){
       return this.mBase.moveDatabaseFrom(p0, p1);
    }
    public boolean moveSharedPreferencesFrom(Context p0,String p1){
       return this.mBase.moveSharedPreferencesFrom(p0, p1);
    }
    public FileInputStream openFileInput(String p0){
       return this.mBase.openFileInput(p0);
    }
    public FileOutputStream openFileOutput(String p0,int p1){
       return this.mBase.openFileOutput(p0, p1);
    }
    public SQLiteDatabase openOrCreateDatabase(String p0,int p1,SQLiteDatabase$CursorFactory p2){
       return this.mBase.openOrCreateDatabase(p0, p1, p2);
    }
    public SQLiteDatabase openOrCreateDatabase(String p0,int p1,SQLiteDatabase$CursorFactory p2,DatabaseErrorHandler p3){
       return this.mBase.openOrCreateDatabase(p0, p1, p2, p3);
    }
    public Drawable peekWallpaper(){
       return this.mBase.peekWallpaper();
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1){
       return this.mBase.registerReceiver(p0, p1);
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,int p2){
       return this.mBase.registerReceiver(p0, p1, p2);
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,String p2,Handler p3){
       return this.mBase.registerReceiver(p0, p1, p2, p3);
    }
    public Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,String p2,Handler p3,int p4){
       return this.mBase.registerReceiver(p0, p1, p2, p3, p4);
    }
    public void removeStickyBroadcast(Intent p0){
       this.mBase.removeStickyBroadcast(p0);
    }
    public void removeStickyBroadcastAsUser(Intent p0,UserHandle p1){
       this.mBase.removeStickyBroadcastAsUser(p0, p1);
    }
    public void revokeUriPermission(Uri p0,int p1){
       this.mBase.revokeUriPermission(p0, p1);
    }
    public void revokeUriPermission(String p0,Uri p1,int p2){
       this.mBase.revokeUriPermission(p0, p1, p2);
    }
    public void sendBroadcast(Intent p0){
       this.mBase.sendBroadcast(p0);
    }
    public void sendBroadcast(Intent p0,String p1){
       this.mBase.sendBroadcast(p0, p1);
    }
    public void sendBroadcastAsUser(Intent p0,UserHandle p1){
       this.mBase.sendBroadcastAsUser(p0, p1);
    }
    public void sendBroadcastAsUser(Intent p0,UserHandle p1,String p2){
       this.mBase.sendBroadcastAsUser(p0, p1, p2);
    }
    public void sendOrderedBroadcast(Intent p0,String p1){
       this.mBase.sendOrderedBroadcast(p0, p1);
    }
    public void sendOrderedBroadcast(Intent p0,String p1,BroadcastReceiver p2,Handler p3,int p4,String p5,Bundle p6){
       this.mBase.sendOrderedBroadcast(p0, p1, p2, p3, p4, p5, p6);
    }
    public void sendOrderedBroadcastAsUser(Intent p0,UserHandle p1,String p2,BroadcastReceiver p3,Handler p4,int p5,String p6,Bundle p7){
       this.mBase.sendOrderedBroadcastAsUser(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public void sendStickyBroadcast(Intent p0){
       this.mBase.sendStickyBroadcast(p0);
    }
    public void sendStickyBroadcastAsUser(Intent p0,UserHandle p1){
       this.mBase.sendStickyBroadcastAsUser(p0, p1);
    }
    public void sendStickyOrderedBroadcast(Intent p0,BroadcastReceiver p1,Handler p2,int p3,String p4,Bundle p5){
       this.mBase.sendStickyOrderedBroadcast(p0, p1, p2, p3, p4, p5);
    }
    public void sendStickyOrderedBroadcastAsUser(Intent p0,UserHandle p1,BroadcastReceiver p2,Handler p3,int p4,String p5,Bundle p6){
       this.mBase.sendStickyOrderedBroadcastAsUser(p0, p1, p2, p3, p4, p5, p6);
    }
    public void setTheme(int p0){
       this.mBase.setTheme(p0);
    }
    public void setWallpaper(Bitmap p0){
       this.mBase.setWallpaper(p0);
    }
    public void setWallpaper(InputStream p0){
       this.mBase.setWallpaper(p0);
    }
    public void startActivities(Intent[] p0){
       this.mBase.startActivities(p0);
    }
    public void startActivities(Intent[] p0,Bundle p1){
       this.mBase.startActivities(p0, p1);
    }
    public void startActivity(Intent p0){
       this.mBase.startActivity(p0);
    }
    public void startActivity(Intent p0,Bundle p1){
       this.mBase.startActivity(p0, p1);
    }
    public ComponentName startForegroundService(Intent p0){
       return a.d(this.mBase, p0);
    }
    public boolean startInstrumentation(ComponentName p0,String p1,Bundle p2){
       return this.mBase.startInstrumentation(p0, p1, p2);
    }
    public void startIntentSender(IntentSender p0,Intent p1,int p2,int p3,int p4){
       this.mBase.startIntentSender(p0, p1, p2, p3, p4);
    }
    public void startIntentSender(IntentSender p0,Intent p1,int p2,int p3,int p4,Bundle p5){
       this.mBase.startIntentSender(p0, p1, p2, p3, p4, p5);
    }
    public ComponentName startService(Intent p0){
       return a.e(this.mBase, p0);
    }
    public boolean stopService(Intent p0){
       return this.mBase.stopService(p0);
    }
    public void unbindService(ServiceConnection p0){
       this.mBase.unbindService(p0);
    }
    public void unregisterReceiver(BroadcastReceiver p0){
       this.mBase.unregisterReceiver(p0);
    }
}
