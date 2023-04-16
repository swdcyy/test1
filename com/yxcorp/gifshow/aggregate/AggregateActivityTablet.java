package com.yxcorp.gifshow.aggregate.AggregateActivityTablet;
import com.yxcorp.gifshow.aggregate.AggregateActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import java.lang.CharSequence;

public class AggregateActivityTablet extends AggregateActivity	// class@001929
{

    public void AggregateActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AggregateActivityTablet.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AggregateActivityTablet.class, "1")) {
          return;
       }
       Intent intent = this.getIntent();
       if (intent != null) {
          Uri data = intent.getData();
          if (data != null) {
             String host = data.getHost();
             if (host != null) {
                String str = "_tablet";
                if (host.indexOf(str) > -1) {
                   intent.setData(Uri.parse((data.toString()).replace(host, host.substring(0, host.indexOf(str)))));
                }
             }
          }
       }
       super.onCreate(p0);
       return;
    }
}
