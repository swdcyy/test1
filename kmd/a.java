package kmd.a;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer$b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.record.RecordVoteStickerDrawer;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.AbsoluteLayout$LayoutParams;
import android.view.ViewParent;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;

public final class a implements EditVoteStickerDrawer$b	// class@0017d3
{
    public final RecordVoteStickerDrawer a;

    public void a(RecordVoteStickerDrawer p0){
       this.a = p0;
    }
    public final void a(int p0){
       a ta = this.a;
       if (ta.mQuestionLineSize != p0) {
          AbsoluteLayout$LayoutParams layoutParams = ta.mVoteViewContainer.getLayoutParams();
          layoutParams.height = ta.getContentHeight(p0);
          ta.mVoteViewContainer.setLayoutParams(layoutParams);
          ta.mVoteViewContainer.getParent().T();
          ta.mBaseDrawerData.M((float)layoutParams.height);
          ta.containerView.U(ta);
       }
       ta.mQuestionLineSize = p0;
       return;
    }
}
