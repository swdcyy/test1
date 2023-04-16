package com.yxcorp.gifshow.edit.draft.model.b0;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.LinkedHashMap;
import brd.t;
import laa.o0;
import erd.o;
import t45.d;
import brd.z;
import laa.n0;
import com.yxcorp.gifshow.edit.draft.model.a0;
import erd.g;
import crd.b;
import haa.f;
import w46.b;
import java.lang.IllegalStateException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qe6.c;
import java.lang.reflect.Type;
import java.util.List;
import haa.d;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import haa.g;
import java.io.File;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.util.Pair;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.android.model.music.MusicType;
import yaa.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kuaishou.edit.draft.Music;
import com.kuaishou.edit.draft.Music$Source;
import wba.u;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.StringBuilder;
import q87.c;

public class b0	// class@001af5
{
    public final DraftFileManager a;
    public LinkedHashMap b;
    public b c;

    public void b0(DraftFileManager p0){
       super();
       this.a = p0;
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
       }else if(this.b == null && this.c == null){
          this.b = new LinkedHashMap();
          this.c = p0.U().take(100).map(new o0(this)).observeOn(d.a).subscribe(new n0(this), a0.b);
       }else {
          Object[] objArray = new Object[0];
          f.D().t("WorkspaceSimpleMapManager", "initSimpleList\(\) can only called once!!!", objArray);
          throw new IllegalStateException("initSimpleList\(\) can only called once!!!");
       }
       return;
    }
    public static boolean b(String p0){
       List obj = PatchProxy.applyOneRefs(p0, null, b0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = d.a(c.d1);
       if (q.f(obj)) {
          return false;
       }
       return obj.contains(p0);
    }
    public final g a(c p0){
       File uFile;
       Object[] objArray1;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b0 uob0 = b0.class;
       c obj2 = PatchProxy.applyOneRefs(obj1, obj, uob0, "4");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       Object[] objArray = null;
       try{
          uFile = obj.a.u(obj1);
       }catch(java.lang.NullPointerException e0){
          PostUtils.D("WorkspaceSimpleMapManager", "createSimpleWorkspace\(\) getCoverFile NullPointerException happened", e0);
          uFile = objArray;
       }
       obj2 = c.class;
       g og = PatchProxy.applyTwoRefs(obj1, uFile, obj, uob0, "3");
       if (og != patchProxyRe) {
       }else {
          String str = p0.D0();
          String str1 = p0.V0();
          List list = PatchProxy.apply(objArray, obj1, obj2, "23");
          if (list != patchProxyRe) {
          }else {
             Pair pair = p0.t0();
             Pair first = pair.first;
             if (first != null) {
                list = first.getPhotoIdsList();
             }else {
                pair = pair.second;
                if (pair != null) {
                   list = pair.getPhotoIdsList();
                }else {
                   objArray1 = objArray;
                label_0064 :
                   List list1 = p0.I0();
                   String str2 = p0.K0();
                   MusicType musicType = PatchProxy.apply(objArray, obj1, obj2, "67");
                   if (musicType != patchProxyRe) {
                   }else {
                      obj2 = p0.J0();
                      if (obj2 != null && obj2.v() != null) {
                         VideoContext videoContext = p0.d1();
                         boolean b = (obj2.v().getSource() == Music$Source.CAPTURE)? true: false;
                         musicType = u.g(videoContext, b);
                      }else {
                      label_009e :
                         g og1 = new g(str, str1, uFile, objArray1, list1, str2, objArray, p0.a1());
                      }
                   }
                   objArray = musicType;
                   goto label_009e ;
                }
             }
          }
          objArray1 = list;
          goto label_0064 ;
       }
       return og;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().w("WorkspaceSimpleMapManager", "removeFromMap\(\) called, remove key="+p0+"item = "+this.b.remove(p0), objArray);
       return;
    }
}
