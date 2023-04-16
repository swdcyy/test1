package i4a.e;
import j4a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.j0;
import mxb.i0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import com.yxcorp.gifshow.commercial.adsdk.model.AdLogAltData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$Track;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.k;
import i4a.d;
import erd.g;
import i4a.c;
import mxb.j;
import i4a.a;
import i4a.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import androidx.collection.ArrayMap;
import java.util.Map;

public abstract class e extends a	// class@002779
{
    public boolean d;
    public int e;
    public final j0 f;

    public void e(QPhoto p0){
       super(p0);
       this.f = i0.a();
       if (PatchProxy.applyVoid(null, this, e.class, "16")) {
       }else {
          PlcEntryStyleInfo plcEntryStyl = this.a.getPlcEntryStyleInfo();
          if (plcEntryStyl != null) {
             PlcEntryStyleInfo mEventTrackD = plcEntryStyl.mEventTrackData;
             if (mEventTrackD != null) {
                PlcEntryStyleInfo$EventTrackData mAdEventTrac = mEventTrackD.mAdEventTrackData;
                if (mAdEventTrac != null && (plcEntryStyl.mBizType == 29 && mAdEventTrac.mSourceType != null)) {
                   AdLogAltData uAdLogAltDat = new AdLogAltData();
                   PlcEntryStyleInfo$EventTrackData mAdEventTrac1 = plcEntryStyl.mEventTrackData.mAdEventTrackData;
                   uAdLogAltDat.logExtData = mAdEventTrac1.mPlcExtData;
                   uAdLogAltDat.mSourceType = mAdEventTrac1.mSourceType;
                   if (mAdEventTrac1.mAdTracks != null) {
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator = plcEntryStyl.mEventTrackData.mAdEventTrackData.mAdTracks.iterator();
                      while (iterator.hasNext()) {
                         PlcEntryStyleInfo$Track track = iterator.next();
                         PhotoAdvertisement$Track track1 = new PhotoAdvertisement$Track();
                         track1.mType = track.mType;
                         track1.mUrl = track.mUrl;
                         uArrayList.add(track1);
                      }
                      uAdLogAltDat.mTrackInfos = uArrayList;
                   }
                   k.M(this.a.mEntity, "adAltData", uAdLogAltDat);
                }
             }
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       if (this.p()) {
          this.f.e(2, this.a.mEntity).d(d.b).a();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "10")) {
          return;
       }
       if (this.p()) {
          this.f.e(140, this.a.mEntity).d(c.b).a();
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.j();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, e.class, "12")) {
          return;
       }
       if (this.p()) {
          this.f.b(this.n(), 1);
          this.f.b(this.n(), 920);
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       if (this.p()) {
          this.f.j(397, this.a.mEntity, this.b).d(a.b).a();
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       if (this.p()) {
          this.f.b(this.n(), 241);
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       if (this.p()) {
          this.f.j(397, this.a.mEntity, this.b).d(b.b).a();
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       if (this.p()) {
          this.f.b(this.n(), 729);
       }
       return;
    }
    public j n(){
       Object obj = PatchProxy.apply(null, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.x(this.a.mEntity, this.b);
    }
    public void o(){
       this.e = this.e + 1;
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (k.x(this.a.mEntity) != null || this.a.isAd())? true: false;
       return b;
    }
    public void q(int p0,int p1){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, e.class, "6")) {
          return;
       }
       this.s(false, p1);
       return;
    }
    public void r(int p0,int p1){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, e.class, "7")) {
          return;
       }
       this.s(true, p1);
       return;
    }
    public void s(boolean p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoe, "8")) {
          return;
       }
       this.t(p0, p1, null);
       return;
    }
    public void t(boolean p0,int p1,g p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, e.class, "9")) {
          return;
       }
       if (this.p()) {
          ArrayMap uArrayMap = new ArrayMap();
          int i = 1;
          uArrayMap.put("photoPlayCount", Integer.valueOf((this.e + i)));
          j oj = this.n();
          oj.o(uArrayMap);
          if (p2 != null) {
             oj.a(p2);
          }
          if (!p0) {
             i = 89;
          }
          this.f.y(oj, i, p1);
       }
       return;
    }
}
