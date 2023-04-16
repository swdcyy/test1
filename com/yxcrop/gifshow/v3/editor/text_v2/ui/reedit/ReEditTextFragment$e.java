package com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$e;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import laa.e;
import com.yxcorp.gifshow.edit.draft.model.c;
import mba.m0;
import qaa.a;
import com.yxcorp.gifshow.v3.f;
import pnd.b;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Workspace;
import java.util.List;
import qr4.e$l;
import qr4.e$d;
import java.util.Collection;
import com.kuaishou.edit.draft.Text;
import qr4.e$d$a;
import com.kuaishou.edit.draft.FeatureId;
import orc.f;
import com.kuaishou.edit.draft.StickerResult;
import qr4.e$d$b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.e$h;

public final class ReEditTextFragment$e implements g	// class@000b56
{
    public final ReEditTextFragment b;
    public final c c;

    public void ReEditTextFragment$e(ReEditTextFragment p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       List list;
       b uob1;
       int i3;
       float f;
       Object obj = this;
       ReEditTextFragment$e obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, ReEditTextFragment$e.class, "1")) {
       }else if(TextUtils.x(obj1)){
          obj.b.onError(new Throwable("15 generateCover failed"));
       }else {
          ReEditTextFragment$e c = obj.c;
          String str = "workspaceDraft";
          a.o(c, str);
          m0 om0 = c.u();
          boolean b = true;
          if (om0 != null) {
             om0.q(b);
          }
          c = obj.c;
          a.o(c, str);
          f.M(c.s0(), obj1);
          obj1 = obj.c;
          a.o(obj1, str);
          m0 om01 = obj1.u();
          boolean b1 = false;
          if (om01 != null) {
             om01.q(b1);
          }
          obj1 = obj.c;
          a.o(obj1, str);
          b uob = b.class;
          e$d$b obj2 = null;
          if (!PatchProxy.applyVoidOneRefs(obj1, obj2, uob, "2")) {
             a.p(obj1, str);
             Workspace workspace = obj1.v();
             if (workspace != null && workspace.getTextsCount()) {
                List textsList = workspace.getTextsList();
                int i = textsList.size();
                e$l[] olArray = new e$l[i];
                e$d[] uodArray = new e$d[textsList.size()];
                a.o(textsList, "textList");
                int i1 = textsList.size();
                int i2 = 0;
                while (i2 < i1) {
                   Text text = textsList.get(i2);
                   olArray[i2] = new e$l();
                   object oobject = olArray[i2];
                   a.m(oobject);
                   a.o(text, "text");
                   oobject.a = text.getText();
                   oobject = olArray[i2];
                   a.m(oobject);
                   oobject.b = "0-0";
                   uodArray[i2] = new e$d();
                   oobject = uodArray[i2];
                   a.m(oobject);
                   e$d$a[] uod$aArray = new e$d$a[b];
                   oobject.a = uod$aArray;
                   oobject = uodArray[i2];
                   a.m(oobject);
                   oobject.a[b1] = new e$d$a();
                   oobject = uodArray[i2];
                   a.m(oobject);
                   oobject.a[b1].b = b;
                   oobject = uodArray[i2];
                   a.m(oobject);
                   oobject.b = f.a(text.getFeatureId());
                   oobject = uodArray[i2];
                   a.m(oobject);
                   e$d obj3 = textsList.get(i2);
                   a.o(obj3, "textList[i]");
                   oobject.c = obj3.getText();
                   StickerResult result = text.getResult();
                   a.o(result, "text.result");
                   object oobject1 = uodArray[i2];
                   a.m(oobject1);
                   if (PatchProxy.applyVoidTwoRefs(result, oobject1, obj2, uob, "3")) {
                      list = textsList;
                      uob1 = uob;
                      i3 = i1;
                   }else {
                      uob1 = uob;
                      float centerX = result.getCenterX();
                      float centerY = result.getCenterY();
                      f = (float)2;
                      float f1 = (float)result.getResourceWidth() / f;
                      float f2 = (float)result.getResourceHeight() / f;
                      oobject1.d = new e$d$b();
                      oobject1.e = new e$d$b();
                      oobject1.f = new e$d$b();
                      obj2 = new e$d$b();
                      oobject1.g = obj2;
                      obj3 = oobject1.d;
                      list = textsList;
                      float f3 = centerX - f1;
                      obj3.a = f3;
                      f3 = centerY - f2;
                      obj3.b = f3;
                      i3 = i1;
                      e$d e = oobject1.e;
                      centerX = centerX + f1;
                      e.a = centerX;
                      e.b = f3;
                      e$d f4 = oobject1.f;
                      f4.a = obj3.a;
                      centerY = centerY + f2;
                      f4.b = centerY;
                      obj2.a = e.a;
                      obj2.b = centerY;
                      Log.b("SinglePictureReEditEncode", "TopLeft,x = "+oobject1.d.a+",y = "+oobject1.d.b+";TopRight,x = "+oobject1.e.a+";BottomLeft,y = "+oobject1.f.b);
                   }
                   i2 = i2 + 1;
                   uob = uob1;
                   textsList = list;
                   i1 = i3;
                   b1 = 0;
                   b = 1;
                   obj2 = null;
                }
                VideoContext videoContext = obj1.d1();
                a.o(videoContext, "workspaceDraft.videoContext");
                videoContext.F().d.l = olArray;
                VideoContext videoContext1 = obj1.d1();
                a.o(videoContext1, "workspaceDraft.videoContext");
                videoContext1.F().d.m = uodArray;
                Log.b("SinglePictureReEditEncode", "saveTextInfo size= "+i);
             }
          }
          obj.b.Ah();
       }
       return;
    }
}
