package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$7;
import com.kwai.video.aemonplayer.AemonMediaPlayerListener$OnInfoExtraListener;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import java.lang.Object;
import com.kwai.video.aemonplayer.AemonMediaPlayer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.OnInfoExtra;
import com.kwai.video.player.AbstractMediaPlayer;

public class AemonMediaPlayerAdapter$7 implements AemonMediaPlayerListener$OnInfoExtraListener	// class@0019a7
{
    public final AemonMediaPlayerAdapter this$0;

    public void AemonMediaPlayerAdapter$7(AemonMediaPlayerAdapter p0){
       this.this$0 = p0;
       super();
    }
    public boolean onInfoExtra(AemonMediaPlayer p0,int p1,int p2,int p3,String p4){
       AemonMediaPlayerAdapter$7 u7 = AemonMediaPlayerAdapter$7.class;
       if (PatchProxy.isSupport(u7)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p0 = PatchProxy.apply(objArray, this, u7, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       OnInfoExtra onInfoExtra = new OnInfoExtra();
       onInfoExtra.setArg1(p2);
       onInfoExtra.setArg2(p3);
       onInfoExtra.setString(p4);
       this.this$0.notifyOnInfoExtra(p1, onInfoExtra);
       return 1;
    }
}
