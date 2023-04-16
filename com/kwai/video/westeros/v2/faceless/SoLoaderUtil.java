package com.kwai.video.westeros.v2.faceless.SoLoaderUtil;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Exception;

public class SoLoaderUtil	// class@0010ea
{

    public void SoLoaderUtil(){
       super();
    }
    public static boolean copySdcardFile(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SoLoaderUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       FileInputStream uFileInputSt = new FileInputStream(p0);
       FileOutputStream uFileOutputS = new FileOutputStream(p1);
       byte[] uobyteArray = new byte[1024];
       int i = uFileInputSt.read(uobyteArray);
       while (i > 0) {
          uFileOutputS.write(uobyteArray, 0, i);
       }
       return true;
    }
    public static boolean loadSoFile(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, SoLoaderUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0+"/"+p2;
       if (SoLoaderUtil.copySdcardFile(p1+"/"+p2, p0)) {
          try{
             System.load(p0);
             return true;
          }catch(java.lang.Exception e6){
             e6.printStackTrace();
          }
          return p2;
       }else {
          goto label_004d ;
       }
    }
}
