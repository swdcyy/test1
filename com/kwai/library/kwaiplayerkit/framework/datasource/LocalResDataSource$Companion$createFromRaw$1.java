package com.kwai.library.kwaiplayerkit.framework.datasource.LocalResDataSource$Companion$createFromRaw$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.res.Resources;
import java.io.InputStream;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class LocalResDataSource$Companion$createFromRaw$1 extends Lambda implements a	// class@00086d
{
    public final int $rawId;
    public final Resources $resource;

    public void LocalResDataSource$Companion$createFromRaw$1(Resources p0,int p1){
       this.$resource = p0;
       this.$rawId = p1;
       super(0);
    }
    public final InputStream invoke(){
       InputStream inputStream = this.$resource.openRawResource(this.$rawId);
       a.o(inputStream, "resource.openRawResource\(rawId\)");
       return inputStream;
    }
    public Object invoke(){
       return this.invoke();
    }
}
