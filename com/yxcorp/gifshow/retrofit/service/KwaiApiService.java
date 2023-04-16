package com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import java.lang.String;
import brd.t;
import java.lang.Boolean;
import java.util.Map;
import okhttp3.RequestBody;

public interface abstract KwaiApiService	// class@001b0f
{

    t addMissU(String p0,int p1);
    t addResort(String p0,String p1,String p2,String p3);
    t changePrivateOption(String p0,String p1);
    t checkSoundTrackEditNameValidity(String p0,String p1);
    t confirmEditSoundTrackName(String p0,String p1);
    t dialogReport(String p0);
    t getCityRoamingSearchPresetWords();
    t getHotAndResortPlace(String p0,String p1);
    t getHotChannel(boolean p0,String p1,boolean p2,String p3,int p4,String p5);
    t getHotItems(String p0,String p1,boolean p2,int p3,int p4,boolean p5,int p6,boolean p7,long p8,int p9,String p10,int p11,String p12,boolean p13,String p14,String p15,float p16,boolean p17,int p18,String p19,String p20,boolean p21,long p22,String p23,String p24,Boolean p25,String p26);
    t getHotspotDetail(String p0);
    t getMultiHotspot(double p0,double p1,double p2,double p3);
    t getPoiDetail(long p0);
    t getPoiFeed(long p0,String p1,int p2,int p3);
    t getPoiList(double p0,double p1,int p2);
    t getPushSwitchStatus();
    t getRoamLocationResponse(String p0,String p1);
    t labClose(String p0);
    t locationSuggestion(String p0,String p1);
    t postFeedStat(int p0,String p1,String p2);
    t queryLiveChainSideBar(String p0,String p1,int p2);
    t queryLiveChainSideBarV2(String p0,String p1,int p2,String p3,String p4,String p5);
    t removeResort(String p0,String p1,String p2,String p3);
    t reportAdTrackLog(long p0,int p1,long p2,String p3,int p4);
    t requestAction(String p0,Map p1);
    t roamNearby(String p0,String p1,int p2,String p3,String p4);
    t roamNearbyWithHotFeeds(String p0,String p1,int p2,String p3,String p4);
    t shareId(String p0,String p1,String p2);
    t shareLocationTag(long p0);
    t shareMagicFaceTag(String p0,String p1);
    t shareMusicTag(String p0,int p1,String p2);
    t shareProfile(String p0,String p1);
    t shareTextTag(String p0,String p1);
    t topPhotoSingleReplace(String p0,int p1);
    t updatePushSwitchStatus(long p0,long p1);
    t updatePushSwitchStatus(long p0,long p1,String p2,String p3);
    t uploadSearchTagLog(RequestBody p0);
    t userInfo(String p0);
    t webHttpCall(String p0,Map p1,String p2);
}
