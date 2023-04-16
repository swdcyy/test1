package com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import faa.a;
import java.lang.StringBuilder;
import android.content.Intent;
import kotlin.jvm.internal.a;
import android.net.Uri;
import q87.c;
import android.os.Parcelable;
import wsc.b0;
import o56.f;
import android.content.Context;
import wsc.k;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.io.File;
import android.content.ContentResolver;
import com.kuaishou.gifshow.files.a;
import s16.g;
import lq.i;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.v3.EditorActivity;
import x26.a;
import wsc.c;
import lq.l$a;
import qrd.l1;
import w46.b;
import wsc.g;
import wsc.b;
import erd.g;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import zsd.u;
import brd.t;
import brd.a0;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity$b;
import com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity$c;
import crd.b;
import lq.a;
import com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity$d;
import com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity$e;

public final class PostRelayActivity extends GifshowActivity	// class@0011a6
{
    public HashMap y;
    public static final PostRelayActivity$a z;

    static {
       PostRelayActivity.z = new PostRelayActivity$a(null);
    }
    public void PostRelayActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PostRelayActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       Uri data;
       String queryParamet;
       b0 b;
       String queryParamet1;
       String queryParamet2;
       String stringExtra;
       String str7;
       String str8;
       BasePostActivity obj1;
       Object[] objArray2;
       Object[] objArray4;
       Object obj = this;
       PostRelayActivity postRelayAct = PostRelayActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, obj, postRelayAct, "1")) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getIntent();
       String str = "intent";
       a.o(intent, str);
       int i = 0;
       Object[] objArray = new Object[i];
       String str1 = "PostRelayActivity";
       a.D().w(str1, "2761 onCreate intent.data = ["+intent.getData()+']', objArray);
       Intent intent1 = this.getIntent();
       a.o(intent1, str);
       data = intent1.getData();
       if (data != null) {
          String str2 = "it";
          a.o(data, str2);
          if (!data.isHierarchical()) {
             data = null;
          }
          if (data != null) {
             Object[] objArray1 = new Object[i];
             a.D().w(str1, "3303 onCreate process", objArray1);
             a.o(data, str2);
             String host = data.getHost();
             if (host != null) {
                boolean i1 = host.hashCode();
                String str3 = "ksdraftid";
                int i2 = 1;
                if (i1 != -925052010) {
                   if (i1 == 0xb0a243f && host.equals("postphotorelay")) {
                      intent1 = this.getIntent();
                      a.o(intent1, str);
                      if (!PatchProxy.applyVoidOneRefs(intent1, obj, postRelayAct, "3")) {
                         Uri parcelableEx = intent1.getParcelableExtra("imageurl");
                         Uri data1 = intent1.getData();
                         str = "isandroidnewuser";
                         if (data1 != null) {
                            queryParamet = data1.getQueryParameter(str);
                            if (queryParamet != null) {
                            label_00b8 :
                               a.o(queryParamet, "backUrl?.getQueryParamet\x20\x02_NEW_USER\) ?: RELAY_FALSE\x00");
                               b = b0.b;
                               String str4 = "";
                               if (data1 != null) {
                                  queryParamet1 = data1.getQueryParameter(str3);
                                  if (queryParamet1 != null) {
                                  label_00cb :
                                     a.o(queryParamet1, "backUrl?.getQueryParamet\x20\x02RELAY_KEY_DRAFT_ID\) ?: \"\"\x00");
                                     String str5 = "kstaskid";
                                     if (data1 != null) {
                                        queryParamet2 = data1.getQueryParameter(str5);
                                        if (queryParamet2 != null) {
                                        label_00dc :
                                           a.o(queryParamet2, "backUrl?.getQueryParameter\(RELAY_KS_TASK_ID\) ?: \"\"");
                                           String str6 = "from";
                                           if (a.g(queryParamet, "true") ^ i2) {
                                              str = ", imageUri:";
                                              str1 = ", isAndroidNewUser:";
                                              if (parcelableEx == null) {
                                                 if (f.a() == null) {
                                                    f.d(this);
                                                 }
                                                 k.k("yitian do nothing backUrl:"+data1+str1+queryParamet+str+parcelableEx);
                                              }else {
                                                 stringExtra = intent1.getStringExtra("extrainfo");
                                                 if (stringExtra == null) {
                                                    stringExtra = str4;
                                                 }
                                                 a.o(stringExtra, "intent.getStringExtra\(YITIAN_EXTRA_INFO\) ?: \"\"");
                                                 str3 = intent1.getStringExtra("caption");
                                                 if (str3 == null) {
                                                    str3 = str4;
                                                 }
                                                 a.o(str3, "intent.getStringExtra\(YITIAN_CAPTION\) ?: \"\"");
                                                 Ref$ObjectRef objectRef = new Ref$ObjectRef();
                                                 host = intent1.getStringExtra("localidentifiers");
                                                 str7 = (host != null)? host: str4;
                                                 a.o(str7, "intent.getStringExtra\(YI\x20\x02_LOCAL_IDENTIFIERS\) ?: \"\"\x00");
                                                 objectRef.element = str7;
                                                 if (!new File(str7).exists()) {
                                                    host = a.d(this.getContentResolver(), parcelableEx);
                                                    str8 = str4;
                                                    a.o(host, "FileUtilsToMerge.getCont¡­ontentResolver, imageUri\)");
                                                    objectRef.element = host;
                                                 }else {
                                                    str8 = str4;
                                                 }
                                                 if (data1 != null) {
                                                    host = data1.getQueryParameter(str6);
                                                    if (host != null) {
                                                       str4 = host;
                                                    label_017d :
                                                       a.o(str4, "backUrl?.getQueryParameter\(RELAY_KEY_FROM\) ?: \"\"");
                                                       k.k("yitian ps back ksDraftId:"+queryParamet1+", ksTaskId:"+queryParamet2+", caption:"+str3+", extraInfo:"+stringExtra+" backUrl:"+data1+str1+queryParamet+str+parcelableEx+" albumPath:"+str7+", from:"+str4+", imageUrlPath:"+objectRef.element);
                                                       g.a("com.kwai.m2u", 7, stringExtra);
                                                       if (i.h()) {
                                                          i oi = i.m();
                                                          host = "PostSession.current\(\)";
                                                          a.o(oi, host);
                                                          List list = oi.y();
                                                          a.o(list, "PostSession.current\(\).drafts");
                                                          if (list.isEmpty() ^ 1) {
                                                             oi = i.m();
                                                             a.o(oi, host);
                                                             i1 = 0;
                                                             obj1 = oi.y().get(i1);
                                                             str6 = "PostSession.current\(\).drafts[0]";
                                                             a.o(obj1, str6);
                                                             if ((obj1.D0()).equals(queryParamet1)) {
                                                                oi = i.m();
                                                                a.o(oi, host);
                                                                obj1 = oi.y().get(i1);
                                                                a.o(obj1, str6);
                                                                Object obj2 = obj1;
                                                                b.g(obj2, objectRef.element, stringExtra, str3, str7);
                                                                i.m().Q("UPDATE_PICTURES_WHEN_RESUME", Boolean.TRUE);
                                                             }
                                                          }
                                                          oi = i.m();
                                                          a.o(oi, host);
                                                          obj1 = oi.G();
                                                          Ref$ObjectRef objectRef1 = (obj1 instanceof EditorActivity || obj1 instanceof a)? 1: null;
                                                          if (objectRef1) {
                                                             c uoc = new c(this, queryParamet1, objectRef, str3, queryParamet2, stringExtra, str7);
                                                             i.m().l(b);
                                                          }else {
                                                             this.x3(queryParamet1, objectRef.element, str3, queryParamet2, stringExtra, str7);
                                                          }
                                                       }else {
                                                          this.x3(queryParamet1, objectRef.element, str3, queryParamet2, stringExtra, str7);
                                                       }
                                                    }
                                                 }
                                                 str4 = str8;
                                                 goto label_017d ;
                                              }
                                           }else {
                                              str8 = str4;
                                              Bundle extras = intent1.getExtras();
                                              if (extras == null) {
                                                 extras = new Bundle();
                                              }
                                              a.o(extras, "intent.extras ?: Bundle\(\)");
                                              Bundle uBundle = new Bundle();
                                              uBundle.putString(str5, queryParamet2);
                                              uBundle.putString(str3, queryParamet1);
                                              if (data1 != null) {
                                                 stringExtra = data1.getQueryParameter(str6);
                                                 if (stringExtra != null) {
                                                 label_02d0 :
                                                    uBundle.putString(str6, stringExtra);
                                                    str6 = "subfrom";
                                                    if (data1 != null) {
                                                       str2 = data1.getQueryParameter(str6);
                                                       if (str2 != null) {
                                                       label_02e0 :
                                                          uBundle.putString(str6, str2);
                                                          uBundle.putString(str, queryParamet);
                                                          extras.putAll(uBundle);
                                                          str7 = (!queryParamet1.length())? 1: 0;
                                                          if (str7) {
                                                             objArray2 = new Object[0];
                                                             a.D().t(str1, "postPhotoRelay draftId invalid", objArray2);
                                                          }else {
                                                             int i3 = 0;
                                                             if (obj.v3(b, extras, queryParamet1)) {
                                                                objArray2 = new Object[i3];
                                                                a.D().w(str1, "postRelayFromPostSession", objArray2);
                                                             }else if(obj.w3(b, extras, queryParamet1)){
                                                                objArray2 = new Object[i3];
                                                                a.D().w(str1, "postRelayFromWorkspace", objArray2);
                                                             }else {
                                                                objArray2 = new Object[i3];
                                                                a.D().A(str1, "postPhotoRelay draft exist", objArray2);
                                                                b.c(obj, extras, null);
                                                             }
                                                          }
                                                       }
                                                    }
                                                    str2 = str8;
                                                    goto label_02e0 ;
                                                 }
                                              }
                                              stringExtra = str8;
                                              goto label_02d0 ;
                                           }
                                        }
                                     }
                                     queryParamet2 = str4;
                                     goto label_00dc ;
                                  }
                               }
                               queryParamet1 = str4;
                               goto label_00cb ;
                            }
                         }
                         queryParamet = "false";
                         goto label_00b8 ;
                      }
                   }
                }else if(host.equals("postvideorelay")){
                   intent1 = this.getIntent();
                   a.o(intent1, str);
                   if (!PatchProxy.applyVoidOneRefs(intent1, obj, postRelayAct, "2")) {
                      i1 = false;
                      if (intent1.getBooleanExtra("donothing", i1)) {
                         objArray2 = new Object[i1];
                         a.D().w(str1, "2648 postVideoRelay nothing", objArray2);
                         if (this.isTaskRoot()) {
                            f.d(this);
                         }
                      }else {
                         b b1 = b.b;
                         str2 = intent1.getStringExtra(str3);
                         Object[] objArray3 = new Object[0];
                         a.D().w(str1, "postVideoRelay draftId="+str2+"; params="+intent1.getExtras(), objArray3);
                         str7 = (str2 == null || !str2.length())? 1: 0;
                         if (str7) {
                            objArray4 = new Object[0];
                            a.D().A(str1, "postVideoRelay draftId invalid", objArray4);
                            b1.c(obj, intent1.getExtras(), null);
                         }else if(obj.v3(b1, intent1.getExtras(), str2)){
                            objArray2 = new Object[0];
                            a.D().w(str1, "postVideoRelayFromPostSession", objArray2);
                         }else if(obj.w3(b1, intent1.getExtras(), str2)){
                            objArray2 = new Object[0];
                            a.D().w(str1, "postVideoRelayFromWorkspace", objArray2);
                         }else {
                            objArray4 = new Object[0];
                            a.D().A(str1, "postVideoRelay draft exist", objArray4);
                            b1.c(obj, intent1.getExtras(), null);
                         }
                      }
                   }
                }
             }
          }
       }
    label_0403 :
       this.finish();
       return;
    }
    public final boolean u3(String p0,g p1,boolean p2){
       DraftFileManager obj;
       object oobject;
       boolean b;
       t ot;
       if (PatchProxy.isSupport(PostRelayActivity.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, PostRelayActivity.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = DraftFileManager.E();
       a.o(obj, "DraftFileManager.getInstance\(\)");
       File uFile = obj.O();
       if (uFile != null) {
          String[] stringArray = uFile.list();
          if (stringArray != null) {
             int len = stringArray.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   oobject = stringArray[i];
                   if (!a.g(oobject, p0)) {
                      a.o(oobject, "it");
                      if (!u.q2(oobject, p0, false, 2, null)) {
                         b = false;
                      label_0056 :
                         if (b) {
                         label_005d :
                            if (oobject == null) {
                               p1.accept(null);
                               return false;
                            }else {
                               File uFile1 = new File(uFile, oobject);
                               ot = (p2)? DraftFileManager.E().X(uFile1): DraftFileManager.E().b0(uFile1);
                               break ;
                            }
                         }else {
                            i = i + 1;
                         }
                      }
                   }
                   b = true;
                   goto label_0056 ;
                }
             }
             ot.firstOrError().G(d.a).R(new PostRelayActivity$b(p1), new PostRelayActivity$c(p1));
             return true;
          }
          oobject = null;
          goto label_005d ;
       }else {
          return false;
       }
    }
    public final boolean v3(g p0,Bundle p1,String p2){
       a obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PostRelayActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!i.h()) {
          return false;
       }
       obj = i.m().p();
       a.o(obj, "PostSession.current\(\).editSession\(\)");
       c uoc = obj.l();
       if (uoc != null) {
          a.o(uoc, "it");
          if (!a.g(uoc.D0(), p2)) {
             uoc = null;
          }
          if (uoc != null) {
             a.o(uoc, "PostSession.current\(\).ed\x20\x02draftId } ?: return false\x00");
             p0.c(this, p1, uoc);
             return true;
          }
       }
       return false;
    }
    public final boolean w3(g p0,Bundle p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PostRelayActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.u3(p2, new PostRelayActivity$d(this, p0, p1), false);
    }
    public final void x3(String p0,String p1,String p2,String p3,String p4,String p5){
       object oobject = p0;
       PostRelayActivity postRelayAct = PostRelayActivity.class;
       if (PatchProxy.isSupport(postRelayAct)) {
          Object[] objArray = new Object[]{oobject,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, postRelayAct, "7")) {
             return;
          }
       }
       PostRelayActivity$e uoe = new PostRelayActivity$e(this, p1, p2, p3, p4, p5);
       this.u3(p0, v10, 1);
       return;
    }
}
