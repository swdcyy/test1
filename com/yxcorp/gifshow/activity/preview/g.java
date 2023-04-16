package com.yxcorp.gifshow.activity.preview.g;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import y26.b$a;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.preview.f;
import t45.d;
import brd.z;
import jw8.p;
import erd.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import java.lang.System;
import gq.a;
import q87.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import java.lang.Throwable;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.VideoContextDraftHelper;
import jw8.m;
import jw8.o;
import jw8.n;
import jw8.l;
import erd.g;

public final class g	// class@001367
{

    public void g(){
       super();
    }
    public static t a(c p0,b$a p1,EncodeRequest$a p2,float p3,int p4,int p5){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, og, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return f.f(p0, p4, p5, p3).subscribeOn(d.c).observeOn(d.a).map(new p(p1, p2));
    }
    public static t b(GifshowActivity p0,c p1,b$a p2,b$a p3,String p4){
       Object[] objArray;
       Object obj;
       object oobject = p1;
       object oobject1 = p3;
       g og = g.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(og)) {
          objArray = new Object[]{p0,oobject,p2,oobject1,p4};
          obj = PatchProxy.apply(objArray, null, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = System.currentTimeMillis();
       objArray = new Object[i1];
       a.D().s("EditCost", "准备开始编码", objArray);
       GeneratedMessageLite generatedMes = p1.v();
       if (generatedMes == null) {
          return t.error(new DraftEditException("Workspace data error."));
       }else {
          Workspace$Type type = p1.a1();
          File uFile = DraftFileManager.E().u(oobject);
          String str = p1.V0();
          VideoContextDraftHelper.c(oobject, p1.d1());
          b$a uoa = p2;
          m om = new m(type, generatedMes, p0, uoa, p1, uFile);
          t ot = f.a(oobject, oobject1, i, str).flatMap(v9);
          o oo = new o(p2, generatedMes, uFile, str, p4);
          t ot1 = ot.map(obj);
          n on = new n(type, p1, generatedMes, uoa, l);
          return ot1.map(v9).doOnError(new l(oobject));
       }
    }
}
