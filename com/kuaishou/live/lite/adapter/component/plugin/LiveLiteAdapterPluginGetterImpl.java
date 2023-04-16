package com.kuaishou.live.lite.adapter.component.plugin.LiveLiteAdapterPluginGetterImpl;
import v33.a;
import java.lang.Object;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.adapter.component.plugin.m;

public class LiveLiteAdapterPluginGetterImpl implements a	// class@001e15
{

    public void LiveLiteAdapterPluginGetterImpl(){
       super();
    }
    public LiveLiteAdapterPlugin getLiveLiteAdapterPlugin(){
       Object obj = PatchProxy.apply(null, this, LiveLiteAdapterPluginGetterImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m();
    }
    public boolean isAvailable(){
       return true;
    }
}
