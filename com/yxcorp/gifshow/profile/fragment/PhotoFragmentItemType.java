package com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType;
import java.lang.Enum;
import com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType$PHOTO;
import java.lang.String;
import com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType$PRIVACY;
import com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType$MENTIONED_ME;
import com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType$LIKE;
import com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType$a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s1c.r0;
import kotlin.jvm.internal.a;
import y2c.o;
import qvb.i;

public abstract class PhotoFragmentItemType extends Enum	// class@00130f
{
    public static final PhotoFragmentItemType[] $VALUES;
    public static final PhotoFragmentItemType$a Companion;
    public static final PhotoFragmentItemType LIKE;
    public static final PhotoFragmentItemType MENTIONED_ME;
    public static final PhotoFragmentItemType PHOTO;
    public static final PhotoFragmentItemType PRIVACY;

    static {
       PhotoFragmentItemType$PHOTO pHOTO;
       PhotoFragmentItemType$PRIVACY pRIVACY;
       PhotoFragmentItemType$MENTIONED_ME mENTIONED_ME;
       PhotoFragmentItemType$LIKE lIKE;
       PhotoFragmentItemType[] photoFragmen = new PhotoFragmentItemType[]{pHOTO,pRIVACY,mENTIONED_ME,lIKE};
       pHOTO = new PhotoFragmentItemType$PHOTO("PHOTO", 0);
       PhotoFragmentItemType.PHOTO = pHOTO;
       pRIVACY = new PhotoFragmentItemType$PRIVACY("PRIVACY", 1);
       PhotoFragmentItemType.PRIVACY = pRIVACY;
       mENTIONED_ME = new PhotoFragmentItemType$MENTIONED_ME("MENTIONED_ME", 2);
       PhotoFragmentItemType.MENTIONED_ME = mENTIONED_ME;
       lIKE = new PhotoFragmentItemType$LIKE("LIKE", 3);
       PhotoFragmentItemType.LIKE = lIKE;
       PhotoFragmentItemType.$VALUES = photoFragmen;
       PhotoFragmentItemType.Companion = new PhotoFragmentItemType$a(null);
    }
    public void PhotoFragmentItemType(String p0,int p1){
       super(p0, p1);
    }
    public void PhotoFragmentItemType(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static final PhotoFragmentItemType getPhotoFragmentItemType(int p0){
       PhotoFragmentItemType pHOTO;
       PhotoFragmentItemType photoFragmen = PhotoFragmentItemType.class;
       if (PatchProxy.isSupport(photoFragmen)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, photoFragmen, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Objects.requireNonNull(PhotoFragmentItemType.Companion);
       if (p0 != 2) {
          if (p0 != 3) {
             pHOTO = (p0 != 19)? PhotoFragmentItemType.PHOTO: PhotoFragmentItemType.MENTIONED_ME;
          }else {
             pHOTO = PhotoFragmentItemType.LIKE;
          }
       }else {
          pHOTO = PhotoFragmentItemType.PRIVACY;
       }
       return pHOTO;
    }
    public static PhotoFragmentItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoFragmentItemType.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoFragmentItemType.class, p0);
    }
    public static PhotoFragmentItemType[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoFragmentItemType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoFragmentItemType.$VALUES.clone();
    }
    public abstract void addMyPresenter(PresenterV2 p0,r0 p1);
    public void addOnceBindPresenter(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PhotoFragmentItemType.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       PatchProxy.onMethodExit(PhotoFragmentItemType.class, "1");
       return;
    }
    public void addUserPresenter(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PhotoFragmentItemType.class, "2")) {
          return;
       }
       a.p(p0, "presenter");
       p0.U7(new o());
       PatchProxy.onMethodExit(PhotoFragmentItemType.class, "2");
       return;
    }
    public abstract i createPageList(String p0,r0 p1);
    public abstract String getTabName();
}
