package emd.a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.lang.Object;
import android.view.ViewParent;
import android.view.View;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;

public final class a implements Runnable	// class@000d91
{
    public final NewVoteStickerDrawer b;

    public void a(NewVoteStickerDrawer p0){
       this.b = p0;
    }
    public final void run(){
       this.b.mVoteViewContainer.getParent().T();
    }
}
