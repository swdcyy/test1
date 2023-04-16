package cdd.i;
import y8c.g;
import com.yxcorp.gifshow.log.e;
import pa5.o;
import java.lang.String;
import java.lang.Object;
import a9c.e;
import java.util.Objects;
import android.view.ViewGroup;
import y8c.f;
import y8c.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import y8c.a;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import erd.g;
import crd.b;
import tkd.b;
import tkd.d;
import nl9.v;
import androidx.recyclerview.widget.RecyclerView;
import cdd.i$a;
import androidx.recyclerview.widget.RecyclerView$o;
import android.view.View;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.entity.SearchItem;
import sy5.a;
import com.search.common.entity.SearchBaseItem;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import g9c.d;

public class i extends g	// class@000536
{
    public final e w;
    public final int x;

    public void i(){
       super();
       e uoe = new e(true);
       this.w = uoe;
       this.x = 10;
       o oo = new o(uoe);
       this.n1("feedCoverLogger", oo);
    }
    public void i(e p0){
       super(p0);
       p0 = new e(true);
       this.w = p0;
       this.x = 10;
       Objects.requireNonNull(p0);
       o oo = new o(p0);
       this.n1("feedCoverLogger", oo);
    }
    public f h1(ViewGroup p0,int p1){
       return null;
    }
    public void o1(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.o1(p0);
       this.k.I5().compose(c.c(this.k.m(), FragmentEvent.DESTROY)).subscribe(this.w);
       d.a(0x53db42e7).ZC(p0.h0(), this, p0);
       p0.h0().addOnChildAttachStateChangeListener(new i$a(this));
       return;
    }
    public QPhoto r1(View p0){
       SearchItem obj = PatchProxy.applyOneRefs(p0, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.getTag(R.id.search_item_view_data_tag);
       if (p0 instanceof SearchItem) {
          obj = p0.mPhoto;
          if (obj != null) {
             obj.setListLoadSequenceID(p0.getLLsid());
             p0.mPhoto.setLogReportContent(a.k().e("searchSessionId", p0.mSessionId).i());
             return p0.mPhoto;
          }
       }
       return null;
    }
    public boolean s1(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       RecyclerView$ViewHolder childViewHol = this.k.h0().getChildViewHolder(p0);
       boolean b = false;
       if (childViewHol != null && (this.k.ia() != null && (!this.k.ia().f1(childViewHol.getItemViewType()) && !this.k.ia().h1(childViewHol.getItemViewType())))) {
          b = true;
       }
    label_0049 :
       return b;
    }
}
