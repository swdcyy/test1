package com.frog.engine.internal.BaseCommandHandler$b$a;
import java.lang.Runnable;
import com.frog.engine.internal.BaseCommandHandler$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.storage.FrogStorageManager;

public class BaseCommandHandler$b$a implements Runnable	// class@00150e
{
    public final String a;
    public final BaseCommandHandler$b b;

    public void BaseCommandHandler$b$a(BaseCommandHandler$b p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, BaseCommandHandler$b$a.class, "1")) {
          return;
       }
       BaseCommandHandler mFrogStorage = this.b.a.mFrogStorageManager;
       if (mFrogStorage != null) {
          mFrogStorage.remove(this.a);
       }
       return;
    }
}
