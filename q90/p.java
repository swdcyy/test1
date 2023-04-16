package q90.p;
import com.yxcorp.gifshow.fragment.f;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import q90.y;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import java.lang.Boolean;
import qvb.i;
import e17.i;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import mkc.b;

public final class p extends f	// class@00299a
{
    public View l;
    public final y m;
    public final String n;

    public void p(KSFeedListFragment p0,String p1){
       a.p(p0, "fragment");
       a.p(p1, "groupId");
       super(p0);
       this.n = p1;
       this.m = new y();
    }
    public View J0(){
       p obj = PatchProxy.apply(null, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          this.l = this.n();
       }
       obj = this.l;
       a.m(obj);
       return obj;
    }
    public void k(boolean p0,Throwable p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, op, "4")) {
          return;
       }
       super.k(p0, p1);
       if (p0) {
          f tg = this.g;
          a.o(tg, "mFragment");
          i oi = tg.q();
          a.o(oi, "mFragment.pageList");
          if (oi.isEmpty()) {
             i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          }
       }
       return;
    }
    public View n(){
       KwaiEmptyStateView$a uoa;
       p tl;
       p tl1;
       p obj = PatchProxy.apply(null, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          this.l = super.n();
          obj = this.n;
          int i = obj.hashCode();
          if (i != 49) {
             if (i == 0xdd19 && obj.equals("999")) {
                uoa = (PostExperimentUtils.m0() == 1)? 1: 0;
                KwaiEmptyStateView$a uoa1 = KwaiEmptyStateView.e();
                uoa1.j(0);
                uoa1.k(R.drawable.arg_RES_7f081cd2);
                int i1 = (uoa)? 0x7f101ba3: 0x7f101bed;
                uoa1.h(i1);
                uoa1.q(3);
                obj = this.l;
                a.m(obj);
                uoa1.a(obj);
             }else {
             label_008a :
                uoa = KwaiEmptyStateView.e();
                uoa.q(3);
                tl = this.l;
                a.m(tl);
                uoa.a(tl);
             }
          }else if(obj.equals("1")){
             uoa = KwaiEmptyStateView.e();
             uoa.j(0);
             uoa.k(R.drawable.arg_RES_7f08103e);
             uoa.h(R.string.arg_RES_7f101bc6);
             uoa.q(3);
             tl = this.l;
             a.m(tl);
             uoa.a(tl);
          }else {
             goto label_008a ;
          }
          View[] viewArray = new View[]{tl1,this.f};
          tl1 = this.l;
          a.m(tl1);
          this.m.a(CollectionsKt__CollectionsKt.L(viewArray));
          obj = this.l;
          if (obj != null) {
             obj.setTag(R.id.view_status_tag, "ignore");
          }
       }
       obj = this.l;
       a.m(obj);
       return obj;
    }
    public b r(){
       b obj = PatchProxy.apply(null, this, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.e;
       a.o(obj, "TipsType.LOADING_ALWAYS_GRAY");
       return obj;
    }
}
