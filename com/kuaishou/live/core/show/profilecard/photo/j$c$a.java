package com.kuaishou.live.core.show.profilecard.photo.j$c$a;
import androidx.recyclerview.widget.h$b;
import com.kuaishou.live.core.show.profilecard.photo.j$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.profilecard.photo.j;
import java.util.List;
import com.kuaishou.live.core.show.profilecard.photo.h;
import com.kwai.framework.model.feed.BaseFeed;
import qvb.n0;
import java.lang.Number;
import qvb.a;

public class j$c$a extends h$b	// class@000deb
{
    public final j$c a;

    public void j$c$a(j$c p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,int p1){
       return true;
    }
    public boolean b(int p0,int p1){
       j$c$a uoc$a = j$c$a.class;
       if (PatchProxy.isSupport(uoc$a)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc$a, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       BaseFeed uBaseFeed = this.a.b.F.v1().get(p0);
       BaseFeed item = this.a.b.G.getItem(p1);
       if (uBaseFeed == null && item == null) {
          return true;
       }else if(uBaseFeed != null && item != null){
          return uBaseFeed.equals(item);
       }else {
          return false;
       }
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, j$c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.b.G.getItems().size();
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, j$c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.b.F.v1().size();
    }
}
