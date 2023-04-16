package com.kwai.video.player.AndroidMediaPlayer$MediaDataSourceProxy;
import android.media.MediaDataSource;
import com.kwai.video.player.misc.IMediaDataSource;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;
import java.lang.Integer;

public class AndroidMediaPlayer$MediaDataSourceProxy extends MediaDataSource	// class@000aa9
{
    public final IMediaDataSource mMediaDataSource;

    public void AndroidMediaPlayer$MediaDataSourceProxy(IMediaDataSource p0){
       super();
       this.mMediaDataSource = p0;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, AndroidMediaPlayer$MediaDataSourceProxy.class, "3")) {
          return;
       }
       this.mMediaDataSource.close();
       return;
    }
    public long getSize(){
       Object obj = PatchProxy.apply(null, this, AndroidMediaPlayer$MediaDataSourceProxy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mMediaDataSource.getSize();
    }
    public int readAt(long p0,byte[] p1,int p2,int p3){
       if (PatchProxy.isSupport(AndroidMediaPlayer$MediaDataSourceProxy.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), this, AndroidMediaPlayer$MediaDataSourceProxy.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.mMediaDataSource.readAt(p0, p1, p2, p3);
    }
}
