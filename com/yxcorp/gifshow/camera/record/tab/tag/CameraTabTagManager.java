package com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagManager;
import java.lang.Object;
import java.util.HashMap;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagManager$1;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagConfig;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import lnc.z6;
import oa0.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagManager$a;
import android.view.View;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import com.yxcorp.utility.n;

public class CameraTabTagManager	// class@000f54
{
    public Map a;
    public CameraActivity b;
    public boolean c;
    public DefaultLifecycleObserver d;

    public void CameraTabTagManager(){
       super();
       this.a = new HashMap();
       this.c = false;
       this.d = new CameraTabTagManager$1(this);
    }
    public static int a(CameraTabTagConfig p0,Map p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CameraTabTagManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.x(p0.getUniqueIdentifier())) {
          return -1;
       }
       Integer integer = p1.get(p0.getUniqueIdentifier());
       int i = (integer == null)? 0: integer.intValue();
       return i;
    }
    public static Map b(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, objArray, CameraTabTagManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = z6.I3;
       String str = a.a.getString(b.d("user")+"camera_tab_tags_count", "[]");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          objArray = new HashMap();
       }
       return objArray;
    }
    public static void e(CameraTabTagConfig p0,int p1,Map p2){
       if (PatchProxy.isSupport(CameraTabTagManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, CameraTabTagManager.class, "9")) {
          return;
       }
       if (TextUtils.x(p0.getUniqueIdentifier())) {
          return;
       }
       if (p2 == null) {
          p2 = CameraTabTagManager.b();
       }
       p2.put(p0.getUniqueIdentifier(), Integer.valueOf(p1));
       a.J0(p2);
       return;
    }
    public void c(int p0){
       CameraTabTagManager uCameraTabTa = CameraTabTagManager.class;
       if (PatchProxy.isSupport(uCameraTabTa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCameraTabTa, "3")) {
          return;
       }
       CameraTabTagManager$a uoa = this.a.get(Integer.valueOf(p0));
       if (uoa != null) {
          CameraTabTagManager$a f = uoa.f;
          if (f != null) {
             if (f.mPermanentHide != null) {
                CameraTabTagManager.e(f, -1, null);
             }
             f = uoa.f;
             if (f.mIsRemainShowAfterClick == null) {
                this.d(f.mCameraTabType, uoa.e, false, null);
                uoa.f = null;
                uoa.e = null;
             }
          }
       }
       return;
    }
    public final void d(int p0,View p1,boolean p2,String p3){
       if (PatchProxy.isSupport(CameraTabTagManager.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), p3, this, CameraTabTagManager.class, "5")) {
          return;
       }
       if (p2) {
          if (p0 == 3) {
             CameraTab.CAMERA_TAB_ACTIVITY.setRightTopText(p3);
             CameraTab.CAMERA_TAB_HTML_ACTIVITY.setRightTopText(p3);
          }
          n.Y(p1, 0, 0);
       }else if(p0 == 3){
          CameraTab.CAMERA_TAB_ACTIVITY.setRightTopText(null);
          CameraTab.CAMERA_TAB_HTML_ACTIVITY.setRightTopText(null);
       }
       n.Y(p1, 8, 0);
       return;
    }
}
