package com.yxcorp.gifshow.map.search.SearchFragment$d;
import a6b.a;
import com.yxcorp.gifshow.map.search.SearchFragment;
import java.lang.Object;
import com.yxcorp.gifshow.model.Place;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import java.lang.Double;
import com.yxcorp.gifshow.map.PhotoSource;
import b6b.q;
import l6b.a;
import g6b.c;
import com.yxcorp.map.search.SearchEditorLayout;
import com.yxcorp.gifshow.model.HotPlace;
import com.kuaishou.android.model.mix.Location;
import com.yxcorp.map.model.PoiModel;
import kotlin.jvm.internal.a;
import java.util.Objects;
import l6b.e;
import java.lang.Enum;
import com.yxcorp.gifshow.model.response.PoiDetailInfoResponse$PoiDetail;
import com.yxcorp.gifshow.model.HotSpotDetail;
import com.kwai.framework.model.common.Distance;
import h3d.a;

public final class SearchFragment$d implements a	// class@001ccd
{
    public final SearchFragment a;

    public void SearchFragment$d(SearchFragment p0){
       this.a = p0;
       super();
    }
    public void a(Place p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchFragment$d.class, "3")) {
          return;
       }
       if (p0 != null) {
          Place mLatitude = p0.mLatitude;
          if (mLatitude != null) {
             Place mLongitude = p0.mLongitude;
             if (mLongitude != null) {
                MapCenterInfo mapCenterInf = new MapCenterInfo(Double.parseDouble(mLatitude), Double.parseDouble(mLongitude), PhotoSource.FROM_SEARCH, q.d.b());
                v9.mPoiName = p0.mPlaceName;
                c uoc = SearchFragment.ch(this.a).a();
                if (uoc != null) {
                   uoc.c(v9, "SEARCH");
                }
                SearchFragment l = this.a.l;
                if (l != null) {
                   l.e();
                }
             }
          }
       }
       return;
    }
    public void b(HotPlace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchFragment$d.class, "2")) {
          return;
       }
       if (p0 != null) {
          Place mLatitude = p0.mLatitude;
          if (mLatitude != null) {
             Place mLongitude = p0.mLongitude;
             if (mLongitude != null) {
                MapCenterInfo mapCenterInf = new MapCenterInfo(Double.parseDouble(mLatitude), Double.parseDouble(mLongitude), PhotoSource.FROM_SEARCH, q.d.b());
                v9.mPoiName = p0.mPlaceName;
                c uoc = SearchFragment.ch(this.a).a();
                if (uoc != null) {
                   uoc.c(v9, "SEARCH");
                }
                SearchFragment l = this.a.l;
                if (l != null) {
                   l.e();
                }
             }
          }
       }
       return;
    }
    public void c(Location p0){
       SearchFragment m;
       SearchFragment m1;
       c uoc1;
       MapCenterInfo mapCenterInf1;
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchFragment$d.class, "1")) {
          return;
       }
       SearchFragment$d ta = this.a;
       PoiModel poiModel = PoiModel.fromSearch(p0);
       a.o(poiModel, "PoiModel.fromSearch\(location\)");
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(poiModel, ta, SearchFragment.class, "5")) {
          int i = e.a[poiModel.mType.ordinal()];
          String str = "mSearchCallerContext";
          if (i != 1) {
             if (i != 2) {
                poiModel = poiModel.mPoiDetail;
                if (poiModel != null) {
                   MapCenterInfo mapCenterInf = new MapCenterInfo(poiModel.mLatitude, poiModel.mLongitude, PhotoSource.FROM_SEARCH, q.d.b());
                   i.mPoiName = poiModel.mTitle;
                   m = ta.m;
                   if (m == null) {
                      a.S(str);
                   }
                   c uoc = m.a();
                   if (uoc != null) {
                      uoc.c(i, "SEARCH");
                   }
                }
             }else {
                poiModel = poiModel.mHotSpotDetail;
                if (poiModel != null) {
                   HotSpotDetail mLocation = poiModel.mLocation;
                   if (mLocation != null) {
                      m1 = ta.m;
                      if (m1 == null) {
                         a.S(str);
                      }
                      uoc1 = m1.a();
                      if (uoc1 != null) {
                         mapCenterInf1 = new MapCenterInfo(mLocation.mLatitude, mLocation.mLongtitude, PhotoSource.FROM_SEARCH, q.d.b());
                         uoc1.c(v2, "SEARCH");
                      }
                   }
                }
             }
          }else {
             poiModel = poiModel.mLocationDetail;
             if (poiModel != null) {
                m1 = ta.m;
                if (m1 == null) {
                   a.S(str);
                }
                uoc1 = m1.a();
                if (uoc1 != null) {
                   mapCenterInf1 = new MapCenterInfo(poiModel.b, poiModel.c, PhotoSource.FROM_SEARCH, q.d.b());
                   uoc1.c(v2, "SEARCH");
                }
             }
          }
       label_00b5 :
          m = ta.l;
          if (m != null) {
             m.e();
          }
       }
       return;
    }
}
