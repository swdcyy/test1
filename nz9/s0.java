package nz9.s0;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import nz9.z0;
import java.lang.Object;
import java.util.Objects;
import tkd.b;
import tkd.d;
import os5.l;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import as7.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import nz9.i0;
import java.lang.Runnable;
import ekd.k1;

public final class s0 implements IKwaiMediaPlayer$OnLiveSeiInfoListener	// class@003244
{
    public final z0 a;

    public void s0(z0 p0){
       this.a = p0;
    }
    public final void onSeiInfo(byte[] p0,int p1,int p2){
       s0 ta = this.a;
       Objects.requireNonNull(ta);
       LiveStageProto$LayoutConfig layoutConfig = d.a(-1492894991).HB(p0, p1, p2);
       Object[] objArray = new Object[0];
       a.C().s("AvatarAndFollowBaseElement", "onSeiInfo: layoutConfig = "+layoutConfig+"£¬ mIsPkOrLineLive"+ta.a1, objArray);
       if (layoutConfig != null) {
          LiveStageProto$LayoutConfig bizType = layoutConfig.bizType;
          if (bizType != 2 && (bizType == 4 || (bizType == 1 && layoutConfig.layoutType == 2))) {
             k1.o(new i0(ta, layoutConfig));
          }
       }
       return;
    }
}
