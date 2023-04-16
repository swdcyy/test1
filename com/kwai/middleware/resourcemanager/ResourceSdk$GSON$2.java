package com.kwai.middleware.resourcemanager.ResourceSdk$GSON$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.google.gson.Gson;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import za7.a;
import java.lang.Object;

public final class ResourceSdk$GSON$2 extends Lambda implements a	// class@000f34
{
    public static final ResourceSdk$GSON$2 INSTANCE;

    static {
       ResourceSdk$GSON$2.INSTANCE = new ResourceSdk$GSON$2();
    }
    public void ResourceSdk$GSON$2(){
       super(0);
    }
    public final Gson invoke(){
       Gson gson = ResourceSdk.f.e().d();
       if (gson != null) {
       }else {
          gson = new Gson();
       }
       return gson;
    }
    public Object invoke(){
       return this.invoke();
    }
}
