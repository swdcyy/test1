package e72.n;
import y8c.g;
import com.kwai.component.photo.reduce.f;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import java.lang.Object;
import elb.g0;
import a9c.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.HashSet;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import y8c.f$b;
import com.kwai.robust.PatchProxyResult;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import e72.c;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Number;
import e72.q;
import com.kuaishou.android.model.feed.PhotoType;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.ViewStub;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f72.s;
import f72.v;
import f72.u;
import f72.a0;
import f72.o;
import np.d;
import com.kuaishou.android.live.doublelist.danmaku.h;
import f72.b0;
import f72.g;
import f72.t;
import f72.x;
import f72.m;
import f72.c0;
import ml8.c;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import z99.a;
import androidx.recyclerview.widget.RecyclerView;

public class n extends g	// class@00268e
{
    public final f w;
    public final LiveDoubleListParam x;
    public final ArrayList y;

    public void n(f p0,LiveDoubleListParam p1,Object[] p2){
       super(new g0());
       this.w = p0;
       this.x = p1;
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
       }else {
          this.n1("TRANSLATE_DISTANCE", Integer.valueOf(0));
          this.n1("ANIMATE_POSITION", new HashSet());
       }
       this.y = Lists.e(p2);
       return;
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.k1(p0);
    }
    public void D0(RecyclerView$ViewHolder p0){
       this.l1(p0);
    }
    public ArrayList a1(int p0,f p1){
       return this.y;
    }
    public f$b d1(f$b p0){
       QPhoto obj = PatchProxy.applyOneRefs(p0, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N0(p0.b);
       f$b uob = null;
       BaseFeed uBaseFeed = (obj == null)? uob: obj.mEntity;
       if (uBaseFeed == null) {
          return uob;
       }else if(uBaseFeed instanceof LiveStreamFeed){
          c uoc = new c(p0, uBaseFeed, this.x);
          uoc.i = this.w;
          return uoc;
       }else {
          return p0;
       }
    }
    public int f0(int p0){
       Object obj;
       PhotoType photoType;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       QPhoto qPhoto = this.N0(p0);
       obj = PatchProxy.applyOneRefs(qPhoto, null, q.class, "3");
       if (obj != PatchProxyResult.class) {
          qPhoto = obj.intValue();
       }else if(qPhoto != null){
          photoType = PhotoType.fromFeed(qPhoto.mEntity);
       }else {
          photoType = PhotoType.UNKNOWN;
       }
       photoType = photoType.toInt();
       return qPhoto;
    }
    public f h1(ViewGroup p0,int p1){
       View view1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(n.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, n.class, "7");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PhotoType.fromInt(p1) == PhotoType.LIVESTREAM) {
          View view = PatchProxy.applyOneRefs(p0, this, n.class, "8");
          boolean b = true;
          if (view != patchProxyRe) {
          }else if(this.x.mCardStyle == b){
             view1 = a.i(p0, R.layout.arg_RES_7f0d0af2);
          }else {
             view1 = a.i(p0, R.layout.arg_RES_7f0d0af1);
          }
          view = view1;
          ViewStub viewStub = view.findViewById(R.id.live_feed_item_cover_normal_bottom_part_view_stub);
          if (viewStub != null) {
             viewStub.inflate();
          }
          String str = "9";
          PresenterV2 presenterV2 = PatchProxy.applyOneRefsWithListener(view, this, n.class, str);
          if (presenterV2 != patchProxyRe) {
          }else {
             presenterV2 = new PresenterV2();
             presenterV2.U7(new s());
             presenterV2.U7(new v());
             presenterV2.U7(new u());
             if (this.x.mType != 4) {
                presenterV2.U7(new a0());
             }
             presenterV2.U7(new o());
             if (this.x.mCardStyle != b) {
                b = false;
             }
             presenterV2.U7(new d(b));
             presenterV2.U7(new h());
             presenterV2.U7(new b0());
             presenterV2.U7(new g());
             presenterV2.U7(new t());
             presenterV2.U7(new x());
             presenterV2.U7(new m());
             presenterV2.U7(new c0());
             PatchProxy.onMethodExit(n.class, str);
          }
          return new f(view, presenterV2);
       }else {
          throw new IllegalArgumentException(p1+" type not support in"+"LiveDoubleListFeedAdapter");
       }
    }
    public final void k1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       a.a(p0.itemView, R.id.play_view_container);
       super.k1(p0);
       return;
    }
    public final void l1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       a.b(p0.itemView, R.id.play_view_container);
       super.l1(p0);
       return;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "3")) {
          return;
       }
       a.c(p0, R.id.play_view_container);
       super.z0(p0);
       return;
    }
}
