package com.yxcorp.gifshow.upload.r0;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.upload.u0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import o56.a;
import km8.b;
import android.content.SharedPreferences;
import vaa.a;
import qq.a;
import q87.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Kuaishan;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import qkd.b;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.upload.s0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Iterable;
import com.yxcorp.gifshow.upload.q0;
import dnc.s1;
import dnc.r1;
import t45.d;
import brd.z;

public final class r0 implements o	// class@001e9d
{
    public static final r0 b;

    static {
       r0.b = new r0();
    }
    public void r0(){
       super();
    }
    public final Object apply(Object p0){
       String str1;
       t ot = PatchProxy.applyOneRefs(p0, null, u0.class, "5");
       if (ot != PatchProxyResult.class) {
       }else {
          int i = 0;
          if (!b.c(a.w, i).getBoolean("key_save_album", i) || p0.F0() == null) {
             ot = t.just(p0);
          }else {
             Object[] objArray = new Object[i];
             a.D().w("PostWorkUtils", "saveKuaiShanServerPic", objArray);
             if (p0.F0() != null && p0.F0().v() != null) {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = p0.F0().v().getProcessedByServerPhotoPathList().iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   File uFile = DraftFileManager.E().B(str, p0);
                   if (b.S(uFile)) {
                      Object[] objArray1 = new Object[i];
                      a.D().w("PostWorkUtils", "add Observable"+str, objArray1);
                      uArrayList.add(uFile);
                   }else if(uFile == null){
                      str1 = "file is null";
                   }else {
                      str1 = uFile.getAbsolutePath();
                   }
                   i1.c(new IllegalArgumentException(str1));
                }
                if (!uArrayList.isEmpty()) {
                   k1.o(s0.b);
                }
                p0 = (uArrayList.isEmpty())? t.just(p0): t.fromIterable(uArrayList).concatMap(q0.b).buffer(uArrayList.size()).map(new s1(p0)).onErrorReturn(new r1(p0)).observeOn(d.a);
                ot = p0;
             }else {
                ot = t.just(p0);
             }
          }
       }
       return ot;
    }
}
