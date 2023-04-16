package com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel$e;
import erd.a;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;

public final class MoodTemplateViewModel$e implements a	// class@000b75
{
    public final MoodTemplateViewModel b;
    public final boolean c;

    public void MoodTemplateViewModel$e(MoodTemplateViewModel p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MoodTemplateViewModel$e.class, "1")) {
          return;
       }
       if (this.c != null) {
          this.b.w0().setValue(Boolean.FALSE);
       }
       return;
    }
}
