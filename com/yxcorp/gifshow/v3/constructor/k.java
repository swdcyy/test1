package com.yxcorp.gifshow.v3.constructor.k;
import im8.g;
import qoc.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.content.Intent;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.kuaishou.android.model.music.Music;
import um6.e;
import mwc.p;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Karaoke$b;
import com.kuaishou.edit.draft.Song$b;
import com.kuaishou.edit.draft.Song;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.edit.draft.OnlineMusicParam$b;
import com.kuaishou.edit.draft.OnlineMusicParam;
import com.yxcorp.gifshow.model.KtvSelectionInfo;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.KaraokeAsset$b;
import com.kuaishou.edit.draft.KaraokeAsset;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.KaraokeVoiceAsset$b;
import com.kuaishou.edit.draft.KaraokeVoiceAsset;
import com.kuaishou.edit.draft.Karaoke;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.Lyrics;
import java.util.Collection;
import ekd.q;
import ekd.j0;
import android.util.Pair;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.constructor.j;
import com.yxcorp.gifshow.v3.constructor.j$a;
import qba.d;
import android.text.TextPaint;
import com.yxcorp.gifshow.v3.f;
import java.util.List;
import brd.a0;
import t45.d;
import brd.z;
import qoc.o;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import crd.a;
import com.kuaishou.edit.draft.KaraokeGeneral$b;
import com.kuaishou.edit.draft.KaraokeGeneral;
import com.kuaishou.edit.draft.KaraokeMixing$b;
import com.kuaishou.edit.draft.KaraokeMixing;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import ppb.a;
import com.kuaishou.edit.draft.InternalFeatureId;
import com.kuaishou.edit.draft.VoiceChange$b;
import com.kuaishou.edit.draft.VoiceChange;
import com.kuaishou.edit.draft.KaraokeClip$b;
import com.kuaishou.edit.draft.KaraokeClip;
import qoc.p;
import java.util.Map;
import java.util.HashMap;

public class k extends g implements g	// class@000d4a
{
    public c d;
    public a e;
    public Pair f;
    public Intent g;
    public d h;
    public PublishSubject i;

    public void k(){
       super();
    }
    public void N(){
       boolean b1;
       double d;
       double d1;
       Object obj = this;
       k ok = k.class;
       if (PatchProxy.applyVoid(null, obj, ok, "1")) {
          return;
       }
       Workspace$Type type = obj.d.a1();
       if (type != Workspace$Type.KTV_SONG && type != Workspace$Type.KTV_MV) {
          return;
       }
       KtvInfo ktvInfo = KtvInfo.fromIntent(obj.g);
       if (ktvInfo == null) {
          return;
       }
       ktvInfo.mMusic = e.c(obj.g);
       p.a().h(ktvInfo);
       obj.e.c0();
       Karaoke$b uob = obj.e.k();
       Song$b uob1 = Song.newBuilder();
       uob1.d(obj.e.Q(ktvInfo.mAccompanyPath));
       KtvInfo mMusic = ktvInfo.mMusic;
       if (mMusic != null) {
          if (!TextUtils.x(mMusic.mArtist)) {
             uob1.a(ktvInfo.mMusic.mArtist);
          }
          if (!TextUtils.x(ktvInfo.mMusic.mArtistId)) {
             uob1.b(ktvInfo.mMusic.mArtistId);
          }
          if (!TextUtils.x(ktvInfo.mMusic.mName)) {
             uob1.g(ktvInfo.mMusic.mName);
          }
          if (!TextUtils.x(ktvInfo.mMusic.mLyrics)) {
             uob1.e(obj.e.U(ktvInfo.mMusic.mLyrics, "lrc"));
          }
       }
       OnlineMusicParam$b uob2 = OnlineMusicParam.newBuilder();
       KtvInfo mRangeMode = ktvInfo.mRangeMode;
       float f = 1000.00f;
       if (mRangeMode == KtvSelectionInfo.FREE || mRangeMode == KtvSelectionInfo.HOT) {
          uob2.b(DraftUtils.k((double)((float)ktvInfo.mSingStart / f), (double)((float)ktvInfo.mSingEnd / f)));
       }
       Workspace$Type kTV_MV = Workspace$Type.KTV_MV;
       boolean b = true;
       if (type == kTV_MV && ktvInfo.hasRecordPath()) {
          Workspace$b uob3 = obj.d.k();
          uob3.copyOnWrite();
          uob3.instance.setMuteTrackAssets(b);
       }
       KaraokeAsset$b uob4 = KaraokeAsset.newBuilder();
       uob4.b(DraftUtils.i());
       uob2.c(uob1);
       uob4.copyOnWrite();
       uob4.instance.setAccompany(uob2);
       uob4.copyOnWrite();
       uob4.instance.setRecordDuration((double)((float)ktvInfo.mSingDuration / f));
       if (ktvInfo.hasRecordPath()) {
          KaraokeVoiceAsset$b uob5 = KaraokeVoiceAsset.newBuilder();
          uob5.copyOnWrite();
          uob5.instance.setFile(obj.e.Q(ktvInfo.mRecordPath));
          uob4.copyOnWrite();
          uob4.instance.addVoiceAssets(uob5);
       }else {
          uob.copyOnWrite();
          uob.instance.setNewVideoRecord(b);
       }
       a0 obj1 = PatchProxy.applyOneRefs(ktvInfo, obj, ok, "2");
       if (obj1 != PatchProxyResult.class) {
          b1 = obj1.booleanValue();
       }else {
          KtvInfo mClipLyric = ktvInfo.mClipLyric;
          if (mClipLyric == null || q.f(mClipLyric.mLines)) {
             b1 = false;
          }else if(ktvInfo.isSongMode() || ktvInfo.mChorusMode != 2){
             b1 = true;
          }else {
             b1 = j0.a(obj.g, "same_frame_layout_in_mode", false);
          }
       }
       if (b1) {
          int i = (type == kTV_MV)? obj.f.first.intValue(): 720;
          j$a uoa = new j$a(0x3fe99999a0000000, 0x3fe99999a0000000, i, obj.h.a, f.K(), ktvInfo.mClipLyric.mLines, (double)((float)ktvInfo.mSingStart / f));
          obj1 = new j().O(type, obj.d);
          obj.c.c(obj1.G(d.a).R(new o(obj), h.b));
       }
       uob.a(uob4);
       KaraokeGeneral$b uob6 = KaraokeGeneral.newBuilder();
       uob6.b(DraftUtils.i());
       uob6.c(ktvInfo.mDenoise);
       d = 0x408f400000000000;
       uob6.d(((double)ktvInfo.mRealOffset / d));
       uob6.copyOnWrite();
       uob6.instance.setRecordDelay(((double)ktvInfo.mRecordDelay / d));
       float f1 = 100.00f;
       uob6.f(((float)ktvInfo.mRecordVolume / f1));
       uob6.a(((float)ktvInfo.mAccompanyVolume / f1));
       uob6.e(ktvInfo.mTimbreOffset);
       if (ktvInfo.mMaxVolume > null) {
          uob6.copyOnWrite();
          uob6.instance.setEnableAgc(true);
          uob6.copyOnWrite();
          uob6.instance.setAgcTargetEnergy(100);
          uob6.copyOnWrite();
          uob6.instance.setOriginAudioMaxValue(ktvInfo.mMaxVolume);
       }
       uob.c(uob6);
       KaraokeMixing$b uob7 = KaraokeMixing.newBuilder();
       uob7.a(DraftUtils.i());
       uob7.c(ktvInfo.mEffectId);
       FeatureId$b uob8 = FeatureId.newBuilder();
       uob8.b(a.b(ktvInfo.mEffectId).f);
       uob7.b(uob8);
       uob.e(uob7);
       VoiceChange$b uob9 = VoiceChange.newBuilder();
       uob9.a(DraftUtils.i());
       uob9.c(ktvInfo.mChangeId);
       uob8 = FeatureId.newBuilder();
       uob8.b(a.b(ktvInfo.mChangeId).f);
       uob9.b(uob8);
       uob.f(uob9);
       KaraokeClip$b uob10 = KaraokeClip.newBuilder();
       uob10.a(DraftUtils.i());
       mRangeMode = ktvInfo.mMinEditCropDuration;
       if (mRangeMode > 0) {
          d1 = (double)((float)mRangeMode / 1000.00f);
       }else {
          f1 = 1000.00f;
          d1 = 3.00f;
       }
       uob10.b(d1);
       uob10.c(DraftUtils.k((double)((float)ktvInfo.mCropBegin / 1000.00f), (double)((float)ktvInfo.mCropEnd / 1000.00f)));
       uob.b(uob10);
       uob.copyOnWrite();
       uob.instance.setPitch(ktvInfo.mTone);
       uob.d(obj.e.U(ktvInfo.toSimpleJson(), "json"));
       obj.e.g(false);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(k.class, new p());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
}
