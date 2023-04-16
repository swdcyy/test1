package com.kuaishou.android.post.topic.TagSourceUtils$b;
import java.lang.Runnable;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.post.topic.TagSourceUtils;
import java.util.List;

public final class TagSourceUtils$b implements Runnable	// class@000ec0
{
    public final ArrayList b;
    public final String c;
    public final String d;

    public void TagSourceUtils$b(ArrayList p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TagSourceUtils$b.class, "1")) {
          return;
       }
       TagSourceUtils.e(TagSourceUtils.b, this.b, this.c, this.d, false, 8, null);
       return;
    }
}
