package com.kuaishou.android.post.topic.TagSourceUtils$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.post.topic.TagSourceUtils;

public final class TagSourceUtils$a implements Runnable	// class@000ebf
{
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public void TagSourceUtils$a(String p0,String p1,String p2,boolean p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TagSourceUtils$a.class, "1")) {
          return;
       }
       TagSourceUtils.b.a(this.b, this.c, this.d, this.e);
       return;
    }
}
