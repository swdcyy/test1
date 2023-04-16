package com.kuaishou.post.story.edit.decoration.text.s0$a;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager$TextColors;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class s0$a	// class@000b15
{
    public StoryTextDataManager$TextColors a;
    public boolean b;

    public void s0$a(StoryTextDataManager$TextColors p0){
       super();
       this.a = p0;
       this.b = false;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof s0$a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       s0$a ta = this.a;
       p0 = p0.a;
       if (ta != null) {
          b = ta.equals(p0);
       }else if(p0 == null){
          b = false;
       }
       return b;
    }
    public int hashCode(){
       s0$a obj = PatchProxy.apply(null, this, s0$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.b);
    }
}
