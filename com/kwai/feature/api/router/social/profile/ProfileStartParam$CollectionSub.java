package com.kwai.feature.api.router.social.profile.ProfileStartParam$CollectionSub;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class ProfileStartParam$CollectionSub extends Enum	// class@00107b
{
    public final int id;
    public final String name;
    public final String tabType;
    public static final ProfileStartParam$CollectionSub[] $VALUES;
    public static final ProfileStartParam$CollectionSub TAB_COLLECTION_MAGIC;
    public static final ProfileStartParam$CollectionSub TAB_COLLECTION_MUSIC;
    public static final ProfileStartParam$CollectionSub TAB_COLLECTION_POI;
    public static final ProfileStartParam$CollectionSub TAB_COLLECTION_POST;
    public static final ProfileStartParam$CollectionSub TAB_COLLECTION_SERIAL;
    public static final ProfileStartParam$CollectionSub TAB_COLLECTION_TAG;
    public static final ProfileStartParam$CollectionSub TAB_COLLECTION_TEMPLATE;
    public static final ProfileStartParam$CollectionSub TAB_COLLECTION_UNFINISHPOST;

    static {
       ProfileStartParam$CollectionSub uCollectionS = new ProfileStartParam$CollectionSub("TAB_COLLECTION_POST", 0, "photo", 0);
       ProfileStartParam$CollectionSub.TAB_COLLECTION_POST = uCollectionS;
       ProfileStartParam$CollectionSub uCollectionS1 = new ProfileStartParam$CollectionSub("TAB_COLLECTION_MUSIC", 1, "music", 1);
       ProfileStartParam$CollectionSub.TAB_COLLECTION_MUSIC = uCollectionS1;
       ProfileStartParam$CollectionSub uCollectionS2 = new ProfileStartParam$CollectionSub("TAB_COLLECTION_TAG", 2, "tag", 2);
       ProfileStartParam$CollectionSub.TAB_COLLECTION_TAG = uCollectionS2;
       ProfileStartParam$CollectionSub uCollectionS3 = new ProfileStartParam$CollectionSub("TAB_COLLECTION_MAGIC", 3, "magicFace", 3);
       ProfileStartParam$CollectionSub.TAB_COLLECTION_MAGIC = uCollectionS3;
       ProfileStartParam$CollectionSub uCollectionS4 = new ProfileStartParam$CollectionSub("TAB_COLLECTION_POI", 4, "poi", 4);
       ProfileStartParam$CollectionSub.TAB_COLLECTION_POI = uCollectionS4;
       ProfileStartParam$CollectionSub uCollectionS5 = new ProfileStartParam$CollectionSub("TAB_COLLECTION_SERIAL", 5, "serial", 5);
       ProfileStartParam$CollectionSub.TAB_COLLECTION_SERIAL = uCollectionS5;
       ProfileStartParam$CollectionSub uCollectionS6 = new ProfileStartParam$CollectionSub("TAB_COLLECTION_UNFINISHPOST", 6, "unfinish", 6);
       ProfileStartParam$CollectionSub.TAB_COLLECTION_UNFINISHPOST = uCollectionS6;
       ProfileStartParam$CollectionSub uCollectionS7 = new ProfileStartParam$CollectionSub("TAB_COLLECTION_TEMPLATE", 7, "template", 7);
       ProfileStartParam$CollectionSub.TAB_COLLECTION_TEMPLATE = uCollectionS7;
       ProfileStartParam$CollectionSub[] uCollectionS8 = new ProfileStartParam$CollectionSub[]{uCollectionS,uCollectionS1,uCollectionS2,uCollectionS3,uCollectionS4,uCollectionS5,uCollectionS6,uCollectionS7};
       ProfileStartParam$CollectionSub.$VALUES = uCollectionS8;
    }
    public void ProfileStartParam$CollectionSub(String p0,int p1,String p2,int p3){
       super(p0, p1);
       this.name = p2;
       this.id = p3;
       this.tabType = p2;
    }
    public static ProfileStartParam$CollectionSub valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProfileStartParam$CollectionSub.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ProfileStartParam$CollectionSub.class, p0);
    }
    public static ProfileStartParam$CollectionSub[] values(){
       Object obj = PatchProxy.apply(null, null, ProfileStartParam$CollectionSub.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProfileStartParam$CollectionSub.$VALUES.clone();
    }
    public static ProfileStartParam$CollectionSub withId(int p0){
       ProfileStartParam$CollectionSub[] obj;
       object oobject;
       ProfileStartParam$CollectionSub uCollectionS = ProfileStartParam$CollectionSub.class;
       if (PatchProxy.isSupport(uCollectionS)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uCollectionS, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ProfileStartParam$CollectionSub.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return ProfileStartParam$CollectionSub.TAB_COLLECTION_POST;
          }
          oobject = obj[i];
          if (oobject.id == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static ProfileStartParam$CollectionSub withName(String p0){
       object oobject;
       ProfileStartParam$CollectionSub[] obj = PatchProxy.applyOneRefs(p0, null, ProfileStartParam$CollectionSub.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ProfileStartParam$CollectionSub.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return ProfileStartParam$CollectionSub.TAB_COLLECTION_POST;
          }
          oobject = obj[i];
          if ((oobject.name).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
}
