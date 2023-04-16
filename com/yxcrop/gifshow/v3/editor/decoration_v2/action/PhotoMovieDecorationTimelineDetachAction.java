package com.yxcrop.gifshow.v3.editor.decoration_v2.action.PhotoMovieDecorationTimelineDetachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import hba.a;
import yaa.c;
import java.util.List;
import java.util.Collection;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Music$b;
import wnd.h;
import java.lang.Float;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class PhotoMovieDecorationTimelineDetachAction extends EditSdkAction	// class@000a2e
{
    public final boolean isSave;
    public final boolean isSticker;
    public final Map photoMovieMusicVolumeMap;

    public void PhotoMovieDecorationTimelineDetachAction(boolean p0,boolean p1,Map p2){
       a.p(p2, "photoMovieMusicVolumeMap");
       super();
       this.isSave = p0;
       this.isSticker = p1;
       this.photoMovieMusicVolumeMap = p2;
    }
    public void PhotoMovieDecorationTimelineDetachAction(boolean p0,boolean p1,Map p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = false;
       }
       super(p0, p1, p2);
       return;
    }
    public final boolean isSave(){
       return this.isSave;
    }
    public final boolean isSticker(){
       return this.isSticker;
    }
    public void performAction(c p0,c p1){
       a uoa;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoMovieDecorationTimelineDetachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       if (this.isSticker != null) {
          uoa = p0.U0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.stickerDraft ?: return");
             if (this.isSave != null) {
                uoa.f();
             }else {
                uoa.j();
             }
          }else {
             return;
          }
       }else {
          uoa = p0.W0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.textDraft ?: return");
             if (this.isSave != null) {
                uoa.f();
             }else {
                uoa.j();
             }
          }else {
          label_00c0 :
             return;
          }
       }
       p0 = p0.J0();
       List list = (p0 != null)? p0.z(): null;
       int b = (list == null || list.isEmpty())? true: false;
       if (b) {
          return;
       }else if(!p0.D()){
          p0.c0();
       }
       int i = list.size();
       b = 0;
       while (b < i) {
          GeneratedMessageLite$Builder uBuilder = p0.n(b);
          a.o(uBuilder, "musicDraft.getBuilder\(i\)");
          String str = h.i(uBuilder);
          Float uFloat = this.photoMovieMusicVolumeMap.get(str);
          if (uFloat != null) {
             float f = uFloat.floatValue();
             Object[] objArray = new Object[0];
             a.D().w("PhotoMovieDecorationTimelineDetachAction", "resume volume="+f+", file="+str, objArray);
             uBuilder.p(f);
          }
          b = b + 1;
       }
       p0.f();
       goto label_00c0 ;
    }
}
