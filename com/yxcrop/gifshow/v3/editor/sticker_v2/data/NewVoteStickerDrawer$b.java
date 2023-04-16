package com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer$b;
import tyc.u4;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import emd.g;
import java.lang.Runnable;
import android.view.View;

public class NewVoteStickerDrawer$b extends u4	// class@000a6d
{
    public final int b;
    public final NewVoteStickerDrawer c;

    public void NewVoteStickerDrawer$b(NewVoteStickerDrawer p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(NewVoteStickerDrawer$b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, NewVoteStickerDrawer$b.class, "1")) {
          return;
       }
       if (!p1 && (!p2 && !p3)) {
          return;
       }
       this.c.mVoteViewContainer.post(new g(this, p0, this.b));
       return;
    }
}
