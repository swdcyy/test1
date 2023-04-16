package com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.Object;
import java.lang.ClassLoader;
import java.lang.String;
import java.io.InputStream;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.kwai.plugin.dva.split.SplitManager;
import java.util.concurrent.FutureTask;
import java.util.List;
import java.util.Iterator;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.entity.Plugin;
import android.content.res.Resources;
import android.content.res.AssetManager;
import java.lang.Integer;
import android.content.res.AssetFileDescriptor;
import android.content.res.XmlResourceParser;

public final class SplitAssetHelper	// class@000eb6
{

    public void SplitAssetHelper(){
       super();
    }
    public static final InputStream getResourceAsStream(ClassLoader p0,String p1){
       InputStream inputStream;
       Plugin obj = PatchProxy.applyTwoRefs(p0, p1, null, SplitAssetHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       InputStream resourceAsSt = p0.getResourceAsStream(p1);
       if (resourceAsSt != null) {
          return resourceAsSt;
       }
       if (p1 != null) {
          String str = "assets/";
          if (p1.startsWith(str)) {
             str = p1.replace(str, "");
             SplitManager a = SplitManager.a;
             if (a.b().isDone()) {
                Iterator iterator = a.b().get().iterator();
                while (iterator.hasNext()) {
                   obj = Dva.instance().getPlugin(iterator.next().name);
                   if (obj != null) {
                      try{
                         inputStream = obj.getResources().getAssets().open(str);
                      }catch(java.io.IOException e0){
                         inputStream = null;
                      }
                   }
                }
             }
          }
       }
       return null;
    }
    public static final String[] list(AssetManager p0,String p1){
       Plugin plugin;
       String[] stringArray;
       String[] obj = null;
       SplitManager obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, SplitAssetHelper.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       try{
          obj = p0.list(p1);
          p0 = obj;
       }catch(java.lang.Exception e5){
       }
       if (obj != null && obj.length) {
          return obj;
       }
       obj1 = SplitManager.a;
       if (!obj1.b().isDone()) {
          if (e5 == null) {
             return obj;
          }
          throw e5;
       }else {
          Iterator iterator = obj1.b().get().iterator();
          do {
             if (iterator.hasNext()) {
                plugin = Dva.instance().getPlugin(iterator.next().name);
                if (plugin != null) {
                }
             }else if(e5 == null){
                return obj;
             }else {
                throw e5;
             }
             stringArray = plugin.getResources().getAssets().list(p1);
          } while (stringArray != null && stringArray.length);
          return stringArray;
       }
    }
    public static final InputStream open(AssetManager p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SplitAssetHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SplitAssetHelper.open(p0, p1, 2);
    }
    public static final InputStream open(AssetManager p0,String p1,int p2){
       Iterator obj;
       if (PatchProxy.isSupport(SplitAssetHelper.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, SplitAssetHelper.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return p0.open(p1, p2);
       }catch(java.lang.Exception e7){
          if (SplitManager.a.b().isDone()) {
             obj = SplitManager.a.b().get().iterator();
          label_0040 :
             if (obj.hasNext()) {
                Plugin plugin = Dva.instance().getPlugin(obj.next().name);
                if (plugin != null) {
                   try{
                      return plugin.getResources().getAssets().open(p1, p2);
                   }catch(java.lang.Exception e0){
                      goto label_0040 ;
                   }
                }else {
                   goto label_0040 ;
                }
             }else {
                throw e7;
             }
          }else {
             throw e7;
          }
       }
    }
    public static final AssetFileDescriptor openFd(AssetManager p0,String p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, null, SplitAssetHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return p0.openFd(p1);
       }catch(java.lang.Exception e3){
          if (!SplitManager.a.b().isDone()) {
             throw e3;
          }
          obj = SplitManager.a.b().get().iterator();
       label_0032 :
          if (!obj.hasNext()) {
             throw e3;
          }
          Plugin plugin = Dva.instance().getPlugin(obj.next().name);
          if (plugin != null) {
             return plugin.getResources().getAssets().openFd(p1);
          }
          goto label_0032 ;
       }
    }
    public static final AssetFileDescriptor openNonAssetFd(AssetManager p0,int p1,String p2){
       Iterator obj;
       if (PatchProxy.isSupport(SplitAssetHelper.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, SplitAssetHelper.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return p0.openNonAssetFd(p1, p2);
       }catch(java.lang.Exception e7){
          if (SplitManager.a.b().isDone()) {
             obj = SplitManager.a.b().get().iterator();
          label_0040 :
             if (obj.hasNext()) {
                Plugin plugin = Dva.instance().getPlugin(obj.next().name);
                if (plugin != null) {
                   try{
                      return plugin.getResources().getAssets().openNonAssetFd(p1, p2);
                   }catch(java.lang.Exception e0){
                      goto label_0040 ;
                   }
                }else {
                   goto label_0040 ;
                }
             }else {
                throw e7;
             }
          }else {
             throw e7;
          }
       }
    }
    public static final AssetFileDescriptor openNonAssetFd(AssetManager p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SplitAssetHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SplitAssetHelper.openNonAssetFd(p0, 0, p1);
    }
    public static final XmlResourceParser openXmlResourceParser(AssetManager p0,int p1,String p2){
       Iterator obj;
       if (PatchProxy.isSupport(SplitAssetHelper.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, SplitAssetHelper.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return p0.openXmlResourceParser(p1, p2);
       }catch(java.lang.Exception e7){
          if (SplitManager.a.b().isDone()) {
             obj = SplitManager.a.b().get().iterator();
          label_0040 :
             if (obj.hasNext()) {
                Plugin plugin = Dva.instance().getPlugin(obj.next().name);
                if (plugin != null) {
                   try{
                      return plugin.getResources().getAssets().openXmlResourceParser(p1, p2);
                   }catch(java.lang.Exception e0){
                      goto label_0040 ;
                   }
                }else {
                   goto label_0040 ;
                }
             }else {
                throw e7;
             }
          }else {
             throw e7;
          }
       }
    }
    public static final XmlResourceParser openXmlResourceParser(AssetManager p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SplitAssetHelper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SplitAssetHelper.openXmlResourceParser(p0, 0, p1);
    }
}
