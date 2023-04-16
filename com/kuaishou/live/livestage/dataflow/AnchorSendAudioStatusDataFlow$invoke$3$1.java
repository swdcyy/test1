package com.kuaishou.live.livestage.dataflow.AnchorSendAudioStatusDataFlow$invoke$3$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.text.SimpleDateFormat;
import oe3.a;
import java.lang.Long;

public final class AnchorSendAudioStatusDataFlow$invoke$3$1 extends Lambda implements a	// class@000be4
{
    public final LiveFlvStream$LiveFlvStreamMessage $bizMessage;
    public final LiveFlvStream$LiveFlvStreamMessage $pb;
    public final long $timestamp;

    public void AnchorSendAudioStatusDataFlow$invoke$3$1(LiveFlvStream$LiveFlvStreamMessage p0,long p1,LiveFlvStream$LiveFlvStreamMessage p2){
       this.$bizMessage = p0;
       this.$timestamp = p1;
       this.$pb = p2;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, AnchorSendAudioStatusDataFlow$invoke$3$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "Anchor send AudioStatus ";
       obj = (this.$bizMessage == null)? str+a.a().format(Long.valueOf(this.$timestamp))+' '+this.$pb+' ': str+a.a().format(Long.valueOf(this.$timestamp))+' '+this.$pb+" [biz]{"+this.$bizMessage+"} ";
       return obj;
    }
}
