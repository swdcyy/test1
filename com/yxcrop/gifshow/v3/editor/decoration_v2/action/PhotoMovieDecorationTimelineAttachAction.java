package com.yxcrop.gifshow.v3.editor.decoration_v2.action.PhotoMovieDecorationTimelineAttachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import xvc.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import hba.a;
import yaa.c;
import java.util.List;
import java.util.Collection;
import java.util.LinkedHashMap;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Music$b;
import wnd.h;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import java.lang.Float;
import java.util.Map;
import com.google.protobuf.GeneratedMessageLite;
import wld.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.Loader;
import trd.t;

public final class PhotoMovieDecorationTimelineAttachAction extends EditSdkAction	// class@000a2d
{
    public final boolean isSticker;

    public void PhotoMovieDecorationTimelineAttachAction(){
       super(false, 1, null);
    }
    public void PhotoMovieDecorationTimelineAttachAction(boolean p0){
       super();
       this.isSticker = p0;
    }
    public void PhotoMovieDecorationTimelineAttachAction(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public final boolean isSticker(){
       return this.isSticker;
    }
    public o performActionWithPop(c p0,c p1){
       a uoa;
       o obj = PatchProxy.applyTwoRefs(p0, p1, this, PhotoMovieDecorationTimelineAttachAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       obj = null;
       if (this.isSticker != null) {
          uoa = p0.U0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.stickerDraft ?: return null");
             if (!uoa.D()) {
                uoa.c0();
             }
          }else {
             return obj;
          }
       }else {
          uoa = p0.W0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.textDraft ?: return null");
             if (!uoa.D()) {
                uoa.c0();
             }
          }else {
             return obj;
          }
       }
       p0 = p0.J0();
       List list = (p0 != null)? p0.z(): obj;
       int i = (list == null || list.isEmpty())? 1: 0;
       if (i) {
          return obj;
       }else if(!p0.D()){
          p0.c0();
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       i = list.size();
       int i1 = 0;
       while (i1 < i) {
          GeneratedMessageLite$Builder uBuilder = p0.n(i1);
          a.o(uBuilder, "musicDraft.getBuilder\(i\)");
          String str = h.i(uBuilder);
          Object[] objArray = new Object[0];
          a.D().w("PhotoMovieDecorationTimelineAttachAction", "music file="+str+", volume="+uBuilder.getVolume()+", mute", objArray);
          a uoa1 = (!str.length())? 1: null;
          if (!uoa1) {
             linkedHashMa.put(str, Float.valueOf(uBuilder.getVolume()));
             uBuilder.p(0);
          }
          i1 = i1 + 1;
       }
       list = list.get(0);
       a.o(list, "musicList[0]");
       o oo = new o(list, 0, false, new a(linkedHashMa), 6, null);
       return p0;
    }
    public List targetLoader(){
       Object obj = PatchProxy.apply(null, this, PhotoMovieDecorationTimelineAttachAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.k(Loader.Music);
    }
}
