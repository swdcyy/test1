package com.yxcorp.gifshow.album.widget.preview.e;
import com.kwai.video.editorsdk2.PreviewPlayer$RealtimeStatsListener;
import java.lang.Object;
import com.kwai.video.editorsdk2.PreviewPlayerQosInfo;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoSDKPlayerController;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkQosStatEvent;
import java.lang.String;
import g79.a;
import w69.x;

public final class e implements PreviewPlayer$RealtimeStatsListener	// class@001b37
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void onRealtimeStatReady(PreviewPlayerQosInfo p0){
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       ClientStat$EditorSdkQosStatEvent uEditorSdkQo = new ClientStat$EditorSdkQosStatEvent();
       statPackage.editorSdkQosStatEvent = uEditorSdkQo;
       uEditorSdkQo.editorSdkQosInfo = p0.getJson();
       a.c.f().j(statPackage);
    }
}
