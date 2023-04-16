package bwa.b;
import y8c.g;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import q99.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import im8.c;
import y8c.f$b;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import dwa.k;
import dwa.b;
import java.lang.Number;
import com.kwai.component.feedstaggercard.a;
import android.view.ViewGroup;
import gwa.f;
import com.kuaishou.android.model.feed.PhotoType;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import kwa.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import x99.z0;
import jwa.d;
import jwa.f;
import jwa.g;
import jwa.b;
import jwa.c;
import ml8.c;
import x99.s0;
import iwa.d;
import iwa.b;
import iwa.c;
import kwa.e;
import ekd.p1;
import z99.a;
import androidx.recyclerview.widget.RecyclerView;

public class b extends g	// class@000484
{
    public final BaseFragment w;
    public final a x;
    public final CommonInsertCardFeed y;
    public ArrayList z;

    public void b(CommonInsertCardFeed p0,a p1,BaseFragment p2){
       super();
       this.x = p1;
       this.w = p2;
       this.y = p0;
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.k1(p0);
    }
    public void D0(RecyclerView$ViewHolder p0){
       this.l1(p0);
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.z == null) {
          obj = new Object[]{this};
          ArrayList uArrayList = j.a(obj);
          this.z = uArrayList;
          uArrayList.add(this.x);
       }
       b ty = this.y;
       if (ty != null) {
          this.z.add(new c("HOTSPOT_CARD_DATA", ty));
       }
       return this.z;
    }
    public f$b d1(f$b p0){
       QPhoto obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.f = this.w;
       obj = this.N0(p0.b);
       f$b uob = null;
       if (obj == null) {
          return uob;
       }
       if (obj.isVideoType()) {
          return new k(p0, obj);
       }
       if (obj.isLiveStream()) {
          uob = new b(p0, obj);
       }
       return uob;
    }
    public int f0(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return a.d(this.N0(p0));
    }
    public f h1(ViewGroup p0,int p1){
       f uof1;
       View view;
       h i;
       int i1;
       PresenterV2 presenterV2;
       f uof = f.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PhotoType photoType = PhotoType.fromInt(p1);
       if (photoType == PhotoType.VIDEO) {
          uof1 = PatchProxy.applyOneRefs(p0, null, uof, "1");
          if (uof1 != PatchProxyResult.class) {
          }else {
             view = a.i(p0, R.layout.arg_RES_7f0d0607);
             i = h.i;
             i1 = i.b();
             view.setLayoutParams(new ViewGroup$LayoutParams(i1, i.a()));
             presenterV2 = new PresenterV2();
             presenterV2.U7(new z0(Integer.valueOf(R.id.map_feed_surface)));
             presenterV2.U7(new d());
             presenterV2.U7(new f());
             presenterV2.U7(new g());
             presenterV2.U7(new b());
             presenterV2.U7(new c());
             uof1 = new f(view, presenterV2);
          }
          return uof1;
       }else if(photoType == PhotoType.LIVESTREAM){
          uof1 = PatchProxy.applyOneRefs(p0, null, uof, "2");
          if (uof1 != PatchProxyResult.class) {
          }else {
             view = a.i(p0, R.layout.arg_RES_7f0d0606);
             i = h.i;
             i1 = i.b();
             view.setLayoutParams(new ViewGroup$LayoutParams(i1, i.a()));
             presenterV2 = new PresenterV2();
             presenterV2.U7(new s0());
             presenterV2.U7(new d());
             presenterV2.U7(new b());
             presenterV2.U7(new c());
             uof1 = new f(view, presenterV2);
          }
          return uof1;
       }else {
          uof1 = PatchProxy.applyOneRefs(p0, null, e.class, "3");
          if (uof1 != PatchProxyResult.class) {
          }else {
             uof1 = new f(p1.b(p0), new PresenterV2());
          }
          return uof1;
       }
    }
    public void k1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.a(p0.itemView, R.id.play_view_container);
       super.k1(p0);
       return;
    }
    public void l1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       a.b(p0.itemView, R.id.play_view_container);
       super.l1(p0);
       return;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       a.c(p0, R.id.play_view_container);
       super.z0(p0);
       return;
    }
}
