package com.kwai.video.westeros.v2.faceless.FacelessPlugin;
import com.kwai.video.westeros.WesterosPlugin;
import android.content.Context;
import com.kwai.video.westeros.v2.faceless.FaceMagicController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.wysaid.nativePort.CGENativeLibraryLoader;
import com.kwai.video.westeros.v2.faceless.FacelessSoLoader;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import java.lang.Throwable;
import java.io.File;
import com.kwai.video.westeros.v2.faceless.SoLoaderUtil;
import java.lang.System;
import java.lang.ClassLoader;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public class FacelessPlugin extends WesterosPlugin	// class@0010e7
{
    public final FaceMagicController mFaceMagicController;
    public static boolean sClassLoaderInited;
    public static boolean sLoadLibraryOnSDCard;
    public static boolean sStaticLibraryLoaded;

    public void FacelessPlugin(Context p0){
       super();
       FacelessPlugin.init(p0);
       this.mFaceMagicController = new FaceMagicController(this.nativePlugin, true);
    }
    public static void checkAndLoadLibraries(boolean p0){
       FacelessPlugin uFacelessPlu = FacelessPlugin.class;
       if (PatchProxy.isSupport(uFacelessPlu) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uFacelessPlu, "2")) {
          return;
       }
       CGENativeLibraryLoader.load();
       FacelessSoLoader.loadNative();
       WesterosSoLoader.loadLibrary("faceless-plugin");
       FacelessPlugin.sStaticLibraryLoaded = true;
       return;
    }
    public static void checkAndLoadLibrariesOnSDCard(Context p0,boolean p1){
       FacelessPlugin uFacelessPlu = FacelessPlugin.class;
       if (PatchProxy.isSupport(uFacelessPlu) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uFacelessPlu, "3")) {
          return;
       }
       String absolutePath = p0.getExternalFilesDir("ytech_libs").getAbsolutePath();
       String absolutePath1 = p0.getDir("libs", 0).getAbsolutePath();
       CGENativeLibraryLoader.loadLibraryDeps();
       if (!SoLoaderUtil.loadSoFile(absolutePath1, absolutePath, "libCGE.so")) {
          System.loadLibrary("CGE");
       }
       CGENativeLibraryLoader.callNativeOnLoad();
       FacelessSoLoader.loadLibraryDeps();
       if (!SoLoaderUtil.loadSoFile(absolutePath1, absolutePath, "libgorgeous.so")) {
          System.loadLibrary("gorgeous");
       }
       if (!SoLoaderUtil.loadSoFile(absolutePath1, absolutePath, "libFaceMagic.so")) {
          System.loadLibrary("FaceMagic");
       }
       if (!SoLoaderUtil.loadSoFile(absolutePath1, absolutePath, "libfaceless-plugin.so")) {
          System.loadLibrary("faceless-plugin");
       }
       FacelessPlugin.sStaticLibraryLoaded = true;
       return;
    }
    public static void enableLibraryLoadingOnSDCard(boolean p0){
       FacelessPlugin.sLoadLibraryOnSDCard = p0;
    }
    public static void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FacelessPlugin.class, "1")) {
          return;
       }
       if (!FacelessPlugin.sLoadLibraryOnSDCard) {
          FacelessPlugin.checkAndLoadLibraries(false);
       }else if(!FacelessPlugin.sStaticLibraryLoaded){
          FacelessPlugin.checkAndLoadLibrariesOnSDCard(p0, false);
       }
       if (!FacelessPlugin.sClassLoaderInited) {
          CGENativeLibraryLoader.setClassLoader(p0.getClassLoader());
          CGENativeLibraryLoader.setAppContext(p0.getApplicationContext());
          FacelessPlugin.sClassLoaderInited = true;
       }
       return;
    }
    public long createNativePlugin(){
       Object obj = PatchProxy.apply(null, this, FacelessPlugin.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeCreateFacelessPlugin();
    }
    public FaceMagicController createNewFaceMagicController(){
       Object obj = PatchProxy.apply(null, this, FacelessPlugin.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FaceMagicController(this.nativePlugin, false);
    }
    public FaceMagicController getFaceMagicController(){
       return this.mFaceMagicController;
    }
    public native final long nativeCreateFacelessPlugin();
    public native final void nativeDestroyFacelessPlugin(long p0);
    public void release(){
       if (PatchProxy.applyVoid(null, this, FacelessPlugin.class, "5")) {
          return;
       }
       this.mFaceMagicController.release();
       super.release();
       return;
    }
    public void releaseNativePlugin(long p0){
       FacelessPlugin uFacelessPlu = FacelessPlugin.class;
       if (PatchProxy.isSupport(uFacelessPlu) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uFacelessPlu, "7")) {
          return;
       }
       this.nativeDestroyFacelessPlugin(p0);
       return;
    }
}
