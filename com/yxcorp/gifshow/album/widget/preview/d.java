package com.yxcorp.gifshow.album.widget.preview.d;
import com.kwai.video.editorsdk2.PerfEntryConsumer;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PerfEntry;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoSDKPlayerController;
import java.lang.String;
import com.yxcorp.utility.Log;

public final class d implements PerfEntryConsumer	// class@001b36
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final void accept(EditorSdk2$PerfEntry p0){
       if (p0 == null) {
          Log.d("EditorSDK2", "perf entry passed to perfConsumer is null!");
       }
       return;
    }
}
