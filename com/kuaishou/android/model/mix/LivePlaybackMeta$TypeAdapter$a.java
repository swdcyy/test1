package com.kuaishou.android.model.mix.LivePlaybackMeta$TypeAdapter$a;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kuaishou.android.model.mix.LivePlaybackMeta$TypeAdapter;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;

public class LivePlaybackMeta$TypeAdapter$a implements KnownTypeAdapters$f	// class@000d01
{
    public final LivePlaybackMeta$TypeAdapter a;

    public void LivePlaybackMeta$TypeAdapter$a(LivePlaybackMeta$TypeAdapter p0){
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
