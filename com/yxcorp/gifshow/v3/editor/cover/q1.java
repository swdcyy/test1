package com.yxcorp.gifshow.v3.editor.cover.q1;
import p16.c;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import ppc.g1;
import java.lang.Runnable;
import ekd.k1;

public final class q1 implements c	// class@000ec6
{
    public final VideoCoverEditorPresenter b;

    public void q1(VideoCoverEditorPresenter p0){
       this.b = p0;
    }
    public final void a(){
       q1 tb = this.b;
       if (tb.X8() != null && !tb.X8().isReleased()) {
          k1.o(new g1(tb));
       }
       return;
    }
}
