package com.yxcorp.gifshow.music.network.model.response.MusicItemWrapperResponse;
import com.kwai.framework.model.response.CursorResponse;
import com.yxcorp.gifshow.music.network.model.response.MusicsResponse;
import java.lang.String;
import java.lang.Object;
import vpb.b;
import java.util.Collection;
import ekd.q$a;
import java.util.List;
import ekd.q;
import com.kwai.sdk.switchconfig.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import vpb.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class MusicItemWrapperResponse implements CursorResponse	// class@002062
{
    public List mItems;
    public final MusicsResponse mMusicsResponse;

    public void MusicItemWrapperResponse(MusicsResponse p0,String p1){
       super();
       this.mMusicsResponse = p0;
       MusicsResponse mMusics = p0.mMusics;
       if (mMusics != null) {
          this.mItems = q.g(mMusics, new b(p1));
       }
       if (this.mItems == null) {
          return;
       }else {
          int i = a.t().a("photos_count_min_limit", 5);
          if (!q.f(p0.mPhotos) && p0.mPhotos.size() >= i) {
             MusicsResponse mPhotosLocat = p0.mPhotosLocation;
             if (mPhotosLocat >= null && mPhotosLocat < this.mItems.size()) {
                ArrayList uArrayList = new ArrayList();
                int i1 = 0;
                while (i1 < p0.mPhotos.size()) {
                   QPhoto qPhoto = p0.mPhotos.get(i1);
                   Music musicFromPho = this.getMusicFromPhoto(qPhoto);
                   if (musicFromPho != null) {
                      musicFromPho.mDisplayPhotoCount = p0.mDisplayPhotoCount;
                      uArrayList.add(qPhoto);
                   }
                   i1 = i1 + 1;
                }
                if (uArrayList.size() < i) {
                   return;
                }else {
                   a uoa = new a(null, uArrayList, 1);
                   uoa.e(p1);
                   uoa.g = p0.mPhotoCardsData;
                   this.mItems.add(p0.mPhotosLocation, uoa);
                }
             }
          }
          return;
       }
    }
    public static a lambda$new$0(String p0,Music p1){
       a uoa = new a(p1, null, 0);
       uoa.e(p0);
       return uoa;
    }
    public String getCursor(){
       return this.mMusicsResponse.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public Music getMusicFromPhoto(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicItemWrapperResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getMusic() != null && !p0.getMusic().isOffline()) {
          return p0.getMusic();
       }
       if (p0.getSoundTrack() != null && !p0.getSoundTrack().isOffline()) {
          return p0.getSoundTrack();
       }
       return null;
    }
    public List getPhotos(){
       return this.mMusicsResponse.mPhotos;
    }
    public int getPhotosLocation(){
       return this.mMusicsResponse.mPhotosLocation;
    }
    public String getUssid(){
       return this.mMusicsResponse.mUssid;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, MusicItemWrapperResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mMusicsResponse.hasMore();
    }
    public boolean isDisplayPhotoCount(){
       return this.mMusicsResponse.mDisplayPhotoCount;
    }
}
