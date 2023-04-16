package com.yxcorp.gifshow.music.util.d;
import dnc.r0;
import java.lang.Object;
import java.util.HashSet;
import wkd.b;
import com.yxcorp.gifshow.upload.d0;
import jqb.h;
import java.lang.Runnable;
import ekd.k1;
import dnc.r0$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.kwai.framework.cache.CacheManager;
import com.yxcorp.gifshow.music.util.LocalMusicUploadData;
import java.lang.System;
import java.lang.reflect.Type;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import com.yxcorp.gifshow.music.upload.UploadLocalMusicResult;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.MusicType;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Number;
import java.lang.StringBuilder;

public class d implements r0	// class@002087
{
    public LocalMusicUploadData a;
    public LocalMusicUploadInfo b;
    public d0 c;
    public final Set d;
    public boolean e;
    public String f;

    public void d(){
       super();
       this.d = new HashSet();
       this.c = b.a(-176317078);
       k1.o(new h(this));
    }
    public void a(r0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "20")) {
          return;
       }
       this.d.add(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       b.a(0x5f2ddeb4).c(this.r(), this.a, LocalMusicUploadData.class, (System.currentTimeMillis() + 0x5265c00));
       return;
    }
    public synchronized IUploadInfo$Status c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0) && this.a.getWorkMap().containsKey(p0)) {
          LocalMusicUploadInfo localMusicUp = this.a.getWorkMap().get(p0);
          if (localMusicUp != null) {
             return localMusicUp.mStatus;
          }
       }
       return IUploadInfo$Status.UPLOADING;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "19")) {
          return;
       }
       this.p();
       if (this.a.getWorkMap().containsKey(p0)) {
          LocalMusicUploadInfo localMusicUp = this.a.getWorkMap().get(p0);
          if (localMusicUp.getStatus() == IUploadInfo$Status.FAILED) {
             this.c.cancel(p0);
             this.c.d3(localMusicUp);
          }
       }
       return;
    }
    public void e(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "9")) {
          return;
       }
       this.p();
       d tb = this.b;
       if (tb != null) {
          _monitor_enter(this);
          if (PatchProxy.applyVoidOneRefs(tb, this, uod, "18")) {
             _monitor_exit(this);
          }else {
             this.p();
             String fileId = tb.getFileId();
             if (this.a.getWorkMap().containsKey(fileId)) {
                this.o(fileId);
             }
             this.a.getWorkIdList().add(0, fileId);
             this.a.putMapDataSafe(fileId, tb);
             this.c.d3(this.b);
             _monitor_exit(this);
          }
       }
       return;
    }
    public void f(LocalMusicUploadInfo p0){
       this.b = p0;
    }
    public void g(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "3")) {
          return;
       }
       LocalMusicUploadData localMusicUp = b.a(0x5f2ddeb4).g(this.r(), LocalMusicUploadData.class);
       this.a = localMusicUp;
       if (localMusicUp == null) {
          this.a = new LocalMusicUploadData();
       }
       _monitor_enter(this);
       if (PatchProxy.applyVoid(null, this, uod, "2")) {
          _monitor_exit(this);
       }else {
          uod = this.a;
          if (uod != null) {
             Iterator iterator = uod.getWorkIdList().iterator();
             ArrayList uArrayList = new ArrayList();
             while (iterator.hasNext()) {
                String str = iterator.next();
                if (this.a.getWorkMap().get(str) != null && (this.a.getWorkMap().get(str).getUploadResult() == null || this.a.getWorkMap().get(str).getUploadResult().getUploadedMusic() == null)) {
                   this.a.putMapDataSafe(str, null);
                   uArrayList.add(str);
                }
             }
             if (uArrayList.size() > 0) {
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   this.q(iterator.next());
                }
             }
          }
          _monitor_exit(this);
       }
       this.e = true;
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       d ta = this.a;
       if (ta == null) {
          return;
       }
       Iterator iterator = ta.getWorkIdList().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (this.a.getWorkMap().get(str) != null) {
             this.c.cancel(str);
          }
       }
       this.b();
       return;
    }
    public synchronized void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "16")) {
          return;
       }
       this.p();
       String str = "";
       Iterator iterator = this.a.getWorkMap().keySet().iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          LocalMusicUploadInfo localMusicUp = this.a.getWorkMap().get(str1);
          if (localMusicUp != null && localMusicUp.getUploadResult() != null) {
             Music uploadedMusi = localMusicUp.getUploadResult().getUploadedMusic();
             if (uploadedMusi != null && (!TextUtils.isEmpty(uploadedMusi.mId) && (uploadedMusi.mId).equals(p0))) {
                str = uploadedMusi.mFileId;
                this.a.putMapDataSafe(str1, null);
             }
          }
       }
       if (!TextUtils.isEmpty(str)) {
          this.q(str);
          this.c.cancel(str);
       }
       return;
    }
    public synchronized List j(){
       ArrayList obj = PatchProxy.apply(null, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.p();
       obj = new ArrayList();
       Iterator iterator = this.a.getWorkIdList().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (this.a.getWorkMap().get(str) != null) {
             if (this.a.getWorkMap().get(str).getUploadResult() != null && this.a.getWorkMap().get(str).getUploadResult().getUploadedMusic() != null) {
                obj.add(this.a.getWorkMap().get(str).getUploadResult().getUploadedMusic());
             }else {
                Music music = new Music();
                music.mId = "";
                music.mName = this.a.getWorkMap().get(str).getMusicName();
                music.mPath = this.a.getWorkMap().get(str).getFilePath();
                music.mArtistName = this.a.getWorkMap().get(str).getArtistName();
                music.mType = this.a.getWorkMap().get(str).getMusicType();
                music.mFileId = str;
                music.mCoverPath = this.a.getWorkMap().get(str).getCoverPath();
                UserInfo userInfo = new UserInfo();
                userInfo.mHeadUrl = QCurrentUser.ME.getAvatar();
                userInfo.mName = QCurrentUser.ME.getName();
                userInfo.mId = QCurrentUser.ME.getId();
                music.mUserProfile = userInfo;
                obj.add(music);
             }
          }
       }
       return obj;
    }
    public synchronized void k(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       this.p();
       Iterator iterator = this.a.getWorkMap().keySet().iterator();
       while (iterator.hasNext()) {
          LocalMusicUploadInfo localMusicUp = this.a.getWorkMap().get(iterator.next());
          if (localMusicUp != null && localMusicUp.getUploadResult() != null) {
             Music uploadedMusi = localMusicUp.getUploadResult().getUploadedMusic();
             if (uploadedMusi != null && (uploadedMusi.mId).equals(p0.mId)) {
                localMusicUp.getUploadResult().setUploadedMusic(p0);
             }
          }
       }
       return;
    }
    public void l(r0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "21")) {
          return;
       }
       this.d.remove(p0);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.g();
       this.f = QCurrentUser.ME.getId();
       return;
    }
    public synchronized float n(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.a.getWorkMap().containsKey(p0)) {
          LocalMusicUploadInfo localMusicUp = this.a.getWorkMap().get(p0);
          if (localMusicUp != null) {
             return localMusicUp.mProgress;
          }
       }
       return 0;
    }
    public synchronized void o(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "15")) {
          return;
       }
       this.p();
       if (this.a.getWorkMap().containsKey(p0)) {
          this.a.putMapDataSafe(p0, null);
       }
       this.q(p0);
       this.c.cancel(p0);
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       if (this.e == null) {
          this.g();
       }
       return;
    }
    public final void q(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "14")) {
          return;
       }
       Iterator iterator = this.a.getWorkIdList().iterator();
       int i = 0;
       while (true) {
          if (iterator.hasNext()) {
             if (TextUtils.equals(p0, iterator.next())) {
                i = 1;
             }
          }
          if (i) {
             this.a.getWorkIdList().remove(p0);
             break ;
          }
          break ;
       }
       return;
    }
    public String r(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "local_music_upload_controller_";
       if (TextUtils.isEmpty(QCurrentUser.ME.getId()) || QCurrentUser.ME.getId() == "0") {
          return str+this.f;
       }
       return str+QCurrentUser.ME.getId();
    }
}
