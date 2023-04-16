package com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$frameChangeListener$1;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor;
import java.lang.Object;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener$CHANGE_TYPE;
import nwc.n;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import voc.n;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$frameChangeListener$1$onFrameChanged$1;

public final class MusicEditor$frameChangeListener$1 implements VideoFrameChangeListener	// class@001049
{
    public final MusicEditor b;

    public void MusicEditor$frameChangeListener$1(MusicEditor p0){
       this.b = p0;
       super();
    }
    public void l(VideoFrameChangeListener$CHANGE_TYPE p0){
       n.b(this, p0);
    }
    public void o(){
       n.c(this);
    }
    public void r(VideoFrameChangeListener$CHANGE_TYPE p0,Size p1,int p2){
       if (PatchProxy.isSupport(MusicEditor$frameChangeListener$1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, MusicEditor$frameChangeListener$1.class, "1")) {
          return;
       }
       n.d(this, p0, p1, p2);
       if (p0 != VideoFrameChangeListener$CHANGE_TYPE.AI_CUT && p0 != VideoFrameChangeListener$CHANGE_TYPE.FRAME_RATIO) {
          if (p0 == VideoFrameChangeListener$CHANGE_TYPE.REVERT) {
             this.b.T().t0(new EditSdkAction());
          }else {
             this.b.T().t0(new MusicEditor$frameChangeListener$1$onFrameChanged$1());
          }
       }
       return;
    }
    public void w(VideoFrameChangeListener$CHANGE_TYPE p0,boolean p1){
       n.a(this, p0, p1);
    }
}
