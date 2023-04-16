package fx2.h;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import fx2.h$a;
import nsd.u;
import dx2.p;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import fx2.h$b;
import rsd.e;
import java.lang.CharSequence;
import dx2.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.LinearLayoutManager;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import fx2.h$f;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import com.yxcorp.gifshow.tube.TubeInfo;
import java.lang.Long;
import lnc.a1;
import android.view.View$OnClickListener;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.User;
import fx2.h$d;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeInfo;
import java.lang.Boolean;
import java.lang.Number;
import qu2.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import g9c.a;
import fx2.h$e;
import im8.f;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SearchResultPackage;

public final class h extends KPresenterV2	// class@002a09
{
    public VoicePartyTheaterTubeFeedWithEpisodes q;
    public f r;
    public final h$b s;
    public final e t;
    public final e u;
    public final e v;
    public final e w;
    public final e x;
    public final p y;
    public final a$a z;
    public static final n[] A;
    public static final h$a B;
    public static String sLivePresenterClassName;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(h.class, "mEpisodesRecycleView", "getMEpisodesRecycleView\(\)Landroidx/recyclerview/widget/RecyclerView;", 0)),m0.r(new PropertyReference1Impl(h.class, "mNameTextView", "getMNameTextView\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(h.class, "mEpisodeCountTextView", "getMEpisodeCountTextView\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(h.class, "mAuthorNameTextView", "getMAuthorNameTextView\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(h.class, "mPlayButton", "getMPlayButton\(\)Landroid/widget/TextView;", 0))};
       h.A = onArray;
       h.B = new h$a(null);
    }
    public void h(p p0,a$a p1){
       a.p(p0, "mContext");
       a.p(p1, "mCallback");
       super();
       this.y = p0;
       this.z = p1;
       this.s = new h$b(this);
       this.t = this.S8(0x7f0a14c2);
       this.u = this.S8(0x7f0a40ae);
       this.v = this.S8(0x7f0a0d71);
       this.w = this.S8(0x7f0a030d);
       this.x = this.S8(0x7f0a30c8);
    }
    public static a c9(h p0,CharSequence p1,int p2,Object p3){
       return p0.b9(null);
    }
    public void E8(){
       TubeInfo mName;
       boolean b1;
       VoicePartyTheaterTubeFeedWithEpisodes obj1;
       int i1;
       h ts;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "7")) {
          return;
       }
       boolean b = false;
       if (!PatchProxy.applyVoid(objArray, this, oh, "9")) {
          NpaLinearLayoutManager npaLinearLay = new NpaLinearLayoutManager(this.getContext());
          npaLinearLay.setOrientation(b);
          this.Z8().setLayoutManager(npaLinearLay);
          this.Z8().setAdapter(this.s);
       }
       h$f uof = new h$f(this);
       TextView textView = PatchProxy.apply(objArray, this, oh, "2");
       TextView textView1 = 1;
       if (textView == patchProxyRe) {
          textView = this.u.a(this, h.A[textView1]);
       }
       h tq = this.q;
       if (tq != null) {
          VoicePartyTheaterTubeFeedWithEpisodes mTube = tq.mTube;
          if (mTube != null) {
             mName = mTube.mName;
          label_005d :
             textView.setText(mName);
             textView = this.Y8();
             int i = 0x7f105112;
             h tq1 = this.q;
             if (tq1 != null) {
                VoicePartyTheaterTubeFeedWithEpisodes mTube1 = tq1.mTube;
                if (mTube1 != null) {
                   Long longx = Long.valueOf(mTube1.mTotalEpisodeCount);
                label_0077 :
                   a.m(longx);
                   textView.setText(a1.q(i, (int)longx.longValue()));
                   this.Y8().setOnClickListener(uof);
                   textView = this.X8();
                   StringBuilder str = "@";
                   tq1 = this.q;
                   if (tq1 != null) {
                      mTube1 = tq1.mTube;
                      if (mTube1 != null) {
                         TubeInfo mUser = mTube1.mUser;
                         if (mUser != null) {
                            User mName1 = mUser.mName;
                         label_00ab :
                            textView.setText(str+mName1);
                            this.X8().setOnClickListener(uof);
                            this.a9().setOnClickListener(new h$d(this));
                            h tq2 = this.q;
                            if (tq2 != null) {
                               VoicePartyTheaterTubeFeedWithEpisodes mTube2 = tq2.mTube;
                               if (mTube2 != null && mTube2.mTubeType == 4) {
                                  b1 = true;
                               label_00d8 :
                                  String obj = PatchProxy.apply(objArray, this, oh, "13");
                                  if (obj != patchProxyRe) {
                                     b = obj.booleanValue();
                                  }else {
                                     obj = this.y.e();
                                     if (obj != null) {
                                        tq1 = this.q;
                                        if (tq1 != null) {
                                           mTube1 = tq1.mTube;
                                           if (mTube1 != null) {
                                              mUser = mTube1.mTubeId;
                                           label_00fb :
                                              if (a.g(obj, mUser)) {
                                                 b = 1;
                                              }
                                           }
                                        }
                                        objArray1 = objArray;
                                        goto label_00fb ;
                                     }
                                  }
                                  this.a9().setEnabled((b ^ 0x01));
                                  textView1 = this.a9();
                                  if (PatchProxy.isSupport(oh)) {
                                     obj1 = PatchProxy.applyTwoRefs(Boolean.valueOf(b1), Boolean.valueOf(b), this, oh, "12");
                                     if (obj1 != patchProxyRe) {
                                        i1 = obj1.intValue();
                                     }else if(b){
                                        i1 = 0x7f102e6d;
                                     }else if(!this.y.d().e()){
                                        i1 = 0x7f102d16;
                                     }else {
                                        ts = this.q;
                                        if (ts != null) {
                                           VoicePartyTheaterTubeFeedWithEpisodes mTube3 = ts.mTube;
                                           if (mTube3 != null && mTube3.mTubeType == 4) {
                                              i1 = 0x7f102e6c;
                                           }
                                        }
                                        i1 = 0x7f102d12;
                                     }
                                  }else {
                                     goto label_012c ;
                                  }
                                  textView1.setText(i1);
                                  ts = this.s;
                                  oh = this.q;
                                  if (oh != null) {
                                     obj1 = oh.mEpisodes;
                                     if (obj1 != null) {
                                     label_0167 :
                                        ts.W0(obj1);
                                        this.s.k0();
                                        this.s.g = new h$e(this);
                                        ts = this.z;
                                        oh = this.q;
                                        tq2 = this.r;
                                        if (tq2 != null) {
                                           objArray = tq2.get();
                                        }
                                        a.m(objArray);
                                        ts.g(oh, objArray);
                                        return;
                                     }
                                  }
                                  List list = CollectionsKt__CollectionsKt.E();
                                  goto label_0167 ;
                               }
                            }
                            b1 = false;
                            goto label_00d8 ;
                         }
                      }
                   }
                   objArray1 = objArray;
                   goto label_00ab ;
                }
             }
             objArray1 = objArray;
             goto label_0077 ;
          }
       }
       mName = objArray;
       goto label_005d ;
    }
    public void H8(){
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "8")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, oh, "10")) {
          this.s.M0();
       }
       return;
    }
    public final boolean W8(){
       boolean b;
       h tq = this.q;
       if (tq != null) {
          VoicePartyTheaterTubeFeedWithEpisodes mTube = tq.mTube;
          if (mTube != null) {
             TubeInfo mTotalEpisod = mTube.mTotalEpisodeCount;
          label_000d :
             b = (mTotalEpisod - (long)6 > 0)? true: false;
             return b;
          }
       }
       b = 0;
       goto label_000d ;
    }
    public final TextView X8(){
       Object obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.a(this, h.A[3]);
    }
    public final TextView Y8(){
       Object obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.a(this, h.A[2]);
    }
    public final RecyclerView Z8(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.a(this, h.A[0]);
    }
    public final TextView a9(){
       Object obj = PatchProxy.apply(null, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.a(this, h.A[4]);
    }
    public final a b9(CharSequence p0){
       String str1;
       a obj = PatchProxy.applyOneRefs(p0, this, h.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       ClientContent$SearchResultPackage searchResult = new ClientContent$SearchResultPackage();
       h tq = this.q;
       String str = null;
       if (tq != null) {
          VoicePartyTheaterTubeFeedWithEpisodes mTube = tq.mTube;
          if (mTube != null) {
             TubeInfo mName = mTube.mName;
          label_0026 :
             searchResult.name = mName;
             tq = this.r;
             Integer integer = (tq != null)? tq.get(): str;
             a.m(integer);
             searchResult.position = integer.intValue() + 1;
             tq = this.q;
             if (tq != null) {
                mTube = tq.mTube;
                if (mTube != null) {
                   mName = mTube.mTubeId;
                label_004b :
                   searchResult.contentId = mName;
                   obj.i = searchResult;
                   h tr = this.r;
                   Integer integer1 = (tr != null)? tr.get(): str;
                   a.m(integer1);
                   obj.a = integer1.intValue() + 1;
                   if (p0 != null) {
                      str = p0.toString();
                   }
                   obj.g = str;
                   return obj;
                }
             }
             str1 = str;
             goto label_004b ;
          }
       }
       str1 = str;
       goto label_0026 ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "6")) {
          return;
       }
       this.q = this.q8(VoicePartyTheaterTubeFeedWithEpisodes.class);
       this.r = this.x8("ADAPTER_POSITION");
       return;
    }
}
