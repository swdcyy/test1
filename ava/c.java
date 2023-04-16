package ava.c;
import jb5.e;
import qvb.f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedList;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils;
import com.kuaishou.android.model.mix.CommonMeta;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import qvb.a;
import qvb.n0;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.components.feedmodel.HotSpotInfo;
import com.kuaishou.android.model.mix.w;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import bva.a;
import bva.b;
import java.lang.Long;
import cjd.e;
import erd.o;
import ava.c$a;
import erd.g;
import la6.b;
import b06.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class c extends f implements e	// class@000324
{
    public List p;
    public final LinkedList q;
    public QPhoto r;
    public final List s;

    public void c(QPhoto p0,List p1){
       a.p(p0, "currentPhoto");
       super();
       this.r = p0;
       this.s = p1;
       this.q = new LinkedList();
       int i = 0;
       if (HotSpotExperimentUtils.b()) {
          CommonMeta commonMeta = this.r.getCommonMeta();
          a.m(commonMeta);
          commonMeta.mHotSpotDoubleCoverPhotoId = this.r.getPhotoId();
          Iterator iterator = (p1 == null || p1.isEmpty())? 1: null;
          if (!iterator) {
             iterator = p1.iterator();
             while (iterator.hasNext()) {
                QPhoto qPhoto = iterator.next();
                CommonMeta commonMeta1 = qPhoto.getCommonMeta();
                a.m(commonMeta1);
                commonMeta1.mHotSpotDoubleCoverPhotoId = qPhoto.getPhotoId();
             }
          }
       }
       c ts = this.s;
       if (ts == null || ts.isEmpty()) {
          i = 1;
       }
       if (i) {
          this.add(this.r);
       }else {
          this.q.addAll(this.s);
          this.h2();
       }
       this.R1(true);
       return;
    }
    public t I1(){
       Object[] objArray = null;
       HotSpotInfo obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = w.T(this.r.mEntity);
       HotSpotInfo hotSpotInfo = (obj != null)? obj.recoReason: objArray;
       obj = w.T(this.r.mEntity);
       HotSpotInfo hotSpotInfo1 = (obj != null)? obj.mWordId: objArray;
       if (this.K() || (this.L0() != null && !a.g("no_more", this.L0().mCursor))) {
          objArray = this.L0().mCursor;
       }
    label_0053 :
       t ot = a.a.a().a(objArray, null, "popular", hotSpotInfo1, null, hotSpotInfo).map(new e()).doOnNext(c$a.b);
       a.o(ot, "HotSpotApi.getService\(\).бн_SPOT, it.mLlsid\)\n      }");
       return ot;
    }
    public void M1(Object p0,List p1){
       this.i2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.i2(p0, p1);
    }
    public final QPhoto h2(){
       QPhoto obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q.poll();
       if (obj != null) {
          this.add(obj);
       }
       return obj;
    }
    public boolean i(){
       return false;
    }
    public void i2(HomeFeedResponse p0,List p1){
       c tp;
       long l;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       int i = 0;
       if (HotSpotExperimentUtils.b() && p0 != null) {
          List items = p0.getItems();
          items = (items == null || items.isEmpty())? 1: null;
          if (!items) {
             items = p0.getItems();
             a.o(items, "response.items");
             Iterator iterator = items.iterator();
             while (iterator.hasNext()) {
                QPhoto qPhoto = iterator.next();
                a.o(qPhoto, "it");
                CommonMeta commonMeta = qPhoto.getCommonMeta();
                if (commonMeta != null) {
                   commonMeta.mHotSpotDoubleCoverPhotoId = this.r.getPhotoId();
                }
             }
          }
       }
       super.d2(p0, p1);
       if (this.K()) {
          tp = this.p;
          tp = (tp == null || tp.isEmpty())? 1: null;
          if (tp) {
             if (p1 != null) {
                p1.add(i, this.r);
             }
          }else if(p1 != null){
             tp = this.p;
             a.m(tp);
             p1.addAll(i, tp);
          }
          tp = this.p;
          if (tp != null) {
             tp.clear();
          }
       }
    label_0086 :
       if (HotSpotExperimentUtils.c()) {
          d.c(p1);
       }
       if (!this.hasMore()) {
          tp = this.L0();
          if (tp != null) {
             tp.mCursor = null;
          }
          QPhoto qPhoto1 = this.h2();
          while (qPhoto1 != null) {
             HotSpotInfo hotSpotInfo = w.T(qPhoto1.mEntity);
             c uoc = null;
             if (hotSpotInfo != null) {
                hotSpotInfo = hotSpotInfo.mWordId;
                if (hotSpotInfo != null) {
                   l = hotSpotInfo.longValue();
                label_00ba :
                   if (l - uoc) {
                      break ;
                   }
                }
             }
             l = uoc;
             goto label_00ba ;
          }
          if (!HotSpotExperimentUtils.c()) {
             if (this.K()) {
                QPhoto qPhoto2 = (p1 == null || p1.isEmpty())? 1: null;
                if (!qPhoto2 && TextUtils.n(p1.get(i).getPhotoId(), this.r.getPhotoId())) {
                   p1.remove(i);
                }
             }
          }else {
             d.c(p1);
          }
          if (qPhoto1 != null) {
             this.r = qPhoto1;
             this.R1(true);
             if (this.K()) {
                int i1 = (p1 != null)? p1.size(): 0;
                if (i1 <= 1) {
                   tp = this.s;
                   if (tp != null) {
                      i = tp.size();
                   }
                   if (i <= 1) {
                      this.load();
                   }
                }
             }
          }
       }
    label_0119 :
       return;
    }
    public void k(List p0){
       this.p = p0;
    }
}
