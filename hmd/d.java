package hmd.d;
import android.content.Intent;
import mn6.a;
import android.content.Context;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.InteractStickerWrapperView;
import brd.t;

public interface abstract d	// class@000f8e
{

    void a(Intent p0);
    int b();
    void c(a p0,Context p1,InteractStickerInfo p2);
    InteractStickerWrapperView d(a p0,Context p1,InteractStickerInfo p2);
    t getData();
    void release();
}
