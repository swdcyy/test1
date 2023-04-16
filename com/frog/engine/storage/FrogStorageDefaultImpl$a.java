package com.frog.engine.storage.FrogStorageDefaultImpl$a;
import java.lang.Runnable;
import com.frog.engine.storage.FrogStorageDefaultImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class FrogStorageDefaultImpl$a implements Runnable	// class@00156a
{
    public final FrogStorageDefaultImpl a;

    public void FrogStorageDefaultImpl$a(FrogStorageDefaultImpl p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogStorageDefaultImpl$a.class, "1")) {
          return;
       }
       this.a.initMMKV();
       return;
    }
}
