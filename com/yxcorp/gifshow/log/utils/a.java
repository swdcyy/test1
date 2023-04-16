package com.yxcorp.gifshow.log.utils.a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class a	// class@001b52
{

    public void a(){
       super();
    }
    public static String a(Context p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uoa, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       try{
          InputStream inputStream = SplitAssetHelper.open(p0.getAssets(), p1);
          p1 = PatchProxy.applyOneRefs(inputStream, obj, uoa, "2");
          if (p1 != patchProxyRe) {
          }else {
             p1 = "";
             try{
                BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(inputStream));
                try{
                   do {
                   } while (uBufferedRea.readLine() != null);
                   uBufferedRea.close();
                   p1 = p1;
                }catch(java.io.IOException e4){
                   int i = uBufferedRea;
                }
                throw e4;
             }catch(java.io.IOException e4){
                goto label_004c ;
             }
          }
       }catch(java.io.IOException e0){
       }
       return p1;
    }
}
