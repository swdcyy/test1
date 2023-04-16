package com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$b;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;

public final class EditFrameRepo$a$a implements Runnable	// class@000f9d
{
    public final EditFrameRepo$a b;

    public void EditFrameRepo$a$a(EditFrameRepo$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EditFrameRepo$a$a.class, "1")) {
          return;
       }
       EditFrameRepo$a$a tb = this.b;
       tb.a.c.f(tb);
       return;
    }
}
