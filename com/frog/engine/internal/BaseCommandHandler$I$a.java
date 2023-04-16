package com.frog.engine.internal.BaseCommandHandler$I$a;
import java.lang.Runnable;
import com.frog.engine.internal.BaseCommandHandler$I;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.storage.FrogStorageManager;

public class BaseCommandHandler$I$a implements Runnable	// class@00150b
{
    public final String a;
    public final JSONObject b;
    public final BaseCommandHandler$I c;

    public void BaseCommandHandler$I$a(BaseCommandHandler$I p0,String p1,JSONObject p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, BaseCommandHandler$I$a.class, "1")) {
          return;
       }
       BaseCommandHandler mFrogStorage = this.c.a.mFrogStorageManager;
       if (mFrogStorage != null) {
          mFrogStorage.save(this.a, this.b);
       }
       return;
    }
}
