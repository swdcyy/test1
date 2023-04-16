package nfd.l2;
import ha5.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import e7d.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPreInfo;
import fg6.a;
import com.google.gson.Gson;
import oe6.e;
import com.kwai.framework.model.feed.BaseFeed;
import ha5.d;
import y8c.g;
import g9c.a;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.gifshow.entity.QPhoto;
import vm5.h$a;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CommonMeta;

public class l2 implements e	// class@001dca
{
    public final RecyclerFragment a;
    public final h b;

    public void l2(RecyclerFragment p0,h p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,String p1,String p2,String p3,boolean p4,int p5){
       l2 ol2 = l2.class;
       if (PatchProxy.isSupport(ol2)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, ol2, "1")) {
             return;
          }
       }
       e.k0(a.a.q(QPreInfo.createPreInfo(p0, p1, p2, p3, p4, p5)));
       return;
    }
    public void b(BaseFeed p0,int p1){
       d.c(this, p0, p1);
    }
    public void c(BaseFeed p0,int p1){
       l2 ol2 = l2.class;
       if (PatchProxy.isSupport(ol2) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ol2, "2")) {
          return;
       }
       ol2 = null;
       if (this.a.g7() != null && this.a.g7().N0(p1) != null) {
          this.b.O(new QPhoto(p0), this.a.g7().N0(p1));
       }else {
          this.b.O(new QPhoto(p0), ol2);
       }
       return;
    }
    public void d(h$a p0,int p1){
       d.e(this, p0, p1);
    }
    public int[] e(CoverMeta p0,CommonMeta p1){
       return d.a(this, p0, p1);
    }
}
