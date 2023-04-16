package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$12;
import com.kwai.video.aemonplayer.IMediaDataSource;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import com.kwai.video.player.misc.IMediaDataSource;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;
import java.lang.Integer;

public class AemonMediaPlayerAdapter$12 implements IMediaDataSource	// class@00199d
{
    public final AemonMediaPlayerAdapter this$0;
    public final IMediaDataSource val$mediaDataSource;

    public void AemonMediaPlayerAdapter$12(AemonMediaPlayerAdapter p0,IMediaDataSource p1){
       this.this$0 = p0;
       this.val$mediaDataSource = p1;
       super();
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, AemonMediaPlayerAdapter$12.class, "3")) {
          return;
       }
       this.val$mediaDataSource.close();
       return;
    }
    public long getSize(){
       Object obj = PatchProxy.apply(null, this, AemonMediaPlayerAdapter$12.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.val$mediaDataSource.getSize();
    }
    public int readAt(long p0,byte[] p1,int p2,int p3){
       if (PatchProxy.isSupport(AemonMediaPlayerAdapter$12.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), this, AemonMediaPlayerAdapter$12.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.val$mediaDataSource.readAt(p0, p1, p2, p3);
    }
}
