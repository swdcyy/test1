package awa.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.hotspot.HotspotNativeCardFragment;
import androidx.recyclerview.widget.RecyclerView;
import awa.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import java.util.Map;
import awa.b;
import awa.c;
import awa.d;
import mm8.a;

public final class e implements b	// class@00032b
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(RecyclerView.class, new a(this, p1));
       p0.h(Map.class, new b(this, p1));
       RecyclerView recyclerView = RecyclerView.class;
       c uoc = new c(this, p1);
       try{
          p0.h(recyclerView, uoc);
          p0.h(HotspotNativeCardFragment.class, new d(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
