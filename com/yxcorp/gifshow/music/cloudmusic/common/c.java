package com.yxcorp.gifshow.music.cloudmusic.common.c;
import qvb.n0;
import java.lang.String;
import com.kwai.gifshow.post.api.feature.music.model.MusicRecommendParams;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import com.yxcorp.gifshow.music.network.model.response.MusicsResponseV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.music.network.model.response.MusicsResponse;
import brd.t;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.android.model.music.MusicType;
import kob.k;
import q87.c;
import upb.a;
import upb.f;
import com.kwai.feature.post.api.feature.recommend.PostRecommendDataManager;
import cjd.e;
import erd.o;
import java.util.List;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.music.utils.o;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.music.cloudmusic.common.c$c;
import java.util.ArrayList;
import com.yxcorp.gifshow.music.cloudmusic.common.c$b;
import lnc.a1;

public class c extends n0	// class@002005
{
    public final int m;
    public final long n;
    public final String o;
    public String p;
    public final MusicRecommendParams q;
    public List r;
    public boolean s;
    public String t;
    public final Music u;
    public MusicBanner v;

    public void c(int p0,long p1,String p2,MusicRecommendParams p3,Music p4){
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.q = (p3 == null)? new MusicRecommendParams(): p3;
       this.u = p4;
       return;
    }
    public boolean B1(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): p0.hasMore();
       return b;
    }
    public t I1(){
       String str1;
       MusicType musicType;
       Object obj = this;
       Object[] objArray = null;
       String obj1 = PatchProxy.apply(objArray, obj, c.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       Object[] objArray1 = objArray;
       String str = TextUtils.k(obj.p);
       obj1 = "";
       int i = 0;
       if (obj.u != null) {
          obj1 = obj1+obj.u.mId;
          MusicType mValue = obj.u.mType.mValue;
          Object[] objArray2 = new Object[i];
          k.D().w("CategoryMusicPageListV2", "music id:"+obj1+"   music type:"+mValue, objArray2);
          str1 = obj1;
          musicType = mValue;
       }else {
          str1 = obj1;
          musicType = 0;
       }
       c q = obj.q;
       return f.a().h(obj.m, obj.n, str, objArray1, q.mEditSessionId, q.mMagicFaceId, q.mPhotoDuration, PostRecommendDataManager.b().c(), obj.q.mExtraInfo, 20, str1, musicType, 1, 1).map(new e());
    }
    public void M1(Object p0,List p1){
       Iterator iterator;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
       }else {
          this.p = p0.mLlsid;
          if (this.K()) {
             p1.clear();
             this.s = false;
             if (PostExperimentUtils.P()) {
                o.m(p0);
             }
             this.v = p0.mMusicBanner;
             if (!q.f(p0.mSpecialRecommendMusic) && !q.f(p0.mMusics)) {
                iterator = p0.mSpecialRecommendMusic.iterator();
                while (iterator.hasNext()) {
                   Music music = iterator.next();
                   music.mIsMagicRecommend = true;
                   music.mCategoryId = this.n;
                   music.mLlsid = p0.mLlsid;
                   music.mCategoryName = this.o;
                }
                c$c uoc = new c$c();
                ArrayList uArrayList = new ArrayList(p0.mSpecialRecommendMusic);
                uoc.f = uArrayList;
                MusicsResponse mRecommendTi = p0.mRecommendTitle;
                this.t = mRecommendTi;
                uoc.a = mRecommendTi;
                uoc.e = uArrayList.size();
                p1.add(uoc);
                this.r = p0.mSpecialRecommendMusic;
             }
             if (!q.f(p0.mMusics) && !q.f(p0.mChannels)) {
                c$b uob = new c$b();
                uob.b = new ArrayList(p0.mChannels);
                p1.add(uob);
             }
             if (!q.f(p0.mMusics) && p0.mMusics.size() > 0) {
                this.V1(p1);
                this.s = true;
             }
          }
       label_00b4 :
          if (!q.f(p0.mMusics) && p0.mMusics.size() > 0) {
             if (this.s == null) {
                this.V1(p1);
                this.s = true;
             }
             p0 = p0.mMusics;
             p1.addAll(new ArrayList(p0.subList(false, p0.size())));
          }
          if (!q.f(p1)) {
             p0 = new int[true];
             p0[0] = false;
             Iterator iterator1 = p1.iterator();
             while (iterator1.hasNext()) {
                Object obj = iterator1.next();
                if (obj instanceof Music) {
                   this.X1(obj, p0);
                }else if(obj instanceof c$c){
                   int[] ointArray = new int[true];
                   ointArray[0] = false;
                   iterator = obj.f.iterator();
                   while (iterator.hasNext()) {
                      this.X1(iterator.next(), ointArray);
                   }
                }
             }
          }
       }
       return;
    }
    public final void V1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       Music music = new Music();
       music.mTitle = a1.p(0x7f1037cd);
       music.mIsMockForGroupTitle = true;
       music.mType = MusicType.UNKNOWN;
       p0.add(music);
       return;
    }
    public List W1(){
       return this.r;
    }
    public final void X1(Music p0,int[] p1){
       p0.mCategoryId = this.n;
       p0.mLlsid = this.p;
       p0.mCategoryName = this.o;
       if (p0.mIsMockForGroupTitle == null && p0.mIsMagicRecommend == null) {
          int i = p1[0];
          p1[0] = i + 1;
          p0.mDataListIndex = i;
       }
       return;
    }
}
