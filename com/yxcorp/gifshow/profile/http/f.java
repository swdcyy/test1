package com.yxcorp.gifshow.profile.http.f;
import qvb.n0;
import java.lang.String;
import xl8.b;
import java.lang.Object;
import com.yxcorp.gifshow.profile.model.response.ProfileMusicsResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.t;
import wkd.b;
import o3c.l;
import cjd.e;
import erd.o;
import o3c.g;
import erd.g;
import o3c.h;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Iterator;
import com.kuaishou.android.model.music.Music;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.VideoFeed;
import kp.w1;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;

public class f extends n0	// class@001352
{
    public String m;
    public b n;

    public void f(String p0,b p1){
       super();
       this.m = p0;
       this.n = p1;
    }
    public boolean B1(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): p0.hasMore();
       return b;
    }
    public t I1(){
       Object[] objArray = null;
       l obj = PatchProxy.apply(objArray, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x37313f08);
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj.G(objArray, 20, this.m).map(new e()).doOnNext(new g(this)).doOnError(new h(this));
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "3")) {
       }else if(this.K()){
          p1.clear();
       }
       if (!TextUtils.x(p0.mMusicianCenterUrl) && TextUtils.n(QCurrentUser.ME.getId(), this.m)) {
          this.n.d(p0.mMusicianCenterUrl);
       }
       p0 = p0.getItems();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Music music = iterator.next();
             music.mIsFakeQPhoto = true;
             music.mViewAdapterPosition = p0.indexOf(music);
             VideoFeed videoFeed = w1.k(music.mId, null);
             videoFeed.mPhotoMeta.mMusic = music;
             w1.d(videoFeed);
             p1.add(new QPhoto(videoFeed));
          }
       }
       return;
    }
}
