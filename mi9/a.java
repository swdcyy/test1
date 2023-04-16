package mi9.a;
import um6.i;
import java.lang.Object;
import android.app.Activity;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.rn.ktv.tune.list.chorus.ChorusRecommendActivity;
import android.content.Context;
import com.kuaishou.android.model.music.MusicType;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.yxcorp.gifshow.camera.rn.ktv.tune.ranklistv2.MelodyRankListV2Activity;
import java.util.Objects;
import com.yxcorp.gifshow.camera.rn.ktv.tune.ranklistv2.MelodyRankListV2Activity$a;
import kotlin.jvm.internal.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import um6.a;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import qr4.i;
import qr4.m$k0;
import qr4.m$o;
import qr4.m$o$a;
import java.util.ArrayList;
import android.util.Pair;
import java.lang.Float;
import java.util.Collection;
import ekd.q;
import qr4.e$q;
import qr4.e$h;
import com.kuaishou.android.model.music.Music;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.os.Bundle;
import com.kwai.library.widget.viewpager.tabstrip.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment;
import com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment$a;
import com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneActivity;
import androidx.fragment.app.Fragment;
import mm6.c;
import com.yxcorp.gifshow.camera.rn.ktv.tune.CameraKtvTuneFragment;
import okhttp3.MultipartBody$Part;
import brd.t;
import ni9.a;
import ni9.b;

public class a implements i	// class@00303a
{

    public void a(){
       super();
    }
    public Intent FJ(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Intent(p0, ChorusRecommendActivity.class);
    }
    public void ND(Activity p0,String p1,MusicType p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "2")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          b uob = d.a(-1712118428);
          p1 = (p0 instanceof GifshowActivity)? p0.getUrl(): "";
          uob.ne(p0, p1, "", 68, "", null, null, null, null).h();
          return;
       }else if(PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, MelodyRankListV2Activity.class, "6")){
          MelodyRankListV2Activity$a r = MelodyRankListV2Activity.R;
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, r, MelodyRankListV2Activity$a.class, "2")) {
             a.p(p0, "context");
             a.p(p1, "musicId");
             a.p(p2, "musicType");
             a.p(p3, "photoId");
             Intent intent = new Intent(p0, MelodyRankListV2Activity.class);
             intent.putExtra("ktv_music_id", p1);
             SerializableHook.putExtra(intent, "ktv_music_type", p2);
             intent.putExtra("ktv_music_source_photo", p3);
             p0.startActivityForResult(intent, 304);
          }
       }
       return;
    }
    public void Oh(Activity p0,String p1,MusicType p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          b uob = d.a(-1712118428);
          p1 = (p0 instanceof GifshowActivity)? p0.getUrl(): "";
          uob.ne(p0, p1, "", 68, "", null, null, null, null).h();
          return;
       }else if(PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, MelodyRankListV2Activity.class, "5")){
          MelodyRankListV2Activity$a r = MelodyRankListV2Activity.R;
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, r, MelodyRankListV2Activity$a.class, "1")) {
             a.p(p0, "context");
             a.p(p1, "musicId");
             a.p(p2, "musicType");
             Intent intent = new Intent(p0, MelodyRankListV2Activity.class);
             intent.putExtra("ktv_music_id", p1);
             SerializableHook.putExtra(intent, "ktv_music_type", p2);
             p0.startActivityForResult(intent, 304);
          }
       }
       return;
    }
    public void Ps(VideoContext p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       try{
          p0.F().b.z.f = p1.mDenoise;
          p0.F().b.z.g = new m$o$a();
          p0.F().b.z.g.a = p1.mDefaultOffset;
          p0.F().b.z.g.b = p1.mAdjustOffset;
          ArrayList uArrayList = new ArrayList();
          float f = 1000.00f;
          if (p1.mCropBegin > null) {
             uArrayList.add(new Pair(Float.valueOf(0), Float.valueOf(((float)p1.mCropBegin / f))));
          }
          if (p1.mCropEnd < p1.mSingDuration) {
             uArrayList.add(new Pair(Float.valueOf(((float)p1.mCropEnd / f)), Float.valueOf(((float)(p1.mSingDuration - p1.mCropEnd) / f))));
          }
          if (uArrayList.size() > 0) {
             int i = 0;
             if (q.f(uArrayList)) {
                e$q[] oqArray = new e$q[i];
                p0.o = oqArray;
             }else {
                e$q[] oqArray1 = new e$q[uArrayList.size()];
                p1.o = oqArray1;
                for (; i < uArrayList.size(); i = i + 1) {
                   e$q oq = new e$q();
                   p0.F().d.o[i] = oq;
                   oq.a = (double)uArrayList.get(i).first.floatValue();
                   oq.b = (double)uArrayList.get(i).second.floatValue();
                }
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void QZ(Activity p0,Music p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "11")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (p3 != null && p3.equals(p1.mId)) {
          p0.finish();
          return;
       }else {
          this.ND(p0, p1.mId, p1.mType, p2);
          return;
       }
    }
    public b Tu(PagerSlidingTabStrip$d p0,Bundle p1,boolean p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new b(p0, KtvTuneKrnFragment.class, KtvTuneKrnFragment.E.a(p1, "recommend", false, "", p2));
    }
    public void Xm(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       Intent intent = new Intent(p0, KtvTuneActivity.class);
       intent.putExtras(p1);
       p0.startActivity(intent);
       return;
    }
    public void ec(Fragment p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "8")) {
          return;
       }
       if (p0 instanceof KtvTuneKrnFragment) {
          Objects.requireNonNull(p0);
          if (!PatchProxy.isSupport(KtvTuneKrnFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), p0, KtvTuneKrnFragment.class, "8")) {
             p0.ch((p1 ^ 0x01));
          }
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public c j20(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new CameraKtvTuneFragment();
    }
    public t o2(MultipartBody$Part p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a().o2(p0, p1);
    }
    public boolean p8(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof KtvTuneKrnFragment) {
          Objects.requireNonNull(p0);
       }
       return false;
    }
    public Intent tw(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Intent(p0, KtvTuneActivity.class);
    }
}
