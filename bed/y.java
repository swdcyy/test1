package bed.y;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.plugin.search.result.hashtag.entity.ShootParam;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import java.lang.String;
import java.lang.Object;
import a46.b;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import pm6.m;
import qm6.b$a;
import com.kuaishou.android.model.music.Music;
import java.io.File;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import kqb.g0;
import com.yxcorp.gifshow.model.Lyrics;
import java.util.List;
import com.yxcorp.gifshow.music.utils.o;
import org.json.JSONObject;
import e16.b;
import android.net.Uri;
import ekd.w0;
import java.lang.Boolean;
import com.kwai.feature.post.api.music.data.MusicSource;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import ixc.c;
import android.app.Activity;
import brd.t;
import com.yxcorp.gifshow.music.utils.c;
import com.yxcorp.gifshow.fragment.ObservableBox$b;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.fragment.ObservableBox;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import t45.d;
import brd.z;
import bed.t;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import android.content.Context;
import lnc.s6;
import bed.q0;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import lnc.s;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import bed.c0;
import erd.o;
import bed.e0;
import bed.d0;
import bed.g0;
import brd.w;
import erd.c;
import bed.k0;
import bed.l0;
import bed.f;
import bed.k;
import bed.z;
import io.reactivex.g;
import bed.y$a;
import bed.s;
import com.yxcorp.gifshow.entity.QPhoto;
import ded.f;
import bed.a;
import ded.f$b;
import pm6.o;
import e17.i;
import hn6.c;
import bed.i;
import bed.j;
import uy5.a;
import java.lang.StringBuilder;
import q87.c;
import bed.w;
import android.content.Intent;
import bed.v;
import bed.n;
import bed.g;

public class y	// class@000428
{
    public final GifshowActivity a;
    public final TagInfo b;
    public final ShootParam c;
    public f d;
    public final int e;
    public final int f;
    public SimpleMagicFace g;
    public final String h;

    public void y(GifshowActivity p0,ShootParam p1,TagInfo p2,String p3){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p1;
       b uob = y6.r(b.class);
       int i = (uob != null)? uob.s20(): -1;
       this.e = i;
       int i1 = (uob != null)? uob.xa(): m.b(0);
       this.f = i1;
       this.h = p3;
       return;
    }
    public b$a a(b$a p0,Music p1,File p2,long p3,long p4,long p5,String p6){
       Lyrics obj;
       y oy = this;
       object oobject = p0;
       object oobject1 = p1;
       long l = p3;
       long l1 = p4;
       object oobject2 = p6;
       y oy1 = y.class;
       if (PatchProxy.isSupport(oy1)) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Long.valueOf(p3),Long.valueOf(p4),Long.valueOf(p5),oobject2};
          obj = PatchProxy.apply(objArray, this, oy1, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new g0().b(oobject1.mLyrics);
       obj = (obj != null && !obj.mLines.isEmpty())? o.a(obj, (l1 + p5), l): 0;
       Lyrics lyrics = obj;
       JSONObject jSONObject = b.a(p1, p4, p3, true);
       if (p2 != null) {
          oobject.B(w0.c(p2));
       }
       oobject.G(Boolean.FALSE).P(oobject1).U(MusicSource.TAG).T(jSONObject.toString()).V(l1).R(l).I(lyrics).H((l1 + p5)).Q(oobject2);
       if (!TextUtils.x(oy.h)) {
          oobject.h0(oy.h);
       }
       return oobject;
    }
    public long b(Music p0){
       ShootParam mMusicStartT;
       y obj = PatchProxy.applyOneRefs(p0, this, y.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (p0.mLyrics == null) {
          obj = this.c;
          if (obj != null) {
             mMusicStartT = obj.mMusicStartTime;
             if (mMusicStartT > 0) {
             label_0028 :
                return mMusicStartT;
             }
          }
       }
       mMusicStartT = o.h(p0);
       goto label_0028 ;
    }
    public final void c(b$a p0,SimpleMagicFace p1,Music p2){
       y tc;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, y.class, "23")) {
          return;
       }
       if (p1 != null) {
          p0.M(p1.mId);
          if (!TextUtils.x(p1.mChildId)) {
             p0.o(p1.mChildId);
          }
       }
       if (p2 != null) {
          long l = this.d(p0.g());
          if (this.j(p0.g())) {
             tc = this.c;
             if (tc != null) {
                ShootParam mMusicStartT = tc.mMusicStartTime;
                if (!mMusicStartT || !mMusicStartT - (long)p2.mChorus) {
                   tc = 1;
                label_004d :
                   long l1 = this.b(p2);
                   long l2 = (tc)? 0: l1;
                   long l3 = (tc)? l1: 0;
                   this.a(p0, p2, null, l, l2, l3, null);
                }
             }
          }
          tc = null;
          goto label_004d ;
       }
       if (!TextUtils.x(this.h)) {
          p0.h0(this.h);
       }
       return;
    }
    public long d(int p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oy, "4");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (this.e != 1) {
          return TimeUnit.MINUTES.toMillis(1);
       }else {
          return (long)m.b(p0);
       }
    }
    public void e(int p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy, "12")) {
          return;
       }
       this.f(p0, null);
       return;
    }
    public void f(int p0,SimpleMagicFace p1){
       t ot;
       b$a uoa;
       y tb;
       TagInfo mMagicFace;
       y tg;
       TagInfo tagInfo;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oy, "13")) {
          return;
       }
       y ta = this.a;
       if (ta != null && !ta.isFinishing()) {
          boolean b = true;
          Object[] objArray = null;
          if (this.e != -1) {
             if (!PatchProxy.applyVoid(objArray, this, oy, "25")) {
                ObservableBox$b uob = new ObservableBox$b(this.a);
                uob.a(b);
                ot = ObservableBox.b(c.b(this.b.mMusic, (long)this.f), uob);
                ot.compose(c.c(this.a.m(), ActivityEvent.DESTROY)).subscribeOn(d.c).observeOn(d.a).subscribe(new t(this), h.b);
             }
             return;
          }else if(PatchProxy.isSupport(oy)){
             q0 obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oy, "14");
             if (obj != patchProxyRe) {
                uoa = obj;
             label_00b3 :
                if (s6.H()) {
                   tb = this.b;
                   if (tb != null) {
                      oy = this.g;
                      if (oy == null) {
                         mMagicFace = tb.mMagicFace;
                         if (mMagicFace == null) {
                            mMagicFace = p1;
                         }
                      }
                      objArray = tb.mMusic;
                   }else {
                      mMagicFace = p1;
                   }
                   this.c(uoa, oy, objArray);
                   this.l(uoa);
                   return;
                }else {
                   obj = new q0(this.a, this.h);
                   tg = this.g;
                   if (tg != null) {
                      y tb1 = this.b;
                      if (tb1 != null) {
                         mMagicFace = tb1.mMusic;
                         q0 oq0 = q0.class;
                         if (!PatchProxy.applyVoidTwoRefs(mMagicFace, tg, obj, oq0, "3")) {
                            RecordPostPlugin recordPostPl = y6.r(RecordPostPlugin.class);
                            if (recordPostPl == null || recordPostPl.isAvailable()) {
                               b uob1 = y6.r(b.class);
                               int i = (uob1 != null)? uob1.xa(): m.b(0);
                               t ot1 = PatchProxy.applyOneRefs(tg, obj, oq0, "4");
                               if (ot1 != patchProxyRe) {
                               }else {
                                  ot1 = qa.s(c.class, LoadPolicy.SILENT_IMMEDIATE).w(new c0(tg)).onErrorReturnItem(q0.d).flatMap(new e0(obj)).flatMap(new d0(obj));
                               }
                               ObservableBox$b uob2 = new ObservableBox$b(obj.b);
                               uob2.a(b);
                               ot = ObservableBox.b(t.zip(ot1, c.b(mMagicFace, (long)i), g0.a), uob2);
                               ot.compose(c.c(obj.b.m(), ActivityEvent.DESTROY)).subscribeOn(d.c).observeOn(d.a).subscribe(new k0(obj), new l0(obj, mMagicFace));
                            }
                         }
                         return;
                      }
                   }
                   tb = this.b;
                   if (tb != null) {
                      TagInfo mMagicFace1 = tb.mMagicFace;
                      if (mMagicFace1 != null) {
                         tagInfo = mMagicFace1;
                      label_0198 :
                         if (tagInfo != null) {
                            if (!PatchProxy.isSupport(oy) || !PatchProxy.applyVoidThreeRefs(tagInfo, uoa, Integer.valueOf(p0), this, y.class, "15")) {
                               qa.s(c.class, LoadPolicy.DIALOG).R(new f(this, tagInfo, uoa, p0), k.b);
                            }
                         }else {
                            this.g(uoa, p0);
                         }
                      }
                   }
                   tagInfo = p1;
                   goto label_0198 ;
                }
             }
          }
          ta = this.h;
          tg = this.b;
          b$a uoa1 = (tg.mTagType != 3)? new b$a(this.a, p0).e0(tg.mTagName): new b$a(this.a, p0);
          if (!TextUtils.x(ta)) {
             uoa1.h0(ta);
          }
          uoa = uoa1;
          goto label_00b3 ;
       }
       return;
    }
    public void g(b$a p0,int p1){
       boolean b;
       t ot;
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oy, "2")) {
          return;
       }
       y ta = this.a;
       if (ta != null && !ta.isFinishing()) {
          if (this.j(p1)) {
             y tc = this.c;
             if (tc != null) {
                ShootParam mMusicStartT = tc.mMusicStartTime;
                if (!mMusicStartT || !mMusicStartT - (long)this.b.mMusic.mChorus) {
                   b = true;
                label_0041 :
                   if (PatchProxy.isSupport(oy)) {
                      ot = PatchProxy.applyOneRefs(Boolean.valueOf(b), this, oy, "6");
                      if (ot != PatchProxyResult.class) {
                      label_0061 :
                         z c = d.c;
                         ObservableBox$b uob = new ObservableBox$b(ta);
                         uob.a(true);
                         t ot1 = ObservableBox.b(ot.observeOn(c).flatMap(new y$a(this, p1, p0)).subscribeOn(c).observeOn(d.a), uob);
                         ot1.subscribe(new s(this), h.b);
                      }
                   }
                   ot = t.create(new z(this, b));
                   goto label_0061 ;
                }
             }
          }
          b = false;
          goto label_0041 ;
       }
       return;
    }
    public void h(int p0,boolean p1,String p2,String p3){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, p3, this, y.class, "8")) {
          return;
       }
       if (p1 && !s6.H()) {
          if (!PatchProxy.isSupport(oy) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p2, Integer.valueOf(0), p3, this, y.class, "10")) {
             if (this.d == null) {
                if (this.b.mInitiatorPhoto.getPhotoId() != null) {
                   a uoa = new a(this, 0, p0, p2, p3);
                   this.d = new f(this.a, this.b.mInitiatorPhoto.getPhotoId(), this.b.mInitiatorPhoto.getServerExpTag(), v10);
                }
             }
             this.d.c(0);
          }
          return;
       }else if(!o.a(this.b.mInitiatorPhoto, true)){
          i.a(R.style.arg_RES_7f11066a, 0x7f104333);
          return;
       }else {
          y6.s(c.class, LoadPolicy.DIALOG).R(new i(this, p2, p3), j.b);
          return;
       }
    }
    public void i(int p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy, "11")) {
          return;
       }
       y ta = this.a;
       if (ta != null && !ta.isFinishing()) {
          b$a uoa = new b$a(this.a, p0);
          uoa.e0(this.b.mTagName);
          if (!TextUtils.x(this.h)) {
             uoa.h0(this.h);
          }
          if (s6.D()) {
             if (!PatchProxy.applyVoidOneRefs(uoa, this, oy, "21")) {
                Object[] objArray = new Object[0];
                a.C().w("CameraButtonOperation", "startCameraActivityWithTopicReco, tagId:"+this.b.mTagId+" , topic:"+this.b.mTagName, objArray);
                if (TextUtils.x(this.b.mTagId)) {
                   Object[] objArray1 = new Object[0];
                   a.C().A("CameraButtonOperation", "startCameraActivityWithTopicReco, has no tag id", objArray1);
                }else {
                   y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).Q(new w(this, uoa));
                }
             }
          }else {
             this.l(uoa);
          }
       }
    label_00a2 :
       return;
    }
    public boolean j(int p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oy, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return o.l(this.b.mMusic, m.b(p0), this.e);
    }
    public final String k(){
       y obj = PatchProxy.apply(null, this, y.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       String str = "";
       if (obj == null) {
          return str;
       }
       if (obj.getIntent() == null) {
          return str;
       }
       Uri data = this.a.getIntent().getData();
       if (data == null) {
          return str;
       }
       return TextUtils.k(w0.a(data, "activity"));
    }
    public void l(b$a p0){
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "24")) {
          return;
       }
       boolean b = true;
       if (p0.x == null && (p0.y == null && p0.c2 == null)) {
          TagInfo mTagType = this.b.mTagType;
          if (mTagType == b || mTagType == 3) {
             b1 = true;
          label_0024 :
             p0.c0(b1);
             p0.l(8);
             p0.g0(this.b.mTagType);
             p0.h(this.k());
             p0.b0(b);
             y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).R(new v(this, p0), n.b);
             return;
          }
       }
       b1 = false;
       goto label_0024 ;
    }
    public final void m(GifshowActivity p0,SimpleMagicFace p1,Music p2,String p3,QPhoto p4){
       y oy = y.class;
       if (PatchProxy.isSupport(oy)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, oy, "20")) {
             return;
          }
       }
       g og = new g(this, p1, p3, p0, p2, p4);
       y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).Q(v8);
       return;
    }
}
