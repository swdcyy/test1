package com.yxcorp.gifshow.log.stid.a;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.log.stid.StidMergeInterceptManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import android.content.Context;
import java.lang.Exception;

public final class a implements Runnable	// class@001b3f
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void run(){
       JsonArray jsonArray;
       if (PatchProxy.applyVoid(null, null, StidMergeInterceptManager.class, "2")) {
       }else {
          Log.b("StidMergeInterceptManager", "init mContext="+StidMergeInterceptManager.b);
          if (StidMergeInterceptManager.a || (StidMergeInterceptManager.b != null && n.A1().H())) {
             try{
                jsonArray = n.A1().t();
                Log.b("StidMergeInterceptManager", "init json config="+jsonArray);
             }catch(java.lang.Exception e0){
                Log.d("StidMergeInterceptManager", "stidInterceptJsonConfig whitelist config error.");
             }
             try{
                if (jsonArray != null && (!jsonArray.B() || !jsonArray.q().size())) {
                   jsonArray = StidMergeInterceptManager.e(StidMergeInterceptManager.b);
                   Log.b("StidMergeInterceptManager", "init file");
                }
                StidMergeInterceptManager.a = StidMergeInterceptManager.d(jsonArray);
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
             Log.b("StidMergeInterceptManager", "init is ok "+StidMergeInterceptManager.a);
          }
       }
       return;
    }
}
