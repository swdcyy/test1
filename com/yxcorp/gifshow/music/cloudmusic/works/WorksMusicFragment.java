package com.yxcorp.gifshow.music.cloudmusic.works.WorksMusicFragment;
import com.yxcorp.gifshow.music.cloudmusic.common.TabMusicFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.cloudmusic.works.WorksMusicFragment$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import jqb.j;
import com.yxcorp.gifshow.fragment.f;
import java.lang.Boolean;
import wkd.b;
import dnc.r0;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.android.model.music.Music;
import qvb.i;
import java.lang.CharSequence;
import android.text.TextUtils;
import y8c.g;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2;
import com.yxcorp.gifshow.music.cloudmusic.works.WorksMusicFragment$a;
import s2b.a;
import s2b.d;
import java.util.ArrayList;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import lpb.b;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import qvb.n0;
import lpb.a;
import com.kwai.framework.model.user.QCurrentUser;

public class WorksMusicFragment extends TabMusicFragment	// class@002051
{

    public void WorksMusicFragment(){
       super();
    }
    public t Bh(){
       WorksMusicFragment$b obj = PatchProxy.apply(null, this, WorksMusicFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WorksMusicFragment$b(this, this);
       obj.u((float)j.g);
       return obj;
    }
    public void Ph(boolean p0){
       i oi;
       if (PatchProxy.isSupport(WorksMusicFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, WorksMusicFragment.class, "7")) {
          return;
       }
       List list = b.a(-1774673729).j();
       if (list != null) {
          Iterator iterator = list.iterator();
          oi = null;
          int i = 0;
          while (iterator.hasNext()) {
             Music music = iterator.next();
             Iterator iterator1 = this.q().getItems().iterator();
             int i1 = 0;
             while (iterator1.hasNext()) {
                Music music1 = iterator1.next();
                if (!TextUtils.equals(music1.mId, music.mId) || TextUtils.isEmpty(music.mId)) {
                   if (!TextUtils.isEmpty(music1.mFileId) && TextUtils.equals(music1.mFileId, music.mFileId)) {
                      music1.resetData(music);
                      oi = 1;
                   }
                }
                i1 = 1;
             }
             if (!i1) {
                int i2 = i + 1;
                this.q().add(i, music);
                oi = 1;
             }
          }
       }else {
          oi = null;
       }
       if (oi != null && p0) {
          this.g7().W0(this.q().getItems());
          this.g7().k0();
          this.h0().scrollToPosition(0);
       }
       return;
    }
    public void Qh(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WorksMusicFragment.class, "8")) {
          return;
       }
       int i = -1774673729;
       if (TextUtils.isEmpty(p0.mId)) {
          b.a(i).o(p0.mFileId);
       }else {
          b.a(i).i(p0.mId);
       }
       this.q().remove(p0);
       this.g7().T0(p0);
       if (this.g7().R0()) {
          this.sh().i();
       }
       this.g7().k0();
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WorksMusicFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(WorksMusicFragment.class, null);
       return objectsByTag;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WorksMusicFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.C.h(new WorksMusicFragment$a(this));
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(WorksMusicFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, WorksMusicFragment.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, WorksMusicFragment.class, "6")) {
          int i = -1774673729;
          List list = b.a(i).j();
          ArrayList uArrayList = new ArrayList();
          if (list != null) {
             Iterator iterator = this.q().getItems().iterator();
             while (iterator.hasNext()) {
                Music music = iterator.next();
                Iterator iterator1 = list.iterator();
                while (iterator1.hasNext()) {
                   Music music1 = iterator1.next();
                   if (TextUtils.equals(music1.mId, music.mId)) {
                      uArrayList.add(music1.mId);
                   }
                }
             }
          }
          Iterator iterator2 = uArrayList.iterator();
          while (iterator2.hasNext()) {
             b.a(i).i(iterator2.next());
          }
       }
       if (p0) {
          this.Ph(false);
       }
       super.v2(p0, p1);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, WorksMusicFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this.Hh());
    }
    public i yh(){
       a uoa = PatchProxy.apply(null, this, WorksMusicFragment.class, "4");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(QCurrentUser.ME.getId(), this.H, this.J);
       }
       return uoa;
    }
}
