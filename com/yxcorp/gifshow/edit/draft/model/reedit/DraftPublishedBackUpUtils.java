package com.yxcorp.gifshow.edit.draft.model.reedit.DraftPublishedBackUpUtils;
import com.yxcorp.gifshow.edit.draft.model.reedit.DraftPublishedBackUpUtils$mPublishedBackupInfoOperate$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import l46.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Boolean;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace$b;
import java.util.List;
import java.util.Collection;
import ekd.q;
import laa.m0;
import java.util.Objects;
import laa.w;
import java.lang.Runnable;
import ekd.k1;
import java.lang.System;
import com.kwai.feature.post.api.reedit.PublishedBackUpInfo;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator;
import lnc.p3;
import android.content.SharedPreferences;
import q46.l;
import android.content.SharedPreferences$Editor;
import km8.b;
import oe6.g;

public final class DraftPublishedBackUpUtils	// class@001b0e
{
    public static final p a;
    public static final DraftPublishedBackUpUtils b;

    static {
       DraftPublishedBackUpUtils.b = new DraftPublishedBackUpUtils();
       DraftPublishedBackUpUtils.a = s.c(DraftPublishedBackUpUtils$mPublishedBackupInfoOperate$2.INSTANCE);
    }
    public void DraftPublishedBackUpUtils(){
       super();
    }
    public final File a(String p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, DraftPublishedBackUpUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photoId");
       int i = 0;
       Object[] objArray = new Object[i];
       f.D().w("DraftPublishedBackUpUtils", "findMatchedDraftDir  photoId: "+p0, objArray);
       p0 = this.b().i(p0);
       if (TextUtils.x(p0)) {
          obj = new Object[i];
          f.D().w("DraftPublishedBackUpUtils", "findMatchedDraftDir: no matched workspace id", obj);
          return null;
       }else {
          DraftFileManager uDraftFileMa = DraftFileManager.E();
          a.o(uDraftFileMa, "DraftFileManager.getInstance\(\)");
          return new File(uDraftFileMa.O(), p0);
       }
    }
    public final a b(){
       Object obj = PatchProxy.apply(null, this, DraftPublishedBackUpUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DraftPublishedBackUpUtils.a.getValue();
    }
    public final void c(c p0,boolean p1){
       DraftFileManager uDraftFileMa;
       DraftPublishedBackUpUtils uDraftPublis = DraftPublishedBackUpUtils.class;
       if (PatchProxy.isSupport(uDraftPublis) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uDraftPublis, "2")) {
          return;
       }
       a.p(p0, "draft");
       Object[] objArray = new Object[0];
       f.D().w("DraftPublishedBackUpUtils", "recordPublishedBackupInfo\(\) called with: draft = "+p0+", isAutoSave = "+p1, objArray);
       GeneratedMessageLite$Builder uBuilder = p0.k();
       a.o(uBuilder, "draft.ensureFirstBuilder\(\)");
       List photoIdsList = uBuilder.getPhotoIdsList();
       a.o(photoIdsList, "draft.ensureFirstBuilder\(\).photoIdsList");
       String str = p0.D0();
       String str1 = (!q.f(photoIdsList))? photoIdsList.get((photoIdsList.size() - 1)): "";
       String str2 = str1;
       if (TextUtils.x(str2)) {
          Object[] objArray1 = new Object[0];
          f.D().A("DraftPublishedBackUpUtils", "recordPublishedBackupInfo  photoId is empty", objArray1);
          return;
       }else if(!p1){
          uDraftFileMa = DraftFileManager.E();
          File uFile = p0.f0();
          Objects.requireNonNull(uDraftFileMa);
          if (!PatchProxy.applyVoidOneRefs(uFile, uDraftFileMa, DraftFileManager.class, "89")) {
             k1.o(new w(uDraftFileMa, uFile));
          }
       }
       PublishedBackUpInfo publishedBac = new PublishedBackUpInfo(str2, System.currentTimeMillis(), p1, p0.V0());
       ReEditAfterDeleteOperator d = ReEditAfterDeleteOperator.d;
       a.o(str, "id");
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidTwoRefs(str, uDraftFileMa, d, ReEditAfterDeleteOperator.class, "9")) {
          a.p(str, "draftId");
          a.p(uDraftFileMa, "publishedBackUpInfo");
          objArray = new Object[0];
          p3.D().w("ReEditAfterDeleteOperator", "recordPublishedBackupInfo\(\) called with: draftId = "+str+", publishedBackUpInfo = "+uDraftFileMa, objArray);
          g.a(l.g().edit().putString("PUBLISHED_WS"+str, b.e(uDraftFileMa)).putString("PUBLISHED_PHOTO"+uDraftFileMa.getPhotoId(), str));
       }
       Object[] objArray2 = new Object[0];
       f.D().w("DraftPublishedBackUpUtils", "recordPublishedBackupInfo  id:"+str+"  "+uDraftFileMa, objArray2);
       return;
    }
}
