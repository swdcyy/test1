package com.yxcorp.gifshow.v3.v;
import java.lang.Object;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.android.post.EditAbilityConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.edit.draft.Workspace$Source;
import wba.p0;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.IntArg;
import java.lang.Integer;
import com.kuaishou.android.post.PostPageArg;
import com.kuaishou.android.post.BoolArg;
import com.kuaishou.edit.draft.EditConfig;
import h69.j;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import android.app.Activity;
import com.kuaishou.edit.draft.Workspace$From;
import android.content.Intent;
import com.yxcorp.gifshow.v3.EditorActivity$PreviewTabInfo;
import com.kuaishou.android.post.StrArg;
import java.util.List;
import om8.a;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.ArrayList;
import ekd.j0;

public class v	// class@001624
{
    public static boolean a;

    public void v(){
       super();
    }
    public static boolean a(Workspace p0,EditAbilityConfig p1){
       Object[] objArray;
       boolean b1;
       boolean b3;
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, v.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p1.mEnableNormalPublish == null) {
          obj = new Object[i];
          a.D().w("EditorActivityUtils", "canShowDirectlyPublishBtn disable normalPublish editAbilityConfig"+p1, obj);
          return i;
       }else if(p0 == null){
          objArray = new Object[i];
          a.D().w("EditorActivityUtils", "canShowDirectlyPublishBtn workspace is null", objArray);
          return i;
       }else {
          boolean b = true;
          if (p0.a(p0.getSource())) {
             objArray = new Object[i];
             a.D().w("EditorActivityUtils", "canShowDirectlyPublishBtn is recreation", objArray);
             return b;
          }else if(p0.getType() == Workspace$Type.KTV_SONG || p0.getType() == Workspace$Type.KTV_MV){
             b1 = true;
          }else {
             b1 = false;
          }
          boolean b2 = (i.g().getUploadPage().get(Integer.valueOf(i)).intValue() == 2)? true: false;
          if (i.h()) {
             String str = "camera_page_source";
             if (Integer.valueOf(19).equals(i.m().z(str)) || Integer.valueOf(21).equals(i.m().z(str))) {
                b3 = true;
             label_00be :
                boolean b4 = (i.h() && i.g().getDisableQuickPublish().get(Boolean.FALSE).booleanValue())? true: false;
                if (b2 || (p0.getSource() == Workspace$Source.JUXING || (p0.getEditConfig().getDisableMoment() || (!b3 && (b4 && !j.i(p0)))))) {
                   b = false;
                }
                v.a = b;
                obj = new Object[i];
                a.D().w("EditorActivityUtils", "canShowDirectlyPublishBtn\(\) isFromECommerce="+b2+",isKtv:"+b1+",isFromIMSENDMessage:"+b3+",isDirectlyPublishBtnShowing:"+v.a+",isDisableByOption:"+b4, obj);
                return v.a;
             }
          }
          b3 = false;
          goto label_00be ;
       }
    }
    public static boolean b(c p0,EditAbilityConfig p1){
       Object[] objArray;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, v.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0.D()) {
          objArray = new Object[i];
          a.D().w("EditorActivityUtils", "canShowDirectlyPublishBtn editing", objArray);
          return v.a(p0.v(), p1);
       }else {
          objArray = new Object[i];
          a.D().w("EditorActivityUtils", "canShowDirectlyPublishBtn not editing", objArray);
          return v.a(p0.t(), p1);
       }
    }
    public static boolean c(Activity p0,c p1){
       Workspace$From obj = PatchProxy.applyTwoRefs(p0, p1, null, v.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!EditAbilityConfig.enableNormalPublish(i.g())) {
          return b;
       }
       obj = p1.B0();
       if (obj == Workspace$From.PROFILE_BACKGROUND) {
          return b;
       }
       if (obj == Workspace$From.PROFILE_AVATAR) {
          return v.i(p0.getIntent());
       }
       if (obj != Workspace$From.MEDIA_SENCE_COMMON) {
          return true;
       }
       if (p1.v() == null) {
          return true;
       }
       if (v.i(p0.getIntent())) {
          return true;
       }
       return (p1.v().getEditConfig().getDisableNextStep() ^ true);
    }
    public static EditorActivity$PreviewTabInfo d(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v ov = v.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, objArray, ov, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (i.h()) {
          obj = i.g().getDefaultEditPreviewTab().get();
          Object[] objArray1 = PatchProxy.applyOneRefs(obj, objArray, ov, "3");
          i = 0;
          if (objArray1 != patchProxyRe) {
          }else if(obj == null){
             int i1 = -1;
             switch (obj.hashCode()){
                 case 0xe0bf201e:
                   if (obj.equals("photoMovie")) {
                      i1 = 0;
                   }
                   break;
                 case 0x58d448b:
                   if (obj.equals("atlas")) {
                      i1 = 1;
                   }
                   break;
                 case 0x7e1d2ae2:
                   if (obj.equals("longPicture")) {
                      i1 = 2;
                   }
                   break;
                 default:
             }
             switch (i1){
                 case 0:
                   objArray1 = EditorActivity$PreviewTabInfo.VIDEO;
                   break;
                 case 1:
                   objArray1 = EditorActivity$PreviewTabInfo.ATLAS;
                   break;
                 case 2:
                   objArray1 = EditorActivity$PreviewTabInfo.LONGPICTURE;
                   break;
                 default:
             }
          }
          objArray1 = objArray;
          if (objArray1 != null) {
             Object[] objArray2 = new Object[i];
             a.D().w("EditorActivityUtils", "getArgDefaultTab tabFromArg: "+objArray1, objArray2);
             return objArray1;
          }
       }
       return objArray;
    }
    public static EditorActivity$PreviewTabInfo e(List p0){
       int i;
       EditorActivity$PreviewTabInfo previewTabIn;
       String obj = PatchProxy.applyOneRefs(p0, null, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.getString("newLastPhotosPageKey", "");
       Iterator iterator = p0.iterator();
       while (true) {
          i = 0;
          if (iterator.hasNext()) {
             previewTabIn = iterator.next();
             if ((previewTabIn.mPageKey).equals(obj)) {
                break ;
             }
          }else {
             Object[] objArray1 = new Object[i];
             a.D().w("EditorActivityUtils", "getLastSelectedTab: select default tab : Video", objArray1);
             return EditorActivity$PreviewTabInfo.VIDEO;
          }
       }
       Object[] objArray = new Object[i];
       a.D().w("EditorActivityUtils", "getLastSelectedTab previewTabInfo: "+previewTabIn, objArray);
       return previewTabIn;
    }
    public static c f(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, objArray, v.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!i.h()) {
          return objArray;
       }
       if (i.m().y().isEmpty()) {
          return objArray;
       }
       Workspace$Type[] typeArray = new Workspace$Type[]{Workspace$Type.ATLAS,Workspace$Type.LONG_PICTURE};
       obj = i.m().w(typeArray);
       if (obj == null) {
          obj = i.m().y().get(0);
       }
       return obj;
    }
    public static List g(){
       ArrayList obj = PatchProxy.apply(null, null, v.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(EditorActivity$PreviewTabInfo.ATLAS);
       obj.add(EditorActivity$PreviewTabInfo.VIDEO);
       obj.add(EditorActivity$PreviewTabInfo.LONGPICTURE);
       return obj;
    }
    public static boolean h(c p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, v.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.a1() != Workspace$Type.KTV_MV) {
          Workspace$Type vIDEO = Workspace$Type.VIDEO;
          if (p0.a1() != vIDEO) {
             Workspace$Type lONG_VIDEO = Workspace$Type.LONG_VIDEO;
             if (p0.a1() == lONG_VIDEO || (p0.b1() != vIDEO && p0.b1() != lONG_VIDEO)) {
                b = false;
             label_003c :
                return b;
             }
          }
       }
       b = true;
       goto label_003c ;
    }
    public static boolean i(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, v.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       String str = j0.f(p0, "SOURCE");
       str = (("edit").equals(str) || ("album_draft").equals(str))? 1: 0;
       boolean b1 = j0.a(p0, "IS_RECOVER", b);
       if (str || b1) {
          b = true;
       }
       return b;
    }
    public static boolean j(Workspace$Type p0,Workspace$From p1){
       boolean b = false;
       if (p1 != Workspace$From.NEW_USER_WIDGET) {
          return b;
       }
       if (p0 == Workspace$Type.KTV_SONG || p0 == Workspace$Type.KTV_MV) {
          b = 1;
       }
       return (b ^ 0x01);
    }
}
