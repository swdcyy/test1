package com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer$c;
import tyc.u4;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import emd.h;
import java.lang.Runnable;
import android.view.View;

public class NewVoteStickerDrawer$c extends u4	// class@000a6e
{
    public final int b;
    public final int c;
    public final NewVoteStickerDrawer d;

    public void NewVoteStickerDrawer$c(NewVoteStickerDrawer p0,int p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(NewVoteStickerDrawer$c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, NewVoteStickerDrawer$c.class, "1")) {
          return;
       }
       if (!p1 && (!p2 && !p3)) {
          return;
       }
       this.d.mVoteViewContainer.post(new h(this, this.b, p0, this.c));
       return;
    }
}
