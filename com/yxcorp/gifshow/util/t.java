package com.yxcorp.gifshow.util.t;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.debug.mockenv.model.TamperResult;
import java.lang.Object;
import android.content.Intent;
import android.net.Uri;
import com.yxcorp.gifshow.debug.mockenv.MockEnvHelper;

public class t	// class@001fb1
{

    public static List a(String p0){
       String[] stringArray = p0.split(";");
       ArrayList uArrayList = new ArrayList();
       int len = stringArray.length;
       for (int i = 0; i < len; i = i + 1) {
          String[] stringArray1 = (stringArray[i]).split(":");
          uArrayList.add(new TamperResult(stringArray1[0], stringArray1[1]));
       }
       return uArrayList;
    }
    public static void b(Intent p0){
       Uri data = p0.getData();
       if (data != null && data.isHierarchical()) {
          String queryParamet = data.getQueryParameter("addTamperList");
          if (queryParamet != null) {
             MockEnvHelper.get().clearAndAppendTamperResults(t.a(queryParamet));
          }else {
             queryParamet = data.getQueryParameter("clearAndAddTamperList");
             if (queryParamet != null) {
                MockEnvHelper.get().clearAndAppendTamperResults(t.a(queryParamet));
             }else if(data.getQueryParameter("clearAllTampers") != null){
                MockEnvHelper.get().clearTamperResult();
             }
          }
       }
       return;
    }
}
