package com.yxcorp.gifshow.edit.draft.model.DraftFileGuard$a;
import java.lang.Runnable;
import java.io.File;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.DraftFileGuard;

public final class DraftFileGuard$a implements Runnable	// class@001ae3
{
    public final File b;
    public final String c;
    public final List d;

    public void DraftFileGuard$a(File p0,String p1,List p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DraftFileGuard$a.class, "1")) {
          return;
       }
       DraftFileGuard.b.a(this.b, this.c, this.d);
       return;
    }
}
