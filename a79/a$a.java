package a79.a$a;
import erd.g;
import a79.a;
import b79.j;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.yxcorp.utility.Log;
import ec7.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class a$a implements g	// class@000050
{
    public final a b;
    public final j c;
    public final int d;

    public void a$a(a p0,j p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          this.c.d = new ArrayList(p0);
          StringBuilder str = "getLocationInfo finished...year="+this.c.b()+",month="+this.c.a()+", size=";
          p0 = (p0 != null)? Integer.valueOf(p0.size()): null;
          Log.g("AlbumAssetAdapter", str+p0);
          p0 = this.d;
          if (p0 >= null && p0 < this.b.e.size()) {
             this.b.l0(this.d);
          }
       }
       return;
    }
}
