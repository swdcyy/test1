package com.kuaishou.android.model.mix.VideoMeta$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kuaishou.android.model.mix.VideoMeta$TypeAdapter;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;

public class VideoMeta$TypeAdapter$b implements KnownTypeAdapters$f	// class@000e26
{
    public final VideoMeta$TypeAdapter a;

    public void VideoMeta$TypeAdapter$b(VideoMeta$TypeAdapter p0){
       this.a = p0;
       super();
    }
    public Object[] a(int p0){
       return this.b(p0);
    }
    public CDNUrl[] b(int p0){
       CDNUrl[] uCDNUrlArray = new CDNUrl[p0];
       return uCDNUrlArray;
    }
}
