package com.yxcorp.gifshow.photoad.t;
import mxb.j;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo;
import com.yxcorp.gifshow.commercial.adsdk.model.AdTrackInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$Track;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track;
import yx.j0;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import brd.a0;
import java.lang.Integer;
import mxb.x0;
import erd.o;
import com.yxcorp.gifshow.entity.QPhoto;

public class t extends j	// class@000fa9
{
    public List l;
    public List m;
    public PlcEntryStyleInfo n;
    public int o;
    public static final int p;

    public void t(BaseFeed p0,PlcEntryStyleInfo p1){
       super();
       this.o = 0;
       this.a = p0;
       this.n = p1;
    }
    public void t(BaseFeed p0,PlcEntryStyleInfo p1,int p2){
       super();
       this.o = 0;
       this.a = p0;
       this.n = p1;
       this.o = p2;
    }
    public long c(){
       return 0;
    }
    public int e(){
       PlcEntryStyleInfo obj = PatchProxy.apply(null, this, t.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.p();
       if (obj == null) {
          return 0;
       }
       return obj.mEventTrackData.mAdEventTrackData.mSourceType;
    }
    public List f(){
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, t.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj != null) {
          return obj;
       }
       PlcEntryStyleInfo plcEntryStyl = this.p();
       if (plcEntryStyl == null) {
          return objArray;
       }
       PlcEntryStyleInfo$AdEventTrackData mAdTrackInfo = plcEntryStyl.mEventTrackData.mAdEventTrackData.mAdTrackInfos;
       if (q.f(mAdTrackInfo)) {
          return objArray;
       }
       this.m = new ArrayList();
       Iterator iterator = mAdTrackInfo.iterator();
       while (iterator.hasNext()) {
          PlcEntryStyleInfo$TrackInfo trackInfo = iterator.next();
          AdTrackInfo uAdTrackInfo = new AdTrackInfo();
          uAdTrackInfo.type = trackInfo.mType;
          uAdTrackInfo.urls = trackInfo.mUrls;
          this.m.add(uAdTrackInfo);
       }
       return this.m;
    }
    public List g(){
       Object[] objArray1;
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, t.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj != null) {
          return obj;
       }
       PlcEntryStyleInfo plcEntryStyl = this.p();
       int i = 0;
       String str = "AdLogWrapper";
       if (plcEntryStyl != null) {
          plcEntryStyl = plcEntryStyl.mEventTrackData;
          if (plcEntryStyl != null) {
             PlcEntryStyleInfo$EventTrackData mAdEventTrac = plcEntryStyl.mAdEventTrackData;
             if (mAdEventTrac != null) {
                PlcEntryStyleInfo$AdEventTrackData mAdTracks = mAdEventTrac.mAdTracks;
                if (mAdTracks == null || mAdTracks.isEmpty()) {
                   objArray1 = new Object[i];
                   j0.f(str, "listTrackNew is empty", objArray1);
                   return objArray;
                }else {
                   this.l = new ArrayList();
                   Iterator iterator = mAdTracks.iterator();
                   while (iterator.hasNext()) {
                      PlcEntryStyleInfo$Track track = iterator.next();
                      PhotoAdvertisement$Track track1 = new PhotoAdvertisement$Track();
                      track1.mType = track.mType;
                      track1.mUrl = track.mUrl;
                      track1.mUrlOperationType = track.mUrlOperationType;
                      track1.mEnableDefaultMacro = track.mEnableDefaultMacro;
                      this.l.add(track1);
                   }
                   return this.l;
                }
             }
          }
       }
       objArray1 = new Object[i];
       j0.c(str, "mEventTrackData or mAdEventTrackData is null", objArray1);
       return objArray;
    }
    public boolean h(){
       return this.a instanceof LiveStreamFeed;
    }
    public a0 j(int p0){
       PlcEntryStyleInfo obj;
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ot, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.p();
       if (obj == null) {
          return null;
       }else {
          this.k();
          return a0.B(this.a).C(new x0(this, p0, obj));
       }
    }
    public final PlcEntryStyleInfo p(){
       t obj = PatchProxy.apply(null, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n;
       if (obj != null) {
          return obj;
       }
       return new QPhoto(this.a).getPlcEntryStyleInfo();
    }
}
