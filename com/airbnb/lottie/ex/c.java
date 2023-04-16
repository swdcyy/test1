package com.airbnb.lottie.ex.c;
import java.util.concurrent.Callable;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.airbnb.lottie.ex.a;
import java.lang.StringBuilder;
import java.util.zip.ZipInputStream;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import a5.k;
import java.lang.Throwable;

public final class c implements Callable	// class@000da4
{
    public final Context b;
    public final String c;

    public void c(Context p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       k ok;
       c tb = this.b;
       c tc = this.c;
       Map a = a.a;
       try{
          String str = "asset_"+tc;
          ok = (tc.endsWith(".zip"))? a.e(new ZipInputStream(SplitAssetHelper.open(tb.getAssets(), tc)), str): a.b(SplitAssetHelper.open(tb.getAssets(), tc), str);
       }catch(java.io.IOException e0){
          ok = new k(e0);
       }
       return ok;
    }
}
