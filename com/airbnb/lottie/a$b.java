package com.airbnb.lottie.a$b;
import java.util.concurrent.Callable;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.airbnb.lottie.a;
import java.lang.StringBuilder;
import java.util.zip.ZipInputStream;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import w4.m;
import java.lang.Throwable;

public final class a$b implements Callable	// class@000d91
{
    public final Context b;
    public final String c;

    public void a$b(Context p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       m om;
       a$b tb = this.b;
       a$b tc = this.c;
       Map a = a.a;
       try{
          String str = "asset_"+tc;
          om = (tc.endsWith(".zip"))? a.k(new ZipInputStream(SplitAssetHelper.open(tb.getAssets(), tc)), str): a.e(SplitAssetHelper.open(tb.getAssets(), tc), str);
       }catch(java.io.IOException e0){
          om = new m(e0);
       }
       return om;
    }
}
