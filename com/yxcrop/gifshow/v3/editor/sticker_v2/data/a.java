package com.yxcrop.gifshow.v3.editor.sticker_v2.data.a;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer$b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.lang.Object;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.AbsoluteLayout$LayoutParams;
import emd.a;
import java.lang.Runnable;

public final class a implements EditVoteStickerDrawer$b	// class@000a73
{
    public final NewVoteStickerDrawer a;

    public void a(NewVoteStickerDrawer p0){
       this.a = p0;
    }
    public final void a(int p0){
       a ta = this.a;
       if (ta.mQuestionLineSize != p0) {
          AbsoluteLayout$LayoutParams layoutParams = ta.mVoteViewContainer.getLayoutParams();
          layoutParams.height = ta.getContentHeight(p0);
          ta.mVoteViewContainer.setLayoutParams(layoutParams);
          ta.mVoteViewContainer.post(new a(ta));
       }
       ta.mQuestionLineSize = p0;
       return;
    }
}
