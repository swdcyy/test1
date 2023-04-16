package bq8.a;
import nu6.e;
import android.content.Context;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import bv6.a;
import java.lang.StringBuilder;
import java.util.Collections;
import java.io.IOException;

public class a implements e	// class@000444
{
    public final Context a;

    public void a(Context p0){
       super();
       this.a = p0;
    }
    public List a(){
       AssetManager obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getResources().getAssets();
       try{
          String[] stringArray = SplitAssetHelper.list(obj, "tk_template");
          if (stringArray == null || !stringArray.length) {
             return Collections.emptyList();
          }
          ArrayList uArrayList = new ArrayList();
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             object oobject = stringArray[i];
             if (!TextUtils.isEmpty(oobject)) {
                String[] stringArray1 = oobject.split("_");
                if (stringArray1.length == 3) {
                   object oobject1 = stringArray1[0];
                   object oobject2 = stringArray1[1];
                   object oobject3 = stringArray1[2];
                   if (!TextUtils.isEmpty(oobject3)) {
                      int i1 = oobject3.indexOf(".");
                      if (i1 > 0) {
                         uArrayList.add(new a(oobject1, Integer.parseInt(oobject3.substring(0, i1)), oobject2, "tk_template/"+oobject));
                      }
                   }
                }
             }
             i = i + 1;
          }
          return uArrayList;
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          return Collections.emptyList();
       }
    }
}
