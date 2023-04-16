package eja.a$a;
import androidx.recyclerview.widget.RecyclerView$i;
import eja.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import java.lang.Integer;
import java.util.HashMap;

public class a$a extends RecyclerView$i	// class@0026ad
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       c.a(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowAdapterNotifyLogPresenter"), "onChanged");
       return;
    }
    public void h(int p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("positionStart", String.valueOf(p0));
       hashMap.put("itemCount", String.valueOf(p1));
       c.c(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowAdapterNotifyLogPresenter"), "onItemRangeChanged", hashMap);
       return;
    }
    public void i(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a$a.class, "3")) {
          return;
       }
       super.i(p0, p1, p2);
       p2 = new HashMap();
       p2.put("positionStart", String.valueOf(p0));
       p2.put("itemCount", String.valueOf(p1));
       c.c(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowAdapterNotifyLogPresenter"), "onItemRangeChanged", p2);
       return;
    }
    public void j(int p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("positionStart", String.valueOf(p0));
       hashMap.put("itemCount", String.valueOf(p1));
       c.c(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowAdapterNotifyLogPresenter"), "onItemRangeInserted", hashMap);
       return;
    }
    public void k(int p0,int p1,int p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, a$a.class, "6")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("positionStart", String.valueOf(p0));
       hashMap.put("toPosition", String.valueOf(p1));
       hashMap.put("itemCount", String.valueOf(p2));
       c.c(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowAdapterNotifyLogPresenter"), "onItemRangeMoved", hashMap);
       return;
    }
    public void l(int p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "5")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("positionStart", String.valueOf(p0));
       hashMap.put("itemCount", String.valueOf(p1));
       c.c(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowAdapterNotifyLogPresenter"), "onItemRangeRemoved", hashMap);
       return;
    }
}
