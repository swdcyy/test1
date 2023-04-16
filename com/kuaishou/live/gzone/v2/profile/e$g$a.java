package com.kuaishou.live.gzone.v2.profile.e$g$a;
import androidx.recyclerview.widget.h$b;
import com.kuaishou.live.gzone.v2.profile.e$g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.gzone.v2.profile.e;
import java.util.List;
import com.kuaishou.live.gzone.v2.profile.j;
import com.kwai.framework.model.feed.BaseFeed;
import qvb.n0;
import java.lang.Number;
import qvb.a;

public class e$g$a extends h$b	// class@001ce4
{
    public final e$g a;

    public void e$g$a(e$g p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,int p1){
       return true;
    }
    public boolean b(int p0,int p1){
       e$g$a og$a = e$g$a.class;
       if (PatchProxy.isSupport(og$a)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, og$a, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       BaseFeed uBaseFeed = this.a.b.Z.v1().get(p0);
       BaseFeed item = this.a.b.U0.getItem(p1);
       if (uBaseFeed == null && item == null) {
          return true;
       }else if(uBaseFeed != null && item != null){
          return uBaseFeed.equals(item);
       }else {
          return false;
       }
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, e$g$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.b.U0.getItems().size();
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, e$g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.b.Z.v1().size();
    }
}
