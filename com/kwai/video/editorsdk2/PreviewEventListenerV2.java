package com.kwai.video.editorsdk2.PreviewEventListenerV2;
import com.kwai.video.editorsdk2.PreviewEventListener;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.RenderPosDetail;

public interface abstract PreviewEventListenerV2 implements PreviewEventListener	// class@001c7a
{

    void onTimeUpdateWithRenderPosDetail(PreviewPlayer p0,RenderPosDetail p1);
    void onUpdatePCMData(byte[] p0,double p1,double p2);
}
