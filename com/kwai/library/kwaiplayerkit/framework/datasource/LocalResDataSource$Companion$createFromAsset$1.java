package com.kwai.library.kwaiplayerkit.framework.datasource.LocalResDataSource$Companion$createFromAsset$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.res.Resources;
import java.lang.String;
import java.io.InputStream;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class LocalResDataSource$Companion$createFromAsset$1 extends Lambda implements a	// class@00086c
{
    public final String $assetPath;
    public final Resources $resource;

    public void LocalResDataSource$Companion$createFromAsset$1(Resources p0,String p1){
       this.$resource = p0;
       this.$assetPath = p1;
       super(0);
    }
    public final InputStream invoke(){
       InputStream inputStream = SplitAssetHelper.open(this.$resource.getAssets(), this.$assetPath);
       a.o(inputStream, "resource.assets.open\(assetPath\)");
       return inputStream;
    }
    public Object invoke(){
       return this.invoke();
    }
}
