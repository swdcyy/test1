package com.kuaishou.screencast.ScreencastPluginImpl;
import boc.c0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import java.lang.StringBuilder;
import ew4.a;
import q87.c;
import java.io.FileReader;
import fg6.a;
import com.kuaishou.screencast.ScreencastPluginImpl$ScreencastPatchCheckConfig;
import java.io.Reader;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.screencast.ScreencastPluginImpl$CheckItem;
import qkd.b;
import ekd.a0;
import java.lang.Throwable;

public class ScreencastPluginImpl implements c0	// class@000f02
{

    public void ScreencastPluginImpl(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean t40(String p0){
       ScreencastPluginImpl$CheckItem uCheckItem;
       String str3;
       String str = "ScreencastPluginImpl";
       File obj = PatchProxy.applyOneRefs(p0, this, ScreencastPluginImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str1 = "screencast_patch_v2_1_3/";
       obj = new File(p0+str1, "check.json");
       String str2 = "checkFile: ";
       if (!obj.exists()) {
          Object[] objArray = new Object[0];
          a.C().w("ScreencastPluginImpl checkFile failed !!! no checkFile", str2+obj, objArray);
          return 0;
       }else {
          try{
             FileReader uFileReader = new FileReader(obj);
             ScreencastPluginImpl$ScreencastPatchCheckConfig screencastPa = a.a.f(uFileReader, ScreencastPluginImpl$ScreencastPatchCheckConfig.class);
             if (screencastPa != null) {
                screencastPa = screencastPa.mCheckList;
                if (screencastPa != null) {
                   Iterator iterator = screencastPa.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         uCheckItem = iterator.next();
                         str3 = a0.d(b.e0(new File(p0+str1, uCheckItem.mFilePath)));
                         ScreencastPluginImpl$CheckItem mMd5Value = uCheckItem.mMd5Value;
                         if (mMd5Value != null && !mMd5Value.equalsIgnoreCase(str3)) {
                            break ;
                         }
                      }else {
                         Object[] objArray2 = new Object[0];
                         a.C().w("ScreencastPluginImpl checkFile success !!!", str2+obj, objArray2);
                         uFileReader.close();
                         return true;
                      }
                   }
                   Object[] objArray1 = new Object[0];
                   a.C().w(str, "md5 check failed. file: "+uCheckItem.mFilePath+" , the md5 in checklist: "+uCheckItem.mMd5Value+" , the md5 from file: "+str3, objArray1);
                   uFileReader.close();
                   return 0;
                }
             }
             uFileReader.close();
          }catch(java.io.IOException e12){
             a.C().e(str, "crash", e12);
          }
          return 0;
       }
    }
}
