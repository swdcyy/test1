package com.yxcorp.gifshow.camera.record.tab.CameraTab;
import eh9.n;
import java.lang.Enum;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$1;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$2;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$3;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$4;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$5;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$6;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$7;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$8;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$9;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$10;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$11;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$12;
import com.yxcorp.gifshow.camera.record.tab.CameraTab$13;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import eh9.m;

public abstract class CameraTab extends Enum implements n	// class@000f43
{
    public final int mId;
    public String mRightTopText;
    public String mTabText;
    public static final CameraTab[] $VALUES;
    public static final CameraTab CAMERA_TAB_ACTIVITY;
    public static final CameraTab CAMERA_TAB_DRAFT;
    public static final CameraTab CAMERA_TAB_HTML_ACTIVITY;
    public static final CameraTab CAMERA_TAB_IM_MIX;
    public static final CameraTab CAMERA_TAB_KTV;
    public static final CameraTab CAMERA_TAB_LIVE;
    public static final CameraTab CAMERA_TAB_MOOD;
    public static final CameraTab CAMERA_TAB_PHOTO;
    public static final CameraTab CAMERA_TAB_PICTURE_ALBUM;
    public static final CameraTab CAMERA_TAB_SNAPSHOT;
    public static final CameraTab CAMERA_TAB_TOOLBOX;
    public static final CameraTab CAMERA_TAB_VIDEO;
    public static final CameraTab CAMERA_TAB_WHATS_UP;

    static {
       CameraTab$1 u1 = new CameraTab$1("CAMERA_TAB_MOOD", 0, 10);
       CameraTab.CAMERA_TAB_MOOD = u1;
       CameraTab$2 u2 = new CameraTab$2("CAMERA_TAB_HTML_ACTIVITY", 1, 17);
       CameraTab.CAMERA_TAB_HTML_ACTIVITY = u2;
       CameraTab$3 u3 = new CameraTab$3("CAMERA_TAB_ACTIVITY", 2, 16);
       CameraTab.CAMERA_TAB_ACTIVITY = u3;
       CameraTab$4 u4 = new CameraTab$4("CAMERA_TAB_PHOTO", 3, 5);
       CameraTab.CAMERA_TAB_PHOTO = u4;
       CameraTab$5 u5 = new CameraTab$5("CAMERA_TAB_VIDEO", 4, 1);
       CameraTab.CAMERA_TAB_VIDEO = u5;
       CameraTab$6 u6 = new CameraTab$6("CAMERA_TAB_SNAPSHOT", 5, 12);
       CameraTab.CAMERA_TAB_SNAPSHOT = u6;
       CameraTab$7 u7 = new CameraTab$7("CAMERA_TAB_TOOLBOX", 6, 11);
       CameraTab.CAMERA_TAB_TOOLBOX = u7;
       CameraTab$8 u8 = new CameraTab$8("CAMERA_TAB_LIVE", 7, 2);
       CameraTab.CAMERA_TAB_LIVE = u8;
       CameraTab$9 u9 = new CameraTab$9("CAMERA_TAB_KTV", 8, 3);
       CameraTab.CAMERA_TAB_KTV = u9;
       CameraTab$10 u10 = new CameraTab$10("CAMERA_TAB_DRAFT", 9, 14);
       CameraTab.CAMERA_TAB_DRAFT = u10;
       CameraTab$11 u11 = new CameraTab$11("CAMERA_TAB_IM_MIX", 10, 18);
       CameraTab.CAMERA_TAB_IM_MIX = u11;
       CameraTab$12 u12 = new CameraTab$12("CAMERA_TAB_WHATS_UP", 11, 19);
       CameraTab.CAMERA_TAB_WHATS_UP = u12;
       CameraTab$13 u13 = new CameraTab$13("CAMERA_TAB_PICTURE_ALBUM", 12, 15);
       CameraTab.CAMERA_TAB_PICTURE_ALBUM = u13;
       CameraTab[] uCameraTabAr = new CameraTab[13];
       uCameraTabAr[0] = u1;
       uCameraTabAr[1] = u2;
       uCameraTabAr[2] = u3;
       uCameraTabAr[3] = u4;
       uCameraTabAr[4] = u5;
       uCameraTabAr[5] = u6;
       uCameraTabAr[6] = u7;
       uCameraTabAr[7] = u8;
       uCameraTabAr[8] = u9;
       uCameraTabAr[9] = u10;
       uCameraTabAr[10] = u11;
       uCameraTabAr[11] = u12;
       uCameraTabAr[12] = u13;
       CameraTab.$VALUES = uCameraTabAr;
    }
    public void CameraTab(String p0,int p1,int p2){
       super(p0, p1);
       this.mId = p2;
    }
    public void CameraTab(String p0,int p1,int p2,CameraTab$1 p3){
       super(p0, p1, p2);
    }
    public static CameraTab valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CameraTab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CameraTab.class, p0);
    }
    public static CameraTab[] values(){
       Object obj = PatchProxy.apply(null, null, CameraTab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CameraTab.$VALUES.clone();
    }
    public boolean a(){
       return m.f(this);
    }
    public int getItemViewId(){
       return m.a(this);
    }
    public String getRightTopText(){
       return this.mRightTopText;
    }
    public int getTabId(){
       return this.mId;
    }
    public String getTabText(){
       return m.b(this);
    }
    public int getTagStubId(){
       return m.c(this);
    }
    public int getTextViewId(){
       return m.d(this);
    }
    public boolean isDefaultHide(){
       return m.e(this);
    }
    public void setRightTopText(String p0){
       this.mRightTopText = p0;
    }
    public void setTabText(String p0){
       this.mTabText = p0;
    }
    public boolean supportLastUsedTabTabId(){
       return m.g(this);
    }
}
