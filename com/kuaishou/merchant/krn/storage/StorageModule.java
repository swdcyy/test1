package com.kuaishou.merchant.krn.storage.StorageModule;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import java.lang.Object;

public class StorageModule extends KrnBridge	// class@001872
{

    public void StorageModule(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "KSMerchantRCTStorage";
    }
    public void getSeckillStartTime(Promise p0){
       p0.resolve("-1");
    }
}
