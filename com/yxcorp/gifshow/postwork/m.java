package com.yxcorp.gifshow.postwork.m;
import erd.o;
import com.yxcorp.gifshow.postwork.o;
import com.yxcorp.gifshow.postwork.a$a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.framework.model.user.QCurrentUser;
import iq.a;
import q87.c;
import java.util.Collections;
import java.lang.StringBuilder;
import java.io.File;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.aicut.ui.loading.a;
import android.content.Context;
import com.kwai.ksvideorendersdk.EditorSDKSoLoader$Handler;
import com.kwai.video.minecraft.model.nano.Minecraft$ResourcePathConfig;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.util.ArrayList;
import qkd.c;
import java.lang.Throwable;
import w46.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.util.Base64;
import zk.d;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.postwork.UploadInfoDeserializer;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.yxcorp.gifshow.postwork.UploadRequestDeserializer;
import java.io.Serializable;
import com.yxcorp.gifshow.postwork.SerializableDefaultObject$a;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import f0c.w0;
import qkd.b;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import f0c.s;
import f0c.r;
import erd.g;
import com.yxcorp.gifshow.util.PostUtils;

public final class m implements o	// class@0010d0
{
    public final o b;
    public final a$a c;

    public void m(o p0,a$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       String str;
       File uFile1;
       Object[] objArray4;
       m om = this;
       m b = om.b;
       Objects.requireNonNull(b);
       om.c.d();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       _monitor_enter(b);
       Object[] objArray = null;
       List list = PatchProxy.apply(objArray, b, oo, "6");
       if (list != patchProxyRe) {
          _monitor_exit(b);
       }else if(!QCurrentUser.me().isLogined()){
          objArray = new Object[0];
          a.D().w("PostWorkInfoCacheHelper", "readCachedWorks not login", objArray);
          list = Collections.emptyList();
          _monitor_exit(b);
       }else {
          Object[] objArray1 = new Object[0];
          a.D().w("PostWorkInfoCacheHelper", "readCachedWorks user id: "+QCurrentUser.me().getId(), objArray1);
          File uFile = o.c(QCurrentUser.me().getId());
          if (uFile == null) {
             list = Collections.emptyList();
             _monitor_exit(b);
          }else {
             File[] uFileArray = uFile.listFiles();
             if (uFileArray == null || !uFileArray.length) {
                objArray = new Object[0];
                a.D().w("PostWorkInfoCacheHelper", "readCachedWorks is empty", objArray);
                list = Collections.emptyList();
                _monitor_exit(b);
             }else {
                EditorSdk2Utils.initJni(a.a().a(), a.a, objArray);
                ArrayList uArrayList = new ArrayList();
                Object[] objArray2 = new Object[0];
                a.D().w("PostWorkInfoCacheHelper", "目录下文件个数: "+uFileArray.length, objArray2);
                int len = uFileArray.length;
                int i = 0;
                while (i < len) {
                   object oobject = uFileArray[i];
                   if (!oobject.isDirectory()) {
                      try{
                         str = c.j(oobject);
                      }catch(java.io.IOException e0){
                         a.D().e("PostWorkInfoCacheHelper", "读取文件异常", e0);
                         str = objArray;
                      }
                      if (!TextUtils.isEmpty(str)) {
                         byte[] uobyteArray = Base64.decode(str, 0);
                         try{
                            String str1 = new String(uobyteArray);
                            d uod = new d();
                            uod.h(UploadInfo.class, new UploadInfoDeserializer());
                            uod.h(UploadRequest.class, new UploadRequestDeserializer());
                            uod.f(Serializable.class, new SerializableDefaultObject$a());
                            PostWorkInfo postWorkInfo = uod.b().h(str1, PostWorkInfo.class);
                            if (postWorkInfo != null) {
                               PostWorkInfo mUploadInfo = postWorkInfo.mUploadInfo;
                               if (mUploadInfo != null) {
                                  UploadInfo mVideoContex = mUploadInfo.mVideoContext;
                                  if (mVideoContex != null) {
                                     PostWorkInfo mEncodeInfo = postWorkInfo.mEncodeInfo;
                                     if (mEncodeInfo != null) {
                                        mEncodeInfo.setVideoContext(mVideoContex);
                                     }
                                  }
                               }
                               mUploadInfo = postWorkInfo.mRequest;
                               a uoa = 1;
                               if (mUploadInfo != null) {
                                  w0 b1 = mUploadInfo.b;
                                  if (b1 != null && b1.getWorkspaceDirectory() == null) {
                                     Object[] objArray3 = new Object[0];
                                     a.D().w("PostWorkInfoCacheHelper", "mUploadRequest do not need workspace", objArray3);
                                     uFile1 = b.f(new File(postWorkInfo.mRequest.b.getFilePath()));
                                     if (!b.S(uFile1)) {
                                        objArray4 = new Object[0];
                                        a.D().A("PostWorkInfoCacheHelper", "uploadFilePath is null or file is not exists, path is "+uFile1.getAbsoluteFile(), objArray4);
                                        b.b(postWorkInfo);
                                     }else {
                                        mUploadInfo = postWorkInfo.mUploadInfo;
                                        if (mUploadInfo != null) {
                                           b.g(mUploadInfo);
                                        }
                                        if (postWorkInfo.getStatus() != PostStatus.UPLOAD_FAILED) {
                                           postWorkInfo.setRecoverStatus(2);
                                        }else {
                                           postWorkInfo.setRecoverStatus(uoa);
                                        }
                                        uArrayList.add(postWorkInfo);
                                     }
                                  }
                               }
                               uFile1 = postWorkInfo.getWorkspaceDirectory();
                               if (uFile1 == null) {
                                  Object[] objArray5 = new Object[0];
                                  a.D().w("PostWorkInfoCacheHelper", "postWorkInfo no workspace directory "+postWorkInfo.getId(), objArray5);
                               }else {
                                  File uFile2 = PatchProxy.applyOneRefs(uFile1, b, oo, "7");
                                  if (uFile2 != patchProxyRe) {
                                  }else {
                                     String name = uFile1.getName();
                                     uFile2 = (b.S(uFile1))? uFile1: new File(DraftFileManager.E().O(), name);
                                  }
                                  if (!uFile2.exists()) {
                                     objArray4 = new Object[0];
                                     a.D().w("PostWorkInfoCacheHelper", "workspace is not exist "+uFile1, objArray4);
                                     b.b(postWorkInfo);
                                  }else {
                                     objArray = new Object[0];
                                     a.D().w("PostWorkInfoCacheHelper", "workspace is not null, start recover", objArray);
                                     DraftFileManager.E().Y(uFile2, uoa).blockingSubscribe(new s(b, postWorkInfo, uFile2, uArrayList), new r(b, postWorkInfo));
                                  }
                               }
                            }
                         }catch(java.lang.Exception e0){
                            PostUtils.D("PostWorkInfoCacheHelper", "readCachedWorks\(\)", e0);
                         }
                      }
                   }
                   i = i + 1;
                   objArray = null;
                }
                objArray = new Object[0];
                a.D().w("PostWorkInfoCacheHelper", "数据读取完成，数据个数: "+uArrayList.size(), objArray);
                _monitor_exit(b);
                list = uArrayList;
             }
          }
       }
       return list;
    }
}
